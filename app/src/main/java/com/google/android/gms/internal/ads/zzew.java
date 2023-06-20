package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzew implements zzep {
    private final Context zza;
    private final zzep zzb;

    public zzew(Context context) {
        zzey zzeyVar = new zzey();
        this.zza = context.getApplicationContext();
        this.zzb = zzeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzep
    public final /* bridge */ /* synthetic */ zzeq zza() {
        return new zzex(this.zza, ((zzey) this.zzb).zza());
    }
}
