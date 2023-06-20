package g2;

import h2.c;
import java.io.IOException;

/* compiled from: RoundedCornersParser.java */
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30476a = c.a.a("nm", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.m a(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        boolean z10 = false;
        String str = null;
        c2.b bVar = null;
        while (cVar.l()) {
            int T = cVar.T(f30476a);
            if (T == 0) {
                str = cVar.A();
            } else if (T == 1) {
                bVar = d.f(cVar, hVar, true);
            } else if (T != 2) {
                cVar.Z();
            } else {
                z10 = cVar.q();
            }
        }
        if (z10) {
            return null;
        }
        return new d2.m(str, bVar);
    }
}
