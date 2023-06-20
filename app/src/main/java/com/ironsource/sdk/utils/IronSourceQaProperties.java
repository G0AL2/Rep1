package com.ironsource.sdk.utils;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class IronSourceQaProperties {

    /* renamed from: a  reason: collision with root package name */
    private static IronSourceQaProperties f28236a;

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, String> f28237b = new HashMap();

    private IronSourceQaProperties() {
    }

    public static IronSourceQaProperties getInstance() {
        if (f28236a == null) {
            f28236a = new IronSourceQaProperties();
        }
        return f28236a;
    }

    public static boolean isInitialized() {
        return f28236a != null;
    }

    public Map<String, String> getParameters() {
        return f28237b;
    }

    public void setQaParameter(String str, String str2) {
        if (str == null || str2 == null) {
            return;
        }
        f28237b.put(str, str2);
    }
}
