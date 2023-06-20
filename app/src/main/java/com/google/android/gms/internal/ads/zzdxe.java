package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdxe implements zzdeo, com.google.android.gms.ads.internal.client.zza, zzdbt, zzdcn, zzdco, zzddh, zzdbw, zzarc, zzfgg {
    private final List zza;
    private final zzdws zzb;
    private long zzc;

    public zzdxe(zzdws zzdwsVar, zzcnf zzcnfVar) {
        this.zzb = zzdwsVar;
        this.zza = Collections.singletonList(zzcnfVar);
    }

    private final void zze(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zze(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbw
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zze(zzdbw.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzvVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        zze(zzdeo.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzbF(zzffz zzffzVar, String str) {
        zze(zzffy.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzbG(zzffz zzffzVar, String str, Throwable th) {
        zze(zzffy.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbq(Context context) {
        zze(zzdco.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbs(Context context) {
        zze(zzdco.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbt(Context context) {
        zze(zzdco.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzarc
    public final void zzbu(String str, String str2) {
        zze(zzarc.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
        zze(zzdbt.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzc(zzffz zzffzVar, String str) {
        zze(zzffy.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzd(zzffz zzffzVar, String str) {
        zze(zzffy.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
        zze(zzdbt.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        zze(zzdcn.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
        zze(zzdbt.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        long j10 = this.zzc;
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (elapsedRealtime - j10));
        zze(zzddh.class, "onAdLoaded", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
        zze(zzdbt.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(zzcal zzcalVar, String str, String str2) {
        zze(zzdbt.class, "onRewarded", zzcalVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
        zze(zzdbt.class, "onRewardedVideoStarted", new Object[0]);
    }
}
