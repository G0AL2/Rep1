package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcxa implements zzgqu {
    private final zzgrh zza;

    public zzcxa(zzgrh zzgrhVar) {
        this.zza = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final Boolean zzb() {
        boolean z10 = true;
        if (((zzdbk) this.zza).zza().zza() == null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzez)).booleanValue()) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
