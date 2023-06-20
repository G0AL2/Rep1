package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdbd {
    private Context zza;
    private zzfcd zzb;
    private Bundle zzc;
    private zzfby zzd;

    public final zzdbd zzc(Context context) {
        this.zza = context;
        return this;
    }

    public final zzdbd zzd(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzdbd zze(zzfby zzfbyVar) {
        this.zzd = zzfbyVar;
        return this;
    }

    public final zzdbd zzf(zzfcd zzfcdVar) {
        this.zzb = zzfcdVar;
        return this;
    }

    public final zzdbf zzg() {
        return new zzdbf(this, null);
    }
}
