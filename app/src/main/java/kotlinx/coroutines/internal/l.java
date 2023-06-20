package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import we.i0;

/* compiled from: LockFreeTaskQueue.kt */
/* loaded from: classes3.dex */
public final class l<E> {
    private volatile Object _next = null;
    public volatile /* synthetic */ long _state$internal = 0;

    /* renamed from: a  reason: collision with root package name */
    private final int f33520a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ AtomicReferenceArray f33521b;

    /* renamed from: c  reason: collision with root package name */
    private final int f33522c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f33523d;

    /* renamed from: h  reason: collision with root package name */
    public static final a f33519h = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final u f33518g = new u("REMOVE_FROZEN");

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f33516e = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f33517f = AtomicLongFieldUpdater.newUpdater(l.class, "_state$internal");

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final int a(long j10) {
            return (j10 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j10, int i10) {
            return d(j10, 1073741823L) | (i10 << 0);
        }

        public final long c(long j10, int i10) {
            return d(j10, 1152921503533105152L) | (i10 << 30);
        }

        public final long d(long j10, long j11) {
            return j10 & (~j11);
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    /* compiled from: LockFreeTaskQueue.kt */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f33524a;

        public b(int i10) {
            this.f33524a = i10;
        }
    }

    public l(int i10, boolean z10) {
        this.f33522c = i10;
        this.f33523d = z10;
        int i11 = i10 - 1;
        this.f33520a = i11;
        this.f33521b = new AtomicReferenceArray(i10);
        if (!(i11 <= 1073741823)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (!((i10 & i11) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final l<E> e(long j10) {
        l<E> lVar = new l<>(this.f33522c * 2, this.f33523d);
        int i10 = (int) ((1073741823 & j10) >> 0);
        int i11 = (int) ((1152921503533105152L & j10) >> 30);
        while (true) {
            int i12 = this.f33520a;
            if ((i10 & i12) != (i11 & i12)) {
                Object obj = this.f33521b.get(i12 & i10);
                if (obj == null) {
                    obj = new b(i10);
                }
                lVar.f33521b.set(lVar.f33520a & i10, obj);
                i10++;
            } else {
                lVar._state$internal = f33519h.d(j10, 1152921504606846976L);
                return lVar;
            }
        }
    }

    private final l<E> f(long j10) {
        while (true) {
            l<E> lVar = (l) this._next;
            if (lVar != null) {
                return lVar;
            }
            f33516e.compareAndSet(this, null, e(j10));
        }
    }

    private final l<E> h(int i10, E e10) {
        Object obj = this.f33521b.get(this.f33520a & i10);
        if ((obj instanceof b) && ((b) obj).f33524a == i10) {
            this.f33521b.set(i10 & this.f33520a, e10);
            return this;
        }
        return null;
    }

    private final long k() {
        long j10;
        long j11;
        do {
            j10 = this._state$internal;
            if ((j10 & 1152921504606846976L) != 0) {
                return j10;
            }
            j11 = j10 | 1152921504606846976L;
        } while (!f33517f.compareAndSet(this, j10, j11));
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l<E> n(int i10, int i11) {
        long j10;
        a aVar;
        int i12;
        do {
            j10 = this._state$internal;
            aVar = f33519h;
            i12 = (int) ((1073741823 & j10) >> 0);
            if (i0.a()) {
                if (!(i12 == i10)) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j10) != 0) {
                return l();
            }
        } while (!f33517f.compareAndSet(this, j10, aVar.b(j10, i11)));
        this.f33521b.set(this.f33520a & i12, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(E r14) {
        /*
            r13 = this;
            java.lang.String r0 = "element"
            qe.k.g(r14, r0)
        L5:
            long r3 = r13._state$internal
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r3
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L17
            kotlinx.coroutines.internal.l$a r14 = kotlinx.coroutines.internal.l.f33519h
            int r14 = r14.a(r3)
            return r14
        L17:
            kotlinx.coroutines.internal.l$a r0 = kotlinx.coroutines.internal.l.f33519h
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r9 = 0
            long r1 = r1 >> r9
            int r2 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r1 = 30
            long r5 = r5 >> r1
            int r10 = (int) r5
            int r11 = r13.f33520a
            int r1 = r10 + 2
            r1 = r1 & r11
            r5 = r2 & r11
            r6 = 1
            if (r1 != r5) goto L35
            return r6
        L35:
            boolean r1 = r13.f33523d
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r1 != 0) goto L54
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r13.f33521b
            r12 = r10 & r11
            java.lang.Object r1 = r1.get(r12)
            if (r1 == 0) goto L54
            int r0 = r13.f33522c
            r1 = 1024(0x400, float:1.435E-42)
            if (r0 < r1) goto L53
            int r10 = r10 - r2
            r1 = r10 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L5
        L53:
            return r6
        L54:
            int r1 = r10 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.internal.l.f33517f
            long r5 = r0.c(r3, r1)
            r1 = r2
            r2 = r13
            boolean r0 = r1.compareAndSet(r2, r3, r5)
            if (r0 == 0) goto L5
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f33521b
            r1 = r10 & r11
            r0.set(r1, r14)
            r0 = r13
        L6d:
            long r1 = r0._state$internal
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 != 0) goto L77
            goto L82
        L77:
            kotlinx.coroutines.internal.l r0 = r0.l()
            kotlinx.coroutines.internal.l r0 = r0.h(r10, r14)
            if (r0 == 0) goto L82
            goto L6d
        L82:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.l.d(java.lang.Object):int");
    }

    public final boolean g() {
        long j10;
        do {
            j10 = this._state$internal;
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!f33517f.compareAndSet(this, j10, j10 | 2305843009213693952L));
        return true;
    }

    public final int i() {
        long j10 = this._state$internal;
        return 1073741823 & (((int) ((j10 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j10) >> 0)));
    }

    public final boolean j() {
        long j10 = this._state$internal;
        return ((int) ((1073741823 & j10) >> 0)) == ((int) ((j10 & 1152921503533105152L) >> 30));
    }

    public final l<E> l() {
        return f(k());
    }

    public final Object m() {
        Object obj;
        while (true) {
            long j10 = this._state$internal;
            if ((1152921504606846976L & j10) != 0) {
                return f33518g;
            }
            a aVar = f33519h;
            int i10 = (int) ((1073741823 & j10) >> 0);
            if ((((int) ((1152921503533105152L & j10) >> 30)) & this.f33520a) != (this.f33520a & i10)) {
                obj = this.f33521b.get(this.f33520a & i10);
                if (obj == null) {
                    if (this.f33523d) {
                        return null;
                    }
                } else if (!(obj instanceof b)) {
                    int i11 = (i10 + 1) & 1073741823;
                    if (f33517f.compareAndSet(this, j10, aVar.b(j10, i11))) {
                        this.f33521b.set(this.f33520a & i10, null);
                        break;
                    } else if (this.f33523d) {
                        l<E> lVar = this;
                        do {
                            lVar = lVar.n(i10, i11);
                        } while (lVar != null);
                        break;
                    }
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
        return obj;
    }
}
