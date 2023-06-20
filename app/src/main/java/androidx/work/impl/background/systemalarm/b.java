package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.g;
import androidx.work.impl.v;
import androidx.work.impl.w;
import androidx.work.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o1.m;
import o1.u;

/* compiled from: CommandHandler.java */
/* loaded from: classes.dex */
public class b implements androidx.work.impl.e {

    /* renamed from: e  reason: collision with root package name */
    private static final String f4486e = l.i("CommandHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f4487a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<m, f> f4488b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Object f4489c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final w f4490d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(Context context, w wVar) {
        this.f4487a = context;
        this.f4490d = wVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent b(Context context, m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        return s(intent, mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent c(Context context, m mVar, boolean z10) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return s(intent, mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent e(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent f(Context context, m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        return s(intent, mVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Intent h(Context context, m mVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        return s(intent, mVar);
    }

    private void i(Intent intent, int i10, g gVar) {
        l e10 = l.e();
        String str = f4486e;
        e10.a(str, "Handling constraints changed " + intent);
        new c(this.f4487a, i10, gVar).a();
    }

    private void j(Intent intent, int i10, g gVar) {
        synchronized (this.f4489c) {
            m r10 = r(intent);
            l e10 = l.e();
            String str = f4486e;
            e10.a(str, "Handing delay met for " + r10);
            if (!this.f4488b.containsKey(r10)) {
                f fVar = new f(this.f4487a, i10, gVar, this.f4490d.d(r10));
                this.f4488b.put(r10, fVar);
                fVar.g();
            } else {
                l e11 = l.e();
                e11.a(str, "WorkSpec " + r10 + " is is already being handled for ACTION_DELAY_MET");
            }
        }
    }

    private void k(Intent intent, int i10) {
        m r10 = r(intent);
        boolean z10 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
        l e10 = l.e();
        String str = f4486e;
        e10.a(str, "Handling onExecutionCompleted " + intent + ", " + i10);
        d(r10, z10);
    }

    private void l(Intent intent, int i10, g gVar) {
        l e10 = l.e();
        String str = f4486e;
        e10.a(str, "Handling reschedule " + intent + ", " + i10);
        gVar.g().w();
    }

    private void m(Intent intent, int i10, g gVar) {
        m r10 = r(intent);
        l e10 = l.e();
        String str = f4486e;
        e10.a(str, "Handling schedule work for " + r10);
        WorkDatabase s10 = gVar.g().s();
        s10.beginTransaction();
        try {
            u h10 = s10.h().h(r10.b());
            if (h10 == null) {
                l e11 = l.e();
                e11.k(str, "Skipping scheduling " + r10 + " because it's no longer in the DB");
            } else if (h10.f34906b.f()) {
                l e12 = l.e();
                e12.k(str, "Skipping scheduling " + r10 + "because it is finished.");
            } else {
                long c10 = h10.c();
                if (!h10.h()) {
                    l e13 = l.e();
                    e13.a(str, "Setting up Alarms for " + r10 + "at " + c10);
                    a.c(this.f4487a, s10, r10, c10);
                } else {
                    l e14 = l.e();
                    e14.a(str, "Opportunistically setting an alarm for " + r10 + "at " + c10);
                    a.c(this.f4487a, s10, r10, c10);
                    gVar.f().a().execute(new g.b(gVar, a(this.f4487a), i10));
                }
                s10.setTransactionSuccessful();
            }
        } finally {
            s10.endTransaction();
        }
    }

    private void n(Intent intent, g gVar) {
        List<v> c10;
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        if (extras.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i10 = extras.getInt("KEY_WORKSPEC_GENERATION");
            c10 = new ArrayList<>(1);
            v b10 = this.f4490d.b(new m(string, i10));
            if (b10 != null) {
                c10.add(b10);
            }
        } else {
            c10 = this.f4490d.c(string);
        }
        for (v vVar : c10) {
            l e10 = l.e();
            String str = f4486e;
            e10.a(str, "Handing stopWork work for " + string);
            gVar.g().B(vVar);
            a.a(this.f4487a, gVar.g().s(), vVar.a());
            gVar.d(vVar.a(), false);
        }
    }

    private static boolean o(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    static m r(Intent intent) {
        return new m(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static Intent s(Intent intent, m mVar) {
        intent.putExtra("KEY_WORKSPEC_ID", mVar.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", mVar.a());
        return intent;
    }

    @Override // androidx.work.impl.e
    public void d(m mVar, boolean z10) {
        synchronized (this.f4489c) {
            f remove = this.f4488b.remove(mVar);
            this.f4490d.b(mVar);
            if (remove != null) {
                remove.h(z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p() {
        boolean z10;
        synchronized (this.f4489c) {
            z10 = !this.f4488b.isEmpty();
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Intent intent, int i10, g gVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            i(intent, i10, gVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            l(intent, i10, gVar);
        } else if (!o(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            l e10 = l.e();
            String str = f4486e;
            e10.c(str, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m(intent, i10, gVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            j(intent, i10, gVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            n(intent, gVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            k(intent, i10);
        } else {
            l e11 = l.e();
            String str2 = f4486e;
            e11.k(str2, "Ignoring intent " + intent);
        }
    }
}
