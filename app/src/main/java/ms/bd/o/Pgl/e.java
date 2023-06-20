package ms.bd.o.Pgl;

import android.content.Context;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
final class e extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i10, long j10, String str, Object obj) throws Throwable {
        int i11;
        Context b10 = pgla.a().b();
        try {
            i11 = b10.getPackageManager().getPackageInfo(b10.getPackageName(), 0).versionCode;
        } catch (Throwable unused) {
            i11 = -1;
        }
        return Integer.valueOf(i11);
    }
}
