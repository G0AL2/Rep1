package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.e0;
import androidx.work.k;
import androidx.work.l;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o1.j;
import o1.o;
import o1.u;
import o1.v;
import o1.z;
import qe.k;
import r1.d;

/* compiled from: DiagnosticsWorker.kt */
/* loaded from: classes.dex */
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k.f(context, "context");
        k.f(workerParameters, "parameters");
    }

    @Override // androidx.work.Worker
    public k.a doWork() {
        String str;
        String str2;
        String d10;
        String str3;
        String str4;
        String d11;
        String str5;
        String str6;
        String d12;
        e0 n10 = e0.n(getApplicationContext());
        qe.k.e(n10, "getInstance(applicationContext)");
        WorkDatabase s10 = n10.s();
        qe.k.e(s10, "workManager.workDatabase");
        v h10 = s10.h();
        o f10 = s10.f();
        z i10 = s10.i();
        j e10 = s10.e();
        List<u> c10 = h10.c(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<u> s11 = h10.s();
        List<u> l10 = h10.l(200);
        if (!c10.isEmpty()) {
            l e11 = l.e();
            str5 = d.f36123a;
            e11.f(str5, "Recently completed work:\n\n");
            l e12 = l.e();
            str6 = d.f36123a;
            d12 = d.d(f10, i10, e10, c10);
            e12.f(str6, d12);
        }
        if (!s11.isEmpty()) {
            l e13 = l.e();
            str3 = d.f36123a;
            e13.f(str3, "Running work:\n\n");
            l e14 = l.e();
            str4 = d.f36123a;
            d11 = d.d(f10, i10, e10, s11);
            e14.f(str4, d11);
        }
        if (!l10.isEmpty()) {
            l e15 = l.e();
            str = d.f36123a;
            e15.f(str, "Enqueued work:\n\n");
            l e16 = l.e();
            str2 = d.f36123a;
            d10 = d.d(f10, i10, e10, l10);
            e16.f(str2, d10);
        }
        k.a c11 = k.a.c();
        qe.k.e(c11, "success()");
        return c11;
    }
}
