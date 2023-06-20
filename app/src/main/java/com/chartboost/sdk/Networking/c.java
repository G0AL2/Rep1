package com.chartboost.sdk.Networking;

import android.os.Build;
import android.os.Handler;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Model.CBError;
import com.chartboost.sdk.impl.i3;
import com.chartboost.sdk.impl.m1;
import com.chartboost.sdk.impl.o0;
import com.chartboost.sdk.impl.p0;
import com.chartboost.sdk.impl.q0;
import com.chartboost.sdk.impl.r0;
import com.chartboost.sdk.impl.t0;
import com.chartboost.sdk.impl.u2;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import org.apache.http.ConnectionClosedException;

/* loaded from: classes.dex */
public class c<T> implements Runnable, Comparable<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f13745a;

    /* renamed from: b  reason: collision with root package name */
    private final d f13746b;

    /* renamed from: c  reason: collision with root package name */
    private final r0 f13747c;

    /* renamed from: d  reason: collision with root package name */
    private final u2 f13748d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f13749e;

    /* renamed from: f  reason: collision with root package name */
    public final o0<T> f13750f;

    /* renamed from: g  reason: collision with root package name */
    private p0<T> f13751g;

    /* renamed from: h  reason: collision with root package name */
    private q0 f13752h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13753i = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Executor executor, d dVar, r0 r0Var, u2 u2Var, Handler handler, o0<T> o0Var) {
        this.f13745a = executor;
        this.f13746b = dVar;
        this.f13747c = r0Var;
        this.f13748d = u2Var;
        this.f13749e = handler;
        this.f13750f = o0Var;
    }

    private void a(String str, String str2) {
        try {
            a();
            m1.d(new com.chartboost.sdk.Tracking.a(str, str2, "", ""));
        } catch (Exception unused) {
        }
    }

    private static boolean a(int i10) {
        return ((100 <= i10 && i10 < 200) || i10 == 204 || i10 == 304) ? false : true;
    }

    private byte[] b(HttpsURLConnection httpsURLConnection) throws IOException {
        InputStream errorStream;
        InputStream inputStream = null;
        try {
            try {
                errorStream = httpsURLConnection.getInputStream();
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
            errorStream = httpsURLConnection.getErrorStream();
        }
        InputStream inputStream2 = errorStream;
        byte[] a10 = inputStream2 != null ? com.chartboost.sdk.Libraries.a.a(new BufferedInputStream(inputStream2)) : new byte[0];
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused3) {
            }
        }
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(javax.net.ssl.HttpsURLConnection r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.Networking.c.c(javax.net.ssl.HttpsURLConnection):void");
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        p0<T> p0Var = this.f13751g;
        if (p0Var != null) {
            try {
                CBError cBError = p0Var.f14246b;
                if (cBError == null) {
                    this.f13750f.a((o0<T>) p0Var.f14245a, this.f13752h);
                } else {
                    this.f13750f.a(cBError, this.f13752h);
                }
            } catch (Exception e10) {
                CBLogging.b("NetworkDispatcher", "deliver result: " + e10.toString());
            }
        } else if (this.f13750f.f14232d.compareAndSet(0, 1)) {
            long b10 = this.f13748d.b();
            try {
                try {
                    if (this.f13747c.e()) {
                        q0 a10 = a(this.f13750f);
                        this.f13752h = a10;
                        int i11 = a10.f14267a;
                        if (i11 >= 200 && i11 < 300) {
                            this.f13751g = this.f13750f.a(a10);
                        } else {
                            CBError.b bVar = CBError.b.NETWORK_FAILURE;
                            this.f13751g = p0.a(new CBError(bVar, "Failure due to HTTP status code " + i11));
                        }
                    } else {
                        this.f13751g = p0.a(new CBError(CBError.b.INTERNET_UNAVAILABLE, "Internet Unavailable"));
                    }
                    this.f13750f.f14234f = this.f13748d.b() - b10;
                    i10 = this.f13750f.f14237i;
                } catch (SocketException | UnknownHostException | SSLException | ConnectionClosedException | InterruptedIOException e11) {
                    this.f13751g = p0.a(new CBError(CBError.b.NETWORK_FAILURE, e11.toString()));
                    a("network_failure_dispatcher_exception", e11.toString());
                    this.f13750f.f14234f = this.f13748d.b() - b10;
                    int i12 = this.f13750f.f14237i;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            return;
                        }
                    }
                }
                if (i10 != 0) {
                    if (i10 != 1) {
                        return;
                    }
                    this.f13745a.execute(this);
                    return;
                }
                this.f13749e.post(this);
            }
        }
    }

    private void a() {
        o0<T> o0Var = this.f13750f;
        if (o0Var == null || o0Var.f14233e == null || !(o0Var instanceof i3)) {
            return;
        }
        File parentFile = this.f13750f.f14233e.getParentFile();
        File file = new File(parentFile, this.f13750f.f14233e.getName() + ".tmp");
        if (file.exists()) {
            file.delete();
        }
    }

    private q0 a(o0<T> o0Var) throws IOException {
        int i10 = 10000;
        int i11 = 0;
        while (true) {
            try {
                return a(o0Var, i10);
            } catch (SocketTimeoutException e10) {
                if (i11 >= 1) {
                    throw e10;
                }
                i10 *= 2;
                i11++;
            }
        }
    }

    private q0 a(o0<T> o0Var, int i10) throws IOException {
        this.f13753i = true;
        a a10 = o0Var.a();
        Map<String, String> map = a10.f13736a;
        HttpsURLConnection a11 = this.f13746b.a(o0Var);
        a11.setSSLSocketFactory(t0.c());
        a11.setConnectTimeout(i10);
        a11.setReadTimeout(i10);
        a11.setUseCaches(false);
        a11.setDoInput(true);
        try {
            a(map, a11);
            a11.setRequestMethod(o0Var.f14229a);
            a(a10, a11);
            long b10 = this.f13748d.b();
            int responseCode = a11.getResponseCode();
            long b11 = this.f13748d.b();
            o0Var.f14235g = b11 - b10;
            if (responseCode != -1) {
                return new q0(responseCode, a(a11, responseCode, b11));
            }
            throw new IOException("Could not retrieve response code from HttpsURLConnection.");
        } finally {
            a11.disconnect();
        }
    }

    private void a(Map<String, String> map, HttpsURLConnection httpsURLConnection) {
        if (map != null) {
            for (String str : map.keySet()) {
                httpsURLConnection.addRequestProperty(str, map.get(str));
            }
        }
    }

    private void a(a aVar, HttpsURLConnection httpsURLConnection) throws IOException {
        if (!this.f13750f.f14229a.equals("POST") || aVar.f13737b == null) {
            return;
        }
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setFixedLengthStreamingMode(aVar.f13737b.length);
        String str = aVar.f13738c;
        if (str != null) {
            httpsURLConnection.addRequestProperty("Content-Type", str);
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        try {
            dataOutputStream.write(aVar.f13737b);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private byte[] a(HttpsURLConnection httpsURLConnection, int i10, long j10) throws IOException {
        byte[] bArr;
        byte[] bArr2 = new byte[0];
        try {
            if (!a(i10)) {
                bArr = new byte[0];
            } else if (this.f13750f.f14233e != null) {
                c(httpsURLConnection);
                return bArr2;
            } else {
                bArr = b(httpsURLConnection);
            }
            bArr2 = bArr;
            return bArr2;
        } finally {
            this.f13750f.f14236h = this.f13748d.b() - j10;
        }
    }

    private void a(String str, long j10) {
        if (this.f13753i) {
            this.f13753i = false;
            this.f13750f.a(str, j10);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(c cVar) {
        return this.f13750f.f14231c - cVar.f13750f.f14231c;
    }

    private long a(HttpsURLConnection httpsURLConnection) {
        if (Build.VERSION.SDK_INT < 24) {
            return httpsURLConnection.getContentLength();
        }
        return httpsURLConnection.getContentLengthLong();
    }
}
