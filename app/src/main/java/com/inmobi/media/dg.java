package com.inmobi.media;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* compiled from: TokenManager.java */
/* loaded from: classes3.dex */
public class dg {

    /* renamed from: a  reason: collision with root package name */
    public static final String f25103a = "com.inmobi.media.dg";

    /* compiled from: TokenManager.java */
    /* loaded from: classes3.dex */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        static final dg f25104a = new dg();
    }

    public static dg a() {
        return a.f25104a;
    }

    public static void a(int i10, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(System.currentTimeMillis() - j10));
        hashMap.put("networkType", ib.b());
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        hashMap.put("plType", "AB");
        hh.a().a("AdGetSignalsFailed", hashMap);
    }
}
