package com.amazon.device.ads;

import android.content.SharedPreferences;
import com.inmobi.media.jh;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DtbSharedPreferences {
    private static final String AAX_HOSTNAME_PREF_NAME = "amzn-dtb-ad-aax-hostname";
    private static final String ADID_PREF_NAME = "amzn-dtb-ad-id";
    private static final String BID_TIMEOUT_PREF_NAME = "amzn-dtb-bid-timeout";
    private static final String CONFIG_LAST_CHECKIN_PREF_NAME = "amzn-dtb-ad-sis-last-checkin";
    private static final String CONFIG_TTL_PREF_NAME = "amzn-dtb-ad-config-ttl";
    private static final String DTB_VERSION_IN_USE = "amzn-dtb-version_in_use";
    private static final String ENCODED_PRICE_CHECK_PREF_NAME = "amzn-dtb-enable-encoded-price-check";
    private static final String IDFA_PREF_NAME = "amzn-dtb-idfa";
    private static final String IS_ADID_CHANGED_PREF_NAME = "amzn-dtb-adid-changed";
    private static final String IS_ADID_NEW_PREF_NAME = "amzn-dtb-adid-new";
    private static final String IS_GPS_UNAVAILABLE_PREF_NAME = "amzn-dtb-is-gps-unavailable";
    private static boolean IS_SIS_REGISTERATION_SUCCESSFUL = false;
    private static final String NON_IAB_CMP_FLAVOR = "NON_IAB_CMP_FLAVOR";
    private static final String NON_IAB_CONSENT_STATUS = "NON_IAB_CONSENT_STATUS";
    private static final String NON_IAB_CUSTOM_CONSENT = "NON_IAB_Custom_Consent";
    private static final String NON_IAB_VENDORLIST = "NON_IAB_VENDORLIST";
    private static final String OO_PREF_NAME = "amzn-dtb-oo";
    private static final String PJ_TEMPLATE_PREF_NAME = "amzn-dtb-pj-template";
    private static final String PREF_FILE_NAME = "com.amazon.device.ads.dtb.preferences";
    private static final String SDK_WRAPPER_PING = "sdk-wrapper-ping";
    private static final String SIS_ENDPOINT_PREF_NAME = "amzn-dtb-ad-sis-endpoint";
    private static final String SIS_LAST_CHECKIN_PREF_NAME = "amzn-dtb-ad-sis-last-checkin";
    private static final String SIS_LAST_PING_PREF_NAME = "amzn-dtb-ad-sis-last-ping";
    private static final String SIS_LAST_PING_WEB_RESOURCES = "amzn-dtb-web-resource-ping";
    public static DtbSharedPreferences dtbSharedPreferencesInstance = null;
    private static boolean isIgnore = false;
    private static SharedPreferences sharedPreferences;
    private final String LOG_TAG = DtbSharedPreferences.class.getSimpleName();

    protected DtbSharedPreferences() {
        if (AdRegistration.getContext() != null) {
            sharedPreferences = AdRegistration.getContext().getSharedPreferences(PREF_FILE_NAME, 0);
        }
    }

    private static boolean containsPreference(String str) {
        return getSharedPreferences().contains(str);
    }

    public static DtbSharedPreferences createInstance() {
        DtbSharedPreferences dtbSharedPreferences = new DtbSharedPreferences();
        dtbSharedPreferencesInstance = dtbSharedPreferences;
        return dtbSharedPreferences;
    }

    private static void flushPreference(String str) {
        SharedPreferences sharedPreferences2 = getSharedPreferences();
        if (sharedPreferences2.contains(str)) {
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            edit.remove(str);
            edit.apply();
        }
    }

    public static DtbSharedPreferences getInstance() {
        DtbSharedPreferences dtbSharedPreferences = dtbSharedPreferencesInstance;
        if (dtbSharedPreferences != null) {
            return dtbSharedPreferences;
        }
        throw new IllegalArgumentException("unable to retrieve shared preferences without initialization");
    }

    private static <T> T getPref(String str, Class<T> cls) {
        if (isIgnore) {
            return null;
        }
        SharedPreferences sharedPreferences2 = getSharedPreferences();
        if (cls.isAssignableFrom(String.class)) {
            return (T) sharedPreferences2.getString(str, null);
        }
        if (cls.isAssignableFrom(Set.class)) {
            return (T) sharedPreferences2.getStringSet(str, null);
        }
        if (cls.isAssignableFrom(Boolean.class)) {
            return (T) Boolean.valueOf(sharedPreferences2.getBoolean(str, false));
        }
        if (cls.isAssignableFrom(Long.class)) {
            return (T) Long.valueOf(sharedPreferences2.getLong(str, 0L));
        }
        if (cls.isAssignableFrom(Integer.class)) {
            return (T) Integer.valueOf(sharedPreferences2.getInt(str, 0));
        }
        if (cls.isAssignableFrom(Float.class)) {
            return (T) Float.valueOf(sharedPreferences2.getFloat(str, 0.0f));
        }
        throw new IllegalArgumentException(cls.getName() + " is not supported");
    }

    private static SharedPreferences getSharedPreferences() {
        if (sharedPreferences == null) {
            sharedPreferences = AdRegistration.getContext().getSharedPreferences(PREF_FILE_NAME, 0);
        }
        return sharedPreferences;
    }

    private static <T> void savePref(String str, T t10) {
        SharedPreferences sharedPreferences2;
        if (isIgnore || (sharedPreferences2 = getSharedPreferences()) == null) {
            return;
        }
        SharedPreferences.Editor edit = sharedPreferences2.edit();
        if (t10 instanceof Boolean) {
            edit.putBoolean(str, ((Boolean) t10).booleanValue());
        } else if (t10 instanceof String) {
            edit.putString(str, (String) t10);
        } else if (t10 instanceof Integer) {
            edit.putInt(str, ((Integer) t10).intValue());
        } else if (t10 instanceof Float) {
            edit.putFloat(str, ((Float) t10).floatValue());
        } else if (t10 instanceof Long) {
            edit.putLong(str, ((Long) t10).longValue());
        } else if (t10 instanceof Set) {
            edit.putStringSet(str, (Set) t10);
        } else {
            throw new IllegalArgumentException("Saving of " + t10.getClass() + " is not supported.");
        }
        edit.commit();
    }

    static void setIgnoreMode() {
        isIgnore = true;
    }

    public String getAaxHostname() {
        String str = (String) getPref(AAX_HOSTNAME_PREF_NAME, String.class);
        if (!AdRegistration.isTestMode() || !DtbDebugProperties.isInternalDebugMode) {
            return DtbCommonUtils.isNullOrEmpty(str) ? DtbConstants.AAX_HOSTNAME : str;
        }
        if (str == null) {
            str = DtbConstants.AAX_HOSTNAME;
        }
        return DtbDebugProperties.getAaxHostName(str);
    }

    public String getAdId() {
        return (String) getPref(ADID_PREF_NAME, String.class);
    }

    public int getBidTimeout() {
        Integer num = (Integer) getPref(BID_TIMEOUT_PREF_NAME, Integer.class);
        return (num == null || num.intValue() == 0) ? jh.DEFAULT_BITMAP_TIMEOUT : num.intValue();
    }

    public String getCMPFlavor() {
        return (String) getPref(NON_IAB_CMP_FLAVOR, String.class);
    }

    public Long getConfigLastCheckIn() {
        return (Long) getPref("amzn-dtb-ad-sis-last-checkin", Long.class);
    }

    public long getConfigTtl() {
        long longValue = ((Long) getPref(CONFIG_TTL_PREF_NAME, Long.class)).longValue();
        if (longValue < 1 || longValue > 172800000) {
            return 172800000L;
        }
        return longValue;
    }

    public String getConsentStatus() {
        return (String) getPref(NON_IAB_CONSENT_STATUS, String.class);
    }

    public String getIdfa() {
        return (String) getPref(IDFA_PREF_NAME, String.class);
    }

    public boolean getIsAdIdChanged() {
        return ((Boolean) getPref(IS_ADID_CHANGED_PREF_NAME, Boolean.class)).booleanValue();
    }

    public boolean getIsAdIdNew() {
        return ((Boolean) getPref(IS_ADID_NEW_PREF_NAME, Boolean.class)).booleanValue();
    }

    public boolean getIsSisRegisterationSuccessful() {
        return IS_SIS_REGISTERATION_SUCCESSFUL;
    }

    public String getNonIABCustomConsent() {
        return (String) getPref(NON_IAB_CUSTOM_CONSENT, String.class);
    }

    public synchronized Boolean getOptOut() {
        if (containsPreference(OO_PREF_NAME)) {
            return (Boolean) getPref(OO_PREF_NAME, Boolean.class);
        }
        return null;
    }

    public JSONObject getPJTemplate() {
        try {
            return new JSONObject((String) getPref(PJ_TEMPLATE_PREF_NAME, String.class));
        } catch (Exception unused) {
            JSONObject jSONObject = new JSONObject();
            DtbLog.warn(this.LOG_TAG, "Get Pj template failed when fetching from Cache");
            return jSONObject;
        }
    }

    public String getRoute53EnabledCNAME() {
        if (AdRegistration.isTestMode() && DtbDebugProperties.isInternalDebugMode) {
            return DtbDebugProperties.getRoute53EnabledCNAME(DtbConstants.AAX_ROUTE53_ENABLED_CNAME);
        }
        return DtbConstants.AAX_ROUTE53_ENABLED_CNAME;
    }

    public String getSisEndpoint() {
        String str = (String) getPref(SIS_ENDPOINT_PREF_NAME, String.class);
        if (DtbCommonUtils.isNullOrEmpty(str)) {
            return DtbConstants.SIS_END_POINT + "/api3";
        }
        return str;
    }

    public Long getSisLastCheckIn() {
        return (Long) getPref("amzn-dtb-ad-sis-last-checkin", Long.class);
    }

    public long getSisLastPing() {
        return ((Long) getPref(SIS_LAST_PING_PREF_NAME, Long.class)).longValue();
    }

    public String getVendorList() {
        return (String) getPref(NON_IAB_VENDORLIST, String.class);
    }

    public String getVersionInUse() {
        return (String) getPref(DTB_VERSION_IN_USE, String.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Long getWebResoucesLastPing() {
        return (Long) getPref(SIS_LAST_PING_WEB_RESOURCES, Long.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Long getWrapperDetectionLastPing() {
        return (Long) getPref(SDK_WRAPPER_PING, Long.class);
    }

    public boolean isGooglePlayServicesUnavailable() {
        return ((Boolean) getPref(IS_GPS_UNAVAILABLE_PREF_NAME, Boolean.class)).booleanValue();
    }

    public void removeAdid() {
        flushPreference(ADID_PREF_NAME);
    }

    public void removeBidTimeout() {
        flushPreference(BID_TIMEOUT_PREF_NAME);
    }

    public void removeCMPFlavor() {
        flushPreference(NON_IAB_CMP_FLAVOR);
    }

    public void removeConsentStatus() {
        flushPreference(NON_IAB_CONSENT_STATUS);
    }

    public void removeNonIABCustomConsent() {
        flushPreference(NON_IAB_CUSTOM_CONSENT);
    }

    public void removePJTemplate() {
        flushPreference(PJ_TEMPLATE_PREF_NAME);
    }

    public void removeVendorList() {
        flushPreference(NON_IAB_VENDORLIST);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void resetWebResoucesLastPing() {
        SharedPreferences sharedPreferences2 = getSharedPreferences();
        if (sharedPreferences2 != null) {
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            edit.remove(SIS_LAST_PING_WEB_RESOURCES);
            edit.commit();
        }
    }

    void resetWrapperDetectionLastPing() {
        SharedPreferences sharedPreferences2 = getSharedPreferences();
        if (sharedPreferences2 != null) {
            SharedPreferences.Editor edit = sharedPreferences2.edit();
            edit.remove(SDK_WRAPPER_PING);
            edit.commit();
        }
    }

    public void saveAaxHostname(String str) {
        if (!DtbCommonUtils.isNullOrEmpty(str)) {
            savePref(AAX_HOSTNAME_PREF_NAME, str);
        } else {
            savePref(AAX_HOSTNAME_PREF_NAME, DtbConstants.AAX_HOSTNAME);
        }
    }

    public void saveAdId(String str) {
        if (str != null) {
            savePref(ADID_PREF_NAME, str);
        }
    }

    public void saveBidTimeout(Integer num) {
        savePref(BID_TIMEOUT_PREF_NAME, num);
    }

    public void saveCMPFlavor(String str) {
        savePref(NON_IAB_CMP_FLAVOR, str);
    }

    public void saveConfigLastCheckIn(long j10) {
        savePref("amzn-dtb-ad-sis-last-checkin", Long.valueOf(j10));
    }

    public void saveConfigTtl(long j10) {
        if (j10 >= 1 && j10 <= 172800000) {
            savePref(CONFIG_TTL_PREF_NAME, Long.valueOf(j10));
        } else {
            savePref(CONFIG_TTL_PREF_NAME, 172800000L);
        }
    }

    public void saveConsentStatus(String str) {
        savePref(NON_IAB_CONSENT_STATUS, str);
    }

    public void saveIdfa(String str) {
        if (str != null) {
            savePref(IDFA_PREF_NAME, str);
        } else {
            savePref(IDFA_PREF_NAME, "");
        }
    }

    public void saveIsAdIdChanged(boolean z10) {
        savePref(IS_ADID_CHANGED_PREF_NAME, Boolean.valueOf(z10));
    }

    public void saveIsAdIdNew(boolean z10) {
        savePref(IS_ADID_NEW_PREF_NAME, Boolean.valueOf(z10));
    }

    public void saveNonIABCustomConsent(String str) {
        savePref(NON_IAB_CUSTOM_CONSENT, str);
    }

    public synchronized void saveOptOut(Boolean bool) {
        flushPreference(OO_PREF_NAME);
        if (bool != null) {
            savePref(OO_PREF_NAME, bool);
        }
    }

    public void savePJTemplate(JSONObject jSONObject) {
        if (jSONObject != null) {
            savePref(PJ_TEMPLATE_PREF_NAME, jSONObject.toString());
        }
    }

    public boolean saveSisEndpoint(String str) {
        if (!DtbCommonUtils.isNullOrEmpty(str)) {
            String str2 = (String) getPref(SIS_ENDPOINT_PREF_NAME, String.class);
            String str3 = str + "/api3";
            if (str2 == null || !str2.equals(str3)) {
                savePref(SIS_ENDPOINT_PREF_NAME, str3);
                return true;
            }
            return false;
        }
        savePref(SIS_ENDPOINT_PREF_NAME, DtbConstants.SIS_END_POINT + "/api3");
        return false;
    }

    public void saveSisLastCheckIn(long j10) {
        savePref("amzn-dtb-ad-sis-last-checkin", Long.valueOf(j10));
    }

    public void saveSisLastPing(long j10) {
        savePref(SIS_LAST_PING_PREF_NAME, Long.valueOf(j10));
    }

    public void saveVendorList(String str) {
        savePref(NON_IAB_VENDORLIST, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void saveWebResoucesLastPing(long j10) {
        savePref(SIS_LAST_PING_WEB_RESOURCES, Long.valueOf(j10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void saveWrapperDetectionLastPing(long j10) {
        savePref(SDK_WRAPPER_PING, Long.valueOf(j10));
    }

    public void setGooglePlayServicesUnavailable(boolean z10) {
        savePref(IS_GPS_UNAVAILABLE_PREF_NAME, Boolean.valueOf(z10));
    }

    public void setIsSisRegisterationSuccessful(boolean z10) {
        IS_SIS_REGISTERATION_SUCCESSFUL = z10;
    }

    public void setVersionInUse(String str) {
        savePref(DTB_VERSION_IN_USE, str);
    }
}
