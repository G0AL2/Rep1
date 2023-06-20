package com.bytedance.sdk.component.d.d;

/* compiled from: RawCacheVisitor.java */
/* loaded from: classes.dex */
public class l extends a {
    @Override // com.bytedance.sdk.component.d.d.i
    public String a() {
        return "raw_cache";
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public void a(com.bytedance.sdk.component.d.c.c cVar) {
        byte[] a10 = cVar.p().b(cVar.q()).a(cVar.g());
        if (a10 == null) {
            cVar.a(new f());
        } else {
            cVar.a(new b(a10, null));
        }
    }
}
