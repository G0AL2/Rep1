package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzejt extends zzcav {
    final /* synthetic */ zzddz zza;
    final /* synthetic */ zzdbr zzb;
    final /* synthetic */ zzdda zzc;
    final /* synthetic */ zzdjp zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzejt(zzeju zzejuVar, zzddz zzddzVar, zzdbr zzdbrVar, zzdda zzddaVar, zzdjp zzdjpVar) {
        this.zza = zzddzVar;
        this.zzb = zzdbrVar;
        this.zzc = zzddaVar;
        this.zzd = zzdjpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzg(IObjectWrapper iObjectWrapper, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzk(IObjectWrapper iObjectWrapper, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzm(IObjectWrapper iObjectWrapper, zzcax zzcaxVar) {
        this.zzd.zza(zzcaxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcaw
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
