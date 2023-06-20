package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class a {
    public static x a(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.J;
        Map<String, x> map = iAConfigManager.f16865a;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return iAConfigManager.f16865a.get(str);
    }

    public static y b(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.J;
        Map<String, y> map = iAConfigManager.f16866b;
        if (map != null && map.containsKey(str)) {
            return iAConfigManager.f16866b.get(str);
        }
        IAlog.c("Requested unit config doesn't exists - %s", str);
        return null;
    }

    public static String a() {
        int i10 = e.f16935a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            return "wv.inner-active.mobi/simpleM2M/";
        }
        return property + ".inner-active.mobi/simpleM2M/";
    }

    public static String b() {
        int i10 = e.f16935a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
        if (TextUtils.isEmpty(property)) {
            return "https://" + IAConfigManager.J.f16873i.f17014g;
        }
        return a(property, "Event");
    }

    public static String a(String str, String str2) {
        if (Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(str).matches()) {
            return "https://" + str + "/simpleM2M/" + str2;
        }
        return "https://" + str + ".inner-active.mobi/simpleM2M/" + str2;
    }
}
