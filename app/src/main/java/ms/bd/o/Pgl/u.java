package ms.bd.o.Pgl;

import android.content.Context;
import android.content.SharedPreferences;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
final class u extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i10, long j10, String str, Object obj) throws Throwable {
        Context b10 = pgla.a().b();
        String[] split = str.split((String) pblk.a(16777217, 0, 0L, "cea70a", new byte[]{78, 123}));
        String str2 = split[0];
        String str3 = split[1];
        SharedPreferences.Editor edit = b10.getSharedPreferences(str2, 0).edit();
        edit.putString(str3, (String) obj);
        edit.commit();
        return null;
    }
}
