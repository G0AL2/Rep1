package ms.bd.o.Pgl;

import java.util.Arrays;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
final class z extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    protected Object a(int i10, long j10, String str, Object obj) throws Throwable {
        Throwable b10 = y0.a().b();
        return b10 != null ? Arrays.toString(b10.getStackTrace()) : "";
    }
}
