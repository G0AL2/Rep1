package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
final class zzhr implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzin zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhr(zzin zzinVar, long j10) {
        this.zzb = zzinVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzs.zzm().zzf.zzb(this.zza);
        this.zzb.zzs.zzaz().zzc().zzb("Session timeout duration set", Long.valueOf(this.zza));
    }
}
