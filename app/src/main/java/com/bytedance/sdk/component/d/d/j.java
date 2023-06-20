package com.bytedance.sdk.component.d.d;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.d.t;

/* compiled from: MemoryCacheVisitor.java */
/* loaded from: classes.dex */
public class j extends a {
    @Override // com.bytedance.sdk.component.d.d.i
    public String a() {
        return "memory_cache";
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public void a(com.bytedance.sdk.component.d.c.c cVar) {
        t i10 = cVar.i();
        Bitmap a10 = (i10 == t.BITMAP || i10 == t.AUTO) ? cVar.p().a(cVar.q()).a(cVar.e()) : null;
        if (a10 == null) {
            cVar.a(new l());
        } else {
            cVar.a(new m(a10, null, false));
        }
    }
}
