package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f16936a = new HashMap();

    public boolean a(String str, boolean z10) {
        try {
            if (this.f16936a.containsKey(str)) {
                return Boolean.parseBoolean(this.f16936a.get(str));
            }
        } catch (Exception unused) {
        }
        return z10;
    }
}
