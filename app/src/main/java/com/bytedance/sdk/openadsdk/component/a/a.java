package com.bytedance.sdk.openadsdk.component.a;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;

/* compiled from: TTAppOpenAdClickListener.java */
/* loaded from: classes.dex */
public class a extends com.bytedance.sdk.openadsdk.core.b.a {
    public a(Context context, n nVar, String str, int i10) {
        super(context, nVar, str, i10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.b.a, com.bytedance.sdk.openadsdk.core.b.b, com.bytedance.sdk.openadsdk.core.b.c
    public void a(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, boolean z10) {
        if (view.getId() == t.e(m.a(), "tt_open_ad_click_button")) {
            a("click_bar");
        } else {
            a("click_material");
        }
        super.a(view, f10, f11, f12, f13, sparseArray, z10);
    }
}
