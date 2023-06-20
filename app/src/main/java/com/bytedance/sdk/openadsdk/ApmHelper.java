package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.apm.insight.MonitorCrash;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.core.j;
import com.bytedance.sdk.openadsdk.core.m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ApmHelper {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f10552a = false;

    /* renamed from: b  reason: collision with root package name */
    private static String f10553b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f10554c;

    private static void a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        m.f().a(a(str), "https://" + str2 + "/monitor/collect/c/session?version_code=" + BuildConfig.VERSION_CODE + "&device_platform=android&aid=10000001");
    }

    private static void b(String str, String str2) {
        a(str, str2);
    }

    public static void initApm(Context context, TTAdConfig tTAdConfig) {
        if (f10552a) {
            return;
        }
        f h10 = m.h();
        boolean B = h10.B();
        f10554c = B;
        if (!B || TextUtils.isEmpty(h10.r())) {
            return;
        }
        f10553b = tTAdConfig.getAppId();
        String[] strArr = {"com.bytedance.sdk", "com.com.bytedance.overseas.sdk", "com.pgl.sys.ces", "com.bykv.vk"};
        String a10 = j.a(context);
        String r10 = h10.r();
        try {
            MonitorCrash initSDK = MonitorCrash.initSDK(context, "10000001", 4506L, BuildConfig.VERSION_NAME, strArr);
            initSDK.config().setDeviceId(a10);
            initSDK.setReportUrl(r10);
            initSDK.addTags("host_appid", f10553b);
            initSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
            f10552a = true;
            b(a10, r10);
        } catch (Throwable unused) {
            l.d("ApmHelper", "init Apm fail or not include Apm module");
            f10552a = false;
        }
    }

    public static boolean isIsInit() {
        return f10552a;
    }

    public static void reportPvFromBackGround() {
        if (f10554c) {
            a(j.a(m.a()), m.h().r());
        }
    }

    private static JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", f10553b);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put("os", "Android");
            jSONObject2.put("os_version", Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put("device_brand", Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("channel", "release");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (JSONException e10) {
            l.e("ApmHelper", e10.getMessage());
        }
        return jSONObject;
    }
}
