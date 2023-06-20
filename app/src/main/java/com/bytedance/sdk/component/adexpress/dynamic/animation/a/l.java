package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WaggleAnimation.java */
/* loaded from: classes.dex */
public class l extends d {
    public l(View view, com.bytedance.sdk.component.adexpress.dynamic.b.a aVar) {
        super(view, aVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.a.d
    List<ObjectAnimator> a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f9509c, "translationX", 0.0f, com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), 20.0f), 0.0f, -com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), 20.0f), 0.0f).setDuration((int) (this.f9508b.i() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(duration));
        return arrayList;
    }
}
