package com.ironsource.sdk.a;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class b implements com.ironsource.a.c {

    /* renamed from: a  reason: collision with root package name */
    private static Map<String, Object> f27576a = new HashMap();

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f27577a;

        /* renamed from: b  reason: collision with root package name */
        public String f27578b;

        /* renamed from: c  reason: collision with root package name */
        public Context f27579c;

        /* renamed from: d  reason: collision with root package name */
        public String f27580d;
    }

    private b(a aVar) {
        Context context = aVar.f27579c;
        com.ironsource.sdk.utils.a a10 = com.ironsource.sdk.utils.a.a(context);
        f27576a.put("deviceos", SDKUtils.encodeString(a10.f28252c));
        f27576a.put("deviceosversion", SDKUtils.encodeString(a10.f28253d));
        f27576a.put("deviceapilevel", Integer.valueOf(a10.f28254e));
        f27576a.put("deviceoem", SDKUtils.encodeString(a10.f28250a));
        f27576a.put("devicemodel", SDKUtils.encodeString(a10.f28251b));
        f27576a.put("bundleid", SDKUtils.encodeString(context.getPackageName()));
        f27576a.put("applicationkey", SDKUtils.encodeString(aVar.f27578b));
        f27576a.put("sessionid", SDKUtils.encodeString(aVar.f27577a));
        f27576a.put("sdkversion", SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f27576a.put("applicationuserid", SDKUtils.encodeString(aVar.f27580d));
        f27576a.put("env", "prod");
        f27576a.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "n");
        f27576a.put("connectiontype", com.ironsource.d.a.a(aVar.f27579c));
    }

    public /* synthetic */ b(a aVar, byte b10) {
        this(aVar);
    }

    public static void a(String str) {
        f27576a.put("connectiontype", SDKUtils.encodeString(str));
    }

    @Override // com.ironsource.a.c
    public final Map<String, Object> a() {
        return f27576a;
    }
}
