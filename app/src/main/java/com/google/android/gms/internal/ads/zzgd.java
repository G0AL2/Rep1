package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgd extends BroadcastReceiver implements Runnable {
    final /* synthetic */ zzgf zza;
    private final zzge zzb;
    private final Handler zzc;

    public zzgd(zzgf zzgfVar, Handler handler, zzge zzgeVar) {
        this.zza = zzgfVar;
        this.zzc = handler;
        this.zzb = zzgeVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zzc.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}
