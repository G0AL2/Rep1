package com.inmobi.sdk;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import android.util.Base64;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.media.dg;
import com.inmobi.media.dh;
import com.inmobi.media.fq;
import com.inmobi.media.fs;
import com.inmobi.media.gd;
import com.inmobi.media.hh;
import com.inmobi.media.ho;
import com.inmobi.media.hp;
import com.inmobi.media.hu;
import com.inmobi.media.hw;
import com.inmobi.media.hy;
import com.inmobi.media.ib;
import com.inmobi.media.ie;
import com.inmobi.media.ig;
import com.inmobi.media.iq;
import com.inmobi.media.ir;
import com.inmobi.media.jf;
import com.inmobi.media.ji;
import com.inmobi.media.jk;
import com.inmobi.media.jl;
import com.inmobi.unification.sdk.InitializationStatus;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class InMobiSdk {
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";

    /* renamed from: a  reason: collision with root package name */
    private static final String f26029a = "InMobiSdk";

    /* renamed from: com.inmobi.sdk.InMobiSdk$6  reason: invalid class name */
    /* loaded from: classes3.dex */
    static /* synthetic */ class AnonymousClass6 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26039a;

        static {
            int[] iArr = new int[LogLevel.values().length];
            f26039a = iArr;
            try {
                iArr[LogLevel.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26039a[LogLevel.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26039a[LogLevel.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum AgeGroup {
        BELOW_18("below18"),
        BETWEEN_18_AND_24("between18and24"),
        BETWEEN_25_AND_29("between25and29"),
        BETWEEN_30_AND_34("between30and34"),
        BETWEEN_35_AND_44("between35and44"),
        BETWEEN_45_AND_54("between45and54"),
        BETWEEN_55_AND_65("between55and65"),
        ABOVE_65("above65");
        
        private String value;

        AgeGroup(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.value;
        }
    }

    /* loaded from: classes3.dex */
    public enum Education {
        HIGH_SCHOOL_OR_LESS("highschoolorless"),
        COLLEGE_OR_GRADUATE("collegeorgraduate"),
        POST_GRADUATE_OR_ABOVE("postgraduateorabove");
        
        private String value;

        Education(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.value;
        }
    }

    /* loaded from: classes3.dex */
    public enum Gender {
        FEMALE(InneractiveMediationDefs.GENDER_FEMALE),
        MALE(InneractiveMediationDefs.GENDER_MALE);
        
        private String value;

        Gender(String str) {
            this.value = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.value;
        }
    }

    /* loaded from: classes3.dex */
    public enum LogLevel {
        NONE,
        ERROR,
        DEBUG
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(final SdkInitializationListener sdkInitializationListener, final String str) {
        if (sdkInitializationListener != null) {
            ji.a().a(new Runnable() { // from class: com.inmobi.sdk.InMobiSdk.3
                @Override // java.lang.Runnable
                public final void run() {
                    InMobiSdk.fireListener(SdkInitializationListener.this, str);
                }
            });
        }
        if (str == null) {
            String str2 = f26029a;
            hu.a((byte) 2, str2, "InMobi SDK initialized with account id: " + ho.g());
            return;
        }
        hu.a((byte) 1, f26029a, str);
    }

    public static void fireListener(SdkInitializationListener sdkInitializationListener, String str) {
        sdkInitializationListener.onInitializationComplete(str == null ? null : new Error(str));
    }

    public static String getToken() {
        return getToken(null, null);
    }

    public static String getVersion() {
        return hp.b();
    }

    @InitializationStatus
    @Deprecated
    public static String init(Context context, String str) {
        return init(context, str, null);
    }

    public static boolean isSDKInitialized() {
        return ho.b();
    }

    public static void setAge(int i10) {
        ig.a(i10);
    }

    public static void setAgeGroup(AgeGroup ageGroup) {
        ig.a(ageGroup.toString().toLowerCase(Locale.ENGLISH));
    }

    public static void setApplicationMuted(boolean z10) {
        ho.a(z10);
    }

    public static void setAreaCode(String str) {
        ig.b(str);
    }

    public static void setEducation(Education education) {
        ig.h(education.toString().toLowerCase(Locale.ENGLISH));
    }

    public static void setGender(Gender gender) {
        ig.g(gender.toString().toLowerCase(Locale.ENGLISH));
    }

    public static void setInterests(String str) {
        ig.j(str);
    }

    public static void setIsAgeRestricted(boolean z10) {
        ig.a(z10);
        iq.a().f();
        if (z10) {
            InMobiUnifiedIdService.reset();
        }
    }

    public static void setLanguage(String str) {
        ig.i(str);
    }

    public static void setLocation(Location location) {
        ig.a(location);
    }

    public static void setLocationWithCityStateCountry(String str, String str2, String str3) {
        ig.d(str);
        ig.e(str2);
        ig.f(str3);
    }

    public static void setLogLevel(LogLevel logLevel) {
        int i10 = AnonymousClass6.f26039a[logLevel.ordinal()];
        if (i10 == 1) {
            hu.a((byte) 0);
        } else if (i10 != 2) {
            hu.a((byte) 2);
        } else {
            hu.a((byte) 1);
        }
    }

    public static void setPartnerGDPRConsent(JSONObject jSONObject) {
        ie.b(jSONObject);
    }

    public static void setPostalCode(String str) {
        ig.c(str);
    }

    public static void setPublisherProvidedUnifiedId(final JSONObject jSONObject) {
        ho.a(new Runnable() { // from class: com.inmobi.sdk.InMobiSdk.5
            @Override // java.lang.Runnable
            public final void run() {
                if (jl.b()) {
                    return;
                }
                jk.b(jSONObject);
            }
        });
    }

    public static void setYearOfBirth(int i10) {
        ig.b(i10);
    }

    public static void updateGDPRConsent(JSONObject jSONObject) {
        ie.a(jSONObject);
    }

    private static void b() {
        ho.a(new Runnable() { // from class: com.inmobi.sdk.InMobiSdk.4
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
                StringBuilder sb2 = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
                for (int i10 = 0; i10 < 4; i10++) {
                    String str = strArr[i10];
                    if (hw.a(ho.c(), str)) {
                        sb2.append("\n");
                        sb2.append(str);
                    }
                }
                hu.a((byte) 2, InMobiSdk.f26029a, sb2.toString());
            }
        });
    }

    public static String getToken(Map<String, String> map, String str) {
        dg.a();
        long currentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            hp.a(map.get("tp"));
            hp.b(map.get("tp-ver"));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("networkType", ib.b());
        hashMap.put("plType", "AB");
        hh.a().a("AdGetSignalsCalled", hashMap);
        if (!ho.a()) {
            hu.a((byte) 1, dg.f25103a, "InMobi SDK is not initialised. Cannot fetch a token.");
            dg.a(90, currentTimeMillis);
            return null;
        } else if (((gd) fs.a("root", ho.f(), null)).i()) {
            dg.a(9, currentTimeMillis);
            return null;
        } else {
            dh dhVar = new dh(new ir(((fq) fs.a("ads", ho.f(), null)).f()));
            dhVar.f25106b = map;
            dhVar.f25105a = str;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("h-user-agent", ho.i());
            dhVar.c(hashMap2);
            dhVar.a();
            if (!dhVar.f25622q) {
                dg.a(21, currentTimeMillis);
                return null;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            hashMap3.put("networkType", ib.b());
            hashMap3.put("plType", "AB");
            hh.a().a("AdGetSignalsSucceeded", hashMap3);
            return new String(Base64.encode(dhVar.f().getBytes(), 8));
        }
    }

    @InitializationStatus
    @Deprecated
    public static String init(final Context context, String str, JSONObject jSONObject) {
        hy.a();
        if (jf.a()) {
            return "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";
        }
        final String trim = str.trim();
        try {
            ie.a(jSONObject);
            if (trim.length() == 0) {
                return "Account id cannot be empty. Please provide a valid account id.";
            }
            if (!hw.a(context, "android.permission.ACCESS_COARSE_LOCATION") && !hw.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                hu.a((byte) 1, f26029a, "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (trim.length() != 32 && trim.length() != 36) {
                hu.a((byte) 2, f26029a, "Invalid account id passed to init. Please provide a valid account id.");
            }
            if (ho.b()) {
                return InitializationStatus.SUCCESS;
            }
            ho.a(context, trim);
            jf.b(context);
            ho.a(new Runnable() { // from class: com.inmobi.sdk.InMobiSdk.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        jf.a(context);
                        ho.k();
                        ho.b(trim);
                        fs.a(trim);
                        jf.c(context);
                    } catch (Exception unused) {
                        String unused2 = InMobiSdk.f26029a;
                    }
                }
            });
            hu.a((byte) 2, f26029a, "InMobi SDK initialized with account id: ".concat(trim));
            b();
            return InitializationStatus.SUCCESS;
        } catch (Exception unused) {
            ho.a((Context) null);
            hu.a((byte) 1, f26029a, "SDK could not be initialized; an unexpected error was encountered.");
            return "SDK could not be initialized; an unexpected error was encountered.";
        }
    }

    static /* synthetic */ Map a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
        hashMap.put("networkType", ib.b());
        hashMap.put("integrationType", "InMobi");
        return hashMap;
    }

    public static void init(final Context context, String str, JSONObject jSONObject, final SdkInitializationListener sdkInitializationListener) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        hy.a();
        if (jf.a()) {
            c(sdkInitializationListener, "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
            return;
        }
        final String trim = str.trim();
        try {
            ie.a(jSONObject);
            if (trim.length() == 0) {
                c(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
                return;
            }
            if (!hw.a(context, "android.permission.ACCESS_COARSE_LOCATION") && !hw.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                hu.a((byte) 1, f26029a, "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (ho.b()) {
                c(sdkInitializationListener, null);
                return;
            }
            ho.a(context, trim);
            jf.b(context);
            b();
            ho.a(new Runnable() { // from class: com.inmobi.sdk.InMobiSdk.2
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        jf.a(context);
                        ho.k();
                        ho.b(trim);
                        fs.a(trim);
                        jf.c(context);
                        InMobiSdk.c(sdkInitializationListener, null);
                        hh.a().a("SdkInitialized", InMobiSdk.a(elapsedRealtime));
                    } catch (Exception unused) {
                        String unused2 = InMobiSdk.f26029a;
                        InMobiSdk.c(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
                    }
                }
            });
        } catch (Exception unused) {
            ho.a((Context) null);
            c(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
        }
    }
}
