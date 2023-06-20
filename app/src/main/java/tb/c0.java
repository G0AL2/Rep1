package tb;

import sc.a;

/* compiled from: OptionalProvider.java */
/* loaded from: classes3.dex */
public class c0<T> implements sc.b<T>, sc.a<T> {

    /* renamed from: c */
    private static final a.InterfaceC0500a<Object> f37246c = new a.InterfaceC0500a() { // from class: tb.a0
        @Override // sc.a.InterfaceC0500a
        public final void a(sc.b bVar) {
            c0.c(bVar);
        }
    };

    /* renamed from: d */
    private static final sc.b<Object> f37247d = new sc.b() { // from class: tb.b0
        @Override // sc.b
        public final Object get() {
            return c0.b();
        }
    };

    /* renamed from: a */
    private a.InterfaceC0500a<T> f37248a;

    /* renamed from: b */
    private volatile sc.b<T> f37249b;

    private c0(a.InterfaceC0500a<T> interfaceC0500a, sc.b<T> bVar) {
        this.f37248a = interfaceC0500a;
        this.f37249b = bVar;
    }

    public static /* synthetic */ Object b() {
        return g();
    }

    public static /* synthetic */ void c(sc.b bVar) {
        f(bVar);
    }

    public static <T> c0<T> e() {
        return new c0<>(f37246c, f37247d);
    }

    public static /* synthetic */ void f(sc.b bVar) {
    }

    public static /* synthetic */ Object g() {
        return null;
    }

    public static /* synthetic */ void h(a.InterfaceC0500a interfaceC0500a, a.InterfaceC0500a interfaceC0500a2, sc.b bVar) {
        interfaceC0500a.a(bVar);
        interfaceC0500a2.a(bVar);
    }

    public static <T> c0<T> i(sc.b<T> bVar) {
        return new c0<>(null, bVar);
    }

    @Override // sc.a
    public void a(final a.InterfaceC0500a<T> interfaceC0500a) {
        sc.b<T> bVar;
        sc.b<T> bVar2 = this.f37249b;
        sc.b<Object> bVar3 = f37247d;
        if (bVar2 != bVar3) {
            interfaceC0500a.a(bVar2);
            return;
        }
        sc.b<T> bVar4 = null;
        synchronized (this) {
            bVar = this.f37249b;
            if (bVar != bVar3) {
                bVar4 = bVar;
            } else {
                final a.InterfaceC0500a<T> interfaceC0500a2 = this.f37248a;
                this.f37248a = new a.InterfaceC0500a() { // from class: tb.z
                    @Override // sc.a.InterfaceC0500a
                    public final void a(sc.b bVar5) {
                        c0.h(a.InterfaceC0500a.this, interfaceC0500a, bVar5);
                    }
                };
            }
        }
        if (bVar4 != null) {
            interfaceC0500a.a(bVar);
        }
    }

    @Override // sc.b
    public T get() {
        return this.f37249b.get();
    }

    public void j(sc.b<T> bVar) {
        a.InterfaceC0500a<T> interfaceC0500a;
        if (this.f37249b == f37247d) {
            synchronized (this) {
                interfaceC0500a = this.f37248a;
                this.f37248a = null;
                this.f37249b = bVar;
            }
            interfaceC0500a.a(bVar);
            return;
        }
        throw new IllegalStateException("provide() can be called only once.");
    }
}
