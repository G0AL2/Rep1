package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzesz implements zzetg {
    private final boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesz(zzezg zzezgVar) {
        this.zza = zzezgVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return zzfvc.zzi(this.zza ? new zzetf() { // from class: com.google.android.gms.internal.ads.zzesy
            @Override // com.google.android.gms.internal.ads.zzetf
            public final void zzf(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}
