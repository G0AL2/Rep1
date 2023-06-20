package com.bytedance.sdk.component.adexpress.dynamic.c;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.c.a;
import java.util.List;

/* compiled from: DynamicCanvas.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.sdk.component.adexpress.dynamic.b.b f9643a;

    /* renamed from: b  reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.dynamic.c.a f9644b = new com.bytedance.sdk.component.adexpress.dynamic.c.a();

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.b.h f9645c;

    /* renamed from: d  reason: collision with root package name */
    private a f9646d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DynamicCanvas.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        float f9647a;

        /* renamed from: b  reason: collision with root package name */
        float f9648b;

        /* renamed from: c  reason: collision with root package name */
        float f9649c;
    }

    public void a(a aVar) {
        this.f9646d = aVar;
    }

    public void a() {
        this.f9644b.a();
    }

    public void a(com.bytedance.sdk.component.adexpress.dynamic.b.h hVar, float f10, float f11) {
        if (hVar != null) {
            this.f9645c = hVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.b.h hVar2 = this.f9645c;
        float g10 = hVar2.g();
        float h10 = hVar2.h();
        float f12 = TextUtils.equals(hVar2.i().e().q(), "fixed") ? h10 : 65536.0f;
        this.f9644b.a();
        this.f9644b.c(hVar2, g10, f12);
        a.c a10 = this.f9644b.a(hVar2);
        com.bytedance.sdk.component.adexpress.dynamic.b.b bVar = new com.bytedance.sdk.component.adexpress.dynamic.b.b();
        bVar.f9551a = f10;
        bVar.f9552b = f11;
        if (a10 != null) {
            g10 = a10.f9639a;
        }
        bVar.f9553c = g10;
        if (a10 != null) {
            h10 = a10.f9640b;
        }
        bVar.f9554d = h10;
        bVar.f9555e = "root";
        bVar.f9559i = 1280.0f;
        bVar.f9556f = hVar2;
        hVar2.c(f10);
        bVar.f9556f.d(bVar.f9552b);
        bVar.f9556f.e(bVar.f9553c);
        bVar.f9556f.f(bVar.f9554d);
        com.bytedance.sdk.component.adexpress.dynamic.b.b a11 = a(bVar, 0.0f);
        this.f9643a = a11;
        a(a11);
    }

    public void a(com.bytedance.sdk.component.adexpress.dynamic.b.b bVar) {
        if (bVar == null) {
            return;
        }
        com.bytedance.sdk.component.utils.l.b("DynamicCanvas", "native parser: type = " + bVar.f9556f.i().b() + "; width = " + bVar.f9553c + "; height = " + bVar.f9554d + "; x = " + bVar.f9551a + "; y = " + bVar.f9552b);
        List<List<com.bytedance.sdk.component.adexpress.dynamic.b.b>> list = bVar.f9557g;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.b.b> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                for (com.bytedance.sdk.component.adexpress.dynamic.b.b bVar2 : list2) {
                    a(bVar2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.bytedance.sdk.component.adexpress.dynamic.b.b a(com.bytedance.sdk.component.adexpress.dynamic.b.b r37, float r38) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.c.e.a(com.bytedance.sdk.component.adexpress.dynamic.b.b, float):com.bytedance.sdk.component.adexpress.dynamic.b.b");
    }

    private com.bytedance.sdk.component.adexpress.dynamic.b.i a(com.bytedance.sdk.component.adexpress.dynamic.b.f fVar, a.c cVar, a.c cVar2) {
        float U = fVar.U();
        float W = fVar.W();
        float V = fVar.V();
        float X = fVar.X();
        boolean L = fVar.L();
        boolean M = fVar.M();
        boolean N = fVar.N();
        boolean O = fVar.O();
        if (!L) {
            if (M) {
                float f10 = this.f9646d.f9647a;
                if (f10 == 0.0f) {
                    f10 = cVar.f9639a;
                }
                U = (f10 - V) - cVar2.f9639a;
            } else {
                U = 0.0f;
            }
        }
        if (!N) {
            if (O) {
                float f11 = this.f9646d.f9648b;
                if (f11 == 0.0f) {
                    f11 = cVar.f9640b;
                }
                W = (f11 - X) - cVar2.f9640b;
            } else {
                W = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.b.i(U, W);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.b.i a(com.bytedance.sdk.component.adexpress.dynamic.b.b bVar, com.bytedance.sdk.component.adexpress.dynamic.b.f fVar, float f10, float f11) {
        float f12;
        float f13;
        float f14 = bVar.f9551a;
        float f15 = bVar.f9552b;
        float U = fVar.U();
        float W = fVar.W();
        float V = fVar.V();
        float X = fVar.X();
        boolean L = fVar.L();
        boolean M = fVar.M();
        boolean N = fVar.N();
        boolean O = fVar.O();
        String K = fVar.K();
        float f16 = bVar.f9553c;
        float f17 = bVar.f9554d;
        if (TextUtils.equals(K, "0")) {
            if (L) {
                f14 = bVar.f9551a + U;
            } else if (M) {
                f14 = ((bVar.f9551a + f16) - V) - f10;
            }
            if (N) {
                f13 = bVar.f9552b;
                f15 = f13 + W;
            } else if (O) {
                f12 = bVar.f9552b;
                f15 = ((f12 + f17) - X) - f11;
            }
        } else if (TextUtils.equals(K, "1")) {
            f14 = bVar.f9551a + ((f16 - f10) / 2.0f);
            if (N) {
                f13 = bVar.f9552b;
                f15 = f13 + W;
            } else if (O) {
                f12 = bVar.f9552b;
                f15 = ((f12 + f17) - X) - f11;
            }
        } else if (TextUtils.equals(K, "2")) {
            f15 = bVar.f9552b + ((f17 - f11) / 2.0f);
            if (L) {
                f14 = bVar.f9551a + U;
            } else if (M) {
                f14 = ((bVar.f9551a + f16) - V) - f10;
            }
        } else if (TextUtils.equals(K, "3")) {
            f14 = bVar.f9551a + ((f16 - f10) / 2.0f);
            f15 = bVar.f9552b + ((f17 - f11) / 2.0f);
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.b.i(f14, f15);
    }
}
