package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.mediationsdk.config.VersionInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzesw implements zzetf {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;

    public zzesw(boolean z10, boolean z11, String str, boolean z12, int i10, int i11, int i12) {
        this.zza = z10;
        this.zzb = z11;
        this.zzc = str;
        this.zzd = z12;
        this.zze = i10;
        this.zzf = i11;
        this.zzg = i12;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcL));
        bundle.putInt("target_api", this.zze);
        bundle.putInt("dv", this.zzf);
        bundle.putInt("lv", this.zzg);
        Bundle zza = zzfco.zza(bundle, "sdk_env");
        zza.putBoolean("mf", ((Boolean) zzbjp.zza.zze()).booleanValue());
        zza.putBoolean("instant_app", this.zza);
        zza.putBoolean("lite", this.zzb);
        zza.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", zza);
        Bundle zza2 = zzfco.zza(zza, "build_meta");
        zza2.putString("cl", "458339781");
        zza2.putString("rapid_rc", "dev");
        zza2.putString("rapid_rollup", VersionInfo.GIT_BRANCH);
        zza.putBundle("build_meta", zza2);
    }
}
