package ms.bd.o.Pgl;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.text.TextUtils;
import java.lang.reflect.Method;
import ms.bd.o.Pgl.pblb;

/* loaded from: classes3.dex */
final class b0 extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    protected Object a(int i10, long j10, String str, Object obj) throws Throwable {
        String str2;
        try {
            WifiInfo connectionInfo = ((WifiManager) pgla.a().b().getApplicationContext().getSystemService((String) pblk.a(16777217, 0, 0L, "da81a7", new byte[]{98, 106, 77, 76}))).getConnectionInfo();
            Method declaredMethod = connectionInfo.getClass().getDeclaredMethod(new String(pblz.a((String) pblk.a(16777217, 0, 0L, "6211fb", new byte[]{113, 103, 20, 16, 14, 33, 97, 74, 55, 49, 115, 97, 20, 17, 15, 33, 98, 65, 54, 52, 112, 99, 21, 22}))), new Class[0]);
            declaredMethod.setAccessible(true);
            str2 = Integer.toString(((Integer) declaredMethod.invoke(connectionInfo, new Object[0])).intValue());
        } catch (Throwable unused) {
            str2 = null;
        }
        return TextUtils.isEmpty(str2) ? (String) pblk.a(16777217, 0, 0L, "dd4a1c", new byte[]{37}) : str2.trim();
    }
}
