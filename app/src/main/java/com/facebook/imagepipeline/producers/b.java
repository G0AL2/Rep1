package com.facebook.imagepipeline.producers;

/* compiled from: BaseConsumer.java */
/* loaded from: classes.dex */
public abstract class b<T> implements l<T> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f14906a = false;

    public static boolean e(int i10) {
        return (i10 & 1) == 1;
    }

    public static boolean f(int i10) {
        return !e(i10);
    }

    public static int l(boolean z10) {
        return z10 ? 1 : 0;
    }

    public static boolean m(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static boolean n(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static int o(int i10, int i11) {
        return i10 & (~i11);
    }

    @Override // com.facebook.imagepipeline.producers.l
    public synchronized void a() {
        if (this.f14906a) {
            return;
        }
        this.f14906a = true;
        try {
            g();
        } catch (Exception e10) {
            k(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.l
    public synchronized void b(Throwable th) {
        if (this.f14906a) {
            return;
        }
        this.f14906a = true;
        try {
            h(th);
        } catch (Exception e10) {
            k(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.l
    public synchronized void c(T t10, int i10) {
        if (this.f14906a) {
            return;
        }
        this.f14906a = e(i10);
        try {
            i(t10, i10);
        } catch (Exception e10) {
            k(e10);
        }
    }

    @Override // com.facebook.imagepipeline.producers.l
    public synchronized void d(float f10) {
        if (this.f14906a) {
            return;
        }
        try {
            j(f10);
        } catch (Exception e10) {
            k(e10);
        }
    }

    protected abstract void g();

    protected abstract void h(Throwable th);

    protected abstract void i(T t10, int i10);

    protected abstract void j(float f10);

    protected void k(Exception exc) {
        z3.a.J(getClass(), "unhandled exception", exc);
    }
}
