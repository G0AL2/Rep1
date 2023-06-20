package com.google.android.gms.internal.ads;

import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcjp implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ long zzf;
    final /* synthetic */ long zzg;
    final /* synthetic */ boolean zzh;
    final /* synthetic */ int zzi;
    final /* synthetic */ int zzj;
    final /* synthetic */ zzcju zzk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjp(zzcju zzcjuVar, String str, String str2, long j10, long j11, long j12, long j13, long j14, boolean z10, int i10, int i11) {
        this.zzk = zzcjuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
        this.zzf = j13;
        this.zzg = j14;
        this.zzh = z10;
        this.zzi = i10;
        this.zzj = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bufferedDuration", Long.toString(this.zzc));
        hashMap.put("totalDuration", Long.toString(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.zze));
            hashMap.put("qoeCachedBytes", Long.toString(this.zzf));
            hashMap.put(DownloadWorker.KEY_OUT_TOTAL_BYTES, Long.toString(this.zzg));
            hashMap.put("reportTime", Long.toString(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
        }
        hashMap.put("cacheReady", true != this.zzh ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.zzi));
        hashMap.put("playerPreparedCount", Integer.toString(this.zzj));
        zzcju.zza(this.zzk, "onPrecacheEvent", hashMap);
    }
}
