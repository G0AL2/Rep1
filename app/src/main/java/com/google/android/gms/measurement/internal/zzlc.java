package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzlc implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb = "_err";
    final /* synthetic */ Bundle zzc;
    final /* synthetic */ zzld zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzlc(zzld zzldVar, String str, String str2, Bundle bundle) {
        this.zzd = zzldVar;
        this.zza = str;
        this.zzc = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zza.zzE((zzav) Preconditions.checkNotNull(this.zzd.zza.zzv().zzz(this.zza, this.zzb, this.zzc, "auto", this.zzd.zza.zzaw().currentTimeMillis(), false, true)), this.zza);
    }
}
