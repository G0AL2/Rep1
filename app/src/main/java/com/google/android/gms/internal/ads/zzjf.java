package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzjf {
    private final zzcf zza = new zzcf();
    private final zzch zzb = new zzch();
    private final zzkh zzc;
    private final Handler zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjc zzh;
    private zzjc zzi;
    private zzjc zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzjf(zzkh zzkhVar, Handler handler) {
        this.zzc = zzkhVar;
        this.zzd = handler;
    }

    private final boolean zzA(zzci zzciVar, zzsa zzsaVar) {
        if (zzC(zzsaVar)) {
            return zzciVar.zze(zzciVar.zzn(zzsaVar.zza, this.zza).zzd, this.zzb, 0L).zzp == zzciVar.zza(zzsaVar.zza);
        }
        return false;
    }

    private final boolean zzB(zzci zzciVar) {
        zzjc zzjcVar = this.zzh;
        if (zzjcVar == null) {
            return true;
        }
        int zza = zzciVar.zza(zzjcVar.zzb);
        while (true) {
            zza = zzciVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzjcVar.zzg() != null && !zzjcVar.zzf.zzg) {
                zzjcVar = zzjcVar.zzg();
            }
            zzjc zzg = zzjcVar.zzg();
            if (zza == -1 || zzg == null || zzciVar.zza(zzg.zzb) != zza) {
                break;
            }
            zzjcVar = zzg;
        }
        boolean zzm = zzm(zzjcVar);
        zzjcVar.zzf = zzg(zzciVar, zzjcVar.zzf);
        return !zzm;
    }

    private static final boolean zzC(zzsa zzsaVar) {
        return !zzsaVar.zzb() && zzsaVar.zze == -1;
    }

    private final long zzs(zzci zzciVar, Object obj, int i10) {
        zzciVar.zzn(obj, this.zza);
        this.zza.zzh(i10);
        this.zza.zzj(i10);
        return 0L;
    }

    private final zzjd zzt(zzci zzciVar, zzjc zzjcVar, long j10) {
        long j11;
        zzjd zzjdVar = zzjcVar.zzf;
        long zze = (zzjcVar.zze() + zzjdVar.zze) - j10;
        if (zzjdVar.zzg) {
            long j12 = 0;
            int zzi = zzciVar.zzi(zzciVar.zza(zzjdVar.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi == -1) {
                return null;
            }
            int i10 = zzciVar.zzd(zzi, this.zza, true).zzd;
            Object obj = this.zza.zzc;
            Objects.requireNonNull(obj);
            long j13 = zzjdVar.zza.zzd;
            if (zzciVar.zze(i10, this.zzb, 0L).zzo == zzi) {
                Pair zzm = zzciVar.zzm(this.zzb, this.zza, i10, -9223372036854775807L, Math.max(0L, zze));
                if (zzm == null) {
                    return null;
                }
                obj = zzm.first;
                long longValue = ((Long) zzm.second).longValue();
                zzjc zzg = zzjcVar.zzg();
                if (zzg != null && zzg.zzb.equals(obj)) {
                    j13 = zzg.zzf.zza.zzd;
                } else {
                    j13 = this.zze;
                    this.zze = 1 + j13;
                }
                j11 = longValue;
                j12 = -9223372036854775807L;
            } else {
                j11 = 0;
            }
            zzsa zzx = zzx(zzciVar, obj, j11, j13, this.zzb, this.zza);
            if (j12 != -9223372036854775807L && zzjdVar.zzc != -9223372036854775807L) {
                zzciVar.zzn(zzjdVar.zza.zza, this.zza).zzb();
            }
            return zzu(zzciVar, zzx, j12, j11);
        }
        zzsa zzsaVar = zzjdVar.zza;
        zzciVar.zzn(zzsaVar.zza, this.zza);
        if (zzsaVar.zzb()) {
            int i11 = zzsaVar.zzb;
            if (this.zza.zza(i11) == -1) {
                return null;
            }
            int zzf = this.zza.zzf(i11, zzsaVar.zzc);
            if (zzf < 0) {
                return zzv(zzciVar, zzsaVar.zza, i11, zzf, zzjdVar.zzc, zzsaVar.zzd);
            }
            long j14 = zzjdVar.zzc;
            if (j14 == -9223372036854775807L) {
                zzch zzchVar = this.zzb;
                zzcf zzcfVar = this.zza;
                Pair zzm2 = zzciVar.zzm(zzchVar, zzcfVar, zzcfVar.zzd, -9223372036854775807L, Math.max(0L, zze));
                if (zzm2 == null) {
                    return null;
                }
                j14 = ((Long) zzm2.second).longValue();
            }
            zzs(zzciVar, zzsaVar.zza, zzsaVar.zzb);
            return zzw(zzciVar, zzsaVar.zza, Math.max(0L, j14), zzjdVar.zzc, zzsaVar.zzd);
        }
        int zze2 = this.zza.zze(zzsaVar.zze);
        this.zza.zzl(zzsaVar.zze);
        if (zze2 != this.zza.zza(zzsaVar.zze)) {
            return zzv(zzciVar, zzsaVar.zza, zzsaVar.zze, zze2, zzjdVar.zze, zzsaVar.zzd);
        }
        zzs(zzciVar, zzsaVar.zza, zzsaVar.zze);
        return zzw(zzciVar, zzsaVar.zza, 0L, zzjdVar.zze, zzsaVar.zzd);
    }

    private final zzjd zzu(zzci zzciVar, zzsa zzsaVar, long j10, long j11) {
        zzciVar.zzn(zzsaVar.zza, this.zza);
        if (zzsaVar.zzb()) {
            return zzv(zzciVar, zzsaVar.zza, zzsaVar.zzb, zzsaVar.zzc, j10, zzsaVar.zzd);
        }
        return zzw(zzciVar, zzsaVar.zza, j11, j10, zzsaVar.zzd);
    }

    private final zzjd zzv(zzci zzciVar, Object obj, int i10, int i11, long j10, long j11) {
        zzsa zzsaVar = new zzsa(obj, i10, i11, j11);
        long zzg = zzciVar.zzn(zzsaVar.zza, this.zza).zzg(zzsaVar.zzb, zzsaVar.zzc);
        if (i11 == this.zza.zze(i10)) {
            this.zza.zzi();
        }
        this.zza.zzl(zzsaVar.zzb);
        long j12 = 0;
        if (zzg != -9223372036854775807L && zzg <= 0) {
            j12 = Math.max(0L, (-1) + zzg);
        }
        return new zzjd(zzsaVar, j12, j10, -9223372036854775807L, zzg, false, false, false, false);
    }

    private final zzjd zzw(zzci zzciVar, Object obj, long j10, long j11, long j12) {
        long j13;
        long j14;
        long j15;
        long j16 = j10;
        zzciVar.zzn(obj, this.zza);
        int zzc = this.zza.zzc(j16);
        if (zzc == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzl(zzc);
        }
        zzsa zzsaVar = new zzsa(obj, j12, zzc);
        boolean zzC = zzC(zzsaVar);
        boolean zzA = zzA(zzciVar, zzsaVar);
        boolean zzz = zzz(zzciVar, zzsaVar, zzC);
        if (zzc != -1) {
            this.zza.zzl(zzc);
        }
        if (zzc != -1) {
            this.zza.zzh(zzc);
            j13 = 0;
        } else {
            j13 = -9223372036854775807L;
        }
        if (j13 != -9223372036854775807L) {
            j15 = j13;
            j14 = j15;
        } else {
            j14 = this.zza.zze;
            j15 = -9223372036854775807L;
        }
        if (j14 != -9223372036854775807L && j16 >= j14) {
            j16 = Math.max(0L, j14 - 1);
        }
        return new zzjd(zzsaVar, j16, j11, j15, j14, false, zzC, zzA, zzz);
    }

    private static zzsa zzx(zzci zzciVar, Object obj, long j10, long j11, zzch zzchVar, zzcf zzcfVar) {
        zzciVar.zzn(obj, zzcfVar);
        zzciVar.zze(zzcfVar.zzd, zzchVar, 0L);
        zzciVar.zza(obj);
        if (zzcfVar.zze == 0) {
            zzcfVar.zzb();
        }
        zzciVar.zzn(obj, zzcfVar);
        int zzd = zzcfVar.zzd(j10);
        if (zzd == -1) {
            return new zzsa(obj, j11, zzcfVar.zzc(j10));
        }
        return new zzsa(obj, zzd, zzcfVar.zze(zzd), j11);
    }

    private final void zzy() {
        final zzfrg zzi = zzfrj.zzi();
        for (zzjc zzjcVar = this.zzh; zzjcVar != null; zzjcVar = zzjcVar.zzg()) {
            zzi.zze(zzjcVar.zzf.zza);
        }
        zzjc zzjcVar2 = this.zzi;
        final zzsa zzsaVar = zzjcVar2 == null ? null : zzjcVar2.zzf.zza;
        this.zzd.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzje
            @Override // java.lang.Runnable
            public final void run() {
                zzjf.this.zzj(zzi, zzsaVar);
            }
        });
    }

    private final boolean zzz(zzci zzciVar, zzsa zzsaVar, boolean z10) {
        int zza = zzciVar.zza(zzsaVar.zza);
        return !zzciVar.zze(zzciVar.zzd(zza, this.zza, false).zzd, this.zzb, 0L).zzi && zzciVar.zzi(zza, this.zza, this.zzb, this.zzf, this.zzg) == -1 && z10;
    }

    public final zzjc zza() {
        zzjc zzjcVar = this.zzh;
        if (zzjcVar == null) {
            return null;
        }
        if (zzjcVar == this.zzi) {
            this.zzi = zzjcVar.zzg();
        }
        zzjcVar.zzn();
        int i10 = this.zzk - 1;
        this.zzk = i10;
        if (i10 == 0) {
            this.zzj = null;
            zzjc zzjcVar2 = this.zzh;
            this.zzl = zzjcVar2.zzb;
            this.zzm = zzjcVar2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzjc zzb() {
        zzjc zzjcVar = this.zzi;
        boolean z10 = false;
        if (zzjcVar != null && zzjcVar.zzg() != null) {
            z10 = true;
        }
        zzcw.zzf(z10);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    public final zzjc zzc() {
        return this.zzj;
    }

    public final zzjc zzd() {
        return this.zzh;
    }

    public final zzjc zze() {
        return this.zzi;
    }

    public final zzjd zzf(long j10, zzjn zzjnVar) {
        zzjc zzjcVar = this.zzj;
        return zzjcVar == null ? zzu(zzjnVar.zza, zzjnVar.zzb, zzjnVar.zzc, zzjnVar.zzs) : zzt(zzjnVar.zza, zzjcVar, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzjd zzg(com.google.android.gms.internal.ads.zzci r19, com.google.android.gms.internal.ads.zzjd r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzsa r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zzsa r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzcf r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L37
            int r1 = r3.zze
            if (r1 != r4) goto L30
            goto L37
        L30:
            com.google.android.gms.internal.ads.zzcf r9 = r0.zza
            r9.zzh(r1)
            r9 = r5
            goto L38
        L37:
            r9 = r7
        L38:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L4b
            com.google.android.gms.internal.ads.zzcf r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzg(r5, r6)
        L48:
            r7 = r9
            r9 = r5
            goto L57
        L4b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L52
            r7 = r5
            r9 = r7
            goto L57
        L52:
            com.google.android.gms.internal.ads.zzcf r1 = r0.zza
            long r5 = r1.zze
            goto L48
        L57:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L65
            com.google.android.gms.internal.ads.zzcf r1 = r0.zza
            int r4 = r3.zzb
            r1.zzl(r4)
            goto L6e
        L65:
            int r1 = r3.zze
            if (r1 == r4) goto L6e
            com.google.android.gms.internal.ads.zzcf r4 = r0.zza
            r4.zzl(r1)
        L6e:
            com.google.android.gms.internal.ads.zzjd r15 = new com.google.android.gms.internal.ads.zzjd
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjf.zzg(com.google.android.gms.internal.ads.zzci, com.google.android.gms.internal.ads.zzjd):com.google.android.gms.internal.ads.zzjd");
    }

    public final zzsa zzh(zzci zzciVar, Object obj, long j10) {
        long j11;
        int zza;
        int i10 = zzciVar.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza = zzciVar.zza(obj2)) == -1 || zzciVar.zzd(zza, this.zza, false).zzd != i10) {
            zzjc zzjcVar = this.zzh;
            while (true) {
                if (zzjcVar == null) {
                    zzjc zzjcVar2 = this.zzh;
                    while (true) {
                        if (zzjcVar2 != null) {
                            int zza2 = zzciVar.zza(zzjcVar2.zzb);
                            if (zza2 != -1 && zzciVar.zzd(zza2, this.zza, false).zzd == i10) {
                                j11 = zzjcVar2.zzf.zza.zzd;
                                break;
                            }
                            zzjcVar2 = zzjcVar2.zzg();
                        } else {
                            j11 = this.zze;
                            this.zze = 1 + j11;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j11;
                            }
                        }
                    }
                } else if (zzjcVar.zzb.equals(obj)) {
                    j11 = zzjcVar.zzf.zza.zzd;
                    break;
                } else {
                    zzjcVar = zzjcVar.zzg();
                }
            }
        } else {
            j11 = this.zzm;
        }
        long j12 = j11;
        zzciVar.zzn(obj, this.zza);
        zzciVar.zze(this.zza.zzd, this.zzb, 0L);
        int zza3 = zzciVar.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzch zzchVar = this.zzb;
            if (zza3 >= zzchVar.zzo) {
                zzciVar.zzd(zza3, this.zza, true);
                this.zza.zzb();
                zzcf zzcfVar = this.zza;
                if (zzcfVar.zzd(zzcfVar.zze) != -1) {
                    obj3 = this.zza.zzc;
                    Objects.requireNonNull(obj3);
                }
                zza3--;
            } else {
                return zzx(zzciVar, obj3, j10, j12, zzchVar, this.zza);
            }
        }
    }

    public final void zzi() {
        if (this.zzk == 0) {
            return;
        }
        zzjc zzjcVar = this.zzh;
        zzcw.zzb(zzjcVar);
        this.zzl = zzjcVar.zzb;
        this.zzm = zzjcVar.zzf.zza.zzd;
        while (zzjcVar != null) {
            zzjcVar.zzn();
            zzjcVar = zzjcVar.zzg();
        }
        this.zzh = null;
        this.zzj = null;
        this.zzi = null;
        this.zzk = 0;
        zzy();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzfrg zzfrgVar, zzsa zzsaVar) {
        this.zzc.zzT(zzfrgVar.zzg(), zzsaVar);
    }

    public final void zzk(long j10) {
        zzjc zzjcVar = this.zzj;
        if (zzjcVar != null) {
            zzjcVar.zzm(j10);
        }
    }

    public final boolean zzl(zzry zzryVar) {
        zzjc zzjcVar = this.zzj;
        return zzjcVar != null && zzjcVar.zza == zzryVar;
    }

    public final boolean zzm(zzjc zzjcVar) {
        boolean z10 = false;
        zzcw.zzf(zzjcVar != null);
        if (zzjcVar.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzjcVar;
        while (zzjcVar.zzg() != null) {
            zzjcVar = zzjcVar.zzg();
            if (zzjcVar == this.zzi) {
                this.zzi = this.zzh;
                z10 = true;
            }
            zzjcVar.zzn();
            this.zzk--;
        }
        this.zzj.zzo(null);
        zzy();
        return z10;
    }

    public final boolean zzn() {
        zzjc zzjcVar = this.zzj;
        if (zzjcVar != null) {
            return !zzjcVar.zzf.zzi && zzjcVar.zzr() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100;
        }
        return true;
    }

    public final boolean zzo(zzci zzciVar, long j10, long j11) {
        zzjd zzjdVar;
        boolean z10;
        zzjc zzjcVar = null;
        for (zzjc zzjcVar2 = this.zzh; zzjcVar2 != null; zzjcVar2 = zzjcVar2.zzg()) {
            zzjd zzjdVar2 = zzjcVar2.zzf;
            if (zzjcVar == null) {
                zzjdVar = zzg(zzciVar, zzjdVar2);
            } else {
                zzjd zzt = zzt(zzciVar, zzjcVar, j10);
                if (zzt == null) {
                    return !zzm(zzjcVar);
                } else if (zzjdVar2.zzb != zzt.zzb || !zzjdVar2.zza.equals(zzt.zza)) {
                    return !zzm(zzjcVar);
                } else {
                    zzjdVar = zzt;
                }
            }
            zzjcVar2.zzf = zzjdVar.zza(zzjdVar2.zzc);
            long j12 = zzjdVar2.zze;
            long j13 = zzjdVar.zze;
            if (j12 != -9223372036854775807L && j12 != j13) {
                zzjcVar2.zzq();
                long j14 = zzjdVar.zze;
                long zze = j14 == -9223372036854775807L ? Long.MAX_VALUE : j14 + zzjcVar2.zze();
                if (zzjcVar2 == this.zzi) {
                    boolean z11 = zzjcVar2.zzf.zzf;
                    if (j11 == Long.MIN_VALUE || j11 >= zze) {
                        z10 = true;
                        return zzm(zzjcVar2) && !z10;
                    }
                }
                z10 = false;
                if (zzm(zzjcVar2)) {
                }
            }
            zzjcVar = zzjcVar2;
        }
        return true;
    }

    public final boolean zzp(zzci zzciVar, int i10) {
        this.zzf = i10;
        return zzB(zzciVar);
    }

    public final boolean zzq(zzci zzciVar, boolean z10) {
        this.zzg = z10;
        return zzB(zzciVar);
    }

    public final zzjc zzr(zzju[] zzjuVarArr, zzvm zzvmVar, zzvv zzvvVar, zzjm zzjmVar, zzjd zzjdVar, zzvn zzvnVar) {
        zzjc zzjcVar = this.zzj;
        zzjc zzjcVar2 = new zzjc(zzjuVarArr, zzjcVar == null ? 1000000000000L : (zzjcVar.zze() + zzjcVar.zzf.zze) - zzjdVar.zzb, zzvmVar, zzvvVar, zzjmVar, zzjdVar, zzvnVar, null);
        zzjc zzjcVar3 = this.zzj;
        if (zzjcVar3 != null) {
            zzjcVar3.zzo(zzjcVar2);
        } else {
            this.zzh = zzjcVar2;
            this.zzi = zzjcVar2;
        }
        this.zzl = null;
        this.zzj = zzjcVar2;
        this.zzk++;
        zzy();
        return zzjcVar2;
    }
}
