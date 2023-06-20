package ce;

import android.content.Context;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import java.util.Map;
import ob.m;

/* compiled from: RCTConvertFirebase.java */
/* loaded from: classes3.dex */
public class a {
    public static Map<String, Object> a(ob.e eVar) {
        String p10 = eVar.p();
        m q10 = eVar.q();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("name", p10);
        hashMap3.put("automaticDataCollectionEnabled", Boolean.valueOf(eVar.w()));
        hashMap2.put("apiKey", q10.b());
        hashMap2.put("appId", q10.c());
        hashMap2.put("projectId", q10.g());
        hashMap2.put("databaseURL", q10.d());
        hashMap2.put("gaTrackingId", q10.e());
        hashMap2.put("messagingSenderId", q10.f());
        hashMap2.put("storageBucket", q10.h());
        hashMap.put("options", hashMap2);
        hashMap.put("appConfig", hashMap3);
        return hashMap;
    }

    public static WritableMap b(ob.e eVar) {
        return Arguments.makeNativeMap(a(eVar));
    }

    public static ob.e c(ReadableMap readableMap, ReadableMap readableMap2, Context context) {
        ob.e v10;
        m.b bVar = new m.b();
        String string = readableMap2.getString("name");
        bVar.b(readableMap.getString("apiKey"));
        bVar.c(readableMap.getString("appId"));
        bVar.g(readableMap.getString("projectId"));
        bVar.d(readableMap.getString("databaseURL"));
        if (readableMap.hasKey("gaTrackingId")) {
            bVar.e(readableMap.getString("gaTrackingId"));
        }
        bVar.h(readableMap.getString("storageBucket"));
        bVar.f(readableMap.getString("messagingSenderId"));
        if (string.equals("[DEFAULT]")) {
            v10 = ob.e.u(context, bVar.a());
        } else {
            v10 = ob.e.v(context, bVar.a(), string);
        }
        if (readableMap2.hasKey("automaticDataCollectionEnabled")) {
            v10.F(readableMap2.getBoolean("automaticDataCollectionEnabled"));
        }
        if (readableMap2.hasKey("automaticResourceManagement")) {
            v10.D(readableMap2.getBoolean("automaticResourceManagement"));
        }
        return v10;
    }

    public static WritableMap d(ReadableMap readableMap) {
        WritableMap createMap = Arguments.createMap();
        createMap.merge(readableMap);
        return createMap;
    }
}
