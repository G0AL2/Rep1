package com.ironsource.mediationsdk.c;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.e;
import com.ironsource.mediationsdk.utils.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private String f27017a;

    /* renamed from: b  reason: collision with root package name */
    private String f27018b;

    /* renamed from: c  reason: collision with root package name */
    private e f27019c;

    public b(String str, String str2, e eVar) {
        this.f27017a = str;
        this.f27018b = str2;
        this.f27019c = eVar;
    }

    private static Object a(Object obj) {
        return obj instanceof JSONObject ? a((JSONObject) obj) : obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    private static List<Object> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(a(jSONArray.get(i10)));
            } catch (JSONException e10) {
                IronLog.INTERNAL.error(String.format("Could not put value into list: %s", e10.getMessage()));
            }
        }
        return arrayList;
    }

    public static Map<String, Object> a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap(jSONObject.length());
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, a(jSONObject.get(next)));
            } catch (JSONException e10) {
                IronLog.INTERNAL.error(String.format("Could not put value in map: %s, %s", next, e10.getMessage()));
            }
        }
        return hashMap;
    }

    public static JSONObject a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), b(entry.getValue()));
                } catch (JSONException unused) {
                    IronLog.INTERNAL.error(String.format("Could not map entry to object: %s, %s", entry.getKey(), entry.getValue()));
                }
            }
        }
        return jSONObject;
    }

    public static JSONObject a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        for (int i10 = 0; i10 < 2; i10++) {
            JSONObject jSONObject2 = jSONObjectArr[i10];
            if (jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    try {
                        jSONObject.put(next, jSONObject2.get(next));
                    } catch (JSONException e10) {
                        IronLog.INTERNAL.error(e10.getMessage());
                    }
                }
            }
        }
        return jSONObject;
    }

    public static boolean a(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    private static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        if (obj instanceof Collection) {
            return new JSONArray((Collection) obj);
        }
        if (obj.getClass().isArray()) {
            return new JSONArray((Collection) Arrays.asList(obj));
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
            return obj;
        }
        if ((obj instanceof Enum) || obj.getClass().getPackage().getName().startsWith("java.")) {
            return obj.toString();
        }
        return null;
    }

    public String a() {
        return this.f27017a;
    }

    public String b() {
        return this.f27018b;
    }

    public boolean c() {
        return this.f27019c.f27231g.f27412e > 0;
    }

    public long d() {
        return this.f27019c.f27231g.f27416i;
    }

    public int e() {
        return this.f27019c.f27230f;
    }

    public long f() {
        return this.f27019c.f27226b;
    }

    public int g() {
        return this.f27019c.f27229e;
    }

    public c h() {
        return this.f27019c.f27231g;
    }
}
