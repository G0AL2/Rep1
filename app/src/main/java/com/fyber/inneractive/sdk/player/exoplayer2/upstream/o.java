package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.util.Log;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class o implements g {

    /* renamed from: q  reason: collision with root package name */
    public static final Pattern f19492q = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: r  reason: collision with root package name */
    public static final AtomicReference<byte[]> f19493r = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19494a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19495b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19496c;

    /* renamed from: d  reason: collision with root package name */
    public final String f19497d;

    /* renamed from: f  reason: collision with root package name */
    public final w f19499f;

    /* renamed from: h  reason: collision with root package name */
    public final a0<? super o> f19501h;

    /* renamed from: i  reason: collision with root package name */
    public j f19502i;

    /* renamed from: j  reason: collision with root package name */
    public HttpURLConnection f19503j;

    /* renamed from: k  reason: collision with root package name */
    public InputStream f19504k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f19505l;

    /* renamed from: m  reason: collision with root package name */
    public long f19506m;

    /* renamed from: n  reason: collision with root package name */
    public long f19507n;

    /* renamed from: o  reason: collision with root package name */
    public long f19508o;

    /* renamed from: p  reason: collision with root package name */
    public long f19509p;

    /* renamed from: e  reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.m<String> f19498e = null;

    /* renamed from: g  reason: collision with root package name */
    public final w f19500g = new w();

    public o(String str, com.fyber.inneractive.sdk.player.exoplayer2.util.m<String> mVar, a0<? super o> a0Var, int i10, int i11, boolean z10, w wVar) {
        this.f19497d = com.fyber.inneractive.sdk.player.exoplayer2.util.a.a(str);
        this.f19501h = a0Var;
        this.f19495b = i10;
        this.f19496c = i11;
        this.f19494a = z10;
        this.f19499f = wVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public Uri a() {
        HttpURLConnection httpURLConnection = this.f19503j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection b(j jVar) throws IOException {
        HttpURLConnection a10;
        URL url = new URL(jVar.f19462a.toString());
        byte[] bArr = jVar.f19463b;
        long j10 = jVar.f19465d;
        long j11 = jVar.f19466e;
        boolean a11 = jVar.a(1);
        if (this.f19494a) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 <= 20) {
                    long j12 = j10;
                    a10 = a(url, bArr, j10, j11, a11, false);
                    int responseCode = a10.getResponseCode();
                    if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                        bArr = null;
                        String headerField = a10.getHeaderField("Location");
                        a10.disconnect();
                        if (headerField != null) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                                throw new ProtocolException("Unsupported protocol redirect: " + protocol);
                            }
                            url = url2;
                            i10 = i11;
                            j10 = j12;
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    }
                } else {
                    throw new NoRouteToHostException("Too many redirects: " + i11);
                }
            }
            return a10;
        }
        return a(url, bArr, j10, j11, a11, true);
    }

    public final void c() throws IOException {
        if (this.f19508o == this.f19506m) {
            return;
        }
        byte[] andSet = f19493r.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j10 = this.f19508o;
            long j11 = this.f19506m;
            if (j10 != j11) {
                int read = this.f19504k.read(andSet, 0, (int) Math.min(j11 - j10, andSet.length));
                if (Thread.interrupted()) {
                    throw new InterruptedIOException();
                }
                if (read != -1) {
                    long j12 = read;
                    this.f19508o += j12;
                    a0<? super o> a0Var = this.f19501h;
                    if (a0Var != null) {
                        l lVar = (l) a0Var;
                        synchronized (lVar) {
                            lVar.f19480d += j12;
                        }
                    }
                } else {
                    throw new EOFException();
                }
            } else {
                f19493r.set(andSet);
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public void close() throws t {
        try {
            if (this.f19504k != null) {
                HttpURLConnection httpURLConnection = this.f19503j;
                long j10 = this.f19507n;
                if (j10 != -1) {
                    j10 -= this.f19509p;
                }
                a(httpURLConnection, j10);
                try {
                    this.f19504k.close();
                } catch (IOException e10) {
                    throw new t(e10, this.f19502i, 3);
                }
            }
        } finally {
            this.f19504k = null;
            b();
            if (this.f19505l) {
                this.f19505l = false;
                a0<? super o> a0Var = this.f19501h;
                if (a0Var != null) {
                    ((l) a0Var).a(this);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r7 != 0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0102  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j r19) throws com.fyber.inneractive.sdk.player.exoplayer2.upstream.t {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.o.a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.j):long");
    }

    public final int b(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f19507n;
        if (j10 != -1) {
            long j11 = j10 - this.f19509p;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int read = this.f19504k.read(bArr, i10, i11);
        if (read == -1) {
            if (this.f19507n == -1) {
                return -1;
            }
            throw new EOFException();
        }
        long j12 = read;
        this.f19509p += j12;
        a0<? super o> a0Var = this.f19501h;
        if (a0Var != null) {
            l lVar = (l) a0Var;
            synchronized (lVar) {
                lVar.f19480d += j12;
            }
        }
        return read;
    }

    public final void b() {
        HttpURLConnection httpURLConnection = this.f19503j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
            this.f19503j = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.g
    public int a(byte[] bArr, int i10, int i11) throws t {
        try {
            c();
            return b(bArr, i10, i11);
        } catch (IOException e10) {
            throw new t(e10, this.f19502i, 2);
        }
    }

    public final HttpURLConnection a(URL url, byte[] bArr, long j10, long j11, boolean z10, boolean z11) throws IOException {
        Map<String, String> map;
        Map<String, String> map2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f19495b);
        httpURLConnection.setReadTimeout(this.f19496c);
        w wVar = this.f19499f;
        if (wVar != null) {
            synchronized (wVar) {
                if (wVar.f19523b == null) {
                    wVar.f19523b = Collections.unmodifiableMap(new HashMap(wVar.f19522a));
                }
                map2 = wVar.f19523b;
            }
            for (Map.Entry<String, String> entry : map2.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        w wVar2 = this.f19500g;
        synchronized (wVar2) {
            if (wVar2.f19523b == null) {
                wVar2.f19523b = Collections.unmodifiableMap(new HashMap(wVar2.f19522a));
            }
            map = wVar2.f19523b;
        }
        for (Map.Entry<String, String> entry2 : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j10 != 0 || j11 != -1) {
            String str = "bytes=" + j10 + Constants.FILENAME_SEQUENCE_SEPARATOR;
            if (j11 != -1) {
                str = str + ((j10 + j11) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f19497d);
        if (!z10) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public static void a(HttpURLConnection httpURLConnection, long j10) {
        int i10 = com.fyber.inneractive.sdk.player.exoplayer2.util.u.f19606a;
        if (i10 == 19 || i10 == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j10 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j10 <= 2048) {
                    return;
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
    }
}
