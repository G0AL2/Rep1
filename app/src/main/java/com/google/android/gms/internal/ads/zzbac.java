package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbac implements Runnable {
    final /* synthetic */ zzart zza;
    final /* synthetic */ zzbah zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbac(zzbah zzbahVar, zzart zzartVar) {
        this.zzb = zzbahVar;
        this.zza = zzartVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbai zzbaiVar;
        zzbaiVar = this.zzb.zzb;
        zzbaiVar.zzn(this.zza);
    }
}
