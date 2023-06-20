package ms.bd.o.Pgl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.reflect.Method;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
final class w extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    protected Object a(int i10, long j10, String str, Object obj) throws Throwable {
        Context b10 = pgla.a().b();
        if (b10 != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) b10.getSystemService((String) pblk.a(16777217, 0, 0L, "6b685f", new byte[]{36, 111, 75, 66, 15, 114, 33, 74, 113, 97, 51, 121}));
                Method declaredMethod = connectivityManager.getClass().getDeclaredMethod((String) pblk.a(16777217, 0, 0L, "517402", new byte[]{35, 54, 80, 97, 12, 49, 63, 6, 99, 74, 33, 39, 83, 79, 29, 46, 31, 30, 96, 107}), new Class[0]);
                declaredMethod.setAccessible(true);
                NetworkInfo networkInfo = (NetworkInfo) declaredMethod.invoke(connectivityManager, new Object[0]);
                if (networkInfo != null) {
                    Method declaredMethod2 = networkInfo.getClass().getDeclaredMethod((String) pblk.a(16777217, 0, 0L, "e35ca4", new byte[]{125, 34, 103, 1, 95, 42, 106, 19, 102, 63, 113}), new Class[0]);
                    declaredMethod2.setAccessible(true);
                    return Boolean.valueOf(((Boolean) declaredMethod2.invoke(networkInfo, new Object[0])).booleanValue());
                }
            } catch (Throwable unused) {
            }
        }
        return Boolean.FALSE;
    }
}
