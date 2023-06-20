package com.google.android.gms.internal.ads;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdhd {
    private final Set zza = new HashSet();
    private final Set zzb = new HashSet();
    private final Set zzc = new HashSet();
    private final Set zzd = new HashSet();
    private final Set zze = new HashSet();
    private final Set zzf = new HashSet();
    private final Set zzg = new HashSet();
    private final Set zzh = new HashSet();
    private final Set zzi = new HashSet();
    private final Set zzj = new HashSet();
    private final Set zzk = new HashSet();
    private final Set zzl = new HashSet();
    private final Set zzm = new HashSet();
    private final Set zzn = new HashSet();
    private zzeyx zzo;

    public final zzdhd zza(com.google.android.gms.ads.internal.client.zza zzaVar, Executor executor) {
        this.zzc.add(new zzdiz(zzaVar, executor));
        return this;
    }

    public final zzdhd zzb(zzdbw zzdbwVar, Executor executor) {
        this.zzi.add(new zzdiz(zzdbwVar, executor));
        return this;
    }

    public final zzdhd zzc(zzdcj zzdcjVar, Executor executor) {
        this.zzl.add(new zzdiz(zzdcjVar, executor));
        return this;
    }

    public final zzdhd zzd(zzdcn zzdcnVar, Executor executor) {
        this.zzf.add(new zzdiz(zzdcnVar, executor));
        return this;
    }

    public final zzdhd zze(zzdbt zzdbtVar, Executor executor) {
        this.zze.add(new zzdiz(zzdbtVar, executor));
        return this;
    }

    public final zzdhd zzf(zzddh zzddhVar, Executor executor) {
        this.zzh.add(new zzdiz(zzddhVar, executor));
        return this;
    }

    public final zzdhd zzg(zzdds zzddsVar, Executor executor) {
        this.zzg.add(new zzdiz(zzddsVar, executor));
        return this;
    }

    public final zzdhd zzh(com.google.android.gms.ads.internal.overlay.zzo zzoVar, Executor executor) {
        this.zzn.add(new zzdiz(zzoVar, executor));
        return this;
    }

    public final zzdhd zzi(zzdee zzdeeVar, Executor executor) {
        this.zzm.add(new zzdiz(zzdeeVar, executor));
        return this;
    }

    public final zzdhd zzj(zzdeo zzdeoVar, Executor executor) {
        this.zzb.add(new zzdiz(zzdeoVar, executor));
        return this;
    }

    public final zzdhd zzk(zzarc zzarcVar, Executor executor) {
        this.zzk.add(new zzdiz(zzarcVar, executor));
        return this;
    }

    public final zzdhd zzl(zzdjg zzdjgVar, Executor executor) {
        this.zzd.add(new zzdiz(zzdjgVar, executor));
        return this;
    }

    public final zzdhd zzm(zzeyx zzeyxVar) {
        this.zzo = zzeyxVar;
        return this;
    }

    public final zzdhf zzn() {
        return new zzdhf(this, null);
    }
}
