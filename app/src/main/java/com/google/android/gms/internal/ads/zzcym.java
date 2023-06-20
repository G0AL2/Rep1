package com.google.android.gms.internal.ads;

import com.google.android.ads.mediationtestsuite.dataobjects.AdUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcym {
    private final zzfbx zza;
    private final zzfbl zzb;
    private final String zzc;

    public zzcym(zzfbx zzfbxVar, zzfbl zzfblVar, String str) {
        this.zza = zzfbxVar;
        this.zzb = zzfblVar;
        this.zzc = str == null ? AdUnit.GOOGLE_ADAPTER_CLASS : str;
    }

    public final zzfbl zza() {
        return this.zzb;
    }

    public final zzfbo zzb() {
        return this.zza.zzb.zzb;
    }

    public final zzfbx zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzc;
    }
}
