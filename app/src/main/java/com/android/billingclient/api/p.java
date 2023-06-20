package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.internal.play_billing.zzb;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes.dex */
public final class p extends BroadcastReceiver {

    /* renamed from: a */
    private final o2.h f6090a;

    /* renamed from: b */
    private final o2.o f6091b;

    /* renamed from: c */
    private boolean f6092c;

    /* renamed from: d */
    final /* synthetic */ q f6093d;

    public /* synthetic */ p(q qVar, o2.o oVar, o2.u uVar) {
        this.f6093d = qVar;
        this.f6090a = null;
        this.f6091b = null;
    }

    public static /* bridge */ /* synthetic */ o2.o a(p pVar) {
        o2.o oVar = pVar.f6091b;
        return null;
    }

    public final void c(Context context, IntentFilter intentFilter) {
        p pVar;
        if (this.f6092c) {
            return;
        }
        pVar = this.f6093d.f6095b;
        context.registerReceiver(pVar, intentFilter);
        this.f6092c = true;
    }

    public final void d(Context context) {
        p pVar;
        if (!this.f6092c) {
            zzb.zzn("BillingBroadcastManager", "Receiver is not registered.");
            return;
        }
        pVar = this.f6093d.f6095b;
        context.unregisterReceiver(pVar);
        this.f6092c = false;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f6090a.onPurchasesUpdated(zzb.zzh(intent, "BillingBroadcastManager"), zzb.zzl(intent.getExtras()));
    }

    public /* synthetic */ p(q qVar, o2.h hVar, o2.u uVar) {
        this.f6093d = qVar;
        this.f6090a = hVar;
        this.f6091b = null;
    }
}
