package da;

import android.os.Handler;
import da.f;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: BandwidthMeter.java */
/* loaded from: classes2.dex */
public interface f {

    /* compiled from: BandwidthMeter.java */
    /* loaded from: classes2.dex */
    public interface a {

        /* compiled from: BandwidthMeter.java */
        /* renamed from: da.f$a$a */
        /* loaded from: classes2.dex */
        public static final class C0368a {

            /* renamed from: a */
            private final CopyOnWriteArrayList<C0369a> f29162a = new CopyOnWriteArrayList<>();

            /* compiled from: BandwidthMeter.java */
            /* renamed from: da.f$a$a$a */
            /* loaded from: classes2.dex */
            public static final class C0369a {

                /* renamed from: a */
                private final Handler f29163a;

                /* renamed from: b */
                private final a f29164b;

                /* renamed from: c */
                private boolean f29165c;

                public C0369a(Handler handler, a aVar) {
                    this.f29163a = handler;
                    this.f29164b = aVar;
                }

                public void d() {
                    this.f29165c = true;
                }
            }

            public static /* synthetic */ void a(C0369a c0369a, int i10, long j10, long j11) {
                d(c0369a, i10, j10, j11);
            }

            public static /* synthetic */ void d(C0369a c0369a, int i10, long j10, long j11) {
                c0369a.f29164b.A(i10, j10, j11);
            }

            public void b(Handler handler, a aVar) {
                ea.a.e(handler);
                ea.a.e(aVar);
                e(aVar);
                this.f29162a.add(new C0369a(handler, aVar));
            }

            public void c(final int i10, final long j10, final long j11) {
                Iterator<C0369a> it = this.f29162a.iterator();
                while (it.hasNext()) {
                    final C0369a next = it.next();
                    if (!next.f29165c) {
                        next.f29163a.post(new Runnable() { // from class: da.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                f.a.C0368a.a(f.a.C0368a.C0369a.this, i10, j10, j11);
                            }
                        });
                    }
                }
            }

            public void e(a aVar) {
                Iterator<C0369a> it = this.f29162a.iterator();
                while (it.hasNext()) {
                    C0369a next = it.next();
                    if (next.f29164b == aVar) {
                        next.d();
                        this.f29162a.remove(next);
                    }
                }
            }
        }

        void A(int i10, long j10, long j11);
    }

    long a();

    m0 c();

    long f();

    void g(a aVar);

    void h(Handler handler, a aVar);
}
