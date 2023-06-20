package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SecSdkHelperUtil.java */
/* loaded from: classes.dex */
public class s {
    public static void a(String str) {
        if (TextUtils.isEmpty(str) || !m.h().C()) {
            return;
        }
        r.a().a(str);
    }

    public static void b() {
        if (m.h().C()) {
            r.a().b("AdShow");
        }
    }

    public static String a() {
        if (m.h().C()) {
            return r.a().b();
        }
        return null;
    }

    public static Map<String, String> a(String str, String str2) {
        if (m.h().C()) {
            return r.a().a(str, str2 != null ? str2.getBytes() : new byte[0]);
        }
        return new HashMap();
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && m.h().C()) {
            try {
                jSONObject.put("sec_did", r.a().c());
                String a10 = com.bytedance.sdk.component.utils.e.a(jSONObject.toString());
                Map<String, String> a11 = r.a().a("https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250", a10 != null ? a10.getBytes() : new byte[0]);
                if (a11 == null || a11.size() <= 0) {
                    return;
                }
                for (String str : a11.keySet()) {
                    jSONObject.put(str, a11.get(str));
                }
                jSONObject.put(ImagesContract.URL, "https://api16-access-sg.pangle.io/api/ad/union/sdk/get_ads/?aid=1371&device_platform=android&version_code=4250");
                jSONObject.put("pangle_m", a10);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }
}
