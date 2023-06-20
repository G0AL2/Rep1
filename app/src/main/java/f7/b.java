package f7;

import java.util.List;
import r5.h;
import r5.l;

/* compiled from: MultiSourceHelper.java */
/* loaded from: classes.dex */
public class b {

    /* compiled from: MultiSourceHelper.java */
    /* renamed from: f7.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0381b {

        /* renamed from: a  reason: collision with root package name */
        private final f7.a f30100a;

        /* renamed from: b  reason: collision with root package name */
        private final f7.a f30101b;

        public f7.a a() {
            return this.f30100a;
        }

        public f7.a b() {
            return this.f30101b;
        }

        private C0381b(f7.a aVar, f7.a aVar2) {
            this.f30100a = aVar;
            this.f30101b = aVar2;
        }
    }

    public static C0381b a(int i10, int i11, List<f7.a> list) {
        return b(i10, i11, list, 1.0d);
    }

    public static C0381b b(int i10, int i11, List<f7.a> list, double d10) {
        if (list.isEmpty()) {
            return new C0381b(null, null);
        }
        if (list.size() == 1) {
            return new C0381b(list.get(0), null);
        }
        if (i10 > 0 && i11 > 0) {
            h j10 = l.l().j();
            double d11 = i10 * i11 * d10;
            double d12 = Double.MAX_VALUE;
            double d13 = Double.MAX_VALUE;
            f7.a aVar = null;
            f7.a aVar2 = null;
            for (f7.a aVar3 : list) {
                double abs = Math.abs(1.0d - (aVar3.c() / d11));
                if (abs < d12) {
                    aVar2 = aVar3;
                    d12 = abs;
                }
                if (abs < d13 && (j10.l(aVar3.e()) || j10.m(aVar3.e()))) {
                    aVar = aVar3;
                    d13 = abs;
                }
            }
            if (aVar != null && aVar2 != null && aVar.d().equals(aVar2.d())) {
                aVar = null;
            }
            return new C0381b(aVar2, aVar);
        }
        return new C0381b(null, null);
    }
}
