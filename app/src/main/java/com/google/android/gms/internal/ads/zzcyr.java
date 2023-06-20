package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcyr implements com.google.android.gms.ads.internal.overlay.zzo {
    private final zzdda zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    public zzcyr(zzdda zzddaVar) {
        this.zza = zzddaVar;
    }

    private final void zzh() {
        if (this.zzc.get()) {
            return;
        }
        this.zzc.set(true);
        this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        zzh();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i10) {
        this.zzb.set(true);
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}
