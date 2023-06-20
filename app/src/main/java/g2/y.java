package g2;

import d2.i;
import h2.c;
import java.io.IOException;

/* compiled from: MergePathsParser.java */
/* loaded from: classes.dex */
class y {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30528a = c.a.a("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.i a(h2.c cVar) throws IOException {
        String str = null;
        i.a aVar = null;
        boolean z10 = false;
        while (cVar.l()) {
            int T = cVar.T(f30528a);
            if (T == 0) {
                str = cVar.A();
            } else if (T == 1) {
                aVar = i.a.a(cVar.y());
            } else if (T != 2) {
                cVar.U();
                cVar.Z();
            } else {
                z10 = cVar.q();
            }
        }
        return new d2.i(str, aVar, z10);
    }
}
