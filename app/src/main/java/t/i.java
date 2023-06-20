package t;

import java.util.ArrayList;
import s.e;

/* compiled from: Grouping.java */
/* loaded from: classes.dex */
public class i {
    public static o a(s.e eVar, int i10, ArrayList<o> arrayList, o oVar) {
        int i11;
        int p12;
        if (i10 == 0) {
            i11 = eVar.f36650t0;
        } else {
            i11 = eVar.f36652u0;
        }
        if (i11 != -1 && (oVar == null || i11 != oVar.f37055b)) {
            int i12 = 0;
            while (true) {
                if (i12 >= arrayList.size()) {
                    break;
                }
                o oVar2 = arrayList.get(i12);
                if (oVar2.c() == i11) {
                    if (oVar != null) {
                        oVar.g(i10, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                } else {
                    i12++;
                }
            }
        } else if (i11 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof s.i) && (p12 = ((s.i) eVar).p1(i10)) != -1) {
                int i13 = 0;
                while (true) {
                    if (i13 >= arrayList.size()) {
                        break;
                    }
                    o oVar3 = arrayList.get(i13);
                    if (oVar3.c() == p12) {
                        oVar = oVar3;
                        break;
                    }
                    i13++;
                }
            }
            if (oVar == null) {
                oVar = new o(i10);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof s.g) {
                s.g gVar = (s.g) eVar;
                gVar.o1().b(gVar.p1() == 0 ? 1 : 0, arrayList, oVar);
            }
            if (i10 == 0) {
                eVar.f36650t0 = oVar.c();
                eVar.L.b(i10, arrayList, oVar);
                eVar.N.b(i10, arrayList, oVar);
            } else {
                eVar.f36652u0 = oVar.c();
                eVar.M.b(i10, arrayList, oVar);
                eVar.P.b(i10, arrayList, oVar);
                eVar.O.b(i10, arrayList, oVar);
            }
            eVar.S.b(i10, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i10) {
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o oVar = arrayList.get(i11);
            if (i10 == oVar.f37055b) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0390 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(s.f r16, t.b.InterfaceC0502b r17) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.i.c(s.f, t.b$b):boolean");
    }

    public static boolean d(e.b bVar, e.b bVar2, e.b bVar3, e.b bVar4) {
        e.b bVar5;
        e.b bVar6;
        e.b bVar7 = e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = e.b.WRAP_CONTENT) || (bVar3 == e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = e.b.WRAP_CONTENT) || (bVar4 == e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
