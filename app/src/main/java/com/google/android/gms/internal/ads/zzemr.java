package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzemr implements zzemw {
    final /* synthetic */ zzems zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemr(zzems zzemsVar) {
        this.zza = zzemsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzemw
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zza) {
            this.zza.zzc = ((zzcxx) obj).zzl();
            ((zzcxx) obj).zzW();
        }
    }
}
