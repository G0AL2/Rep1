package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcve extends zzcxx {
    private final View zzc;
    private final zzcli zzd;
    private final zzfbm zze;
    private final int zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final zzcuw zzi;
    private zzbck zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcve(zzcxw zzcxwVar, View view, zzcli zzcliVar, zzfbm zzfbmVar, int i10, boolean z10, boolean z11, zzcuw zzcuwVar) {
        super(zzcxwVar);
        this.zzc = view;
        this.zzd = zzcliVar;
        this.zze = zzfbmVar;
        this.zzf = i10;
        this.zzg = z10;
        this.zzh = z11;
        this.zzi = zzcuwVar;
    }

    public final int zza() {
        return this.zzf;
    }

    public final View zzb() {
        return this.zzc;
    }

    public final zzfbm zzc() {
        return zzfch.zzb(this.zzb.zzs, this.zze);
    }

    public final void zzd(zzbca zzbcaVar) {
        this.zzd.zzaj(zzbcaVar);
    }

    public final boolean zze() {
        return this.zzg;
    }

    public final boolean zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return this.zzd.zzay();
    }

    public final boolean zzh() {
        return this.zzd.zzP() != null && this.zzd.zzP().zzJ();
    }

    public final void zzi(long j10, int i10) {
        this.zzi.zza(j10, i10);
    }

    public final zzbck zzj() {
        return this.zzj;
    }

    public final void zzk(zzbck zzbckVar) {
        this.zzj = zzbckVar;
    }
}
