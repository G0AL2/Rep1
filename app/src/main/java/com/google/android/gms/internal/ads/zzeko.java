package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzeko implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzcga zza;
    final /* synthetic */ zzfbx zzb;
    final /* synthetic */ zzfbl zzc;
    final /* synthetic */ zzeku zzd;
    final /* synthetic */ zzekp zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeko(zzekp zzekpVar, zzcga zzcgaVar, zzfbx zzfbxVar, zzfbl zzfblVar, zzeku zzekuVar) {
        this.zze = zzekpVar;
        this.zza = zzcgaVar;
        this.zzb = zzfbxVar;
        this.zzc = zzfblVar;
        this.zzd = zzekuVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
        zzeky zzekyVar;
        zzcga zzcgaVar = this.zza;
        zzekyVar = this.zze.zzd;
        zzcgaVar.zzd(zzekyVar.zza(this.zzb, this.zzc, view, this.zzd));
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
    }
}
