package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeva implements zzetg {
    final zzfvm zza;
    final String zzb;
    final zzcef zzc;

    public zzeva(zzcef zzcefVar, zzfvm zzfvmVar, String str, byte[] bArr) {
        this.zzc = zzcefVar;
        this.zza = zzfvmVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        final zzfvl zzi = zzfvc.zzi(null);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeN)).booleanValue()) {
            zzi = zzfvc.zzi(null);
        }
        final zzfvl zzi2 = zzfvc.zzi(null);
        return zzfvc.zzd(zzi, zzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzevb((String) zzfvl.this.get(), (String) zzi2.get());
            }
        }, zzcfv.zza);
    }
}
