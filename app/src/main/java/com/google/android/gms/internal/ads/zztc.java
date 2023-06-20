package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zztc implements zzry, zzyu, zzwb, zzwg, zzto {
    private static final Map zzb;
    private static final zzad zzc;
    private boolean zzA;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private long zzG;
    private boolean zzI;
    private int zzJ;
    private boolean zzK;
    private boolean zzL;
    private final zzvz zzM;
    private final zzvv zzN;
    private final Uri zzd;
    private final zzeq zze;
    private final zzpi zzf;
    private final zzsj zzg;
    private final zzpc zzh;
    private final zzsy zzi;
    private final long zzj;
    private final zzst zzl;
    private zzrx zzq;
    private zzabk zzr;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private zztb zzx;
    private zzzu zzy;
    private final zzwj zzk = new zzwj("ProgressiveMediaPeriod");
    private final zzcz zzm = new zzcz(zzcx.zza);
    private final Runnable zzn = new Runnable() { // from class: com.google.android.gms.internal.ads.zzsu
        @Override // java.lang.Runnable
        public final void run() {
            zztc.zzz(zztc.this);
        }
    };
    private final Runnable zzo = new Runnable() { // from class: com.google.android.gms.internal.ads.zzsv
        @Override // java.lang.Runnable
        public final void run() {
            zztc.this.zzC();
        }
    };
    private final Handler zzp = zzeg.zzC(null);
    private zzta[] zzt = new zzta[0];
    private zztp[] zzs = new zztp[0];
    private long zzH = -9223372036854775807L;
    private long zzF = -1;
    private long zzz = -9223372036854775807L;
    private int zzB = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        zzb = Collections.unmodifiableMap(hashMap);
        zzab zzabVar = new zzab();
        zzabVar.zzH("icy");
        zzabVar.zzS("application/x-icy");
        zzc = zzabVar.zzY();
    }

    public zztc(Uri uri, zzeq zzeqVar, zzst zzstVar, zzpi zzpiVar, zzpc zzpcVar, zzvz zzvzVar, zzsj zzsjVar, zzsy zzsyVar, zzvv zzvvVar, String str, int i10, byte[] bArr) {
        this.zzd = uri;
        this.zze = zzeqVar;
        this.zzf = zzpiVar;
        this.zzh = zzpcVar;
        this.zzM = zzvzVar;
        this.zzg = zzsjVar;
        this.zzi = zzsyVar;
        this.zzN = zzvvVar;
        this.zzj = i10;
        this.zzl = zzstVar;
    }

    private final int zzN() {
        int i10 = 0;
        for (zztp zztpVar : this.zzs) {
            i10 += zztpVar.zzc();
        }
        return i10;
    }

    public final long zzO() {
        long j10 = Long.MIN_VALUE;
        for (zztp zztpVar : this.zzs) {
            j10 = Math.max(j10, zztpVar.zzg());
        }
        return j10;
    }

    private final zzzy zzP(zzta zztaVar) {
        int length = this.zzs.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (zztaVar.equals(this.zzt[i10])) {
                return this.zzs[i10];
            }
        }
        zzvv zzvvVar = this.zzN;
        zzpi zzpiVar = this.zzf;
        zzpc zzpcVar = this.zzh;
        Objects.requireNonNull(zzpiVar);
        zztp zztpVar = new zztp(zzvvVar, zzpiVar, zzpcVar, null);
        zztpVar.zzu(this);
        int i11 = length + 1;
        zzta[] zztaVarArr = (zzta[]) Arrays.copyOf(this.zzt, i11);
        zztaVarArr[length] = zztaVar;
        this.zzt = (zzta[]) zzeg.zzab(zztaVarArr);
        zztp[] zztpVarArr = (zztp[]) Arrays.copyOf(this.zzs, i11);
        zztpVarArr[length] = zztpVar;
        this.zzs = (zztp[]) zzeg.zzab(zztpVarArr);
        return zztpVar;
    }

    private final void zzQ() {
        zzcw.zzf(this.zzv);
        Objects.requireNonNull(this.zzx);
        Objects.requireNonNull(this.zzy);
    }

    private final void zzR(zzsx zzsxVar) {
        long j10;
        if (this.zzF == -1) {
            j10 = zzsxVar.zzm;
            this.zzF = j10;
        }
    }

    public final void zzS() {
        zzbl zzc2;
        int i10;
        if (this.zzL || this.zzv || !this.zzu || this.zzy == null) {
            return;
        }
        for (zztp zztpVar : this.zzs) {
            if (zztpVar.zzh() == null) {
                return;
            }
        }
        this.zzm.zzc();
        int length = this.zzs.length;
        zzck[] zzckVarArr = new zzck[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            zzad zzh = this.zzs[i11].zzh();
            Objects.requireNonNull(zzh);
            String str = zzh.zzm;
            boolean zzg = zzbo.zzg(str);
            boolean z10 = zzg || zzbo.zzh(str);
            zArr[i11] = z10;
            this.zzw = z10 | this.zzw;
            zzabk zzabkVar = this.zzr;
            if (zzabkVar != null) {
                if (zzg || this.zzt[i11].zzb) {
                    zzbl zzblVar = zzh.zzk;
                    if (zzblVar == null) {
                        zzc2 = new zzbl(zzabkVar);
                    } else {
                        zzc2 = zzblVar.zzc(zzabkVar);
                    }
                    zzab zzb2 = zzh.zzb();
                    zzb2.zzM(zzc2);
                    zzh = zzb2.zzY();
                }
                if (zzg && zzh.zzg == -1 && zzh.zzh == -1 && (i10 = zzabkVar.zza) != -1) {
                    zzab zzb3 = zzh.zzb();
                    zzb3.zzv(i10);
                    zzh = zzb3.zzY();
                }
            }
            zzckVarArr[i11] = new zzck(Integer.toString(i11), zzh.zzc(this.zzf.zza(zzh)));
        }
        this.zzx = new zztb(new zzty(zzckVarArr), zArr);
        this.zzv = true;
        zzrx zzrxVar = this.zzq;
        Objects.requireNonNull(zzrxVar);
        zzrxVar.zzi(this);
    }

    private final void zzT(int i10) {
        zzQ();
        zztb zztbVar = this.zzx;
        boolean[] zArr = zztbVar.zzd;
        if (zArr[i10]) {
            return;
        }
        zzad zzb2 = zztbVar.zza.zzb(i10).zzb(0);
        this.zzg.zzd(zzbo.zzb(zzb2.zzm), zzb2, 0, null, this.zzG);
        zArr[i10] = true;
    }

    private final void zzU(int i10) {
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzI && zArr[i10] && !this.zzs[i10].zzx(false)) {
            this.zzH = 0L;
            this.zzI = false;
            this.zzD = true;
            this.zzG = 0L;
            this.zzJ = 0;
            for (zztp zztpVar : this.zzs) {
                zztpVar.zzp(false);
            }
            zzrx zzrxVar = this.zzq;
            Objects.requireNonNull(zzrxVar);
            zzrxVar.zzg(this);
        }
    }

    private final void zzV() {
        zzev zzevVar;
        long j10;
        long j11;
        zzsx zzsxVar = new zzsx(this, this.zzd, this.zze, this.zzl, this, this.zzm);
        if (this.zzv) {
            zzcw.zzf(zzW());
            long j12 = this.zzz;
            if (j12 != -9223372036854775807L && this.zzH > j12) {
                this.zzK = true;
                this.zzH = -9223372036854775807L;
                return;
            }
            zzzu zzzuVar = this.zzy;
            Objects.requireNonNull(zzzuVar);
            zzsx.zzg(zzsxVar, zzzuVar.zzg(this.zzH).zza.zzc, this.zzH);
            for (zztp zztpVar : this.zzs) {
                zztpVar.zzt(this.zzH);
            }
            this.zzH = -9223372036854775807L;
        }
        this.zzJ = zzN();
        long zza = this.zzk.zza(zzsxVar, this, zzvz.zza(this.zzB));
        zzevVar = zzsxVar.zzl;
        zzsj zzsjVar = this.zzg;
        j10 = zzsxVar.zzb;
        zzrr zzrrVar = new zzrr(j10, zzevVar, zzevVar.zza, Collections.emptyMap(), zza, 0L, 0L);
        j11 = zzsxVar.zzk;
        zzsjVar.zzl(zzrrVar, 1, -1, null, 0, null, j11, this.zzz);
    }

    private final boolean zzW() {
        return this.zzH != -9223372036854775807L;
    }

    private final boolean zzX() {
        return this.zzD || zzW();
    }

    public static /* synthetic */ void zzz(zztc zztcVar) {
        zztcVar.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzB() {
        this.zzu = true;
        this.zzp.post(this.zzn);
    }

    public final /* synthetic */ void zzC() {
        if (this.zzL) {
            return;
        }
        zzrx zzrxVar = this.zzq;
        Objects.requireNonNull(zzrxVar);
        zzrxVar.zzg(this);
    }

    public final /* synthetic */ void zzD(zzzu zzzuVar) {
        this.zzy = this.zzr == null ? zzzuVar : new zzzt(-9223372036854775807L, 0L);
        this.zzz = zzzuVar.zze();
        boolean z10 = false;
        if (this.zzF == -1 && zzzuVar.zze() == -9223372036854775807L) {
            z10 = true;
        }
        this.zzA = z10;
        this.zzB = true == z10 ? 7 : 1;
        this.zzi.zza(this.zzz, zzzuVar.zzh(), this.zzA);
        if (this.zzv) {
            return;
        }
        zzS();
    }

    final void zzE() throws IOException {
        this.zzk.zzi(zzvz.zza(this.zzB));
    }

    public final void zzF(int i10) throws IOException {
        this.zzs[i10].zzm();
        zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final /* bridge */ /* synthetic */ void zzG(zzwf zzwfVar, long j10, long j11, boolean z10) {
        zzfr zzfrVar;
        long j12;
        zzev zzevVar;
        long j13;
        long unused;
        zzsx zzsxVar = (zzsx) zzwfVar;
        zzfrVar = zzsxVar.zzd;
        j12 = zzsxVar.zzb;
        zzevVar = zzsxVar.zzl;
        zzrr zzrrVar = new zzrr(j12, zzevVar, zzfrVar.zzh(), zzfrVar.zzi(), j10, j11, zzfrVar.zzg());
        unused = zzsxVar.zzb;
        zzsj zzsjVar = this.zzg;
        j13 = zzsxVar.zzk;
        zzsjVar.zzf(zzrrVar, 1, -1, null, 0, null, j13, this.zzz);
        if (z10) {
            return;
        }
        zzR(zzsxVar);
        for (zztp zztpVar : this.zzs) {
            zztpVar.zzp(false);
        }
        if (this.zzE > 0) {
            zzrx zzrxVar = this.zzq;
            Objects.requireNonNull(zzrxVar);
            zzrxVar.zzg(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final /* bridge */ /* synthetic */ void zzH(zzwf zzwfVar, long j10, long j11) {
        zzfr zzfrVar;
        long j12;
        zzev zzevVar;
        long j13;
        zzzu zzzuVar;
        long unused;
        if (this.zzz == -9223372036854775807L && (zzzuVar = this.zzy) != null) {
            boolean zzh = zzzuVar.zzh();
            long zzO = zzO();
            long j14 = zzO == Long.MIN_VALUE ? 0L : zzO + 10000;
            this.zzz = j14;
            this.zzi.zza(j14, zzh, this.zzA);
        }
        zzsx zzsxVar = (zzsx) zzwfVar;
        zzfrVar = zzsxVar.zzd;
        j12 = zzsxVar.zzb;
        zzevVar = zzsxVar.zzl;
        zzrr zzrrVar = new zzrr(j12, zzevVar, zzfrVar.zzh(), zzfrVar.zzi(), j10, j11, zzfrVar.zzg());
        unused = zzsxVar.zzb;
        zzsj zzsjVar = this.zzg;
        j13 = zzsxVar.zzk;
        zzsjVar.zzh(zzrrVar, 1, -1, null, 0, null, j13, this.zzz);
        zzR(zzsxVar);
        this.zzK = true;
        zzrx zzrxVar = this.zzq;
        Objects.requireNonNull(zzrxVar);
        zzrxVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final void zzI() {
        for (zztp zztpVar : this.zzs) {
            zztpVar.zzo();
        }
        this.zzl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzto
    public final void zzJ(zzad zzadVar) {
        this.zzp.post(this.zzn);
    }

    public final void zzK() {
        if (this.zzv) {
            for (zztp zztpVar : this.zzs) {
                zztpVar.zzn();
            }
        }
        this.zzk.zzj(this);
        this.zzp.removeCallbacksAndMessages(null);
        this.zzq = null;
        this.zzL = true;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzL(final zzzu zzzuVar) {
        this.zzp.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzsw
            @Override // java.lang.Runnable
            public final void run() {
                zztc.this.zzD(zzzuVar);
            }
        });
    }

    public final boolean zzM(int i10) {
        return !zzX() && this.zzs[i10].zzx(this.zzK);
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zza(long j10, zzjw zzjwVar) {
        long j11;
        zzQ();
        if (this.zzy.zzh()) {
            zzzs zzg = this.zzy.zzg(j10);
            long j12 = zzg.zza.zzb;
            long j13 = zzg.zzb.zzb;
            long j14 = zzjwVar.zzf;
            if (j14 != 0) {
                j11 = j14;
            } else if (zzjwVar.zzg == 0) {
                return j10;
            } else {
                j11 = 0;
            }
            long zzx = zzeg.zzx(j10, j11, Long.MIN_VALUE);
            long zzq = zzeg.zzq(j10, zzjwVar.zzg, Long.MAX_VALUE);
            boolean z10 = true;
            boolean z11 = zzx <= j12 && j12 <= zzq;
            z10 = (zzx > j13 || j13 > zzq) ? false : false;
            if (z11 && z10) {
                if (Math.abs(j12 - j10) > Math.abs(j13 - j10)) {
                    return j13;
                }
            } else if (!z11) {
                return z10 ? j13 : zzx;
            }
            return j12;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzb() {
        long j10;
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (this.zzK) {
            return Long.MIN_VALUE;
        }
        if (zzW()) {
            return this.zzH;
        }
        if (this.zzw) {
            int length = this.zzs.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                if (zArr[i10] && !this.zzs[i10].zzw()) {
                    j10 = Math.min(j10, this.zzs[i10].zzg());
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = zzO();
        }
        return j10 == Long.MIN_VALUE ? this.zzG : j10;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final long zzc() {
        if (this.zzE == 0) {
            return Long.MIN_VALUE;
        }
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zzd() {
        if (this.zzD) {
            if (this.zzK || zzN() > this.zzJ) {
                this.zzD = false;
                return this.zzG;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final long zze(long j10) {
        int i10;
        zzQ();
        boolean[] zArr = this.zzx.zzb;
        if (true != this.zzy.zzh()) {
            j10 = 0;
        }
        this.zzD = false;
        this.zzG = j10;
        if (zzW()) {
            this.zzH = j10;
            return j10;
        }
        if (this.zzB != 7) {
            int length = this.zzs.length;
            while (i10 < length) {
                i10 = (this.zzs[i10].zzy(j10, false) || (!zArr[i10] && this.zzw)) ? i10 + 1 : 0;
            }
            return j10;
        }
        this.zzI = false;
        this.zzH = j10;
        this.zzK = false;
        zzwj zzwjVar = this.zzk;
        if (zzwjVar.zzl()) {
            for (zztp zztpVar : this.zzs) {
                zztpVar.zzj();
            }
            this.zzk.zzg();
        } else {
            zzwjVar.zzh();
            for (zztp zztpVar2 : this.zzs) {
                zztpVar2.zzp(false);
            }
        }
        return j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x003c, code lost:
        if (r2 == 0) goto L77;
     */
    @Override // com.google.android.gms.internal.ads.zzry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzf(com.google.android.gms.internal.ads.zzvg[] r8, boolean[] r9, com.google.android.gms.internal.ads.zztq[] r10, boolean[] r11, long r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztc.zzf(com.google.android.gms.internal.ads.zzvg[], boolean[], com.google.android.gms.internal.ads.zztq[], boolean[], long):long");
    }

    public final int zzg(int i10, zziz zzizVar, zzgb zzgbVar, int i11) {
        if (zzX()) {
            return -3;
        }
        zzT(i10);
        int zzd = this.zzs[i10].zzd(zzizVar, zzgbVar, i11, this.zzK);
        if (zzd == -3) {
            zzU(i10);
        }
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final zzty zzh() {
        zzQ();
        return this.zzx.zza;
    }

    public final int zzi(int i10, long j10) {
        if (zzX()) {
            return 0;
        }
        zzT(i10);
        zztp zztpVar = this.zzs[i10];
        int zzb2 = zztpVar.zzb(j10, this.zzK);
        zztpVar.zzv(zzb2);
        if (zzb2 == 0) {
            zzU(i10);
            return 0;
        }
        return zzb2;
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzj(long j10, boolean z10) {
        zzQ();
        if (zzW()) {
            return;
        }
        boolean[] zArr = this.zzx.zzc;
        int length = this.zzs.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.zzs[i10].zzi(j10, false, zArr[i10]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzk() throws IOException {
        zzE();
        if (this.zzK && !this.zzv) {
            throw zzbp.zza("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzry
    public final void zzl(zzrx zzrxVar, long j10) {
        this.zzq = zzrxVar;
        this.zzm.zze();
        zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final void zzm(long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzo(long j10) {
        if (this.zzK || this.zzk.zzk() || this.zzI) {
            return false;
        }
        if (this.zzv && this.zzE == 0) {
            return false;
        }
        boolean zze = this.zzm.zze();
        if (this.zzk.zzl()) {
            return zze;
        }
        zzV();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzry, com.google.android.gms.internal.ads.zzts
    public final boolean zzp() {
        return this.zzk.zzl() && this.zzm.zzd();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0103  */
    @Override // com.google.android.gms.internal.ads.zzwb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzwd zzt(com.google.android.gms.internal.ads.zzwf r27, long r28, long r30, java.io.IOException r32, int r33) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztc.zzt(com.google.android.gms.internal.ads.zzwf, long, long, java.io.IOException, int):com.google.android.gms.internal.ads.zzwd");
    }

    public final zzzy zzu() {
        return zzP(new zzta(0, true));
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final zzzy zzv(int i10, int i11) {
        return zzP(new zzta(i10, false));
    }
}
