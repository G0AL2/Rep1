package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.applovin.impl.sdk.v;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f8821a = {7, 4, 2, 1, 11};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f8822b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f8823c = {15, 13};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f8824d = {20};

    public static String a(InputStream inputStream, com.applovin.impl.sdk.m mVar) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) mVar.a(com.applovin.impl.sdk.c.b.cW)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static String a(String str, com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.aT), str, mVar);
    }

    public static String a(String str, String str2, com.applovin.impl.sdk.m mVar) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 != null) {
            if (mVar != null) {
                return str + str2;
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No endpoint specified");
    }

    public static JSONObject a(JSONObject jSONObject) throws JSONException {
        return (JSONObject) jSONObject.getJSONArray("results").get(0);
    }

    public static void a(int i10, com.applovin.impl.sdk.m mVar) {
        if (i10 == 401 && v.a()) {
            v.i("AppLovinSdk", "SDK key \"" + mVar.z() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
        } else if (i10 == 418) {
            mVar.K().a(com.applovin.impl.sdk.c.b.W, Boolean.TRUE);
            mVar.K().a();
        } else {
            if (i10 < 400 || i10 >= 500) {
                if (i10 != -1 || !((Boolean) mVar.a(com.applovin.impl.sdk.c.b.Y)).booleanValue()) {
                    return;
                }
            } else if (!((Boolean) mVar.a(com.applovin.impl.sdk.c.b.Y)).booleanValue()) {
                return;
            }
            mVar.k();
        }
    }

    public static void a(JSONObject jSONObject, boolean z10, com.applovin.impl.sdk.m mVar) {
        mVar.ag().a(jSONObject, z10);
    }

    public static boolean a() {
        return a((String) null);
    }

    private static boolean a(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i11 == i10) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(Context context) {
        if (context.getSystemService("connectivity") != null) {
            NetworkInfo b10 = b(context);
            if (b10 != null) {
                return b10.isConnected();
            }
            return false;
        }
        return true;
    }

    public static boolean a(String str) {
        if (g.e()) {
            return (!g.f() || TextUtils.isEmpty(str)) ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
        }
        return true;
    }

    private static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    public static String b(String str, com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.aU), str, mVar);
    }

    public static void c(JSONObject jSONObject, com.applovin.impl.sdk.m mVar) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            mVar.a((com.applovin.impl.sdk.c.d<com.applovin.impl.sdk.c.d<String>>) com.applovin.impl.sdk.c.d.f8256z, (com.applovin.impl.sdk.c.d<String>) string);
            if (v.a()) {
                mVar.A().c("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    public static void d(JSONObject jSONObject, com.applovin.impl.sdk.m mVar) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (mVar == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        try {
            if (jSONObject.has("settings")) {
                com.applovin.impl.sdk.c.c K = mVar.K();
                if (jSONObject.isNull("settings")) {
                    return;
                }
                K.a(jSONObject.getJSONObject("settings"));
                K.a();
            }
        } catch (JSONException e10) {
            if (v.a()) {
                mVar.A().b("ConnectionUtils", "Unable to parse settings out of API response", e10);
            }
        }
    }

    public static Map<String, String> e(com.applovin.impl.sdk.m mVar) {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = (String) mVar.a(com.applovin.impl.sdk.c.b.Z);
        if (!StringUtils.isValidString(str2)) {
            if (!((Boolean) mVar.a(com.applovin.impl.sdk.c.b.ep)).booleanValue()) {
                str2 = mVar.z();
                str = "api_key";
            }
            hashMap.putAll(Utils.stringifyObjectMap(mVar.V().i()));
            return hashMap;
        }
        str = "device_token";
        hashMap.put(str, str2);
        hashMap.putAll(Utils.stringifyObjectMap(mVar.V().i()));
        return hashMap;
    }

    public static void e(JSONObject jSONObject, com.applovin.impl.sdk.m mVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(mVar.L()).edit();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    com.applovin.impl.sdk.c.e.a(next, object, (SharedPreferences) null, edit);
                }
            }
            edit.apply();
        }
    }

    public static String f(com.applovin.impl.sdk.m mVar) {
        NetworkInfo b10 = b(mVar.L());
        if (b10 != null) {
            int type = b10.getType();
            int subtype = b10.getSubtype();
            return type == 1 ? "wifi" : type == 0 ? a(subtype, f8821a) ? "2g" : a(subtype, f8822b) ? "3g" : a(subtype, f8823c) ? "4g" : a(subtype, f8824d) ? "5g" : "mobile" : DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        }
        return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
    }

    public static void f(JSONObject jSONObject, com.applovin.impl.sdk.m mVar) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "variables", (JSONObject) null);
        if (jSONObject2 != null) {
            mVar.y().updateVariables(jSONObject2);
        }
    }

    public static String g(com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.aR), ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.f8216de)).booleanValue() ? "5.0/ad" : "4.0/ad", mVar);
    }

    public static String h(com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.aS), ((Boolean) mVar.a(com.applovin.impl.sdk.c.b.f8216de)).booleanValue() ? "5.0/ad" : "4.0/ad", mVar);
    }

    public static String i(com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.aR), "4.0/ad", mVar);
    }

    public static String j(com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.aS), "4.0/ad", mVar);
    }

    public static String k(com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.aX), "1.0/variable_config", mVar);
    }

    public static String l(com.applovin.impl.sdk.m mVar) {
        return a((String) mVar.a(com.applovin.impl.sdk.c.b.aY), "1.0/variable_config", mVar);
    }
}
