package n5;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.l;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.w;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import ye.b0;
import ye.d;
import ye.d0;
import ye.e;
import ye.e0;
import ye.f;
import ye.z;

/* compiled from: OkHttpNetworkFetcher.java */
/* loaded from: classes.dex */
public class b extends com.facebook.imagepipeline.producers.c<c> {

    /* renamed from: a  reason: collision with root package name */
    private final e.a f34634a;

    /* renamed from: b  reason: collision with root package name */
    private final d f34635b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f34636c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpNetworkFetcher.java */
    /* loaded from: classes.dex */
    public class a extends com.facebook.imagepipeline.producers.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f34637a;

        /* compiled from: OkHttpNetworkFetcher.java */
        /* renamed from: n5.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0455a implements Runnable {
            RunnableC0455a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f34637a.cancel();
            }
        }

        a(e eVar) {
            this.f34637a = eVar;
        }

        @Override // com.facebook.imagepipeline.producers.q0
        public void b() {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                b.this.f34636c.execute(new RunnableC0455a());
            } else {
                this.f34637a.cancel();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OkHttpNetworkFetcher.java */
    /* renamed from: n5.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0456b implements f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f34640a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0.a f34641b;

        C0456b(c cVar, k0.a aVar) {
            this.f34640a = cVar;
            this.f34641b = aVar;
        }

        @Override // ye.f
        public void onFailure(e eVar, IOException iOException) {
            b.this.l(eVar, iOException, this.f34641b);
        }

        @Override // ye.f
        public void onResponse(e eVar, d0 d0Var) throws IOException {
            this.f34640a.f34644g = SystemClock.elapsedRealtime();
            e0 a10 = d0Var.a();
            try {
                if (a10 != null) {
                    try {
                    } catch (Exception e10) {
                        b.this.l(eVar, e10, this.f34641b);
                    }
                    if (!d0Var.c0()) {
                        b.this.l(eVar, new IOException("Unexpected HTTP code " + d0Var), this.f34641b);
                        return;
                    }
                    q5.a c10 = q5.a.c(d0Var.w("Content-Range"));
                    if (c10 != null && (c10.f35914a != 0 || c10.f35915b != Integer.MAX_VALUE)) {
                        this.f34640a.j(c10);
                        this.f34640a.i(8);
                    }
                    long e11 = a10.e();
                    if (e11 < 0) {
                        e11 = 0;
                    }
                    this.f34641b.c(a10.a(), (int) e11);
                    return;
                }
                b.this.l(eVar, new IOException("Response body null: " + d0Var), this.f34641b);
            } finally {
                a10.close();
            }
        }
    }

    /* compiled from: OkHttpNetworkFetcher.java */
    /* loaded from: classes.dex */
    public static class c extends w {

        /* renamed from: f  reason: collision with root package name */
        public long f34643f;

        /* renamed from: g  reason: collision with root package name */
        public long f34644g;

        /* renamed from: h  reason: collision with root package name */
        public long f34645h;

        public c(l<w5.e> lVar, p0 p0Var) {
            super(lVar, p0Var);
        }
    }

    public b(z zVar) {
        this(zVar, zVar.p().d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(e eVar, Exception exc, k0.a aVar) {
        if (eVar.isCanceled()) {
            aVar.a();
        } else {
            aVar.b(exc);
        }
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: h */
    public c e(l<w5.e> lVar, p0 p0Var) {
        return new c(lVar, p0Var);
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: i */
    public void a(c cVar, k0.a aVar) {
        cVar.f34643f = SystemClock.elapsedRealtime();
        try {
            b0.a d10 = new b0.a().l(cVar.g().toString()).d();
            d dVar = this.f34635b;
            if (dVar != null) {
                d10.c(dVar);
            }
            q5.a a10 = cVar.b().k().a();
            if (a10 != null) {
                d10.a("Range", a10.d());
            }
            j(cVar, aVar, d10.b());
        } catch (Exception e10) {
            aVar.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(c cVar, k0.a aVar, b0 b0Var) {
        e a10 = this.f34634a.a(b0Var);
        cVar.b().c(new a(a10));
        a10.i1(new C0456b(cVar, aVar));
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: k */
    public Map<String, String> d(c cVar, int i10) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(cVar.f34644g - cVar.f34643f));
        hashMap.put("fetch_time", Long.toString(cVar.f34645h - cVar.f34644g));
        hashMap.put("total_time", Long.toString(cVar.f34645h - cVar.f34643f));
        hashMap.put("image_size", Integer.toString(i10));
        return hashMap;
    }

    @Override // com.facebook.imagepipeline.producers.k0
    /* renamed from: m */
    public void b(c cVar, int i10) {
        cVar.f34645h = SystemClock.elapsedRealtime();
    }

    public b(e.a aVar, Executor executor) {
        this(aVar, executor, true);
    }

    public b(e.a aVar, Executor executor, boolean z10) {
        this.f34634a = aVar;
        this.f34636c = executor;
        this.f34635b = z10 ? new d.a().e().a() : null;
    }
}
