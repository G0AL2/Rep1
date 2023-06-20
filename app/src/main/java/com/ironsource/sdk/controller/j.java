package com.ironsource.sdk.controller;

import android.text.TextUtils;
import com.ironsource.sdk.g.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, com.ironsource.sdk.g.c> f27809a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, com.ironsource.sdk.g.c> f27810b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, com.ironsource.sdk.g.c> f27811c = new LinkedHashMap();

    public final com.ironsource.sdk.g.c a(d.e eVar, String str) {
        Map<String, com.ironsource.sdk.g.c> c10;
        if (TextUtils.isEmpty(str) || (c10 = c(eVar)) == null) {
            return null;
        }
        return c10.get(str);
    }

    public final com.ironsource.sdk.g.c a(d.e eVar, String str, Map<String, String> map, com.ironsource.sdk.j.a aVar) {
        com.ironsource.sdk.g.c cVar = new com.ironsource.sdk.g.c(str, str, map, aVar);
        a(eVar, str, cVar);
        return cVar;
    }

    public void a(d.e eVar, String str, com.ironsource.sdk.g.c cVar) {
        Map<String, com.ironsource.sdk.g.c> c10;
        if (TextUtils.isEmpty(str) || (c10 = c(eVar)) == null) {
            return;
        }
        c10.put(str, cVar);
    }

    public final Collection<com.ironsource.sdk.g.c> b(d.e eVar) {
        Map<String, com.ironsource.sdk.g.c> c10 = c(eVar);
        return c10 != null ? c10.values() : new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, com.ironsource.sdk.g.c> c(d.e eVar) {
        if (eVar.name().equalsIgnoreCase(d.e.RewardedVideo.name())) {
            return this.f27809a;
        }
        if (eVar.name().equalsIgnoreCase(d.e.Interstitial.name())) {
            return this.f27810b;
        }
        if (eVar.name().equalsIgnoreCase(d.e.Banner.name())) {
            return this.f27811c;
        }
        return null;
    }
}
