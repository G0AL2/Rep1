package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzkd extends BroadcastReceiver {
    final /* synthetic */ zzke zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkd(zzke zzkeVar, zzkc zzkcVar) {
        this.zza = zzkeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final zzke zzkeVar = this.zza;
        zzke.zzc(zzkeVar).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzkb
            @Override // java.lang.Runnable
            public final void run() {
                zzke.zzd(zzke.this);
            }
        });
    }
}
