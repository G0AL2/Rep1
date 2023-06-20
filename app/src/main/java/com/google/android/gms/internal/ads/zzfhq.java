package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfhq implements zzfuy {
    final /* synthetic */ zzfhs zza;
    final /* synthetic */ zzfhh zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfhq(zzfhs zzfhsVar, zzfhh zzfhhVar) {
        this.zza = zzfhsVar;
        this.zzb = zzfhhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        zzfhs zzfhsVar = this.zza;
        zzfhh zzfhhVar = this.zzb;
        zzfhhVar.zze(false);
        zzfhsVar.zza(zzfhhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zzb(Object obj) {
    }
}
