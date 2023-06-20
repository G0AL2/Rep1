package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeax extends zzbzq {
    final /* synthetic */ zzeay zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzeax(zzeay zzeayVar) {
        this.zza = zzeayVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) {
        this.zza.zza.zze(new com.google.android.gms.ads.internal.util.zzay(zzazVar.zza, zzazVar.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbzr
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zza.zzd(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor));
    }
}
