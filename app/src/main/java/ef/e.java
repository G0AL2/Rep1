package ef;

import com.google.android.gms.common.internal.ImagesContract;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import mf.i;
import ve.p;
import ye.d0;
import ye.m;
import ye.n;
import ye.t;
import ye.u;

/* compiled from: HttpHeaders.kt */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final mf.i f29819a;

    /* renamed from: b  reason: collision with root package name */
    private static final mf.i f29820b;

    static {
        i.a aVar = mf.i.f34462e;
        f29819a = aVar.d("\"\\");
        f29820b = aVar.d("\t ,=");
    }

    public static final List<ye.h> a(t tVar, String str) {
        boolean l10;
        qe.k.f(tVar, "$this$parseChallenges");
        qe.k.f(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = tVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            l10 = p.l(str, tVar.c(i10), true);
            if (l10) {
                try {
                    c(new mf.f().M(tVar.h(i10)), arrayList);
                } catch (EOFException e10) {
                    okhttp3.internal.platform.h.f35277c.g().k("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(d0 d0Var) {
        boolean l10;
        qe.k.f(d0Var, "$this$promisesBody");
        if (qe.k.a(d0Var.d0().h(), VersionInfo.GIT_BRANCH)) {
            return false;
        }
        int h10 = d0Var.h();
        if (((h10 >= 100 && h10 < 200) || h10 == 204 || h10 == 304) && ze.c.s(d0Var) == -1) {
            l10 = p.l("chunked", d0.z(d0Var, "Transfer-Encoding", null, 2, null), true);
            if (!l10) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0085, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0085, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(mf.f r7, java.util.List<ye.h> r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Le
            g(r7)
            java.lang.String r1 = e(r7)
            if (r1 != 0) goto Le
            return
        Le:
            boolean r2 = g(r7)
            java.lang.String r3 = e(r7)
            if (r3 != 0) goto L2c
            boolean r7 = r7.w0()
            if (r7 != 0) goto L1f
            return
        L1f:
            ye.h r7 = new ye.h
            java.util.Map r0 = fe.e0.g()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2c:
            r4 = 61
            byte r4 = (byte) r4
            int r5 = ze.c.I(r7, r4)
            boolean r6 = g(r7)
            if (r2 != 0) goto L68
            if (r6 != 0) goto L41
            boolean r2 = r7.w0()
            if (r2 == 0) goto L68
        L41:
            ye.h r2 = new ye.h
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = ve.g.q(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "Collections.singletonMap…ek + \"=\".repeat(eqCount))"
            qe.k.e(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L68:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = ze.c.I(r7, r4)
            int r5 = r5 + r6
        L72:
            if (r3 != 0) goto L83
            java.lang.String r3 = e(r7)
            boolean r5 = g(r7)
            if (r5 == 0) goto L7f
            goto L85
        L7f:
            int r5 = ze.c.I(r7, r4)
        L83:
            if (r5 != 0) goto L90
        L85:
            ye.h r4 = new ye.h
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        L90:
            r6 = 1
            if (r5 <= r6) goto L94
            return
        L94:
            boolean r6 = g(r7)
            if (r6 == 0) goto L9b
            return
        L9b:
            r6 = 34
            byte r6 = (byte) r6
            boolean r6 = h(r7, r6)
            if (r6 == 0) goto La9
            java.lang.String r6 = d(r7)
            goto Lad
        La9:
            java.lang.String r6 = e(r7)
        Lad:
            if (r6 == 0) goto Lc7
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lb8
            return
        Lb8:
            boolean r3 = g(r7)
            if (r3 != 0) goto Lc5
            boolean r3 = r7.w0()
            if (r3 != 0) goto Lc5
            return
        Lc5:
            r3 = r0
            goto L72
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ef.e.c(mf.f, java.util.List):void");
    }

    private static final String d(mf.f fVar) throws EOFException {
        byte b10 = (byte) 34;
        if (fVar.readByte() == b10) {
            mf.f fVar2 = new mf.f();
            while (true) {
                long P = fVar.P(f29819a);
                if (P == -1) {
                    return null;
                }
                if (fVar.A(P) == b10) {
                    fVar2.n0(fVar, P);
                    fVar.readByte();
                    return fVar2.r0();
                } else if (fVar.C0() == P + 1) {
                    return null;
                } else {
                    fVar2.n0(fVar, P);
                    fVar.readByte();
                    fVar2.n0(fVar, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String e(mf.f fVar) {
        long P = fVar.P(f29820b);
        if (P == -1) {
            P = fVar.C0();
        }
        if (P != 0) {
            return fVar.s0(P);
        }
        return null;
    }

    public static final void f(n nVar, u uVar, t tVar) {
        qe.k.f(nVar, "$this$receiveHeaders");
        qe.k.f(uVar, ImagesContract.URL);
        qe.k.f(tVar, "headers");
        if (nVar == n.f39734a) {
            return;
        }
        List<m> e10 = m.f39715n.e(uVar, tVar);
        if (e10.isEmpty()) {
            return;
        }
        nVar.c(uVar, e10);
    }

    private static final boolean g(mf.f fVar) {
        boolean z10 = false;
        while (!fVar.w0()) {
            byte A = fVar.A(0L);
            if (A == 9 || A == 32) {
                fVar.readByte();
            } else if (A != 44) {
                break;
            } else {
                fVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    private static final boolean h(mf.f fVar, byte b10) {
        return !fVar.w0() && fVar.A(0L) == b10;
    }
}
