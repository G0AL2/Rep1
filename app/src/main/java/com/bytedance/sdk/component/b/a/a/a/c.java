package com.bytedance.sdk.component.b.a.a.a;

import android.text.TextUtils;
import com.bytedance.sdk.component.b.a.i;
import com.bytedance.sdk.component.b.a.k;

/* compiled from: NetClient.java */
/* loaded from: classes.dex */
public class c extends i {

    /* renamed from: h  reason: collision with root package name */
    public d f9993h;

    public c(i.a aVar) {
        super(aVar);
        this.f9993h = new d();
    }

    @Override // com.bytedance.sdk.component.b.a.i
    public com.bytedance.sdk.component.b.a.d a() {
        return this.f9993h;
    }

    @Override // com.bytedance.sdk.component.b.a.i
    public com.bytedance.sdk.component.b.a.b a(k kVar) {
        kVar.a(this);
        if (kVar.b() == null || kVar.b().a() == null || TextUtils.isEmpty(kVar.b().a().toString())) {
            return null;
        }
        a aVar = new a(kVar, this.f9993h);
        this.f9993h.c().add(aVar);
        return aVar;
    }
}
