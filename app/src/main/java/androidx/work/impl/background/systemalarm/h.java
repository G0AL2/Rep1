package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.impl.t;
import androidx.work.l;
import o1.u;
import o1.x;

/* compiled from: SystemAlarmScheduler.java */
/* loaded from: classes.dex */
public class h implements t {

    /* renamed from: b  reason: collision with root package name */
    private static final String f4527b = l.i("SystemAlarmScheduler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f4528a;

    public h(Context context) {
        this.f4528a = context.getApplicationContext();
    }

    private void b(u uVar) {
        l e10 = l.e();
        String str = f4527b;
        e10.a(str, "Scheduling work with workSpecId " + uVar.f34905a);
        this.f4528a.startService(b.f(this.f4528a, x.a(uVar)));
    }

    @Override // androidx.work.impl.t
    public void a(u... uVarArr) {
        for (u uVar : uVarArr) {
            b(uVar);
        }
    }

    @Override // androidx.work.impl.t
    public void c(String str) {
        this.f4528a.startService(b.g(this.f4528a, str));
    }

    @Override // androidx.work.impl.t
    public boolean e() {
        return true;
    }
}
