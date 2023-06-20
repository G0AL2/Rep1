package g2;

import h2.c;
import java.io.IOException;

/* compiled from: ShapePathParser.java */
/* loaded from: classes.dex */
class k0 {

    /* renamed from: a  reason: collision with root package name */
    static c.a f30498a = c.a.a("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.q a(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        int i10 = 0;
        String str = null;
        c2.h hVar2 = null;
        boolean z10 = false;
        while (cVar.l()) {
            int T = cVar.T(f30498a);
            if (T == 0) {
                str = cVar.A();
            } else if (T == 1) {
                i10 = cVar.y();
            } else if (T == 2) {
                hVar2 = d.k(cVar, hVar);
            } else if (T != 3) {
                cVar.Z();
            } else {
                z10 = cVar.q();
            }
        }
        return new d2.q(str, i10, hVar2, z10);
    }
}
