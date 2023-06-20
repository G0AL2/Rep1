package com.google.ads.mediation.inmobi;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.chartboost.sdk.Privacy.model.COPPA;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiNative;
import com.inmobi.sdk.InMobiSdk;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InMobiAdapterUtils.java */
/* loaded from: classes2.dex */
public class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InMobiAdapterUtils.java */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f20625a;

        static {
            int[] iArr = new int[InMobiAdRequestStatus.StatusCode.values().length];
            f20625a = iArr;
            try {
                iArr[InMobiAdRequestStatus.StatusCode.NO_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.NETWORK_UNREACHABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.NO_FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.REQUEST_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.REQUEST_PENDING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.REQUEST_TIMED_OUT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.SERVER_ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.AD_ACTIVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.EARLY_REFRESH_REQUEST.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.REPETITIVE_LOAD.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.GDPR_COMPLIANCE_ENFORCED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.GET_SIGNALS_CALLED_WHILE_LOADING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.LOAD_WITH_RESPONSE_CALLED_WHILE_LOADING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.INVALID_RESPONSE_IN_LOAD.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.MONETIZATION_DISABLED.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.CONFIGURATION_ERROR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f20625a[InMobiAdRequestStatus.StatusCode.LOW_MEMORY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Bundle bundle) {
        InMobiSdk.AgeGroup d10;
        InMobiSdk.Education e10;
        if (bundle == null) {
            Log.d(InMobiMediationAdapter.TAG, "Bundle extras are null");
            bundle = new Bundle();
        }
        String str = "";
        String str2 = str;
        String str3 = str2;
        for (String str4 : bundle.keySet()) {
            String string = bundle.getString(str4);
            if (str4.equals("AREA_CODE")) {
                if (!"".equals(string)) {
                    InMobiSdk.setAreaCode(string);
                }
            } else if (str4.equals("AGE")) {
                try {
                    if (!"".equals(string)) {
                        InMobiSdk.setAge(Integer.parseInt(string));
                    }
                } catch (NumberFormatException e11) {
                    Log.d(InMobiMediationAdapter.TAG, "Please Set age properly", e11);
                }
            } else if (str4.equals("POSTAL_CODE")) {
                if (!"".equals(string)) {
                    InMobiSdk.setPostalCode(string);
                }
            } else if (str4.equals("LANGUAGE")) {
                if (!"".equals(string)) {
                    InMobiSdk.setLanguage(string);
                }
            } else if (str4.equals("CITY")) {
                str = string;
            } else if (str4.equals("STATE")) {
                str2 = string;
            } else if (str4.equals("COUNTRY")) {
                str3 = string;
            } else if (str4.equals("AGE_GROUP")) {
                if (string != null && (d10 = d(string)) != null) {
                    InMobiSdk.setAgeGroup(d10);
                }
            } else if (str4.equals("EDUCATION")) {
                if (string != null && (e10 = e(string)) != null) {
                    InMobiSdk.setEducation(e10);
                }
            } else if (str4.equals("LOGLEVEL")) {
                if (string != null) {
                    InMobiSdk.setLogLevel(f(string));
                } else {
                    InMobiSdk.setLogLevel(InMobiSdk.LogLevel.NONE);
                }
            } else if (str4.equals("INTERESTS")) {
                InMobiSdk.setInterests(string);
            }
        }
        if (Build.VERSION.SDK_INT < 19 || Objects.equals(str, "") || Objects.equals(str2, "") || Objects.equals(str3, "")) {
            return;
        }
        InMobiSdk.setLocationWithCityStateCountry(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HashMap<String, String> b(MediationAdConfiguration mediationAdConfiguration) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("tp", "c_admob");
        if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 1) {
            hashMap.put(COPPA.COPPA_STANDARD, "1");
        } else {
            hashMap.put(COPPA.COPPA_STANDARD, "0");
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static HashMap<String, String> c(MediationAdRequest mediationAdRequest) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("tp", "c_admob");
        if (mediationAdRequest.taggedForChildDirectedTreatment() == 1) {
            hashMap.put(COPPA.COPPA_STANDARD, "1");
        } else {
            hashMap.put(COPPA.COPPA_STANDARD, "0");
        }
        return hashMap;
    }

    private static InMobiSdk.AgeGroup d(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2144603857:
                if (str.equals("BETWEEN_55_AND_65")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1892470079:
                if (str.equals("ABOVE_65")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1873932011:
                if (str.equals("BELOW_18")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1017207884:
                if (str.equals("BETWEEN_25_AND_29")) {
                    c10 = 3;
                    break;
                }
                break;
            case -337149426:
                if (str.equals("BETWEEN_45_AND_54")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1346187892:
                if (str.equals("BETWEEN_30_AND_34")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1470305006:
                if (str.equals("BETWEEN_35_AND_44")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1723710283:
                if (str.equals("BETWEEN_18_AND_24")) {
                    c10 = 7;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return InMobiSdk.AgeGroup.BETWEEN_55_AND_65;
            case 1:
                return InMobiSdk.AgeGroup.ABOVE_65;
            case 2:
                return InMobiSdk.AgeGroup.BELOW_18;
            case 3:
                return InMobiSdk.AgeGroup.BETWEEN_25_AND_29;
            case 4:
                return InMobiSdk.AgeGroup.BETWEEN_45_AND_54;
            case 5:
                return InMobiSdk.AgeGroup.BETWEEN_30_AND_34;
            case 6:
                return InMobiSdk.AgeGroup.BETWEEN_35_AND_44;
            case 7:
                return InMobiSdk.AgeGroup.BETWEEN_18_AND_24;
            default:
                return null;
        }
    }

    private static InMobiSdk.Education e(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2023680018:
                if (str.equals("EDUCATION_COLLEGEORGRADUATE")) {
                    c10 = 0;
                    break;
                }
                break;
            case 1302797304:
                if (str.equals("EDUCATION_POSTGRADUATEORABOVE")) {
                    c10 = 1;
                    break;
                }
                break;
            case 1522352361:
                if (str.equals("EDUCATION_HIGHSCHOOLORLESS")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return InMobiSdk.Education.COLLEGE_OR_GRADUATE;
            case 1:
                return InMobiSdk.Education.POST_GRADUATE_OR_ABOVE;
            case 2:
                return InMobiSdk.Education.HIGH_SCHOOL_OR_LESS;
            default:
                return null;
        }
    }

    private static InMobiSdk.LogLevel f(String str) {
        if (str.equals("LOGLEVEL_DEBUG")) {
            return InMobiSdk.LogLevel.DEBUG;
        }
        if (str.equals("LOGLEVEL_ERROR")) {
            return InMobiSdk.LogLevel.ERROR;
        }
        return InMobiSdk.LogLevel.NONE;
    }

    public static int g(InMobiAdRequestStatus inMobiAdRequestStatus) {
        switch (a.f20625a[inMobiAdRequestStatus.getStatusCode().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            case 13:
                return 12;
            case 14:
                return 13;
            case 15:
                return 14;
            case 16:
                return 15;
            case 17:
                return 16;
            case 18:
                return 17;
            case 19:
                return 18;
            case 20:
                return 19;
            case 21:
                return 20;
            default:
                return 99;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long h(Bundle bundle) {
        String string = bundle.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            Log.w(InMobiMediationAdapter.TAG, "Missing or Invalid Placement ID.");
            return 0L;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException e10) {
            Log.w(InMobiMediationAdapter.TAG, "Invalid Placement ID.", e10);
            return 0L;
        }
    }

    public static boolean i(InMobiNative inMobiNative) {
        return (inMobiNative.getAdCtaText() == null || inMobiNative.getAdDescription() == null || inMobiNative.getAdIconUrl() == null || inMobiNative.getAdLandingPageUrl() == null || inMobiNative.getAdTitle() == null) ? false : true;
    }
}
