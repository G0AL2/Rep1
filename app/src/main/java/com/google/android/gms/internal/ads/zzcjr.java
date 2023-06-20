package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcjr implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ zzcju zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjr(zzcju zzcjuVar, String str, String str2, int i10) {
        this.zzd = zzcjuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put(DownloadWorker.KEY_OUT_TOTAL_BYTES, Integer.toString(this.zzc));
        zzcju.zza(this.zzd, "onPrecacheEvent", hashMap);
    }
}
