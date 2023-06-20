package z1;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: PathKeyframe.java */
/* loaded from: classes.dex */
public class i extends j2.a<PointF> {

    /* renamed from: q  reason: collision with root package name */
    private Path f39921q;

    /* renamed from: r  reason: collision with root package name */
    private final j2.a<PointF> f39922r;

    public i(com.airbnb.lottie.h hVar, j2.a<PointF> aVar) {
        super(hVar, aVar.f32181b, aVar.f32182c, aVar.f32183d, aVar.f32184e, aVar.f32185f, aVar.f32186g, aVar.f32187h);
        this.f39922r = aVar;
        i();
    }

    public void i() {
        T t10;
        T t11;
        T t12 = this.f32182c;
        boolean z10 = (t12 == 0 || (t11 = this.f32181b) == 0 || !((PointF) t11).equals(((PointF) t12).x, ((PointF) t12).y)) ? false : true;
        T t13 = this.f32181b;
        if (t13 == 0 || (t10 = this.f32182c) == 0 || z10) {
            return;
        }
        j2.a<PointF> aVar = this.f39922r;
        this.f39921q = i2.h.d((PointF) t13, (PointF) t10, aVar.f32194o, aVar.f32195p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path j() {
        return this.f39921q;
    }
}
