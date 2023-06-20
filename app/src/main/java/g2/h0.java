package g2;

import android.graphics.PointF;
import h2.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: ShapeDataParser.java */
/* loaded from: classes.dex */
public class h0 implements n0<d2.n> {

    /* renamed from: a  reason: collision with root package name */
    public static final h0 f30480a = new h0();

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30481b = c.a.a(l6.c.f33710i, "v", "i", "o");

    private h0() {
    }

    @Override // g2.n0
    /* renamed from: b */
    public d2.n a(h2.c cVar, float f10) throws IOException {
        if (cVar.L() == c.b.BEGIN_ARRAY) {
            cVar.b();
        }
        cVar.d();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z10 = false;
        while (cVar.l()) {
            int T = cVar.T(f30481b);
            if (T == 0) {
                z10 = cVar.q();
            } else if (T == 1) {
                list = s.f(cVar, f10);
            } else if (T == 2) {
                list2 = s.f(cVar, f10);
            } else if (T != 3) {
                cVar.U();
                cVar.Z();
            } else {
                list3 = s.f(cVar, f10);
            }
        }
        cVar.h();
        if (cVar.L() == c.b.END_ARRAY) {
            cVar.e();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new d2.n(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 1; i10 < size; i10++) {
                PointF pointF2 = list.get(i10);
                int i11 = i10 - 1;
                arrayList.add(new b2.a(i2.g.a(list.get(i11), list3.get(i11)), i2.g.a(pointF2, list2.get(i10)), pointF2));
            }
            if (z10) {
                PointF pointF3 = list.get(0);
                int i12 = size - 1;
                arrayList.add(new b2.a(i2.g.a(list.get(i12), list3.get(i12)), i2.g.a(pointF3, list2.get(0)), pointF3));
            }
            return new d2.n(pointF, z10, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
