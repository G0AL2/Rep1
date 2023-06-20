package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbov implements com.google.android.gms.ads.internal.overlay.zzu {
    boolean zza = false;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbov(zzbox zzboxVar, boolean z10, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, Map map2) {
        this.zzb = z10;
        this.zzc = zzaVar;
        this.zzd = map;
        this.zze = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzu
    public final void zza(boolean z10) {
        if (this.zza) {
            return;
        }
        if (z10 && this.zzb) {
            ((zzdjg) this.zzc).zzq();
        }
        this.zza = true;
        this.zzd.put((String) this.zze.get("event_id"), Boolean.valueOf(z10));
        ((zzbrd) this.zzc).zzd("openIntentAsync", this.zzd);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzu
    public final void zzb(int i10) {
    }
}
