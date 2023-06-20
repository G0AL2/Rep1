package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends h implements g {

    /* loaded from: classes.dex */
    public static class a extends j {

        /* renamed from: f  reason: collision with root package name */
        public final HttpURLConnection f17567f;

        public a(HttpURLConnection httpURLConnection, int i10, InputStream inputStream, Map<String, List<String>> map, String str) {
            this.f17567f = httpURLConnection;
            a(i10);
            a(inputStream);
            a(map);
            a(str);
        }

        @Override // com.fyber.inneractive.sdk.network.j
        public void a() throws IOException {
            try {
                HttpURLConnection httpURLConnection = this.f17567f;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable unused) {
            }
            InputStream inputStream = this.f17571c;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|2|3|(7:8|9|10|11|12|13|14)|22|9|10|11|12|13|14|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
        r13 = null;
     */
    @Override // com.fyber.inneractive.sdk.network.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> com.fyber.inneractive.sdk.network.j a(com.fyber.inneractive.sdk.network.b0<T> r13, java.lang.String r14, java.lang.String r15) throws java.lang.Exception {
        /*
            r12 = this;
            java.lang.String r0 = "gzip"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "HttpExecutorImpl"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "%s hurl network stack is in use"
            com.fyber.inneractive.sdk.util.IAlog.a(r2, r1)
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            java.lang.String r2 = r13.a()     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            r1.<init>(r2)     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            r5 = r1
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            com.fyber.inneractive.sdk.network.o0 r1 = r13.i()     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            int r2 = r1.f17651a     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            r5.setConnectTimeout(r2)     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            int r1 = r1.f17652b     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            r5.setReadTimeout(r1)     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            java.lang.String r1 = "User-Agent"
            r12.a(r5, r1, r14)     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            java.lang.String r14 = "If-Modified-Since"
            r12.a(r5, r14, r15)     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            java.lang.String r14 = "Accept-Encoding"
            r12.a(r5, r14, r0)     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            r12.a(r5, r13)     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            com.fyber.inneractive.sdk.network.y r14 = r13.n()     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            com.fyber.inneractive.sdk.network.y r15 = com.fyber.inneractive.sdk.network.y.POST     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            if (r14 == r15) goto L54
            com.fyber.inneractive.sdk.network.y r14 = r13.n()     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            com.fyber.inneractive.sdk.network.y r15 = com.fyber.inneractive.sdk.network.y.PUT     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            if (r14 != r15) goto L50
            goto L54
        L50:
            r5.connect()     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
            goto L57
        L54:
            r12.b(r5, r13)     // Catch: java.lang.Exception -> L9e java.net.MalformedURLException -> Lac
        L57:
            java.io.InputStream r13 = r5.getInputStream()     // Catch: java.lang.Exception -> L68
            java.lang.String r14 = r5.getContentEncoding()     // Catch: java.lang.Exception -> L68
            boolean r14 = android.text.TextUtils.equals(r0, r14)     // Catch: java.lang.Exception -> L68
            java.io.InputStream r13 = r12.a(r13, r14)     // Catch: java.lang.Exception -> L68
            goto L69
        L68:
            r13 = 0
        L69:
            r7 = r13
            int r8 = r5.getResponseCode()     // Catch: java.io.IOException -> L90
            java.lang.String r9 = r5.getResponseMessage()     // Catch: java.io.IOException -> L90
            java.util.Map r10 = r5.getHeaderFields()     // Catch: java.io.IOException -> L90
            java.lang.String r13 = "Last-Modified"
            java.lang.String r11 = r5.getHeaderField(r13)     // Catch: java.io.IOException -> L90
            r6 = r12
            com.fyber.inneractive.sdk.network.j r13 = r6.a(r7, r8, r9, r10, r11)     // Catch: java.io.IOException -> L90
            com.fyber.inneractive.sdk.network.i$a r14 = new com.fyber.inneractive.sdk.network.i$a     // Catch: java.io.IOException -> L90
            int r6 = r13.f17569a     // Catch: java.io.IOException -> L90
            java.io.InputStream r7 = r13.f17571c     // Catch: java.io.IOException -> L90
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r8 = r13.f17572d     // Catch: java.io.IOException -> L90
            java.lang.String r9 = r13.f17573e     // Catch: java.io.IOException -> L90
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.io.IOException -> L90
            return r14
        L90:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r3]
            java.lang.String r15 = "failed reading network response"
            com.fyber.inneractive.sdk.util.IAlog.a(r15, r13, r14)
            com.fyber.inneractive.sdk.network.q0 r14 = new com.fyber.inneractive.sdk.network.q0
            r14.<init>(r13)
            throw r14
        L9e:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r3]
            java.lang.String r15 = "failed executing network request"
            com.fyber.inneractive.sdk.util.IAlog.a(r15, r13, r14)
            com.fyber.inneractive.sdk.network.b r14 = new com.fyber.inneractive.sdk.network.b
            r14.<init>(r13)
            throw r14
        Lac:
            r13 = move-exception
            java.lang.Object[] r14 = new java.lang.Object[r3]
            java.lang.String r15 = "failed creating request URL"
            com.fyber.inneractive.sdk.util.IAlog.a(r15, r13, r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.i.a(com.fyber.inneractive.sdk.network.b0, java.lang.String, java.lang.String):com.fyber.inneractive.sdk.network.j");
    }

    @Override // com.fyber.inneractive.sdk.network.g
    public void b() {
    }

    public final void b(HttpURLConnection httpURLConnection, b0 b0Var) throws Exception {
        httpURLConnection.setRequestMethod(b0Var.n().f17718a);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        byte[] k10 = b0Var.k();
        int length = k10 != null ? k10.length : 0;
        httpURLConnection.setRequestProperty("Content-Length", "" + length);
        httpURLConnection.setRequestProperty("Content-Type", b0Var.m());
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(k10);
        try {
            outputStream.close();
        } catch (Throwable unused) {
        }
    }

    public final <T> void a(HttpURLConnection httpURLConnection, b0<T> b0Var) {
        Map<String, String> q10 = b0Var.q();
        if (q10 != null) {
            for (String str : q10.keySet()) {
                a(httpURLConnection, str, q10.get(str));
            }
        }
    }

    public final void a(HttpURLConnection httpURLConnection, String str, String str2) {
        if (httpURLConnection == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        int i10 = IAlog.f20222a;
        IAlog.a(1, null, "%s %s : %s", "REQUEST_HEADER", str, str2);
        httpURLConnection.addRequestProperty(str, str2);
    }
}
