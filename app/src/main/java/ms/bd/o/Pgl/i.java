package ms.bd.o.Pgl;

import java.util.Objects;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
final class i extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i10, long j10, String str, Object obj) throws Throwable {
        int i11;
        w0 a10 = w0.a(pgla.a().b());
        Objects.requireNonNull(a10);
        try {
            synchronized (a10) {
                i11 = a10.c();
            }
        } catch (Exception unused) {
            i11 = -1;
        }
        return "" + i11;
    }
}
