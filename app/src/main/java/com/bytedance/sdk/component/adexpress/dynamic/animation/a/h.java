package com.bytedance.sdk.component.adexpress.dynamic.animation.a;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.utils.t;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ScaleAnimation.java */
/* loaded from: classes.dex */
public class h extends d {
    public h(View view, com.bytedance.sdk.component.adexpress.dynamic.b.a aVar) {
        super(view, aVar);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 == null || !(viewGroup2 instanceof DynamicBaseWidget)) {
                return;
            }
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 == null || !(viewGroup3 instanceof DynamicBaseWidget)) {
                return;
            }
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.a.d
    List<ObjectAnimator> a() {
        View view = this.f9509c;
        view.setTag(t.e(view.getContext(), "tt_id_direction"), this.f9508b.a());
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f9509c, "scaleX", 1.0f, (float) this.f9508b.j()).setDuration((int) (this.f9508b.i() * 1000.0d));
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f9509c, "scaleY", 1.0f, (float) this.f9508b.k()).setDuration((int) (this.f9508b.i() * 1000.0d));
        ArrayList arrayList = new ArrayList();
        arrayList.add(a(duration));
        arrayList.add(a(duration2));
        return arrayList;
    }
}
