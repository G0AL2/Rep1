package p1;

import androidx.work.impl.e0;

/* compiled from: StopWorkRunnable.java */
/* loaded from: classes.dex */
public class s implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final String f35468d = androidx.work.l.i("StopWorkRunnable");

    /* renamed from: a  reason: collision with root package name */
    private final e0 f35469a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.work.impl.v f35470b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f35471c;

    public s(e0 e0Var, androidx.work.impl.v vVar, boolean z10) {
        this.f35469a = e0Var;
        this.f35470b = vVar;
        this.f35471c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean u10;
        if (this.f35471c) {
            u10 = this.f35469a.p().t(this.f35470b);
        } else {
            u10 = this.f35469a.p().u(this.f35470b);
        }
        androidx.work.l e10 = androidx.work.l.e();
        String str = f35468d;
        e10.a(str, "StopWorkRunnable for " + this.f35470b.a().b() + "; Processor.stopWork = " + u10);
    }
}
