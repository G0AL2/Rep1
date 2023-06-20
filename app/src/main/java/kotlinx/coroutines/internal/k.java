package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes3.dex */
public class k<E> {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33515a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_cur$internal");
    public volatile /* synthetic */ Object _cur$internal;

    public k(boolean z10) {
        this._cur$internal = new l(8, z10);
    }

    public final boolean a(E e10) {
        qe.k.g(e10, "element");
        while (true) {
            l lVar = (l) this._cur$internal;
            int d10 = lVar.d(e10);
            if (d10 == 0) {
                return true;
            }
            if (d10 == 1) {
                f33515a.compareAndSet(this, lVar, lVar.l());
            } else if (d10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            l lVar = (l) this._cur$internal;
            if (lVar.g()) {
                return;
            }
            f33515a.compareAndSet(this, lVar, lVar.l());
        }
    }

    public final int c() {
        return ((l) this._cur$internal).i();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
        r7 = (E) r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E d() {
        /*
            r11 = this;
        L0:
            java.lang.Object r0 = r11._cur$internal
            kotlinx.coroutines.internal.l r0 = (kotlinx.coroutines.internal.l) r0
        L4:
            long r3 = r0._state$internal
            r1 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r5 = 0
            r7 = 0
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 == 0) goto L14
            kotlinx.coroutines.internal.u r7 = kotlinx.coroutines.internal.l.f33518g
            goto L7d
        L14:
            kotlinx.coroutines.internal.l$a r1 = kotlinx.coroutines.internal.l.f33519h
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r3
            r2 = 0
            long r5 = r5 >> r2
            int r8 = (int) r5
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r2 = (int) r5
            int r5 = kotlinx.coroutines.internal.l.a(r0)
            r2 = r2 & r5
            int r5 = kotlinx.coroutines.internal.l.a(r0)
            r5 = r5 & r8
            if (r2 != r5) goto L34
            goto L7d
        L34:
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r0.f33521b
            int r5 = kotlinx.coroutines.internal.l.a(r0)
            r5 = r5 & r8
            java.lang.Object r9 = r2.get(r5)
            if (r9 != 0) goto L48
            boolean r1 = kotlinx.coroutines.internal.l.b(r0)
            if (r1 == 0) goto L4
            goto L7d
        L48:
            boolean r2 = r9 instanceof kotlinx.coroutines.internal.l.b
            if (r2 == 0) goto L4d
            goto L7d
        L4d:
            int r2 = r8 + 1
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            r10 = r2 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.internal.l.f33517f
            long r5 = r1.b(r3, r10)
            r1 = r2
            r2 = r0
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L6d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f33521b
            int r2 = kotlinx.coroutines.internal.l.a(r0)
            r2 = r2 & r8
            r1.set(r2, r7)
            goto L7c
        L6d:
            boolean r1 = kotlinx.coroutines.internal.l.b(r0)
            if (r1 != 0) goto L74
            goto L4
        L74:
            r1 = r0
        L75:
            kotlinx.coroutines.internal.l r1 = kotlinx.coroutines.internal.l.c(r1, r8, r10)
            if (r1 == 0) goto L7c
            goto L75
        L7c:
            r7 = r9
        L7d:
            kotlinx.coroutines.internal.u r1 = kotlinx.coroutines.internal.l.f33518g
            if (r7 == r1) goto L82
            return r7
        L82:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.k.f33515a
            kotlinx.coroutines.internal.l r2 = r0.l()
            r1.compareAndSet(r11, r0, r2)
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.k.d():java.lang.Object");
    }
}
