package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzemo implements zzemw {
    final /* synthetic */ zzemp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemo(zzemp zzempVar) {
        this.zza = zzempVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdjz zzdjzVar;
        zzdjz zzdjzVar2 = (zzdjz) obj;
        synchronized (this.zza) {
            this.zza.zzh = zzdjzVar2;
            zzdjzVar = this.zza.zzh;
            zzdjzVar.zzW();
        }
    }
}
