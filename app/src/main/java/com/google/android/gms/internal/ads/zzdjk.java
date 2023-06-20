package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdjk {
    private final List zza;
    private final zzfii zzb;
    private boolean zzc;

    public zzdjk(zzfbl zzfblVar, zzfii zzfiiVar) {
        this.zza = zzfblVar.zzq;
        this.zzb = zzfiiVar;
    }

    public final void zza() {
        if (this.zzc) {
            return;
        }
        this.zzb.zzd(this.zza);
        this.zzc = true;
    }
}
