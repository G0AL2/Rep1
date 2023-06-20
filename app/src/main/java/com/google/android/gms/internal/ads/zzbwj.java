package com.google.android.gms.internal.ads;

import android.app.Activity;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbwj implements Runnable {
    final /* synthetic */ AdOverlayInfoParcel zza;
    final /* synthetic */ zzbwk zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbwj(zzbwk zzbwkVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zzb = zzbwkVar;
        this.zza = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        com.google.android.gms.ads.internal.zzt.zzj();
        activity = this.zzb.zza;
        com.google.android.gms.ads.internal.overlay.zzm.zza(activity, this.zza, true);
    }
}
