package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdzx implements zzgqu {
    private final zzgrh zza;

    public zzdzx(zzgrh zzgrhVar) {
        this.zza = zzgrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    /* renamed from: zza */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.zza.zzb()).getApplicationInfo();
        zzgrc.zzb(applicationInfo);
        return applicationInfo;
    }
}
