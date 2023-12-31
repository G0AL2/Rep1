package com.ironsource.mediationsdk.server;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.environment.a;
import com.ironsource.environment.c;
import com.ironsource.environment.h;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.utils.IronSourceAES;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.g;
import com.ironsource.mediationsdk.utils.k;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ServerURL {
    private static final String AMPERSAND = "&";
    private static final String ANDROID = "android";
    private static final String APPLICATION_KEY = "applicationKey";
    private static final String APPLICATION_USER_ID = "applicationUserId";
    private static final String APPLICATION_VERSION = "appVer";
    private static final String AUID = "auid";
    private static String BASE_URL_PREFIX = "https://init.supersonicads.com/sdk/v";
    private static String BASE_URL_SUFFIX = "?request=";
    private static final String BROWSER_USER_AGENT = "browserUserAgent";
    private static final String BUNDLE_ID = "bundleId";
    private static final String CONNECTION_TYPE = "connType";
    private static final String COPPA = "coppa";
    private static final String DEVICE_LANG = "deviceLang";
    private static final String DEVICE_MAKE = "devMake";
    private static final String DEVICE_MODEL = "devModel";
    private static final String EQUAL = "=";
    private static final String FIRST_SESSION = "fs";
    private static final String GAID = "advId";
    private static final String IMPRESSION = "impression";
    private static final String ISO_COUNTRY_CODE = "icc";
    private static final String MEDIATION_TYPE = "mt";
    private static final String MOBILE_CARRIER = "mCar";
    private static final String MOBILE_COUNTRY_CODE = "mcc";
    private static final String MOBILE_NETWORK_CODE = "mnc";
    private static final String OS_VERSION = "osVer";
    private static final String PLACEMENT = "placementId";
    private static final String PLATFORM_KEY = "platform";
    private static final String PLUGIN_FW_VERSION = "plugin_fw_v";
    private static final String PLUGIN_TYPE = "pluginType";
    private static final String PLUGIN_VERSION = "pluginVersion";
    private static final String REWARDED_VIDEO_MANUAL_MODE = "rvManual";
    private static final String SDK_VERSION = "sdkVersion";
    private static final String SERR = "serr";
    private static final String TIME_ZONE_ID = "tz";
    private static final String TIME_ZONE_OFFSET = "tzOff";

    private static String createURLParams(Vector<Pair<String, String>> vector) {
        Iterator<Pair<String, String>> it = vector.iterator();
        String str = "";
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            if (str.length() > 0) {
                str = str + AMPERSAND;
            }
            str = str + ((String) next.first) + EQUAL + URLEncoder.encode((String) next.second, "UTF-8");
        }
        return str;
    }

    private static String getBaseUrl(String str) {
        return BASE_URL_PREFIX + str + BASE_URL_SUFFIX;
    }

    public static String getCPVProvidersURL(Context context, String str, String str2, String str3, String str4, boolean z10, Vector<Pair<String, String>> vector) {
        Vector vector2 = new Vector();
        vector2.add(new Pair(PLATFORM_KEY, "android"));
        vector2.add(new Pair(APPLICATION_KEY, str));
        vector2.add(new Pair(APPLICATION_USER_ID, str2));
        vector2.add(new Pair(SDK_VERSION, IronSourceUtils.getSDKVersion()));
        if (z10) {
            vector2.add(new Pair(REWARDED_VIDEO_MANUAL_MODE, z10 ? "1" : "0"));
        }
        if (IronSourceUtils.getSerr() == 0) {
            vector2.add(new Pair(SERR, String.valueOf(IronSourceUtils.getSerr())));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginType())) {
            vector2.add(new Pair(PLUGIN_TYPE, ConfigFile.getConfigFile().getPluginType()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginVersion())) {
            vector2.add(new Pair(PLUGIN_VERSION, ConfigFile.getConfigFile().getPluginVersion()));
        }
        if (!TextUtils.isEmpty(ConfigFile.getConfigFile().getPluginFrameworkVersion())) {
            vector2.add(new Pair(PLUGIN_FW_VERSION, ConfigFile.getConfigFile().getPluginFrameworkVersion()));
        }
        if (!TextUtils.isEmpty(str3)) {
            vector2.add(new Pair(GAID, str3));
        }
        if (!TextUtils.isEmpty(str4)) {
            vector2.add(new Pair(MEDIATION_TYPE, str4));
        }
        String c10 = c.c(context, context.getPackageName());
        if (!TextUtils.isEmpty(c10)) {
            vector2.add(new Pair(APPLICATION_VERSION, c10));
        }
        int i10 = Build.VERSION.SDK_INT;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        vector2.add(new Pair(OS_VERSION, sb2.toString()));
        vector2.add(new Pair(DEVICE_MAKE, Build.MANUFACTURER));
        vector2.add(new Pair(DEVICE_MODEL, Build.MODEL));
        boolean firstSession = IronSourceUtils.getFirstSession(context);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(firstSession ? 1 : 0);
        vector2.add(new Pair(FIRST_SESSION, sb3.toString()));
        ConcurrentHashMap<String, List<String>> d10 = k.a().d();
        if (d10.containsKey("is_child_directed")) {
            vector2.add(new Pair("coppa", d10.get("is_child_directed").get(0)));
        }
        String connectionType = IronSourceUtils.getConnectionType(context);
        if (!TextUtils.isEmpty(connectionType)) {
            vector2.add(new Pair(CONNECTION_TYPE, connectionType));
        }
        if (vector != null) {
            vector2.addAll(vector);
        }
        String r10 = h.r();
        if (r10.length() != 0) {
            vector2.add(new Pair(BROWSER_USER_AGENT, r10));
        }
        String str5 = null;
        try {
            str5 = h.a(context) + Constants.FILENAME_SEQUENCE_SEPARATOR + h.b(context);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (str5 != null && str5.length() != 0) {
            vector2.add(new Pair(DEVICE_LANG, str5));
        }
        vector2.add(new Pair(BUNDLE_ID, context.getPackageName()));
        StringBuilder sb4 = new StringBuilder();
        sb4.append(a.AnonymousClass1.c(context));
        vector2.add(new Pair(MOBILE_COUNTRY_CODE, sb4.toString()));
        StringBuilder sb5 = new StringBuilder();
        sb5.append(a.AnonymousClass1.d(context));
        vector2.add(new Pair(MOBILE_NETWORK_CODE, sb5.toString()));
        String j10 = h.j(context);
        if (!TextUtils.isEmpty(j10)) {
            vector2.add(new Pair(ISO_COUNTRY_CODE, j10));
        }
        String i11 = h.i(context);
        if (!TextUtils.isEmpty(i11)) {
            vector2.add(new Pair(MOBILE_CARRIER, i11));
        }
        String c11 = h.c();
        if (!TextUtils.isEmpty(c11)) {
            vector2.add(new Pair(TIME_ZONE_ID, c11));
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(h.b());
        vector2.add(new Pair(TIME_ZONE_OFFSET, sb6.toString()));
        String y10 = h.y(context);
        if (!TextUtils.isEmpty(y10)) {
            vector2.add(new Pair(AUID, y10));
        }
        com.ironsource.environment.d.b bVar = new com.ironsource.environment.d.b();
        JSONObject a10 = bVar.f26142b.a(bVar.f26141a);
        qe.k.e(a10, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        vector2.addAll(IronSourceUtils.parseJsonToPairVector(a10));
        return getBaseUrl(IronSourceUtils.getSDKVersion()) + URLEncoder.encode(IronSourceAES.encode(g.a().b(), createURLParams(vector2)), "UTF-8");
    }

    public static String getRequestURL(String str, boolean z10, int i10) {
        Vector vector = new Vector();
        vector.add(new Pair("impression", Boolean.toString(z10)));
        vector.add(new Pair(PLACEMENT, Integer.toString(i10)));
        String createURLParams = createURLParams(vector);
        return str + AMPERSAND + createURLParams;
    }

    private static void setBaseUrlPrefix(String str) {
        BASE_URL_PREFIX = str;
    }
}
