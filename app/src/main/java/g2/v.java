package g2;

import android.graphics.Color;
import android.graphics.Rect;
import e2.e;
import h2.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: LayerParser.java */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30520a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30521b = c.a.a("d", "a");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f30522c = c.a.a("ty", "nm");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LayerParser.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30523a;

        static {
            int[] iArr = new int[e.b.values().length];
            f30523a = iArr;
            try {
                iArr[e.b.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30523a[e.b.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static e2.e a(com.airbnb.lottie.h hVar) {
        Rect b10 = hVar.b();
        return new e2.e(Collections.emptyList(), hVar, "__container", -1L, e.a.PRE_COMP, -1L, null, Collections.emptyList(), new c2.l(), 0, 0, 0, 0.0f, 0.0f, b10.width(), b10.height(), null, null, Collections.emptyList(), e.b.NONE, null, false, null, null);
    }

    public static e2.e b(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        e.b bVar = e.b.NONE;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        cVar.d();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        e.b bVar2 = bVar;
        e.a aVar = null;
        String str = null;
        c2.l lVar = null;
        c2.j jVar = null;
        c2.k kVar = null;
        c2.b bVar3 = null;
        d2.a aVar2 = null;
        j jVar2 = null;
        long j10 = -1;
        float f10 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        float f11 = 1.0f;
        float f12 = 0.0f;
        int i13 = 0;
        int i14 = 0;
        boolean z10 = false;
        float f13 = 0.0f;
        long j11 = 0;
        String str2 = null;
        String str3 = "UNSET";
        while (cVar.l()) {
            switch (cVar.T(f30520a)) {
                case 0:
                    str3 = cVar.A();
                    break;
                case 1:
                    j11 = cVar.y();
                    break;
                case 2:
                    str = cVar.A();
                    break;
                case 3:
                    int y10 = cVar.y();
                    aVar = e.a.UNKNOWN;
                    if (y10 >= aVar.ordinal()) {
                        break;
                    } else {
                        aVar = e.a.values()[y10];
                        break;
                    }
                case 4:
                    j10 = cVar.y();
                    break;
                case 5:
                    i10 = (int) (cVar.y() * i2.h.e());
                    break;
                case 6:
                    i11 = (int) (cVar.y() * i2.h.e());
                    break;
                case 7:
                    i12 = Color.parseColor(cVar.A());
                    break;
                case 8:
                    lVar = c.g(cVar, hVar);
                    break;
                case 9:
                    int y11 = cVar.y();
                    if (y11 >= e.b.values().length) {
                        hVar.a("Unsupported matte type: " + y11);
                        break;
                    } else {
                        bVar2 = e.b.values()[y11];
                        int i15 = a.f30523a[bVar2.ordinal()];
                        if (i15 == 1) {
                            hVar.a("Unsupported matte type: Luma");
                        } else if (i15 == 2) {
                            hVar.a("Unsupported matte type: Luma Inverted");
                        }
                        hVar.r(1);
                        break;
                    }
                case 10:
                    cVar.b();
                    while (cVar.l()) {
                        arrayList3.add(x.a(cVar, hVar));
                    }
                    hVar.r(arrayList3.size());
                    cVar.e();
                    break;
                case 11:
                    cVar.b();
                    while (cVar.l()) {
                        d2.c a10 = h.a(cVar, hVar);
                        if (a10 != null) {
                            arrayList4.add(a10);
                        }
                    }
                    cVar.e();
                    break;
                case 12:
                    cVar.d();
                    while (cVar.l()) {
                        int T = cVar.T(f30521b);
                        if (T == 0) {
                            jVar = d.d(cVar, hVar);
                        } else if (T != 1) {
                            cVar.U();
                            cVar.Z();
                        } else {
                            cVar.b();
                            if (cVar.l()) {
                                kVar = b.a(cVar, hVar);
                            }
                            while (cVar.l()) {
                                cVar.Z();
                            }
                            cVar.e();
                        }
                    }
                    cVar.h();
                    break;
                case 13:
                    cVar.b();
                    ArrayList arrayList5 = new ArrayList();
                    while (cVar.l()) {
                        cVar.d();
                        while (cVar.l()) {
                            int T2 = cVar.T(f30522c);
                            if (T2 == 0) {
                                int y12 = cVar.y();
                                if (y12 == 29) {
                                    aVar2 = e.b(cVar, hVar);
                                } else if (y12 == 25) {
                                    jVar2 = new k().b(cVar, hVar);
                                }
                            } else if (T2 != 1) {
                                cVar.U();
                                cVar.Z();
                            } else {
                                arrayList5.add(cVar.A());
                            }
                        }
                        cVar.h();
                    }
                    cVar.e();
                    hVar.a("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: " + arrayList5);
                    break;
                case 14:
                    f11 = (float) cVar.w();
                    break;
                case 15:
                    f12 = (float) cVar.w();
                    break;
                case 16:
                    i13 = (int) (cVar.y() * i2.h.e());
                    break;
                case 17:
                    i14 = (int) (cVar.y() * i2.h.e());
                    break;
                case 18:
                    f10 = (float) cVar.w();
                    break;
                case 19:
                    f13 = (float) cVar.w();
                    break;
                case 20:
                    bVar3 = d.f(cVar, hVar, false);
                    break;
                case 21:
                    str2 = cVar.A();
                    break;
                case 22:
                    z10 = cVar.q();
                    break;
                default:
                    cVar.U();
                    cVar.Z();
                    break;
            }
        }
        cVar.h();
        ArrayList arrayList6 = new ArrayList();
        if (f10 > 0.0f) {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
            arrayList2.add(new j2.a(hVar, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f10)));
        } else {
            arrayList = arrayList3;
            arrayList2 = arrayList6;
        }
        if (f13 <= 0.0f) {
            f13 = hVar.f();
        }
        arrayList2.add(new j2.a(hVar, valueOf, valueOf, null, f10, Float.valueOf(f13)));
        arrayList2.add(new j2.a(hVar, valueOf2, valueOf2, null, f13, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str2)) {
            hVar.a("Convert your Illustrator layers to shape layers.");
        }
        return new e2.e(arrayList4, hVar, str3, j11, aVar, j10, str, arrayList, lVar, i10, i11, i12, f11, f12, i13, i14, jVar, kVar, arrayList2, bVar2, bVar3, z10, aVar2, jVar2);
    }
}
