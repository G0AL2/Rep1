package com.amazon.device.ads;

import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DtbDebugProperties {
    public static final String AAX_HOSTNAME = "aaxHostname";
    public static final String AAX_ROUTE53_ENABLED_CNAME = "route53EnabledAAXCname";
    public static final String CONFIG_HOSTNAME = "configHostname";
    public static final String INTERNAL_DEBUG_MODE = "internalDebugMode";
    public static final String SIS_URL = "sisUrl";
    private static final String TEST_OVERRIDE_FILE = "com.amazon.device.ads.dtb.debug.override";
    public static final String USE_SECURE = "useSecure";
    private static DtbDebugProperties debugProperties = null;
    static boolean isInternalDebugMode = false;
    private static Set<String> preDefinedKeys;
    private static HashMap<String, String> propertyMap = new HashMap<>();
    private static boolean isInitialized = false;

    DtbDebugProperties() {
    }

    public static String getAaxHostName(String str) {
        return getDebugProperty(AAX_HOSTNAME, str);
    }

    public static String getConfigHostName(String str) {
        return getDebugProperty(CONFIG_HOSTNAME, str);
    }

    public static HashMap<String, String> getDebugParams() {
        if (AdRegistration.isTestMode() && isInternalDebugMode) {
            return propertyMap;
        }
        return new HashMap<>();
    }

    private static String getDebugProperty(String str, String str2) {
        HashMap<String, String> hashMap;
        return (!AdRegistration.isTestMode() || !isInternalDebugMode || (hashMap = propertyMap) == null || hashMap.get(str) == null) ? str2 : propertyMap.get(str);
    }

    public static String getEncodedUrlParams() {
        if (isInternalDebugMode) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry<String, String> entry : propertyMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                try {
                    if (!preDefinedKeys.contains(key.toLowerCase())) {
                        sb2.append('&');
                        sb2.append(key);
                        sb2.append('=');
                        sb2.append(URLEncoder.encode(value, "UTF-8"));
                    }
                } catch (UnsupportedEncodingException e10) {
                    DtbLog.debugError(String.format("Cannot encode %d=%d due to exception %d", key, value, e10.getMessage()));
                }
            }
            return sb2.toString();
        }
        return "";
    }

    public static DtbDebugProperties getInstance() {
        if (!isInitialized) {
            DtbLog.debug("Running the debug initialization.");
            debugProperties = new DtbDebugProperties();
            HashSet hashSet = new HashSet();
            preDefinedKeys = hashSet;
            hashSet.add(AAX_HOSTNAME.toLowerCase());
            preDefinedKeys.add(SIS_URL.toLowerCase());
            preDefinedKeys.add(USE_SECURE.toLowerCase());
            preDefinedKeys.add(CONFIG_HOSTNAME.toLowerCase());
            preDefinedKeys.add(INTERNAL_DEBUG_MODE.toLowerCase());
            initializeDtbDebugProperties();
        }
        return debugProperties;
    }

    public static boolean getIsSecure(boolean z10) {
        String debugProperty = getDebugProperty(USE_SECURE, "");
        if (debugProperty.equals(InneractiveMediationDefs.SHOW_HOUSE_AD_YES)) {
            return true;
        }
        if (debugProperty.equals("false")) {
            return false;
        }
        return z10;
    }

    public static String getRoute53EnabledCNAME(String str) {
        return getDebugProperty(AAX_ROUTE53_ENABLED_CNAME, str);
    }

    public static String getSISUrl(String str) {
        return getDebugProperty(SIS_URL, str);
    }

    public static void initializeDtbDebugProperties() {
        try {
            if (AdRegistration.isTestMode() && AdRegistration.getContext() == null) {
                DtbLog.debugError("unable to initialize debug preferences without setting app context");
                throw new IllegalArgumentException("unable to initialize debug preferences without setting app context");
            }
            String string = DtbCommonUtils.getApplicationBundle().getString(TEST_OVERRIDE_FILE);
            if (!DtbCommonUtils.isNullOrEmpty(string)) {
                DtbLog.debug("Override file: " + string);
                InputStream resourceAsStream = DtbCommonUtils.getResourceAsStream(string);
                if (resourceAsStream == null) {
                    DtbLog.debug("Failed to read override from classpath, trying to read override file from absolute location: " + string);
                    File file = new File(string);
                    if (!file.exists()) {
                        DtbLog.debug("Couldn't find the override file, skipping.");
                        return;
                    }
                    resourceAsStream = new FileInputStream(file);
                }
                DtbLog.debug("Reading debug params..");
                Properties properties = new Properties();
                properties.load(resourceAsStream);
                for (Map.Entry entry : properties.entrySet()) {
                    String str = (String) entry.getKey();
                    if (DtbCommonUtils.isNullOrWhiteSpace(str)) {
                        DtbLog.debug("Error: The debug property name must not be null or empty string");
                    } else {
                        String str2 = (String) entry.getValue();
                        if (str2 != null) {
                            str2 = str2.trim();
                        }
                        DtbLog.debug("Overrides found: " + str + " --> " + str2);
                        if (str.equalsIgnoreCase(INTERNAL_DEBUG_MODE)) {
                            isInternalDebugMode = str2.equalsIgnoreCase(InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
                        }
                        propertyMap.put(str, str2);
                    }
                }
                resourceAsStream.close();
            }
        } catch (Exception e10) {
            DtbLog.debug("Error:: Failed to read the debug params. ignoring." + e10.getStackTrace());
        }
        isInitialized = true;
    }

    public static void resetProperties() {
        isInitialized = false;
        propertyMap = new HashMap<>();
    }

    public boolean isDebugMode() {
        return isInternalDebugMode;
    }
}
