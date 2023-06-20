package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbae implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ float zzd;
    final /* synthetic */ zzbah zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbae(zzbah zzbahVar, int i10, int i11, int i12, float f10) {
        this.zze = zzbahVar;
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbai zzbaiVar;
        zzbaiVar = this.zze.zzb;
        zzbaiVar.zzo(this.zza, this.zzb, this.zzc, this.zzd);
    }
}
