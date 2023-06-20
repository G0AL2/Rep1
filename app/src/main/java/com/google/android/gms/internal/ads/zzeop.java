package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeop implements zzetf {
    private final com.google.android.gms.ads.internal.client.zzw zza;
    private final zzcfo zzb;
    private final boolean zzc;

    public zzeop(com.google.android.gms.ads.internal.client.zzw zzwVar, zzcfo zzcfoVar, boolean z10) {
        this.zza = zzwVar;
        this.zzb = zzcfoVar;
        this.zzc = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.zzb.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzek)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzel)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzc);
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = this.zza;
        if (zzwVar != null) {
            int i10 = zzwVar.zza;
            if (i10 == 1) {
                bundle.putString("avo", "p");
            } else if (i10 == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
