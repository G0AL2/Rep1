package com.ironsource.mediationsdk.b;

/* loaded from: classes3.dex */
public final class b extends com.ironsource.mediationsdk.b.a<a> {

    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    public b(int i10) {
        super(i10 * 1000);
    }

    @Override // com.ironsource.mediationsdk.b.a
    protected final void a() {
        T t10 = this.f27000a;
        if (t10 != 0) {
            ((a) t10).a();
        }
    }

    public final void a(a aVar) {
        a((b) aVar);
    }

    public final void d() {
        b();
    }
}
