package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SwingAnimation.java */
/* loaded from: classes.dex */
public class j extends d {
    public j(View view, com.bytedance.sdk.component.adexpress.dynamic.b.a aVar) {
        super(view, aVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.a.d
    List<ObjectAnimator> a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f9509c, "rotation", 0.0f, this.f9508b.d(), 0.0f, this.f9508b.d(), 0.0f).setDuration((int) (this.f9508b.i() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(duration));
        return arrayList;
    }
}
