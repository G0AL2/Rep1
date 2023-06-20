package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.net.HttpURLConnection;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f20446b = new byte[0];

    /* renamed from: c  reason: collision with root package name */
    public static final r f20447c = new r();

    /* renamed from: a  reason: collision with root package name */
    public final p<t> f20448a = new p<>(1048576);

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.web.s a(java.net.HttpURLConnection r11, java.nio.ByteBuffer r12) throws java.io.IOException {
        /*
            r11.connect()
            r0 = 0
            r1 = 0
        L5:
            r2 = 20
            r3 = 0
            if (r1 >= r2) goto Lda
            int r9 = r11.getResponseCode()
            r2 = 300(0x12c, float:4.2E-43)
            if (r9 < r2) goto L38
            r2 = 400(0x190, float:5.6E-43)
            if (r9 < r2) goto L17
            goto L38
        L17:
            java.lang.String r2 = "Location"
            java.lang.String r2 = r11.getHeaderField(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L24
            return r3
        L24:
            r11.disconnect()
            java.net.URL r11 = new java.net.URL
            r11.<init>(r2)
            java.net.URLConnection r11 = r11.openConnection()
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11
            r11.connect()
            int r1 = r1 + 1
            goto L5
        L38:
            java.io.InputStream r1 = r11.getInputStream()     // Catch: java.lang.Throwable -> L52
            byte[] r12 = r12.array()     // Catch: java.lang.Throwable -> L53
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L53
            r2.<init>()     // Catch: java.lang.Throwable -> L53
        L45:
            int r4 = r1.read(r12)     // Catch: java.lang.Throwable -> L50
            r5 = -1
            if (r4 == r5) goto L54
            r2.write(r12, r0, r4)     // Catch: java.lang.Throwable -> L50
            goto L45
        L50:
            goto L54
        L52:
            r1 = r3
        L53:
            r2 = r3
        L54:
            com.fyber.inneractive.sdk.util.s.b(r1)
            r11.disconnect()
            java.lang.String r12 = r11.getContentType()
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r4 = ""
            if (r1 != 0) goto L87
            java.lang.String r1 = ";"
            java.lang.String[] r12 = r12.split(r1)
            int r1 = r12.length
            if (r1 <= 0) goto L76
            r1 = r12[r0]
            java.lang.String r1 = r1.trim()
            goto L77
        L76:
            r1 = r4
        L77:
            int r5 = r12.length
            r6 = 1
            if (r5 <= r6) goto L84
            r12 = r12[r6]
            java.lang.String r12 = r12.trim()
            r8 = r12
            r7 = r1
            goto L89
        L84:
            r7 = r1
            r8 = r4
            goto L89
        L87:
            r7 = r4
            r8 = r7
        L89:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Map r12 = r11.getHeaderFields()
            if (r12 == 0) goto Lbe
            java.util.Set r1 = r12.keySet()
            java.util.Iterator r1 = r1.iterator()
        L9c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lbe
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r12.get(r4)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L9c
            int r10 = r5.size()
            if (r10 <= 0) goto L9c
            java.lang.Object r5 = r5.get(r0)
            r6.put(r4, r5)
            goto L9c
        Lbe:
            java.lang.String r10 = r11.getResponseMessage()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto Lc9
            return r3
        Lc9:
            com.fyber.inneractive.sdk.web.s r11 = new com.fyber.inneractive.sdk.web.s
            if (r2 != 0) goto Ld0
            byte[] r12 = com.fyber.inneractive.sdk.web.r.f20446b
            goto Ld4
        Ld0:
            byte[] r12 = r2.toByteArray()
        Ld4:
            r5 = r12
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r11
        Lda:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.web.r.a(java.net.HttpURLConnection, java.nio.ByteBuffer):com.fyber.inneractive.sdk.web.s");
    }

    public static void a(WebResourceRequest webResourceRequest, HttpURLConnection httpURLConnection) {
        if (webResourceRequest.getRequestHeaders() == null || webResourceRequest.getRequestHeaders().size() <= 0) {
            return;
        }
        for (String str : webResourceRequest.getRequestHeaders().keySet()) {
            if (str != null && webResourceRequest.getRequestHeaders().get(str) != null) {
                httpURLConnection.setRequestProperty(str, webResourceRequest.getRequestHeaders().get(str));
            }
        }
    }
}
