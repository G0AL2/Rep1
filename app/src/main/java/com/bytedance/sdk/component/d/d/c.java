package com.bytedance.sdk.component.d.d;

import android.text.TextUtils;

/* compiled from: CacheKeyVisitor.java */
/* loaded from: classes.dex */
public class c extends a {
    @Override // com.bytedance.sdk.component.d.d.i
    public String a() {
        return "generate_key";
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public void a(com.bytedance.sdk.component.d.c.c cVar) {
        if (TextUtils.isEmpty(cVar.e())) {
            com.bytedance.sdk.component.d.k d10 = cVar.p().d();
            cVar.b(d10.a(cVar));
            cVar.a(d10.b(cVar));
        }
        cVar.a(new g());
    }
}
