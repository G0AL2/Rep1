package g2;

import h2.c;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapeGroupParser.java */
/* loaded from: classes.dex */
public class j0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30490a = c.a.a("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.p a(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z10 = false;
        while (cVar.l()) {
            int T = cVar.T(f30490a);
            if (T == 0) {
                str = cVar.A();
            } else if (T == 1) {
                z10 = cVar.q();
            } else if (T != 2) {
                cVar.Z();
            } else {
                cVar.b();
                while (cVar.l()) {
                    d2.c a10 = h.a(cVar, hVar);
                    if (a10 != null) {
                        arrayList.add(a10);
                    }
                }
                cVar.e();
            }
        }
        return new d2.p(str, arrayList, z10);
    }
}
