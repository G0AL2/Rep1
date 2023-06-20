package com.bytedance.sdk.component.a;

/* compiled from: BaseStatefulMethod.java */
/* loaded from: classes.dex */
public abstract class d<P, R> extends com.bytedance.sdk.component.a.b<P, R> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f9217a = true;

    /* renamed from: b  reason: collision with root package name */
    private a f9218b;

    /* renamed from: c  reason: collision with root package name */
    private f f9219c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseStatefulMethod.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(Object obj);

        void a(Throwable th);
    }

    /* compiled from: BaseStatefulMethod.java */
    /* loaded from: classes.dex */
    public interface b {
        d a();
    }

    private boolean g() {
        if (this.f9217a) {
            return true;
        }
        i.a(new IllegalStateException("Jsb async call already finished: " + a() + ", hashcode: " + hashCode()));
        return false;
    }

    @Override // com.bytedance.sdk.component.a.b
    public /* bridge */ /* synthetic */ String a() {
        return super.a();
    }

    protected abstract void a(P p10, f fVar) throws Exception;

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        a((Throwable) null);
    }

    protected abstract void d();

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        this.f9217a = false;
        this.f9219c = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        d();
        e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(R r10) {
        if (g()) {
            this.f9218b.a(r10);
            e();
        }
    }

    protected final void a(Throwable th) {
        if (g()) {
            this.f9218b.a(th);
            e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(P p10, f fVar, a aVar) throws Exception {
        this.f9219c = fVar;
        this.f9218b = aVar;
        a(p10, fVar);
    }
}
