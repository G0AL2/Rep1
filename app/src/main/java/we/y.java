package we;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes3.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f38675a;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r0.equals("on") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r0.equals("") != false) goto L21;
     */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.v.d(r0)
            if (r0 != 0) goto L9
            goto L33
        L9:
            int r1 = r0.hashCode()
            if (r1 == 0) goto L2b
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L22
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L37
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L37
            r0 = 0
            goto L34
        L22:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L37
            goto L33
        L2b:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L37
        L33:
            r0 = 1
        L34:
            we.y.f38675a = r0
            return
        L37:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.append(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: we.y.<clinit>():void");
    }

    public static final z a() {
        return f38675a ? kotlinx.coroutines.scheduling.c.f33576g : p.f38633c;
    }

    public static final String b(ie.g gVar) {
        c0 c0Var;
        qe.k.g(gVar, "$this$coroutineName");
        if (i0.c() && (c0Var = (c0) gVar.get(c0.f38591b)) != null) {
            d0 d0Var = (d0) gVar.get(d0.f38594b);
            String str = (d0Var == null || (str = d0Var.g0()) == null) ? "coroutine" : "coroutine";
            return str + '#' + c0Var.g0();
        }
        return null;
    }

    public static final ie.g c(e0 e0Var, ie.g gVar) {
        qe.k.g(e0Var, "$this$newCoroutineContext");
        qe.k.g(gVar, "context");
        ie.g plus = e0Var.g().plus(gVar);
        ie.g plus2 = i0.c() ? plus.plus(new c0(i0.b().incrementAndGet())) : plus;
        return (plus == s0.a() || plus.get(ie.e.f31935b0) != null) ? plus2 : plus2.plus(s0.a());
    }
}
