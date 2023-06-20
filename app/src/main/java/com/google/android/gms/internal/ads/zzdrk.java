package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzdrk implements zzbko {
    final /* synthetic */ zzdrl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdrk(zzdrl zzdrlVar) {
        this.zza = zzdrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zzc() {
        zzdnc zzdncVar;
        zzdnc zzdncVar2;
        zzdrl zzdrlVar = this.zza;
        zzdncVar = zzdrlVar.zzd;
        if (zzdncVar != null) {
            zzdncVar2 = zzdrlVar.zzd;
            zzdncVar2.zzy("_videoMediaView");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbko
    public final void zzd(MotionEvent motionEvent) {
    }
}
