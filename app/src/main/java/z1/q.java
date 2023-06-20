package z1;

import java.util.Collections;

/* compiled from: ValueCallbackKeyframeAnimation.java */
/* loaded from: classes.dex */
public class q<K, A> extends a<K, A> {

    /* renamed from: i  reason: collision with root package name */
    private final A f39955i;

    public q(j2.c<A> cVar) {
        this(cVar, null);
    }

    @Override // z1.a
    float c() {
        return 1.0f;
    }

    @Override // z1.a
    public A h() {
        j2.c<A> cVar = this.f39899e;
        A a10 = this.f39955i;
        return cVar.b(0.0f, 0.0f, a10, a10, f(), f(), f());
    }

    @Override // z1.a
    A i(j2.a<K> aVar, float f10) {
        return h();
    }

    @Override // z1.a
    public void k() {
        if (this.f39899e != null) {
            super.k();
        }
    }

    @Override // z1.a
    public void m(float f10) {
        this.f39898d = f10;
    }

    public q(j2.c<A> cVar, A a10) {
        super(Collections.emptyList());
        n(cVar);
        this.f39955i = a10;
    }
}
