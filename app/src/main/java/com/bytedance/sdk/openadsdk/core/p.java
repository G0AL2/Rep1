package com.bytedance.sdk.openadsdk.core;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: RitInfo.java */
/* loaded from: classes.dex */
public class p {

    /* renamed from: a  reason: collision with root package name */
    public static ConcurrentHashMap<Integer, p> f12730a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private String f12731b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f12732c = "";

    /* renamed from: d  reason: collision with root package name */
    private int f12733d;

    /* renamed from: e  reason: collision with root package name */
    private int f12734e;

    /* renamed from: f  reason: collision with root package name */
    private String f12735f;

    private void f() {
        this.f12731b = "";
        this.f12732c = "";
        this.f12733d = 0;
        this.f12734e = 0;
    }

    public String a() {
        return this.f12735f;
    }

    public String b() {
        return this.f12731b;
    }

    public String c() {
        return this.f12732c;
    }

    public int d() {
        return this.f12733d;
    }

    public int e() {
        return this.f12734e;
    }

    public static void c(int i10) {
        p pVar;
        if (i10 == 0) {
            return;
        }
        if (f12730a == null) {
            f12730a = new ConcurrentHashMap<>();
        }
        if (!f12730a.containsKey(Integer.valueOf(i10)) || (pVar = f12730a.get(Integer.valueOf(i10))) == null) {
            return;
        }
        pVar.b(1);
    }

    public void a(int i10) {
        this.f12733d = i10;
    }

    public void b(int i10) {
        this.f12734e = i10;
    }

    public static void b(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        if (nVar == null || TextUtils.isEmpty(nVar.ac())) {
            return;
        }
        Integer valueOf = Integer.valueOf(com.bytedance.sdk.openadsdk.utils.u.f(nVar));
        if (valueOf.intValue() == 0) {
            return;
        }
        if (f12730a == null) {
            f12730a = new ConcurrentHashMap<>();
        }
        p pVar = f12730a.containsKey(valueOf) ? f12730a.get(valueOf) : null;
        if (pVar == null) {
            pVar = new p();
        }
        String h10 = com.bytedance.sdk.openadsdk.utils.u.h(nVar);
        if (TextUtils.isEmpty(h10) || !h10.equals(pVar.a())) {
            pVar.f();
            pVar.a(nVar);
            f12730a.put(valueOf, pVar);
        }
    }

    public void a(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        if (nVar != null) {
            String h10 = com.bytedance.sdk.openadsdk.utils.u.h(nVar);
            if (!TextUtils.isEmpty(h10)) {
                this.f12735f = h10;
            }
            String[] split = nVar.O().split("/");
            if (split.length >= 3) {
                this.f12731b = split[2];
            }
            if (nVar.aa() == null || TextUtils.isEmpty(nVar.aa().c())) {
                return;
            }
            this.f12732c = nVar.aa().c();
        }
    }

    public static void c(com.bytedance.sdk.openadsdk.core.e.n nVar) {
        p pVar;
        if (nVar == null) {
            return;
        }
        Integer valueOf = Integer.valueOf(com.bytedance.sdk.openadsdk.utils.u.f(nVar));
        if (valueOf.intValue() == 0) {
            return;
        }
        if (f12730a == null) {
            f12730a = new ConcurrentHashMap<>();
        }
        if (!f12730a.containsKey(valueOf) || (pVar = f12730a.get(valueOf)) == null) {
            return;
        }
        pVar.a(1);
    }
}
