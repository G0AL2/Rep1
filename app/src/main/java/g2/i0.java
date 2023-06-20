package g2;

import android.graphics.Path;
import h2.c;
import java.io.IOException;
import java.util.Collections;

/* compiled from: ShapeFillParser.java */
/* loaded from: classes.dex */
class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30484a = c.a.a("nm", l6.c.f33710i, "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.o a(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        c2.d dVar = null;
        String str = null;
        c2.a aVar = null;
        int i10 = 1;
        boolean z10 = false;
        boolean z11 = false;
        while (cVar.l()) {
            int T = cVar.T(f30484a);
            if (T == 0) {
                str = cVar.A();
            } else if (T == 1) {
                aVar = d.c(cVar, hVar);
            } else if (T == 2) {
                dVar = d.h(cVar, hVar);
            } else if (T == 3) {
                z10 = cVar.q();
            } else if (T == 4) {
                i10 = cVar.y();
            } else if (T != 5) {
                cVar.U();
                cVar.Z();
            } else {
                z11 = cVar.q();
            }
        }
        return new d2.o(str, z10, i10 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar == null ? new c2.d(Collections.singletonList(new j2.a(100))) : dVar, z11);
    }
}
