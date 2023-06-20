package com.inmobi.media;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: FileManager.java */
/* loaded from: classes3.dex */
public final class is {

    /* renamed from: a  reason: collision with root package name */
    private static final String f25788a = "is";

    @SuppressLint({"SdCardPath"})
    public static boolean a(Context context) {
        Iterator it = Arrays.asList("carbpreference", "IMAdMLtvpRuleCache", "inmobiAppAnalyticsSession", "aeskeygenerate", "impref", "IMAdTrackerStatusUpload", "IMAdMMediationCache", "inmobiAppAnalyticsAppId", "inmobiAppAnalyticsSession", "inmobisdkaid", "IMAdTrackerStatusUpload", "testAppPref").iterator();
        while (it.hasNext()) {
            File file = new File("/data/data/" + context.getPackageName() + "/shared_prefs/" + ((String) it.next()) + ".xml");
            if (file.exists()) {
                file.delete();
            }
        }
        List<String> asList = Arrays.asList(hf.a("carb_store"), hf.a("aes_key_store"), hf.a("mraid_js_store"), hf.a("omid_js_store"), hf.a("user_info_store"), hf.a("coppa_store"), hf.a("gesture_info_store"), hf.a("unified_id_info_store"), hf.a("app_bundle_store"));
        if (Build.VERSION.SDK_INT >= 24) {
            for (String str : asList) {
                context.deleteSharedPreferences(str);
            }
        } else {
            Iterator it2 = asList.iterator();
            while (it2.hasNext()) {
                File file2 = new File("/data/data/" + context.getPackageName() + "/shared_prefs/" + ((String) it2.next()) + ".xml");
                if (file2.exists()) {
                    file2.delete();
                }
            }
        }
        for (String str2 : Arrays.asList("inmobi.cache", "inmobi.cache.data", "inmobi.cache.data.events.number", "inmobi.cache.data.events.timestamp")) {
            if (context.getCacheDir() != null) {
                File file3 = new File(context.getCacheDir(), str2);
                if (file3.exists()) {
                    file3.delete();
                }
            }
        }
        for (String str3 : Arrays.asList("eventlog", "imai_click_events")) {
            if (context.getDir("data", 0) != null) {
                File file4 = new File(context.getDir("data", 0), str3);
                if (file4.exists()) {
                    file4.delete();
                }
            }
        }
        return b(context).size() != 0;
    }

    public static List<String> b(Context context) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        hashSet.add("adcache.db");
        hashSet.add("appengage.db");
        hashSet.add("im.db");
        hashSet.add("ltvp.db");
        hashSet.add("analytics.db");
        hashSet.add("com.im.db");
        hashSet.add("IMInitialization.db");
        String[] databaseList = context.databaseList();
        if (databaseList != null && databaseList.length > 0) {
            for (String str : databaseList) {
                if (hashSet.contains(str) && !a(context, str)) {
                    arrayList.add(str);
                } else if (str.matches("com\\.im_([0-9]+\\.){3}db") && !str.equals(hd.f25647a) && !a(context, str)) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    private static boolean a(Context context, String str) {
        File databasePath = context.getDatabasePath(str);
        return databasePath == null || !databasePath.exists() || context.deleteDatabase(str);
    }

    public static void a(File file) {
        try {
            if (file.exists()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            a(file2);
                        } else {
                            file2.delete();
                        }
                    }
                }
                file.delete();
            }
        } catch (Exception unused) {
        }
    }

    public static long a(String str) {
        try {
            File file = new File(Uri.parse(str).getPath());
            if (file.exists()) {
                return file.length();
            }
            return 0L;
        } catch (Exception unused) {
            return 0L;
        }
    }
}
