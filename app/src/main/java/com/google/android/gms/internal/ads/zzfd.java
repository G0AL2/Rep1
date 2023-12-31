package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfd extends zzek implements zzfn {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzfm zzf;
    private final zzfm zzg;
    private zzev zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzfd() {
        this(null, 8000, 8000, false, null, null, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.net.HttpURLConnection zzk(java.net.URL r3, int r4, byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.zzc
            r3.setConnectTimeout(r4)
            int r4 = r2.zzd
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.zzfm r5 = r2.zzf
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            com.google.android.gms.internal.ads.zzfm r5 = r2.zzg
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L32:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L32
        L4e:
            r4 = 0
            r0 = -1
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 != 0) goto L5d
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L5c
            r4 = 0
            goto L7c
        L5c:
            r6 = r4
        L5d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bytes="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = "-"
            r4.append(r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L78
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L78:
            java.lang.String r4 = r4.toString()
        L7c:
            if (r4 == 0) goto L83
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L83:
            java.lang.String r4 = r2.zze
            if (r4 == 0) goto L8c
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L8c:
            r4 = 1
            if (r4 == r10) goto L92
            java.lang.String r5 = "identity"
            goto L94
        L92:
            java.lang.String r5 = "gzip"
        L94:
            java.lang.String r6 = "Accept-Encoding"
            r3.setRequestProperty(r6, r5)
            r3.setInstanceFollowRedirects(r11)
            r5 = 0
            r3.setDoOutput(r5)
            java.lang.String r4 = com.google.android.gms.internal.ads.zzev.zza(r4)
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfd.zzk(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL zzl(URL url, String str, zzev zzevVar) throws zzfj {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new zzfj("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzevVar, 2001, 1);
                }
                if (this.zzb || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                String protocol2 = url.getProtocol();
                throw new zzfj("Disallowed cross-protocol redirect (" + protocol2 + " to " + protocol + ")", zzevVar, 2001, 1);
            } catch (MalformedURLException e10) {
                throw new zzfj(e10, zzevVar, 2001, 1);
            }
        }
        throw new zzfj("Null location redirect", zzevVar, 2001, 1);
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                zzdn.zza("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) throws zzfj {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.zzm;
            if (j10 != -1) {
                long j11 = j10 - this.zzn;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.zzj;
            int i12 = zzeg.zza;
            int read = inputStream.read(bArr, i10, i11);
            if (read == -1) {
                return -1;
            }
            this.zzn += read;
            zzg(read);
            return read;
        } catch (IOException e10) {
            zzev zzevVar = this.zzh;
            int i13 = zzeg.zza;
            throw zzfj.zza(e10, zzevVar, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ca, code lost:
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ec, code lost:
        throw new com.google.android.gms.internal.ads.zzfj(new java.net.NoRouteToHostException("Too many redirects: " + r6), r25, 2001, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
        if (r8 != 0) goto L15;
     */
    @Override // com.google.android.gms.internal.ads.zzeq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzev r25) throws com.google.android.gms.internal.ads.zzfj {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfd.zzb(com.google.android.gms.internal.ads.zzev):long");
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzfj {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                long j10 = this.zzm;
                long j11 = j10 == -1 ? -1L : j10 - this.zzn;
                HttpURLConnection httpURLConnection = this.zzi;
                try {
                    if (httpURLConnection != null) {
                        if (zzeg.zza <= 20) {
                            try {
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                if (j11 == -1) {
                                    if (inputStream2.read() != -1) {
                                    }
                                } else if (j11 <= 2048) {
                                }
                                String name = inputStream2.getClass().getName();
                                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                    Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                    Objects.requireNonNull(superclass);
                                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(inputStream2, new Object[0]);
                                }
                            } catch (Exception unused) {
                            }
                        }
                        inputStream.close();
                    }
                    inputStream.close();
                } catch (IOException e10) {
                    zzev zzevVar = this.zzh;
                    int i10 = zzeg.zza;
                    throw new zzfj(e10, zzevVar, 2000, 3);
                }
            }
        } finally {
            this.zzj = null;
            zzm();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzek, com.google.android.gms.internal.ads.zzeq, com.google.android.gms.internal.ads.zzfn
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        return httpURLConnection == null ? zzfrm.zzd() : new zzfb(httpURLConnection.getHeaderFields());
    }

    private zzfd(String str, int i10, int i11, boolean z10, zzfm zzfmVar, zzfov zzfovVar, boolean z11) {
        super(true);
        this.zze = str;
        this.zzc = i10;
        this.zzd = i11;
        this.zzb = z10;
        this.zzf = zzfmVar;
        this.zzg = new zzfm();
    }
}
