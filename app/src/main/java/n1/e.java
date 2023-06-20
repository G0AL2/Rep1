package n1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: BroadcastReceiverConstraintTracker.kt */
/* loaded from: classes.dex */
public abstract class e<T> extends h<T> {

    /* renamed from: f  reason: collision with root package name */
    private final BroadcastReceiver f34603f;

    /* compiled from: BroadcastReceiverConstraintTracker.kt */
    /* loaded from: classes.dex */
    public static final class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e<T> f34604a;

        a(e<T> eVar) {
            this.f34604a = eVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            qe.k.f(context, "context");
            qe.k.f(intent, "intent");
            this.f34604a.k(intent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, q1.c cVar) {
        super(context, cVar);
        qe.k.f(context, "context");
        qe.k.f(cVar, "taskExecutor");
        this.f34603f = new a(this);
    }

    @Override // n1.h
    public void h() {
        String str;
        androidx.work.l e10 = androidx.work.l.e();
        str = f.f34605a;
        e10.a(str, getClass().getSimpleName() + ": registering receiver");
        d().registerReceiver(this.f34603f, j());
    }

    @Override // n1.h
    public void i() {
        String str;
        androidx.work.l e10 = androidx.work.l.e();
        str = f.f34605a;
        e10.a(str, getClass().getSimpleName() + ": unregistering receiver");
        d().unregisterReceiver(this.f34603f);
    }

    public abstract IntentFilter j();

    public abstract void k(Intent intent);
}
