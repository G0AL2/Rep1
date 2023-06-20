package p1;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* compiled from: IdGenerator.kt */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a */
    private final WorkDatabase f35448a;

    public g(WorkDatabase workDatabase) {
        qe.k.f(workDatabase, "workDatabase");
        this.f35448a = workDatabase;
    }

    public static /* synthetic */ Integer a(g gVar, int i10, int i11) {
        return f(gVar, i10, i11);
    }

    public static /* synthetic */ Integer b(g gVar) {
        return d(gVar);
    }

    public static final Integer d(g gVar) {
        int d10;
        qe.k.f(gVar, "this$0");
        d10 = h.d(gVar.f35448a, "next_alarm_manager_id");
        return Integer.valueOf(d10);
    }

    public static final Integer f(g gVar, int i10, int i11) {
        int d10;
        qe.k.f(gVar, "this$0");
        d10 = h.d(gVar.f35448a, "next_job_scheduler_id");
        boolean z10 = false;
        if (i10 <= d10 && d10 <= i11) {
            z10 = true;
        }
        if (z10) {
            i10 = d10;
        } else {
            h.e(gVar.f35448a, "next_job_scheduler_id", i10 + 1);
        }
        return Integer.valueOf(i10);
    }

    public final int c() {
        Object runInTransaction = this.f35448a.runInTransaction(new Callable() { // from class: p1.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.b(g.this);
            }
        });
        qe.k.e(runInTransaction, "workDatabase.runInTransa…ANAGER_ID_KEY)\n        })");
        return ((Number) runInTransaction).intValue();
    }

    public final int e(final int i10, final int i11) {
        Object runInTransaction = this.f35448a.runInTransaction(new Callable() { // from class: p1.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return g.a(g.this, i10, i11);
            }
        });
        qe.k.e(runInTransaction, "workDatabase.runInTransa…            id\n        })");
        return ((Number) runInTransaction).intValue();
    }
}
