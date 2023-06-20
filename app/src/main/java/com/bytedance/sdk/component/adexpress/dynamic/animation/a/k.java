package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: TranslateAnimation.java */
/* loaded from: classes.dex */
public class k extends d {
    public k(View view, com.bytedance.sdk.component.adexpress.dynamic.b.a aVar) {
        super(view, aVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.a.d
    List<ObjectAnimator> a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f9509c, "translationX", com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9508b.e()), 0.0f).setDuration((int) (this.f9508b.i() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f9509c, "translationY", com.bytedance.sdk.component.adexpress.c.b.a(com.bytedance.sdk.component.adexpress.c.a(), this.f9508b.f()), 0.0f).setDuration((int) (this.f9508b.i() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(duration));
        arrayList.add(a(duration2));
        return arrayList;
    }
}
