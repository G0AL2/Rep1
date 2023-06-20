package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzom implements zznq {
    private boolean zzA;
    private boolean zzB;
    private long zzC;
    private float zzD;
    private zzmy[] zzE;
    private ByteBuffer[] zzF;
    private ByteBuffer zzG;
    private int zzH;
    private ByteBuffer zzI;
    private byte[] zzJ;
    private int zzK;
    private int zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private int zzQ;
    private zzj zzR;
    private long zzS;
    private boolean zzT;
    private boolean zzU;
    private final zzoc zzV;
    private final zzmv zza;
    private final zznw zzb;
    private final zzox zzc;
    private final zzmy[] zzd;
    private final zzmy[] zze;
    private final ConditionVariable zzf;
    private final zznu zzg;
    private final ArrayDeque zzh;
    private zzok zzi;
    private final zzof zzj;
    private final zzof zzk;
    private final zznz zzl;
    private zzmu zzm;
    private zznn zzn;
    private zzob zzo;
    private zzob zzp;
    private AudioTrack zzq;
    private zzi zzr;
    private zzoe zzs;
    private zzoe zzt;
    private final zzbt zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private int zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzom(zzoa zzoaVar, zzol zzolVar) {
        zzmv zzmvVar;
        zzoc zzocVar;
        zzmvVar = zzoaVar.zzb;
        this.zza = zzmvVar;
        zzocVar = zzoaVar.zzc;
        this.zzV = zzocVar;
        int i10 = zzeg.zza;
        this.zzl = zzoaVar.zza;
        this.zzf = new ConditionVariable(true);
        this.zzg = new zznu(new zzoh(this, null));
        zznw zznwVar = new zznw();
        this.zzb = zznwVar;
        zzox zzoxVar = new zzox();
        this.zzc = zzoxVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new zzot(), zznwVar, zzoxVar);
        Collections.addAll(arrayList, zzocVar.zze());
        this.zzd = (zzmy[]) arrayList.toArray(new zzmy[0]);
        this.zze = new zzmy[]{new zzop()};
        this.zzD = 1.0f;
        this.zzr = zzi.zza;
        this.zzQ = 0;
        this.zzR = new zzj(0, 0.0f);
        zzbt zzbtVar = zzbt.zza;
        this.zzt = new zzoe(zzbtVar, false, 0L, 0L, null);
        this.zzu = zzbtVar;
        this.zzL = -1;
        this.zzE = new zzmy[0];
        this.zzF = new ByteBuffer[0];
        this.zzh = new ArrayDeque();
        this.zzj = new zzof(100L);
        this.zzk = new zzof(100L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzE() {
        zzob zzobVar = this.zzp;
        return zzobVar.zzc == 0 ? this.zzv / zzobVar.zzb : this.zzw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzF() {
        zzob zzobVar = this.zzp;
        return zzobVar.zzc == 0 ? this.zzx / zzobVar.zzd : this.zzy;
    }

    private final AudioTrack zzG(zzob zzobVar) throws zznm {
        try {
            return zzobVar.zzb(false, this.zzr, this.zzQ);
        } catch (zznm e10) {
            zznn zznnVar = this.zzn;
            if (zznnVar != null) {
                zznnVar.zza(e10);
            }
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair zzH(com.google.android.gms.internal.ads.zzad r12, com.google.android.gms.internal.ads.zzmv r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzom.zzH(com.google.android.gms.internal.ads.zzad, com.google.android.gms.internal.ads.zzmv):android.util.Pair");
    }

    private final zzoe zzI() {
        zzoe zzoeVar = this.zzs;
        return zzoeVar != null ? zzoeVar : !this.zzh.isEmpty() ? (zzoe) this.zzh.getLast() : this.zzt;
    }

    private final void zzJ(long j10) {
        zzbt zzbtVar;
        boolean z10;
        if (zzU()) {
            zzoc zzocVar = this.zzV;
            zzbtVar = zzI().zza;
            zzocVar.zzc(zzbtVar);
        } else {
            zzbtVar = zzbt.zza;
        }
        zzbt zzbtVar2 = zzbtVar;
        if (zzU()) {
            zzoc zzocVar2 = this.zzV;
            boolean z11 = zzI().zzb;
            zzocVar2.zzd(z11);
            z10 = z11;
        } else {
            z10 = false;
        }
        this.zzh.add(new zzoe(zzbtVar2, z10, Math.max(0L, j10), this.zzp.zza(zzF()), null));
        zzmy[] zzmyVarArr = this.zzp.zzi;
        ArrayList arrayList = new ArrayList();
        for (zzmy zzmyVar : zzmyVarArr) {
            if (zzmyVar.zzg()) {
                arrayList.add(zzmyVar);
            } else {
                zzmyVar.zzc();
            }
        }
        int size = arrayList.size();
        this.zzE = (zzmy[]) arrayList.toArray(new zzmy[size]);
        this.zzF = new ByteBuffer[size];
        zzK();
        zznn zznnVar = this.zzn;
        if (zznnVar != null) {
            zzos.zzU(((zzor) zznnVar).zza).zzs(z10);
        }
    }

    private final void zzK() {
        int i10 = 0;
        while (true) {
            zzmy[] zzmyVarArr = this.zzE;
            if (i10 >= zzmyVarArr.length) {
                return;
            }
            zzmy zzmyVar = zzmyVarArr[i10];
            zzmyVar.zzc();
            this.zzF[i10] = zzmyVar.zzb();
            i10++;
        }
    }

    private final void zzL() {
        if (this.zzp.zzc()) {
            this.zzT = true;
        }
    }

    private final void zzM() {
        if (this.zzN) {
            return;
        }
        this.zzN = true;
        this.zzg.zzd(zzF());
        this.zzq.stop();
    }

    private final void zzN(long j10) throws zznp {
        ByteBuffer byteBuffer;
        int length = this.zzE.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.zzF[i10 - 1];
            } else {
                byteBuffer = this.zzG;
                if (byteBuffer == null) {
                    byteBuffer = zzmy.zza;
                }
            }
            if (i10 == length) {
                zzQ(byteBuffer, j10);
            } else {
                zzmy zzmyVar = this.zzE[i10];
                if (i10 > this.zzL) {
                    zzmyVar.zze(byteBuffer);
                }
                ByteBuffer zzb = zzmyVar.zzb();
                this.zzF[i10] = zzb;
                if (zzb.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i10--;
        }
    }

    private final void zzO(zzbt zzbtVar, boolean z10) {
        zzoe zzI = zzI();
        if (zzbtVar.equals(zzI.zza) && z10 == zzI.zzb) {
            return;
        }
        zzoe zzoeVar = new zzoe(zzbtVar, z10, -9223372036854775807L, -9223372036854775807L, null);
        if (zzS()) {
            this.zzs = zzoeVar;
        } else {
            this.zzt = zzoeVar;
        }
    }

    private final void zzP() {
        if (zzS()) {
            if (zzeg.zza >= 21) {
                this.zzq.setVolume(this.zzD);
                return;
            }
            AudioTrack audioTrack = this.zzq;
            float f10 = this.zzD;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    private final void zzQ(ByteBuffer byteBuffer, long j10) throws zznp {
        int write;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzI;
            if (byteBuffer2 != null) {
                zzcw.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzI = byteBuffer;
                if (zzeg.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzJ;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzJ = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzJ, 0, remaining);
                    byteBuffer.position(position);
                    this.zzK = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            int i10 = zzeg.zza;
            if (i10 < 21) {
                int zza = this.zzg.zza(this.zzx);
                if (zza > 0) {
                    write = this.zzq.write(this.zzJ, this.zzK, Math.min(remaining2, zza));
                    if (write > 0) {
                        this.zzK += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.zzq.write(byteBuffer, remaining2, 1);
            }
            this.zzS = SystemClock.elapsedRealtime();
            if (write < 0) {
                if ((i10 < 24 || write != -6) && write != -32) {
                    r0 = false;
                }
                if (r0) {
                    zzL();
                }
                zznp zznpVar = new zznp(write, this.zzp.zza, r0);
                zznn zznnVar = this.zzn;
                if (zznnVar != null) {
                    zznnVar.zza(zznpVar);
                }
                if (!zznpVar.zzb) {
                    this.zzk.zzb(zznpVar);
                    return;
                }
                throw zznpVar;
            }
            this.zzk.zza();
            if (zzT(this.zzq)) {
                long j11 = this.zzy;
                if (j11 > 0) {
                    this.zzU = false;
                }
                if (this.zzO && this.zzn != null && write < remaining2 && !this.zzU) {
                    long zzc = this.zzg.zzc(j11);
                    zzos zzosVar = ((zzor) this.zzn).zza;
                    if (zzos.zzT(zzosVar) != null) {
                        zzos.zzT(zzosVar).zza(zzc);
                    }
                }
            }
            int i11 = this.zzp.zzc;
            if (i11 == 0) {
                this.zzx += write;
            }
            if (write == remaining2) {
                if (i11 != 0) {
                    zzcw.zzf(byteBuffer == this.zzG);
                    this.zzy += this.zzz * this.zzH;
                }
                this.zzI = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzR() throws com.google.android.gms.internal.ads.zznp {
        /*
            r9 = this;
            int r0 = r9.zzL
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Lb
            r9.zzL = r3
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.zzL
            com.google.android.gms.internal.ads.zzmy[] r5 = r9.zzE
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.zzd()
        L1f:
            r9.zzN(r7)
            boolean r0 = r4.zzh()
            if (r0 != 0) goto L29
            return r3
        L29:
            int r0 = r9.zzL
            int r0 = r0 + r2
            r9.zzL = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.zzI
            if (r0 == 0) goto L3b
            r9.zzQ(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzI
            if (r0 == 0) goto L3b
            return r3
        L3b:
            r9.zzL = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzom.zzR():boolean");
    }

    private final boolean zzS() {
        return this.zzq != null;
    }

    private static boolean zzT(AudioTrack audioTrack) {
        return zzeg.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzU() {
        if ("audio/raw".equals(this.zzp.zza.zzm)) {
            int i10 = this.zzp.zza.zzB;
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final int zza(zzad zzadVar) {
        if (!"audio/raw".equals(zzadVar.zzm)) {
            if (!this.zzT) {
                int i10 = zzeg.zza;
            }
            return zzH(zzadVar, this.zza) != null ? 2 : 0;
        } else if (zzeg.zzU(zzadVar.zzB)) {
            return zzadVar.zzB != 2 ? 1 : 2;
        } else {
            int i11 = zzadVar.zzB;
            Log.w("DefaultAudioSink", "Invalid PCM encoding: " + i11);
            return 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final long zzb(boolean z10) {
        long zzs;
        if (!zzS() || this.zzB) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzg.zzb(z10), this.zzp.zza(zzF()));
        while (!this.zzh.isEmpty() && min >= ((zzoe) this.zzh.getFirst()).zzd) {
            this.zzt = (zzoe) this.zzh.remove();
        }
        zzoe zzoeVar = this.zzt;
        long j10 = min - zzoeVar.zzd;
        if (zzoeVar.zza.equals(zzbt.zza)) {
            zzs = this.zzt.zzc + j10;
        } else if (this.zzh.isEmpty()) {
            zzs = this.zzV.zza(j10) + this.zzt.zzc;
        } else {
            zzoe zzoeVar2 = (zzoe) this.zzh.getFirst();
            zzs = zzoeVar2.zzc - zzeg.zzs(zzoeVar2.zzd - min, this.zzt.zza.zzc);
        }
        return zzs + this.zzp.zza(this.zzV.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final zzbt zzc() {
        return zzI().zza;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzd(zzad zzadVar, int i10, int[] iArr) throws zznl {
        int i11;
        zzmy[] zzmyVarArr;
        int intValue;
        int i12;
        int intValue2;
        int i13;
        int i14;
        int zzf;
        int[] iArr2;
        if ("audio/raw".equals(zzadVar.zzm)) {
            zzcw.zzd(zzeg.zzU(zzadVar.zzB));
            i12 = zzeg.zzo(zzadVar.zzB, zzadVar.zzz);
            zzmy[] zzmyVarArr2 = this.zzd;
            this.zzc.zzq(zzadVar.zzC, zzadVar.zzD);
            if (zzeg.zza < 21 && zzadVar.zzz == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i15 = 0; i15 < 6; i15++) {
                    iArr2[i15] = i15;
                }
            } else {
                iArr2 = iArr;
            }
            this.zzb.zzo(iArr2);
            zzmw zzmwVar = new zzmw(zzadVar.zzA, zzadVar.zzz, zzadVar.zzB);
            for (zzmy zzmyVar : zzmyVarArr2) {
                try {
                    zzmw zza = zzmyVar.zza(zzmwVar);
                    if (true == zzmyVar.zzg()) {
                        zzmwVar = zza;
                    }
                } catch (zzmx e10) {
                    throw new zznl(e10, zzadVar);
                }
            }
            int i16 = zzmwVar.zzd;
            int i17 = zzmwVar.zzb;
            int i18 = zzmwVar.zzc;
            int zzj = zzeg.zzj(i18);
            zzmyVarArr = zzmyVarArr2;
            i14 = zzeg.zzo(i16, i18);
            i13 = i17;
            i11 = 0;
            intValue = i16;
            intValue2 = zzj;
        } else {
            zzmy[] zzmyVarArr3 = new zzmy[0];
            int i19 = zzadVar.zzA;
            int i20 = zzeg.zza;
            Pair zzH = zzH(zzadVar, this.zza);
            if (zzH != null) {
                i11 = 2;
                zzmyVarArr = zzmyVarArr3;
                intValue = ((Integer) zzH.first).intValue();
                i12 = -1;
                intValue2 = ((Integer) zzH.second).intValue();
                i13 = i19;
                i14 = -1;
            } else {
                throw new zznl("Unable to configure passthrough for: ".concat(String.valueOf(zzadVar)), zzadVar);
            }
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i13, intValue2, intValue);
        zzcw.zzf(minBufferSize != -2);
        int i21 = 250000;
        if (i11 == 0) {
            zzf = zzeg.zzf(minBufferSize * 4, zzoo.zza(250000, i13, i14), zzoo.zza(750000, i13, i14));
        } else if (i11 != 1) {
            int i22 = 5;
            if (intValue == 5) {
                i21 = 500000;
                intValue = 5;
            } else {
                i22 = intValue;
            }
            zzf = zzfto.zza((i21 * zzoo.zzb(intValue)) / 1000000);
            i14 = i14;
            intValue = i22;
        } else {
            zzf = zzfto.zza((zzoo.zzb(intValue) * 50000000) / 1000000);
        }
        int max = (((Math.max(minBufferSize, zzf) + i14) - 1) / i14) * i14;
        if (intValue == 0) {
            throw new zznl("Invalid output encoding (mode=" + i11 + ") for: " + String.valueOf(zzadVar), zzadVar);
        } else if (intValue2 != 0) {
            this.zzT = false;
            zzob zzobVar = new zzob(zzadVar, i12, i11, i14, i13, intValue2, intValue, max, zzmyVarArr);
            if (zzS()) {
                this.zzo = zzobVar;
            } else {
                this.zzp = zzobVar;
            }
        } else {
            throw new zznl("Invalid output channel config (mode=" + i11 + ") for: " + String.valueOf(zzadVar), zzadVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zze() {
        if (zzS()) {
            this.zzv = 0L;
            this.zzw = 0L;
            this.zzx = 0L;
            this.zzy = 0L;
            this.zzU = false;
            this.zzz = 0;
            this.zzt = new zzoe(zzI().zza, zzI().zzb, 0L, 0L, null);
            this.zzC = 0L;
            this.zzs = null;
            this.zzh.clear();
            this.zzG = null;
            this.zzH = 0;
            this.zzI = null;
            this.zzN = false;
            this.zzM = false;
            this.zzL = -1;
            this.zzc.zzp();
            zzK();
            if (this.zzg.zzi()) {
                this.zzq.pause();
            }
            if (zzT(this.zzq)) {
                zzok zzokVar = this.zzi;
                Objects.requireNonNull(zzokVar);
                zzokVar.zzb(this.zzq);
            }
            AudioTrack audioTrack = this.zzq;
            this.zzq = null;
            if (zzeg.zza < 21 && !this.zzP) {
                this.zzQ = 0;
            }
            zzob zzobVar = this.zzo;
            if (zzobVar != null) {
                this.zzp = zzobVar;
                this.zzo = null;
            }
            this.zzg.zze();
            this.zzf.close();
            new zznx(this, "ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.zzk.zza();
        this.zzj.zza();
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzf() {
        this.zzA = true;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzg() {
        this.zzO = false;
        if (zzS() && this.zzg.zzl()) {
            this.zzq.pause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzh() {
        this.zzO = true;
        if (zzS()) {
            this.zzg.zzg();
            this.zzq.play();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzi() throws zznp {
        if (!this.zzM && zzS() && zzR()) {
            zzM();
            this.zzM = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzj() {
        zze();
        for (zzmy zzmyVar : this.zzd) {
            zzmyVar.zzf();
        }
        zzmy[] zzmyVarArr = this.zze;
        int length = zzmyVarArr.length;
        for (int i10 = 0; i10 <= 0; i10++) {
            zzmyVarArr[i10].zzf();
        }
        this.zzO = false;
        this.zzT = false;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzk(zzi zziVar) {
        if (this.zzr.equals(zziVar)) {
            return;
        }
        this.zzr = zziVar;
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzl(int i10) {
        if (this.zzQ != i10) {
            this.zzQ = i10;
            this.zzP = i10 != 0;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzm(zzj zzjVar) {
        if (this.zzR.equals(zzjVar)) {
            return;
        }
        int i10 = zzjVar.zza;
        if (this.zzq != null) {
            int i11 = this.zzR.zza;
        }
        this.zzR = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzn(zznn zznnVar) {
        this.zzn = zznnVar;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzo(zzbt zzbtVar) {
        zzO(new zzbt(zzeg.zza(zzbtVar.zzc, 0.1f, 8.0f), zzeg.zza(zzbtVar.zzd, 0.1f, 8.0f)), zzI().zzb);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzp(zzmu zzmuVar) {
        this.zzm = zzmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzq(boolean z10) {
        zzO(zzI().zza, z10);
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final void zzr(float f10) {
        if (this.zzD != f10) {
            this.zzD = f10;
            zzP();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final boolean zzs(ByteBuffer byteBuffer, long j10, int i10) throws zznm, zznp {
        AudioTrack zzG;
        zzmu zzmuVar;
        boolean z10;
        int zza;
        int i11;
        int i12;
        int i13;
        byte b10;
        int i14;
        int i15;
        ByteBuffer byteBuffer2 = this.zzG;
        boolean z11 = false;
        zzcw.zzd(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.zzo != null) {
            if (!zzR()) {
                return false;
            }
            zzob zzobVar = this.zzo;
            zzob zzobVar2 = this.zzp;
            if (zzobVar2.zzc == zzobVar.zzc && zzobVar2.zzg == zzobVar.zzg && zzobVar2.zze == zzobVar.zze && zzobVar2.zzf == zzobVar.zzf && zzobVar2.zzd == zzobVar.zzd) {
                this.zzp = zzobVar;
                this.zzo = null;
                if (zzT(this.zzq)) {
                    this.zzq.setOffloadEndOfStream();
                    AudioTrack audioTrack = this.zzq;
                    zzad zzadVar = this.zzp.zza;
                    audioTrack.setOffloadDelayPadding(zzadVar.zzC, zzadVar.zzD);
                    this.zzU = true;
                }
            } else {
                zzM();
                if (zzt()) {
                    return false;
                }
                zze();
            }
            zzJ(j10);
        }
        if (!zzS()) {
            try {
                this.zzf.block();
                try {
                    zzob zzobVar3 = this.zzp;
                    Objects.requireNonNull(zzobVar3);
                    zzG = zzG(zzobVar3);
                } catch (zznm e10) {
                    zzob zzobVar4 = this.zzp;
                    if (zzobVar4.zzh > 1000000) {
                        zzob zzobVar5 = new zzob(zzobVar4.zza, zzobVar4.zzb, zzobVar4.zzc, zzobVar4.zzd, zzobVar4.zze, zzobVar4.zzf, zzobVar4.zzg, 1000000, zzobVar4.zzi);
                        try {
                            zzG = zzG(zzobVar5);
                            this.zzp = zzobVar5;
                        } catch (zznm e11) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e10, e11);
                            } catch (Exception unused) {
                            }
                            zzL();
                            throw e10;
                        }
                    }
                    zzL();
                    throw e10;
                }
                this.zzq = zzG;
                if (zzT(zzG)) {
                    AudioTrack audioTrack2 = this.zzq;
                    if (this.zzi == null) {
                        this.zzi = new zzok(this);
                    }
                    this.zzi.zza(audioTrack2);
                    AudioTrack audioTrack3 = this.zzq;
                    zzad zzadVar2 = this.zzp.zza;
                    audioTrack3.setOffloadDelayPadding(zzadVar2.zzC, zzadVar2.zzD);
                }
                if (zzeg.zza >= 31 && (zzmuVar = this.zzm) != null) {
                    zzny.zza(this.zzq, zzmuVar);
                }
                this.zzQ = this.zzq.getAudioSessionId();
                zznu zznuVar = this.zzg;
                AudioTrack audioTrack4 = this.zzq;
                zzob zzobVar6 = this.zzp;
                zznuVar.zzf(audioTrack4, zzobVar6.zzc == 2, zzobVar6.zzg, zzobVar6.zzd, zzobVar6.zzh);
                zzP();
                int i16 = this.zzR.zza;
                this.zzB = true;
                z11 = false;
            } catch (zznm e12) {
                if (!e12.zzb) {
                    this.zzj.zzb(e12);
                    return false;
                }
                throw e12;
            }
        }
        this.zzj.zza();
        if (this.zzB) {
            this.zzC = Math.max(0L, j10);
            this.zzA = z11;
            this.zzB = z11;
            zzJ(j10);
            if (this.zzO) {
                zzh();
            }
        }
        if (this.zzg.zzk(zzF())) {
            if (this.zzG == null) {
                zzcw.zzd(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
                if (!byteBuffer.hasRemaining()) {
                    return true;
                }
                zzob zzobVar7 = this.zzp;
                if (zzobVar7.zzc != 0 && this.zzz == 0) {
                    int i17 = zzobVar7.zzg;
                    switch (i17) {
                        case 5:
                        case 6:
                        case 18:
                            z10 = true;
                            zza = zzxw.zza(byteBuffer);
                            break;
                        case 7:
                        case 8:
                            int i18 = zzyp.zza;
                            int position = byteBuffer.position();
                            byte b11 = byteBuffer.get(position);
                            if (b11 != -2) {
                                if (b11 == -1) {
                                    i12 = 2;
                                    i13 = (byteBuffer.get(position + 4) & 7) << 4;
                                    b10 = byteBuffer.get(position + 7);
                                } else if (b11 != 31) {
                                    i13 = (byteBuffer.get(position + 4) & 1) << 6;
                                    i14 = byteBuffer.get(position + 5) & 252;
                                    i12 = 2;
                                    i11 = (i14 >> i12) | i13;
                                    z10 = true;
                                } else {
                                    i12 = 2;
                                    i13 = (byteBuffer.get(position + 5) & 7) << 4;
                                    b10 = byteBuffer.get(position + 6);
                                }
                                i14 = b10 & 60;
                                i11 = (i14 >> i12) | i13;
                                z10 = true;
                            } else {
                                z10 = true;
                                i11 = ((byteBuffer.get(position + 4) & 252) >> 2) | ((byteBuffer.get(position + 5) & 1) << 6);
                            }
                            zza = (i11 + (z10 ? 1 : 0)) * 32;
                            break;
                        case 9:
                            zza = zzzl.zzc(zzeg.zzk(byteBuffer, byteBuffer.position()));
                            if (zza == -1) {
                                throw new IllegalArgumentException();
                            }
                            z10 = true;
                            break;
                        case 10:
                        case 16:
                            zza = IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES;
                            z10 = true;
                            break;
                        case 11:
                        case 12:
                            zza = 2048;
                            z10 = true;
                            break;
                        case 13:
                        default:
                            throw new IllegalStateException("Unexpected audio encoding: " + i17);
                        case 14:
                            int i19 = zzxw.zza;
                            int position2 = byteBuffer.position();
                            int limit = byteBuffer.limit() - 10;
                            int i20 = position2;
                            while (true) {
                                if (i20 > limit) {
                                    i15 = -1;
                                } else if ((zzeg.zzk(byteBuffer, i20 + 4) & (-2)) == -126718022) {
                                    i15 = i20 - position2;
                                } else {
                                    i20++;
                                }
                            }
                            if (i15 == -1) {
                                zza = 0;
                            } else {
                                zza = (40 << ((byteBuffer.get((byteBuffer.position() + i15) + ((byteBuffer.get((byteBuffer.position() + i15) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                            }
                            z10 = true;
                            break;
                        case 15:
                            zza = AdRequest.MAX_CONTENT_URL_LENGTH;
                            z10 = true;
                            break;
                        case 17:
                            int i21 = zzxz.zza;
                            byte[] bArr = new byte[16];
                            int position3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(position3);
                            zza = zzxz.zza(new zzdx(bArr, 16)).zzc;
                            z10 = true;
                            break;
                    }
                    this.zzz = zza;
                    if (zza == 0) {
                        return z10;
                    }
                }
                if (this.zzs != null) {
                    if (!zzR()) {
                        return false;
                    }
                    zzJ(j10);
                    this.zzs = null;
                }
                long zzE = this.zzC + (((zzE() - this.zzc.zzo()) * 1000000) / this.zzp.zza.zzA);
                if (!this.zzA && Math.abs(zzE - j10) > 200000) {
                    this.zzn.zza(new zzno(j10, zzE));
                    this.zzA = true;
                }
                if (this.zzA) {
                    if (!zzR()) {
                        return false;
                    }
                    long j11 = j10 - zzE;
                    this.zzC += j11;
                    this.zzA = false;
                    zzJ(j10);
                    zznn zznnVar = this.zzn;
                    if (zznnVar != null && j11 != 0) {
                        ((zzor) zznnVar).zza.zzab();
                    }
                }
                if (this.zzp.zzc == 0) {
                    this.zzv += byteBuffer.remaining();
                } else {
                    this.zzw += this.zzz * i10;
                }
                this.zzG = byteBuffer;
                this.zzH = i10;
            }
            zzN(j10);
            if (!this.zzG.hasRemaining()) {
                this.zzG = null;
                this.zzH = 0;
                return true;
            } else if (this.zzg.zzj(zzF())) {
                Log.w("DefaultAudioSink", "Resetting stalled audio track");
                zze();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final boolean zzt() {
        return zzS() && this.zzg.zzh(zzF());
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final boolean zzu() {
        return !zzS() || (this.zzM && !zzt());
    }

    @Override // com.google.android.gms.internal.ads.zznq
    public final boolean zzv(zzad zzadVar) {
        return zza(zzadVar) != 0;
    }
}
