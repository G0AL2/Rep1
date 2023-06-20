package com.bytedance.sdk.openadsdk.component.c;

import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.e.r;
import com.bytedance.sdk.openadsdk.h.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: TTAppOpenAdReport.java */
/* loaded from: classes.dex */
public class a {
    public static void a(final int i10, final int i11) {
        b.a().a(new com.bytedance.sdk.openadsdk.h.a() { // from class: com.bytedance.sdk.openadsdk.component.c.a.1
            @Override // com.bytedance.sdk.openadsdk.h.a
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i10);
                jSONObject.put("user_timeout_time", i11);
                return com.bytedance.sdk.openadsdk.h.a.b.b().a("openad_load_ad_timeout").b(jSONObject.toString());
            }
        });
    }

    public static void b(n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", n.c(nVar) ? "video_normal_ad" : "image_normal_ad");
        e.b(nVar, "cache_loss", hashMap);
    }

    public static void a(n nVar, int i10, int i11, float f10) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", n.c(nVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("skip_time", Integer.valueOf(i10));
        hashMap.put("skip_show_time", Integer.valueOf(i11));
        hashMap.put("total_time", Float.valueOf(f10));
        e.b(nVar, "skip", hashMap);
    }

    public static void b(n nVar, long j10, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("size", Long.valueOf(nVar.J().o()));
        hashMap.put("video_duration", Double.valueOf(nVar.J().r()));
        hashMap.put("order", Integer.valueOf(z10 ? 1 : 2));
        e.a(nVar, "download_video_duration", j10, hashMap);
    }

    public static void a(n nVar, long j10, float f10, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", n.c(nVar) ? "video_normal_ad" : "image_normal_ad");
        if (z10) {
            hashMap.put("video_duration", Float.valueOf(f10));
            hashMap.put("video_percent", Integer.valueOf((int) (((j10 * 1.0d) / 10.0d) / f10)));
        } else {
            hashMap.put("image_duration", Float.valueOf(f10));
        }
        e.b(nVar, "destroy", hashMap);
    }

    public static void a(n nVar) {
        e.b(nVar, "cache_expire", (Map<String, Object>) null);
    }

    public static void a(n nVar, long j10, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put("order", Integer.valueOf(z10 ? 1 : 2));
        e.a(nVar, "download_image_duration", j10, hashMap);
    }

    public static void a(n nVar, int i10, r rVar) {
        long j10;
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", n.c(nVar) ? "video_normal_ad" : "image_normal_ad");
        hashMap.put("open_ad_cache_type", Integer.valueOf(i10));
        if (rVar != null) {
            rVar.b(System.currentTimeMillis());
            hashMap.put("client_start_time", Long.valueOf(rVar.b()));
            hashMap.put("sever_time", Long.valueOf(rVar.d()));
            hashMap.put("network_time", Long.valueOf(rVar.c()));
            hashMap.put("client_end_time", Long.valueOf(rVar.e()));
            hashMap.put("download_resource_duration", Long.valueOf(rVar.g()));
            hashMap.put("resource_source", Integer.valueOf(rVar.h()));
            j10 = rVar.f();
        } else {
            j10 = 0;
        }
        e.a(nVar, "load_net_duration", j10, hashMap);
    }

    public static void a(n nVar, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put("openad_creative_type", n.c(nVar) ? "video_normal_ad" : "image_normal_ad");
        e.a(nVar, "load_cache_duration", j10, hashMap);
    }
}
