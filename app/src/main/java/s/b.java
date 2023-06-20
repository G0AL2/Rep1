package s;

import java.util.ArrayList;

/* compiled from: Chain.java */
/* loaded from: classes.dex */
public class b {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r8 == 2) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r8 == 2) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
        r5 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x04f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x050a  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x052d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x03b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(s.f r38, p.d r39, int r40, int r41, s.c r42) {
        /*
            Method dump skipped, instructions count: 1358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.b.a(s.f, p.d, int, int, s.c):void");
    }

    public static void b(f fVar, p.d dVar, ArrayList<e> arrayList, int i10) {
        c[] cVarArr;
        int i11;
        int i12;
        if (i10 == 0) {
            i11 = fVar.F0;
            cVarArr = fVar.I0;
            i12 = 0;
        } else {
            int i13 = fVar.G0;
            cVarArr = fVar.H0;
            i11 = i13;
            i12 = 2;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            c cVar = cVarArr[i14];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f36570a)) {
                a(fVar, dVar, i10, i12, cVar);
            }
        }
    }
}
