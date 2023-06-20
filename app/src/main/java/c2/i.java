package c2;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* loaded from: classes.dex */
public class i implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final b f5292a;

    /* renamed from: b  reason: collision with root package name */
    private final b f5293b;

    public i(b bVar, b bVar2) {
        this.f5292a = bVar;
        this.f5293b = bVar2;
    }

    @Override // c2.m
    public z1.a<PointF, PointF> a() {
        return new z1.n(this.f5292a.a(), this.f5293b.a());
    }

    @Override // c2.m
    public List<j2.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // c2.m
    public boolean c() {
        return this.f5292a.c() && this.f5293b.c();
    }
}
