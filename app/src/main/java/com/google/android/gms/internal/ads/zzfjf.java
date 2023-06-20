package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfjf {
    private final zzfkm zza;
    private final String zzb;
    private final zzfit zzc;
    private final String zzd = "Ad overlay";

    public zzfjf(View view, zzfit zzfitVar, String str) {
        this.zza = new zzfkm(view);
        this.zzb = view.getClass().getCanonicalName();
        this.zzc = zzfitVar;
    }

    public final zzfit zza() {
        return this.zzc;
    }

    public final zzfkm zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzd;
    }

    public final String zzd() {
        return this.zzb;
    }
}
