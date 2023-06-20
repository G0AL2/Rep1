package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzd;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class k implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6066a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private boolean f6067b = false;

    /* renamed from: c  reason: collision with root package name */
    private o2.c f6068c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b f6069d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ k(b bVar, o2.c cVar, o2.k kVar) {
        this.f6069d = bVar;
        this.f6068c = cVar;
    }

    private final void d(e eVar) {
        synchronized (this.f6066a) {
            o2.c cVar = this.f6068c;
            if (cVar != null) {
                cVar.onBillingSetupFinished(eVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.Object a() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.k.a():java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void b() {
        b.E(this.f6069d, 0);
        b.k(this.f6069d, null);
        d(l.f6082m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        synchronized (this.f6066a) {
            this.f6068c = null;
            this.f6067b = true;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzm("BillingClient", "Billing service connected.");
        b.k(this.f6069d, zzd.zzo(iBinder));
        b bVar = this.f6069d;
        if (b.D(bVar, new Callable() { // from class: com.android.billingclient.api.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                k.this.a();
                return null;
            }
        }, 30000L, new Runnable() { // from class: com.android.billingclient.api.i
            @Override // java.lang.Runnable
            public final void run() {
                k.this.b();
            }
        }, b.x(bVar)) == null) {
            d(b.y(this.f6069d));
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzn("BillingClient", "Billing service disconnected.");
        b.k(this.f6069d, null);
        b.E(this.f6069d, 0);
        synchronized (this.f6066a) {
            o2.c cVar = this.f6068c;
            if (cVar != null) {
                cVar.onBillingServiceDisconnected();
            }
        }
    }
}
