package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawv implements zzawz, zzatx, zzayt, zzaxj {
    private long zzB;
    private int zzD;
    private boolean zzE;
    private boolean zzF;
    private final zzaym zzG;
    private final Uri zza;
    private final zzayj zzb;
    private final int zzc;
    private final Handler zzd;
    private final zzaww zze;
    private final zzaxa zzf;
    private final long zzg;
    private final zzawt zzi;
    private zzawy zzo;
    private zzaud zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private int zzu;
    private zzaxq zzv;
    private long zzw;
    private boolean[] zzx;
    private boolean[] zzy;
    private boolean zzz;
    private final zzayx zzh = new zzayx("Loader:ExtractorMediaPeriod");
    private final zzazb zzj = new zzazb();
    private final Runnable zzk = new zzawo(this);
    private final Runnable zzl = new zzawp(this);
    private final Handler zzm = new Handler();
    private long zzC = -9223372036854775807L;
    private final SparseArray zzn = new SparseArray();
    private long zzA = -1;

    public zzawv(Uri uri, zzayj zzayjVar, zzatw[] zzatwVarArr, int i10, Handler handler, zzaww zzawwVar, zzaxa zzaxaVar, zzaym zzaymVar, String str, int i11, byte[] bArr) {
        this.zza = uri;
        this.zzb = zzayjVar;
        this.zzc = i10;
        this.zzd = handler;
        this.zze = zzawwVar;
        this.zzf = zzaxaVar;
        this.zzG = zzaymVar;
        this.zzg = i11;
        this.zzi = new zzawt(zzatwVarArr, this);
    }

    private final int zzC() {
        int size = this.zzn.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((zzaxk) this.zzn.valueAt(i11)).zze();
        }
        return i10;
    }

    private final long zzD() {
        int size = this.zzn.size();
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = Math.max(j10, ((zzaxk) this.zzn.valueAt(i10)).zzg());
        }
        return j10;
    }

    private final void zzE(zzaws zzawsVar) {
        long j10;
        if (this.zzA == -1) {
            j10 = zzawsVar.zzj;
            this.zzA = j10;
        }
    }

    private final void zzF() {
        zzaud zzaudVar;
        zzaws zzawsVar = new zzaws(this, this.zza, this.zzb, this.zzi, this.zzj);
        if (this.zzr) {
            zzayz.zze(zzG());
            long j10 = this.zzw;
            if (j10 != -9223372036854775807L && this.zzC >= j10) {
                this.zzE = true;
                this.zzC = -9223372036854775807L;
                return;
            }
            zzawsVar.zzd(this.zzp.zzb(this.zzC), this.zzC);
            this.zzC = -9223372036854775807L;
        }
        this.zzD = zzC();
        int i10 = this.zzc;
        if (i10 == -1) {
            i10 = (this.zzr && this.zzA == -1 && ((zzaudVar = this.zzp) == null || zzaudVar.zza() == -9223372036854775807L)) ? 6 : 3;
        }
        this.zzh.zza(zzawsVar, this, i10);
    }

    private final boolean zzG() {
        return this.zzC != -9223372036854775807L;
    }

    public static /* bridge */ /* synthetic */ void zzp(zzawv zzawvVar) {
        if (zzawvVar.zzF || zzawvVar.zzr || zzawvVar.zzp == null || !zzawvVar.zzq) {
            return;
        }
        int size = zzawvVar.zzn.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((zzaxk) zzawvVar.zzn.valueAt(i10)).zzh() == null) {
                return;
            }
        }
        zzawvVar.zzj.zzb();
        zzaxp[] zzaxpVarArr = new zzaxp[size];
        zzawvVar.zzy = new boolean[size];
        zzawvVar.zzx = new boolean[size];
        zzawvVar.zzw = zzawvVar.zzp.zza();
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i11 < size) {
                zzart zzh = ((zzaxk) zzawvVar.zzn.valueAt(i11)).zzh();
                zzaxpVarArr[i11] = new zzaxp(zzh);
                String str = zzh.zzf;
                if (!zzaze.zzb(str) && !zzaze.zza(str)) {
                    z10 = false;
                }
                zzawvVar.zzy[i11] = z10;
                zzawvVar.zzz = z10 | zzawvVar.zzz;
                i11++;
            } else {
                zzawvVar.zzv = new zzaxq(zzaxpVarArr);
                zzawvVar.zzr = true;
                zzawvVar.zzf.zzg(new zzaxo(zzawvVar.zzw, zzawvVar.zzp.zzc()), null);
                zzawvVar.zzo.zzf(zzawvVar);
                return;
            }
        }
    }

    public final boolean zzA(int i10) {
        return this.zzE || (!zzG() && ((zzaxk) this.zzn.valueAt(i10)).zzm());
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x00bc, code lost:
        if (r1 != false) goto L55;
     */
    @Override // com.google.android.gms.internal.ads.zzawz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzB(com.google.android.gms.internal.ads.zzaxu[] r7, boolean[] r8, com.google.android.gms.internal.ads.zzaxl[] r9, boolean[] r10, long r11) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawv.zzB(com.google.android.gms.internal.ads.zzaxu[], boolean[], com.google.android.gms.internal.ads.zzaxl[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.zzawz, com.google.android.gms.internal.ads.zzaxn
    public final long zza() {
        if (this.zzu == 0) {
            return Long.MIN_VALUE;
        }
        return zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final void zzb() {
        this.zzq = true;
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final zzauf zzbi(int i10, int i11) {
        zzaxk zzaxkVar = (zzaxk) this.zzn.get(i10);
        if (zzaxkVar == null) {
            zzaxk zzaxkVar2 = new zzaxk(this.zzG, null);
            zzaxkVar2.zzk(this);
            this.zzn.put(i10, zzaxkVar2);
            return zzaxkVar2;
        }
        return zzaxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzawz, com.google.android.gms.internal.ads.zzaxn
    public final boolean zzbj(long j10) {
        if (this.zzE) {
            return false;
        }
        if (this.zzr && this.zzu == 0) {
            return false;
        }
        boolean zzc = this.zzj.zzc();
        if (this.zzh.zzi()) {
            return zzc;
        }
        zzF();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzatx
    public final void zzc(zzaud zzaudVar) {
        this.zzp = zzaudVar;
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzayt
    public final /* bridge */ /* synthetic */ int zzd(zzayv zzayvVar, long j10, long j11, IOException iOException) {
        zzaud zzaudVar;
        zzaws zzawsVar = (zzaws) zzayvVar;
        zzE(zzawsVar);
        Handler handler = this.zzd;
        if (handler != null) {
            handler.post(new zzawr(this, iOException));
        }
        if (iOException instanceof zzaxr) {
            return 3;
        }
        int zzC = zzC();
        int i10 = this.zzD;
        if (this.zzA == -1 && ((zzaudVar = this.zzp) == null || zzaudVar.zza() == -9223372036854775807L)) {
            this.zzB = 0L;
            this.zzt = this.zzr;
            int size = this.zzn.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((zzaxk) this.zzn.valueAt(i11)).zzj(!this.zzr || this.zzx[i11]);
            }
            zzawsVar.zzd(0L, 0L);
        }
        this.zzD = zzC();
        return zzC <= i10 ? 0 : 1;
    }

    public final int zze(int i10, zzaru zzaruVar, zzato zzatoVar, boolean z10) {
        if (this.zzt || zzG()) {
            return -3;
        }
        return ((zzaxk) this.zzn.valueAt(i10)).zzf(zzaruVar, zzatoVar, z10, this.zzE, this.zzB);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final long zzg() {
        long zzD;
        if (this.zzE) {
            return Long.MIN_VALUE;
        }
        if (zzG()) {
            return this.zzC;
        }
        if (this.zzz) {
            int size = this.zzn.size();
            zzD = Long.MAX_VALUE;
            for (int i10 = 0; i10 < size; i10++) {
                if (this.zzy[i10]) {
                    zzD = Math.min(zzD, ((zzaxk) this.zzn.valueAt(i10)).zzg());
                }
            }
        } else {
            zzD = zzD();
        }
        return zzD == Long.MIN_VALUE ? this.zzB : zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final long zzh() {
        if (this.zzt) {
            this.zzt = false;
            return this.zzB;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final long zzi(long j10) {
        if (true != this.zzp.zzc()) {
            j10 = 0;
        }
        this.zzB = j10;
        int size = this.zzn.size();
        boolean zzG = true ^ zzG();
        int i10 = 0;
        while (true) {
            if (!zzG) {
                this.zzC = j10;
                this.zzE = false;
                zzayx zzayxVar = this.zzh;
                if (zzayxVar.zzi()) {
                    zzayxVar.zzf();
                } else {
                    for (int i11 = 0; i11 < size; i11++) {
                        ((zzaxk) this.zzn.valueAt(i11)).zzj(this.zzx[i11]);
                    }
                }
            } else if (i10 >= size) {
                break;
            } else {
                if (this.zzx[i10]) {
                    zzG = ((zzaxk) this.zzn.valueAt(i10)).zzn(j10, false);
                }
                i10++;
            }
        }
        this.zzt = false;
        return j10;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final zzaxq zzn() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzq(long j10) {
    }

    public final void zzr() throws IOException {
        this.zzh.zzg(RecyclerView.UNDEFINED_DURATION);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzs() throws IOException {
        this.zzh.zzg(RecyclerView.UNDEFINED_DURATION);
    }

    @Override // com.google.android.gms.internal.ads.zzayt
    public final /* bridge */ /* synthetic */ void zzt(zzayv zzayvVar, long j10, long j11, boolean z10) {
        zzE((zzaws) zzayvVar);
        if (z10 || this.zzu <= 0) {
            return;
        }
        int size = this.zzn.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzaxk) this.zzn.valueAt(i10)).zzj(this.zzx[i10]);
        }
        this.zzo.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzayt
    public final /* bridge */ /* synthetic */ void zzu(zzayv zzayvVar, long j10, long j11) {
        zzE((zzaws) zzayvVar);
        this.zzE = true;
        if (this.zzw == -9223372036854775807L) {
            long zzD = zzD();
            long j12 = zzD == Long.MIN_VALUE ? 0L : zzD + 10000;
            this.zzw = j12;
            this.zzf.zzg(new zzaxo(j12, this.zzp.zzc()), null);
        }
        this.zzo.zze(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaxj
    public final void zzv(zzart zzartVar) {
        this.zzm.post(this.zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzawz
    public final void zzw(zzawy zzawyVar, long j10) {
        this.zzo = zzawyVar;
        this.zzj.zzc();
        zzF();
    }

    public final void zzx() {
        this.zzh.zzh(new zzawq(this, this.zzi));
        this.zzm.removeCallbacksAndMessages(null);
        this.zzF = true;
    }

    public final void zzy(int i10, long j10) {
        zzaxk zzaxkVar = (zzaxk) this.zzn.valueAt(i10);
        if (this.zzE && j10 > zzaxkVar.zzg()) {
            zzaxkVar.zzl();
        } else {
            zzaxkVar.zzn(j10, true);
        }
    }
}
