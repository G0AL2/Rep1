package g2;

import h2.c;
import java.io.IOException;

/* compiled from: RepeaterParser.java */
/* loaded from: classes.dex */
class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30474a = c.a.a("nm", l6.c.f33710i, "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.l a(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        String str = null;
        c2.b bVar = null;
        c2.b bVar2 = null;
        c2.l lVar = null;
        boolean z10 = false;
        while (cVar.l()) {
            int T = cVar.T(f30474a);
            if (T == 0) {
                str = cVar.A();
            } else if (T == 1) {
                bVar = d.f(cVar, hVar, false);
            } else if (T == 2) {
                bVar2 = d.f(cVar, hVar, false);
            } else if (T == 3) {
                lVar = c.g(cVar, hVar);
            } else if (T != 4) {
                cVar.Z();
            } else {
                z10 = cVar.q();
            }
        }
        return new d2.l(str, bVar, bVar2, lVar, z10);
    }
}
