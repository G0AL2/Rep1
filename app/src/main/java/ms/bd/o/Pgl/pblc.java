package ms.bd.o.Pgl;

import android.content.Context;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
final class pblc extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i10, long j10, String str, Object obj) throws Throwable {
        try {
            Context b10 = pgla.a().b();
            return b10.getPackageManager().getPackageInfo(b10.getPackageName(), 0).versionName;
        } catch (Throwable unused) {
            String str2 = (String) pblk.a(16777217, 0, 0L, "b2bafb", new byte[]{122, 57});
            return "";
        }
    }
}
