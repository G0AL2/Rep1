package ms.bd.o.Pgl;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Method;
import java.util.List;
import ms.bd.o.Pgl.pblb;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class d0 extends pblb.pgla {
    @Override // ms.bd.o.Pgl.pblb.pgla
    public Object a(int i10, long j10, String str, Object obj) throws Throwable {
        Context b10 = pgla.a().b();
        JSONArray jSONArray = new JSONArray();
        AccessibilityManager accessibilityManager = (AccessibilityManager) b10.getSystemService((String) pblk.a(16777217, 0, 0L, "4b6f46", new byte[]{36, 99, 70, 23, 24, 50, 62, 65, 110, 58, 44, 116, 92}));
        if (accessibilityManager != null) {
            List<AccessibilityServiceInfo> list = null;
            try {
                Method declaredMethod = accessibilityManager.getClass().getDeclaredMethod((String) pblk.a(16777217, 0, 0L, "e58dd2", new byte[]{115, 50, 95, 57, 85, 54, 114, 21, 101, 56, 113, 51, 106, 19, 88, 32, 117, 7, 96, 54, 125, 59, 66, 4, 66, 22, 99, 6, Byte.MAX_VALUE, 61, 119, 50, 103, 25, 72, 49}), new Class[0]);
                if (declaredMethod != null) {
                    list = (List) declaredMethod.invoke(accessibilityManager, new Object[0]);
                }
            } catch (Throwable unused) {
            }
            if (list == null || list.size() == 0) {
                return jSONArray.toString();
            }
            for (AccessibilityServiceInfo accessibilityServiceInfo : list) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put((String) pblk.a(16777217, 0, 0L, "a9fdc8", new byte[]{117, 45}), accessibilityServiceInfo.eventTypes);
                    jSONObject.put((String) pblk.a(16777217, 0, 0L, "ac9eb9", new byte[]{121, 101}), accessibilityServiceInfo.getId());
                    jSONArray.put(jSONObject);
                } catch (Throwable unused2) {
                }
            }
        }
        return jSONArray.toString();
    }
}
