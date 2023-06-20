package com.bytedance.sdk.component.d.d;

import com.bytedance.sdk.component.d.n;
import java.util.List;
import java.util.Map;

/* compiled from: FailVisitor.java */
/* loaded from: classes.dex */
public class h extends a {

    /* renamed from: a  reason: collision with root package name */
    private Throwable f10273a;

    /* renamed from: b  reason: collision with root package name */
    private int f10274b;

    /* renamed from: c  reason: collision with root package name */
    private String f10275c;

    public h(int i10, String str, Throwable th) {
        this.f10274b = i10;
        this.f10275c = str;
        this.f10273a = th;
    }

    private void b(com.bytedance.sdk.component.d.c.c cVar) {
        n f10 = cVar.f();
        if (f10 != null) {
            f10.a(this.f10274b, this.f10275c, this.f10273a);
        }
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public String a() {
        return "failed";
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public void a(com.bytedance.sdk.component.d.c.c cVar) {
        cVar.a(new com.bytedance.sdk.component.d.c.a(this.f10274b, this.f10275c, this.f10273a));
        String r10 = cVar.r();
        Map<String, List<com.bytedance.sdk.component.d.c.c>> f10 = cVar.p().f();
        List<com.bytedance.sdk.component.d.c.c> list = f10.get(r10);
        if (list == null) {
            b(cVar);
            return;
        }
        synchronized (list) {
            for (com.bytedance.sdk.component.d.c.c cVar2 : list) {
                b(cVar2);
            }
            list.clear();
            f10.remove(r10);
        }
    }
}
