package g2;

import h2.c;
import java.io.IOException;

/* compiled from: DropShadowEffectParser.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: f  reason: collision with root package name */
    private static final c.a f30491f = c.a.a("ef");

    /* renamed from: g  reason: collision with root package name */
    private static final c.a f30492g = c.a.a("nm", "v");

    /* renamed from: a  reason: collision with root package name */
    private c2.a f30493a;

    /* renamed from: b  reason: collision with root package name */
    private c2.b f30494b;

    /* renamed from: c  reason: collision with root package name */
    private c2.b f30495c;

    /* renamed from: d  reason: collision with root package name */
    private c2.b f30496d;

    /* renamed from: e  reason: collision with root package name */
    private c2.b f30497e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
        if (r0.equals("Opacity") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(h2.c r6, com.airbnb.lottie.h r7) throws java.io.IOException {
        /*
            r5 = this;
            r6.d()
            java.lang.String r0 = ""
        L5:
            boolean r1 = r6.l()
            if (r1 == 0) goto L90
            h2.c$a r1 = g2.k.f30492g
            int r1 = r6.T(r1)
            if (r1 == 0) goto L8a
            r2 = 1
            if (r1 == r2) goto L1d
            r6.U()
            r6.Z()
            goto L5
        L1d:
            r0.hashCode()
            r1 = -1
            int r3 = r0.hashCode()
            r4 = 0
            switch(r3) {
                case 353103893: goto L55;
                case 397447147: goto L4c;
                case 1041377119: goto L41;
                case 1379387491: goto L36;
                case 1383710113: goto L2b;
                default: goto L29;
            }
        L29:
            r2 = -1
            goto L5f
        L2b:
            java.lang.String r2 = "Softness"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L34
            goto L29
        L34:
            r2 = 4
            goto L5f
        L36:
            java.lang.String r2 = "Shadow Color"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L3f
            goto L29
        L3f:
            r2 = 3
            goto L5f
        L41:
            java.lang.String r2 = "Direction"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L4a
            goto L29
        L4a:
            r2 = 2
            goto L5f
        L4c:
            java.lang.String r3 = "Opacity"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L5f
            goto L29
        L55:
            java.lang.String r2 = "Distance"
            boolean r2 = r0.equals(r2)
            if (r2 != 0) goto L5e
            goto L29
        L5e:
            r2 = 0
        L5f:
            switch(r2) {
                case 0: goto L82;
                case 1: goto L7b;
                case 2: goto L74;
                case 3: goto L6d;
                case 4: goto L66;
                default: goto L62;
            }
        L62:
            r6.Z()
            goto L5
        L66:
            c2.b r1 = g2.d.e(r6, r7)
            r5.f30497e = r1
            goto L5
        L6d:
            c2.a r1 = g2.d.c(r6, r7)
            r5.f30493a = r1
            goto L5
        L74:
            c2.b r1 = g2.d.f(r6, r7, r4)
            r5.f30495c = r1
            goto L5
        L7b:
            c2.b r1 = g2.d.f(r6, r7, r4)
            r5.f30494b = r1
            goto L5
        L82:
            c2.b r1 = g2.d.e(r6, r7)
            r5.f30496d = r1
            goto L5
        L8a:
            java.lang.String r0 = r6.A()
            goto L5
        L90:
            r6.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.k.a(h2.c, com.airbnb.lottie.h):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j b(h2.c cVar, com.airbnb.lottie.h hVar) throws IOException {
        c2.b bVar;
        c2.b bVar2;
        c2.b bVar3;
        c2.b bVar4;
        while (cVar.l()) {
            if (cVar.T(f30491f) != 0) {
                cVar.U();
                cVar.Z();
            } else {
                cVar.b();
                while (cVar.l()) {
                    a(cVar, hVar);
                }
                cVar.e();
            }
        }
        c2.a aVar = this.f30493a;
        if (aVar == null || (bVar = this.f30494b) == null || (bVar2 = this.f30495c) == null || (bVar3 = this.f30496d) == null || (bVar4 = this.f30497e) == null) {
            return null;
        }
        return new j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
