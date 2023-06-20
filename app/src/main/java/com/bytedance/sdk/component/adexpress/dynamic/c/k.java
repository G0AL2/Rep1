package com.bytedance.sdk.component.adexpress.dynamic.c;

import com.bytedance.sdk.component.adexpress.dynamic.c.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: FlexComputeRuler.java */
/* loaded from: classes.dex */
public class k {
    public static float a(float f10) {
        return (float) Math.ceil((f10 * 16.0f) / 16.0f);
    }

    public static List<a.C0147a> a(float f10, List<a.C0147a> list) {
        ArrayList<a.C0147a> arrayList = new ArrayList();
        for (a.C0147a c0147a : list) {
            arrayList.add((a.C0147a) c0147a.clone());
        }
        boolean z10 = true;
        int i10 = 0;
        int i11 = 0;
        for (a.C0147a c0147a2 : arrayList) {
            if (c0147a2.f9632b) {
                i10 = (int) (i10 + c0147a2.f9631a);
            } else {
                i11 = (int) (i11 + c0147a2.f9631a);
                z10 = false;
            }
        }
        if (!z10 || f10 <= i10) {
            float f11 = i10;
            int i12 = (f10 > f11 ? 1 : (f10 == f11 ? 0 : -1));
            float f12 = i12 < 0 ? f10 / f11 : 1.0f;
            int i13 = (f10 > f11 ? 1 : (f10 == f11 ? 0 : -1));
            float f13 = i13 > 0 ? (f10 - f11) / i11 : 0.0f;
            if (f13 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = false;
                for (a.C0147a c0147a3 : arrayList) {
                    if (!c0147a3.f9632b) {
                        float f14 = c0147a3.f9633c;
                        if (f14 != 0.0f && c0147a3.f9631a * f13 > f14) {
                            c0147a3.f9631a = f14;
                            c0147a3.f9632b = true;
                            z11 = true;
                        }
                    }
                    arrayList2.add(c0147a3);
                }
                if (z11) {
                    return a(f10, arrayList2);
                }
            }
            int i14 = 0;
            for (a.C0147a c0147a4 : arrayList) {
                if (c0147a4.f9632b) {
                    c0147a4.f9631a = a(c0147a4.f9631a * f12);
                } else {
                    c0147a4.f9631a = a(c0147a4.f9631a * f13);
                }
                i14 = (int) (i14 + c0147a4.f9631a);
            }
            float f15 = i14;
            if (f15 < f10) {
                float f16 = f10 - f15;
                for (int i15 = 0; i15 < arrayList.size() && f16 > 0.0f; i15 = (i15 + 1) % arrayList.size()) {
                    a.C0147a c0147a5 = (a.C0147a) arrayList.get(i15);
                    if ((i12 < 0 && c0147a5.f9632b) || (i13 > 0 && !c0147a5.f9632b)) {
                        c0147a5.f9631a += 0.0625f;
                        f16 -= 0.0625f;
                    }
                }
            }
            return arrayList;
        }
        return arrayList;
    }
}
