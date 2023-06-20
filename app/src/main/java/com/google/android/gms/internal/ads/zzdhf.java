package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdhf {
    private final Set zza;
    private final Set zzb;
    private final Set zzc;
    private final Set zzd;
    private final Set zze;
    private final Set zzf;
    private final Set zzg;
    private final Set zzh;
    private final Set zzi;
    private final Set zzj;
    private final Set zzk;
    private final Set zzl;
    private final Set zzm;
    private final Set zzn;
    private final zzeyx zzo;
    private zzdbv zzp;
    private zzeiq zzq;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzdhf(zzdhd zzdhdVar, zzdhe zzdheVar) {
        this.zza = zzdhd.zzp(zzdhdVar);
        this.zzb = zzdhd.zzC(zzdhdVar);
        this.zzd = zzdhd.zzs(zzdhdVar);
        this.zze = zzdhd.zzx(zzdhdVar);
        this.zzc = zzdhd.zzt(zzdhdVar);
        this.zzf = zzdhd.zzu(zzdhdVar);
        this.zzg = zzdhd.zzv(zzdhdVar);
        this.zzh = zzdhd.zzq(zzdhdVar);
        this.zzi = zzdhd.zzr(zzdhdVar);
        this.zzj = zzdhd.zzw(zzdhdVar);
        this.zzk = zzdhd.zzB(zzdhdVar);
        this.zzl = zzdhd.zzz(zzdhdVar);
        this.zzo = zzdhd.zzo(zzdhdVar);
        this.zzm = zzdhd.zzy(zzdhdVar);
        this.zzn = zzdhd.zzA(zzdhdVar);
    }

    public final zzdbv zza(Set set) {
        if (this.zzp == null) {
            this.zzp = new zzdbv(set);
        }
        return this.zzp;
    }

    public final zzeiq zzb(Clock clock, zzeir zzeirVar, zzefi zzefiVar, zzfii zzfiiVar) {
        if (this.zzq == null) {
            this.zzq = new zzeiq(clock, zzeirVar, zzefiVar, zzfiiVar);
        }
        return this.zzq;
    }

    public final zzeyx zzc() {
        return this.zzo;
    }

    public final Set zzd() {
        return this.zzm;
    }

    public final Set zze() {
        return this.zza;
    }

    public final Set zzf() {
        return this.zzh;
    }

    public final Set zzg() {
        return this.zzi;
    }

    public final Set zzh() {
        return this.zzd;
    }

    public final Set zzi() {
        return this.zzc;
    }

    public final Set zzj() {
        return this.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzk() {
        return this.zzg;
    }

    public final Set zzl() {
        return this.zzj;
    }

    public final Set zzm() {
        return this.zze;
    }

    public final Set zzn() {
        return this.zzl;
    }

    public final Set zzo() {
        return this.zzn;
    }

    public final Set zzp() {
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzq() {
        return this.zzb;
    }
}
