package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaxk implements zzauf {
    private zzaxi zze;
    private zzaxi zzf;
    private zzart zzg;
    private zzart zzh;
    private long zzi;
    private zzaxj zzk;
    private final zzaym zzl;
    private final zzaxh zza = new zzaxh();
    private final zzaxg zzb = new zzaxg();
    private final zzazh zzc = new zzazh(32);
    private final AtomicInteger zzd = new AtomicInteger();
    private int zzj = Constants.MIN_PROGRESS_STEP;

    public zzaxk(zzaym zzaymVar, byte[] bArr) {
        this.zzl = zzaymVar;
        zzaxi zzaxiVar = new zzaxi(0L, Constants.MIN_PROGRESS_STEP);
        this.zze = zzaxiVar;
        this.zzf = zzaxiVar;
    }

    private final int zzo(int i10) {
        if (this.zzj == 65536) {
            this.zzj = 0;
            zzaxi zzaxiVar = this.zzf;
            if (zzaxiVar.zzc) {
                this.zzf = zzaxiVar.zze;
            }
            zzaxi zzaxiVar2 = this.zzf;
            zzayg zzb = this.zzl.zzb();
            zzaxi zzaxiVar3 = new zzaxi(this.zzf.zzb, Constants.MIN_PROGRESS_STEP);
            zzaxiVar2.zzd = zzb;
            zzaxiVar2.zze = zzaxiVar3;
            zzaxiVar2.zzc = true;
        }
        return Math.min(i10, Constants.MIN_PROGRESS_STEP - this.zzj);
    }

    private final void zzp() {
        this.zza.zzg();
        zzaxi zzaxiVar = this.zze;
        if (zzaxiVar.zzc) {
            zzaxi zzaxiVar2 = this.zzf;
            boolean z10 = zzaxiVar2.zzc;
            int i10 = (z10 ? 1 : 0) + (((int) (zzaxiVar2.zza - zzaxiVar.zza)) / Constants.MIN_PROGRESS_STEP);
            zzayg[] zzaygVarArr = new zzayg[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                zzaygVarArr[i11] = zzaxiVar.zzd;
                zzaxiVar.zzd = null;
                zzaxiVar = zzaxiVar.zze;
            }
            this.zzl.zzd(zzaygVarArr);
        }
        zzaxi zzaxiVar3 = new zzaxi(0L, Constants.MIN_PROGRESS_STEP);
        this.zze = zzaxiVar3;
        this.zzf = zzaxiVar3;
        this.zzi = 0L;
        this.zzj = Constants.MIN_PROGRESS_STEP;
        this.zzl.zzg();
    }

    private final void zzq(long j10) {
        while (true) {
            zzaxi zzaxiVar = this.zze;
            if (j10 < zzaxiVar.zzb) {
                return;
            }
            this.zzl.zzc(zzaxiVar.zzd);
            zzaxi zzaxiVar2 = this.zze;
            zzaxiVar2.zzd = null;
            this.zze = zzaxiVar2.zze;
        }
    }

    private final void zzr() {
        if (this.zzd.compareAndSet(1, 0)) {
            return;
        }
        zzp();
    }

    private final void zzs(long j10, byte[] bArr, int i10) {
        zzq(j10);
        int i11 = 0;
        while (i11 < i10) {
            int i12 = (int) (j10 - this.zze.zza);
            int min = Math.min(i10 - i11, Constants.MIN_PROGRESS_STEP - i12);
            zzayg zzaygVar = this.zze.zzd;
            System.arraycopy(zzaygVar.zza, i12, bArr, i11, min);
            j10 += min;
            i11 += min;
            if (j10 == this.zze.zzb) {
                this.zzl.zzc(zzaygVar);
                zzaxi zzaxiVar = this.zze;
                zzaxiVar.zzd = null;
                this.zze = zzaxiVar.zze;
            }
        }
    }

    private final boolean zzt() {
        return this.zzd.compareAndSet(0, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final void zza(zzart zzartVar) {
        zzart zzartVar2 = zzartVar == null ? null : zzartVar;
        boolean zzk = this.zza.zzk(zzartVar2);
        this.zzh = zzartVar;
        zzaxj zzaxjVar = this.zzk;
        if (zzaxjVar == null || !zzk) {
            return;
        }
        zzaxjVar.zzv(zzartVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final void zzb(zzazh zzazhVar, int i10) {
        if (zzt()) {
            while (i10 > 0) {
                int zzo = zzo(i10);
                zzazhVar.zzq(this.zzf.zzd.zza, this.zzj, zzo);
                this.zzj += zzo;
                this.zzi += zzo;
                i10 -= zzo;
            }
            zzr();
            return;
        }
        zzazhVar.zzw(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final void zzc(long j10, int i10, int i11, int i12, zzaue zzaueVar) {
        if (zzt()) {
            try {
                this.zza.zzh(j10, i10, this.zzi - i11, i11, zzaueVar);
                return;
            } finally {
                zzr();
            }
        }
        this.zza.zzi(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzauf
    public final int zzd(zzatv zzatvVar, int i10, boolean z10) throws IOException, InterruptedException {
        if (!zzt()) {
            int zzb = zzatvVar.zzb(i10);
            if (zzb != -1) {
                return zzb;
            }
            throw new EOFException();
        }
        try {
            int zza = zzatvVar.zza(this.zzf.zzd.zza, this.zzj, zzo(i10));
            if (zza != -1) {
                this.zzj += zza;
                this.zzi += zza;
                return zza;
            }
            throw new EOFException();
        } finally {
            zzr();
        }
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final int zzf(zzaru zzaruVar, zzato zzatoVar, boolean z10, boolean z11, long j10) {
        int i10;
        int zzb = this.zza.zzb(zzaruVar, zzatoVar, z10, z11, this.zzg, this.zzb);
        if (zzb == -5) {
            this.zzg = zzaruVar.zza;
            return -5;
        } else if (zzb != -4) {
            return -3;
        } else {
            if (!zzatoVar.zzf()) {
                if (zzatoVar.zzc < j10) {
                    zzatoVar.zza(RecyclerView.UNDEFINED_DURATION);
                }
                if (zzatoVar.zzi()) {
                    zzaxg zzaxgVar = this.zzb;
                    long j11 = zzaxgVar.zzb;
                    this.zzc.zzs(1);
                    zzs(j11, this.zzc.zza, 1);
                    long j12 = j11 + 1;
                    byte b10 = this.zzc.zza[0];
                    int i11 = b10 & 128;
                    int i12 = b10 & Byte.MAX_VALUE;
                    zzatm zzatmVar = zzatoVar.zza;
                    if (zzatmVar.zza == null) {
                        zzatmVar.zza = new byte[16];
                    }
                    zzs(j12, zzatmVar.zza, i12);
                    long j13 = j12 + i12;
                    if (i11 != 0) {
                        this.zzc.zzs(2);
                        zzs(j13, this.zzc.zza, 2);
                        j13 += 2;
                        i10 = this.zzc.zzj();
                    } else {
                        i10 = 1;
                    }
                    zzatm zzatmVar2 = zzatoVar.zza;
                    int[] iArr = zzatmVar2.zzd;
                    if (iArr == null || iArr.length < i10) {
                        iArr = new int[i10];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzatmVar2.zze;
                    if (iArr3 == null || iArr3.length < i10) {
                        iArr3 = new int[i10];
                    }
                    int[] iArr4 = iArr3;
                    if (i11 != 0) {
                        int i13 = i10 * 6;
                        this.zzc.zzs(i13);
                        zzs(j13, this.zzc.zza, i13);
                        j13 += i13;
                        this.zzc.zzv(0);
                        for (int i14 = 0; i14 < i10; i14++) {
                            iArr2[i14] = this.zzc.zzj();
                            iArr4[i14] = this.zzc.zzi();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzaxgVar.zza - ((int) (j13 - zzaxgVar.zzb));
                    }
                    zzaue zzaueVar = zzaxgVar.zzd;
                    zzatm zzatmVar3 = zzatoVar.zza;
                    zzatmVar3.zzb(i10, iArr2, iArr4, zzaueVar.zzb, zzatmVar3.zza, 1);
                    long j14 = zzaxgVar.zzb;
                    int i15 = (int) (j13 - j14);
                    zzaxgVar.zzb = j14 + i15;
                    zzaxgVar.zza -= i15;
                }
                zzatoVar.zzh(this.zzb.zza);
                zzaxg zzaxgVar2 = this.zzb;
                long j15 = zzaxgVar2.zzb;
                ByteBuffer byteBuffer = zzatoVar.zzb;
                int i16 = zzaxgVar2.zza;
                zzq(j15);
                while (i16 > 0) {
                    int i17 = (int) (j15 - this.zze.zza);
                    int min = Math.min(i16, Constants.MIN_PROGRESS_STEP - i17);
                    zzayg zzaygVar = this.zze.zzd;
                    byteBuffer.put(zzaygVar.zza, i17, min);
                    j15 += min;
                    i16 -= min;
                    if (j15 == this.zze.zzb) {
                        this.zzl.zzc(zzaygVar);
                        zzaxi zzaxiVar = this.zze;
                        zzaxiVar.zzd = null;
                        this.zze = zzaxiVar.zze;
                    }
                }
                zzq(this.zzb.zzc);
            }
            return -4;
        }
    }

    public final long zzg() {
        return this.zza.zzc();
    }

    public final zzart zzh() {
        return this.zza.zzf();
    }

    public final void zzi() {
        if (this.zzd.getAndSet(2) == 0) {
            zzp();
        }
    }

    public final void zzj(boolean z10) {
        int andSet = this.zzd.getAndSet(true != z10 ? 2 : 0);
        zzp();
        this.zza.zzj();
        if (andSet == 2) {
            this.zzg = null;
        }
    }

    public final void zzk(zzaxj zzaxjVar) {
        this.zzk = zzaxjVar;
    }

    public final void zzl() {
        long zzd = this.zza.zzd();
        if (zzd != -1) {
            zzq(zzd);
        }
    }

    public final boolean zzm() {
        return this.zza.zzl();
    }

    public final boolean zzn(long j10, boolean z10) {
        long zze = this.zza.zze(j10, z10);
        if (zze == -1) {
            return false;
        }
        zzq(zze);
        return true;
    }
}
