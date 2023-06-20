package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfku;
import com.google.android.gms.internal.ads.zzflx;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzh implements zzflx {
    final /* synthetic */ zzi zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflx
    public final void zza(int i10, long j10) {
        zzfku zzfkuVar;
        zzfkuVar = this.zza.zzi;
        zzfkuVar.zzd(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.zzflx
    public final void zzb(int i10, long j10, String str) {
        zzfku zzfkuVar;
        zzfkuVar = this.zza.zzi;
        zzfkuVar.zze(i10, System.currentTimeMillis() - j10, str);
    }
}
