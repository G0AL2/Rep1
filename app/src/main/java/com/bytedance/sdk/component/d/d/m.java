package com.bytedance.sdk.component.d.d;

import com.bytedance.sdk.component.d.n;
import java.util.List;
import java.util.Map;

/* compiled from: SuccessVisitor.java */
/* loaded from: classes.dex */
public class m<T> extends a {

    /* renamed from: a  reason: collision with root package name */
    private T f10280a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.sdk.component.d.f f10281b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f10282c;

    public m(T t10, com.bytedance.sdk.component.d.f fVar, boolean z10) {
        this.f10280a = t10;
        this.f10281b = fVar;
        this.f10282c = z10;
    }

    private Map<String, String> b() {
        com.bytedance.sdk.component.d.f fVar = this.f10281b;
        if (fVar != null) {
            return fVar.e();
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public String a() {
        return "success";
    }

    @Override // com.bytedance.sdk.component.d.d.i
    public void a(com.bytedance.sdk.component.d.c.c cVar) {
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

    private void b(com.bytedance.sdk.component.d.c.c cVar) {
        n f10 = cVar.f();
        if (f10 != null) {
            f10.a(new com.bytedance.sdk.component.d.c.d().a(cVar, this.f10280a, b(), this.f10282c));
        }
    }
}
