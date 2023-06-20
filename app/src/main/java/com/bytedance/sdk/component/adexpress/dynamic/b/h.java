package com.bytedance.sdk.component.adexpress.dynamic.b;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: DynamicLayoutUnit.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private String f9612a;

    /* renamed from: b  reason: collision with root package name */
    private float f9613b;

    /* renamed from: c  reason: collision with root package name */
    private float f9614c;

    /* renamed from: d  reason: collision with root package name */
    private float f9615d;

    /* renamed from: e  reason: collision with root package name */
    private float f9616e;

    /* renamed from: f  reason: collision with root package name */
    private float f9617f;

    /* renamed from: g  reason: collision with root package name */
    private float f9618g;

    /* renamed from: h  reason: collision with root package name */
    private float f9619h;

    /* renamed from: i  reason: collision with root package name */
    private e f9620i;

    /* renamed from: j  reason: collision with root package name */
    private List<h> f9621j;

    /* renamed from: k  reason: collision with root package name */
    private h f9622k;

    /* renamed from: l  reason: collision with root package name */
    private List<List<h>> f9623l;

    /* renamed from: m  reason: collision with root package name */
    private String f9624m;

    public String a() {
        return this.f9624m;
    }

    public String b() {
        return this.f9612a;
    }

    public float c() {
        return this.f9615d;
    }

    public float d() {
        return this.f9616e;
    }

    public float e() {
        return this.f9613b;
    }

    public float f() {
        return this.f9614c;
    }

    public float g() {
        return this.f9617f;
    }

    public float h() {
        return this.f9618g;
    }

    public e i() {
        return this.f9620i;
    }

    public List<h> j() {
        return this.f9621j;
    }

    public h k() {
        return this.f9622k;
    }

    public int l() {
        f e10 = this.f9620i.e();
        return e10.C() + e10.D();
    }

    public int m() {
        f e10 = this.f9620i.e();
        return e10.A() + e10.B();
    }

    public float n() {
        f e10 = this.f9620i.e();
        return l() + e10.g() + e10.h() + (e10.d() * 2.0f);
    }

    public float o() {
        f e10 = this.f9620i.e();
        return m() + e10.i() + e10.f() + (e10.d() * 2.0f);
    }

    public List<List<h>> p() {
        return this.f9623l;
    }

    public boolean q() {
        List<h> list = this.f9621j;
        return list == null || list.size() <= 0;
    }

    public void r() {
        List<List<h>> list = this.f9623l;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<h> list2 : this.f9623l) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.f9623l = arrayList;
    }

    public boolean s() {
        return TextUtils.equals(this.f9620i.e().r(), "flex");
    }

    public boolean t() {
        return this.f9620i.e().W() < 0 || this.f9620i.e().X() < 0 || this.f9620i.e().U() < 0 || this.f9620i.e().V() < 0;
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.f9612a + "', x=" + this.f9613b + ", y=" + this.f9614c + ", width=" + this.f9617f + ", height=" + this.f9618g + ", remainWidth=" + this.f9619h + ", rootBrick=" + this.f9620i + ", childrenBrickUnits=" + this.f9621j + '}';
    }

    public void a(String str) {
        this.f9624m = str;
    }

    public void b(String str) {
        this.f9612a = str;
    }

    public void c(float f10) {
        this.f9613b = f10;
    }

    public void d(float f10) {
        this.f9614c = f10;
    }

    public void e(float f10) {
        this.f9617f = f10;
    }

    public void f(float f10) {
        this.f9618g = f10;
    }

    public void g(float f10) {
        this.f9619h = f10;
    }

    public void a(float f10) {
        this.f9615d = f10;
    }

    public void b(float f10) {
        this.f9616e = f10;
    }

    public void a(e eVar) {
        this.f9620i = eVar;
    }

    public void b(h hVar) {
        this.f9622k = hVar;
    }

    public void a(List<h> list) {
        this.f9621j = list;
    }

    public void b(List<List<h>> list) {
        this.f9623l = list;
    }

    public void a(h hVar) {
        if (this.f9621j == null) {
            this.f9621j = new ArrayList();
        }
        this.f9621j.add(hVar);
    }

    public static void a(JSONObject jSONObject, h hVar, h hVar2) {
        if (jSONObject == null || hVar == null) {
            return;
        }
        hVar.b(jSONObject.optString("id", "root"));
        hVar.c((float) jSONObject.optDouble("x", 0.0d));
        hVar.d((float) jSONObject.optDouble("y", 0.0d));
        hVar.e((float) jSONObject.optDouble("width", 0.0d));
        hVar.f((float) jSONObject.optDouble("height", 0.0d));
        hVar.g((float) jSONObject.optDouble("remainWidth", 0.0d));
        e eVar = new e();
        e.a(jSONObject.optJSONObject("brick"), eVar);
        hVar.a(eVar);
        hVar.b(hVar2);
        JSONArray optJSONArray = jSONObject.optJSONArray("children");
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            Object opt = optJSONArray.opt(i10);
            if (opt != null && !"null".equals(opt.toString()) && (opt instanceof JSONArray)) {
                int i11 = 0;
                while (true) {
                    JSONArray jSONArray = (JSONArray) opt;
                    if (i11 < jSONArray.length()) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                        h hVar3 = new h();
                        a(optJSONObject, hVar3, hVar);
                        hVar.a(hVar3);
                        i11++;
                    }
                }
            }
        }
    }
}
