package z1;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MaskKeyframeAnimation.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<d2.n, Path>> f39918a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a<Integer, Integer>> f39919b;

    /* renamed from: c  reason: collision with root package name */
    private final List<d2.h> f39920c;

    public h(List<d2.h> list) {
        this.f39920c = list;
        this.f39918a = new ArrayList(list.size());
        this.f39919b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f39918a.add(list.get(i10).b().a());
            this.f39919b.add(list.get(i10).c().a());
        }
    }

    public List<a<d2.n, Path>> a() {
        return this.f39918a;
    }

    public List<d2.h> b() {
        return this.f39920c;
    }

    public List<a<Integer, Integer>> c() {
        return this.f39919b;
    }
}
