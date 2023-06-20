package vb;

import ac.c0;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import sc.a;

/* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
/* loaded from: classes3.dex */
public final class d implements vb.a {

    /* renamed from: c */
    private static final g f38036c = new b();

    /* renamed from: a */
    private final sc.a<vb.a> f38037a;

    /* renamed from: b */
    private final AtomicReference<vb.a> f38038b = new AtomicReference<>(null);

    /* compiled from: CrashlyticsNativeComponentDeferredProxy.java */
    /* loaded from: classes3.dex */
    private static final class b implements g {
        private b() {
        }

        @Override // vb.g
        public File a() {
            return null;
        }

        @Override // vb.g
        public File b() {
            return null;
        }

        @Override // vb.g
        public File c() {
            return null;
        }

        @Override // vb.g
        public File d() {
            return null;
        }

        @Override // vb.g
        public File e() {
            return null;
        }

        @Override // vb.g
        public File f() {
            return null;
        }
    }

    public d(sc.a<vb.a> aVar) {
        this.f38037a = aVar;
        aVar.a(new a.InterfaceC0500a() { // from class: vb.c
            @Override // sc.a.InterfaceC0500a
            public final void a(sc.b bVar) {
                d.e(d.this, bVar);
            }
        });
    }

    public static /* synthetic */ void e(d dVar, sc.b bVar) {
        dVar.g(bVar);
    }

    public static /* synthetic */ void f(String str, String str2, long j10, c0 c0Var, sc.b bVar) {
        h(str, str2, j10, c0Var, bVar);
    }

    public /* synthetic */ void g(sc.b bVar) {
        f.f().b("Crashlytics native component now available.");
        this.f38038b.set((vb.a) bVar.get());
    }

    public static /* synthetic */ void h(String str, String str2, long j10, c0 c0Var, sc.b bVar) {
        ((vb.a) bVar.get()).d(str, str2, j10, c0Var);
    }

    @Override // vb.a
    public g a(String str) {
        vb.a aVar = this.f38038b.get();
        if (aVar == null) {
            return f38036c;
        }
        return aVar.a(str);
    }

    @Override // vb.a
    public boolean b() {
        vb.a aVar = this.f38038b.get();
        return aVar != null && aVar.b();
    }

    @Override // vb.a
    public boolean c(String str) {
        vb.a aVar = this.f38038b.get();
        return aVar != null && aVar.c(str);
    }

    @Override // vb.a
    public void d(final String str, final String str2, final long j10, final c0 c0Var) {
        f f10 = f.f();
        f10.i("Deferring native open session: " + str);
        this.f38037a.a(new a.InterfaceC0500a() { // from class: vb.b
            @Override // sc.a.InterfaceC0500a
            public final void a(sc.b bVar) {
                d.f(str, str2, j10, c0Var, bVar);
            }
        });
    }
}
