package n1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;

/* compiled from: NetworkStateTracker.kt */
/* loaded from: classes.dex */
public final class l extends e<l1.b> {

    /* renamed from: g  reason: collision with root package name */
    private final ConnectivityManager f34618g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, q1.c cVar) {
        super(context, cVar);
        qe.k.f(context, "context");
        qe.k.f(cVar, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        qe.k.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f34618g = (ConnectivityManager) systemService;
    }

    @Override // n1.e
    public IntentFilter j() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // n1.e
    public void k(Intent intent) {
        String str;
        qe.k.f(intent, "intent");
        if (qe.k.a(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            androidx.work.l e10 = androidx.work.l.e();
            str = k.f34617a;
            e10.a(str, "Network broadcast received");
            g(k.c(this.f34618g));
        }
    }

    @Override // n1.h
    /* renamed from: l */
    public l1.b e() {
        return k.c(this.f34618g);
    }
}
