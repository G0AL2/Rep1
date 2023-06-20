package kotlinx.coroutines.internal;

import we.m0;
import we.s1;

/* compiled from: MainDispatchers.kt */
/* loaded from: classes3.dex */
final class o extends s1 implements m0 {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f33527a;

    /* renamed from: b  reason: collision with root package name */
    private final String f33528b;

    public /* synthetic */ o(Throwable th, String str, int i10, qe.g gVar) {
        this(th, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r1 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Void r0() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f33527a
            if (r0 == 0) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f33528b
            if (r1 == 0) goto L26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 == 0) goto L26
            goto L28
        L26:
            java.lang.String r1 = ""
        L28:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f33527a
            r1.<init>(r0, r2)
            throw r1
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android'"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.o.r0():java.lang.Void");
    }

    @Override // we.z
    public boolean h0(ie.g gVar) {
        qe.k.g(gVar, "context");
        r0();
        throw null;
    }

    @Override // we.s1
    public s1 m0() {
        return this;
    }

    @Override // we.z
    /* renamed from: q0 */
    public Void g0(ie.g gVar, Runnable runnable) {
        qe.k.g(gVar, "context");
        qe.k.g(runnable, "block");
        r0();
        throw null;
    }

    @Override // we.m0
    /* renamed from: s0 */
    public Void e(long j10, we.h<? super ee.u> hVar) {
        qe.k.g(hVar, "continuation");
        r0();
        throw null;
    }

    @Override // we.z
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Main[missing");
        if (this.f33527a != null) {
            str = ", cause=" + this.f33527a;
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append(']');
        return sb2.toString();
    }

    public o(Throwable th, String str) {
        this.f33527a = th;
        this.f33528b = str;
    }
}
