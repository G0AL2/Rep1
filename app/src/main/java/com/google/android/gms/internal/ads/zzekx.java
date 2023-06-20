package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzekx implements com.google.android.gms.ads.internal.zzf {
    final /* synthetic */ zzdka zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzekx(zzeky zzekyVar, zzdka zzdkaVar) {
        this.zza = zzdkaVar;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zza(View view) {
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        this.zza.zzb().onAdClicked();
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        this.zza.zzc().zza();
        this.zza.zzf().zza();
    }
}
