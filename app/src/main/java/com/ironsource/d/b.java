package com.ironsource.d;

import android.content.Context;
import android.util.Pair;
import com.ironsource.sdk.utils.SDKUtils;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import qe.k;

/* loaded from: classes3.dex */
public class b {

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final String f26082a;

        /* renamed from: b  reason: collision with root package name */
        final String f26083b;

        /* renamed from: c  reason: collision with root package name */
        final String f26084c;

        /* renamed from: d  reason: collision with root package name */
        final int f26085d;

        /* renamed from: e  reason: collision with root package name */
        final int f26086e;

        /* renamed from: f  reason: collision with root package name */
        final String f26087f;

        /* renamed from: g  reason: collision with root package name */
        ArrayList<Pair<String, String>> f26088g;

        /* renamed from: com.ironsource.d.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0335a {

            /* renamed from: b  reason: collision with root package name */
            public String f26090b;

            /* renamed from: d  reason: collision with root package name */
            public String f26092d;

            /* renamed from: a  reason: collision with root package name */
            List<Pair<String, String>> f26089a = new ArrayList();

            /* renamed from: c  reason: collision with root package name */
            public String f26091c = "POST";

            /* renamed from: e  reason: collision with root package name */
            int f26093e = 15000;

            /* renamed from: f  reason: collision with root package name */
            int f26094f = 15000;

            /* renamed from: g  reason: collision with root package name */
            String f26095g = "UTF-8";

            public final C0335a a(List<Pair<String, String>> list) {
                this.f26089a.addAll(list);
                return this;
            }

