package com.bytedance.sdk.openadsdk.i;

import android.content.Context;
import android.location.Address;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.j;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.u;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.Map;

/* compiled from: TTAdNetDepend.java */
/* loaded from: classes.dex */
public class c implements com.bytedance.sdk.component.e.c.b {

    /* renamed from: a  reason: collision with root package name */
    String f13341a = "sp_multi_ttadnet_config";

    /* renamed from: b  reason: collision with root package name */
    private Context f13342b;

    public c(Context context) {
        this.f13342b = context;
    }

    @Override // com.bytedance.sdk.component.e.c.b
    public int a() {
        return Integer.parseInt("1371");
    }

    @Override // com.bytedance.sdk.component.e.c.b
    public Address a(Context context) {
        return null;
    }

    @Override // com.bytedance.sdk.component.e.c.b
    public String b() {
        return "pangle_sdk";
    }

    @Override // com.bytedance.sdk.component.e.c.b
    public String c() {
        return MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
    }

    @Override // com.bytedance.sdk.component.e.c.b
    public int d() {
        return BuildConfig.VERSION_CODE;
    }

    @Override // com.bytedance.sdk.component.e.c.b
    public String e() {
        return j.a(this.f13342b);
    }

    @Override // com.bytedance.sdk.component.e.c.b
    public String[] f() {
        String[] strArr = {"tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com", "tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com"};
        String w10 = m.h().w();
        if (!TextUtils.isEmpty(w10)) {
            return ("SG".equals(w10) || "CN".equals(w10)) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
        }
        int o10 = u.o();
        return (o10 == 2 || o10 == 1) ? new String[]{"tnc16-alisg.isnssdk.com", "tnc16-alisg.byteoversea.com", "tnc16-useast1a.isnssdk.com", "tnc16-useast1a.byteoversea.com"} : strArr;
    }

    @Override // com.bytedance.sdk.component.e.c.b
    public String a(Context context, String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.d.a.b(this.f13341a, str, str2);
    }

    @Override // com.bytedance.sdk.component.e.c.b
    public void a(Context context, Map<String, ?> map) {
        if (map != null) {
            try {
                for (Map.Entry<String, ?> entry : map.entrySet()) {
                    Object value = entry.getValue();
                    if (value instanceof Integer) {
                        com.bytedance.sdk.openadsdk.multipro.d.a.a(this.f13341a, entry.getKey(), (Integer) value);
                    } else if (value instanceof Long) {
                        com.bytedance.sdk.openadsdk.multipro.d.a.a(this.f13341a, entry.getKey(), (Long) value);
                    } else if (value instanceof Float) {
                        com.bytedance.sdk.openadsdk.multipro.d.a.a(this.f13341a, entry.getKey(), (Float) value);
                    } else if (value instanceof Boolean) {
                        com.bytedance.sdk.openadsdk.multipro.d.a.a(this.f13341a, entry.getKey(), (Boolean) value);
                    } else if (value instanceof String) {
                        com.bytedance.sdk.openadsdk.multipro.d.a.a(this.f13341a, entry.getKey(), (String) value);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
