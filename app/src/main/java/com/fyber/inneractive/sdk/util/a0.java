package com.fyber.inneractive.sdk.util;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.b0;

/* loaded from: classes2.dex */
public class a0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b0 f20231a;

    public a0(b0 b0Var) {
        this.f20231a = b0Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean z10;
        b0 b0Var = this.f20231a;
        b0Var.getClass();
        IAlog.a("%sonReceive. action = %s", IAlog.a(b0Var), intent.getAction());
        b0 b0Var2 = this.f20231a;
        synchronized (b0Var2) {
            try {
                z10 = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
            } catch (Exception unused) {
                IAlog.a("%sFailed to get lock screen status", IAlog.a(b0Var2));
                z10 = false;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                b0Var2.f20233b = true;
            } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !z10) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                b0Var2.f20233b = false;
            }
            IAlog.a("%sNew screen state is locked: %s. number of listeners: %d", IAlog.a(b0Var2), Boolean.valueOf(b0Var2.f20233b), Integer.valueOf(b0Var2.f20232a.size()));
            for (b0.b bVar : b0Var2.f20232a) {
                bVar.b(b0Var2.f20233b);
            }
        }
    }
}
