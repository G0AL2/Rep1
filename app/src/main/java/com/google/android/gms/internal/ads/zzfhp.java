package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfhp implements zzfuy {
    final /* synthetic */ zzfhs zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ boolean zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhp(zzfhs zzfhsVar, zzfhh zzfhhVar, boolean z10) {
        this.zza = zzfhsVar;
        this.zzb = zzfhhVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzfhh zzfhhVar = this.zzb;
        if (zzfhhVar.zzh()) {
            zzfhs zzfhsVar = this.zza;
            zzfhhVar.zze(false);
            zzfhsVar.zza(zzfhhVar);
            if (this.zzc) {
                this.zza.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zzb(Object obj) {
        zzfhs zzfhsVar = this.zza;
        zzfhh zzfhhVar = this.zzb;
        zzfhhVar.zze(true);
        zzfhsVar.zza(zzfhhVar);
        if (this.zzc) {
            this.zza.zzg();
        }
    }
}
