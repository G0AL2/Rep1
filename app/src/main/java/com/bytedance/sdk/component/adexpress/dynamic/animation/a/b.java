package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AnimationSets.java */
/* loaded from: classes.dex */
public class b implements com.bytedance.sdk.component.adexpress.dynamic.dynamicview.c {

    /* renamed from: a  reason: collision with root package name */
    List<d> f9505a = new ArrayList();

    public b(View view, List<com.bytedance.sdk.component.adexpress.dynamic.b.a> list) {
        for (com.bytedance.sdk.component.adexpress.dynamic.b.a aVar : list) {
            d a10 = c.a().a(view, aVar);
            if (a10 != null) {
                this.f9505a.add(a10);
            }
        }
    }

    public void a() {
        for (d dVar : this.f9505a) {
            try {
                dVar.c();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.c
    public void b() {
        for (d dVar : this.f9505a) {
            try {
                dVar.b();
            } catch (Exception unused) {
            }
        }
    }
}
