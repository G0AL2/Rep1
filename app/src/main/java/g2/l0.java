package g2;

import d2.r;
import h2.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShapeStrokeParser.java */
/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f30500a = c.a.a("nm", l6.c.f33710i, "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f30501b = c.a.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static d2.r a(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        char c10;
        ArrayList arrayList = new ArrayList();
        String str = null;
        c2.b bVar = null;
        c2.a aVar = null;
        c2.b bVar2 = null;
        r.b bVar3 = null;
        r.c cVar2 = null;
        float f10 = 0.0f;
        boolean z10 = false;
        c2.d dVar = null;
        while (cVar.l()) {
            switch (cVar.T(f30500a)) {
                case 0:
                    str = cVar.A();
                    break;
                case 1:
                    aVar = d.c(cVar, hVar);
                    break;
                case 2:
                    bVar2 = d.e(cVar, hVar);
                    break;
                case 3:
                    dVar = d.h(cVar, hVar);
                    break;
                case 4:
                    bVar3 = r.b.values()[cVar.y() - 1];
                    break;
                case 5:
                    cVar2 = r.c.values()[cVar.y() - 1];
                    break;
                case 6:
                    f10 = (float) cVar.w();
                    break;
                case 7:
                    z10 = cVar.q();
                    break;
                case 8:
                    cVar.b();
                    while (cVar.l()) {
                        cVar.d();
                        String str2 = null;
                        c2.b bVar4 = null;
                        while (cVar.l()) {
                            int T = cVar.T(f30501b);
                            if (T == 0) {
                                str2 = cVar.A();
                            } else if (T != 1) {
                                cVar.U();
                                cVar.Z();
                            } else {
                                bVar4 = d.e(cVar, hVar);
                            }
                        }
                        cVar.h();
                        str2.hashCode();
                        switch (str2.hashCode()) {
                            case 100:
                                if (str2.equals("d")) {
                                    c10 = 0;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 103:
                                if (str2.equals("g")) {
                                    c10 = 1;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            case 111:
                                if (str2.equals("o")) {
                                    c10 = 2;
                                    break;
                                }
                                c10 = 65535;
                                break;
                            default:
                                c10 = 65535;
                                break;
                        }
                        switch (c10) {
                            case 0:
                            case 1:
                                hVar.u(true);
                                arrayList.add(bVar4);
                                break;
                            case 2:
                                bVar = bVar4;
                                break;
                        }
                    }
                    cVar.e();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add((c2.b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    cVar.Z();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new c2.d(Collections.singletonList(new j2.a(100)));
        }
        return new d2.r(str, bVar, arrayList, aVar, dVar, bVar2, bVar3, cVar2, f10, z10);
    }
}
