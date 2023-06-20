package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.g;
import com.bytedance.sdk.openadsdk.utils.v;
import org.json.JSONObject;

/* compiled from: ExpressClickListener.java */
/* loaded from: classes.dex */
public class f extends com.bytedance.sdk.openadsdk.core.b.b {
    public f(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, int i10) {
        super(context, nVar, str, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.b.b
    public com.bytedance.sdk.openadsdk.core.e.g a(float f10, float f11, float f12, float f13, SparseArray<c.a> sparseArray, long j10, long j11, View view, View view2, String str, float f14, int i10, float f15, int i11, JSONObject jSONObject) {
        float f16;
        float f17;
        float f18;
        float f19;
        int i12;
        int i13;
        long j12;
        long j13;
        char c10;
        char c11;
        int i14;
        int i15;
        int[] a10 = v.a(view);
        if (a10 == null || a10.length != 2) {
            f16 = f10;
            f17 = f11;
            f18 = f12;
            f19 = f13;
            i12 = 0;
            i13 = 0;
        } else {
            i12 = a10[0];
            i13 = a10[1];
            if (this.f11884r == 0) {
                float f20 = i12;
                float f21 = i13;
                f18 = (v.b(this.f11868b, f12) + f20) - 0.5f;
                f19 = (v.b(this.f11868b, f13) + f21) - 0.5f;
                f17 = (v.b(this.f11868b, f11) + f21) - 0.5f;
                f16 = (v.b(this.f11868b, f10) + f20) - 0.5f;
            } else {
                f16 = f10;
                f17 = f11;
                f18 = f12;
                f19 = f13;
            }
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        com.bytedance.sdk.openadsdk.core.e.j jVar = this.f11869c;
        if (jVar != null) {
            j12 = jVar.f12086e;
            int i16 = i12;
            j13 = jVar.f12087f;
            if (this.f11884r == 0) {
                iArr[0] = ((int) v.b(this.f11868b, jVar.f12088g)) + i16;
                iArr[1] = ((int) v.b(this.f11868b, this.f11869c.f12089h)) + i13;
                i14 = (int) v.b(this.f11868b, this.f11869c.f12090i);
                i15 = (int) v.b(this.f11868b, this.f11869c.f12091j);
                c10 = 0;
                c11 = 1;
            } else {
                c10 = 0;
                iArr[0] = jVar.f12088g;
                c11 = 1;
                iArr[1] = jVar.f12089h;
                i14 = jVar.f12090i;
                i15 = jVar.f12091j;
            }
            iArr2[c10] = i14;
            iArr2[c11] = i15;
            if (i14 == 0 && i15 == 0 && view2 != null) {
                iArr = v.a(view2);
                iArr2 = v.c(view2);
            }
        } else {
            j12 = j10;
            j13 = j11;
        }
        this.f11884r = 0;
        return new g.a().f(f16).e(f17).d(f18).c(f19).b(j12).a(j13).b(a10).a(iArr).c(v.c(view)).d(iArr2).d(this.f11898y).e(this.f11899z).f(this.A).b(com.bytedance.sdk.openadsdk.core.h.d().b() ? 1 : 2).a(sparseArray).a(str).a(i11).a(jSONObject).a();
    }

    public void a(com.bytedance.sdk.openadsdk.core.e.j jVar) {
        this.f11869c = jVar;
    }
}
