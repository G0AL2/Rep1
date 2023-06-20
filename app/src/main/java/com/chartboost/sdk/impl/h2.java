package com.chartboost.sdk.impl;

import com.chartboost.sdk.Model.e;
import com.chartboost.sdk.Privacy.model.DataUseConsent;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class h2 {

    /* renamed from: a  reason: collision with root package name */
    private final j2 f14033a;

    /* renamed from: b  reason: collision with root package name */
    private final s1 f14034b;

    /* renamed from: c  reason: collision with root package name */
    private final k2 f14035c;

    /* renamed from: d  reason: collision with root package name */
    private final t1 f14036d;

    /* renamed from: e  reason: collision with root package name */
    private final u1 f14037e;

    /* renamed from: f  reason: collision with root package name */
    private final q2 f14038f;

    /* renamed from: g  reason: collision with root package name */
    private e.b f14039g;

    public h2(j2 j2Var, s1 s1Var, k2 k2Var, t1 t1Var, u1 u1Var, q2 q2Var) {
        this.f14033a = j2Var;
        this.f14034b = s1Var;
        this.f14035c = k2Var;
        this.f14036d = t1Var;
        this.f14037e = u1Var;
        this.f14038f = q2Var;
        e();
    }

    private void e() {
        q2 q2Var = this.f14038f;
        if (q2Var != null) {
            q2Var.a();
        }
    }

    public void a(e.b bVar) {
        this.f14039g = bVar;
    }

    public DataUseConsent b(String str) {
        k2 k2Var = this.f14035c;
        if (k2Var != null) {
            return k2Var.a(str);
        }
        return null;
    }

    public JSONObject c() {
        List<DataUseConsent> d10 = d();
        t1 t1Var = this.f14036d;
        if (t1Var == null || d10 == null) {
            return null;
        }
        return t1Var.a(d10);
    }

    public List<DataUseConsent> d() {
        e.b bVar;
        u1 u1Var = this.f14037e;
        if (u1Var == null || (bVar = this.f14039g) == null) {
            return null;
        }
        return u1Var.a(bVar);
    }

    public void a(DataUseConsent dataUseConsent) {
        j2 j2Var = this.f14033a;
        if (j2Var != null) {
            j2Var.a(dataUseConsent);
        }
    }

    public int b() {
        return this.f14038f.c();
    }

    public DataUseConsent a(String str) {
        s1 s1Var = this.f14034b;
        if (s1Var != null) {
            return s1Var.a(str);
        }
        return null;
    }

    public int a() {
        return this.f14038f.b();
    }
}
