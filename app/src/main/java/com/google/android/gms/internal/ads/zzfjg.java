package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfjg {
    @SuppressLint({"StaticFieldLeak"})
    private static final zzfjg zza = new zzfjg();
    private Context zzb;

    private zzfjg() {
    }

    public static zzfjg zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
