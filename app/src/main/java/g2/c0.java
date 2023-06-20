package g2;

import android.graphics.PointF;
import d2.j;
import h2.c;
import java.io.IOException;

/* compiled from: PolystarShapeParser.java */
/* loaded from: classes.dex */
class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30470a = c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.j a(h2.c cVar, com.airbnb.lottie.h hVar, int i10) throws IOException {
        boolean z10 = i10 == 3;
        String str = null;
        j.a aVar = null;
        c2.b bVar = null;
        c2.m<PointF, PointF> mVar = null;
        c2.b bVar2 = null;
        c2.b bVar3 = null;
        c2.b bVar4 = null;
        c2.b bVar5 = null;
        c2.b bVar6 = null;
        boolean z11 = false;
        while (cVar.l()) {
            switch (cVar.T(f30470a)) {
                case 0:
                    str = cVar.A();
                    break;
                case 1:
                    aVar = j.a.a(cVar.y());
                    break;
                case 2:
                    bVar = d.f(cVar, hVar, false);
                    break;
                case 3:
                    mVar = a.b(cVar, hVar);
                    break;
                case 4:
                    bVar2 = d.f(cVar, hVar, false);
                    break;
                case 5:
                    bVar4 = d.e(cVar, hVar);
                    break;
                case 6:
                    bVar6 = d.f(cVar, hVar, false);
                    break;
                case 7:
                    bVar3 = d.e(cVar, hVar);
                    break;
                case 8:
                    bVar5 = d.f(cVar, hVar, false);
                    break;
                case 9:
                    z11 = cVar.q();
                    break;
                case 10:
                    if (cVar.y() != 3) {
                        z10 = false;
                        break;
                    } else {
                        z10 = true;
                        break;
                    }
                default:
                    cVar.U();
                    cVar.Z();
                    break;
            }
        }
        return new d2.j(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z11, z10);
    }
}
