package com.chartboost.sdk.Tracking;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.f;
import com.chartboost.sdk.impl.l2;
import com.chartboost.sdk.impl.n0;
import com.chartboost.sdk.impl.s0;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.EnumMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class CBAnalytics {

    /* loaded from: classes.dex */
    public enum CBIAPPurchaseInfo {
        PRODUCT_ID,
        PRODUCT_TITLE,
        PRODUCT_DESCRIPTION,
        PRODUCT_PRICE,
        PRODUCT_CURRENCY_CODE,
        GOOGLE_PURCHASE_DATA,
        GOOGLE_PURCHASE_SIGNATURE,
        AMAZON_PURCHASE_TOKEN,
        AMAZON_USER_ID
    }

    /* loaded from: classes.dex */
    public enum CBIAPType {
        GOOGLE_PLAY,
        AMAZON
    }

    /* loaded from: classes.dex */
    public enum CBLevelType {
        HIGHEST_LEVEL_REACHED(1),
        CURRENT_AREA(2),
        CHARACTER_LEVEL(3),
        OTHER_SEQUENTIAL(4),
        OTHER_NONSEQUENTIAL(5);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f13766a;

        CBLevelType(int i10) {
            this.f13766a = i10;
        }

        public int getLevelType() {
            return this.f13766a;
        }
    }

    private CBAnalytics() {
    }

    private static synchronized void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, CBIAPType cBIAPType) {
        synchronized (CBAnalytics.class) {
            f a10 = f.a();
            if (a10 == null) {
                CBLogging.b("CBPostInstallTracker", "You need call Chartboost.startWithAppId() before tracking in-app purchases");
            } else if (a10.c() == null) {
                CBLogging.b("CBPostInstallTracker", "You need call Chartboost.init() before calling any public API's");
            } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
                try {
                    Matcher matcher = Pattern.compile("(\\d+\\.\\d+)|(\\d+)").matcher(str4);
                    matcher.find();
                    String group = matcher.group();
                    if (TextUtils.isEmpty(group)) {
                        CBLogging.b("CBPostInstallTracker", "Invalid price object");
                        return;
                    }
                    float parseFloat = Float.parseFloat(group);
                    JSONObject jSONObject = null;
                    CBIAPType cBIAPType2 = CBIAPType.GOOGLE_PLAY;
                    if (cBIAPType == cBIAPType2) {
                        if (!TextUtils.isEmpty(str6) && !TextUtils.isEmpty(str7)) {
                            jSONObject = n0.a(n0.a("purchaseData", str6), n0.a("purchaseSignature", str7), n0.a("type", Integer.valueOf(cBIAPType2.ordinal())));
                        }
                        CBLogging.b("CBPostInstallTracker", "Null object is passed for for purchase data or purchase signature");
                        return;
                    }
                    CBIAPType cBIAPType3 = CBIAPType.AMAZON;
                    if (cBIAPType == cBIAPType3) {
                        if (!TextUtils.isEmpty(str8) && !TextUtils.isEmpty(str9)) {
                            jSONObject = n0.a(n0.a("userID", str8), n0.a("purchaseToken", str9), n0.a("type", Integer.valueOf(cBIAPType3.ordinal())));
                        }
                        CBLogging.b("CBPostInstallTracker", "Null object is passed for for amazon user id or amazon purchase token");
                        return;
                    }
                    if (jSONObject == null) {
                        CBLogging.b("CBPostInstallTracker", "Error while parsing the receipt to a JSON Object, ");
                    } else {
                        a(a10.f13864u, a10.f13865v, n0.a(n0.a("localized-title", str2), n0.a("localized-description", str3), n0.a(InAppPurchaseMetaData.KEY_PRICE, Float.valueOf(parseFloat)), n0.a("currency", str5), n0.a("productID", str), n0.a("receipt", Base64.encodeToString(jSONObject.toString().getBytes(), 2))), "iap", cBIAPType);
                    }
                } catch (IllegalStateException unused) {
                    CBLogging.b("CBPostInstallTracker", "Invalid price object");
                }
            } else {
                CBLogging.b("CBPostInstallTracker", "Null object is passed. Please pass a valid value object");
            }
        }
    }

    public static synchronized void trackInAppAmazonStorePurchaseEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        synchronized (CBAnalytics.class) {
            a(str5, str, str2, str3, str4, null, null, str6, str7, CBIAPType.AMAZON);
        }
    }

    public static synchronized void trackInAppGooglePlayPurchaseEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        synchronized (CBAnalytics.class) {
            a(str5, str, str2, str3, str4, str6, str7, null, null, CBIAPType.GOOGLE_PLAY);
        }
    }

    public static synchronized void trackLevelInfo(String str, CBLevelType cBLevelType, int i10, String str2) {
        synchronized (CBAnalytics.class) {
            trackLevelInfo(str, cBLevelType, i10, 0, str2);
        }
    }

    public synchronized void trackInAppPurchaseEvent(EnumMap<CBIAPPurchaseInfo, String> enumMap, CBIAPType cBIAPType) {
        if (enumMap != null && cBIAPType != null) {
            CBIAPPurchaseInfo cBIAPPurchaseInfo = CBIAPPurchaseInfo.PRODUCT_ID;
            if (!TextUtils.isEmpty(enumMap.get(cBIAPPurchaseInfo))) {
                CBIAPPurchaseInfo cBIAPPurchaseInfo2 = CBIAPPurchaseInfo.PRODUCT_TITLE;
                if (!TextUtils.isEmpty(enumMap.get(cBIAPPurchaseInfo2))) {
                    CBIAPPurchaseInfo cBIAPPurchaseInfo3 = CBIAPPurchaseInfo.PRODUCT_DESCRIPTION;
                    if (!TextUtils.isEmpty(enumMap.get(cBIAPPurchaseInfo3))) {
                        CBIAPPurchaseInfo cBIAPPurchaseInfo4 = CBIAPPurchaseInfo.PRODUCT_PRICE;
                        if (!TextUtils.isEmpty(enumMap.get(cBIAPPurchaseInfo4))) {
                            CBIAPPurchaseInfo cBIAPPurchaseInfo5 = CBIAPPurchaseInfo.PRODUCT_CURRENCY_CODE;
                            if (!TextUtils.isEmpty(enumMap.get(cBIAPPurchaseInfo5))) {
                                a(enumMap.get(cBIAPPurchaseInfo), enumMap.get(cBIAPPurchaseInfo2), enumMap.get(cBIAPPurchaseInfo3), enumMap.get(cBIAPPurchaseInfo4), enumMap.get(cBIAPPurchaseInfo5), enumMap.get(CBIAPPurchaseInfo.GOOGLE_PURCHASE_DATA), enumMap.get(CBIAPPurchaseInfo.GOOGLE_PURCHASE_SIGNATURE), enumMap.get(CBIAPPurchaseInfo.AMAZON_USER_ID), enumMap.get(CBIAPPurchaseInfo.AMAZON_PURCHASE_TOKEN), cBIAPType);
                                return;
                            }
                        }
                    }
                }
            }
        }
        CBLogging.b("CBPostInstallTracker", "Null object is passed. Please pass a valid value object");
    }

    public static synchronized void trackLevelInfo(String str, CBLevelType cBLevelType, int i10, int i11, String str2) {
        synchronized (CBAnalytics.class) {
            f a10 = f.a();
            if (a10 == null) {
                CBLogging.b("CBPostInstallTracker", "trackLevelInfo: SDK is not initialized");
            } else if (TextUtils.isEmpty(str)) {
                CBLogging.b("CBPostInstallTracker", "Invalid value: event label cannot be empty or null");
            } else if (cBLevelType == null) {
                CBLogging.b("CBPostInstallTracker", "Invalid value: level type cannot be empty or null, please choose from one of the CBLevelType enum values");
            } else if (i10 >= 0 && i11 >= 0) {
                if (str2.isEmpty()) {
                    CBLogging.b("CBPostInstallTracker", "Invalid value: description cannot be empty or null");
                    return;
                }
                Context c10 = a10.c();
                if (c10 != null) {
                    f.a(c10);
                }
                JSONObject a11 = n0.a(n0.a("event_label", str), n0.a("event_field", Integer.valueOf(cBLevelType.getLevelType())), n0.a("main_level", Integer.valueOf(i10)), n0.a("sub_level", Integer.valueOf(i11)), n0.a("description", str2), n0.a("timestamp", Long.valueOf(System.currentTimeMillis())), n0.a("data_type", "level_info"));
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(a11);
                a(a10.f13864u, a10.f13865v, jSONArray, "tracking");
            } else {
                CBLogging.b("CBPostInstallTracker", "Invalid value: Level number should be > 0");
            }
        }
    }

    private static synchronized void a(com.chartboost.sdk.Networking.b bVar, l2 l2Var, JSONObject jSONObject, String str, CBIAPType cBIAPType) {
        synchronized (CBAnalytics.class) {
            s0 s0Var = new s0("https://live.chartboost.com", String.format(Locale.US, "%s%s", "/post-install-event/", str), l2Var, 2, null);
            s0Var.a(str, jSONObject);
            s0Var.f14299m = true;
            s0Var.a(str);
            bVar.a(s0Var);
        }
    }

    private static synchronized void a(com.chartboost.sdk.Networking.b bVar, l2 l2Var, JSONArray jSONArray, String str) {
        synchronized (CBAnalytics.class) {
            s0 s0Var = new s0("https://live.chartboost.com", "/post-install-event/".concat("tracking"), l2Var, 2, null);
            s0Var.a("track_info", jSONArray);
            s0Var.f14299m = true;
            s0Var.a(str);
            bVar.a(s0Var);
        }
    }
}
