package ms.bd.o.Pgl;

import android.content.Context;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
final class h extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i10, long j10, String str, Object obj) throws Throwable {
        Context b10 = pgla.a().b();
        return b10 != null ? b10.getPackageName() : "";
    }
}
