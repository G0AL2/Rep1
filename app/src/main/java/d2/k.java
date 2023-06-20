package d2;

import android.graphics.PointF;
import com.airbnb.lottie.d0;

/* compiled from: RectangleShape.java */
/* loaded from: classes.dex */
public class k implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f28992a;

    /* renamed from: b  reason: collision with root package name */
    private final c2.m<PointF, PointF> f28993b;

    /* renamed from: c  reason: collision with root package name */
    private final c2.m<PointF, PointF> f28994c;

    /* renamed from: d  reason: collision with root package name */
    private final c2.b f28995d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f28996e;

    public k(String str, c2.m<PointF, PointF> mVar, c2.m<PointF, PointF> mVar2, c2.b bVar, boolean z10) {
        this.f28992a = str;
        this.f28993b = mVar;
        this.f28994c = mVar2;
        this.f28995d = bVar;
        this.f28996e = z10;
    }

    @Override // d2.c
    public y1.c a(d0 d0Var, e2.b bVar) {
        return new y1.o(d0Var, bVar, this);
    }

    public c2.b b() {
        return this.f28995d;
    }

    public String c() {
        return this.f28992a;
    }

    public c2.m<PointF, PointF> d() {
        return this.f28993b;
    }

    public c2.m<PointF, PointF> e() {
        return this.f28994c;
    }

    public boolean f() {
        return this.f28996e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f28993b + ", size=" + this.f28994c + '}';
    }
}
