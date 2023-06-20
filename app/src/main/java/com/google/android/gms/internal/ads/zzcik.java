package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcik extends SSLSocketFactory {
    final SSLSocketFactory zza = (SSLSocketFactory) SSLSocketFactory.getDefault();
    final /* synthetic */ zzcil zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcik(zzcil zzcilVar) {
        this.zzb = zzcilVar;
    }

    private final Socket zza(Socket socket) throws SocketException {
        int i10;
        int i11;
        zzcil zzcilVar = this.zzb;
        i10 = zzcilVar.zzr;
        if (i10 > 0) {
            i11 = zzcilVar.zzr;
            socket.setReceiveBufferSize(i11);
        }
        this.zzb.zzs.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) throws IOException {
        Socket createSocket = this.zza.createSocket(str, i10);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.zza.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.zza.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        Socket createSocket = this.zza.createSocket(str, i10, inetAddress, i11);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        Socket createSocket = this.zza.createSocket(inetAddress, i10);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        Socket createSocket = this.zza.createSocket(inetAddress, i10, inetAddress2, i11);
        zza(createSocket);
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        Socket createSocket = this.zza.createSocket(socket, str, i10, z10);
        zza(createSocket);
        return createSocket;
    }
}
