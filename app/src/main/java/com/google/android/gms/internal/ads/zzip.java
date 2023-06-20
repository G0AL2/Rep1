package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzip implements zzjs {
    final /* synthetic */ zziw zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzip(zziw zziwVar) {
        this.zza = zziwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzjs
    public final void zza(long j10) {
        if (j10 >= Constants.MIN_PROGRESS_TIME) {
            this.zza.zzD = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjs
    public final void zzb() {
        zzdg zzdgVar;
        zzdgVar = this.zza.zzh;
        zzdgVar.zzh(2);
    }
}
