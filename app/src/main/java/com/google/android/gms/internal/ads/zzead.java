package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzead implements zzgqu {
    private final zzgrh zza;

    public zzead(zzgrh zzgrhVar) {
        this.zza = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final String zzb() {
        String packageName = ((zzcnl) this.zza).zza().getPackageName();
        zzgrc.zzb(packageName);
        return packageName;
    }
}
