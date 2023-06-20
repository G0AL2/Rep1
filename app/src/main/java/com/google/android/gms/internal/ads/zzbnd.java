package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbnd extends zzbme {
    final /* synthetic */ zzbng zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzbnd(zzbng zzbngVar, zzbnc zzbncVar) {
        this.zza = zzbngVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmf
    public final void zze(zzblv zzblvVar, String str) {
        zzbng zzbngVar = this.zza;
        if (zzbng.zza(zzbngVar) == null) {
            return;
        }
        zzbng.zza(zzbngVar).onCustomClick(zzbng.zzc(zzbngVar, zzblvVar), str);
    }
}
