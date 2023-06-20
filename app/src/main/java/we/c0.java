package we;

import ie.g;
import we.d2;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes3.dex */
public final class c0 extends ie.a implements d2<String> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38591b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final long f38592a;

    /* compiled from: CoroutineContext.kt */
    /* loaded from: classes3.dex */
    public static final class a implements g.c<c0> {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }
    }

    public c0(long j10) {
        super(f38591b);
        this.f38592a = j10;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c0) {
                if (this.f38592a == ((c0) obj).f38592a) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // ie.a, ie.g
    public <R> R fold(R r10, pe.p<? super R, ? super g.b, ? extends R> pVar) {
        qe.k.g(pVar, "operation");
        return (R) d2.a.a(this, r10, pVar);
    }

    public final long g0() {
        return this.f38592a;
    }

    @Override // ie.a, ie.g.b, ie.g
    public <E extends g.b> E get(g.c<E> cVar) {
        qe.k.g(cVar, "key");
        return (E) d2.a.b(this, cVar);
    }

    @Override // we.d2
    /* renamed from: h0 */
    public void w(ie.g gVar, String str) {
        qe.k.g(gVar, "context");
        qe.k.g(str, "oldState");
        Thread currentThread = Thread.currentThread();
        qe.k.b(currentThread, "Thread.currentThread()");
        currentThread.setName(str);
    }

    public int hashCode() {
        long j10 = this.f38592a;
        return (int) (j10 ^ (j10 >>> 32));
    }

    @Override // we.d2
    /* renamed from: m0 */
    public String O(ie.g gVar) {
        int T;
        qe.k.g(gVar, "context");
        d0 d0Var = (d0) gVar.get(d0.f38594b);
        String str = (d0Var == null || (str = d0Var.g0()) == null) ? "coroutine" : "coroutine";
        Thread currentThread = Thread.currentThread();
        qe.k.b(currentThread, "currentThread");
        String name = currentThread.getName();
        qe.k.b(name, "oldName");
        T = ve.q.T(name, " @", 0, false, 6, null);
        if (T < 0) {
            T = name.length();
        }
        StringBuilder sb2 = new StringBuilder(str.length() + T + 10);
        String substring = name.substring(0, T);
        qe.k.b(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        sb2.append(substring);
        sb2.append(" @");
        sb2.append(str);
        sb2.append('#');
        sb2.append(this.f38592a);
        String sb3 = sb2.toString();
        qe.k.b(sb3, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb3);
        return name;
    }

    @Override // ie.a, ie.g
    public ie.g minusKey(g.c<?> cVar) {
        qe.k.g(cVar, "key");
        return d2.a.c(this, cVar);
    }

    @Override // ie.a, ie.g
    public ie.g plus(ie.g gVar) {
        qe.k.g(gVar, "context");
        return d2.a.d(this, gVar);
    }

    public String toString() {
        return "CoroutineId(" + this.f38592a + ')';
    }
}
