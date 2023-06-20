package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k implements AppLovinBroadcastManager.Receiver {

    /* renamed from: b  reason: collision with root package name */
    private static AlertDialog f8503b;

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicBoolean f8504c = new AtomicBoolean();

    /* renamed from: a  reason: collision with root package name */
    private final l f8505a;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.sdk.utils.o f8506d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.sdk.k$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m f8507a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f8508b;

        AnonymousClass1(m mVar, a aVar) {
            this.f8507a = mVar;
            this.f8508b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            v A;
            String str;
            if (k.this.f8505a.d()) {
                if (v.a()) {
                    this.f8507a.A().e("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                    return;
                }
                return;
            }
            Activity a10 = this.f8507a.af().a();
            if (a10 != null && com.applovin.impl.sdk.utils.h.a(this.f8507a.L())) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.k.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AlertDialog unused = k.f8503b = new AlertDialog.Builder(AnonymousClass1.this.f8507a.af().a()).setTitle((CharSequence) AnonymousClass1.this.f8507a.a(com.applovin.impl.sdk.c.b.aG)).setMessage((CharSequence) AnonymousClass1.this.f8507a.a(com.applovin.impl.sdk.c.b.aH)).setCancelable(false).setPositiveButton((CharSequence) AnonymousClass1.this.f8507a.a(com.applovin.impl.sdk.c.b.aI), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.k.1.1.2
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i10) {
                                AnonymousClass1.this.f8508b.a();
                                dialogInterface.dismiss();
                                k.f8504c.set(false);
                            }
                        }).setNegativeButton((CharSequence) AnonymousClass1.this.f8507a.a(com.applovin.impl.sdk.c.b.aJ), new DialogInterface.OnClickListener() { // from class: com.applovin.impl.sdk.k.1.1.1
                            @Override // android.content.DialogInterface.OnClickListener
                            public void onClick(DialogInterface dialogInterface, int i10) {
                                AnonymousClass1.this.f8508b.b();
                                dialogInterface.dismiss();
                                k.f8504c.set(false);
                                long longValue = ((Long) AnonymousClass1.this.f8507a.a(com.applovin.impl.sdk.c.b.aE)).longValue();
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                k.this.a(longValue, anonymousClass1.f8507a, anonymousClass1.f8508b);
                            }
                        }).create();
                        k.f8503b.show();
                    }
                });
                return;
            }
            if (v.a()) {
                if (a10 == null) {
                    A = this.f8507a.A();
                    str = "No parent Activity found - rescheduling consent alert...";
                } else {
                    A = this.f8507a.A();
                    str = "No internet available - rescheduling consent alert...";
                }
                A.e("ConsentAlertManager", str);
            }
            k.f8504c.set(false);
            k.this.a(((Long) this.f8507a.a(com.applovin.impl.sdk.c.b.aF)).longValue(), this.f8507a, this.f8508b);
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(l lVar, m mVar) {
        this.f8505a = lVar;
        mVar.aj().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
        mVar.aj().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
    }

    public void a(long j10, m mVar, a aVar) {
        if (j10 <= 0) {
            return;
        }
        AlertDialog alertDialog = f8503b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            if (f8504c.getAndSet(true)) {
                if (j10 >= this.f8506d.a()) {
                    if (v.a()) {
                        v A = mVar.A();
                        A.d("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.f8506d.a() + " milliseconds");
                        return;
                    }
                    return;
                }
                if (v.a()) {
                    v A2 = mVar.A();
                    A2.b("ConsentAlertManager", "Scheduling consent alert earlier (" + j10 + "ms) than remaining scheduled time (" + this.f8506d.a() + "ms)");
                }
                this.f8506d.d();
            }
            if (v.a()) {
                v A3 = mVar.A();
                A3.b("ConsentAlertManager", "Scheduling consent alert for " + j10 + " milliseconds");
            }
            this.f8506d = com.applovin.impl.sdk.utils.o.a(j10, mVar, new AnonymousClass1(mVar, aVar));
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        if (this.f8506d == null) {
            return;
        }
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            this.f8506d.b();
        } else if ("com.applovin.application_resumed".equals(action)) {
            this.f8506d.c();
        }
    }
}
