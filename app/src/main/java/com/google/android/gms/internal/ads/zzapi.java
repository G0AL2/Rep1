package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzapi extends BroadcastReceiver {
    final /* synthetic */ zzapj zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzapi(zzapj zzapjVar) {
        this.zza = zzapjVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzf();
    }
}
