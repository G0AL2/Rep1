package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeck implements zzfuy {
    final /* synthetic */ zzbzr zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeck(zzeco zzecoVar, zzbzr zzbzrVar) {
        this.zza = zzbzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        try {
            this.zza.zze(com.google.android.gms.ads.internal.util.zzaz.zza(th));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e10);
        }
    }
}
