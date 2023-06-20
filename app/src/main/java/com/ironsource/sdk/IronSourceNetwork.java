package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.a.a;
import com.ironsource.sdk.a.b;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class IronSourceNetwork {

    /* renamed from: a  reason: collision with root package name */
    private static e f27569a;

    /* renamed from: b  reason: collision with root package name */
    private static com.ironsource.sdk.j.d f27570b;

    /* renamed from: c  reason: collision with root package name */
    private static JSONObject f27571c;

    private static synchronized void a() {
        synchronized (IronSourceNetwork.class) {
            if (f27569a == null) {
                throw new NullPointerException("Call initSDK first");
            }
        }
    }

    public static synchronized void applyConsentInfo(JSONObject jSONObject) {
        synchronized (IronSourceNetwork.class) {
            e eVar = f27569a;
            if (eVar == null) {
                return;
            }
            if (jSONObject == null) {
                return;
            }
            eVar.a(jSONObject);
        }
    }

    public static com.ironsource.sdk.j.d getInitListener() {
        return f27570b;
    }

    public static synchronized void getOfferWallCredits(com.ironsource.sdk.j.e eVar) {
        synchronized (IronSourceNetwork.class) {
            a();
            f27569a.a(eVar);
        }
    }

    public static synchronized JSONObject getRawToken(Context context) {
        JSONObject b10;
        synchronized (IronSourceNetwork.class) {
            b10 = com.ironsource.sdk.service.d.a().b(context);
        }
        return b10;
    }

    public static synchronized String getToken(Context context) {
        String a10;
        synchronized (IronSourceNetwork.class) {
            a10 = com.ironsource.sdk.service.d.a().a(context);
        }
        return a10;
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initOfferWall(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        synchronized (IronSourceNetwork.class) {
            a();
            f27569a.a(map, eVar);
        }
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            if (TextUtils.isEmpty(str)) {
                Logger.e("IronSourceNetwork", "applicationKey is NULL");
                return;
            }
            if (f27569a == null) {
                SDKUtils.setInitSDKParams(map);
                try {
                    JSONObject optJSONObject = SDKUtils.getNetworkConfiguration().optJSONObject("events");
                    if (optJSONObject != null) {
                        a.C0333a c0333a = new a.C0333a(optJSONObject.optString("endpoint"));
                        c0333a.f26066c = "GET";
                        c0333a.f26065b = optJSONObject.optBoolean("enabled");
                        c0333a.f26067d = new com.ironsource.sdk.a.c();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new Pair("Content-Type", "application/json"));
                        arrayList.add(new Pair("charset", "utf-8"));
                        c0333a.f26069f.addAll(arrayList);
                        c0333a.f26068e = false;
                        com.ironsource.a.a aVar = new com.ironsource.a.a(c0333a);
                        if (aVar.f26059b) {
                            b.a aVar2 = new b.a();
                            if (map != null && map.containsKey("sessionid")) {
                                aVar2.f27577a = map.get("sessionid");
                            }
                            aVar2.f27579c = context;
                            aVar2.f27580d = str2;
                            aVar2.f27578b = str;
                            com.ironsource.sdk.a.d.a(aVar, new com.ironsource.sdk.a.b(aVar2, (byte) 0));
                        }
                    }
                } catch (Exception e10) {
                    Logger.e("IronSourceNetwork", "Failed to init event tracker: " + e10.getMessage());
                }
                f27569a = com.ironsource.sdk.d.b.a(str, str2, context);
                applyConsentInfo(f27571c);
            }
        }
    }

    public static synchronized boolean isAdAvailableForInstance(b bVar) {
        synchronized (IronSourceNetwork.class) {
            e eVar = f27569a;
            if (eVar == null) {
                return false;
            }
            return eVar.a(bVar);
        }
    }

    public static synchronized void loadAd(Activity activity, b bVar, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            a();
            f27569a.a(activity, bVar, map);
        }
    }

    public static void onPause(Activity activity) {
        e eVar = f27569a;
        if (eVar == null) {
            return;
        }
        eVar.b(activity);
    }

    public static void onResume(Activity activity) {
        e eVar = f27569a;
        if (eVar == null) {
            return;
        }
        eVar.c(activity);
    }

    public static synchronized void release(Activity activity) {
        synchronized (IronSourceNetwork.class) {
            e eVar = f27569a;
            if (eVar == null) {
                return;
            }
            eVar.a(activity);
        }
    }

    public static synchronized void requestToDestroyBanner() {
        synchronized (IronSourceNetwork.class) {
            a();
            f27569a.a();
        }
    }

    public static synchronized void setInitListener(com.ironsource.sdk.j.d dVar) {
        synchronized (IronSourceNetwork.class) {
            f27570b = dVar;
        }
    }

    public static synchronized void showAd(b bVar, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            a();
            f27569a.a(bVar, map);
        }
    }

    public static synchronized void showOfferWall(Activity activity, Map<String, String> map) {
        synchronized (IronSourceNetwork.class) {
            a();
            f27569a.a(activity, map);
        }
    }

    public static synchronized void updateConsentInfo(JSONObject jSONObject) {
        synchronized (IronSourceNetwork.class) {
            f27571c = jSONObject;
            applyConsentInfo(jSONObject);
        }
    }

    public static synchronized void updateMetadata(JSONObject jSONObject) {
        synchronized (IronSourceNetwork.class) {
            com.ironsource.sdk.service.d a10 = com.ironsource.sdk.service.d.a();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                a10.a("metadata_" + next, jSONObject.opt(next));
            }
        }
    }
}
