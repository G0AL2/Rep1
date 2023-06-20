package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzckf extends zzek implements zzfn {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzc = new AtomicReference();
    private final SSLSocketFactory zzd;
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzfm zzh;
    private zzev zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final Set zzs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzckf(String str, zzfs zzfsVar, int i10, int i11, int i12) {
        super(true);
        this.zzd = new zzcke(this);
        this.zzs = new HashSet();
        zzcw.zzc(str);
        this.zzg = str;
        this.zzh = new zzfm();
        this.zze = i10;
        this.zzf = i11;
        this.zzr = i12;
        if (zzfsVar != null) {
            zzf(zzfsVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                zzcfi.zzh("Unexpected error while disconnecting", e10);
            }
            this.zzj = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) throws zzfj {
        try {
            if (this.zzp != this.zzn) {
                byte[] bArr2 = (byte[]) zzc.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j10 = this.zzp;
                    long j11 = this.zzn;
                    if (j10 != j11) {
                        int read = this.zzk.read(bArr2, 0, (int) Math.min(j11 - j10, bArr2.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.zzp += read;
                            zzg(read);
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        zzc.set(bArr2);
                        break;
                    }
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.zzo;
            if (j12 != -1) {
                long j13 = j12 - this.zzq;
                if (j13 != 0) {
                    i11 = (int) Math.min(i11, j13);
                }
                return -1;
            }
            int read2 = this.zzk.read(bArr, i10, i11);
            if (read2 == -1) {
                if (this.zzo == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzq += read2;
            zzg(read2);
            return read2;
        } catch (IOException e10) {
            throw new zzfj(e10, this.zzi, 2000, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0100, code lost:
        if (r2 != 0) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7 A[Catch: IOException -> 0x0291, TryCatch #3 {IOException -> 0x0291, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:94:0x0236, B:96:0x0241, B:98:0x0252, B:101:0x025b, B:102:0x026a, B:104:0x0272, B:105:0x0279, B:106:0x027a, B:107:0x0290), top: B:117:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0241 A[Catch: IOException -> 0x0291, TryCatch #3 {IOException -> 0x0291, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:9:0x003b, B:10:0x0053, B:12:0x0059, B:19:0x007d, B:21:0x0097, B:22:0x00a9, B:23:0x00ae, B:25:0x00b7, B:26:0x00be, B:39:0x00e6, B:94:0x0236, B:96:0x0241, B:98:0x0252, B:101:0x025b, B:102:0x026a, B:104:0x0272, B:105:0x0279, B:106:0x027a, B:107:0x0290), top: B:117:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzeq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzev r21) throws com.google.android.gms.internal.ads.zzfj {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzckf.zzb(com.google.android.gms.internal.ads.zzev):long");
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzfj {
        try {
            if (this.zzk != null) {
                HttpURLConnection httpURLConnection = this.zzj;
                long j10 = this.zzo;
                if (j10 != -1) {
                    j10 -= this.zzq;
                }
                int i10 = zzeg.zza;
                if (i10 == 19 || i10 == 20) {
                    try {
                        InputStream inputStream = httpURLConnection.getInputStream();
                        if (j10 == -1) {
                            if (inputStream.read() != -1) {
                            }
                        } else if (j10 <= 2048) {
                        }
                        String name = inputStream.getClass().getName();
                        if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                            Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(inputStream, new Object[0]);
                        }
                    } catch (Exception unused) {
                    }
                }
                try {
                    this.zzk.close();
                } catch (IOException e10) {
                    throw new zzfj(e10, this.zzi, 2000, 3);
                }
            }
        } finally {
            this.zzk = null;
            zzn();
            if (this.zzl) {
                this.zzl = false;
                zzh();
            }
            this.zzs.clear();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzek, com.google.android.gms.internal.ads.zzeq, com.google.android.gms.internal.ads.zzfn
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzm(int i10) {
        this.zzr = i10;
        for (Socket socket : this.zzs) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzr);
                } catch (SocketException e10) {
                    zzcfi.zzk("Failed to update receive buffer size.", e10);
                }
            }
        }
    }
}
