package com.bytedance.sdk.openadsdk.core.e;

import com.bytedance.sdk.openadsdk.AdSlot;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AdLogInfoModel.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f12015a;

    /* renamed from: b  reason: collision with root package name */
    public int f12016b;

    /* renamed from: c  reason: collision with root package name */
    public int f12017c = 1;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList<Integer> f12018d;

    /* renamed from: e  reason: collision with root package name */
    public AdSlot f12019e;

    public static void a(b bVar) {
        if (bVar == null || bVar.d() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.h.b.a().a(new com.bytedance.sdk.openadsdk.h.a() { // from class: com.bytedance.sdk.openadsdk.core.e.b.1
            @Override // com.bytedance.sdk.openadsdk.h.a
            public com.bytedance.sdk.openadsdk.h.a.a a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", b.this.c());
                jSONObject.put("err_code", b.this.b());
                jSONObject.put("server_res_str", b.this.a());
                if (b.this.e() != null && b.this.e().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) b.this.e()).toString());
                }
                com.bytedance.sdk.component.utils.l.a("AdLogInfoModel", "rd_client_custom_error = ", jSONObject);
                return com.bytedance.sdk.openadsdk.h.a.b.b().a("rd_client_custom_error").a(b.this.d().getDurationSlotType()).b(jSONObject.toString());
            }
        });
    }

    public String a() {
        return this.f12015a;
    }

    public void a(int i10) {
        this.f12016b = i10;
    }

    public void a(AdSlot adSlot) {
        this.f12019e = adSlot;
    }

    public void a(String str) {
        this.f12015a = str;
    }

    public void a(ArrayList<Integer> arrayList) {
        this.f12018d = arrayList;
    }

    public int b() {
        return this.f12016b;
    }

    public void b(int i10) {
        this.f12017c = i10;
    }

    public int c() {
        return this.f12017c;
    }

    public AdSlot d() {
        return this.f12019e;
    }

    public ArrayList<Integer> e() {
        return this.f12018d;
    }
}
