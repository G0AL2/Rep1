package g2;

import android.graphics.Rect;
import e2.e;
import h2.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LottieCompositionMoshiParser.java */
/* loaded from: classes.dex */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30524a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b  reason: collision with root package name */
    static c.a f30525b = c.a.a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f30526c = c.a.a("list");

    /* renamed from: d  reason: collision with root package name */
    private static final c.a f30527d = c.a.a("cm", "tm", "dr");

    public static com.airbnb.lottie.h a(h2.c cVar) throws IOException {
        HashMap hashMap;
        ArrayList arrayList;
        h2.c cVar2 = cVar;
        float e10 = i2.h.e();
        androidx.collection.d<e2.e> dVar = new androidx.collection.d<>();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        androidx.collection.h<b2.d> hVar = new androidx.collection.h<>();
        com.airbnb.lottie.h hVar2 = new com.airbnb.lottie.h();
        cVar.d();
        int i10 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        int i11 = 0;
        while (cVar.l()) {
            switch (cVar2.T(f30524a)) {
                case 0:
                    i10 = cVar.y();
                    continue;
                    cVar2 = cVar;
                case 1:
                    i11 = cVar.y();
                    continue;
                    cVar2 = cVar;
                case 2:
                    f10 = (float) cVar.w();
                    continue;
                    cVar2 = cVar;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f11 = ((float) cVar.w()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f12 = (float) cVar.w();
                    break;
                case 5:
                    String[] split = cVar.A().split("\\.");
                    if (!i2.h.j(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        hVar2.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 6:
                    e(cVar2, hVar2, arrayList2, dVar);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 7:
                    b(cVar2, hVar2, hashMap2, hashMap3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 8:
                    d(cVar2, hashMap4);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 9:
                    c(cVar2, hVar2, hVar);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                case 10:
                    f(cVar2, arrayList3);
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    cVar.U();
                    cVar.Z();
                    break;
            }
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        hVar2.s(new Rect(0, 0, (int) (i10 * e10), (int) (i11 * e10)), f10, f11, f12, arrayList2, dVar, hashMap2, hashMap3, hVar, hashMap4, arrayList3);
        return hVar2;
    }

    private static void b(h2.c cVar, com.airbnb.lottie.h hVar, Map<String, List<e2.e>> map, Map<String, com.airbnb.lottie.e0> map2) throws IOException {
        cVar.b();
        while (cVar.l()) {
            ArrayList arrayList = new ArrayList();
            androidx.collection.d dVar = new androidx.collection.d();
            cVar.d();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i10 = 0;
            int i11 = 0;
            while (cVar.l()) {
                int T = cVar.T(f30525b);
                if (T == 0) {
                    str = cVar.A();
                } else if (T == 1) {
                    cVar.b();
                    while (cVar.l()) {
                        e2.e b10 = v.b(cVar, hVar);
                        dVar.k(b10.d(), b10);
                        arrayList.add(b10);
                    }
                    cVar.e();
                } else if (T == 2) {
                    i10 = cVar.y();
                } else if (T == 3) {
                    i11 = cVar.y();
                } else if (T == 4) {
                    str2 = cVar.A();
                } else if (T != 5) {
                    cVar.U();
                    cVar.Z();
                } else {
                    str3 = cVar.A();
                }
            }
            cVar.h();
            if (str2 != null) {
                com.airbnb.lottie.e0 e0Var = new com.airbnb.lottie.e0(i10, i11, str, str2, str3);
                map2.put(e0Var.d(), e0Var);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.e();
    }

    private static void c(h2.c cVar, com.airbnb.lottie.h hVar, androidx.collection.h<b2.d> hVar2) throws IOException {
        cVar.b();
        while (cVar.l()) {
            b2.d a10 = m.a(cVar, hVar);
            hVar2.j(a10.hashCode(), a10);
        }
        cVar.e();
    }

    private static void d(h2.c cVar, Map<String, b2.c> map) throws IOException {
        cVar.d();
        while (cVar.l()) {
            if (cVar.T(f30526c) != 0) {
                cVar.U();
                cVar.Z();
            } else {
                cVar.b();
                while (cVar.l()) {
                    b2.c a10 = n.a(cVar);
                    map.put(a10.b(), a10);
                }
                cVar.e();
            }
        }
        cVar.h();
    }

    private static void e(h2.c cVar, com.airbnb.lottie.h hVar, List<e2.e> list, androidx.collection.d<e2.e> dVar) throws IOException {
        cVar.b();
        int i10 = 0;
        while (cVar.l()) {
            e2.e b10 = v.b(cVar, hVar);
            if (b10.f() == e.a.IMAGE) {
                i10++;
            }
            list.add(b10);
            dVar.k(b10.d(), b10);
            if (i10 > 4) {
                i2.d.c("You have " + i10 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.e();
    }

    private static void f(h2.c cVar, List<b2.h> list) throws IOException {
        cVar.b();
        while (cVar.l()) {
            String str = null;
            cVar.d();
            float f10 = 0.0f;
            float f11 = 0.0f;
            while (cVar.l()) {
                int T = cVar.T(f30527d);
                if (T == 0) {
                    str = cVar.A();
                } else if (T == 1) {
                    f10 = (float) cVar.w();
                } else if (T != 2) {
                    cVar.U();
                    cVar.Z();
                } else {
                    f11 = (float) cVar.w();
                }
            }
            cVar.h();
            list.add(new b2.h(str, f10, f11));
        }
        cVar.e();
    }
}
