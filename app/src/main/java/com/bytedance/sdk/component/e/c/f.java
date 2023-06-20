package com.bytedance.sdk.component.e.c;

import com.bytedance.sdk.component.b.a.g;
import com.bytedance.sdk.component.b.a.k;
import com.bytedance.sdk.component.b.a.m;
import java.io.IOException;

/* compiled from: TncHostInterceptor.java */
/* loaded from: classes.dex */
public class f implements com.bytedance.sdk.component.b.a.g {

    /* renamed from: a  reason: collision with root package name */
    private int f10384a;

    public void a(int i10) {
        this.f10384a = i10;
    }

    @Override // com.bytedance.sdk.component.b.a.g
    public m a(g.a aVar) throws IOException {
        m mVar;
        k a10 = aVar.a();
        if (g.a().a(this.f10384a).b() != null) {
            g.a().a(this.f10384a).b().e();
        }
        String fVar = a10.b().toString();
        String a11 = g.a().a(this.f10384a).a(fVar);
        if (!fVar.equals(a11)) {
            a10 = a10.g().a(a11).b();
        }
        try {
            mVar = aVar.a(a10);
        } catch (Exception e10) {
            g.a().a(this.f10384a).a(a10, e10);
            mVar = null;
        }
        g.a().a(this.f10384a).a(a10, mVar);
        return mVar == null ? aVar.a(a10) : mVar;
    }
}
