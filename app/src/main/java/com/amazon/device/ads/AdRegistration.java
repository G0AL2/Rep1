package com.amazon.device.ads;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AdRegistration {
    private static final String LOGTAG = "AdRegistration";
    private static AdRegistration adRegistrationInstance = null;
    private static CMPFlavor cmpFlavor = null;
    private static boolean consentStringDirty = false;
    private static ConsentStatus currentConsentStatus = null;
    private static String currentVendorListString = null;
    private static Map<String, String> customDictionary = null;
    private static HashMap<String, SlotGroup> groups = null;
    private static String lastSeenNonIABEncodedConsentString = null;
    private static boolean locationEnabled = false;
    private static String mAppKey = null;
    private static Context mContext = null;
    static List<String> providersProprietaryKeys = null;
    private static String sdkDistributionPlace = null;
    private static boolean testMode = false;
    private ActivityMonitor activityMonitor;
    static MRAIDPolicy mraidPolicy = MRAIDPolicy.AUTO_DETECT;
    static String[] serverlessMarkers = {"com.amazon.admob_adapter.APSAdMobCustomBannerEvent", "com.amazon.mopub_adapter.APSMopubCustomBannerEvent"};
    private static Map<String, DTBCacheData> adMobRequestIdMap = new HashMap();
    private Set<AdProvider> providers = new HashSet();
    private EventDistributor eventDistributor = new EventDistributor();

    /* renamed from: com.amazon.device.ads.AdRegistration$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$DTBBannerType;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$DTBSlotType;

        static {
            int[] iArr = new int[DTBSlotType.values().length];
            $SwitchMap$com$amazon$device$ads$DTBSlotType = iArr;
            try {
                iArr[DTBSlotType.SLOT_320_50.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$DTBSlotType[DTBSlotType.SLOT_300_250.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$DTBSlotType[DTBSlotType.SLOT_728_90.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$DTBSlotType[DTBSlotType.SLOT_SMART.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[DTBBannerType.values().length];
            $SwitchMap$com$amazon$device$ads$DTBBannerType = iArr2;
            try {
                iArr2[DTBBannerType.PHONE_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$DTBBannerType[DTBBannerType.TABLET_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum CMPFlavor {
        CMP_NOT_DEFINED,
        GOOGLE_CMP,
        MOPUB_CMP,
        ADMOB_CMP
    }

    /* loaded from: classes.dex */
    public enum ConsentStatus {
        CONSENT_NOT_DEFINED,
        EXPLICIT_YES,
        EXPLICIT_NO,
        UNKNOWN
    }

    /* loaded from: classes.dex */
    public static class SlotGroup {
        String name;
        Set<DTBAdSize> slots;

        public SlotGroup(String str) {
            if (!DtbCommonUtils.isNullOrEmpty(str)) {
                this.name = str;
                this.slots = new HashSet();
                return;
            }
            throw new IllegalArgumentException("Slot Group name cannot be null or empty");
        }

        public void addSlot(DTBAdSize dTBAdSize) {
            try {
                for (DTBAdSize dTBAdSize2 : this.slots) {
                    if (dTBAdSize2.getWidth() == dTBAdSize.getWidth() && dTBAdSize2.getHeight() == dTBAdSize.getHeight() && dTBAdSize2.getDTBAdType() == dTBAdSize.getDTBAdType()) {
                        return;
                    }
                }
                this.slots.add(dTBAdSize);
            } catch (RuntimeException e10) {
                DtbLog.error(AdRegistration.LOGTAG, "Fail to execute addSlot method in SlotGroup class");
                l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute addSlot method in SlotGroup class", e10);
            }
        }

        public DTBAdSize getSizeByBannerType(DTBBannerType dTBBannerType) {
            try {
                int i10 = AnonymousClass1.$SwitchMap$com$amazon$device$ads$DTBBannerType[dTBBannerType.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        return null;
                    }
                    return getSizeByWidthAndHeight(728, 90);
                }
                return getSizeByWidthAndHeight(320, 50);
            } catch (RuntimeException e10) {
                DtbLog.error(AdRegistration.LOGTAG, "Fail to execute getSizeByBannerType method in SlotGroup class");
                l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getSizeByBannerType method in SlotGroup class", e10);
                return null;
            }
        }

        public DTBAdSize getSizeBySlotType(DTBSlotType dTBSlotType) {
            try {
                int i10 = AnonymousClass1.$SwitchMap$com$amazon$device$ads$DTBSlotType[dTBSlotType.ordinal()];
                int i11 = 50;
                int i12 = 320;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return null;
                            }
                            if (DtbDeviceDataRetriever.isTablet()) {
                                i11 = 90;
                                i12 = 728;
                            }
                            return getSizeByWidthAndHeight(i12, i11);
                        }
                        return getSizeByWidthAndHeight(728, 90);
                    }
                    return getSizeByWidthAndHeight(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
                }
                return getSizeByWidthAndHeight(320, 50);
            } catch (RuntimeException e10) {
                DtbLog.error(AdRegistration.LOGTAG, "Fail to execute getSizeBySlotType method in SlotGroup class");
                l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getSizeBySlotType method in SlotGroup class", e10);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public DTBAdSize getSizeBySlotUUID(String str) {
            for (DTBAdSize dTBAdSize : this.slots) {
                if (dTBAdSize.getSlotUUID().equals(str)) {
                    return dTBAdSize;
                }
            }
            return null;
        }

        public DTBAdSize getSizeByWidthAndHeight(int i10, int i11) {
            return getSizeByWidthHeightType(i10, i11, AdType.DISPLAY);
        }

        public DTBAdSize getSizeByWidthHeightType(int i10, int i11, AdType adType) {
            try {
                for (DTBAdSize dTBAdSize : this.slots) {
                    if (dTBAdSize.getHeight() == i11 && dTBAdSize.getWidth() == i10 && dTBAdSize.getDTBAdType() == adType) {
                        return dTBAdSize;
                    }
                }
                return null;
            } catch (RuntimeException e10) {
                DtbLog.error(AdRegistration.LOGTAG, "Fail to execute getSizeByWidthHeightType method in SlotGroup class");
                l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getSizeByWidthHeightType method in SlotGroup class", e10);
                return null;
            }
        }
    }

    private AdRegistration(String str, Context context) throws IllegalArgumentException {
        if (context != null && str != null && !"".equals(str.trim())) {
            try {
                int i10 = l2.a.f33662f;
                mAppKey = str;
                Context applicationContext = context.getApplicationContext();
                mContext = applicationContext;
                l2.a.e(applicationContext);
                DtbSharedPreferences createInstance = DtbSharedPreferences.createInstance();
                context.checkCallingOrSelfPermission("android.permission.INTERNET");
                if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
                    DtbLog.error(LOGTAG, "Network task cannot commence because the INTERNET permission is missing from the app's manifest.");
                }
                String versionInUse = createInstance.getVersionInUse();
                if (versionInUse == null || DtbCommonUtils.isNullOrEmpty(versionInUse)) {
                    createInstance.setVersionInUse("9.3.0");
                    createInstance.setGooglePlayServicesUnavailable(false);
                }
                currentConsentStatus = ConsentStatus.CONSENT_NOT_DEFINED;
                cmpFlavor = CMPFlavor.CMP_NOT_DEFINED;
                consentStringDirty = false;
                customDictionary = new HashMap();
                JSONObject loadJsonFromAsset = DTBAdUtil.loadJsonFromAsset("aps_distribution_marker.json");
                if (loadJsonFromAsset != null) {
                    try {
                        sdkDistributionPlace = loadJsonFromAsset.getString("distribution");
                        return;
                    } catch (Exception unused) {
                        DtbLog.warn("Unable to get distribution place value");
                        return;
                    }
                }
                return;
            } catch (ClassNotFoundException unused2) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing APSAndroidShared SDK. Please import the APSAndroidShared SDK to your project. For further details, please refer to our Android SDK documentation.");
                DtbLog.fatal(LOGTAG, "Missing APSAndroidShared SDK. Please import the APSAndroidShared SDK to your project. For further details, please refer to our Android SDK documentation.", illegalArgumentException);
                throw illegalArgumentException;
            }
        }
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Invalid parameters for initialization.");
        DtbLog.fatal(LOGTAG, "mDTB SDK initialize failed due to invalid registration parameters.", illegalArgumentException2);
        throw illegalArgumentException2;
    }

    public static void addAdMobCache(String str, DTBCacheData dTBCacheData) {
        if (adMobRequestIdMap == null) {
            adMobRequestIdMap = new HashMap();
        }
        removeExpiredAdMobCache();
        synchronized (adMobRequestIdMap) {
            adMobRequestIdMap.put(str, dTBCacheData);
        }
    }

    public static void addCustomAttribute(String str, String str2) {
        if (isInitialized()) {
            try {
                if (customDictionary == null) {
                    customDictionary = new HashMap();
                }
                customDictionary.put(str, str2);
                return;
            } catch (RuntimeException e10) {
                DtbLog.error(LOGTAG, "Fail to execute addCustomAttribute method");
                l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute addCustomAttribute method", e10);
                return;
            }
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    public static void addProvider(AdProvider adProvider) {
        if (adRegistrationInstance != null) {
            Class<?> cls = adProvider.getClass();
            for (AdProvider adProvider2 : adRegistrationInstance.providers) {
                if (adProvider2.getClass().equals(cls)) {
                    return;
                }
            }
            adRegistrationInstance.providers.add(adProvider);
            appendProprietaryProviderKeys(adProvider.getProprietaryKeys());
            return;
        }
        throw new IllegalStateException("Instance must be initialized prior to adding providers");
    }

    public static void addSlotGroup(SlotGroup slotGroup) {
        try {
            if (groups == null) {
                groups = new HashMap<>();
            }
            groups.put(slotGroup.name, slotGroup);
        } catch (RuntimeException e10) {
            DtbLog.error(LOGTAG, "Fail to execute addSlotGroup method");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute addSlotGroup method", e10);
        }
    }

    static void appendProprietaryProviderKeys(String[] strArr) {
        if (providersProprietaryKeys == null) {
            providersProprietaryKeys = new ArrayList();
        }
        for (String str : strArr) {
            providersProprietaryKeys.add(str);
        }
    }

    public static void enableLogging(boolean z10) {
        try {
            if (z10) {
                DtbLog.setLogLevel(DTBLogLevel.All);
            } else {
                DtbLog.setLogLevel(DTBLogLevel.Error);
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOGTAG, "Fail to execute enableLogging method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute enableLogging method", e10);
        }
    }

    public static void enableTesting(boolean z10) {
        try {
            if (!z10) {
                testMode = false;
            } else if (!DTBAdUtil.isInstalledFromAppStore(mContext)) {
                testMode = z10;
                DtbLog.enableCallerInfo(z10);
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOGTAG, "Fail to execute enableTesting method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute enableTesting method", e10);
        }
    }

    private ActivityMonitor getActivityMonitor() {
        return this.activityMonitor;
    }

    public static DTBCacheData getAdMobCache(String str) {
        if (DtbCommonUtils.isNullOrEmpty(str) || adMobRequestIdMap == null) {
            return null;
        }
        removeExpiredAdMobCache();
        return adMobRequestIdMap.get(str);
    }

    public static Map<String, DTBCacheData> getAdMobCacheData() {
        return adMobRequestIdMap;
    }

    public static Set<AdProvider> getAdProviders() {
        AdRegistration adRegistration = adRegistrationInstance;
        if (adRegistration != null) {
            return adRegistration.providers;
        }
        return null;
    }

    public static String getAppKey() {
        return mAppKey;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CMPFlavor getCMPFlavor() {
        if (isInitialized()) {
            String cMPFlavor = DtbSharedPreferences.getInstance().getCMPFlavor();
            if (cMPFlavor == null) {
                return cmpFlavor;
            }
            return CMPFlavor.valueOf(cMPFlavor);
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ConsentStatus getConsentStatus() {
        if (isInitialized()) {
            String consentStatus = DtbSharedPreferences.getInstance().getConsentStatus();
            if (consentStatus == null) {
                return currentConsentStatus;
            }
            return ConsentStatus.valueOf(consentStatus);
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Context getContext() {
        return mContext;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Activity getCurrentActivity() {
        return adRegistrationInstance.getActivityMonitor().getCurrentActivity();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, String> getCustomDictionary() {
        return customDictionary;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getEncodedNonIABString() {
        String encodedNonIABConsentString;
        if (consentStringDirty) {
            String vendorList = DtbSharedPreferences.getInstance().getVendorList();
            String consentStatus = DtbSharedPreferences.getInstance().getConsentStatus();
            String cMPFlavor = DtbSharedPreferences.getInstance().getCMPFlavor();
            if (vendorList == null && consentStatus == null && cMPFlavor == null) {
                encodedNonIABConsentString = "";
            } else {
                encodedNonIABConsentString = DTBGDPREncoder.getEncodedNonIABConsentString(getVendorListFromString(vendorList));
                if (!DtbCommonUtils.isNullOrEmpty(encodedNonIABConsentString)) {
                    DtbSharedPreferences.getInstance().saveNonIABCustomConsent(encodedNonIABConsentString);
                }
            }
            consentStringDirty = false;
            lastSeenNonIABEncodedConsentString = encodedNonIABConsentString;
            return encodedNonIABConsentString;
        }
        return lastSeenNonIABEncodedConsentString;
    }

    @Deprecated
    public static EventDistributor getEventDistributer() {
        AdRegistration adRegistration = adRegistrationInstance;
        if (adRegistration != null) {
            return adRegistration.eventDistributor;
        }
        throw new IllegalStateException("Instance must be initialized prior using getEventDistributer API");
    }

    public static AdRegistration getInstance(String str, Context context) throws IllegalArgumentException {
        if (!isInitialized()) {
            adRegistrationInstance = new AdRegistration(str, context);
            DTBMetricsConfiguration.getInstance();
        } else if (str != null && !str.equals(mAppKey)) {
            mAppKey = str;
            DtbSharedPreferences.createInstance();
        }
        adRegistrationInstance.setActivityMonitor(new ActivityMonitor(context));
        return adRegistrationInstance;
    }

    public static MRAIDPolicy getMRAIDPolicy() {
        return mraidPolicy;
    }

    public static List<String> getProprietaryProviderKeys() {
        if (providersProprietaryKeys == null) {
            providersProprietaryKeys = new ArrayList();
        }
        return providersProprietaryKeys;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getSDKDistributionPlace() {
        return sdkDistributionPlace;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] getServerlessMarkers() {
        return serverlessMarkers;
    }

    public static SlotGroup getSlotGroup(String str) {
        if (str != null) {
            try {
                HashMap<String, SlotGroup> hashMap = groups;
                if (hashMap != null) {
                    return hashMap.get(str);
                }
                return null;
            } catch (RuntimeException e10) {
                DtbLog.error(LOGTAG, "Fail to execute getSlotGroup method");
                l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute getSlotGroup method", e10);
                return null;
            }
        }
        return null;
    }

    private static String getStringFromVendorList(List<Integer> list) {
        return list.toString();
    }

    private static List<Integer> getVendorListFromString(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && str.length() > 2) {
            for (String str2 : str.substring(1, str.length() - 1).split(",")) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str2.trim())));
            }
        }
        return arrayList;
    }

    public static String getVersion() {
        return DtbCommonUtils.getSDKVersion();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean hasAdapters() {
        for (String str : serverlessMarkers) {
            try {
                Class.forName(str);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean isConsentStatusUnknown() {
        try {
            if (currentConsentStatus == ConsentStatus.CONSENT_NOT_DEFINED || currentConsentStatus == ConsentStatus.UNKNOWN) {
                return true;
            }
            return DtbSharedPreferences.getInstance().getVendorList() == null;
        } catch (RuntimeException e10) {
            DtbLog.error(LOGTAG, "Fail to execute isConsentStatusUnknown method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute isConsentStatusUnknown method", e10);
            return true;
        }
    }

    public static boolean isInitialized() {
        return adRegistrationInstance != null;
    }

    public static boolean isLocationEnabled() {
        return locationEnabled;
    }

    public static boolean isTestMode() {
        return testMode;
    }

    public static void removeAdMobCache(String str) {
        Map<String, DTBCacheData> map = adMobRequestIdMap;
        if (map != null) {
            synchronized (map) {
                adMobRequestIdMap.remove(str);
            }
        }
    }

    public static void removeCustomAttribute(String str) {
        if (isInitialized()) {
            try {
                if (DtbCommonUtils.isNullOrEmpty(customDictionary)) {
                    return;
                }
                customDictionary.remove(str);
                return;
            } catch (RuntimeException e10) {
                DtbLog.error(LOGTAG, "Fail to execute removeCustomAttribute method");
                l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute removeCustomAttribute method", e10);
                return;
            }
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    static void removeExpiredAdMobCache() {
        Map<String, DTBCacheData> map = adMobRequestIdMap;
        if (map != null) {
            synchronized (map) {
                long time = new Date().getTime();
                Iterator<Map.Entry<String, DTBCacheData>> it = adMobRequestIdMap.entrySet().iterator();
                while (it.hasNext()) {
                    if (time - it.next().getValue().getResponseTimeStamp() > 300000) {
                        it.remove();
                    }
                }
            }
        }
    }

    public static void resetNonIAB() {
        try {
            DtbSharedPreferences.getInstance().removeCMPFlavor();
            DtbSharedPreferences.getInstance().removeConsentStatus();
            DtbSharedPreferences.getInstance().removeVendorList();
            DtbSharedPreferences.getInstance().removeNonIABCustomConsent();
            currentVendorListString = null;
            currentConsentStatus = ConsentStatus.CONSENT_NOT_DEFINED;
            cmpFlavor = CMPFlavor.CMP_NOT_DEFINED;
            consentStringDirty = false;
            lastSeenNonIABEncodedConsentString = null;
        } catch (RuntimeException e10) {
            DtbLog.error(LOGTAG, "Fail to execute resetNonIAB method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute resetNonIAB method", e10);
        }
    }

    private void setActivityMonitor(ActivityMonitor activityMonitor) {
        this.activityMonitor = activityMonitor;
    }

    public static void setAdNetworkInfo(DTBAdNetworkInfo dTBAdNetworkInfo) {
        try {
            addCustomAttribute("mediationName", dTBAdNetworkInfo.getAdNetworkName());
        } catch (RuntimeException e10) {
            DtbLog.error(LOGTAG, "Fail to add mediation name to the custom attribute");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute addCustomAttribute method", e10);
        }
    }

    @Deprecated
    public static void setAppKey(String str) throws IllegalArgumentException {
        if (isInitialized()) {
            if (!DtbCommonUtils.isNullOrEmpty(str)) {
                mAppKey = str;
                DtbSharedPreferences.createInstance();
                return;
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid parameters:appKey for initialization.");
            DtbLog.fatal(LOGTAG, "mDTB SDK initialize failed due to invalid registration parameter:appKey.", illegalArgumentException);
            throw illegalArgumentException;
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    public static void setCMPFlavor(CMPFlavor cMPFlavor) {
        if (isInitialized()) {
            try {
                if (cMPFlavor == CMPFlavor.CMP_NOT_DEFINED) {
                    DtbLog.error(LOGTAG, "Set cmp type failed due to invalid cmp type parameters. Not allowed to set cmp type to not defined.");
                    return;
                }
                CMPFlavor cMPFlavor2 = cmpFlavor;
                if (cMPFlavor2 == null || cMPFlavor2 != cMPFlavor) {
                    consentStringDirty = true;
                    cmpFlavor = cMPFlavor;
                    DtbSharedPreferences.getInstance().saveCMPFlavor(cMPFlavor.name());
                    return;
                }
                return;
            } catch (RuntimeException e10) {
                DtbLog.error(LOGTAG, "Fail to execute setCMPFlavor method");
                l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute setCMPFlavor method", e10);
                return;
            }
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    public static void setConsentStatus(ConsentStatus consentStatus) {
        if (isInitialized()) {
            try {
                if (consentStatus == ConsentStatus.CONSENT_NOT_DEFINED) {
                    DtbLog.error(LOGTAG, "Set consent status failed due to invalid consent status parameters. Not allowed to set consent not defined.");
                    return;
                }
                ConsentStatus consentStatus2 = currentConsentStatus;
                if (consentStatus2 == null || consentStatus2 != consentStatus) {
                    consentStringDirty = true;
                    currentConsentStatus = consentStatus;
                    DtbSharedPreferences.getInstance().saveConsentStatus(consentStatus.name());
                    return;
                }
                return;
            } catch (RuntimeException e10) {
                DtbLog.error(LOGTAG, "Fail to execute setConsentStatus method");
                l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute setConsentStatus method", e10);
                return;
            }
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    @Deprecated
    public static void setContext(Context context) {
        if (context != null) {
            mContext = context.getApplicationContext();
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid parameters:context for initialization.");
        DtbLog.fatal(LOGTAG, "mDTB SDK initialize failed due to invalid registration parameter:context.", illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void setMRAIDPolicy(MRAIDPolicy mRAIDPolicy) {
        mraidPolicy = mRAIDPolicy;
        DTBAdRequest.resetMraid();
    }

    public static void setMRAIDSupportedVersions(String[] strArr) {
        DTBAdRequest.setMRAIDSupportedVersions(strArr);
    }

    @Deprecated
    public static void setServerlessMarkers(String[] strArr) {
        serverlessMarkers = strArr;
    }

    public static void setVendorList(List<Integer> list) {
        if (isInitialized()) {
            try {
                if (list == null) {
                    DtbLog.error(LOGTAG, "Set vendor list failed due to invalid vendor list parameters with value null.");
                    return;
                }
                String stringFromVendorList = getStringFromVendorList(list);
                String str = currentVendorListString;
                if (str == null || !str.equals(stringFromVendorList)) {
                    consentStringDirty = true;
                    currentVendorListString = stringFromVendorList;
                    DtbSharedPreferences.getInstance().saveVendorList(stringFromVendorList);
                    return;
                }
                return;
            } catch (RuntimeException e10) {
                DtbLog.error(LOGTAG, "Fail to execute setVendorList method");
                l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute setVendorList method", e10);
                return;
            }
        }
        throw new IllegalStateException("mDTB was not initialized, please use AdRegistration.getInstance(...) before using other SDK calls");
    }

    public static void useGeoLocation(boolean z10) {
        locationEnabled = z10;
    }

    public static void enableLogging(boolean z10, DTBLogLevel dTBLogLevel) {
        try {
            if (z10) {
                DtbLog.setLogLevel(dTBLogLevel);
            } else {
                DtbLog.setLogLevel(DTBLogLevel.Error);
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOGTAG, "Fail to execute enableLogging method with logLevel argument");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute enableLogging method with logLevel argument", e10);
        }
    }
}
