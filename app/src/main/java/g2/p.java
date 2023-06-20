package g2;

import android.graphics.Path;
import h2.c;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradientFillParser.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30507a = c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30508b = c.a.a("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.e a(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        c2.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        d2.g gVar = null;
        c2.c cVar2 = null;
        c2.f fVar = null;
        c2.f fVar2 = null;
        boolean z10 = false;
        while (cVar.l()) {
            switch (cVar.T(f30507a)) {
                case 0:
                    str = cVar.A();
                    break;
                case 1:
                    int i10 = -1;
                    cVar.d();
                    while (cVar.l()) {
                        int T = cVar.T(f30508b);
                        if (T == 0) {
                            i10 = cVar.y();
                        } else if (T != 1) {
                            cVar.U();
                            cVar.Z();
                        } else {
                            cVar2 = d.g(cVar, hVar, i10);
                        }
                    }
                    cVar.h();
                    break;
                case 2:
                    dVar = d.h(cVar, hVar);
                    break;
                case 3:
                    gVar = cVar.y() == 1 ? d2.g.LINEAR : d2.g.RADIAL;
                    break;
                case 4:
                    fVar = d.i(cVar, hVar);
                    break;
                case 5:
                    fVar2 = d.i(cVar, hVar);
                    break;
                case 6:
                    fillType = cVar.y() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z10 = cVar.q();
                    break;
                default:
                    cVar.U();
                    cVar.Z();
                    break;
            }
        }
        return new d2.e(str, gVar, fillType, cVar2, dVar == null ? new c2.d(Collections.singletonList(new j2.a(100))) : dVar, fVar, fVar2, null, null, z10);
    }
}
