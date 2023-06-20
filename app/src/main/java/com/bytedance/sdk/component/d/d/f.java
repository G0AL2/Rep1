package com.bytedance.sdk.component.d.d;

/* compiled from: DiskCacheVisitor.java */
/* loaded from: classes.dex */
public class f extends a {
    @Override // com.bytedance.sdk.component.d.d.i
    public String a() {
        return "disk_cache";
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public void a(com.bytedance.sdk.component.d.c.c cVar) {
        String g10 = cVar.g();
        com.bytedance.sdk.component.d.c c10 = cVar.p().c(cVar.q());
        if (c10 == null) {
            cVar.a(new k());
            return;
        }
        byte[] a10 = c10.a((com.bytedance.sdk.component.d.c) g10);
        if (a10 == null) {
            cVar.a(new k());
            return;
        }
        cVar.a(new b(a10, null));
        cVar.p().b(cVar.q()).a(g10, a10);
    }
}
