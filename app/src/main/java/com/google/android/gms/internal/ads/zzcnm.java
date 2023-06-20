package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcnm implements zzgqu {
    private final zzcni zza;

    public zzcnm(zzcni zzcniVar) {
        this.zza = zzcniVar;
    }

    public final WeakReference zza() {
        WeakReference zzf = this.zza.zzf();
        zzgrc.zzb(zzf);
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* synthetic */ Object zzb() {
        WeakReference zzf = this.zza.zzf();
        zzgrc.zzb(zzf);
        return zzf;
    }
}
