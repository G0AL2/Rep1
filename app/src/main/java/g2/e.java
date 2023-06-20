package g2;

import h2.c;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BlurEffectParser.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30472a = c.a.a("ef");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30473b = c.a.a("ty", "v");

    private static d2.a a(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        cVar.d();
        d2.a aVar = null;
        while (true) {
            boolean z10 = false;
            while (cVar.l()) {
                int T = cVar.T(f30473b);
                if (T != 0) {
                    if (T != 1) {
                        cVar.U();
                        cVar.Z();
                    } else if (z10) {
                        aVar = new d2.a(d.e(cVar, hVar));
                    } else {
                        cVar.Z();
                    }
                } else if (cVar.y() == 0) {
                    z10 = true;
                }
            }
            cVar.h();
            return aVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.a b(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        d2.a aVar = null;
        while (cVar.l()) {
            if (cVar.T(f30472a) != 0) {
                cVar.U();
                cVar.Z();
            } else {
                cVar.b();
                while (cVar.l()) {
                    d2.a a10 = a(cVar, hVar);
                    if (a10 != null) {
                        aVar = a10;
                    }
                }
                cVar.e();
            }
        }
        return aVar;
    }
}
