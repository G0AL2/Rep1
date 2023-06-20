package com.bytedance.sdk.openadsdk.b.b.b;

import org.json.JSONObject;

/* compiled from: FeedPlayModel.java */
/* loaded from: classes.dex */
public class h implements c {

    /* renamed from: a  reason: collision with root package name */
    private long f11034a;

    /* renamed from: b  reason: collision with root package name */
    private long f11035b;

    /* renamed from: c  reason: collision with root package name */
    private int f11036c;

    public void a(long j10) {
        this.f11034a = j10;
    }

    public void b(long j10) {
        this.f11035b = j10;
    }

    public void a(int i10) {
        this.f11036c = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.b.b.b.c
    public void a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("video_start_duration", this.f11034a);
            jSONObject.put("video_cache_size", this.f11035b);
            jSONObject.put("is_auto_play", this.f11036c);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
