package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcjm extends com.google.android.gms.ads.internal.util.zzb {
    final zzchr zza;
    final zzcju zzb;
    private final String zzc;
    private final String[] zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjm(zzchr zzchrVar, zzcju zzcjuVar, String str, String[] strArr) {
        this.zza = zzchrVar;
        this.zzb = zzcjuVar;
        this.zzc = str;
        this.zzd = strArr;
        com.google.android.gms.ads.internal.zzt.zzy().zzb(this);
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        try {
            this.zzb.zzr(this.zzc, this.zzd);
        } finally {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcjl(this));
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final zzfvl zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbI)).booleanValue() && (this.zzb instanceof zzckd)) {
            return zzcfv.zze.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcjk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzcjm.this.zzd();
                }
            });
        }
        return super.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Boolean zzd() throws Exception {
        return Boolean.valueOf(this.zzb.zzs(this.zzc, this.zzd, this));
    }

    public final String zze() {
        return this.zzc;
    }
}
