package com.chartboost.sdk.Model;

import com.chartboost.sdk.Privacy.model.CCPA;
import com.chartboost.sdk.Privacy.model.COPPA;
import com.chartboost.sdk.impl.f3;
import com.chartboost.sdk.impl.k0;
import com.chartboost.sdk.impl.l;
import com.chartboost.sdk.impl.y2;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f13710a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13711b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13712c;

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f13713d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13714e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13715f;

    /* renamed from: g  reason: collision with root package name */
    public final int f13716g;

    /* renamed from: h  reason: collision with root package name */
    public final int f13717h;

    /* renamed from: i  reason: collision with root package name */
    public final int f13718i;

    /* renamed from: j  reason: collision with root package name */
    public final List<String> f13719j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f13720k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f13721l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f13722m;

    /* renamed from: n  reason: collision with root package name */
    public final int f13723n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f13724o;

    /* renamed from: p  reason: collision with root package name */
    public final String f13725p;

    /* renamed from: q  reason: collision with root package name */
    public final String f13726q;

    /* renamed from: r  reason: collision with root package name */
    private final a f13727r;

    /* renamed from: s  reason: collision with root package name */
    public b f13728s;

    /* renamed from: t  reason: collision with root package name */
    private String f13729t;

    /* renamed from: u  reason: collision with root package name */
    private y2 f13730u;

    /* renamed from: v  reason: collision with root package name */
    private f3 f13731v;

    public e(JSONObject jSONObject) {
        this.f13710a = jSONObject.optString("configVariant");
        this.f13711b = jSONObject.optBoolean("prefetchDisable");
        this.f13712c = jSONObject.optBoolean("publisherDisable");
        this.f13727r = a.a(jSONObject);
        try {
            this.f13728s = b.a(jSONObject);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        this.f13729t = jSONObject.optString("publisherWarning", null);
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("invalidateFolderList");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                String optString = optJSONArray.optString(i10);
                if (!optString.isEmpty()) {
                    arrayList.add(optString);
                }
            }
        }
        this.f13713d = Collections.unmodifiableList(arrayList);
        JSONObject optJSONObject = jSONObject.optJSONObject("trackingLevels");
        optJSONObject = optJSONObject == null ? new JSONObject() : optJSONObject;
        optJSONObject.optBoolean("critical", true);
        optJSONObject.optBoolean("includeStackTrace", true);
        optJSONObject.optBoolean("error");
        optJSONObject.optBoolean("debug");
        optJSONObject.optBoolean("session");
        optJSONObject.optBoolean("system");
        optJSONObject.optBoolean("timing");
        optJSONObject.optBoolean("user");
        this.f13730u = y2.a(jSONObject);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("videoPreCaching");
        this.f13731v = new f3().a(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        this.f13714e = jSONObject.optLong("getAdRetryBaseMs", 200L);
        this.f13715f = jSONObject.optInt("getAdRetryMaxBackoffExponent", 3);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("webview");
        optJSONObject3 = optJSONObject3 == null ? new JSONObject() : optJSONObject3;
        this.f13716g = optJSONObject3.optInt("cacheMaxBytes", 104857600);
        int optInt = optJSONObject3.optInt("cacheMaxUnits", 10);
        this.f13717h = optInt > 0 ? optInt : 10;
        this.f13718i = (int) TimeUnit.SECONDS.toDays(optJSONObject3.optInt("cacheTTLs", k0.f14110a));
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray2 = optJSONObject3.optJSONArray("directories");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                String optString2 = optJSONArray2.optString(i11);
                if (!optString2.isEmpty()) {
                    arrayList2.add(optString2);
                }
            }
        }
        this.f13719j = Collections.unmodifiableList(arrayList2);
        this.f13720k = optJSONObject3.optBoolean("enabled", f());
        optJSONObject3.optBoolean("inplayEnabled", true);
        this.f13721l = optJSONObject3.optBoolean("interstitialEnabled", true);
        optJSONObject3.optInt("invalidatePendingImpression", 3);
        this.f13722m = optJSONObject3.optBoolean("lockOrientation", true);
        this.f13723n = optJSONObject3.optInt("prefetchSession", 3);
        this.f13724o = optJSONObject3.optBoolean("rewardVideoEnabled", true);
        String optString3 = optJSONObject3.optString(MediationMetaData.KEY_VERSION, "v2");
        this.f13725p = optString3;
        String.format("%s/%s%s", "webview", optString3, "/interstitial/get");
        this.f13726q = String.format("%s/%s/%s", "webview", optString3, "prefetch");
        String.format("%s/%s%s", "webview", optString3, "/reward/get");
    }

    private static boolean f() {
        int[] iArr = {4, 4, 2};
        String a10 = l.b().a();
        if (a10 != null && a10.length() > 0) {
            String[] split = a10.replaceAll("[^\\d.]", "").split("\\.");
            for (int i10 = 0; i10 < split.length && i10 < 3; i10++) {
                try {
                    if (Integer.valueOf(split[i10]).intValue() > iArr[i10]) {
                        return true;
                    }
                    if (Integer.valueOf(split[i10]).intValue() < iArr[i10]) {
                        return false;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    public a a() {
        return this.f13727r;
    }

    public f3 b() {
        return this.f13731v;
    }

    public boolean c() {
        return this.f13712c;
    }

    public String d() {
        return this.f13729t;
    }

    public y2 e() {
        return this.f13730u;
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        protected double f13732a;

        /* renamed from: b  reason: collision with root package name */
        protected double f13733b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f13734c;

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f13734c = jSONObject.optBoolean("bannerEnable", true);
            aVar.f13732a = jSONObject.optDouble("bannerRefreshInterval", 30.0d);
            aVar.f13733b = jSONObject.optDouble("bannerShowTimeout", 30.0d);
            return aVar;
        }

        public double b() {
            return this.f13733b;
        }

        public boolean c() {
            return this.f13734c;
        }

        public double a() {
            return this.f13732a;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private HashSet<String> f13735a;

        public static b a(JSONObject jSONObject) throws JSONException {
            b bVar = new b();
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add(CCPA.CCPA_STANDARD);
            hashSet.add(COPPA.COPPA_STANDARD);
            JSONArray optJSONArray = jSONObject.optJSONArray("privacyStandards");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                a(optJSONArray, hashSet, length);
                a(hashSet, length);
            }
            bVar.f13735a = hashSet;
            return bVar;
        }

        private static void a(JSONArray jSONArray, HashSet<String> hashSet, int i10) throws JSONException {
            for (int i11 = 0; i11 < i10; i11++) {
                hashSet.add(jSONArray.getString(i11));
            }
        }

        private static void a(HashSet<String> hashSet, int i10) {
            if (i10 == 0) {
                hashSet.clear();
            }
        }

        public HashSet<String> a() {
            return this.f13735a;
        }
    }
}
