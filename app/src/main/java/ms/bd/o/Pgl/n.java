package ms.bd.o.Pgl;

import android.content.Context;
import android.content.pm.Signature;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
final class n extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i10, long j10, String str, Object obj) throws Throwable {
        Context b10 = pgla.a().b();
        Signature[] signatureArr = b10.getPackageManager().getPackageInfo(b10.getPackageName(), 64).signatures;
        if (signatureArr == null || signatureArr.length <= 0) {
            return null;
        }
        return signatureArr[0].toByteArray();
    }
}
