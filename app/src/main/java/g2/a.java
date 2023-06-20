package g2;

import android.graphics.PointF;
import h2.c;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: AnimatablePathValueParser.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30463a = c.a.a("k", "x", "y");

    public static c2.e a(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.L() == c.b.BEGIN_ARRAY) {
            cVar.b();
            while (cVar.l()) {
                arrayList.add(z.a(cVar, hVar));
            }
            cVar.e();
            u.b(arrayList);
        } else {
            arrayList.add(new j2.a(s.e(cVar, i2.h.e())));
        }
        return new c2.e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c2.m<PointF, PointF> b(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        cVar.d();
        c2.e eVar = null;
        c2.b bVar = null;
        c2.b bVar2 = null;
        boolean z10 = false;
        while (cVar.L() != c.b.END_OBJECT) {
            int T = cVar.T(f30463a);
            if (T == 0) {
                eVar = a(cVar, hVar);
            } else if (T != 1) {
                if (T != 2) {
                    cVar.U();
                    cVar.Z();
                } else if (cVar.L() == c.b.STRING) {
                    cVar.Z();
                    z10 = true;
                } else {
                    bVar2 = d.e(cVar, hVar);
                }
            } else if (cVar.L() == c.b.STRING) {
                cVar.Z();
                z10 = true;
            } else {
                bVar = d.e(cVar, hVar);
            }
        }
        cVar.h();
        if (z10) {
            hVar.a("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new c2.i(bVar, bVar2);
    }
}
