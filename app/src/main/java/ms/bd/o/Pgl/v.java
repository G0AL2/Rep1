package ms.bd.o.Pgl;

import android.content.Context;
import android.content.Intent;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
final class v extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i10, long j10, String str, Object obj) throws Throwable {
        Context b10 = pgla.a().b();
        String[] strArr = (String[]) obj;
        if (b10 == null || str == null || strArr == null || strArr.length % 2 != 0) {
            return null;
        }
        Intent intent = new Intent(str);
        intent.setPackage(b10.getPackageName());
        for (int i11 = 0; i11 < strArr.length; i11 += 2) {
            intent.putExtra(strArr[i11], strArr[i11 + 1]);
        }
        b10.sendBroadcast(intent);
        return null;
    }
}
