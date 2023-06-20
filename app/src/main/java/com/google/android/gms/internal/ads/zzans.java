package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzans implements zzflx {
    final /* synthetic */ zzfku zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzans(zzfku zzfkuVar) {
        this.zza = zzfkuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflx
    public final void zza(int i10, long j10) {
        this.zza.zzd(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzflx
    public final void zzb(int i10, long j10, String str) {
        this.zza.zze(i10, System.currentTimeMillis() - j10, str);
    }
}
