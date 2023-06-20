package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbad implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzbah zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbad(zzbah zzbahVar, int i10, long j10) {
        this.zzc = zzbahVar;
        this.zza = i10;
        this.zzb = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbai zzbaiVar;
        zzbaiVar = this.zzc.zzb;
        zzbaiVar.zzl(this.zza, this.zzb);
    }
}
