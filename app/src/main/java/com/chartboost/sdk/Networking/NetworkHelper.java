package com.chartboost.sdk.Networking;

import android.util.Log;
import com.chartboost.sdk.Libraries.CBLogging;
import java.net.URL;

/* loaded from: classes.dex */
public class NetworkHelper {
    private static String debugEndpoint = null;
    private static boolean isforceSDKToAcceptAllSSLCertsEnabled = false;

    public static String a(String str, String str2) {
        String str3 = debugEndpoint;
        if (str3 != null && !str3.isEmpty()) {
            Log.w("Chartboost", "normalizedUrl: " + str + " to: " + debugEndpoint);
            str = debugEndpoint;
        }
        Object[] objArr = new Object[3];
        objArr[0] = str;
        String str4 = "/";
        if (str2 != null && str2.startsWith("/")) {
            str4 = "";
        }
        objArr[1] = str4;
        if (str2 == null) {
            str2 = "";
        }
        objArr[2] = str2;
        return String.format("%s%s%s", objArr);
    }

    public static String b(String str) {
        URL c10 = c(str);
        if (c10 != null) {
            try {
                return c10.getPath();
            } catch (Exception e10) {
                CBLogging.a("NetworkHelper", "getPathFromUrl: " + str + " : " + e10.toString());
                return "";
            }
        }
        return "";
    }

    public static URL c(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        try {
            return new URL(str);
        } catch (Exception e10) {
            CBLogging.a("NetworkHelper", "stringToURL: " + str + " : " + e10.toString());
            return null;
        }
    }

    private static void setDebugUrl(String str) {
        debugEndpoint = str;
    }

    public static String a(String str) {
        URL c10 = c(str);
        if (c10 != null) {
            try {
                return c10.getProtocol() + "://" + c10.getHost();
            } catch (Exception e10) {
                CBLogging.a("NetworkHelper", "getEndpointFromUrl: " + str + " : " + e10.toString());
                return "";
            }
        }
        return "";
    }

    public static boolean a() {
        return isforceSDKToAcceptAllSSLCertsEnabled;
    }
}
