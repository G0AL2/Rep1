package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeoj {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    public final void zza(boolean z10) {
        this.zza.set(true);
    }

    public final boolean zzb() {
        return this.zza.get();
    }
}
