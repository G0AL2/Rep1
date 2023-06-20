package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.inmobi.media.fq;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzqi extends zzgk {
    private static final byte[] zzb = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private float zzA;
    private ArrayDeque zzB;
    private zzqh zzC;
    private zzqf zzD;
    private int zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    private boolean zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private zzpy zzO;
    private long zzP;
    private int zzQ;
    private int zzR;
    private ByteBuffer zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private boolean zzX;
    private boolean zzY;
    private int zzZ;
    protected zzgl zza;
    private int zzaa;
    private int zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private long zzaf;
    private long zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private long zzak;
    private long zzal;
    private int zzam;
    private zzpj zzan;
    private zzpj zzao;
    private final zzqc zzc;
    private final zzqk zzd;
    private final float zze;
    private final zzgb zzf;
    private final zzgb zzg;
    private final zzgb zzh;
    private final zzpx zzi;
    private final zzed zzj;
    private final ArrayList zzk;
    private final MediaCodec.BufferInfo zzl;
    private final long[] zzm;
    private final long[] zzn;
    private final long[] zzo;
    private zzad zzp;
    private zzad zzq;
    private MediaCrypto zzr;
    private boolean zzs;
    private long zzt;
    private float zzu;
    private float zzv;
    private zzqd zzw;
    private zzad zzx;
    private MediaFormat zzy;
    private boolean zzz;

    public zzqi(int i10, zzqc zzqcVar, zzqk zzqkVar, boolean z10, float f10) {
        super(i10);
        this.zzc = zzqcVar;
        Objects.requireNonNull(zzqkVar);
        this.zzd = zzqkVar;
        this.zze = f10;
        this.zzf = new zzgb(0, 0);
        this.zzg = new zzgb(0, 0);
        this.zzh = new zzgb(2, 0);
        zzpx zzpxVar = new zzpx();
        this.zzi = zzpxVar;
        this.zzj = new zzed(10);
        this.zzk = new ArrayList();
        this.zzl = new MediaCodec.BufferInfo();
        this.zzu = 1.0f;
        this.zzv = 1.0f;
        this.zzt = -9223372036854775807L;
        this.zzm = new long[10];
        this.zzn = new long[10];
        this.zzo = new long[10];
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        zzpxVar.zzi(0);
        zzpxVar.zzb.order(ByteOrder.nativeOrder());
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzZ = 0;
        this.zzQ = -1;
        this.zzR = -1;
        this.zzP = -9223372036854775807L;
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        this.zzaa = 0;
        this.zzab = 0;
    }

    private final void zzT() {
        this.zzX = false;
        this.zzi.zzb();
        this.zzh.zzb();
        this.zzW = false;
        this.zzV = false;
    }

    private final void zzU() throws zzgt {
        if (this.zzac) {
            this.zzaa = 1;
            this.zzab = 3;
            return;
        }
        zzap();
        zzan();
    }

    private final void zzaA() throws zzgt {
        try {
            throw null;
        } catch (MediaCryptoException e10) {
            throw zzbg(e10, this.zzp, false, 6006);
        }
    }

    @TargetApi(23)
    private final boolean zzaB() throws zzgt {
        if (this.zzac) {
            this.zzaa = 1;
            if (this.zzG || this.zzI) {
                this.zzab = 3;
                return false;
            }
            this.zzab = 2;
        } else {
            zzaA();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    private final boolean zzaC() throws zzgt {
        zzqd zzqdVar = this.zzw;
        boolean z10 = 0;
        if (zzqdVar == null || this.zzaa == 2 || this.zzah) {
            return false;
        }
        if (this.zzQ < 0) {
            int zza = zzqdVar.zza();
            this.zzQ = zza;
            if (zza < 0) {
                return false;
            }
            this.zzg.zzb = this.zzw.zzf(zza);
            this.zzg.zzb();
        }
        if (this.zzaa == 1) {
            if (!this.zzN) {
                this.zzad = true;
                this.zzw.zzj(this.zzQ, 0, 0, 0L, 4);
                zzay();
            }
            this.zzaa = 2;
            return false;
        } else if (this.zzL) {
            this.zzL = false;
            this.zzg.zzb.put(zzb);
            this.zzw.zzj(this.zzQ, 0, 38, 0L, 0);
            zzay();
            this.zzac = true;
            return true;
        } else {
            if (this.zzZ == 1) {
                for (int i10 = 0; i10 < this.zzx.zzo.size(); i10++) {
                    this.zzg.zzb.put((byte[]) this.zzx.zzo.get(i10));
                }
                this.zzZ = 2;
            }
            int position = this.zzg.zzb.position();
            zziz zzh = zzh();
            try {
                int zzbf = zzbf(zzh, this.zzg, 0);
                if (zzG()) {
                    this.zzag = this.zzaf;
                }
                if (zzbf == -3) {
                    return false;
                }
                if (zzbf == -5) {
                    if (this.zzZ == 2) {
                        this.zzg.zzb();
                        this.zzZ = 1;
                    }
                    zzS(zzh);
                    return true;
                }
                zzgb zzgbVar = this.zzg;
                if (zzgbVar.zzg()) {
                    if (this.zzZ == 2) {
                        zzgbVar.zzb();
                        this.zzZ = 1;
                    }
                    this.zzah = true;
                    if (!this.zzac) {
                        zzax();
                        return false;
                    }
                    try {
                        if (!this.zzN) {
                            this.zzad = true;
                            this.zzw.zzj(this.zzQ, 0, 0, 0L, 4);
                            zzay();
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e10) {
                        throw zzbg(e10, this.zzp, false, zzeg.zzl(e10.getErrorCode()));
                    }
                } else if (!this.zzac && !zzgbVar.zzh()) {
                    zzgbVar.zzb();
                    if (this.zzZ == 2) {
                        this.zzZ = 1;
                    }
                    return true;
                } else {
                    boolean zzk = zzgbVar.zzk();
                    if (zzk) {
                        zzgbVar.zza.zzb(position);
                    }
                    if (this.zzF && !zzk) {
                        ByteBuffer byteBuffer = this.zzg.zzb;
                        byte[] bArr = zzzo.zza;
                        int position2 = byteBuffer.position();
                        int i11 = 0;
                        int i12 = 0;
                        while (true) {
                            int i13 = i11 + 1;
                            if (i13 < position2) {
                                int i14 = byteBuffer.get(i11) & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
                                if (i12 == 3) {
                                    if (i14 == 1) {
                                        if ((byteBuffer.get(i13) & 31) == 7) {
                                            ByteBuffer duplicate = byteBuffer.duplicate();
                                            duplicate.position(i11 - 3);
                                            duplicate.limit(position2);
                                            byteBuffer.position(0);
                                            byteBuffer.put(duplicate);
                                            break;
                                        }
                                        i14 = 1;
                                    }
                                } else if (i14 == 0) {
                                    i12++;
                                }
                                if (i14 != 0) {
                                    i12 = 0;
                                }
                                i11 = i13;
                            } else {
                                byteBuffer.clear();
                                break;
                            }
                        }
                        if (this.zzg.zzb.position() == 0) {
                            return true;
                        }
                        this.zzF = false;
                    }
                    zzgb zzgbVar2 = this.zzg;
                    long j10 = zzgbVar2.zzd;
                    zzpy zzpyVar = this.zzO;
                    if (zzpyVar != null) {
                        j10 = zzpyVar.zzb(this.zzp, zzgbVar2);
                        this.zzaf = Math.max(this.zzaf, this.zzO.zza(this.zzp));
                    }
                    long j11 = j10;
                    if (this.zzg.zzf()) {
                        this.zzk.add(Long.valueOf(j11));
                    }
                    if (this.zzaj) {
                        this.zzj.zzd(j11, this.zzp);
                        this.zzaj = false;
                    }
                    this.zzaf = Math.max(this.zzaf, j11);
                    this.zzg.zzj();
                    zzgb zzgbVar3 = this.zzg;
                    if (zzgbVar3.zze()) {
                        zzam(zzgbVar3);
                    }
                    zzad(this.zzg);
                    try {
                        if (zzk) {
                            this.zzw.zzk(this.zzQ, 0, this.zzg.zza, j11, 0);
                        } else {
                            this.zzw.zzj(this.zzQ, 0, this.zzg.zzb.limit(), j11, 0);
                        }
                        zzay();
                        this.zzac = true;
                        this.zzZ = 0;
                        zzgl zzglVar = this.zza;
                        z10 = zzglVar.zzc + 1;
                        zzglVar.zzc = z10;
                        return true;
                    } catch (MediaCodec.CryptoException e11) {
                        throw zzbg(e11, this.zzp, z10, zzeg.zzl(e11.getErrorCode()));
                    }
                }
            } catch (zzga e12) {
                zzX(e12);
                zzaE(0);
                zzab();
                return true;
            }
        }
    }

    private final boolean zzaD() {
        return this.zzR >= 0;
    }

    private final boolean zzaE(int i10) throws zzgt {
        zziz zzh = zzh();
        this.zzf.zzb();
        int zzbf = zzbf(zzh, this.zzf, i10 | 4);
        if (zzbf == -5) {
            zzS(zzh);
            return true;
        } else if (zzbf == -4 && this.zzf.zzg()) {
            this.zzah = true;
            zzax();
            return false;
        } else {
            return false;
        }
    }

    private final boolean zzaF(long j10) {
        return this.zzt == -9223372036854775807L || SystemClock.elapsedRealtime() - j10 < this.zzt;
    }

    private final boolean zzaG(zzad zzadVar) throws zzgt {
        if (zzeg.zza >= 23 && this.zzw != null && this.zzab != 3 && zzbe() != 0) {
            float zzP = zzP(this.zzv, zzadVar, zzJ());
            float f10 = this.zzA;
            if (f10 == zzP) {
                return true;
            }
            if (zzP == -1.0f) {
                zzU();
                return false;
            } else if (f10 == -1.0f && zzP <= this.zze) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", zzP);
                this.zzw.zzp(bundle);
                this.zzA = zzP;
            }
        }
        return true;
    }

    private final void zzab() {
        try {
            this.zzw.zzi();
        } finally {
            zzaq();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean zzav(zzad zzadVar) {
        return zzadVar.zzF == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0196, code lost:
        if ("stvm8".equals(r5) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a6, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzaw(com.google.android.gms.internal.ads.zzqf r17, android.media.MediaCrypto r18) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqi.zzaw(com.google.android.gms.internal.ads.zzqf, android.media.MediaCrypto):void");
    }

    @TargetApi(23)
    private final void zzax() throws zzgt {
        int i10 = this.zzab;
        if (i10 == 1) {
            zzab();
        } else if (i10 == 2) {
            zzab();
            zzaA();
        } else if (i10 != 3) {
            this.zzai = true;
            zzae();
        } else {
            zzap();
            zzan();
        }
    }

    private final void zzay() {
        this.zzQ = -1;
        this.zzg.zzb = null;
    }

    private final void zzaz() {
        this.zzR = -1;
        this.zzS = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgk, com.google.android.gms.internal.ads.zzjt
    public void zzD(float f10, float f11) throws zzgt {
        this.zzu = f10;
        this.zzv = f11;
        zzaG(this.zzx);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:124|(5:(6:126|(1:216)(2:130|131)|(2:133|(2:135|(1:156)(1:141))(3:157|158|(1:165)(0)))(2:166|(1:168)(2:169|(12:175|(1:177)|178|(2:180|(2:184|(1:186)))|187|(1:(2:189|(2:192|193)(1:191))(2:210|211))|194|(1:196)(1:209)|197|(1:201)|(1:203)(2:205|(1:207))|204)(2:173|174)))|142|143|(2:146|147)(1:145))|(3:219|220|(6:222|223|224|225|226|(3:228|229|(2:232|233)(3:231|143|(0)(0)))(2:235|236)))|261|262|(0)(0))|217|258|259|260) */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0260, code lost:
        if (r15.zzq != null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x032d, code lost:
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x030e A[LOOP:2: B:72:0x0139->B:180:0x030e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031e A[Catch: IllegalStateException -> 0x034f, TryCatch #0 {IllegalStateException -> 0x034f, blocks: (B:177:0x0307, B:182:0x0318, B:184:0x031e, B:186:0x0324, B:173:0x02ef, B:175:0x0301, B:193:0x0335), top: B:227:0x012c }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x030d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    @Override // com.google.android.gms.internal.ads.zzjt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzL(long r24, long r26) throws com.google.android.gms.internal.ads.zzgt {
        /*
            Method dump skipped, instructions count: 929
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqi.zzL(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public boolean zzM() {
        return this.zzai;
    }

    @Override // com.google.android.gms.internal.ads.zzjt
    public boolean zzN() {
        if (this.zzp != null) {
            if (zzI() || zzaD()) {
                return true;
            }
            if (this.zzP != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzP) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzju
    public final int zzO(zzad zzadVar) throws zzgt {
        try {
            return zzQ(this.zzd, zzadVar);
        } catch (zzqr e10) {
            throw zzbg(e10, zzadVar, false, 4002);
        }
    }

    protected float zzP(float f10, zzad zzadVar, zzad[] zzadVarArr) {
        throw null;
    }

    protected abstract int zzQ(zzqk zzqkVar, zzad zzadVar) throws zzqr;

    protected zzgm zzR(zzqf zzqfVar, zzad zzadVar, zzad zzadVar2) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
        if (zzaB() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0087, code lost:
        if (zzaB() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009b, code lost:
        if (zzaB() == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.gms.internal.ads.zzgm zzS(com.google.android.gms.internal.ads.zziz r13) throws com.google.android.gms.internal.ads.zzgt {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqi.zzS(com.google.android.gms.internal.ads.zziz):com.google.android.gms.internal.ads.zzgm");
    }

    protected abstract zzqb zzV(zzqf zzqfVar, zzad zzadVar, MediaCrypto mediaCrypto, float f10);

    protected abstract List zzW(zzqk zzqkVar, zzad zzadVar, boolean z10) throws zzqr;

    protected void zzX(Exception exc) {
        throw null;
    }

    protected void zzY(String str, zzqb zzqbVar, long j10, long j11) {
        throw null;
    }

    protected void zzZ(String str) {
        throw null;
    }

    protected void zzaa(zzad zzadVar, MediaFormat mediaFormat) throws zzgt {
        throw null;
    }

    protected void zzac() {
    }

    protected void zzad(zzgb zzgbVar) throws zzgt {
        throw null;
    }

    protected void zzae() throws zzgt {
    }

    protected abstract boolean zzaf(long j10, long j11, zzqd zzqdVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzad zzadVar) throws zzgt;

    protected boolean zzag(zzad zzadVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float zzah() {
        return this.zzu;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzai() {
        return this.zzal;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzqd zzaj() {
        return this.zzw;
    }

    protected zzqe zzak(Throwable th, zzqf zzqfVar) {
        return new zzqe(th, zzqfVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzqf zzal() {
        return this.zzD;
    }

    protected void zzam(zzgb zzgbVar) throws zzgt {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6 A[Catch: zzqh -> 0x0119, TryCatch #1 {zzqh -> 0x0119, blocks: (B:30:0x0065, B:33:0x006a, B:35:0x0080, B:36:0x008b, B:41:0x009a, B:43:0x00a2, B:44:0x00aa, B:46:0x00ae, B:57:0x00d6, B:59:0x00f6, B:61:0x00ff, B:64:0x0108, B:65:0x010a, B:60:0x00f9, B:66:0x010b, B:68:0x010e, B:69:0x0118, B:39:0x008f, B:40:0x0099, B:54:0x00c6, B:55:0x00d4, B:49:0x00bd), top: B:76:0x0065, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f9 A[Catch: zzqh -> 0x0119, TryCatch #1 {zzqh -> 0x0119, blocks: (B:30:0x0065, B:33:0x006a, B:35:0x0080, B:36:0x008b, B:41:0x009a, B:43:0x00a2, B:44:0x00aa, B:46:0x00ae, B:57:0x00d6, B:59:0x00f6, B:61:0x00ff, B:64:0x0108, B:65:0x010a, B:60:0x00f9, B:66:0x010b, B:68:0x010e, B:69:0x0118, B:39:0x008f, B:40:0x0099, B:54:0x00c6, B:55:0x00d4, B:49:0x00bd), top: B:76:0x0065, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0108 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzan() throws com.google.android.gms.internal.ads.zzgt {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqi.zzan():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzao(long j10) {
        while (true) {
            int i10 = this.zzam;
            if (i10 == 0 || j10 < this.zzo[0]) {
                return;
            }
            long[] jArr = this.zzm;
            this.zzak = jArr[0];
            this.zzal = this.zzn[0];
            int i11 = i10 - 1;
            this.zzam = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.zzn;
            System.arraycopy(jArr2, 1, jArr2, 0, this.zzam);
            long[] jArr3 = this.zzo;
            System.arraycopy(jArr3, 1, jArr3, 0, this.zzam);
            zzac();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.zzpj, android.media.MediaCrypto, com.google.android.gms.internal.ads.zzqd] */
    public final void zzap() {
        try {
            zzqd zzqdVar = this.zzw;
            if (zzqdVar != null) {
                zzqdVar.zzl();
                this.zza.zzb++;
                zzZ(this.zzD.zza);
            }
        } finally {
            this.zzw = null;
            this.zzr = null;
            this.zzan = null;
            zzar();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzaq() {
        zzay();
        zzaz();
        this.zzP = -9223372036854775807L;
        this.zzad = false;
        this.zzac = false;
        this.zzL = false;
        this.zzM = false;
        this.zzT = false;
        this.zzU = false;
        this.zzk.clear();
        this.zzaf = -9223372036854775807L;
        this.zzag = -9223372036854775807L;
        zzpy zzpyVar = this.zzO;
        if (zzpyVar != null) {
            zzpyVar.zzc();
        }
        this.zzaa = 0;
        this.zzab = 0;
        this.zzZ = this.zzY ? 1 : 0;
    }

    protected final void zzar() {
        zzaq();
        this.zzO = null;
        this.zzB = null;
        this.zzD = null;
        this.zzx = null;
        this.zzy = null;
        this.zzz = false;
        this.zzae = false;
        this.zzA = -1.0f;
        this.zzE = 0;
        this.zzF = false;
        this.zzG = false;
        this.zzH = false;
        this.zzI = false;
        this.zzJ = false;
        this.zzK = false;
        this.zzN = false;
        this.zzY = false;
        this.zzZ = 0;
        this.zzs = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzas() throws zzgt {
        boolean zzat = zzat();
        if (zzat) {
            zzan();
        }
        return zzat;
    }

    protected final boolean zzat() {
        if (this.zzw == null) {
            return false;
        }
        if (this.zzab != 3 && !this.zzG && ((!this.zzH || this.zzae) && (!this.zzI || !this.zzad))) {
            zzab();
            return false;
        }
        zzap();
        return true;
    }

    protected boolean zzau(zzqf zzqfVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgk, com.google.android.gms.internal.ads.zzju
    public final int zze() {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgk
    public void zzs() {
        this.zzp = null;
        this.zzak = -9223372036854775807L;
        this.zzal = -9223372036854775807L;
        this.zzam = 0;
        zzat();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgk
    public void zzt(boolean z10, boolean z11) throws zzgt {
        this.zza = new zzgl();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgk
    public void zzu(long j10, boolean z10) throws zzgt {
        this.zzah = false;
        this.zzai = false;
        if (this.zzV) {
            this.zzi.zzb();
            this.zzh.zzb();
            this.zzW = false;
        } else {
            zzas();
        }
        zzed zzedVar = this.zzj;
        if (zzedVar.zza() > 0) {
            this.zzaj = true;
        }
        zzedVar.zze();
        int i10 = this.zzam;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.zzal = this.zzn[i11];
            this.zzak = this.zzm[i11];
            this.zzam = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzgk
    public void zzv() {
        try {
            zzT();
            zzap();
        } finally {
            this.zzao = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final void zzy(zzad[] zzadVarArr, long j10, long j11) throws zzgt {
        if (this.zzal == -9223372036854775807L) {
            zzcw.zzf(this.zzak == -9223372036854775807L);
            this.zzak = j10;
            this.zzal = j11;
            return;
        }
        int i10 = this.zzam;
        if (i10 == 10) {
            Log.w("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.zzn[9]);
        } else {
            this.zzam = i10 + 1;
        }
        long[] jArr = this.zzm;
        int i11 = this.zzam - 1;
        jArr[i11] = j10;
        this.zzn[i11] = j11;
        this.zzo[i11] = this.zzaf;
    }
}
