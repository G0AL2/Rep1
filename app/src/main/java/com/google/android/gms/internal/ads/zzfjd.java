package com.google.android.gms.internal.ads;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfjd extends BroadcastReceiver {
    final /* synthetic */ zzfje zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjd(zzfje zzfjeVar) {
        this.zza = zzfjeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyguardManager keyguardManager;
        if (intent == null) {
            return;
        }
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzfje.zzb(this.zza, true);
        } else if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzfje.zzb(this.zza, false);
        } else if (!"android.intent.action.SCREEN_ON".equals(intent.getAction()) || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null || keyguardManager.inKeyguardRestrictedInputMode()) {
        } else {
            zzfje.zzb(this.zza, false);
        }
    }
}
