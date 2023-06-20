package com.ironsource.sdk.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class FeaturesManager {

    /* renamed from: c  reason: collision with root package name */
    private static volatile FeaturesManager f27683c;

    /* renamed from: a  reason: collision with root package name */
    private Map<String, ?> f27684a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<String> f27685b = new a(this);

    /* loaded from: classes3.dex */
    final class a extends ArrayList<String> {
        a(FeaturesManager featuresManager) {
            add("webviewperad-v1");
            add("noPackagesInstallationPolling");
            add("removeViewOnDestroy");
            add("bannerMultipleInstances");
            add("lastUpdateTimeRemoval");
            add("isnFileSystemAPI");
            add("controlActivityLifecycle");
            add("bannersOpenMeasurement");
        }
    }

    private FeaturesManager() {
        if (f27683c != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        this.f27684a = new HashMap();
    }

    public static FeaturesManager getInstance() {
        if (f27683c == null) {
            synchronized (FeaturesManager.class) {
                if (f27683c == null) {
                    f27683c = new FeaturesManager();
                }
            }
        }
        return f27683c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ArrayList<String> a() {
        return new ArrayList<>(this.f27685b);
    }

    public int getDebugMode() {
        Integer num = 0;
        try {
            if (this.f27684a.containsKey("debugMode")) {
                num = (Integer) this.f27684a.get("debugMode");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public void updateDebugConfigurations(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        this.f27684a = map;
    }
}
