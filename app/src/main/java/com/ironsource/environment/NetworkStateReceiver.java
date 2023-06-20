package com.ironsource.environment;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

/* loaded from: classes3.dex */
public class NetworkStateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private ConnectivityManager f26108a;

    /* renamed from: b  reason: collision with root package name */
    private j f26109b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f26110c = false;

    /* loaded from: classes3.dex */
    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (NetworkStateReceiver.this.f26109b != null) {
                NetworkStateReceiver.this.f26109b.a(NetworkStateReceiver.this.f26110c);
            }
        }
    }

    public NetworkStateReceiver(Context context, j jVar) {
        this.f26109b = jVar;
        this.f26108a = (ConnectivityManager) context.getSystemService("connectivity");
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean b() {
        /*
            r4 = this;
            boolean r0 = r4.f26110c
            android.net.ConnectivityManager r1 = r4.f26108a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1a
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L1a
            if (r1 == 0) goto L16
            boolean r1 = r1.isConnectedOrConnecting()     // Catch: java.lang.Exception -> L1a
            if (r1 == 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            r4.f26110c = r1     // Catch: java.lang.Exception -> L1a
            goto L1c
        L1a:
            r4.f26110c = r3
        L1c:
            boolean r1 = r4.f26110c
            if (r0 == r1) goto L21
            return r2
        L21:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.environment.NetworkStateReceiver.b():boolean");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getExtras() == null || !b()) {
            return;
        }
        com.ironsource.environment.e.c cVar = com.ironsource.environment.e.c.f26160a;
        com.ironsource.environment.e.c.b(new a(), 0L);
    }
}
