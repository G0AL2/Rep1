package n1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* compiled from: NetworkStateTracker.kt */
/* loaded from: classes.dex */
public final class j extends h<l1.b> {

    /* renamed from: f  reason: collision with root package name */
    private final ConnectivityManager f34614f;

    /* renamed from: g  reason: collision with root package name */
    private final a f34615g;

    /* compiled from: NetworkStateTracker.kt */
    /* loaded from: classes.dex */
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            String str;
            qe.k.f(network, "network");
            qe.k.f(networkCapabilities, "capabilities");
            androidx.work.l e10 = androidx.work.l.e();
            str = k.f34617a;
            e10.a(str, "Network capabilities changed: " + networkCapabilities);
            j jVar = j.this;
            jVar.g(k.c(jVar.f34614f));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            String str;
            qe.k.f(network, "network");
            androidx.work.l e10 = androidx.work.l.e();
            str = k.f34617a;
            e10.a(str, "Network connection lost");
            j jVar = j.this;
            jVar.g(k.c(jVar.f34614f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, q1.c cVar) {
        super(context, cVar);
        qe.k.f(context, "context");
        qe.k.f(cVar, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        qe.k.d(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f34614f = (ConnectivityManager) systemService;
        this.f34615g = new a();
    }

    @Override // n1.h
    public void h() {
        String str;
        String str2;
        String str3;
        try {
            androidx.work.l e10 = androidx.work.l.e();
            str3 = k.f34617a;
            e10.a(str3, "Registering network callback");
            p1.l.a(this.f34614f, this.f34615g);
        } catch (IllegalArgumentException e11) {
            androidx.work.l e12 = androidx.work.l.e();
            str2 = k.f34617a;
            e12.d(str2, "Received exception while registering network callback", e11);
        } catch (SecurityException e13) {
            androidx.work.l e14 = androidx.work.l.e();
            str = k.f34617a;
            e14.d(str, "Received exception while registering network callback", e13);
        }
    }

    @Override // n1.h
    public void i() {
        String str;
        String str2;
        String str3;
        try {
            androidx.work.l e10 = androidx.work.l.e();
            str3 = k.f34617a;
            e10.a(str3, "Unregistering network callback");
            p1.j.c(this.f34614f, this.f34615g);
        } catch (IllegalArgumentException e11) {
            androidx.work.l e12 = androidx.work.l.e();
            str2 = k.f34617a;
            e12.d(str2, "Received exception while unregistering network callback", e11);
        } catch (SecurityException e13) {
            androidx.work.l e14 = androidx.work.l.e();
            str = k.f34617a;
            e14.d(str, "Received exception while unregistering network callback", e13);
        }
    }

    @Override // n1.h
    /* renamed from: k */
    public l1.b e() {
        return k.c(this.f34614f);
    }
}
