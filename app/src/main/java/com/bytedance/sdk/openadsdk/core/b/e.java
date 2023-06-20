package com.bytedance.sdk.openadsdk.core.b;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.n;

/* compiled from: RewardBarClickListener.java */
/* loaded from: classes.dex */
public abstract class e extends a {
    public e(Context context, n nVar, String str, int i10) {
        super(context, nVar, str, i10);
    }

    protected abstract void a(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, int i10, int i11, int i12, boolean z10);

    @Override // com.bytedance.sdk.openadsdk.core.b.a, com.bytedance.sdk.openadsdk.core.b.b, com.bytedance.sdk.openadsdk.core.b.c
    public void a(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, boolean z10) {
        if (a(view, z10)) {
            a(view, f10, f11, f12, f13, sparseArray, this.A, this.f11898y, this.f11899z, z10);
        }
        super.a(view, f10, f11, f12, f13, sparseArray, z10);
    }
}
