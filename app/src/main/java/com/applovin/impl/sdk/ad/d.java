package com.applovin.impl.sdk.ad;

import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, d> f8083a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f8084b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f8085c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8086d;

    /* renamed from: e  reason: collision with root package name */
    private AppLovinAdSize f8087e;

    /* renamed from: f  reason: collision with root package name */
    private AppLovinAdType f8088f;

    private d(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        String str2;
        if (TextUtils.isEmpty(str) && (appLovinAdType == null || appLovinAdSize == null)) {
            throw new IllegalArgumentException("No zone identifier or type or size specified");
        }
        this.f8087e = appLovinAdSize;
        this.f8088f = appLovinAdType;
        if (StringUtils.isValidString(str)) {
            str2 = str.trim();
        } else {
            str2 = appLovinAdSize.getLabel() + "_" + appLovinAdType.getLabel();
        }
        this.f8086d = str2.toLowerCase(Locale.ENGLISH);
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType) {
        return a(appLovinAdSize, appLovinAdType, null);
    }

    public static d a(AppLovinAdSize appLovinAdSize, AppLovinAdType appLovinAdType, String str) {
        d dVar = new d(appLovinAdSize, appLovinAdType, str);
        synchronized (f8084b) {
            String str2 = dVar.f8086d;
            Map<String, d> map = f8083a;
            if (map.containsKey(str2)) {
                dVar = map.get(str2);
            } else {
                map.put(str2, dVar);
            }
        }
        return dVar;
    }

    public static d a(String str) {
        return a(null, null, str);
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ad_size") && jSONObject.has("ad_type")) {
            synchronized (f8084b) {
                d dVar = f8083a.get(JsonUtils.getString(jSONObject, AppLovinUtils.ServerParameterKeys.ZONE_ID, ""));
                if (dVar != null) {
                    dVar.f8087e = AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", ""));
                    dVar.f8088f = AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", ""));
                }
            }
        }
    }

    public static d b(String str) {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED, str);
    }

    public static Collection<d> f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(6);
        Collections.addAll(linkedHashSet, g(), h(), i(), j(), k(), l());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    public static d g() {
        return a(AppLovinAdSize.BANNER, AppLovinAdType.REGULAR);
    }

    public static d h() {
        return a(AppLovinAdSize.MREC, AppLovinAdType.REGULAR);
    }

    public static d i() {
        return a(AppLovinAdSize.LEADER, AppLovinAdType.REGULAR);
    }

    public static d j() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.REGULAR);
    }

    public static d k() {
        return a(AppLovinAdSize.INTERSTITIAL, AppLovinAdType.INCENTIVIZED);
    }

    public static d l() {
        return a(AppLovinAdSize.NATIVE, AppLovinAdType.NATIVE);
    }

    public String a() {
        return this.f8086d;
    }

    public MaxAdFormat b() {
        AppLovinAdSize c10 = c();
        if (c10 == AppLovinAdSize.BANNER) {
            return MaxAdFormat.BANNER;
        }
        if (c10 == AppLovinAdSize.LEADER) {
            return MaxAdFormat.LEADER;
        }
        if (c10 == AppLovinAdSize.MREC) {
            return MaxAdFormat.MREC;
        }
        if (c10 == AppLovinAdSize.CROSS_PROMO) {
            return MaxAdFormat.CROSS_PROMO;
        }
        if (c10 != AppLovinAdSize.INTERSTITIAL) {
            if (c10 == AppLovinAdSize.NATIVE) {
                return MaxAdFormat.NATIVE;
            }
            return null;
        } else if (d() == AppLovinAdType.REGULAR) {
            return MaxAdFormat.INTERSTITIAL;
        } else {
            if (d() == AppLovinAdType.INCENTIVIZED) {
                return MaxAdFormat.REWARDED;
            }
            if (d() == AppLovinAdType.AUTO_INCENTIVIZED) {
                return MaxAdFormat.REWARDED_INTERSTITIAL;
            }
            return null;
        }
    }

    public AppLovinAdSize c() {
        if (this.f8087e == null && JsonUtils.valueExists(this.f8085c, "ad_size")) {
            this.f8087e = AppLovinAdSize.fromString(JsonUtils.getString(this.f8085c, "ad_size", null));
        }
        return this.f8087e;
    }

    public AppLovinAdType d() {
        if (this.f8088f == null && JsonUtils.valueExists(this.f8085c, "ad_type")) {
            this.f8088f = AppLovinAdType.fromString(JsonUtils.getString(this.f8085c, "ad_type", null));
        }
        return this.f8088f;
    }

    public boolean e() {
        return f().contains(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.f8086d.equalsIgnoreCase(((d) obj).f8086d);
    }

    public int hashCode() {
        return this.f8086d.hashCode();
    }

    public String toString() {
        return "AdZone{id=" + this.f8086d + ", zoneObject=" + this.f8085c + '}';
    }
}
