package com.bytedance.sdk.openadsdk.core;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.o;
import java.util.List;
import org.json.JSONObject;

/* compiled from: NetApi.java */
/* loaded from: classes.dex */
public interface n<T> {

    /* compiled from: NetApi.java */
    /* loaded from: classes.dex */
    public interface a {
        void a(int i10, String str);

        void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar);
    }

    /* compiled from: NetApi.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(int i10, String str);

        void a(o.b bVar);
    }

    com.bytedance.sdk.component.adexpress.a.c.a a();

    com.bytedance.sdk.openadsdk.b.i a(List<T> list);

    JSONObject a(JSONObject jSONObject);

    void a(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.e.o oVar, int i10, a aVar);

    void a(com.bytedance.sdk.openadsdk.core.e.n nVar, List<FilterWord> list);

    void a(String str);

    void a(JSONObject jSONObject, b bVar);

    void a(JSONObject jSONObject, String str);

    com.bytedance.sdk.openadsdk.b.i b(JSONObject jSONObject);
}
