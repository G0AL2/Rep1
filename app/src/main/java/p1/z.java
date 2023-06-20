package p1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.u;
import java.util.UUID;

/* compiled from: WorkProgressUpdater.java */
/* loaded from: classes.dex */
public class z implements androidx.work.q {

    /* renamed from: c  reason: collision with root package name */
    static final String f35494c = androidx.work.l.i("WorkProgressUpdater");

    /* renamed from: a  reason: collision with root package name */
    final WorkDatabase f35495a;

    /* renamed from: b  reason: collision with root package name */
    final q1.c f35496b;

    /* compiled from: WorkProgressUpdater.java */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UUID f35497a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.work.e f35498b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f35499c;

        a(UUID uuid, androidx.work.e eVar, androidx.work.impl.utils.futures.c cVar) {
            this.f35497a = uuid;
            this.f35498b = eVar;
            this.f35499c = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            o1.u h10;
            String uuid = this.f35497a.toString();
            androidx.work.l e10 = androidx.work.l.e();
            String str = z.f35494c;
            e10.a(str, "Updating progress for " + this.f35497a + " (" + this.f35498b + ")");
            z.this.f35495a.beginTransaction();
            try {
                h10 = z.this.f35495a.h().h(uuid);
            } finally {
                try {
                    return;
                } finally {
                }
            }
            if (h10 != null) {
                if (h10.f34906b == u.a.RUNNING) {
                    z.this.f35495a.g().c(new o1.q(uuid, this.f35498b));
                } else {
                    androidx.work.l e11 = androidx.work.l.e();
                    e11.k(str, "Ignoring setProgressAsync(...). WorkSpec (" + uuid + ") is not in a RUNNING state.");
                }
                this.f35499c.p(null);
                z.this.f35495a.setTransactionSuccessful();
                return;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
    }

    public z(WorkDatabase workDatabase, q1.c cVar) {
        this.f35495a = workDatabase;
        this.f35496b = cVar;
    }

    @Override // androidx.work.q
    public com.google.common.util.concurrent.c<Void> a(Context context, UUID uuid, androidx.work.e eVar) {
        androidx.work.impl.utils.futures.c t10 = androidx.work.impl.utils.futures.c.t();
        this.f35496b.c(new a(uuid, eVar, t10));
        return t10;
    }
}
