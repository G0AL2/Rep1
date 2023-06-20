package g2;

import h2.c;
import java.io.IOException;

/* compiled from: FontParser.java */
/* loaded from: classes.dex */
class n {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30505a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b2.c a(h2.c cVar) throws IOException {
        cVar.d();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f10 = 0.0f;
        while (cVar.l()) {
            int T = cVar.T(f30505a);
            if (T == 0) {
                str = cVar.A();
            } else if (T == 1) {
                str2 = cVar.A();
            } else if (T == 2) {
                str3 = cVar.A();
            } else if (T != 3) {
                cVar.U();
                cVar.Z();
            } else {
                f10 = (float) cVar.w();
            }
        }
        cVar.h();
        return new b2.c(str, str2, str3, f10);
    }
}
