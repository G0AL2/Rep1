package p1;

import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.e0;
import androidx.work.o;
import java.util.List;

/* compiled from: EnqueueRunnable.java */
/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    private static final String f35441c = androidx.work.l.i("EnqueueRunnable");

    /* renamed from: a  reason: collision with root package name */
    private final androidx.work.impl.x f35442a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.work.impl.o f35443b;

    public c(androidx.work.impl.x xVar) {
        this(xVar, new androidx.work.impl.o());
    }

    private static boolean b(androidx.work.impl.x xVar) {
        boolean c10 = c(xVar.g(), xVar.f(), (String[]) androidx.work.impl.x.l(xVar).toArray(new String[0]), xVar.d(), xVar.b());
        xVar.k();
        return c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(androidx.work.impl.e0 r18, java.util.List<? extends androidx.work.x> r19, java.lang.String[] r20, java.lang.String r21, androidx.work.f r22) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.c.c(androidx.work.impl.e0, java.util.List, java.lang.String[], java.lang.String, androidx.work.f):boolean");
    }

    private static boolean e(androidx.work.impl.x xVar) {
        List<androidx.work.impl.x> e10 = xVar.e();
        boolean z10 = false;
        if (e10 != null) {
            for (androidx.work.impl.x xVar2 : e10) {
                if (!xVar2.j()) {
                    z10 |= e(xVar2);
                } else {
                    androidx.work.l e11 = androidx.work.l.e();
                    String str = f35441c;
                    e11.k(str, "Already enqueued work ids (" + TextUtils.join(", ", xVar2.c()) + ")");
                }
            }
        }
        return b(xVar) | z10;
    }

    public boolean a() {
        WorkDatabase s10 = this.f35442a.g().s();
        s10.beginTransaction();
        try {
            boolean e10 = e(this.f35442a);
            s10.setTransactionSuccessful();
            return e10;
        } finally {
            s10.endTransaction();
        }
    }

    public androidx.work.o d() {
        return this.f35443b;
    }

    public void f() {
        e0 g10 = this.f35442a.g();
        androidx.work.impl.u.b(g10.l(), g10.s(), g10.q());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.f35442a.h()) {
                if (a()) {
                    m.a(this.f35442a.g().k(), RescheduleReceiver.class, true);
                    f();
                }
                this.f35443b.b(androidx.work.o.f4726a);
                return;
            }
            throw new IllegalStateException("WorkContinuation has cycles (" + this.f35442a + ")");
        } catch (Throwable th) {
            this.f35443b.b(new o.b.a(th));
        }
    }

    public c(androidx.work.impl.x xVar, androidx.work.impl.o oVar) {
        this.f35442a = xVar;
        this.f35443b = oVar;
    }
}
