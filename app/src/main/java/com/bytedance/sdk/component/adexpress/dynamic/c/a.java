package com.bytedance.sdk.component.adexpress.dynamic.c;

import android.text.TextUtils;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ComputeRuler.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public Map<String, c> f9627a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, c> f9628b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public Map<String, c> f9629c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private double f9630d = Math.random();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComputeRuler.java */
    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0147a implements Cloneable {

        /* renamed from: a  reason: collision with root package name */
        float f9631a;

        /* renamed from: b  reason: collision with root package name */
        boolean f9632b;

        /* renamed from: c  reason: collision with root package name */
        float f9633c;

        C0147a() {
        }

        public Object clone() {
            try {
                return (C0147a) super.clone();
            } catch (CloneNotSupportedException e10) {
                e10.printStackTrace();
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComputeRuler.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        float f9634a;

        /* renamed from: b  reason: collision with root package name */
        int f9635b;

        /* renamed from: c  reason: collision with root package name */
        int f9636c;

        /* renamed from: d  reason: collision with root package name */
        double f9637d;

        /* renamed from: e  reason: collision with root package name */
        float f9638e;

        b() {
        }

        static JSONObject a(b bVar) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("fontSize", bVar.f9634a);
                jSONObject.put("letterSpacing", bVar.f9635b);
                jSONObject.put("lineHeight", bVar.f9637d);
                jSONObject.put("maxWidth", bVar.f9638e);
                jSONObject.put("fontWeight", bVar.f9636c);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            return jSONObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComputeRuler.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        float f9639a;

        /* renamed from: b  reason: collision with root package name */
        float f9640b;

        public c() {
        }

        public String toString() {
            return "UnitSize{width=" + this.f9639a + ", height=" + this.f9640b + '}';
        }

        public c(float f10, float f11) {
            this.f9639a = f10;
            this.f9640b = f11;
        }
    }

    private c e(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar, float f10, float f11) {
        String str = hVar.b() + "_" + f10 + "_" + f11;
        if (this.f9629c.containsKey(str)) {
            return this.f9629c.get(str);
        }
        c f12 = f(hVar, f10, f11);
        this.f9629c.put(str, f12);
        return f12;
    }

    private c f(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar, float f10, float f11) {
        new c();
        com.bytedance.sdk.component.adexpress.dynamic.b.f e10 = hVar.i().e();
        hVar.i().c();
        e10.G();
        float j10 = e10.j();
        int F = e10.F();
        double E = e10.E();
        int H = e10.H();
        boolean y10 = e10.y();
        boolean I = e10.I();
        int z10 = e10.z();
        b bVar = new b();
        bVar.f9634a = j10;
        bVar.f9635b = F;
        bVar.f9636c = H;
        bVar.f9637d = E;
        bVar.f9638e = f10;
        return a(hVar.i().c(), bVar, y10, I, z10, hVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.c.a.c a(com.bytedance.sdk.component.adexpress.dynamic.b.h r13, float r14, float r15) {
        /*
            r12 = this;
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.i()
            java.lang.String r0 = r0.c()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L23
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r0 = r0.e()
            java.lang.String r0 = r0.P()
            if (r0 != 0) goto L23
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>(r1, r1)
            return r13
        L23:
            com.bytedance.sdk.component.adexpress.dynamic.b.e r0 = r13.i()
            java.lang.String r0 = r0.b()
            java.lang.String r2 = "creative-playable-bait"
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L39
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>(r1, r1)
            return r13
        L39:
            float r0 = r13.g()
            float r1 = r13.h()
            com.bytedance.sdk.component.adexpress.dynamic.b.e r2 = r13.i()
            com.bytedance.sdk.component.adexpress.dynamic.b.f r2 = r2.e()
            java.lang.String r3 = r2.r()
            java.lang.String r2 = r2.q()
            int r4 = r13.l()
            float r4 = (float) r4
            int r5 = r13.m()
            float r5 = (float) r5
            float r6 = r13.n()
            float r7 = r13.o()
            java.lang.String r8 = "fixed"
            boolean r9 = android.text.TextUtils.equals(r3, r8)
            java.lang.String r10 = "flex"
            java.lang.String r11 = "auto"
            if (r9 == 0) goto L86
            float r14 = java.lang.Math.min(r0, r14)
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Lb7
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.b(r13, r0, r1)
            float r13 = r13.f9640b
        L83:
            float r1 = r13 + r7
            goto Lb7
        L86:
            boolean r9 = android.text.TextUtils.equals(r3, r11)
            if (r9 == 0) goto L9f
            float r14 = r14 - r6
            float r0 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.b(r13, r14, r0)
            float r14 = r13.f9639a
            float r14 = r14 + r6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Lb7
            float r13 = r13.f9640b
            goto L83
        L9f:
            boolean r3 = android.text.TextUtils.equals(r3, r10)
            if (r3 == 0) goto Lb6
            boolean r0 = android.text.TextUtils.equals(r2, r11)
            if (r0 == 0) goto Lb7
            float r0 = r14 - r6
            float r1 = r15 - r7
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = r12.b(r13, r0, r1)
            float r13 = r13.f9640b
            goto L83
        Lb6:
            r14 = r0
        Lb7:
            java.lang.String r13 = "scale"
            boolean r13 = android.text.TextUtils.equals(r2, r13)
            if (r13 == 0) goto Lda
            float r13 = r14 - r4
            float r13 = r13 / r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r13 = r13 + r5
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 <= 0) goto Ld8
            float r13 = r15 - r5
            float r13 = r13 * r1
            int r13 = java.lang.Math.round(r13)
            float r13 = (float) r13
            float r14 = r13 + r4
            goto Lee
        Ld8:
            r15 = r13
            goto Lee
        Lda:
            boolean r13 = android.text.TextUtils.equals(r2, r8)
            if (r13 == 0) goto Le6
            float r1 = r1 + r5
            float r15 = java.lang.Math.min(r1, r15)
            goto Lee
        Le6:
            boolean r13 = android.text.TextUtils.equals(r2, r10)
            if (r13 == 0) goto Led
            goto Lee
        Led:
            r15 = r1
        Lee:
            com.bytedance.sdk.component.adexpress.dynamic.c.a$c r13 = new com.bytedance.sdk.component.adexpress.dynamic.c.a$c
            r13.<init>()
            r13.f9639a = r14
            r13.f9640b = r15
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.c.a.a(com.bytedance.sdk.component.adexpress.dynamic.b.h, float, float):com.bytedance.sdk.component.adexpress.dynamic.c.a$c");
    }

    public c b(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar, float f10, float f11) {
        c cVar = new c();
        if (hVar.i().e() == null) {
            return cVar;
        }
        c e10 = e(hVar, f10, f11);
        float f12 = e10.f9639a;
        float f13 = e10.f9640b;
        cVar.f9639a = Math.min(f12, f10);
        cVar.f9640b = Math.min(f13, f11);
        return cVar;
    }

    public c c(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar, float f10, float f11) {
        if (hVar == null) {
            return null;
        }
        c a10 = a(hVar);
        if (a10 == null || (a10.f9639a == 0.0f && a10.f9640b == 0.0f)) {
            c d10 = d(hVar, f10, f11);
            a(hVar, d10);
            return d10;
        }
        return a10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.c.a.c d(com.bytedance.sdk.component.adexpress.dynamic.b.h r19, float r20, float r21) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.c.a.d(com.bytedance.sdk.component.adexpress.dynamic.b.h, float, float):com.bytedance.sdk.component.adexpress.dynamic.c.a$c");
    }

    private c c(List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list, float f10, float f11) {
        float f12;
        d(list);
        c cVar = new c();
        ArrayList<com.bytedance.sdk.component.adexpress.dynamic.b.h> arrayList = new ArrayList();
        ArrayList<com.bytedance.sdk.component.adexpress.dynamic.b.h> arrayList2 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.b.h hVar : list) {
            com.bytedance.sdk.component.adexpress.dynamic.b.f e10 = hVar.i().e();
            if (e10.J() == 1 || e10.J() == 2) {
                arrayList.add(hVar);
            }
            if (e10.J() != 1 && e10.J() != 2) {
                arrayList2.add(hVar);
            }
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.b.h hVar2 : arrayList) {
            c(hVar2, f10, f11);
        }
        if (arrayList2.size() <= 0) {
            return cVar;
        }
        ArrayList arrayList3 = new ArrayList();
        for (com.bytedance.sdk.component.adexpress.dynamic.b.h hVar3 : arrayList2) {
            arrayList3.add(Float.valueOf(c(hVar3, f10, f11).f9639a));
        }
        ArrayList arrayList4 = new ArrayList();
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList2.size()) {
                break;
            }
            com.bytedance.sdk.component.adexpress.dynamic.b.h hVar4 = arrayList2.get(i10);
            String r10 = hVar4.i().e().r();
            float g10 = hVar4.g();
            boolean equals = TextUtils.equals(r10, "flex");
            if (TextUtils.equals(r10, "auto")) {
                List<List<com.bytedance.sdk.component.adexpress.dynamic.b.h>> p10 = hVar4.p();
                if (p10 != null && p10.size() > 0) {
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list2 : p10) {
                        if (b(list2)) {
                            equals = true;
                            break;
                        }
                    }
                }
                equals = false;
            }
            C0147a c0147a = new C0147a();
            if (!equals) {
                g10 = ((Float) arrayList3.get(i10)).floatValue();
            }
            c0147a.f9631a = g10;
            c0147a.f9632b = !equals;
            if (equals) {
                f12 = ((Float) arrayList3.get(i10)).floatValue();
            }
            c0147a.f9633c = f12;
            arrayList4.add(c0147a);
            i10++;
        }
        a(arrayList4, f10, arrayList2);
        List<C0147a> a10 = k.a(f10, arrayList4);
        float f13 = 0.0f;
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            f13 += a10.get(i11).f9631a;
            if (((Float) arrayList3.get(i11)).floatValue() != a10.get(i11).f9631a) {
                d(arrayList2.get(i11));
            }
        }
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.b.h> it = arrayList2.iterator();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i12++;
            if (!b(it.next())) {
                z10 = false;
                break;
            } else if (i12 == arrayList2.size()) {
                z10 = true;
            }
        }
        f12 = z10 ? f11 : 0.0f;
        ArrayList<c> arrayList5 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            com.bytedance.sdk.component.adexpress.dynamic.b.h hVar5 = arrayList2.get(i13);
            c c10 = c(hVar5, a10.get(i13).f9631a, f11);
            if (!b(hVar5)) {
                f12 = Math.max(f12, c10.f9640b);
            }
            arrayList5.add(c10);
        }
        ArrayList arrayList6 = new ArrayList();
        for (c cVar2 : arrayList5) {
            arrayList6.add(Float.valueOf(cVar2.f9640b));
        }
        if (!z10) {
            for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                com.bytedance.sdk.component.adexpress.dynamic.b.h hVar6 = arrayList2.get(i14);
                if (b(hVar6) && ((Float) arrayList6.get(i14)).floatValue() != f12) {
                    d(hVar6);
                    c(hVar6, a10.get(i14).f9631a, f12);
                }
            }
        }
        cVar.f9639a = f13;
        cVar.f9640b = f12;
        return cVar;
    }

    private boolean b(List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list) {
        boolean z10;
        List<List<com.bytedance.sdk.component.adexpress.dynamic.b.h>> p10;
        Iterator<com.bytedance.sdk.component.adexpress.dynamic.b.h> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (TextUtils.equals(it.next().i().e().r(), "flex")) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        if (z10) {
            return true;
        }
        while (true) {
            boolean z11 = false;
            for (com.bytedance.sdk.component.adexpress.dynamic.b.h hVar : list) {
                if (TextUtils.equals(hVar.i().e().r(), "auto") && (p10 = hVar.p()) != null) {
                    int i10 = 0;
                    for (List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list2 : p10) {
                        i10++;
                        if (!b(list2)) {
                            break;
                        } else if (i10 == list2.size()) {
                            z11 = true;
                        }
                    }
                    continue;
                }
            }
            return z11;
        }
    }

    private String e(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
        return hVar.b();
    }

    private c b(List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list, float f10, float f11) {
        c a10 = a(list);
        if (a10 == null || (a10.f9639a == 0.0f && a10.f9640b == 0.0f)) {
            c c10 = c(list, f10, f11);
            a(list, c10);
            return c10;
        }
        return a10;
    }

    private boolean b(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
        if (hVar == null) {
            return false;
        }
        if (TextUtils.equals(hVar.i().e().q(), "flex")) {
            return true;
        }
        return c(hVar);
    }

    private c a(String str, b bVar, boolean z10, boolean z11, int i10, com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
        return l.a(str, hVar.i().b(), b.a(bVar).toString(), z10, z11, i10);
    }

    private void a(List<List<com.bytedance.sdk.component.adexpress.dynamic.b.h>> list, float f10, float f11) {
        if (list == null || list.size() <= 0) {
            return;
        }
        boolean z10 = false;
        for (List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list2 : list) {
            if (a(list2, false)) {
                z10 = true;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list3 : list) {
            C0147a c0147a = new C0147a();
            boolean a10 = a(list3, !z10);
            c0147a.f9631a = a10 ? 1.0f : b(list3, f10, f11).f9640b;
            c0147a.f9632b = !a10;
            arrayList.add(c0147a);
        }
        List<C0147a> a11 = k.a(f11, arrayList);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (((C0147a) arrayList.get(i10)).f9631a != a11.get(i10).f9631a) {
                List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list4 = list.get(i10);
                c(list4);
                b(list4, f10, a11.get(i10).f9631a);
            }
        }
    }

    private void d(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
        this.f9627a.remove(e(hVar));
        List<List<com.bytedance.sdk.component.adexpress.dynamic.b.h>> p10 = hVar.p();
        if (p10 == null || p10.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list : p10) {
            c(list);
        }
    }

    private String d(List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String b10 = list.get(i10).b();
            if (i10 < list.size() - 1) {
                sb2.append(b10);
                sb2.append(Constants.FILENAME_SEQUENCE_SEPARATOR);
            } else {
                sb2.append(b10);
            }
        }
        return sb2.toString();
    }

    private boolean a(List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list, boolean z10) {
        boolean z11;
        for (com.bytedance.sdk.component.adexpress.dynamic.b.h hVar : list) {
            String q10 = hVar.i().e().q();
            if (TextUtils.equals(q10, "flex") || (z10 && TextUtils.equals(q10, "flex"))) {
                z11 = true;
                break;
            }
        }
        z11 = false;
        if (z11) {
            return true;
        }
        for (com.bytedance.sdk.component.adexpress.dynamic.b.h hVar2 : list) {
            if (c(hVar2)) {
                return true;
            }
        }
        return false;
    }

    private void a(List<C0147a> list, float f10, List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list2) {
        float f11 = 0.0f;
        for (C0147a c0147a : list) {
            if (c0147a.f9632b) {
                f11 += c0147a.f9631a;
            }
        }
        if (f11 > f10) {
            int i10 = 0;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (list.get(i11).f9632b && list2.get(i11).s()) {
                    i10++;
                }
            }
            if (i10 > 0) {
                float ceil = (float) (Math.ceil(((f11 - f10) / i10) * 1000.0f) / 1000.0d);
                for (int i12 = 0; i12 < list2.size(); i12++) {
                    C0147a c0147a2 = list.get(i12);
                    if (c0147a2.f9632b && list2.get(i12).s()) {
                        c0147a2.f9631a -= ceil;
                    }
                }
            }
        }
    }

    private boolean c(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
        List<List<com.bytedance.sdk.component.adexpress.dynamic.b.h>> p10;
        if (!hVar.q() && TextUtils.equals(hVar.i().e().q(), "auto") && (p10 = hVar.p()) != null && p10.size() > 0) {
            if (p10.size() == 1) {
                for (com.bytedance.sdk.component.adexpress.dynamic.b.h hVar2 : p10.get(0)) {
                    if (!b(hVar2)) {
                        return false;
                    }
                }
                return true;
            }
            for (List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list : p10) {
                if (a(list, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a() {
        this.f9629c.clear();
        this.f9627a.clear();
        this.f9628b.clear();
    }

    private void c(List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f9628b.remove(d(list));
        for (com.bytedance.sdk.component.adexpress.dynamic.b.h hVar : list) {
            d(hVar);
        }
    }

    public c a(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar) {
        return this.f9627a.get(e(hVar));
    }

    public c a(List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list) {
        return this.f9628b.get(d(list));
    }

    private void a(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar, c cVar) {
        this.f9627a.put(e(hVar), cVar);
    }

    private void a(List<com.bytedance.sdk.component.adexpress.dynamic.b.h> list, c cVar) {
        this.f9628b.put(d(list), cVar);
    }
}
