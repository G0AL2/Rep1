package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzg {
    private long zzA;
    private long zzB;
    private String zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zzgi zza;
    private final String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private String zzj;
    private long zzk;
    private String zzl;
    private long zzm;
    private long zzn;
    private boolean zzo;
    private long zzp;
    private boolean zzq;
    private String zzr;
    private Boolean zzs;
    private long zzt;
    private List zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(zzgi zzgiVar, String str) {
        Preconditions.checkNotNull(zzgiVar);
        Preconditions.checkNotEmpty(str);
        this.zza = zzgiVar;
        this.zzb = str;
        zzgiVar.zzaA().zzg();
    }

    public final String zzA() {
        this.zza.zzaA().zzg();
        return this.zze;
    }

    public final String zzB() {
        this.zza.zzaA().zzg();
        return this.zzv;
    }

    public final List zzC() {
        this.zza.zzaA().zzg();
        return this.zzu;
    }

    public final void zzD() {
        this.zza.zzaA().zzg();
        this.zzD = false;
    }

    public final void zzE() {
        this.zza.zzaA().zzg();
        long j10 = this.zzg + 1;
        if (j10 > 2147483647L) {
            this.zza.zzaz().zzk().zzb("Bundle index overflow. appId", zzey.zzn(this.zzb));
            j10 = 0;
        }
        this.zzD = true;
        this.zzg = j10;
    }

    public final void zzF(String str) {
        this.zza.zzaA().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzD |= true ^ zzlp.zzal(this.zzr, str);
        this.zzr = str;
    }

    public final void zzG(boolean z10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzq != z10;
        this.zzq = z10;
    }

    public final void zzH(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzp != j10;
        this.zzp = j10;
    }

    public final void zzI(String str) {
        this.zza.zzaA().zzg();
        this.zzD |= !zzlp.zzal(this.zzc, str);
        this.zzc = str;
    }

    public final void zzJ(String str) {
        this.zza.zzaA().zzg();
        this.zzD |= !zzlp.zzal(this.zzl, str);
        this.zzl = str;
    }

    public final void zzK(String str) {
        this.zza.zzaA().zzg();
        this.zzD |= !zzlp.zzal(this.zzj, str);
        this.zzj = str;
    }

    public final void zzL(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzk != j10;
        this.zzk = j10;
    }

    public final void zzM(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzE != j10;
        this.zzE = j10;
    }

    public final void zzN(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzz != j10;
        this.zzz = j10;
    }

    public final void zzO(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzA != j10;
        this.zzA = j10;
    }

    public final void zzP(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzy != j10;
        this.zzy = j10;
    }

    public final void zzQ(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzx != j10;
        this.zzx = j10;
    }

    public final void zzR(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzB != j10;
        this.zzB = j10;
    }

    public final void zzS(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzw != j10;
        this.zzw = j10;
    }

    public final void zzT(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzn != j10;
        this.zzn = j10;
    }

    public final void zzU(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzt != j10;
        this.zzt = j10;
    }

    public final void zzV(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzF != j10;
        this.zzF = j10;
    }

    public final void zzW(String str) {
        this.zza.zzaA().zzg();
        this.zzD |= !zzlp.zzal(this.zzf, str);
        this.zzf = str;
    }

    public final void zzX(String str) {
        this.zza.zzaA().zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzD |= true ^ zzlp.zzal(this.zzd, str);
        this.zzd = str;
    }

    public final void zzY(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzm != j10;
        this.zzm = j10;
    }

    public final void zzZ(String str) {
        this.zza.zzaA().zzg();
        this.zzD |= !zzlp.zzal(this.zzC, str);
        this.zzC = str;
    }

    public final long zza() {
        this.zza.zzaA().zzg();
        return this.zzp;
    }

    public final void zzaa(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzi != j10;
        this.zzi = j10;
    }

    public final void zzab(long j10) {
        Preconditions.checkArgument(j10 >= 0);
        this.zza.zzaA().zzg();
        this.zzD = (this.zzg != j10) | this.zzD;
        this.zzg = j10;
    }

    public final void zzac(long j10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzh != j10;
        this.zzh = j10;
    }

    public final void zzad(boolean z10) {
        this.zza.zzaA().zzg();
        this.zzD |= this.zzo != z10;
        this.zzo = z10;
    }

    public final void zzae(Boolean bool) {
        boolean equals;
        this.zza.zzaA().zzg();
        boolean z10 = this.zzD;
        Boolean bool2 = this.zzs;
        int i10 = zzlp.zza;
        if (bool2 == null && bool == null) {
            equals = true;
        } else {
            equals = bool2 == null ? false : bool2.equals(bool);
        }
        this.zzD = z10 | (!equals);
        this.zzs = bool;
    }

    public final void zzaf(String str) {
        this.zza.zzaA().zzg();
        this.zzD |= !zzlp.zzal(this.zze, str);
        this.zze = str;
    }

    public final void zzag(List list) {
        this.zza.zzaA().zzg();
        List list2 = this.zzu;
        int i10 = zzlp.zza;
        if (list2 == null && list == null) {
            return;
        }
        if (list2 != null && list2.equals(list)) {
            return;
        }
        this.zzD = true;
        this.zzu = list != null ? new ArrayList(list) : null;
    }

    public final void zzah(String str) {
        this.zza.zzaA().zzg();
        this.zzD |= !zzlp.zzal(this.zzv, str);
        this.zzv = str;
    }

    public final boolean zzai() {
        this.zza.zzaA().zzg();
        return this.zzq;
    }

    public final boolean zzaj() {
        this.zza.zzaA().zzg();
        return this.zzo;
    }

    public final boolean zzak() {
        this.zza.zzaA().zzg();
        return this.zzD;
    }

    public final long zzb() {
        this.zza.zzaA().zzg();
        return this.zzk;
    }

    public final long zzc() {
        this.zza.zzaA().zzg();
        return this.zzE;
    }

    public final long zzd() {
        this.zza.zzaA().zzg();
        return this.zzz;
    }

    public final long zze() {
        this.zza.zzaA().zzg();
        return this.zzA;
    }

    public final long zzf() {
        this.zza.zzaA().zzg();
        return this.zzy;
    }

    public final long zzg() {
        this.zza.zzaA().zzg();
        return this.zzx;
    }

    public final long zzh() {
        this.zza.zzaA().zzg();
        return this.zzB;
    }

    public final long zzi() {
        this.zza.zzaA().zzg();
        return this.zzw;
    }

    public final long zzj() {
        this.zza.zzaA().zzg();
        return this.zzn;
    }

    public final long zzk() {
        this.zza.zzaA().zzg();
        return this.zzt;
    }

    public final long zzl() {
        this.zza.zzaA().zzg();
        return this.zzF;
    }

    public final long zzm() {
        this.zza.zzaA().zzg();
        return this.zzm;
    }

    public final long zzn() {
        this.zza.zzaA().zzg();
        return this.zzi;
    }

    public final long zzo() {
        this.zza.zzaA().zzg();
        return this.zzg;
    }

    public final long zzp() {
        this.zza.zzaA().zzg();
        return this.zzh;
    }

    public final Boolean zzq() {
        this.zza.zzaA().zzg();
        return this.zzs;
    }

    public final String zzr() {
        this.zza.zzaA().zzg();
        return this.zzr;
    }

    public final String zzs() {
        this.zza.zzaA().zzg();
        String str = this.zzC;
        zzZ(null);
        return str;
    }

    public final String zzt() {
        this.zza.zzaA().zzg();
        return this.zzb;
    }

    public final String zzu() {
        this.zza.zzaA().zzg();
        return this.zzc;
    }

    public final String zzv() {
        this.zza.zzaA().zzg();
        return this.zzl;
    }

    public final String zzw() {
        this.zza.zzaA().zzg();
        return this.zzj;
    }

    public final String zzx() {
        this.zza.zzaA().zzg();
        return this.zzf;
    }

    public final String zzy() {
        this.zza.zzaA().zzg();
        return this.zzd;
    }

    public final String zzz() {
        this.zza.zzaA().zzg();
        return this.zzC;
    }
}
