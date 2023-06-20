package kotlinx.coroutines.scheduling;

/* compiled from: Tasks.kt */
/* loaded from: classes3.dex */
public class e extends kotlinx.coroutines.internal.k<i> {
    public e() {
        super(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
        r7 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlinx.coroutines.scheduling.i e(kotlinx.coroutines.scheduling.l r12) {
        /*
            r11 = this;
            java.lang.String r0 = "mode"
            qe.k.g(r12, r0)
        L5:
            java.lang.Object r0 = r11._cur$internal
            kotlinx.coroutines.internal.l r0 = (kotlinx.coroutines.internal.l) r0
        L9:
            long r3 = r0._state$internal
            r1 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r5 = 0
            r7 = 0
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 == 0) goto L19
            kotlinx.coroutines.internal.u r7 = kotlinx.coroutines.internal.l.f33518g
            goto L8f
        L19:
            kotlinx.coroutines.internal.l$a r1 = kotlinx.coroutines.internal.l.f33519h
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            r2 = 0
            long r5 = r5 >> r2
            int r8 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r9 = 30
            long r5 = r5 >> r9
            int r6 = (int) r5
            int r5 = kotlinx.coroutines.internal.l.a(r0)
            r5 = r5 & r6
            int r6 = kotlinx.coroutines.internal.l.a(r0)
            r6 = r6 & r8
            if (r5 != r6) goto L39
            goto L8f
        L39:
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r0.f33521b
            int r6 = kotlinx.coroutines.internal.l.a(r0)
            r6 = r6 & r8
            java.lang.Object r9 = r5.get(r6)
            if (r9 != 0) goto L4d
            boolean r1 = kotlinx.coroutines.internal.l.b(r0)
            if (r1 == 0) goto L9
            goto L8f
        L4d:
            boolean r5 = r9 instanceof kotlinx.coroutines.internal.l.b
            if (r5 == 0) goto L52
            goto L8f
        L52:
            r5 = r9
            kotlinx.coroutines.scheduling.i r5 = (kotlinx.coroutines.scheduling.i) r5
            kotlinx.coroutines.scheduling.l r5 = r5.a()
            if (r5 != r12) goto L5c
            r2 = 1
        L5c:
            if (r2 != 0) goto L5f
            goto L8f
        L5f:
            int r2 = r8 + 1
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            r10 = r2 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.internal.l.f33517f
            long r5 = r1.b(r3, r10)
            r1 = r2
            r2 = r0
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L7f
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f33521b
            int r2 = kotlinx.coroutines.internal.l.a(r0)
            r2 = r2 & r8
            r1.set(r2, r7)
            goto L8e
        L7f:
            boolean r1 = kotlinx.coroutines.internal.l.b(r0)
            if (r1 != 0) goto L86
            goto L9
        L86:
            r1 = r0
        L87:
            kotlinx.coroutines.internal.l r1 = kotlinx.coroutines.internal.l.c(r1, r8, r10)
            if (r1 == 0) goto L8e
            goto L87
        L8e:
            r7 = r9
        L8f:
            kotlinx.coroutines.internal.u r1 = kotlinx.coroutines.internal.l.f33518g
            if (r7 == r1) goto L96
            kotlinx.coroutines.scheduling.i r7 = (kotlinx.coroutines.scheduling.i) r7
            return r7
        L96:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.k.f33515a
            kotlinx.coroutines.internal.l r2 = r0.l()
            r1.compareAndSet(r11, r0, r2)
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.e.e(kotlinx.coroutines.scheduling.l):kotlinx.coroutines.scheduling.i");
    }
}
