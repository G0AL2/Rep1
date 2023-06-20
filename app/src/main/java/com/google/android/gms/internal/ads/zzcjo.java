package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzcjo implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcju zze;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjo(zzcju zzcjuVar, String str, String str2, int i10, int i11, boolean z10) {
        this.zze = zzcjuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put(DownloadWorker.KEY_OUT_TOTAL_BYTES, Integer.toString(this.zzd));
        hashMap.put("cacheReady", "0");
        zzcju.zza(this.zze, "onPrecacheEvent", hashMap);
    }
}
