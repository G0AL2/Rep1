package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.bytedance.sdk.component.utils.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShineAnimation.java */
/* loaded from: classes.dex */
public class i extends d {
    public i(View view, com.bytedance.sdk.component.adexpress.dynamic.b.a aVar) {
        super(view, aVar);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.a.d
    @SuppressLint({"ObjectAnimatorBinding"})
    List<ObjectAnimator> a() {
        View view = this.f9509c;
        view.setTag(t.e(view.getContext(), "tt_id_shine_width"), Integer.valueOf(this.f9508b.c()));
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f9509c, "shineValue", 0.0f, 1.0f).setDuration((int) (this.f9508b.i() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(duration));
        return arrayList;
    }
}
