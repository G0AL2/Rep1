package da;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import j8.j2;
import java.io.IOException;
import java.net.URLDecoder;

/* compiled from: DataSchemeDataSource.java */
/* loaded from: classes2.dex */
public final class j extends g {

    /* renamed from: e  reason: collision with root package name */
    private p f29190e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f29191f;

    /* renamed from: g  reason: collision with root package name */
    private int f29192g;

    /* renamed from: h  reason: collision with root package name */
    private int f29193h;

    public j() {
        super(false);
    }

    @Override // da.i
    public int c(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f29193h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(ea.n0.j(this.f29191f), this.f29192g, bArr, i10, min);
        this.f29192g += min;
        this.f29193h -= min;
        q(min);
        return min;
    }

    @Override // da.l
    public void close() {
        if (this.f29191f != null) {
            this.f29191f = null;
            r();
        }
        this.f29190e = null;
    }

    @Override // da.l
    public long g(p pVar) throws IOException {
        s(pVar);
        this.f29190e = pVar;
        Uri uri = pVar.f29227a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        String valueOf = String.valueOf(scheme);
        ea.a.b(equals, valueOf.length() != 0 ? "Unsupported scheme: ".concat(valueOf) : new String("Unsupported scheme: "));
        String[] R0 = ea.n0.R0(uri.getSchemeSpecificPart(), ",");
        if (R0.length == 2) {
            String str = R0[1];
            if (R0[0].contains(";base64")) {
                try {
                    this.f29191f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    String valueOf2 = String.valueOf(str);
                    throw j2.b(valueOf2.length() != 0 ? "Error while parsing Base64 encoded string: ".concat(valueOf2) : new String("Error while parsing Base64 encoded string: "), e10);
                }
            } else {
                this.f29191f = ea.n0.p0(URLDecoder.decode(str, ib.d.f31903a.name()));
            }
            long j10 = pVar.f29232f;
            byte[] bArr = this.f29191f;
            if (j10 <= bArr.length) {
                int i10 = (int) j10;
                this.f29192g = i10;
                int length = bArr.length - i10;
                this.f29193h = length;
                long j11 = pVar.f29233g;
                if (j11 != -1) {
                    this.f29193h = (int) Math.min(length, j11);
                }
                t(pVar);
                long j12 = pVar.f29233g;
                return j12 != -1 ? j12 : this.f29193h;
            }
            this.f29191f = null;
            throw new m(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        String valueOf3 = String.valueOf(uri);
        StringBuilder sb2 = new StringBuilder(valueOf3.length() + 23);
        sb2.append("Unexpected URI format: ");
        sb2.append(valueOf3);
        throw j2.b(sb2.toString(), null);
    }

    @Override // da.l
    public Uri o() {
        p pVar = this.f29190e;
        if (pVar != null) {
            return pVar.f29227a;
        }
        return null;
    }
}
