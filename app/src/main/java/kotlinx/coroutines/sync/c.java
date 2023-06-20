package kotlinx.coroutines.sync;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ee.r;
import ee.u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.i;
import kotlinx.coroutines.internal.j;
import kotlinx.coroutines.internal.p;
import qe.k;
import we.h;
import we.t0;

/* compiled from: Mutex.kt */
/* loaded from: classes3.dex */
public final class c implements kotlinx.coroutines.sync.b {

    /* renamed from: a  reason: collision with root package name */
    static final AtomicReferenceFieldUpdater f33607a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_state");
    volatile Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* loaded from: classes3.dex */
    public static final class a extends b {

        /* renamed from: e  reason: collision with root package name */
        public final h<u> f33608e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, h<? super u> hVar) {
            super(obj);
            k.g(hVar, "cont");
            this.f33608e = hVar;
        }

        @Override // kotlinx.coroutines.internal.j
        public String toString() {
            return "LockCont[" + this.f33609d + ", " + this.f33608e + ']';
        }

        @Override // kotlinx.coroutines.sync.c.b
        public void y(Object obj) {
            k.g(obj, IronSourceConstants.IRONSOURCE_BIDDING_TOKEN_KEY);
            this.f33608e.i(obj);
        }

        @Override // kotlinx.coroutines.sync.c.b
        public Object z() {
            return h.a.a(this.f33608e, u.f29813a, null, 2, null);
        }
    }

    /* compiled from: Mutex.kt */
    /* loaded from: classes3.dex */
    private static abstract class b extends j implements t0 {

        /* renamed from: d  reason: collision with root package name */
        public final Object f33609d;

        public b(Object obj) {
            this.f33609d = obj;
        }

        @Override // we.t0
        public final void f() {
            u();
        }

        public abstract void y(Object obj);

        public abstract Object z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    /* renamed from: kotlinx.coroutines.sync.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0436c extends kotlinx.coroutines.internal.h {

        /* renamed from: d  reason: collision with root package name */
        public Object f33610d;

        public C0436c(Object obj) {
            k.g(obj, "owner");
            this.f33610d = obj;
        }

        @Override // kotlinx.coroutines.internal.j
        public String toString() {
            return "LockedQueue[" + this.f33610d + ']';
        }
    }

    /* compiled from: Mutex.kt */
    /* loaded from: classes3.dex */
    private static final class d extends p {

        /* renamed from: a  reason: collision with root package name */
        public final C0436c f33611a;

        public d(C0436c c0436c) {
            k.g(c0436c, "queue");
            this.f33611a = c0436c;
        }

        @Override // kotlinx.coroutines.internal.p
        public Object a(Object obj) {
            kotlinx.coroutines.internal.u uVar;
            Object obj2 = this.f33611a.y() ? kotlinx.coroutines.sync.d.f33620e : this.f33611a;
            if (obj != null) {
                c cVar = (c) obj;
                c.f33607a.compareAndSet(cVar, this, obj2);
                if (cVar._state == this.f33611a) {
                    uVar = kotlinx.coroutines.sync.d.f33616a;
                    return uVar;
                }
                return null;
            }
            throw new r("null cannot be cast to non-null type kotlinx.coroutines.sync.MutexImpl");
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    /* loaded from: classes3.dex */
    public static final class e extends j.a {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f33612d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ h f33613e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ c f33614f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Object f33615g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(j jVar, j jVar2, Object obj, h hVar, a aVar, c cVar, Object obj2) {
            super(jVar2);
            this.f33612d = obj;
            this.f33613e = hVar;
            this.f33614f = cVar;
            this.f33615g = obj2;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: g */
        public Object d(j jVar) {
            k.g(jVar, "affected");
            if (this.f33614f._state == this.f33612d) {
                return null;
            }
            return i.a();
        }
    }

    public c(boolean z10) {
        this._state = z10 ? kotlinx.coroutines.sync.d.f33619d : kotlinx.coroutines.sync.d.f33620e;
    }

    @Override // kotlinx.coroutines.sync.b
    public Object a(Object obj, ie.d<? super u> dVar) {
        return d(obj) ? u.f29813a : c(obj, dVar);
    }

    @Override // kotlinx.coroutines.sync.b
    public void b(Object obj) {
        kotlinx.coroutines.sync.a aVar;
        kotlinx.coroutines.internal.u uVar;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                if (obj == null) {
                    Object obj3 = ((kotlinx.coroutines.sync.a) obj2).f33606a;
                    uVar = kotlinx.coroutines.sync.d.f33618c;
                    if (!(obj3 != uVar)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    kotlinx.coroutines.sync.a aVar2 = (kotlinx.coroutines.sync.a) obj2;
                    if (!(aVar2.f33606a == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + aVar2.f33606a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33607a;
                aVar = kotlinx.coroutines.sync.d.f33620e;
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, aVar)) {
                    return;
                }
            } else if (obj2 instanceof p) {
                ((p) obj2).a(this);
            } else if (obj2 instanceof C0436c) {
                if (obj != null) {
                    C0436c c0436c = (C0436c) obj2;
                    if (!(c0436c.f33610d == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + c0436c.f33610d + " but expected " + obj).toString());
                    }
                }
                C0436c c0436c2 = (C0436c) obj2;
                j v10 = c0436c2.v();
                if (v10 == null) {
                    d dVar = new d(c0436c2);
                    if (f33607a.compareAndSet(this, obj2, dVar) && dVar.a(this) == null) {
                        return;
                    }
                } else {
                    b bVar = (b) v10;
                    Object z10 = bVar.z();
                    if (z10 != null) {
                        Object obj4 = bVar.f33609d;
                        if (obj4 == null) {
                            obj4 = kotlinx.coroutines.sync.d.f33617b;
                        }
                        c0436c2.f33610d = obj4;
                        bVar.y(z10);
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        r0 = r10.q();
        r1 = je.d.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
        if (r0 != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
        kotlin.coroutines.jvm.internal.h.c(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0095, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final /* synthetic */ java.lang.Object c(java.lang.Object r17, ie.d<? super ee.u> r18) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            we.i r10 = new we.i
            ie.d r0 = je.b.b(r18)
            r11 = 0
            r10.<init>(r0, r11)
            kotlinx.coroutines.sync.c$a r12 = new kotlinx.coroutines.sync.c$a
            r12.<init>(r9, r10)
        L13:
            java.lang.Object r3 = r8._state
            boolean r0 = r3 instanceof kotlinx.coroutines.sync.a
            if (r0 == 0) goto L51
            r0 = r3
            kotlinx.coroutines.sync.a r0 = (kotlinx.coroutines.sync.a) r0
            java.lang.Object r1 = r0.f33606a
            kotlinx.coroutines.internal.u r2 = kotlinx.coroutines.sync.d.f()
            if (r1 == r2) goto L31
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.c.f33607a
            kotlinx.coroutines.sync.c$c r2 = new kotlinx.coroutines.sync.c$c
            java.lang.Object r0 = r0.f33606a
            r2.<init>(r0)
            r1.compareAndSet(r8, r3, r2)
            goto L13
        L31:
            if (r9 != 0) goto L38
            kotlinx.coroutines.sync.a r0 = kotlinx.coroutines.sync.d.c()
            goto L3d
        L38:
            kotlinx.coroutines.sync.a r0 = new kotlinx.coroutines.sync.a
            r0.<init>(r9)
        L3d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.sync.c.f33607a
            boolean r0 = r1.compareAndSet(r8, r3, r0)
            if (r0 == 0) goto L13
            ee.u r0 = ee.u.f29813a
            ee.n$a r1 = ee.n.f29807a
            java.lang.Object r0 = ee.n.a(r0)
            r10.resumeWith(r0)
            goto L88
        L51:
            boolean r0 = r3 instanceof kotlinx.coroutines.sync.c.C0436c
            if (r0 == 0) goto Lb9
            r13 = r3
            kotlinx.coroutines.sync.c$c r13 = (kotlinx.coroutines.sync.c.C0436c) r13
            java.lang.Object r0 = r13.f33610d
            r14 = 1
            if (r0 == r9) goto L5f
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            if (r0 == 0) goto L9e
            kotlinx.coroutines.sync.c$e r15 = new kotlinx.coroutines.sync.c$e
            r0 = r15
            r1 = r12
            r2 = r12
            r4 = r10
            r5 = r12
            r6 = r16
            r7 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
        L70:
            java.lang.Object r0 = r13.o()
            if (r0 == 0) goto L96
            kotlinx.coroutines.internal.j r0 = (kotlinx.coroutines.internal.j) r0
            int r0 = r0.x(r12, r13, r15)
            if (r0 == r14) goto L83
            r1 = 2
            if (r0 == r1) goto L82
            goto L70
        L82:
            r14 = 0
        L83:
            if (r14 == 0) goto L13
            we.j.b(r10, r12)
        L88:
            java.lang.Object r0 = r10.q()
            java.lang.Object r1 = je.b.c()
            if (r0 != r1) goto L95
            kotlin.coroutines.jvm.internal.h.c(r18)
        L95:
            return r0
        L96:
            ee.r r0 = new ee.r
        */
        //  java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */"
        /*
            r0.<init>(r1)
            throw r0
        L9e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Already locked by "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lb9:
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.p
            if (r0 == 0) goto Lc4
            kotlinx.coroutines.internal.p r3 = (kotlinx.coroutines.internal.p) r3
            r3.a(r8)
            goto L13
        Lc4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Illegal state "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.c.c(java.lang.Object, ie.d):java.lang.Object");
    }

    public boolean d(Object obj) {
        kotlinx.coroutines.internal.u uVar;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                Object obj3 = ((kotlinx.coroutines.sync.a) obj2).f33606a;
                uVar = kotlinx.coroutines.sync.d.f33618c;
                if (obj3 != uVar) {
                    return false;
                }
                if (f33607a.compareAndSet(this, obj2, obj == null ? kotlinx.coroutines.sync.d.f33619d : new kotlinx.coroutines.sync.a(obj))) {
                    return true;
                }
            } else if (obj2 instanceof C0436c) {
                if (((C0436c) obj2).f33610d != obj) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (!(obj2 instanceof p)) {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            } else {
                ((p) obj2).a(this);
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.a) {
                return "Mutex[" + ((kotlinx.coroutines.sync.a) obj).f33606a + ']';
            } else if (!(obj instanceof p)) {
                if (!(obj instanceof C0436c)) {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
                return "Mutex[" + ((C0436c) obj).f33610d + ']';
            } else {
                ((p) obj).a(this);
            }
        }
    }
}
