package com.inmobi.media;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NetworkConnection.java */
/* loaded from: classes3.dex */
public class gv {

    /* renamed from: a  reason: collision with root package name */
    protected static final String f25602a = "gv";

    /* renamed from: b  reason: collision with root package name */
    protected gx f25603b;

    /* renamed from: c  reason: collision with root package name */
    protected HttpURLConnection f25604c;

    public gv(gx gxVar) {
        this.f25603b = gxVar;
    }

    public gy a() {
        gy gyVar;
        BufferedWriter bufferedWriter;
        this.f25603b.a();
        if (!this.f25603b.f25622q) {
            gy gyVar2 = new gy();
            gyVar2.f25627a = new gw(-8, "Network Request dropped as current request is not GDPR compliant.");
            return gyVar2;
        } else if (hv.a()) {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f25603b.e()).openConnection();
                a(httpURLConnection);
                this.f25604c = httpURLConnection;
                if (!this.f25603b.f25619n) {
                    httpURLConnection.setInstanceFollowRedirects(false);
                }
                if ("POST".equals(this.f25603b.f25615j)) {
                    String f10 = this.f25603b.f();
                    String str = this.f25603b.f25616k;
                    this.f25604c.setRequestProperty("Content-Length", Integer.toString(f10.length()));
                    this.f25604c.setRequestProperty("Content-Type", str);
                    BufferedWriter bufferedWriter2 = null;
                    try {
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.f25604c.getOutputStream()));
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedWriter.write(f10);
                        hv.a(bufferedWriter);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedWriter2 = bufferedWriter;
                        hv.a(bufferedWriter2);
                        throw th;
                    }
                }
                return b();
            } catch (IOException e10) {
                gyVar = new gy();
                gyVar.f25627a = new gw(-2, e10.getLocalizedMessage());
                return gyVar;
            } catch (Exception e11) {
                gyVar = new gy();
                gyVar.f25627a = new gw(-1, e11.getLocalizedMessage());
                return gyVar;
            }
        } else {
            gy gyVar3 = new gy();
            gyVar3.f25627a = new gw(0, "Network not reachable currently. Please try again.");
            return gyVar3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006b A[Catch: all -> 0x00ad, Exception -> 0x00af, OutOfMemoryError -> 0x00c9, IOException -> 0x00e5, SocketTimeoutException -> 0x0101, TryCatch #11 {IOException -> 0x00e5, Exception -> 0x00af, blocks: (B:3:0x000c, B:5:0x0017, B:37:0x006b, B:38:0x007f, B:15:0x0032, B:16:0x0035, B:17:0x0038), top: B:75:0x000c, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007f A[Catch: all -> 0x00ad, Exception -> 0x00af, OutOfMemoryError -> 0x00c9, IOException -> 0x00e5, SocketTimeoutException -> 0x0101, TRY_LEAVE, TryCatch #11 {IOException -> 0x00e5, Exception -> 0x00af, blocks: (B:3:0x000c, B:5:0x0017, B:37:0x006b, B:38:0x007f, B:15:0x0032, B:16:0x0035, B:17:0x0038), top: B:75:0x000c, outer: #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.inmobi.media.gy b() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.gv.b():com.inmobi.media.gy");
    }

    private void a(HttpURLConnection httpURLConnection) throws ProtocolException {
        httpURLConnection.setConnectTimeout(this.f25603b.f25617l);
        httpURLConnection.setReadTimeout(this.f25603b.f25618m);
        httpURLConnection.setUseCaches(false);
        Map<String, String> d10 = this.f25603b.d();
        if (d10 != null) {
            for (String str : d10.keySet()) {
                httpURLConnection.setRequestProperty(str, d10.get(str));
            }
        }
        String str2 = this.f25603b.f25615j;
        httpURLConnection.setRequestMethod(str2);
        if ("GET".equals(str2)) {
            return;
        }
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
    }

    private void a(gy gyVar, boolean z10) throws IOException {
        if (this.f25603b.c() && this.f25604c.getContentLength() > this.f25603b.f25621p) {
            gyVar.f25627a = new gw(-5, "Response size greater than specified max response size");
            return;
        }
        InputStream errorStream = z10 ? this.f25604c.getErrorStream() : this.f25604c.getInputStream();
        try {
            byte[] a10 = hv.a(errorStream);
            hv.a((Closeable) errorStream);
            gyVar.f25629c = this.f25604c.getHeaderFields();
            if (a10.length != 0) {
                if (a(gyVar) && (a10 = hv.a(a10)) == null) {
                    gyVar.f25627a = new gw(-6, "Failed to uncompress gzip response");
                }
                if (a10 != null) {
                    gyVar.a(a10);
                }
            }
        } catch (Throwable th) {
            hv.a((Closeable) errorStream);
            throw th;
        }
    }

    private static String a(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("errorMessage")) {
                    return jSONObject.getString("errorMessage");
                }
                return null;
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    private static boolean a(gy gyVar) {
        List<String> list;
        return gyVar.f25629c.containsKey("Content-Encoding") && (list = gyVar.f25629c.get("Content-Encoding")) != null && list.contains("gzip");
    }
}
