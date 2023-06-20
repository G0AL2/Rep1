package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdtu implements zzdco {
    private final zzcli zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtu(zzcli zzcliVar) {
        this.zza = zzcliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbq(Context context) {
        zzcli zzcliVar = this.zza;
        if (zzcliVar != null) {
            zzcliVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbs(Context context) {
        zzcli zzcliVar = this.zza;
        if (zzcliVar != null) {
            zzcliVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbt(Context context) {
        zzcli zzcliVar = this.zza;
        if (zzcliVar != null) {
            zzcliVar.onResume();
        }
    }
}
