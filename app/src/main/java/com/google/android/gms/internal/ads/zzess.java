package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzess implements zzetf {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final Long zze;

    public zzess(String str, String str2, String str3, String str4, Long l10) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l10;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfco.zzc(bundle, "gmp_app_id", this.zza);
        zzfco.zzc(bundle, "fbs_aiid", this.zzb);
        zzfco.zzc(bundle, "fbs_aeid", this.zzc);
        zzfco.zzc(bundle, "apm_id_origin", this.zzd);
        Long l10 = this.zze;
        if (l10 != null) {
            bundle.putLong("sai_timeout", l10.longValue());
        }
    }
}
