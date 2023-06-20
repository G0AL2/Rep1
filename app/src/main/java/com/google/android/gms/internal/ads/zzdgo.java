package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdgo implements zzdeo {
    private int zza = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzba)).intValue();

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final synchronized void zzb(zzfbx zzfbxVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbb)).booleanValue()) {
            try {
                this.zza = zzfbxVar.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzvVar) {
    }

    public final synchronized int zzc() {
        return this.zza;
    }
}
