package com.iab.omid.library.ironsrc.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.iab.omid.library.ironsrc.walking.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private static WindowManager f24304b;

    /* renamed from: c  reason: collision with root package name */
    private static String[] f24305c = {"x", "y", "width", "height"};

    /* renamed from: a  reason: collision with root package name */
    static float f24303a = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final float f24306a;

        /* renamed from: b  reason: collision with root package name */
        final float f24307b;

        a(float f10, float f11) {
            this.f24306a = f10;
            this.f24307b = f11;
        }
    }

    static float a(int i10) {
        return i10 / f24303a;
    }

    public static JSONObject a(int i10, int i11, int i12, int i13) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i10));
            jSONObject.put("y", a(i11));
            jSONObject.put("width", a(i12));
            jSONObject.put("height", a(i13));
        } catch (JSONException e10) {
            c.a("Error with creating viewStateObject", e10);
        }
        return jSONObject;
    }

    public static void a(Context context) {
        if (context != null) {
            f24303a = context.getResources().getDisplayMetrics().density;
            f24304b = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject) {
        a b10 = b(jSONObject);
        try {
            jSONObject.put("width", b10.f24306a);
            jSONObject.put("height", b10.f24307b);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public static void a(JSONObject jSONObject, a.C0325a c0325a) {
        com.iab.omid.library.ironsrc.b.c a10 = c0325a.a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c0325a.b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a10.b());
            jSONObject.put("friendlyObstructionPurpose", a10.c());
            jSONObject.put("friendlyObstructionReason", a10.d());
        } catch (JSONException e10) {
            c.a("Error with setting friendly obstruction", e10);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e10) {
            c.a("Error with setting ad session id", e10);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e10) {
            c.a("JSONException during JSONObject.put for name [" + str + "]", e10);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    private static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    private static a b(JSONObject jSONObject) {
        float f10;
        float f11 = 0.0f;
        if (Build.VERSION.SDK_INT >= 17) {
            if (f24304b != null) {
                Point point = new Point(0, 0);
                f24304b.getDefaultDisplay().getRealSize(point);
                f11 = a(point.x);
                f10 = a(point.y);
            }
            f10 = 0.0f;
        } else {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f12 = 0.0f;
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f11 = Math.max(f11, (float) (optDouble + optDouble3));
                        f12 = Math.max(f12, (float) (optDouble2 + optDouble4));
                    }
                }
                f10 = f12;
            }
            f10 = 0.0f;
        }
        return new a(f11, f10);
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e10) {
            c.a("Error with setting not visible reason", e10);
        }
    }

    public static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && c(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && f(jSONObject, jSONObject2);
    }

    private static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f24305c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    private static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    private static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (a(optJSONArray, optJSONArray2)) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                if (!optJSONArray.optString(i10, "").equals(optJSONArray2.optString(i10, ""))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (a(optJSONArray, optJSONArray2)) {
            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                if (!b(optJSONArray.optJSONObject(i10), optJSONArray2.optJSONObject(i10))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
