package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzatb {
    private Method zzA;
    private int zzB;
    private long zzC;
    private long zzD;
    private int zzE;
    private long zzF;
    private long zzG;
    private int zzH;
    private int zzI;
    private long zzJ;
    private long zzK;
    private long zzL;
    private float zzM;
    private zzasi[] zzN;
    private ByteBuffer[] zzO;
    private ByteBuffer zzP;
    private ByteBuffer zzQ;
    private byte[] zzR;
    private int zzS;
    private int zzT;
    private boolean zzU;
    private boolean zzV;
    private int zzW;
    private boolean zzX;
    private long zzY;
    private final zzatc zza;
    private final zzati zzb;
    private final zzasi[] zzc;
    private final zzasx zzd;
    private final ConditionVariable zze = new ConditionVariable(true);
    private final long[] zzf;
    private final zzast zzg;
    private final LinkedList zzh;
    private AudioTrack zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private int zzo;
    private long zzp;
    private zzarx zzq;
    private zzarx zzr;
    private long zzs;
    private long zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private long zzx;
    private boolean zzy;
    private long zzz;

    public zzatb(zzasg zzasgVar, zzasi[] zzasiVarArr, zzasx zzasxVar) {
        this.zzd = zzasxVar;
        if (zzazo.zza >= 18) {
            try {
                this.zzA = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        if (zzazo.zza >= 19) {
            this.zzg = new zzasu();
        } else {
            this.zzg = new zzast(null);
        }
        zzatc zzatcVar = new zzatc();
        this.zza = zzatcVar;
        zzati zzatiVar = new zzati();
        this.zzb = zzatiVar;
        this.zzc = r1;
        System.arraycopy(zzasiVarArr, 0, r1, 2, 0);
        zzasi[] zzasiVarArr2 = {new zzatg(), zzatcVar, zzatiVar};
        this.zzf = new long[10];
        this.zzM = 1.0f;
        this.zzI = 0;
        this.zzW = 0;
        this.zzr = zzarx.zza;
        this.zzT = -1;
        this.zzN = new zzasi[0];
        this.zzO = new ByteBuffer[0];
        this.zzh = new LinkedList();
    }

    private final long zzp(long j10) {
        return (j10 * this.zzj) / 1000000;
    }

    private final long zzq(long j10) {
        return (j10 * 1000000) / this.zzj;
    }

    private final long zzr() {
        return this.zzn ? this.zzG : this.zzF / this.zzE;
    }

    private final void zzs(long j10) throws zzata {
        ByteBuffer byteBuffer;
        int length = this.zzN.length;
        int i10 = length;
        while (i10 >= 0) {
            if (i10 > 0) {
                byteBuffer = this.zzO[i10 - 1];
            } else {
                byteBuffer = this.zzP;
                if (byteBuffer == null) {
                    byteBuffer = zzasi.zza;
                }
            }
            if (i10 == length) {
                zzz(byteBuffer, j10);
            } else {
                zzasi zzasiVar = this.zzN[i10];
                zzasiVar.zzf(byteBuffer);
                ByteBuffer zzc = zzasiVar.zzc();
                this.zzO[i10] = zzc;
                if (zzc.hasRemaining()) {
                    i10++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            }
            i10--;
        }
    }

    private final void zzt() {
        ArrayList arrayList = new ArrayList();
        zzasi[] zzasiVarArr = this.zzc;
        for (int i10 = 0; i10 < 3; i10++) {
            zzasi zzasiVar = zzasiVarArr[i10];
            if (zzasiVar.zzi()) {
                arrayList.add(zzasiVar);
            } else {
                zzasiVar.zzd();
            }
        }
        int size = arrayList.size();
        this.zzN = (zzasi[]) arrayList.toArray(new zzasi[size]);
        this.zzO = new ByteBuffer[size];
        for (int i11 = 0; i11 < size; i11++) {
            zzasi zzasiVar2 = this.zzN[i11];
            zzasiVar2.zzd();
            this.zzO[i11] = zzasiVar2.zzc();
        }
    }

    private final void zzu() {
        this.zzw = 0L;
        this.zzv = 0;
        this.zzu = 0;
        this.zzx = 0L;
        this.zzy = false;
        this.zzz = 0L;
    }

    private final void zzv() {
        if (zzx()) {
            if (zzazo.zza >= 21) {
                this.zzi.setVolume(this.zzM);
                return;
            }
            AudioTrack audioTrack = this.zzi;
            float f10 = this.zzM;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0032 -> B:9:0x0012). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzw() throws com.google.android.gms.internal.ads.zzata {
        /*
            r9 = this;
            int r0 = r9.zzT
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L14
            boolean r0 = r9.zzn
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.ads.zzasi[] r0 = r9.zzN
            int r0 = r0.length
            goto L10
        Lf:
            r0 = 0
        L10:
            r9.zzT = r0
        L12:
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            int r4 = r9.zzT
            com.google.android.gms.internal.ads.zzasi[] r5 = r9.zzN
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L38
            r4 = r5[r4]
            if (r0 == 0) goto L28
            r4.zze()
        L28:
            r9.zzs(r7)
            boolean r0 = r4.zzj()
            if (r0 != 0) goto L32
            return r3
        L32:
            int r0 = r9.zzT
            int r0 = r0 + r2
            r9.zzT = r0
            goto L12
        L38:
            java.nio.ByteBuffer r0 = r9.zzQ
            if (r0 == 0) goto L44
            r9.zzz(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzQ
            if (r0 == 0) goto L44
            return r3
        L44:
            r9.zzT = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatb.zzw():boolean");
    }

    private final boolean zzx() {
        return this.zzi != null;
    }

    private final boolean zzy() {
        int i10;
        return zzazo.zza < 23 && ((i10 = this.zzm) == 5 || i10 == 6);
    }

    private final boolean zzz(ByteBuffer byteBuffer, long j10) throws zzata {
        int write;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzQ;
            if (byteBuffer2 != null) {
                zzayz.zzc(byteBuffer2 == byteBuffer);
            } else {
                this.zzQ = byteBuffer;
                if (zzazo.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzR;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzR = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzR, 0, remaining);
                    byteBuffer.position(position);
                    this.zzS = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (zzazo.zza < 21) {
                int zza = this.zzo - ((int) (this.zzF - (this.zzg.zza() * this.zzE)));
                if (zza > 0) {
                    write = this.zzi.write(this.zzR, this.zzS, Math.min(remaining2, zza));
                    if (write > 0) {
                        this.zzS += write;
                        byteBuffer.position(byteBuffer.position() + write);
                    }
                } else {
                    write = 0;
                }
            } else {
                write = this.zzi.write(byteBuffer, remaining2, 1);
            }
            this.zzY = SystemClock.elapsedRealtime();
            if (write >= 0) {
                boolean z10 = this.zzn;
                if (!z10) {
                    this.zzF += write;
                }
                if (write == remaining2) {
                    if (z10) {
                        this.zzG += this.zzH;
                    }
                    this.zzQ = null;
                    return true;
                }
                return false;
            }
            throw new zzata(write);
        }
        return true;
    }

    public final long zza(boolean z10) {
        long zzb;
        long j10;
        long j11;
        zzarx zzarxVar;
        long j12;
        long j13;
        Method method;
        if (!zzx() || this.zzI == 0) {
            return Long.MIN_VALUE;
        }
        if (this.zzi.getPlayState() == 3) {
            long zzb2 = this.zzg.zzb();
            if (zzb2 != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - this.zzx >= 30000) {
                    long[] jArr = this.zzf;
                    int i10 = this.zzu;
                    jArr[i10] = zzb2 - nanoTime;
                    this.zzu = (i10 + 1) % 10;
                    int i11 = this.zzv;
                    if (i11 < 10) {
                        this.zzv = i11 + 1;
                    }
                    this.zzx = nanoTime;
                    this.zzw = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.zzv;
                        if (i12 >= i13) {
                            break;
                        }
                        this.zzw += this.zzf[i12] / i13;
                        i12++;
                    }
                }
                if (!zzy() && nanoTime - this.zzz >= 500000) {
                    boolean zzh = this.zzg.zzh();
                    this.zzy = zzh;
                    if (zzh) {
                        long zzd = this.zzg.zzd() / 1000;
                        long zzc = this.zzg.zzc();
                        if (zzd < this.zzK) {
                            this.zzy = false;
                        } else if (Math.abs(zzd - nanoTime) > 5000000) {
                            Log.w("AudioTrack", "Spurious audio timestamp (system clock mismatch): " + zzc + ", " + zzd + ", " + nanoTime + ", " + zzb2);
                            this.zzy = false;
                        } else if (Math.abs(zzq(zzc) - zzb2) > 5000000) {
                            Log.w("AudioTrack", "Spurious audio timestamp (frame position mismatch): " + zzc + ", " + zzd + ", " + nanoTime + ", " + zzb2);
                            this.zzy = false;
                        }
                    }
                    if (this.zzA != null && !this.zzn) {
                        try {
                            long intValue = (((Integer) method.invoke(this.zzi, null)).intValue() * 1000) - this.zzp;
                            this.zzL = intValue;
                            long max = Math.max(intValue, 0L);
                            this.zzL = max;
                            if (max > 5000000) {
                                Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + max);
                                this.zzL = 0L;
                            }
                        } catch (Exception unused) {
                            this.zzA = null;
                        }
                    }
                    this.zzz = nanoTime;
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        if (this.zzy) {
            zzb = zzq(this.zzg.zzc() + zzp(nanoTime2 - (this.zzg.zzd() / 1000)));
        } else {
            zzb = this.zzv == 0 ? this.zzg.zzb() : nanoTime2 + this.zzw;
            if (!z10) {
                zzb -= this.zzL;
            }
        }
        long j14 = this.zzJ;
        while (!this.zzh.isEmpty()) {
            j11 = ((zzasz) this.zzh.getFirst()).zzc;
            if (zzb < j11) {
                break;
            }
            zzasz zzaszVar = (zzasz) this.zzh.remove();
            zzarxVar = zzaszVar.zza;
            this.zzr = zzarxVar;
            j12 = zzaszVar.zzc;
            this.zzt = j12;
            j13 = zzaszVar.zzb;
            this.zzs = j13 - this.zzJ;
        }
        if (this.zzr.zzb == 1.0f) {
            j10 = (zzb + this.zzs) - this.zzt;
        } else {
            if (this.zzh.isEmpty()) {
                zzati zzatiVar = this.zzb;
                if (zzatiVar.zzn() >= 1024) {
                    j10 = zzazo.zzj(zzb - this.zzt, zzatiVar.zzm(), zzatiVar.zzn()) + this.zzs;
                }
            }
            j10 = ((long) (this.zzr.zzb * (zzb - this.zzt))) + this.zzs;
        }
        return j14 + j10;
    }

    public final zzarx zzc() {
        return this.zzr;
    }

    public final zzarx zzd(zzarx zzarxVar) {
        if (this.zzn) {
            zzarx zzarxVar2 = zzarx.zza;
            this.zzr = zzarxVar2;
            return zzarxVar2;
        }
        float zzl = this.zzb.zzl(zzarxVar.zzb);
        this.zzb.zzk(1.0f);
        zzarx zzarxVar3 = new zzarx(zzl, 1.0f);
        zzarx zzarxVar4 = this.zzq;
        if (zzarxVar4 == null) {
            if (!this.zzh.isEmpty()) {
                zzarxVar4 = ((zzasz) this.zzh.getLast()).zza;
            } else {
                zzarxVar4 = this.zzr;
            }
        }
        if (!zzarxVar3.equals(zzarxVar4)) {
            if (zzx()) {
                this.zzq = zzarxVar3;
            } else {
                this.zzr = zzarxVar3;
            }
        }
        return this.zzr;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(java.lang.String r7, int r8, int r9, int r10, int r11, int[] r12) throws com.google.android.gms.internal.ads.zzasv {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatb.zze(java.lang.String, int, int, int, int, int[]):void");
    }

    public final void zzf() {
        if (this.zzI == 1) {
            this.zzI = 2;
        }
    }

    public final void zzg() {
        this.zzV = false;
        if (zzx()) {
            zzu();
            this.zzg.zzf();
        }
    }

    public final void zzh() {
        this.zzV = true;
        if (zzx()) {
            this.zzK = System.nanoTime() / 1000;
            this.zzi.play();
        }
    }

    public final void zzi() throws zzata {
        if (!this.zzU && zzx() && zzw()) {
            this.zzg.zze(zzr());
            this.zzU = true;
        }
    }

    public final void zzj() {
        zzk();
        zzasi[] zzasiVarArr = this.zzc;
        for (int i10 = 0; i10 < 3; i10++) {
            zzasiVarArr[i10].zzg();
        }
        this.zzW = 0;
        this.zzV = false;
    }

    public final void zzk() {
        zzarx zzarxVar;
        if (zzx()) {
            this.zzC = 0L;
            this.zzD = 0L;
            this.zzF = 0L;
            this.zzG = 0L;
            this.zzH = 0;
            zzarx zzarxVar2 = this.zzq;
            if (zzarxVar2 != null) {
                this.zzr = zzarxVar2;
                this.zzq = null;
            } else if (!this.zzh.isEmpty()) {
                zzarxVar = ((zzasz) this.zzh.getLast()).zza;
                this.zzr = zzarxVar;
            }
            this.zzh.clear();
            this.zzs = 0L;
            this.zzt = 0L;
            this.zzP = null;
            this.zzQ = null;
            int i10 = 0;
            while (true) {
                zzasi[] zzasiVarArr = this.zzN;
                if (i10 >= zzasiVarArr.length) {
                    break;
                }
                zzasi zzasiVar = zzasiVarArr[i10];
                zzasiVar.zzd();
                this.zzO[i10] = zzasiVar.zzc();
                i10++;
            }
            this.zzU = false;
            this.zzT = -1;
            this.zzI = 0;
            this.zzL = 0L;
            zzu();
            if (this.zzi.getPlayState() == 3) {
                this.zzi.pause();
            }
            AudioTrack audioTrack = this.zzi;
            this.zzi = null;
            this.zzg.zzg(null, false);
            this.zze.close();
            new zzasr(this, audioTrack).start();
        }
    }

    public final void zzl(float f10) {
        if (this.zzM != f10) {
            this.zzM = f10;
            zzv();
        }
    }

    public final boolean zzm(ByteBuffer byteBuffer, long j10) throws zzasw, zzata {
        int i10;
        zzasp zzaspVar;
        zzasp zzaspVar2;
        ByteBuffer byteBuffer2 = this.zzP;
        zzayz.zzc(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!zzx()) {
            this.zze.block();
            int i11 = this.zzW;
            if (i11 == 0) {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1);
            } else {
                this.zzi = new AudioTrack(3, this.zzj, this.zzk, this.zzm, this.zzo, 1, i11);
            }
            int state = this.zzi.getState();
            if (state == 1) {
                int audioSessionId = this.zzi.getAudioSessionId();
                if (this.zzW != audioSessionId) {
                    this.zzW = audioSessionId;
                    zzaspVar2 = ((zzate) this.zzd).zza.zzb;
                    zzaspVar2.zzb(audioSessionId);
                }
                this.zzg.zzg(this.zzi, zzy());
                zzv();
                this.zzX = false;
                if (this.zzV) {
                    zzh();
                }
            } else {
                try {
                    this.zzi.release();
                } catch (Exception unused) {
                } finally {
                    this.zzi = null;
                }
                throw new zzasw(state, this.zzj, this.zzk, this.zzo);
            }
        }
        if (zzy()) {
            if (this.zzi.getPlayState() == 2) {
                this.zzX = false;
                return false;
            } else if (this.zzi.getPlayState() == 1 && this.zzg.zza() != 0) {
                return false;
            }
        }
        boolean z10 = this.zzX;
        boolean zzn = zzn();
        this.zzX = zzn;
        if (z10 && !zzn && this.zzi.getPlayState() != 1) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = this.zzY;
            zzasx zzasxVar = this.zzd;
            int i12 = this.zzo;
            long zzb = zzare.zzb(this.zzp);
            zzaspVar = ((zzate) zzasxVar).zza.zzb;
            zzaspVar.zzc(i12, zzb, elapsedRealtime - j11);
        }
        if (this.zzP == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.zzn && this.zzH == 0) {
                int i13 = this.zzm;
                if (i13 == 7 || i13 == 8) {
                    int position = byteBuffer.position();
                    i10 = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i13 == 5) {
                    int i14 = zzasf.zza;
                    i10 = 1536;
                } else if (i13 == 6) {
                    i10 = zzasf.zza(byteBuffer);
                } else {
                    throw new IllegalStateException("Unexpected audio encoding: " + i13);
                }
                this.zzH = i10;
            }
            if (this.zzq != null) {
                if (!zzw()) {
                    return false;
                }
                this.zzh.add(new zzasz(this.zzq, Math.max(0L, j10), zzq(zzr()), null));
                this.zzq = null;
                zzt();
            }
            if (this.zzI == 0) {
                this.zzJ = Math.max(0L, j10);
                this.zzI = 1;
            } else {
                long zzq = this.zzJ + zzq(this.zzn ? this.zzD : this.zzC / this.zzB);
                if (this.zzI == 1 && Math.abs(zzq - j10) > 200000) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + zzq + ", got " + j10 + "]");
                    this.zzI = 2;
                }
                if (this.zzI == 2) {
                    this.zzJ += j10 - zzq;
                    this.zzI = 1;
                    ((zzate) this.zzd).zza.zzh = true;
                }
            }
            if (this.zzn) {
                this.zzD += this.zzH;
            } else {
                this.zzC += byteBuffer.remaining();
            }
            this.zzP = byteBuffer;
        }
        if (this.zzn) {
            zzz(this.zzP, j10);
        } else {
            zzs(j10);
        }
        if (this.zzP.hasRemaining()) {
            return false;
        }
        this.zzP = null;
        return true;
    }

    public final boolean zzn() {
        if (zzx()) {
            if (zzr() > this.zzg.zza()) {
                return true;
            }
            if (zzy() && this.zzi.getPlayState() == 2 && this.zzi.getPlaybackHeadPosition() == 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean zzo() {
        return !zzx() || (this.zzU && !zzn());
    }
}
