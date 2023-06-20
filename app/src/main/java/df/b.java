package df;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import ye.l;

/* compiled from: ConnectionSpecSelector.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private int f29372a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f29373b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f29374c;

    /* renamed from: d  reason: collision with root package name */
    private final List<l> f29375d;

    public b(List<l> list) {
        qe.k.f(list, "connectionSpecs");
        this.f29375d = list;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.f29375d.size();
        for (int i10 = this.f29372a; i10 < size; i10++) {
            if (this.f29375d.get(i10).e(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public final l a(SSLSocket sSLSocket) throws IOException {
        l lVar;
        qe.k.f(sSLSocket, "sslSocket");
        int i10 = this.f29372a;
        int size = this.f29375d.size();
        while (true) {
            if (i10 >= size) {
                lVar = null;
                break;
            }
            lVar = this.f29375d.get(i10);
            if (lVar.e(sSLSocket)) {
                this.f29372a = i10 + 1;
                break;
            }
            i10++;
        }
        if (lVar != null) {
            this.f29373b = c(sSLSocket);
            lVar.c(sSLSocket, this.f29374c);
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Unable to find acceptable protocols. isFallback=");
        sb2.append(this.f29374c);
        sb2.append(',');
        sb2.append(" modes=");
        sb2.append(this.f29375d);
        sb2.append(',');
        sb2.append(" supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        qe.k.c(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        qe.k.e(arrays, "java.util.Arrays.toString(this)");
        sb2.append(arrays);
        throw new UnknownServiceException(sb2.toString());
    }

    public final boolean b(IOException iOException) {
        qe.k.f(iOException, "e");
        this.f29374c = true;
        return (!this.f29373b || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }
}
