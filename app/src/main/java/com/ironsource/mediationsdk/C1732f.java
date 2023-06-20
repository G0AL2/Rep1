package com.ironsource.mediationsdk;

import android.content.Context;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.f  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1732f {

    /* renamed from: b  reason: collision with root package name */
    private static C1732f f27035b = new C1732f();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f27036a = new AtomicBoolean(false);

    /* renamed from: com.ironsource.mediationsdk.f$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f27037a;

        /* renamed from: b  reason: collision with root package name */
        List<com.ironsource.mediationsdk.server.b> f27038b;

        /* renamed from: c  reason: collision with root package name */
        com.ironsource.mediationsdk.server.b f27039c;

        /* renamed from: d  reason: collision with root package name */
        JSONObject f27040d;

        /* renamed from: e  reason: collision with root package name */
        JSONObject f27041e;

        /* renamed from: f  reason: collision with root package name */
        int f27042f;

        /* renamed from: g  reason: collision with root package name */
        String f27043g;
    }

    /* renamed from: com.ironsource.mediationsdk.f$b */
    /* loaded from: classes3.dex */
    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private String f27044a;

        /* renamed from: b  reason: collision with root package name */
        private String f27045b;

        /* renamed from: c  reason: collision with root package name */
        private String f27046c;

        public b(String str, String str2, String str3) {
            this.f27044a = str;
            this.f27045b = str2;
            this.f27046c = str3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10 = false;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f27046c).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
                if (responseCode == 200 || responseCode == 204) {
                    z10 = true;
                }
            } catch (Exception unused) {
                IronLog.INTERNAL.error("exception - e");
            }
            if (z10) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
                jSONObject.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, this.f27044a + ";" + this.f27045b + ";" + this.f27046c);
            } catch (JSONException e10) {
                e10.printStackTrace();
                IronLog.INTERNAL.error("Send auction failure exception " + e10.getMessage());
            }
            com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, jSONObject));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.ironsource.mediationsdk.f$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final int f27047a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f27048b = 2;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ int[] f27049c = {1, 2};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(JSONObject jSONObject) {
        String optString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(optString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a();
        aVar.f27037a = optString;
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.f27039c = new com.ironsource.mediationsdk.server.b(jSONObject2);
            r0 = jSONObject2.has("armData") ? jSONObject2.optJSONObject("armData") : null;
            if (jSONObject2.has(IronSourceConstants.EVENTS_GENERIC_PARAMS)) {
                aVar.f27040d = jSONObject2.optJSONObject(IronSourceConstants.EVENTS_GENERIC_PARAMS);
            }
            if (jSONObject2.has("configurations")) {
                aVar.f27041e = jSONObject2.optJSONObject("configurations");
            }
        }
        aVar.f27038b = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("waterfall");
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            com.ironsource.mediationsdk.server.b bVar = new com.ironsource.mediationsdk.server.b(jSONArray.getJSONObject(i10), r0);
            if (!bVar.g()) {
                aVar.f27042f = 1002;
                aVar.f27043g = "waterfall " + i10;
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("AuctionResponseItem " + i10 + " not valid - parsing error");
                throw new JSONException("invalid response");
            }
            aVar.f27038b.add(bVar);
        }
        return aVar;
    }

    public static C1732f a() {
        return f27035b;
    }

    public static com.ironsource.mediationsdk.server.b a(String str, List<com.ironsource.mediationsdk.server.b> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).a().equals(str)) {
                return list.get(i10);
            }
        }
        return null;
    }

    public static String a(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7) {
        return str.replace("${AUCTION_PRICE}", str4).replace("${AUCTION_LOSS}", str6).replace("${AUCTION_MBR}", str5).replace("${INSTANCE}", str2).replace("${INSTANCE_TYPE}", Integer.toString(i10)).replace("${DYNAMIC_DEMAND_SOURCE}", str3).replace("${PLACEMENT_NAME}", str7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject a(String str) {
        try {
            return new JSONObject(IronSourceAES.decode(com.ironsource.mediationsdk.utils.g.a().b(), str));
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONObject a(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (list.contains(next)) {
                        jSONObject2.put(next, jSONObject.opt(next));
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str, String str2, String str3) {
        com.ironsource.environment.e.c.f26160a.c(new b(str, str2, str3));
    }

    private void a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (jSONObject2 == null) {
            return;
        }
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (jSONObject.has(next)) {
                int i10 = 0;
                str = next;
                while (jSONObject.has(str)) {
                    i10++;
                    str = next + "_" + i10;
                }
            } else {
                str = next;
            }
            try {
                jSONObject.put(str, jSONObject2.opt(next));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private static int b() {
        int i10 = c.f27048b;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                return i10;
            }
        } else if (i11 >= 23) {
            if (!((ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0)) {
                return i10;
            }
        }
        return c.f27047a;
    }

    public static Map<String, String> b(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        hashMap.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception " + e10.getMessage());
        }
        return hashMap;
    }

    private JSONObject b(JSONObject jSONObject, List<String> list) {
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    HashMap<String, String> hashMap = com.ironsource.environment.l.f26182b;
                    String str = hashMap.containsKey(next) ? hashMap.get(next) : next;
                    if ((list.isEmpty() && !com.ironsource.environment.l.f26181a.contains(str) && !str.startsWith("metadata_")) || list.contains(str)) {
                        jSONObject2.put(str, jSONObject.opt(next));
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
        return jSONObject2;
    }

    public static String c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            JSONObject jSONObject = new JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (JSONException e10) {
            e10.printStackTrace();
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception " + e10.getMessage());
            return str;
        }
    }

    public static String d(String str) {
        String str2 = "";
        try {
            if (TextUtils.isEmpty(str) || !com.ironsource.mediationsdk.c.b.a(str)) {
                return "";
            }
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("parameters = " + jSONObject2);
                if (jSONObject2.has(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID)) {
                    str2 = jSONObject2.getString(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID);
                    ironLog.verbose("demand source = " + str2);
                    return str2;
                }
                return "";
            }
            return "";
        } catch (JSONException e10) {
            e10.printStackTrace();
            IronLog ironLog2 = IronLog.INTERNAL;
            ironLog2.error("exception " + e10.getMessage());
            return str2;
        }
    }

    public final String a(String str, int i10, com.ironsource.mediationsdk.server.b bVar, String str2, String str3, String str4) {
        String str5;
        String c10 = bVar.c();
        if (!TextUtils.isEmpty(c10) && !TextUtils.isEmpty(str2)) {
            double parseDouble = Double.parseDouble(c10);
            double parseDouble2 = Double.parseDouble(str2);
            if (parseDouble2 != 0.0d) {
                str5 = String.valueOf(Math.round((parseDouble / parseDouble2) * 1000.0d) / 1000.0d);
                return a(str, bVar.a(), i10, d(bVar.b()), c10, str5, str3, str4);
            }
        }
        str5 = "";
        return a(str, bVar.a(), i10, d(bVar.b()), c10, str5, str3, str4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject a(Context context, Map<String, Object> map, List<String> list, C1735i c1735i, int i10, String str, com.ironsource.mediationsdk.utils.c cVar, ISBannerSize iSBannerSize, JSONObject jSONObject) {
        Object obj;
        String str2;
        boolean z10;
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            obj = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("instanceType", 2);
            jSONObject3.put("biddingAdditionalData", new JSONObject((Map) map.get(next)));
            if (c1735i != null) {
                obj = c1735i.a(next);
            }
            jSONObject3.put("performance", obj);
            jSONObject2.put(next, jSONObject3);
        }
        if (list != null) {
            for (String str3 : list) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("instanceType", 1);
                jSONObject4.put("performance", c1735i != null ? c1735i.a(str3) : "");
                jSONObject2.put(str3, jSONObject4);
            }
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = C1730d.a().f27024c;
        concurrentHashMap.putAll(com.ironsource.mediationsdk.utils.k.a().d());
        JSONObject jSONObject5 = new JSONObject();
        for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
            jSONObject5.put(entry.getKey(), TextUtils.join(",", entry.getValue()));
        }
        a(new com.ironsource.environment.a.b().a(), false);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("applicationUserId", J.a().f26339k);
        Boolean bool = J.a().f26353y;
        if (bool != null) {
            jSONObject6.put("consent", bool.booleanValue() ? 1 : 0);
        }
        jSONObject6.put("mobileCarrier", com.ironsource.environment.h.i(context));
        jSONObject6.put("connectionType", IronSourceUtils.getConnectionType(context));
        jSONObject6.put("deviceOS", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        jSONObject6.put("deviceWidth", context.getResources().getConfiguration().screenWidthDp);
        jSONObject6.put("deviceHeight", context.getResources().getConfiguration().screenHeightDp);
        jSONObject6.put("deviceOSVersion", Build.VERSION.SDK_INT + "(" + Build.VERSION.RELEASE + ")");
        jSONObject6.put("deviceModel", Build.MODEL);
        jSONObject6.put("deviceMake", Build.MANUFACTURER);
        jSONObject6.put("bundleId", context.getPackageName());
        jSONObject6.put("appVersion", com.ironsource.environment.c.c(context, context.getPackageName()));
        jSONObject6.put("clientTimestamp", new Date().getTime());
        jSONObject6.put("fs", IronSourceUtils.getFirstSession(context) ? 1 : 0);
        jSONObject6.put("browserUserAgent", com.ironsource.environment.h.r());
        jSONObject6.put("deviceType", IronSourceUtils.getDeviceType(context));
        jSONObject6.put("deviceLang", Locale.getDefault().getLanguage());
        jSONObject6.put("secure", b() - 1);
        if (iSBannerSize != null) {
            jSONObject6.put("bannerSize", iSBannerSize.getDescription());
            jSONObject6.put("bannerWidth", iSBannerSize.getWidth());
            jSONObject6.put("bannerHeight", iSBannerSize.getHeight());
        }
        String[] C = com.ironsource.environment.h.C(context);
        if (C == null || C.length != 2) {
            str2 = "";
            z10 = false;
        } else {
            str2 = !TextUtils.isEmpty(C[0]) ? C[0] : "";
            z10 = Boolean.valueOf(C[1]).booleanValue();
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = com.ironsource.environment.h.x(context);
            if (!TextUtils.isEmpty(str2)) {
                obj = IronSourceConstants.TYPE_UUID;
            }
        } else {
            obj = IronSourceConstants.TYPE_GAID;
        }
        if (!TextUtils.isEmpty(str2)) {
            jSONObject6.put("advId", str2);
            jSONObject6.put("advIdType", obj);
            jSONObject6.put("isLimitAdTrackingEnabled", z10 ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false");
        }
        String B = com.ironsource.environment.h.B(context);
        if (!TextUtils.isEmpty(B)) {
            jSONObject6.put("asid", B);
        }
        String y10 = com.ironsource.environment.h.y(context);
        if (!TextUtils.isEmpty(y10)) {
            jSONObject6.put("auid", y10);
        }
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("applicationKey", J.a().f26338j);
        jSONObject7.put("SDKVersion", IronSourceUtils.getSDKVersion());
        jSONObject7.put("clientParams", jSONObject6);
        jSONObject7.put(IronSourceConstants.KEY_SESSION_DEPTH, i10);
        jSONObject7.put("sessionId", str);
        jSONObject7.put("instances", jSONObject2);
        jSONObject7.put("auctionData", cVar.f27410c);
        jSONObject7.put("metaData", jSONObject5);
        if (jSONObject != null) {
            jSONObject7.put("sg", jSONObject);
        }
        return jSONObject7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final JSONObject a(String str, boolean z10, Map<String, Object> map, List<String> list, C1735i c1735i, int i10, ISBannerSize iSBannerSize, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            String str2 = "";
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("instp", 2);
            jSONObject4.put("badt", new JSONObject((Map) map.get(next)));
            if (c1735i != null) {
                str2 = c1735i.a(next);
            }
            jSONObject4.put("prfm", str2);
            jSONObject3.put(next, jSONObject4);
        }
        if (list != null) {
            for (String str3 : list) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("instp", 1);
                jSONObject5.put("prfm", c1735i != null ? c1735i.a(str3) : "");
                jSONObject3.put(str3, jSONObject5);
            }
        }
        jSONObject2.put("inst", jSONObject3);
        JSONObject a10 = new com.ironsource.environment.a.b().a();
        a(a10, false);
        a10.put("sd", i10);
        a10.put("scr", b() - 1);
        if (jSONObject != null) {
            a10.put("sg", jSONObject);
        }
        jSONObject2.put("ctdt", a10);
        if (iSBannerSize != null) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("bns", iSBannerSize.getDescription());
            jSONObject6.put("bnw", iSBannerSize.getWidth());
            jSONObject6.put("bnh", iSBannerSize.getHeight());
            jSONObject2.put("bndt", jSONObject6);
        }
        jSONObject2.put("adu", str);
        jSONObject2.put("dner", !z10 ? 1 : 0);
        return jSONObject2;
    }

    public final JSONObject a(JSONObject jSONObject, JSONObject jSONObject2, List<String> list) {
        aj a10 = aj.a();
        a10.a(aj.c());
        a10.a(aj.b());
        JSONObject a11 = a(a10.f26976a, list.isEmpty() ? com.ironsource.environment.l.f26181a : list);
        a(a11, b(jSONObject, list));
        if (!list.isEmpty()) {
            jSONObject2 = a(jSONObject2, list);
        }
        a(a11, jSONObject2);
        return a11;
    }

    public final void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString("tcs")) || !this.f27036a.compareAndSet(false, true)) {
            return;
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.getMediationAdditionalData(z10, true, -1)));
    }
}
