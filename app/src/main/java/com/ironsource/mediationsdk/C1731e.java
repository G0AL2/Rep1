package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.mediationsdk.e  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1731e {

    /* renamed from: c  reason: collision with root package name */
    private static final C1731e f27032c = new C1731e();

    /* renamed from: a  reason: collision with root package name */
    final ConcurrentHashMap<String, String> f27033a;

    /* renamed from: b  reason: collision with root package name */
    final ConcurrentHashMap<String, String> f27034b;

    private C1731e() {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        this.f27033a = concurrentHashMap;
        concurrentHashMap.put("adcolony", "4.1.6");
        concurrentHashMap.put("vungle", "4.1.5");
        concurrentHashMap.put("applovin", "4.3.3");
        concurrentHashMap.put("admob", "4.3.2");
        ConcurrentHashMap<String, String> concurrentHashMap2 = new ConcurrentHashMap<>();
        this.f27034b = concurrentHashMap2;
        concurrentHashMap2.put("adcolony", "4.1.6");
        concurrentHashMap2.put("admob", "4.3.2");
        concurrentHashMap2.put("applovin", "4.3.3");
        concurrentHashMap2.put("chartboost", "4.1.9");
        concurrentHashMap2.put("fyber", "4.1.0");
        concurrentHashMap2.put("hyprmx", "4.1.2");
        concurrentHashMap2.put("inmobi", "4.3.1");
        concurrentHashMap2.put("maio", "4.1.3");
        concurrentHashMap2.put("tapjoy", "4.0.0");
        concurrentHashMap2.put("unityads", "4.1.4");
        concurrentHashMap2.put("vungle", "4.1.5");
    }

    public static C1731e a() {
        return f27032c;
    }

    private static boolean a(String str, String str2) {
        if (str.equalsIgnoreCase(str2)) {
            return true;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        for (int i10 = 0; i10 < 3; i10++) {
            int parseInt = Integer.parseInt(split[i10]);
            int parseInt2 = Integer.parseInt(split2[i10]);
            if (parseInt2 < parseInt) {
                return false;
            }
            if (parseInt2 > parseInt) {
                return true;
            }
        }
        return true;
    }

    public final boolean a(AbstractAdapter abstractAdapter) {
        if (abstractAdapter == null) {
            return false;
        }
        String version = abstractAdapter.getVersion();
        boolean a10 = a("4.3.0", version);
        if (!a10) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, abstractAdapter.getProviderName() + " adapter " + version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + ", please update your adapter to the latest version", 3);
        }
        return a10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(AbstractAdapter abstractAdapter, Map<String, String> map, String str) {
        if (abstractAdapter == null) {
            return false;
        }
        String lowerCase = abstractAdapter.getProviderName().toLowerCase(Locale.ENGLISH);
        if (map.containsKey(lowerCase)) {
            String version = abstractAdapter.getVersion();
            boolean a10 = a(map.get(lowerCase), version);
            if (!a10) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, abstractAdapter.getProviderName() + " adapter " + version + " is incompatible with SDK version " + IronSourceUtils.getSDKVersion() + " for " + str + " ad unit, please update your adapter to the latest version", 3);
            }
            return a10;
        }
        return true;
    }
}
