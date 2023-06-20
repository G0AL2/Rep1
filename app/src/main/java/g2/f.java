package g2;

import android.graphics.PointF;
import h2.c;
import java.io.IOException;

/* compiled from: CircleShapeParser.java */
/* loaded from: classes.dex */
class f {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30475a = c.a.a("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.b a(h2.c cVar, com.airbnb.lottie.h hVar, int i10) throws IOException {
        boolean z10 = i10 == 3;
        String str = null;
        c2.m<PointF, PointF> mVar = null;
        c2.f fVar = null;
        boolean z11 = false;
        while (cVar.l()) {
            int T = cVar.T(f30475a);
            if (T == 0) {
                str = cVar.A();
            } else if (T == 1) {
                mVar = a.b(cVar, hVar);
            } else if (T == 2) {
                fVar = d.i(cVar, hVar);
            } else if (T == 3) {
                z11 = cVar.q();
            } else if (T != 4) {
                cVar.U();
                cVar.Z();
            } else {
                z10 = cVar.y() == 3;
            }
        }
        return new d2.b(str, mVar, fVar, z10, z11);
    }
}
