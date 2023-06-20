package com.bytedance.sdk.openadsdk.b;

import com.bytedance.sdk.openadsdk.b.h;
import com.bytedance.sdk.openadsdk.h.c.c;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: StatsEventThread.java */
/* loaded from: classes.dex */
public class t extends h<c.a> {

    /* renamed from: l  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.n<a> f11169l;

    public t(String str, String str2, f fVar, com.bytedance.sdk.openadsdk.core.n nVar, h.c cVar, h.b bVar) {
        super(str, str2, fVar, nVar, cVar, bVar);
        this.f11169l = com.bytedance.sdk.openadsdk.core.m.f();
    }

    @Override // com.bytedance.sdk.openadsdk.b.h
    public i a(List<c.a> list) {
        if (this.f11169l == null) {
            this.f11169l = com.bytedance.sdk.openadsdk.core.m.f();
        }
        if (list == null || list.size() == 0 || !com.bytedance.sdk.openadsdk.core.i.e.a()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (c.a aVar : list) {
                jSONArray.put(aVar.f13321b);
            }
            jSONObject.put("stats_list", jSONArray);
        } catch (Exception unused) {
        }
        return this.f11169l.b(jSONObject);
    }

    @Override // com.bytedance.sdk.openadsdk.b.h
    protected boolean a() {
        return false;
    }
}
