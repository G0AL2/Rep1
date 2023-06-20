package g2;

import h2.c;
import java.io.IOException;

/* compiled from: AnimatableTextPropertiesParser.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30465a = c.a.a("a");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30466b = c.a.a("fc", "sc", "sw", "t");

    public static c2.k a(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        cVar.d();
        c2.k kVar = null;
        while (cVar.l()) {
            if (cVar.T(f30465a) != 0) {
                cVar.U();
                cVar.Z();
            } else {
                kVar = b(cVar, hVar);
            }
        }
        cVar.h();
        return kVar == null ? new c2.k(null, null, null, null) : kVar;
    }

    private static c2.k b(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        cVar.d();
        c2.a aVar = null;
        c2.a aVar2 = null;
        c2.b bVar = null;
        c2.b bVar2 = null;
        while (cVar.l()) {
            int T = cVar.T(f30466b);
            if (T == 0) {
                aVar = d.c(cVar, hVar);
            } else if (T == 1) {
                aVar2 = d.c(cVar, hVar);
            } else if (T == 2) {
                bVar = d.e(cVar, hVar);
            } else if (T != 3) {
                cVar.U();
                cVar.Z();
            } else {
                bVar2 = d.e(cVar, hVar);
            }
        }
        cVar.h();
        return new c2.k(aVar, aVar2, bVar, bVar2);
    }
}
