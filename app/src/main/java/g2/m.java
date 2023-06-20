package g2;

import h2.c;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FontCharacterParser.java */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30502a = c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30503b = c.a.a("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b2.d a(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.d();
        String str = null;
        String str2 = null;
        double d10 = 0.0d;
        double d11 = 0.0d;
        char c10 = 0;
        while (cVar.l()) {
            int T = cVar.T(f30502a);
            if (T == 0) {
                c10 = cVar.A().charAt(0);
            } else if (T == 1) {
                d10 = cVar.w();
            } else if (T == 2) {
                d11 = cVar.w();
            } else if (T == 3) {
                str = cVar.A();
            } else if (T == 4) {
                str2 = cVar.A();
            } else if (T != 5) {
                cVar.U();
                cVar.Z();
            } else {
                cVar.d();
                while (cVar.l()) {
                    if (cVar.T(f30503b) != 0) {
                        cVar.U();
                        cVar.Z();
                    } else {
                        cVar.b();
                        while (cVar.l()) {
                            arrayList.add((d2.p) h.a(cVar, hVar));
                        }
                        cVar.e();
                    }
                }
                cVar.h();
            }
        }
        cVar.h();
        return new b2.d(arrayList, c10, d10, d11, str, str2);
    }
}
