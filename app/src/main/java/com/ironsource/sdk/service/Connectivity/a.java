package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    final d f28219a;

    /* renamed from: b  reason: collision with root package name */
    private BroadcastReceiver f28220b = new C0356a();

    /* renamed from: com.ironsource.sdk.service.Connectivity.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0356a extends BroadcastReceiver {
        C0356a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String a10 = com.ironsource.d.a.a(context);
            if (a10.equals("none")) {
                a.this.f28219a.a();
                return;
            }
            d dVar = a.this.f28219a;
            new JSONObject();
            dVar.a(a10);
        }
    }

    public a(d dVar) {
        this.f28219a = dVar;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void a() {
        this.f28220b = null;
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void a(Context context) {
        try {
            context.registerReceiver(this.f28220b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final void b(Context context) {
        try {
            context.unregisterReceiver(this.f28220b);
        } catch (IllegalArgumentException unused) {
        } catch (Exception e10) {
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e10);
        }
    }

    @Override // com.ironsource.sdk.service.Connectivity.c
    public final JSONObject c(Context context) {
        return new JSONObject();
    }
}
