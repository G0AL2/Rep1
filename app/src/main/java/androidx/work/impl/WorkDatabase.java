package androidx.work.impl;

import android.content.Context;
import androidx.room.j0;
import androidx.room.k0;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Executor;
import z0.h;

/* compiled from: WorkDatabase.kt */
/* loaded from: classes.dex */
public abstract class WorkDatabase extends k0 {

    /* renamed from: a */
    public static final a f4462a = new a(null);

    /* compiled from: WorkDatabase.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(qe.g gVar) {
            this();
        }

        public static /* synthetic */ z0.h a(Context context, h.b bVar) {
            return c(context, bVar);
        }

        public static final z0.h c(Context context, h.b bVar) {
            qe.k.f(context, "$context");
            qe.k.f(bVar, "configuration");
            h.b.a a10 = h.b.f39884f.a(context);
            a10.d(bVar.f39886b).c(bVar.f39887c).e(true).a(true);
            return new a1.f().a(a10.b());
        }

        public final WorkDatabase b(final Context context, Executor executor, boolean z10) {
            k0.a f10;
            qe.k.f(context, "context");
            qe.k.f(executor, "queryExecutor");
            if (z10) {
                f10 = j0.c(context, WorkDatabase.class).c();
            } else {
                f10 = j0.a(context, WorkDatabase.class, "androidx.work.workdb").f(new h.c() { // from class: androidx.work.impl.y
                    @Override // z0.h.c
                    public final z0.h a(h.b bVar) {
                        return WorkDatabase.a.a(context, bVar);
                    }
                });
            }
            return (WorkDatabase) f10.g(executor).a(c.f4541a).b(i.f4624a).b(new s(context, 2, 3)).b(j.f4625a).b(k.f4626a).b(new s(context, 5, 6)).b(l.f4627a).b(m.f4628a).b(n.f4629a).b(new f0(context)).b(new s(context, 10, 11)).b(f.f4558a).b(g.f4587a).b(h.f4590a).e().d();
        }
    }

    public static final WorkDatabase a(Context context, Executor executor, boolean z10) {
        return f4462a.b(context, executor, z10);
    }

    public abstract o1.b b();

    public abstract o1.e c();

    public abstract o1.g d();

    public abstract o1.j e();

    public abstract o1.o f();

    public abstract o1.r g();

    public abstract o1.v h();

    public abstract o1.z i();
}
