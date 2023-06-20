package d2;

import android.graphics.PointF;
import com.airbnb.lottie.d0;

/* compiled from: CircleShape.java */
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f28928a;

    /* renamed from: b  reason: collision with root package name */
    private final c2.m<PointF, PointF> f28929b;

    /* renamed from: c  reason: collision with root package name */
    private final c2.f f28930c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f28931d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f28932e;

    public b(String str, c2.m<PointF, PointF> mVar, c2.f fVar, boolean z10, boolean z11) {
        this.f28928a = str;
        this.f28929b = mVar;
        this.f28930c = fVar;
        this.f28931d = z10;
        this.f28932e = z11;
    }

    @Override // d2.c
    public y1.c a(d0 d0Var, e2.b bVar) {
        return new y1.f(d0Var, bVar, this);
    }

    public String b() {
        return this.f28928a;
    }

    public c2.m<PointF, PointF> c() {
        return this.f28929b;
    }

    public c2.f d() {
        return this.f28930c;
    }

    public boolean e() {
        return this.f28932e;
    }

    public boolean f() {
        return this.f28931d;
    }
}
