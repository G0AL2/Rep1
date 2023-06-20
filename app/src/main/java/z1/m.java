package z1;

import android.graphics.Path;
import java.util.List;
import y1.s;

/* compiled from: ShapeKeyframeAnimation.java */
/* loaded from: classes.dex */
public class m extends a<d2.n, Path> {

    /* renamed from: i  reason: collision with root package name */
    private final d2.n f39929i;

    /* renamed from: j  reason: collision with root package name */
    private final Path f39930j;

    /* renamed from: k  reason: collision with root package name */
    private List<s> f39931k;

    public m(List<j2.a<d2.n>> list) {
        super(list);
        this.f39929i = new d2.n();
        this.f39930j = new Path();
    }

    @Override // z1.a
    /* renamed from: p */
    public Path i(j2.a<d2.n> aVar, float f10) {
        this.f39929i.c(aVar.f32181b, aVar.f32182c, f10);
        d2.n nVar = this.f39929i;
        List<s> list = this.f39931k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                nVar = this.f39931k.get(size).c(nVar);
            }
        }
        i2.g.h(nVar, this.f39930j);
        return this.f39930j;
    }

    public void q(List<s> list) {
        this.f39931k = list;
    }
}
