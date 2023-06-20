package com.google.android.ads.mediationtestsuite.utils;

import android.os.Bundle;
import android.util.Log;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.ads.mediationtestsuite.MediationTestSuite;
import com.google.android.ads.mediationtestsuite.dataobjects.AdFormat;
import com.google.android.ads.mediationtestsuite.dataobjects.NetworkConfig;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: AdRequestUtil.java */
/* loaded from: classes2.dex */
public class b {

    /* compiled from: AdRequestUtil.java */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20908a;

        static {
            int[] iArr = new int[AdFormat.values().length];
            f20908a = iArr;
            try {
                iArr[AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20908a[AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20908a[AdFormat.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20908a[AdFormat.NATIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static String a(Map<String, String> map, NetworkConfig networkConfig) {
        String str;
        JSONObject jSONObject = new JSONObject(map);
        if (networkConfig.i().i() != null) {
            str = networkConfig.i().f();
        } else {
            try {
                jSONObject.put("class_name", networkConfig.i().f());
            } catch (JSONException e10) {
                Log.e("gma_test", e10.getLocalizedMessage());
            }
            str = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
        }
        return "{\"mediation\":true,\"ad_json\":{\"ad_type\":\"banner\",\"qdata\":\"x\",\"ad_networks\":[{\"adapters\":[\"***ADAPTER_CLASS_NAME***\"],\"id\":\"garbage\",\"imp_urls\":[\"http://google.com\"],\"data\":***SERVER_PARAMS***}],\"settings\":{\"click_urls\":[\"@gw_adnetid@\"],\"imp_urls\":[],\"nofill_urls\":[\"http://google.com\"],\"refresh\":\"60\"}}}".replace("***ADAPTER_CLASS_NAME***", str).replace("***SERVER_PARAMS***", jSONObject.toString());
    }

    public static AdRequest b(Map<String, String> map, NetworkConfig networkConfig) {
        Bundle networkExtrasBundle;
        AdRequest.Builder builder = new AdRequest.Builder();
        if (networkConfig.B()) {
            if (networkConfig.i().i() != null && networkConfig.i().i().f() != null) {
                Bundle bundle = new Bundle();
                bundle.putInt("restricted_to_buyer_network", networkConfig.i().i().f().intValue());
                bundle.putString("allowed_targeting_servers", "adx,gmob");
                builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
            }
        } else if (!networkConfig.v()) {
            String a10 = a(map, networkConfig);
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ad", a10);
            bundle2.putBoolean("_mts", true);
            builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle2);
        }
        AdRequest testRequest = MediationTestSuite.getTestRequest();
        if (testRequest != null) {
            try {
                Class<? extends MediationExtrasReceiver> asSubclass = Class.forName(networkConfig.i().f()).asSubclass(MediationExtrasReceiver.class);
                if (asSubclass != null && (networkExtrasBundle = testRequest.getNetworkExtrasBundle(asSubclass)) != null) {
                    builder.addNetworkExtrasBundle(asSubclass, networkExtrasBundle);
                }
            } catch (ClassCastException unused) {
                Log.e("gma_test", "Adapter class not a mediation adapter: " + networkConfig.i().f());
            } catch (ClassNotFoundException unused2) {
                Log.e("gma_test", "Class not found for adapter class" + networkConfig.i().f());
            }
            if (testRequest.getKeywords() != null) {
                for (String str : testRequest.getKeywords()) {
                    builder.addKeyword(str);
                }
            }
            if (testRequest.getContentUrl() != null) {
                builder.setContentUrl(testRequest.getContentUrl());
            }
        }
        return builder.build();
    }

    public static String c(AdFormat adFormat) {
        int i10 = a.f20908a[adFormat.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        Log.w("gma_test", "Unknown format requested, no available Ad Manager ad unit ID.");
                        return "";
                    }
                    return "/6499/example/native";
                }
                return "/6499/example/rewarded-video";
            }
            return "/6499/example/interstitial";
        }
        return "/6499/example/banner";
    }

    public static String d(AdFormat adFormat) {
        int i10 = a.f20908a[adFormat.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        Log.w("gma_test", "Unknown format requested, no available AdMob ad unit ID.");
                        return "";
                    }
                    return "ca-app-pub-3940256099942544/2247696110";
                }
                return "ca-app-pub-3940256099942544/5224354917";
            }
            return "ca-app-pub-3940256099942544/1033173712";
        }
        return "ca-app-pub-3940256099942544/6300978111";
    }
}
