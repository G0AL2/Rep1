package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.bytedance.sdk.component.utils.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MarqueeAnimation.java */
/* loaded from: classes.dex */
public class e extends d {
    public e(View view, com.bytedance.sdk.component.adexpress.dynamic.b.a aVar) {
        super(view, aVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.a.d
    @SuppressLint({"ObjectAnimatorBinding"})
    List<ObjectAnimator> a() {
        View view = this.f9509c;
        view.setTag(t.e(view.getContext(), "tt_id_width"), Integer.valueOf(this.f9508b.b()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f9509c, "marqueeValue", 0.0f, 1.0f).setDuration((int) (this.f9508b.i() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(duration));
        return arrayList;
    }
}
