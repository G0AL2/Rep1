package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.e;
import java.util.HashMap;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private final HashMap<String, d> f14303a = new HashMap<>();

    public void a(String str, d dVar) {
        this.f14303a.put(str, dVar);
    }

    public void b(String str, String str2) {
        d dVar = this.f14303a.get(str);
        if (dVar != null) {
            dVar.b(str2);
        }
    }

    public d a(String str) {
        return this.f14303a.get(str);
    }

    public void a(String str, String str2) {
        d dVar = this.f14303a.get(str);
        if (dVar != null) {
            dVar.a(str2);
        }
    }

    public boolean b(String str) {
        d dVar = this.f14303a.get(str);
        if (dVar != null) {
            return dVar.a();
        }
        return false;
    }

    public void a(String str, String str2, String str3) {
        d dVar = this.f14303a.get(str);
        if (dVar != null) {
            dVar.a(str2, str3);
        }
    }

    public boolean b() {
        e.a a10 = a();
        if (a10 != null) {
            return a10.c();
        }
        return true;
    }

    private e.a a() {
        com.chartboost.sdk.Model.e i10;
        com.chartboost.sdk.f a10 = com.chartboost.sdk.f.a();
        if (a10 == null || (i10 = a10.i()) == null) {
            return null;
        }
        return i10.a();
    }
}
