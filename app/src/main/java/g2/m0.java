package g2;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import d2.s;
import h2.c;
import java.io.IOException;

/* compiled from: ShapeTrimPathParser.java */
/* loaded from: classes.dex */
class m0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30504a = c.a.a("s", "e", "o", "nm", InneractiveMediationDefs.GENDER_MALE, "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.s a(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        String str = null;
        s.a aVar = null;
        c2.b bVar = null;
        c2.b bVar2 = null;
        c2.b bVar3 = null;
        boolean z10 = false;
        while (cVar.l()) {
            int T = cVar.T(f30504a);
            if (T == 0) {
                bVar = d.f(cVar, hVar, false);
            } else if (T == 1) {
                bVar2 = d.f(cVar, hVar, false);
            } else if (T == 2) {
                bVar3 = d.f(cVar, hVar, false);
            } else if (T == 3) {
                str = cVar.A();
            } else if (T == 4) {
                aVar = s.a.a(cVar.y());
            } else if (T != 5) {
                cVar.Z();
            } else {
                z10 = cVar.q();
            }
        }
        return new d2.s(str, aVar, bVar, bVar2, bVar3, z10);
    }
}
