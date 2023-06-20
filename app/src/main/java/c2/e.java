package c2;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatablePathValue.java */
/* loaded from: classes.dex */
public class e implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final List<j2.a<PointF>> f5291a;

    public e(List<j2.a<PointF>> list) {
        this.f5291a = list;
    }

    @Override // c2.m
    public z1.a<PointF, PointF> a() {
        if (this.f5291a.get(0).h()) {
            return new z1.k(this.f5291a);
        }
        return new z1.j(this.f5291a);
    }

    @Override // c2.m
    public List<j2.a<PointF>> b() {
        return this.f5291a;
    }

    @Override // c2.m
    public boolean c() {
        return this.f5291a.size() == 1 && this.f5291a.get(0).h();
    }
}