            public final a a() {
                return new a(this);
            }
        }

        public a(C0335a c0335a) {
            this.f26082a = c0335a.f26090b;
            this.f26083b = c0335a.f26091c;
            this.f26084c = c0335a.f26092d;
            this.f26088g = new ArrayList<>(c0335a.f26089a);
            this.f26085d = c0335a.f26093e;
            this.f26086e = c0335a.f26094f;
            this.f26087f = c0335a.f26095g;
        }
    }

    public b() {
        new com.ironsource.mediationsdk.adunit.a.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.ironsource.d.c a(com.ironsource.d.b.a r7) {
        /*
            java.lang.String r0 = r7.f26082a
            java.lang.String r1 = r7.f26084c
            if (r0 == 0) goto L16
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L16
            if (r1 == 0) goto L16
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto Lca
            com.ironsource.d.c r0 = new com.ironsource.d.c
            r0.<init>()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L84
            java.lang.String r3 = r7.f26082a     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L84
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L84
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L84
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L84
            int r3 = r7.f26085d     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L84
            r2.setConnectTimeout(r3)     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L84
            int r3 = r7.f26086e     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L84
            r2.setReadTimeout(r3)     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L84
            java.lang.String r3 = r7.f26083b     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L84
            r2.setRequestMethod(r3)     // Catch: java.lang.Throwable -> L81 java.io.IOException -> L84
            java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> r3 = r7.f26088g     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            b(r2, r3)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            java.lang.String r3 = "POST"
            java.lang.String r4 = r7.f26083b     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            if (r3 == 0) goto L5f
            java.lang.String r3 = r7.f26084c     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            java.lang.String r4 = r7.f26087f     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            byte[] r3 = r3.getBytes(r4)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            int r4 = r3.length     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            java.lang.String r5 = "Content-Length"
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            r2.setRequestProperty(r5, r4)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            c(r2, r3)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
        L5f:
            java.io.InputStream r1 = r2.getInputStream()     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            int r3 = r2.getResponseCode()     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            r0.f26096a = r3     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            if (r1 == 0) goto L71
            byte[] r3 = com.ironsource.environment.a.AnonymousClass1.a(r1)     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
            r0.f26097b = r3     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7c
        L71:
            if (r1 == 0) goto L76
            r1.close()
        L76:
            r2.disconnect()
            goto Lb9
        L7a:
            r7 = move-exception
            goto Lbf
        L7c:
            r3 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L86
        L81:
            r7 = move-exception
            r2 = r1
            goto Lbf
        L84:
            r3 = move-exception
            r2 = r1
        L86:
            if (r1 == 0) goto Lba
            int r4 = r1.getResponseCode()     // Catch: java.lang.Throwable -> Lbb
            r0.f26096a = r4     // Catch: java.lang.Throwable -> Lbb
            r5 = 400(0x190, float:5.6E-43)
            if (r4 < r5) goto Lba
            java.lang.String r3 = "ISHttpService"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r5 = "Failed post to "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r7 = r7.f26082a     // Catch: java.lang.Throwable -> Lbb
            r4.append(r7)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r7 = " StatusCode: "
            r4.append(r7)     // Catch: java.lang.Throwable -> Lbb
            int r7 = r0.f26096a     // Catch: java.lang.Throwable -> Lbb
            r4.append(r7)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> Lbb
            android.util.Log.d(r3, r7)     // Catch: java.lang.Throwable -> Lbb
            if (r2 == 0) goto Lb6
            r2.close()
        Lb6:
            r1.disconnect()
        Lb9:
            return r0
        Lba:
            throw r3     // Catch: java.lang.Throwable -> Lbb
        Lbb:
            r7 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
        Lbf:
            if (r1 == 0) goto Lc4
            r1.close()
        Lc4:
            if (r2 == 0) goto Lc9
            r2.disconnect()
        Lc9:
            throw r7
        Lca:
            java.security.InvalidParameterException r7 = new java.security.InvalidParameterException
            java.lang.String r0 = "not valid params"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.d.b.a(com.ironsource.d.b$a):com.ironsource.d.c");
    }

    public static c a(String str, String str2, List<Pair<String, String>> list) {
        a.C0335a c0335a = new a.C0335a();
        c0335a.f26090b = str;
        c0335a.f26092d = str2;
        c0335a.f26091c = "POST";
        c0335a.a(list);
        return a(c0335a.a());
    }

    private static void b(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    private static void c(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    public void a(int i10) {
        com.ironsource.mediationsdk.adunit.a.a.a("itp", Integer.valueOf(i10));
    }

    public void a(Context context) {
        com.ironsource.mediationsdk.adunit.a.a.a(context);
    }

    public void a(com.ironsource.c.b bVar) {
        try {
            HashMap hashMap = new HashMap();
            String str = com.ironsource.sdk.e.a.a.f28095a;
            k.e(str, "OMIDManager.OMID_LIB_VERSION");
            hashMap.put("omv", str);
            hashMap.put("ompv", "7");
            String sDKVersion = SDKUtils.getSDKVersion();
            k.e(sDKVersion, "SDKUtils.getSDKVersion()");
            hashMap.put("sdkv", sDKVersion);
            com.ironsource.mediationsdk.adunit.a.a.a(hashMap);
        } catch (Exception unused) {
        }
    }

    public void a(Boolean bool) {
        com.ironsource.mediationsdk.adunit.a.a.a("fs", bool);
    }

    public void a(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("apky", str);
    }

    public void a(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adunit.a.a.a("md", (Object) jSONObject);
    }

    public void a(boolean z10) {
        com.ironsource.mediationsdk.adunit.a.a.a("cnst", Boolean.valueOf(z10));
    }

    public void b(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("medv", str);
    }

    public void b(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adunit.a.a.a("tkgp", (Object) jSONObject);
    }

    public void b(boolean z10) {
        com.ironsource.mediationsdk.adunit.a.a.a("gpi", Boolean.valueOf(z10));
    }

    public void c(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("sid", str);
    }

    public void d(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("plugin", str);
    }

    public void e(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("usid", str);
    }

    public void f(String str) {
        com.ironsource.mediationsdk.adunit.a.a.a("audt", str);
    }
}
