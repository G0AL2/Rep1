package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.facebook.imagepipeline.producers.k0;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* compiled from: HttpUrlConnectionNetworkFetcher.java */
/* loaded from: classes.dex */
public class x extends com.facebook.imagepipeline.producers.c<c> {

    /* renamed from: a  reason: collision with root package name */
    private int f15151a;

    /* renamed from: b  reason: collision with root package name */
    private String f15152b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f15153c;

    /* renamed from: d  reason: collision with root package name */
    private final ExecutorService f15154d;

    /* renamed from: e  reason: collision with root package name */
    private final f4.b f15155e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpUrlConnectionNetworkFetcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f15156a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.a f15157b;

        a(c cVar, k0.a aVar) {
            this.f15156a = cVar;
            this.f15157b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.j(this.f15156a, this.f15157b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HttpUrlConnectionNetworkFetcher.java */
    /* loaded from: classes.dex */
    public class b extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Future f15159a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.a f15160b;

        b(x xVar, Future future, k0.a aVar) {
            this.f15159a = future;
            this.f15160b = aVar;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            if (this.f15159a.cancel(false)) {
                this.f15160b.a();
            }
        }
    }

    /* compiled from: HttpUrlConnectionNetworkFetcher.java */
    /* loaded from: classes.dex */
    public static class c extends w {

        /* renamed from: f  reason: collision with root package name */
        private long f15161f;

        /* renamed from: g  reason: collision with root package name */
        private long f15162g;

        /* renamed from: h  reason: collision with root package name */
        private long f15163h;

        public c(l<w5.e> lVar, p0 p0Var) {
            super(lVar, p0Var);
        }
    }

    public x(int i10) {
        this(null, null, RealtimeSinceBootClock.get());
        this.f15151a = i10;
    }

    private HttpURLConnection g(Uri uri, int i10) throws IOException {
        HttpURLConnection o10 = o(uri);
        String str = this.f15152b;
        if (str != null) {
            o10.setRequestProperty("User-Agent", str);
        }
        Map<String, String> map = this.f15153c;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                o10.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        o10.setConnectTimeout(this.f15151a);
        int responseCode = o10.getResponseCode();
        if (m(responseCode)) {
            return o10;
        }
        if (l(responseCode)) {
            String headerField = o10.getHeaderField("Location");
            o10.disconnect();
            Uri parse = headerField == null ? null : Uri.parse(headerField);
            String scheme = uri.getScheme();
            if (i10 > 0 && parse != null && !y3.j.a(parse.getScheme(), scheme)) {
                return g(parse, i10 - 1);
            }
            throw new IOException(i10 == 0 ? h("URL %s follows too many redirects", uri.toString()) : h("URL %s returned %d without a valid redirect", uri.toString(), Integer.valueOf(responseCode)));
        }
        o10.disconnect();
        throw new IOException(String.format("Image URL %s returned HTTP code %d", uri.toString(), Integer.valueOf(responseCode)));
    }

    private static String h(String str, Object... objArr) {
        return String.format(Locale.getDefault(), str, objArr);
    }

    private static boolean l(int i10) {
        if (i10 == 307 || i10 == 308) {
            return true;
        }
        switch (i10) {
            case ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE /* 300 */:
            case 301:
            case IronSourceConstants.OFFERWALL_AVAILABLE /* 302 */:
            case 303:
                return true;
            default:
                return false;
        }
    }

    private static boolean m(int i10) {
        return i10 >= 200 && i10 < 300;
    }

    static HttpURLConnection o(Uri uri) throws IOException {
        return (HttpURLConnection) g4.f.n(uri).openConnection();
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: f */
    public c e(l<w5.e> lVar, p0 p0Var) {
        return new c(lVar, p0Var);
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: i */
    public void a(c cVar, k0.a aVar) {
        cVar.f15161f = this.f15155e.now();
        cVar.b().c(new b(this, this.f15154d.submit(new a(cVar, aVar)), aVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void j(com.facebook.imagepipeline.producers.x.c r5, com.facebook.imagepipeline.producers.k0.a r6) {
        /*
            r4 = this;
            r0 = 0
            android.net.Uri r1 = r5.g()     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            r2 = 5
            java.net.HttpURLConnection r1 = r4.g(r1, r2)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2c
            f4.b r2 = r4.f15155e     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
            long r2 = r2.now()     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
            com.facebook.imagepipeline.producers.x.c.n(r5, r2)     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
            if (r1 == 0) goto L1d
            java.io.InputStream r0 = r1.getInputStream()     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
            r5 = -1
            r6.c(r0, r5)     // Catch: java.io.IOException -> L27 java.lang.Throwable -> L3e
        L1d:
            if (r0 == 0) goto L24
            r0.close()     // Catch: java.io.IOException -> L23
            goto L24
        L23:
        L24:
            if (r1 == 0) goto L3d
            goto L3a
        L27:
            r5 = move-exception
            goto L2e
        L29:
            r5 = move-exception
            r1 = r0
            goto L3f
        L2c:
            r5 = move-exception
            r1 = r0
        L2e:
            r6.b(r5)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L38
            r0.close()     // Catch: java.io.IOException -> L37
            goto L38
        L37:
        L38:
            if (r1 == 0) goto L3d
        L3a:
            r1.disconnect()
        L3d:
            return
        L3e:
            r5 = move-exception
        L3f:
            if (r0 == 0) goto L46
            r0.close()     // Catch: java.io.IOException -> L45
            goto L46
        L45:
        L46:
            if (r1 == 0) goto L4b
            r1.disconnect()
        L4b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.x.j(com.facebook.imagepipeline.producers.x$c, com.facebook.imagepipeline.producers.k0$a):void");
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: k */
    public Map<String, String> d(c cVar, int i10) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(cVar.f15162g - cVar.f15161f));
        hashMap.put("fetch_time", Long.toString(cVar.f15163h - cVar.f15162g));
        hashMap.put("total_time", Long.toString(cVar.f15163h - cVar.f15161f));
        hashMap.put("image_size", Integer.toString(i10));
        return hashMap;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: n */
    public void b(c cVar, int i10) {
        cVar.f15163h = this.f15155e.now();
    }

    x(String str, Map<String, String> map, f4.b bVar) {
        this.f15154d = Executors.newFixedThreadPool(3);
        this.f15155e = bVar;
        this.f15153c = map;
        this.f15152b = str;
    }
}
