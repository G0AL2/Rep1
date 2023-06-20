package com.bytedance.sdk.openadsdk.core.c.b;

import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.component.adexpress.b.j;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.j;
import com.bytedance.sdk.openadsdk.utils.v;
import java.lang.ref.WeakReference;

/* compiled from: DynamicClickListener.java */
/* loaded from: classes.dex */
public class a extends c implements com.bytedance.sdk.component.adexpress.dynamic.d.a {

    /* renamed from: a  reason: collision with root package name */
    protected WeakReference<View> f11992a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<View> f11993b;

    /* renamed from: c  reason: collision with root package name */
    private j f11994c;

    @Override // com.bytedance.sdk.component.adexpress.dynamic.d.a
    public void a(j jVar) {
        this.f11994c = jVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.d.a
    public void b(View view) {
        this.f11993b = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.d.a
    public void a(View view) {
        this.f11992a = new WeakReference<>(view);
    }

    @Override // com.bytedance.sdk.openadsdk.core.b.c
    public void a(View view, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, boolean z10) {
        a(view, ((Integer) view.getTag()).intValue(), f10, f11, f12, f13, sparseArray);
    }

    private void a(View view, int i10, float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray) {
        if (this.f11994c != null) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            WeakReference<View> weakReference = this.f11993b;
            if (weakReference != null) {
                int[] a10 = v.a(weakReference.get());
                if (a10 != null) {
                    iArr = a10;
                }
                int[] c10 = v.c(this.f11993b.get());
                if (c10 != null) {
                    iArr2 = c10;
                }
            }
            String str = "";
            try {
                if (view.getTag(t.e(view.getContext(), "tt_id_click_area_type")) != null) {
                    str = String.valueOf(view.getTag(t.e(view.getContext(), "tt_id_click_area_type")));
                }
            } catch (Exception unused) {
            }
            this.f11994c.a(view, i10, new j.a().d(f10).c(f11).b(f12).a(f13).b(this.f11896w).a(this.f11897x).c(iArr[0]).d(iArr[1]).e(iArr2[0]).f(iArr2[1]).a(sparseArray).a(this.C).a(str).a());
        }
    }
}
