package com.bytedance.sdk.openadsdk.core.e;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PlayableModel.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    private boolean f12208a;

    /* renamed from: b  reason: collision with root package name */
    private int f12209b;

    /* renamed from: c  reason: collision with root package name */
    private String f12210c;

    /* renamed from: d  reason: collision with root package name */
    private String f12211d;

    /* renamed from: e  reason: collision with root package name */
    private int f12212e;

    public p(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("playable");
        if (optJSONObject != null) {
            this.f12211d = optJSONObject.optString("playable_url", "");
            this.f12212e = optJSONObject.optInt("playable_orientation", 0);
        }
        this.f12208a = jSONObject.optBoolean("is_playable");
        this.f12209b = jSONObject.optInt("playable_type", 0);
        this.f12210c = jSONObject.optString("playable_style");
    }

    public static String b(n nVar) {
        p k10 = k(nVar);
        if (k10 == null) {
            return null;
        }
        return k10.f12210c;
    }

    public static String c(n nVar) {
        p k10 = k(nVar);
        if (k10 == null) {
            return null;
        }
        return k10.f12211d;
    }

    public static String d(n nVar) {
        if (nVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(c(nVar))) {
            return c(nVar);
        }
        if (nVar.J() != null) {
            return nVar.J().A();
        }
        return null;
    }

    public static boolean e(n nVar) {
        return false;
    }

    public static boolean f(n nVar) {
        return ((nVar == null || nVar.J() == null) ? 0 : nVar.J().I()) != 1;
    }

    public static boolean g(n nVar) {
        return (nVar == null || nVar.J() == null || nVar.J().I() != 1) ? false : true;
    }

    public static int h(n nVar) {
        p k10 = k(nVar);
        if (k10 == null) {
            return 0;
        }
        return k10.f12212e;
    }

    public static boolean i(n nVar) {
        return a(nVar) && l(nVar) == 1;
    }

    public static boolean j(n nVar) {
        return a(nVar) && l(nVar) == 0;
    }

    private static p k(n nVar) {
        if (nVar == null) {
            return null;
        }
        return nVar.e();
    }

    private static int l(n nVar) {
        p k10 = k(nVar);
        if (k10 == null) {
            return 0;
        }
        return k10.f12209b;
    }

    public void a(JSONObject jSONObject) {
        try {
            jSONObject.put("is_playable", this.f12208a);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.f12211d)) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("playable_url", this.f12211d);
                jSONObject2.put("playable_orientation", this.f12212e);
                jSONObject.put("playable", jSONObject2);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        try {
            jSONObject.put("playable_type", this.f12209b);
        } catch (JSONException e12) {
            e12.printStackTrace();
        }
        try {
            jSONObject.put("playable_style", this.f12210c);
        } catch (JSONException e13) {
            e13.printStackTrace();
        }
    }

    public static boolean a(n nVar) {
        p k10 = k(nVar);
        return (k10 == null || !k10.f12208a || TextUtils.isEmpty(d(nVar))) ? false : true;
    }
}
