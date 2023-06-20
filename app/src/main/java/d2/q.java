package d2;

import com.airbnb.lottie.d0;

/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public class q implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f29016a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29017b;

    /* renamed from: c  reason: collision with root package name */
    private final c2.h f29018c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f29019d;

    public q(String str, int i10, c2.h hVar, boolean z10) {
        this.f29016a = str;
        this.f29017b = i10;
        this.f29018c = hVar;
        this.f29019d = z10;
    }

    @Override // d2.c
    public y1.c a(d0 d0Var, e2.b bVar) {
        return new y1.r(d0Var, bVar, this);
    }

    public String b() {
        return this.f29016a;
    }

    public c2.h c() {
        return this.f29018c;
    }

    public boolean d() {
        return this.f29019d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f29016a + ", index=" + this.f29017b + '}';
    }
}
