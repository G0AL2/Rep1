package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class u extends db.c<AssetPackState> {

    /* renamed from: g  reason: collision with root package name */
    private final k1 f23035g;

    /* renamed from: h  reason: collision with root package name */
    private final t0 f23036h;

    /* renamed from: i  reason: collision with root package name */
    private final cb.d0<d3> f23037i;

    /* renamed from: j  reason: collision with root package name */
    private final k0 f23038j;

    /* renamed from: k  reason: collision with root package name */
    private final w0 f23039k;

    /* renamed from: l  reason: collision with root package name */
    private final bb.c f23040l;

    /* renamed from: m  reason: collision with root package name */
    private final cb.d0<Executor> f23041m;

    /* renamed from: n  reason: collision with root package name */
    private final cb.d0<Executor> f23042n;

    /* renamed from: o  reason: collision with root package name */
    private final Handler f23043o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(Context context, k1 k1Var, t0 t0Var, cb.d0<d3> d0Var, w0 w0Var, k0 k0Var, bb.c cVar, cb.d0<Executor> d0Var2, cb.d0<Executor> d0Var3) {
        super(new cb.e("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f23043o = new Handler(Looper.getMainLooper());
        this.f23035g = k1Var;
        this.f23036h = t0Var;
        this.f23037i = d0Var;
        this.f23039k = w0Var;
        this.f23038j = k0Var;
        this.f23040l = cVar;
        this.f23041m = d0Var2;
        this.f23042n = d0Var3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // db.c
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.f29331a.e("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.f29331a.e("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.FLAGS");
        if (bundleExtra2 != null) {
            this.f23040l.a(bundleExtra2);
        }
        AssetPackState a10 = AssetPackState.a(bundleExtra, stringArrayList.get(0), this.f23039k, w.f23084a);
        this.f29331a.c("ListenerRegistryBroadcastReceiver.onReceive: %s", a10);
        PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
        if (pendingIntent != null) {
            this.f23038j.a(pendingIntent);
        }
        this.f23042n.a().execute(new Runnable(this, bundleExtra, a10) { // from class: com.google.android.play.core.assetpacks.s

            /* renamed from: a  reason: collision with root package name */
            private final u f23004a;

            /* renamed from: b  reason: collision with root package name */
            private final Bundle f23005b;

            /* renamed from: c  reason: collision with root package name */
            private final AssetPackState f23006c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f23004a = this;
                this.f23005b = bundleExtra;
                this.f23006c = a10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f23004a.g(this.f23005b, this.f23006c);
            }
        });
        this.f23041m.a().execute(new Runnable(this, bundleExtra) { // from class: com.google.android.play.core.assetpacks.t

            /* renamed from: a  reason: collision with root package name */
            private final u f23016a;

            /* renamed from: b  reason: collision with root package name */
            private final Bundle f23017b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f23016a = this;
                this.f23017b = bundleExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f23016a.f(this.f23017b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void f(Bundle bundle) {
        if (this.f23035g.e(bundle)) {
            this.f23036h.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g(Bundle bundle, AssetPackState assetPackState) {
        if (this.f23035g.i(bundle)) {
            h(assetPackState);
            this.f23037i.a().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(AssetPackState assetPackState) {
        this.f23043o.post(new Runnable(this, assetPackState) { // from class: com.google.android.play.core.assetpacks.r

            /* renamed from: a  reason: collision with root package name */
            private final u f22995a;

            /* renamed from: b  reason: collision with root package name */
            private final AssetPackState f22996b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f22995a = this;
                this.f22996b = assetPackState;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f22995a.b(this.f22996b);
            }
        });
    }
}
