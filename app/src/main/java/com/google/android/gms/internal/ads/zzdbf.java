package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdbf {
    private final Context zza;
    private final zzfcd zzb;
    private final Bundle zzc;
    private final zzfby zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdbf(zzdbd zzdbdVar, zzdbe zzdbeVar) {
        this.zza = zzdbd.zza(zzdbdVar);
        this.zzb = zzdbd.zzi(zzdbdVar);
        this.zzc = zzdbd.zzb(zzdbdVar);
        this.zzd = zzdbd.zzh(zzdbdVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context zza(Context context) {
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Bundle zzb() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdbd zzc() {
        zzdbd zzdbdVar = new zzdbd();
        zzdbdVar.zzc(this.zza);
        zzdbdVar.zzf(this.zzb);
        zzdbdVar.zzd(this.zzc);
        return zzdbdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfby zzd() {
        return this.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzfcd zze() {
        return this.zzb;
    }
}
