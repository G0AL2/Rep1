package com.chartboost.sdk.Networking;

import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import javax.net.ssl.HandshakeCompletedListener;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class e extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private final SSLSocketFactory f13754a;

    /* loaded from: classes.dex */
    public static class a extends SSLSocket {

        /* renamed from: a  reason: collision with root package name */
        protected final SSLSocket f13755a;

        a(SSLSocket sSLSocket) {
            this.f13755a = sSLSocket;
        }

        @Override // javax.net.ssl.SSLSocket
        public void addHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f13755a.addHandshakeCompletedListener(handshakeCompletedListener);
        }

        @Override // java.net.Socket
        public void bind(SocketAddress socketAddress) throws IOException {
            this.f13755a.bind(socketAddress);
        }

        @Override // java.net.Socket, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            this.f13755a.close();
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress) throws IOException {
            this.f13755a.connect(socketAddress);
        }

        public boolean equals(Object obj) {
            return this.f13755a.equals(obj);
        }

        @Override // java.net.Socket
        public SocketChannel getChannel() {
            return this.f13755a.getChannel();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getEnableSessionCreation() {
            return this.f13755a.getEnableSessionCreation();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getEnabledCipherSuites() {
            return this.f13755a.getEnabledCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getEnabledProtocols() {
            return this.f13755a.getEnabledProtocols();
        }

        @Override // java.net.Socket
        public InetAddress getInetAddress() {
            return this.f13755a.getInetAddress();
        }

        @Override // java.net.Socket
        public InputStream getInputStream() throws IOException {
            return this.f13755a.getInputStream();
        }

        @Override // java.net.Socket
        public boolean getKeepAlive() throws SocketException {
            return this.f13755a.getKeepAlive();
        }

        @Override // java.net.Socket
        public InetAddress getLocalAddress() {
            return this.f13755a.getLocalAddress();
        }

        @Override // java.net.Socket
        public int getLocalPort() {
            return this.f13755a.getLocalPort();
        }

        @Override // java.net.Socket
        public SocketAddress getLocalSocketAddress() {
            return this.f13755a.getLocalSocketAddress();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getNeedClientAuth() {
            return this.f13755a.getNeedClientAuth();
        }

        @Override // java.net.Socket
        public boolean getOOBInline() throws SocketException {
            return this.f13755a.getOOBInline();
        }

        @Override // java.net.Socket
        public OutputStream getOutputStream() throws IOException {
            return this.f13755a.getOutputStream();
        }

        @Override // java.net.Socket
        public int getPort() {
            return this.f13755a.getPort();
        }

        @Override // java.net.Socket
        public synchronized int getReceiveBufferSize() throws SocketException {
            return this.f13755a.getReceiveBufferSize();
        }

        @Override // java.net.Socket
        public SocketAddress getRemoteSocketAddress() {
            return this.f13755a.getRemoteSocketAddress();
        }

        @Override // java.net.Socket
        public boolean getReuseAddress() throws SocketException {
            return this.f13755a.getReuseAddress();
        }

        @Override // java.net.Socket
        public synchronized int getSendBufferSize() throws SocketException {
            return this.f13755a.getSendBufferSize();
        }

        @Override // javax.net.ssl.SSLSocket
        public SSLSession getSession() {
            return this.f13755a.getSession();
        }

        @Override // java.net.Socket
        public int getSoLinger() throws SocketException {
            return this.f13755a.getSoLinger();
        }

        @Override // java.net.Socket
        public synchronized int getSoTimeout() throws SocketException {
            return this.f13755a.getSoTimeout();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getSupportedCipherSuites() {
            return this.f13755a.getSupportedCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocket
        public String[] getSupportedProtocols() {
            return this.f13755a.getSupportedProtocols();
        }

        @Override // java.net.Socket
        public boolean getTcpNoDelay() throws SocketException {
            return this.f13755a.getTcpNoDelay();
        }

        @Override // java.net.Socket
        public int getTrafficClass() throws SocketException {
            return this.f13755a.getTrafficClass();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getUseClientMode() {
            return this.f13755a.getUseClientMode();
        }

        @Override // javax.net.ssl.SSLSocket
        public boolean getWantClientAuth() {
            return this.f13755a.getWantClientAuth();
        }

        @Override // java.net.Socket
        public boolean isBound() {
            return this.f13755a.isBound();
        }

        @Override // java.net.Socket
        public boolean isClosed() {
            return this.f13755a.isClosed();
        }

        @Override // java.net.Socket
        public boolean isConnected() {
            return this.f13755a.isConnected();
        }

        @Override // java.net.Socket
        public boolean isInputShutdown() {
            return this.f13755a.isInputShutdown();
        }

        @Override // java.net.Socket
        public boolean isOutputShutdown() {
            return this.f13755a.isOutputShutdown();
        }

        @Override // javax.net.ssl.SSLSocket
        public void removeHandshakeCompletedListener(HandshakeCompletedListener handshakeCompletedListener) {
            this.f13755a.removeHandshakeCompletedListener(handshakeCompletedListener);
        }

        @Override // java.net.Socket
        public void sendUrgentData(int i10) throws IOException {
            this.f13755a.sendUrgentData(i10);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnableSessionCreation(boolean z10) {
            this.f13755a.setEnableSessionCreation(z10);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnabledCipherSuites(String[] strArr) {
            this.f13755a.setEnabledCipherSuites(strArr);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setEnabledProtocols(String[] strArr) {
            this.f13755a.setEnabledProtocols(strArr);
        }

        @Override // java.net.Socket
        public void setKeepAlive(boolean z10) throws SocketException {
            this.f13755a.setKeepAlive(z10);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setNeedClientAuth(boolean z10) {
            this.f13755a.setNeedClientAuth(z10);
        }

        @Override // java.net.Socket
        public void setOOBInline(boolean z10) throws SocketException {
            this.f13755a.setOOBInline(z10);
        }

        @Override // java.net.Socket
        public void setPerformancePreferences(int i10, int i11, int i12) {
            this.f13755a.setPerformancePreferences(i10, i11, i12);
        }

        @Override // java.net.Socket
        public synchronized void setReceiveBufferSize(int i10) throws SocketException {
            this.f13755a.setReceiveBufferSize(i10);
        }

        @Override // java.net.Socket
        public void setReuseAddress(boolean z10) throws SocketException {
            this.f13755a.setReuseAddress(z10);
        }

        @Override // java.net.Socket
        public synchronized void setSendBufferSize(int i10) throws SocketException {
            this.f13755a.setSendBufferSize(i10);
        }

        @Override // java.net.Socket
        public void setSoLinger(boolean z10, int i10) throws SocketException {
            this.f13755a.setSoLinger(z10, i10);
        }

        @Override // java.net.Socket
        public synchronized void setSoTimeout(int i10) throws SocketException {
            this.f13755a.setSoTimeout(i10);
        }

        @Override // java.net.Socket
        public void setTcpNoDelay(boolean z10) throws SocketException {
            this.f13755a.setTcpNoDelay(z10);
        }

        @Override // java.net.Socket
        public void setTrafficClass(int i10) throws SocketException {
            this.f13755a.setTrafficClass(i10);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setUseClientMode(boolean z10) {
            this.f13755a.setUseClientMode(z10);
        }

        @Override // javax.net.ssl.SSLSocket
        public void setWantClientAuth(boolean z10) {
            this.f13755a.setWantClientAuth(z10);
        }

        @Override // java.net.Socket
        public void shutdownInput() throws IOException {
            this.f13755a.shutdownInput();
        }

        @Override // java.net.Socket
        public void shutdownOutput() throws IOException {
            this.f13755a.shutdownOutput();
        }

        @Override // javax.net.ssl.SSLSocket
        public void startHandshake() throws IOException {
            this.f13755a.startHandshake();
        }

        @Override // javax.net.ssl.SSLSocket, java.net.Socket
        public String toString() {
            return this.f13755a.toString();
        }

        @Override // java.net.Socket
        public void connect(SocketAddress socketAddress, int i10) throws IOException {
            this.f13755a.connect(socketAddress, i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends a {
        protected b(SSLSocket sSLSocket) {
            super(sSLSocket);
        }

        @Override // com.chartboost.sdk.Networking.e.a, javax.net.ssl.SSLSocket
        public void setEnabledProtocols(String[] strArr) {
            if (strArr != null && strArr.length == 1 && "SSLv3".equals(strArr[0])) {
                ArrayList arrayList = new ArrayList(Arrays.asList(this.f13755a.getEnabledProtocols()));
                if (arrayList.size() > 1) {
                    arrayList.remove("SSLv3");
                    System.out.println("Removed SSLv3 from enabled protocols");
                } else {
                    PrintStream printStream = System.out;
                    printStream.println("SSL stuck with protocol available for " + arrayList);
                }
                strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            super.setEnabledProtocols(strArr);
        }
    }

    public e(SSLSocketFactory sSLSocketFactory) {
        this.f13754a = sSLSocketFactory;
    }

    private Socket a(Socket socket, String str) throws IOException {
        if (socket instanceof SSLSocket) {
            b bVar = new b((SSLSocket) socket);
            if (Build.VERSION.SDK_INT < 23) {
                bVar.startHandshake();
                if (!HttpsURLConnection.getDefaultHostnameVerifier().verify(str, bVar.getSession())) {
                    throw new SSLHandshakeException("Server Name Identification failed.");
                }
            }
            return bVar;
        }
        return socket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        return a(this.f13754a.createSocket(socket, str, i10, z10), str);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f13754a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f13754a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        return a(this.f13754a.createSocket(str, i10), str);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return a(this.f13754a.createSocket(str, i10, inetAddress, i11), str);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return a(this.f13754a.createSocket(inetAddress, i10), inetAddress.getHostName());
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return a(this.f13754a.createSocket(inetAddress, i10, inetAddress2, i11), inetAddress.getHostAddress());
    }
}
