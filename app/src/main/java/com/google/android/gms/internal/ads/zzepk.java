package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzepk implements zzetf {
    public final double zza;
    public final boolean zzb;

    public zzepk(double d10, boolean z10) {
        this.zza = d10;
        this.zzb = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzfco.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzfco.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble("battery_level", this.zza);
    }
}
