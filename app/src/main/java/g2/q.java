package g2;

import d2.r;
import h2.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GradientStrokeParser.java */
/* loaded from: classes.dex */
public class q {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30509a = c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30510b = c.a.a("p", "k");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f30511c = c.a.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d2.f a(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        c2.c cVar2;
        ArrayList arrayList = new ArrayList();
        String str = null;
        d2.g gVar = null;
        c2.c cVar3 = null;
        c2.f fVar = null;
        c2.f fVar2 = null;
        c2.b bVar = null;
        r.b bVar2 = null;
        r.c cVar4 = null;
        float f10 = 0.0f;
        c2.b bVar3 = null;
        boolean z10 = false;
        c2.d dVar = null;
        while (cVar.l()) {
            switch (cVar.T(f30509a)) {
                case 0:
                    str = cVar.A();
                    break;
                case 1:
                    int i10 = -1;
                    cVar.d();
                    while (cVar.l()) {
                        int T = cVar.T(f30510b);
                        if (T != 0) {
                            cVar2 = cVar3;
                            if (T != 1) {
                                cVar.U();
                                cVar.Z();
                            } else {
                                cVar3 = d.g(cVar, hVar, i10);
                            }
                        } else {
                            cVar2 = cVar3;
                            i10 = cVar.y();
                        }
                        cVar3 = cVar2;
                    }
                    cVar.h();
                    break;
                case 2:
                    dVar = d.h(cVar, hVar);
                    break;
                case 3:
                    gVar = cVar.y() == 1 ? d2.g.LINEAR : d2.g.RADIAL;
                    break;
                case 4:
                    fVar = d.i(cVar, hVar);
                    break;
                case 5:
                    fVar2 = d.i(cVar, hVar);
                    break;
                case 6:
                    bVar = d.e(cVar, hVar);
                    break;
                case 7:
                    bVar2 = r.b.values()[cVar.y() - 1];
                    break;
                case 8:
                    cVar4 = r.c.values()[cVar.y() - 1];
                    break;
                case 9:
                    f10 = (float) cVar.w();
                    break;
                case 10:
                    z10 = cVar.q();
                    break;
                case 11:
                    cVar.b();
                    while (cVar.l()) {
                        cVar.d();
                        String str2 = null;
                        c2.b bVar4 = null;
                        while (cVar.l()) {
                            int T2 = cVar.T(f30511c);
                            if (T2 != 0) {
                                c2.b bVar5 = bVar3;
                                if (T2 != 1) {
                                    cVar.U();
                                    cVar.Z();
                                } else {
                                    bVar4 = d.e(cVar, hVar);
                                }
                                bVar3 = bVar5;
                            } else {
                                str2 = cVar.A();
                            }
                        }
                        c2.b bVar6 = bVar3;
                        cVar.h();
                        if (str2.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                hVar.u(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar6;
                        }
                    }
                    c2.b bVar7 = bVar3;
                    cVar.e();
                    if (arrayList.size() == 1) {
                        arrayList.add((c2.b) arrayList.get(0));
                    }
                    bVar3 = bVar7;
                    break;
                default:
                    cVar.U();
                    cVar.Z();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new c2.d(Collections.singletonList(new j2.a(100)));
        }
        return new d2.f(str, gVar, cVar3, dVar, fVar, fVar2, bVar, bVar2, cVar4, f10, arrayList, bVar3, z10);
    }
}
