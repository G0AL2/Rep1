package com.ironsource.sdk.a;

import android.util.Log;
import com.ironsource.sdk.a.f;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: b  reason: collision with root package name */
    private static d f27581b;

    /* renamed from: a  reason: collision with root package name */
    private com.ironsource.a.b f27582a;

    private d() {
    }

    private static d a() {
        if (f27581b == null) {
            f27581b = new d();
        }
        return f27581b;
    }

    public static void a(com.ironsource.a.a aVar, b bVar) {
        if (aVar != null) {
            try {
                a().f27582a = new com.ironsource.a.b(aVar, bVar);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(f.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(f.a aVar, Map<String, Object> map) {
        com.ironsource.a.b bVar = a().f27582a;
        if (bVar == null) {
            Log.d("sdk5Events", "logEvent failed eventsTracker doesn't exist");
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f27605b));
        }
        bVar.a(aVar.f27604a, map);
    }
}
