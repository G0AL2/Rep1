package com.google.android.gms.internal.ads;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zztp implements zzzy {
    private boolean zzA;
    private boolean zzB;
    private zzpj zzC;
    private final zztj zza;
    private final zzpi zzd;
    private final zzpc zze;
    private zzto zzf;
    private zzad zzg;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private boolean zzv;
    private zzad zzy;
    private zzad zzz;
    private final zztl zzb = new zztl();
    private int zzh = 1000;
    private int[] zzi = new int[1000];
    private long[] zzj = new long[1000];
    private long[] zzm = new long[1000];
    private int[] zzl = new int[1000];
    private int[] zzk = new int[1000];
    private zzzx[] zzn = new zzzx[1000];
    private final zztw zzc = new zztw(new zzda() { // from class: com.google.android.gms.internal.ads.zztk
    });
    private long zzs = Long.MIN_VALUE;
    private long zzt = Long.MIN_VALUE;
    private long zzu = Long.MIN_VALUE;
    private boolean zzx = true;
    private boolean zzw = true;

    /* JADX INFO: Access modifiers changed from: protected */
    public zztp(zzvv zzvvVar, zzpi zzpiVar, zzpc zzpcVar, byte[] bArr) {
        this.zzd = zzpiVar;
        this.zze = zzpcVar;
        this.zza = new zztj(zzvvVar, null);
    }

    private final int zzA(int i10) {
        int i11 = this.zzq + i10;
        int i12 = this.zzh;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private final synchronized int zzB(zziz zzizVar, zzgb zzgbVar, boolean z10, boolean z11, zztl zztlVar) {
        zzgbVar.zzc = false;
        if (!zzJ()) {
            if (!z11 && !this.zzv) {
                zzad zzadVar = this.zzz;
                if (zzadVar == null || (!z10 && zzadVar == this.zzg)) {
                    return -3;
                }
                zzG(zzadVar, zzizVar);
                return -5;
            }
            zzgbVar.zzc(4);
            return -4;
        }
        zzad zzadVar2 = ((zztn) this.zzc.zza(this.zzp + this.zzr)).zza;
        if (!z10 && zzadVar2 == this.zzg) {
            int zzA = zzA(this.zzr);
            if (!zzK(zzA)) {
                zzgbVar.zzc = true;
                return -3;
            }
            zzgbVar.zzc(this.zzl[zzA]);
            long j10 = this.zzm[zzA];
            zzgbVar.zzd = j10;
            if (j10 < this.zzs) {
                zzgbVar.zza(RecyclerView.UNDEFINED_DURATION);
            }
            zztlVar.zza = this.zzk[zzA];
            zztlVar.zzb = this.zzj[zzA];
            zztlVar.zzc = this.zzn[zzA];
            return -4;
        }
        zzG(zzadVar2, zzizVar);
        return -5;
    }

    private final synchronized long zzC(long j10, boolean z10, boolean z11) {
        int i10;
        int i11 = this.zzo;
        if (i11 != 0) {
            long[] jArr = this.zzm;
            int i12 = this.zzq;
            if (j10 >= jArr[i12]) {
                if (z11 && (i10 = this.zzr) != i11) {
                    i11 = i10 + 1;
                }
                int zzz = zzz(i12, i11, j10, false);
                if (zzz == -1) {
                    return -1L;
                }
                return zzE(zzz);
            }
        }
        return -1L;
    }

    private final synchronized long zzD() {
        int i10 = this.zzo;
        if (i10 == 0) {
            return -1L;
        }
        return zzE(i10);
    }

    private final long zzE(int i10) {
        int i11;
        long j10 = this.zzt;
        long j11 = Long.MIN_VALUE;
        if (i10 != 0) {
            int zzA = zzA(i10 - 1);
            for (int i12 = 0; i12 < i10; i12++) {
                j11 = Math.max(j11, this.zzm[zzA]);
                if ((this.zzl[zzA] & 1) != 0) {
                    break;
                }
                zzA--;
                if (zzA == -1) {
                    zzA = this.zzh - 1;
                }
            }
        }
        this.zzt = Math.max(j10, j11);
        this.zzo -= i10;
        int i13 = this.zzp + i10;
        this.zzp = i13;
        int i14 = this.zzq + i10;
        this.zzq = i14;
        int i15 = this.zzh;
        if (i14 >= i15) {
            this.zzq = i14 - i15;
        }
        int i16 = this.zzr - i10;
        this.zzr = i16;
        if (i16 < 0) {
            this.zzr = 0;
        }
        this.zzc.zze(i13);
        if (this.zzo == 0) {
            int i17 = this.zzq;
            if (i17 == 0) {
                i17 = this.zzh;
            }
            return this.zzj[i17 - 1] + this.zzk[i11];
        }
        return this.zzj[this.zzq];
    }

    private final synchronized void zzF(long j10, int i10, long j11, int i11, zzzx zzzxVar) {
        int i12 = this.zzo;
        if (i12 > 0) {
            int zzA = zzA(i12 - 1);
            zzcw.zzd(this.zzj[zzA] + ((long) this.zzk[zzA]) <= j11);
        }
        this.zzv = (536870912 & i10) != 0;
        this.zzu = Math.max(this.zzu, j10);
        int zzA2 = zzA(this.zzo);
        this.zzm[zzA2] = j10;
        this.zzj[zzA2] = j11;
        this.zzk[zzA2] = i11;
        this.zzl[zzA2] = i10;
        this.zzn[zzA2] = zzzxVar;
        this.zzi[zzA2] = 0;
        if (this.zzc.zzf() || !((zztn) this.zzc.zzb()).zza.equals(this.zzz)) {
            zzph zzphVar = zzph.zzb;
            zztw zztwVar = this.zzc;
            int i13 = this.zzp + this.zzo;
            zzad zzadVar = this.zzz;
            Objects.requireNonNull(zzadVar);
            zztwVar.zzc(i13, new zztn(zzadVar, zzphVar, null));
        }
        int i14 = this.zzo + 1;
        this.zzo = i14;
        int i15 = this.zzh;
        if (i14 == i15) {
            int i16 = i15 + 1000;
            int[] iArr = new int[i16];
            long[] jArr = new long[i16];
            long[] jArr2 = new long[i16];
            int[] iArr2 = new int[i16];
            int[] iArr3 = new int[i16];
            zzzx[] zzzxVarArr = new zzzx[i16];
            int i17 = this.zzq;
            int i18 = i15 - i17;
            System.arraycopy(this.zzj, i17, jArr, 0, i18);
            System.arraycopy(this.zzm, this.zzq, jArr2, 0, i18);
            System.arraycopy(this.zzl, this.zzq, iArr2, 0, i18);
            System.arraycopy(this.zzk, this.zzq, iArr3, 0, i18);
            System.arraycopy(this.zzn, this.zzq, zzzxVarArr, 0, i18);
            System.arraycopy(this.zzi, this.zzq, iArr, 0, i18);
            int i19 = this.zzq;
            System.arraycopy(this.zzj, 0, jArr, i18, i19);
            System.arraycopy(this.zzm, 0, jArr2, i18, i19);
            System.arraycopy(this.zzl, 0, iArr2, i18, i19);
            System.arraycopy(this.zzk, 0, iArr3, i18, i19);
            System.arraycopy(this.zzn, 0, zzzxVarArr, i18, i19);
            System.arraycopy(this.zzi, 0, iArr, i18, i19);
            this.zzj = jArr;
            this.zzm = jArr2;
            this.zzl = iArr2;
            this.zzk = iArr3;
            this.zzn = zzzxVarArr;
            this.zzi = iArr;
            this.zzq = 0;
            this.zzh = i16;
        }
    }

    private final void zzG(zzad zzadVar, zziz zzizVar) {
        zzad zzadVar2 = this.zzg;
        zzv zzvVar = zzadVar2 == null ? null : zzadVar2.zzp;
        this.zzg = zzadVar;
        zzv zzvVar2 = zzadVar.zzp;
        zzizVar.zza = zzadVar.zzc(this.zzd.zza(zzadVar));
        zzizVar.zzb = this.zzC;
        if (zzadVar2 == null || !zzeg.zzS(zzvVar, zzvVar2)) {
            zzpj zzpjVar = zzadVar.zzp != null ? new zzpj(new zzpa(new zzpl(1), AdError.MEDIAVIEW_MISSING_ERROR_CODE)) : null;
            this.zzC = zzpjVar;
            zzizVar.zzb = zzpjVar;
        }
    }

    private final void zzH() {
        if (this.zzC != null) {
            this.zzC = null;
            this.zzg = null;
        }
    }

    private final synchronized void zzI() {
        this.zzr = 0;
        this.zza.zzg();
    }

    private final boolean zzJ() {
        return this.zzr != this.zzo;
    }

    private final boolean zzK(int i10) {
        if (this.zzC != null) {
            return (this.zzl[i10] & 1073741824) != 0 ? false : false;
        }
        return true;
    }

    private final synchronized boolean zzL(zzad zzadVar) {
        this.zzx = false;
        if (zzeg.zzS(zzadVar, this.zzz)) {
            return false;
        }
        if (!this.zzc.zzf() && ((zztn) this.zzc.zzb()).zza.equals(zzadVar)) {
            this.zzz = ((zztn) this.zzc.zzb()).zza;
        } else {
            this.zzz = zzadVar;
        }
        zzad zzadVar2 = this.zzz;
        this.zzA = zzbo.zzf(zzadVar2.zzm, zzadVar2.zzj);
        this.zzB = false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzl(zztn zztnVar) {
        zzph zzphVar = zztnVar.zzb;
        int i10 = zzpg.zza;
    }

    private final int zzz(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = (this.zzm[i10] > j10 ? 1 : (this.zzm[i10] == j10 ? 0 : -1));
            if (i14 > 0) {
                break;
            }
            if (!z10 || (this.zzl[i10] & 1) != 0) {
                i12 = i13;
                if (i14 == 0) {
                    break;
                }
            }
            i10++;
            if (i10 == this.zzh) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final int zza() {
        return this.zzp + this.zzr;
    }

    public final synchronized int zzb(long j10, boolean z10) {
        int i10 = this.zzr;
        int zzA = zzA(i10);
        if (zzJ() && j10 >= this.zzm[zzA]) {
            if (j10 > this.zzu && z10) {
                return this.zzo - i10;
            }
            int zzz = zzz(zzA, this.zzo - i10, j10, true);
            if (zzz == -1) {
                return 0;
            }
            return zzz;
        }
        return 0;
    }

    public final int zzc() {
        return this.zzp + this.zzo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
        if (r9 != 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zziz r9, com.google.android.gms.internal.ads.zzgb r10, int r11, boolean r12) {
        /*
            r8 = this;
            r0 = r11 & 2
            r1 = 1
            if (r0 == 0) goto L7
            r5 = 1
            goto L9
        L7:
            r0 = 0
            r5 = 0
        L9:
            com.google.android.gms.internal.ads.zztl r7 = r8.zzb
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            int r9 = r2.zzB(r3, r4, r5, r6, r7)
            r12 = -4
            if (r9 != r12) goto L3e
            boolean r9 = r10.zzg()
            if (r9 != 0) goto L3d
            r9 = r11 & 1
            r11 = r11 & 4
            if (r11 != 0) goto L34
            if (r9 == 0) goto L2c
            com.google.android.gms.internal.ads.zztj r9 = r8.zza
            com.google.android.gms.internal.ads.zztl r11 = r8.zzb
            r9.zzd(r10, r11)
            goto L3d
        L2c:
            com.google.android.gms.internal.ads.zztj r9 = r8.zza
            com.google.android.gms.internal.ads.zztl r11 = r8.zzb
            r9.zze(r10, r11)
            goto L37
        L34:
            if (r9 == 0) goto L37
            goto L3d
        L37:
            int r9 = r8.zzr
            int r9 = r9 + r1
            r8.zzr = r9
            return r12
        L3d:
            r9 = -4
        L3e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zztp.zzd(com.google.android.gms.internal.ads.zziz, com.google.android.gms.internal.ads.zzgb, int, boolean):int");
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final /* synthetic */ int zze(zzp zzpVar, int i10, boolean z10) {
        return zzzw.zza(this, zzpVar, i10, true);
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final int zzf(zzp zzpVar, int i10, boolean z10, int i11) throws IOException {
        return this.zza.zza(zzpVar, i10, z10);
    }

    public final synchronized long zzg() {
        return this.zzu;
    }

    public final synchronized zzad zzh() {
        if (this.zzx) {
            return null;
        }
        return this.zzz;
    }

    public final void zzi(long j10, boolean z10, boolean z11) {
        this.zza.zzc(zzC(j10, false, z11));
    }

    public final void zzj() {
        this.zza.zzc(zzD());
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final void zzk(zzad zzadVar) {
        this.zzy = zzadVar;
        boolean zzL = zzL(zzadVar);
        zzto zztoVar = this.zzf;
        if (zztoVar == null || !zzL) {
            return;
        }
        zztoVar.zzJ(zzadVar);
    }

    public final void zzm() throws IOException {
        zzpj zzpjVar = this.zzC;
        if (zzpjVar != null) {
            throw zzpjVar.zza();
        }
    }

    public final void zzn() {
        zzj();
        zzH();
    }

    public final void zzo() {
        zzp(true);
        zzH();
    }

    public final void zzp(boolean z10) {
        this.zza.zzf();
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzw = true;
        this.zzs = Long.MIN_VALUE;
        this.zzt = Long.MIN_VALUE;
        this.zzu = Long.MIN_VALUE;
        this.zzv = false;
        this.zzc.zzd();
        if (z10) {
            this.zzy = null;
            this.zzz = null;
            this.zzx = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final /* synthetic */ void zzq(zzdy zzdyVar, int i10) {
        zzzw.zzb(this, zzdyVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final void zzr(zzdy zzdyVar, int i10, int i11) {
        this.zza.zzh(zzdyVar, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final void zzs(long j10, int i10, int i11, int i12, zzzx zzzxVar) {
        int i13 = i10 & 1;
        if (this.zzw) {
            if (i13 == 0) {
                return;
            }
            this.zzw = false;
        }
        if (this.zzA) {
            if (j10 < this.zzs) {
                return;
            }
            if (i13 == 0) {
                if (!this.zzB) {
                    Log.w("SampleQueue", "Overriding unexpected non-sync sample for format: ".concat(String.valueOf(this.zzz)));
                    this.zzB = true;
                }
                i10 |= 1;
            }
        }
        zzF(j10, i10, (this.zza.zzb() - i11) - i12, i11, zzzxVar);
    }

    public final void zzt(long j10) {
        this.zzs = j10;
    }

    public final void zzu(zzto zztoVar) {
        this.zzf = zztoVar;
    }

    public final synchronized void zzv(int i10) {
        boolean z10 = false;
        if (i10 >= 0) {
            try {
                if (this.zzr + i10 <= this.zzo) {
                    z10 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzcw.zzd(z10);
        this.zzr += i10;
    }

    public final synchronized boolean zzw() {
        return this.zzv;
    }

    public final synchronized boolean zzx(boolean z10) {
        boolean z11 = true;
        if (zzJ()) {
            if (((zztn) this.zzc.zza(this.zzp + this.zzr)).zza != this.zzg) {
                return true;
            }
            return zzK(zzA(this.zzr));
        }
        if (!z10 && !this.zzv) {
            zzad zzadVar = this.zzz;
            if (zzadVar == null) {
                z11 = false;
            } else if (zzadVar == this.zzg) {
                return false;
            }
        }
        return z11;
    }

    public final synchronized boolean zzy(long j10, boolean z10) {
        zzI();
        int i10 = this.zzr;
        int zzA = zzA(i10);
        if (!zzJ() || j10 < this.zzm[zzA] || (j10 > this.zzu && !z10)) {
            return false;
        }
        int zzz = zzz(zzA, this.zzo - i10, j10, true);
        if (zzz == -1) {
            return false;
        }
        this.zzs = j10;
        this.zzr += zzz;
        return true;
    }
}
