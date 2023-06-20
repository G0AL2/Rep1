package d2;

import com.airbnb.lottie.d0;

/* compiled from: RoundedCorners.java */
/* loaded from: classes.dex */
public class m implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f29002a;

    /* renamed from: b  reason: collision with root package name */
    private final c2.m<Float, Float> f29003b;

    public m(String str, c2.m<Float, Float> mVar) {
        this.f29002a = str;
        this.f29003b = mVar;
    }

    @Override // d2.c
    public y1.c a(d0 d0Var, e2.b bVar) {
        return new y1.q(d0Var, bVar, this);
    }

    public c2.m<Float, Float> b() {
        return this.f29003b;
    }

    public String c() {
        return this.f29002a;
    }
}
