package p1;

import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: WakeLocks.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    private static final String f35472a;

    static {
        String i10 = androidx.work.l.i("WakeLocks");
        qe.k.e(i10, "tagWithPrefix(\"WakeLocks\")");
        f35472a = i10;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        v vVar = v.f35473a;
        synchronized (vVar) {
            linkedHashMap.putAll(vVar.a());
            ee.u uVar = ee.u.f29813a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            boolean z10 = true;
            if ((wakeLock == null || !wakeLock.isHeld()) ? false : false) {
                androidx.work.l e10 = androidx.work.l.e();
                String str2 = f35472a;
                e10.k(str2, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String str) {
        qe.k.f(context, "context");
        qe.k.f(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        qe.k.d(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        v vVar = v.f35473a;
        synchronized (vVar) {
            vVar.a().put(newWakeLock, str2);
        }
        qe.k.e(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
