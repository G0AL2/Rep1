package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfde implements zzgqu {
    private final zzfdd zza;

    public zzfde(zzfdd zzfddVar) {
        this.zza = zzfddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final /* synthetic */ Object zzb() {
        Clock defaultClock = DefaultClock.getInstance();
        zzgrc.zzb(defaultClock);
        return defaultClock;
    }
}
