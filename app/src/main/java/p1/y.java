package p1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* compiled from: WorkForegroundUpdater.java */
/* loaded from: classes.dex */
public class y implements androidx.work.h {

    /* renamed from: a  reason: collision with root package name */
    private final q1.c f35486a;

    /* renamed from: b  reason: collision with root package name */
    final androidx.work.impl.foreground.a f35487b;

    /* renamed from: c  reason: collision with root package name */
    final o1.v f35488c;

    /* compiled from: WorkForegroundUpdater.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f35489a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ UUID f35490b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.work.g f35491c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f35492d;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, androidx.work.g gVar, Context context) {
            this.f35489a = cVar;
            this.f35490b = uuid;
            this.f35491c = gVar;
            this.f35492d = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f35489a.isCancelled()) {
                    String uuid = this.f35490b.toString();
                    o1.u h10 = y.this.f35488c.h(uuid);
                    if (h10 != null && !h10.f34906b.f()) {
                        y.this.f35487b.c(uuid, this.f35491c);
                        this.f35492d.startService(androidx.work.impl.foreground.b.c(this.f35492d, o1.x.a(h10), this.f35491c));
                    } else {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                }
                this.f35489a.p(null);
            } catch (Throwable th) {
                this.f35489a.q(th);
            }
        }
    }

    static {
        androidx.work.l.i("WMFgUpdater");
    }

    public y(WorkDatabase workDatabase, androidx.work.impl.foreground.a aVar, q1.c cVar) {
        this.f35487b = aVar;
        this.f35486a = cVar;
        this.f35488c = workDatabase.h();
    }

    @Override // androidx.work.h
    public com.google.common.util.concurrent.c<Void> a(Context context, UUID uuid, androidx.work.g gVar) {
        androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
        this.f35486a.c(new a(t10, uuid, gVar, context));
        return t10;
    }
}
