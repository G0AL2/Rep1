package com.bytedance.sdk.openadsdk.core.j;

import com.bytedance.sdk.openadsdk.core.j.c.a;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastIcon.java */
/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: i  reason: collision with root package name */
    private long f12418i;

    /* renamed from: j  reason: collision with root package name */
    private long f12419j;

    public b(int i10, int i11, long j10, long j11, a.EnumC0172a enumC0172a, a.b bVar, String str, List<com.bytedance.sdk.openadsdk.core.j.b.c> list, List<com.bytedance.sdk.openadsdk.core.j.b.c> list2, String str2) {
        super(i10, i11, enumC0172a, bVar, str, list, list2, str2);
        this.f12418i = j10;
        this.f12419j = j11;
    }

    @Override // com.bytedance.sdk.openadsdk.core.j.c
    public JSONObject a() throws JSONException {
        JSONObject a10 = super.a();
        if (a10 != null) {
            a10.put("offset", this.f12418i);
            a10.put("duration", this.f12419j);
        }
        return a10;
    }

    public static b a(JSONObject jSONObject) {
        c b10 = c.b(jSONObject);
        if (b10 == null) {
            return null;
        }
        return new b(b10.f12440a, b10.f12441b, jSONObject.optLong("offset", -1L), jSONObject.optLong("duration", -1L), b10.f12442c, b10.f12443d, b10.f12444e, b10.f12445f, b10.f12446g, b10.f12447h);
    }
}
