package ms.bd.o.Pgl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes3.dex */
class pblr extends SSLSocketFactory {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f34552b = {(String) pblk.a(16777217, 0, 0, "fe1361", new byte[]{67, 75, 113, 81, 88, 104, 55})};

    /* renamed from: a  reason: collision with root package name */
    final SSLSocketFactory f34553a;

    public pblr(SSLSocketFactory sSLSocketFactory) {
        this.f34553a = sSLSocketFactory;
    }

    private Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(f34552b);
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException, UnknownHostException {
        return a(this.f34553a.createSocket(str, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException, UnknownHostException {
        return a(this.f34553a.createSocket(str, i10, inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return a(this.f34553a.createSocket(inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return a(this.f34553a.createSocket(inetAddress, i10, inetAddress2, i11));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        return a(this.f34553a.createSocket(socket, str, i10, z10));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f34553a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f34553a.getSupportedCipherSuites();
    }
}
