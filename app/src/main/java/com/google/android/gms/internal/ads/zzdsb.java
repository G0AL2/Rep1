package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdsb implements Callable {
    private final com.google.android.gms.ads.internal.zza zza;
    private final zzclu zzb;
    private final Context zzc;
    private final zzdwh zzd;
    private final zzfgp zze;
    private final zzees zzf;
    private final Executor zzg;
    private final zzaoc zzh;
    private final zzcfo zzi;
    private final zzfii zzj;

    public zzdsb(Context context, Executor executor, zzaoc zzaocVar, zzcfo zzcfoVar, com.google.android.gms.ads.internal.zza zzaVar, zzclu zzcluVar, zzees zzeesVar, zzfii zzfiiVar, zzdwh zzdwhVar, zzfgp zzfgpVar) {
        this.zzc = context;
        this.zzg = executor;
        this.zzh = zzaocVar;
        this.zzi = zzcfoVar;
        this.zza = zzaVar;
        this.zzb = zzcluVar;
        this.zzf = zzeesVar;
        this.zzj = zzfiiVar;
        this.zzd = zzdwhVar;
        this.zze = zzfgpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Context zza(zzdsb zzdsbVar) {
        return zzdsbVar.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzaoc zzb(zzdsb zzdsbVar) {
        return zzdsbVar.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.zza zzc(zzdsb zzdsbVar) {
        return zzdsbVar.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzcfo zzd(zzdsb zzdsbVar) {
        return zzdsbVar.zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzclu zze(zzdsb zzdsbVar) {
        return zzdsbVar.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzdwh zzf(zzdsb zzdsbVar) {
        return zzdsbVar.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzees zzg(zzdsb zzdsbVar) {
        return zzdsbVar.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfgp zzh(zzdsb zzdsbVar) {
        return zzdsbVar.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ zzfii zzi(zzdsb zzdsbVar) {
        return zzdsbVar.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Executor zzj(zzdsb zzdsbVar) {
        return zzdsbVar.zzg;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdse zzdseVar = new zzdse(this);
        zzdseVar.zzh();
        return zzdseVar;
    }
}
