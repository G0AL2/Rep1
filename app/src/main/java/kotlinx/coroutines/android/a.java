package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import ee.u;
import ie.g;
import qe.k;
import qe.l;
import se.f;
import we.h;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes3.dex */
public final class a extends kotlinx.coroutines.android.b {
    private volatile a _immediate;

    /* renamed from: a  reason: collision with root package name */
    private final a f33482a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f33483b;

    /* renamed from: c  reason: collision with root package name */
    private final String f33484c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f33485d;

    /* compiled from: Runnable.kt */
    /* renamed from: kotlinx.coroutines.android.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class RunnableC0433a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h f33487b;

        public RunnableC0433a(h hVar) {
            this.f33487b = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f33487b.f(a.this, u.f29813a);
        }
    }

    /* compiled from: HandlerDispatcher.kt */
    /* loaded from: classes3.dex */
    static final class b extends l implements pe.l<Throwable, u> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f33489b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f33489b = runnable;
        }

        public final void a(Throwable th) {
            a.this.f33483b.removeCallbacks(this.f33489b);
        }

        @Override // pe.l
        public /* bridge */ /* synthetic */ u b(Throwable th) {
            a(th);
            return u.f29813a;
        }
    }

    private a(Handler handler, String str, boolean z10) {
        super(null);
        this.f33483b = handler;
        this.f33484c = str;
        this.f33485d = z10;
        this._immediate = z10 ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
        }
        this.f33482a = aVar;
    }

    @Override // we.m0
    public void e(long j10, h<? super u> hVar) {
        long e10;
        k.g(hVar, "continuation");
        RunnableC0433a runnableC0433a = new RunnableC0433a(hVar);
        Handler handler = this.f33483b;
        e10 = f.e(j10, 4611686018427387903L);
        handler.postDelayed(runnableC0433a, e10);
        hVar.e(new b(runnableC0433a));
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f33483b == this.f33483b;
    }

    @Override // we.z
    public void g0(g gVar, Runnable runnable) {
        k.g(gVar, "context");
        k.g(runnable, "block");
        this.f33483b.post(runnable);
    }

    @Override // we.z
    public boolean h0(g gVar) {
        k.g(gVar, "context");
        return !this.f33485d || (k.a(Looper.myLooper(), this.f33483b.getLooper()) ^ true);
    }

    public int hashCode() {
        return System.identityHashCode(this.f33483b);
    }

    @Override // we.s1
    /* renamed from: r0 */
    public a m0() {
        return this.f33482a;
    }

    @Override // we.z
    public String toString() {
        String str = this.f33484c;
        if (str != null) {
            if (this.f33485d) {
                return this.f33484c + " [immediate]";
            }
            return str;
        }
        String handler = this.f33483b.toString();
        k.b(handler, "handler.toString()");
        return handler;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Handler handler, String str) {
        this(handler, str, false);
        k.g(handler, "handler");
    }
}
