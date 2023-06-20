package g2;

import android.graphics.PointF;
import h2.c;
import java.io.IOException;

/* compiled from: RectangleShapeParser.java */
/* loaded from: classes.dex */
class d0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30471a = c.a.a("nm", "p", "s", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.k a(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        String str = null;
        c2.m<PointF, PointF> mVar = null;
        c2.f fVar = null;
        c2.b bVar = null;
        boolean z10 = false;
        while (cVar.l()) {
            int T = cVar.T(f30471a);
            if (T == 0) {
                str = cVar.A();
            } else if (T == 1) {
                mVar = a.b(cVar, hVar);
            } else if (T == 2) {
                fVar = d.i(cVar, hVar);
            } else if (T == 3) {
                bVar = d.e(cVar, hVar);
            } else if (T != 4) {
                cVar.Z();
            } else {
                z10 = cVar.q();
            }
        }
        return new d2.k(str, mVar, fVar, bVar, z10);
    }
}
