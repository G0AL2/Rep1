package com.ironsource.sdk.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.environment.h;
import com.ironsource.environment.k;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f28231a = "b";

    public static JSONObject a(Context context) {
        SDKUtils.loadGoogleAdvertiserInfo(context);
        String advertiserId = SDKUtils.getAdvertiserId();
        Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(advertiserId)) {
            try {
                Logger.i(f28231a, "add AID and LAT");
                jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            b(jSONObject, "displaySizeWidth", String.valueOf(h.k()));
            b(jSONObject, "displaySizeHeight", String.valueOf(h.l()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            String a10 = com.ironsource.d.a.a(context);
            if (!TextUtils.isEmpty(a10) && !a10.equals("none")) {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a10));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject.put(SDKUtils.encodeString("hasVPN"), com.ironsource.d.a.c(context));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(h.p())));
        } catch (Exception e12) {
            e12.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("batteryLevel"), h.v(context));
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        try {
            jSONObject.put(SDKUtils.encodeString("lpm"), h.w(context));
        } catch (Exception e14) {
            e14.printStackTrace();
        }
        try {
            com.ironsource.sdk.utils.a.a(context);
            jSONObject.put(SDKUtils.encodeString("deviceVolume"), com.ironsource.sdk.utils.a.b(context));
        } catch (Exception e15) {
            e15.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("sdCardAvailable")) {
                jSONObject.put(SDKUtils.encodeString("sdCardAvailable"), h.d());
            }
        } catch (Exception e16) {
            e16.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("isCharging")) {
                jSONObject.put(SDKUtils.encodeString("isCharging"), h.e(context));
            }
        } catch (Exception e17) {
            e17.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("chargingType")) {
                jSONObject.put(SDKUtils.encodeString("chargingType"), h.f(context));
            }
        } catch (Exception e18) {
            e18.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("airplaneMode")) {
                jSONObject.put(SDKUtils.encodeString("airplaneMode"), h.g(context));
            }
        } catch (Exception e19) {
            e19.printStackTrace();
        }
        try {
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("stayOnWhenPluggedIn")) {
                jSONObject.put(SDKUtils.encodeString("stayOnWhenPluggedIn"), h.h(context));
            }
        } catch (Exception e20) {
            e20.printStackTrace();
        }
        return jSONObject;
    }

    private static void b(JSONObject jSONObject, String str, String str2) {
        try {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            jSONObject.put(str, SDKUtils.encodeString(str2));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static JSONObject c(Context context) {
        com.ironsource.sdk.utils.a a10 = com.ironsource.sdk.utils.a.a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            String str = a10.f28250a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a10.f28251b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
            }
            String str3 = a10.f28252c;
            if (str3 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
            }
            String str4 = a10.f28253d;
            if (str4 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
            }
            String str5 = a10.f28253d;
            if (str5 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
            }
            jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), String.valueOf(a10.f28254e));
            jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(SDKUtils.getSDKVersion()));
            String str6 = a10.f28255f;
            if (str6 != null && str6.length() > 0) {
                jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a10.f28255f));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
            }
            if (SDKUtils.getControllerConfigAsJSONObject().optBoolean("totalDeviceRAM")) {
                jSONObject.put(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(h.d(context))));
            }
            String packageName = context.getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
            }
            String valueOf = String.valueOf(h.o());
            if (!TextUtils.isEmpty(valueOf)) {
                jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf));
            }
            String valueOf2 = String.valueOf(h.j());
            if (!TextUtils.isEmpty(valueOf2)) {
                jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), k.a(context));
            jSONObject.put("mcc", a.AnonymousClass1.c(context));
            jSONObject.put("mnc", a.AnonymousClass1.d(context));
            jSONObject.put(SDKUtils.encodeString("phoneType"), a.AnonymousClass1.f(context));
            jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(a.AnonymousClass1.e(context)));
            jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), com.ironsource.environment.c.b(context));
            jSONObject.put(SDKUtils.encodeString("firstInstallTime"), com.ironsource.environment.c.a(context));
            jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(com.ironsource.environment.c.c(context)));
            String d10 = com.ironsource.environment.c.d(context);
            if (!TextUtils.isEmpty(d10)) {
                jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d10));
            }
            jSONObject.put("localTime", SDKUtils.encodeString(String.valueOf(h.a())));
            jSONObject.put("timezoneOffset", SDKUtils.encodeString(String.valueOf(h.b())));
            String j10 = h.j(context);
            if (!TextUtils.isEmpty(j10)) {
                jSONObject.put("icc", j10);
            }
            String c10 = h.c();
            if (!TextUtils.isEmpty(c10)) {
                jSONObject.put("tz", SDKUtils.encodeString(c10));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject;
    }
}
