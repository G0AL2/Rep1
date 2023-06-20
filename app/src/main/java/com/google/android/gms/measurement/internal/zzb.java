package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzb implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzd zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(zzd zzdVar, String str, long j10) {
        this.zzc = zzdVar;
        this.zza = str;
        this.zzb = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd.zzb(this.zzc, this.zza, this.zzb);
    }
}
