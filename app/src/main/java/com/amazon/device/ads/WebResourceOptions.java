package com.amazon.device.ads;

/* loaded from: classes.dex */
class WebResourceOptions {
    private static String cdnHost = null;
    private static String[] jsNames = {"aps-mraid.js", "dtb-m.js"};
    private static boolean useLocalOnly = false;

    WebResourceOptions() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getCDNHost() {
        String str = cdnHost;
        if (str == null) {
            str = "c.amazon-adsystem.com/";
        }
        if (str.endsWith("/")) {
            return str;
        }
        return str + "/";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String[] getCDNResources() {
        return jsNames;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isLocalSourcesOnly() {
        return useLocalOnly;
    }

    static void setCDNHost(String str) {
        if (str.equals(cdnHost) || cdnHost == null) {
            return;
        }
        cdnHost = str;
        DtbSharedPreferences.getInstance().resetWebResoucesLastPing();
        WebResourceService.getInstance().deleteWebDirContent();
    }

    static void setCDNResources(String[] strArr) {
        jsNames = strArr;
    }

    static void setLocalSourcesOnly(boolean z10) {
        useLocalOnly = z10;
    }
}
