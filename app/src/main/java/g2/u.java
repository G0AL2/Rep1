package g2;

import h2.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: KeyframesParser.java */
/* loaded from: classes.dex */
class u {

    /* renamed from: a  reason: collision with root package name */
    static c.a f30519a = c.a.a("k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<j2.a<T>> a(h2.c cVar, com.airbnb.lottie.h hVar, float f10, n0<T> n0Var, boolean z10) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.L() == c.b.STRING) {
            hVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.d();
        while (cVar.l()) {
            if (cVar.T(f30519a) != 0) {
                cVar.Z();
            } else if (cVar.L() == c.b.BEGIN_ARRAY) {
                cVar.b();
                if (cVar.L() == c.b.NUMBER) {
                    arrayList.add(t.c(cVar, hVar, f10, n0Var, false, z10));
                } else {
                    while (cVar.l()) {
                        arrayList.add(t.c(cVar, hVar, f10, n0Var, true, z10));
                    }
                }
                cVar.e();
            } else {
                arrayList.add(t.c(cVar, hVar, f10, n0Var, false, z10));
            }
        }
        cVar.h();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends j2.a<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            j2.a<T> aVar = list.get(i11);
            i11++;
            j2.a<T> aVar2 = list.get(i11);
            aVar.f32187h = Float.valueOf(aVar2.f32186g);
            if (aVar.f32182c == null && (t10 = aVar2.f32181b) != null) {
                aVar.f32182c = t10;
                if (aVar instanceof z1.i) {
                    ((z1.i) aVar).i();
                }
            }
        }
        j2.a<T> aVar3 = list.get(i10);
        if ((aVar3.f32181b == null || aVar3.f32182c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
