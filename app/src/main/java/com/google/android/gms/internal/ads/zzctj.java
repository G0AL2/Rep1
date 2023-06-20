package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzctj implements zzdco {
    private final zzfcy zza;

    public zzctj(zzfcy zzfcyVar) {
        this.zza = zzfcyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbq(Context context) {
        try {
            this.zza.zzg();
        } catch (zzfci e10) {
            zzcfi.zzk("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbs(Context context) {
        try {
            this.zza.zzs();
        } catch (zzfci e10) {
            zzcfi.zzk("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbt(Context context) {
        try {
            this.zza.zzt();
            if (context != null) {
                this.zza.zzr(context);
            }
        } catch (zzfci e10) {
            zzcfi.zzk("Cannot invoke onResume for the mediation adapter.", e10);
        }
    }
}
