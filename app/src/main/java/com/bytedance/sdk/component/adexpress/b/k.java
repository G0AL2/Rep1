package com.bytedance.sdk.component.adexpress.b;

import com.bytedance.sdk.component.adexpress.b.i;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RenderRealChain.java */
/* loaded from: classes.dex */
public class k implements i.a {

    /* renamed from: a  reason: collision with root package name */
    n f9387a;

    /* renamed from: b  reason: collision with root package name */
    private List<i> f9388b;

    /* renamed from: c  reason: collision with root package name */
    private h f9389c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicBoolean f9390d = new AtomicBoolean(false);

    public k(List<i> list, h hVar) {
        this.f9388b = list;
        this.f9389c = hVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i.a
    public void a() {
        this.f9389c.a();
        Iterator<i> it = this.f9388b.iterator();
        while (it.hasNext() && !it.next().a(this)) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i.a
    public boolean b(i iVar) {
        int indexOf = this.f9388b.indexOf(iVar);
        return indexOf < this.f9388b.size() - 1 && indexOf >= 0;
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i.a
    public boolean c() {
        return this.f9390d.get();
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i.a
    public n b() {
        return this.f9387a;
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i.a
    public void a(i iVar) {
        int indexOf = this.f9388b.indexOf(iVar);
        if (indexOf < 0) {
            return;
        }
        do {
            indexOf++;
            if (indexOf >= this.f9388b.size()) {
                return;
            }
        } while (!this.f9388b.get(indexOf).a(this));
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i.a
    public void a(n nVar) {
        this.f9387a = nVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.b.i.a
    public void a(boolean z10) {
        this.f9390d.getAndSet(z10);
    }
}
