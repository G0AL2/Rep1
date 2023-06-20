package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcjs implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzcju zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcjs(zzcju zzcjuVar, String str, String str2, long j10) {
        this.zzd = zzcjuVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("totalDuration", Long.toString(this.zzc));
        zzcju.zza(this.zzd, "onPrecacheEvent", hashMap);
    }
}
