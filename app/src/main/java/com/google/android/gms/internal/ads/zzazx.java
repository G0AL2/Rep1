package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzazx extends zzavr {
    private int zzA;
    private final Context zzb;
    private final zzazz zzc;
    private final zzbah zzd;
    private final boolean zze;
    private final long[] zzf;
    private zzart[] zzg;
    private zzazw zzh;
    private Surface zzi;
    private Surface zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private float zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private float zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private float zzy;
    private long zzz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzazx(Context context, zzavt zzavtVar, long j10, Handler handler, zzbai zzbaiVar, int i10) {
        super(2, zzavtVar, null, false);
        boolean z10 = false;
        this.zzb = context.getApplicationContext();
        this.zzc = new zzazz(context);
        this.zzd = new zzbah(handler, zzbaiVar);
        if (zzazo.zza <= 22 && "foster".equals(zzazo.zzb) && "NVIDIA".equals(zzazo.zzc)) {
            z10 = true;
        }
        this.zze = z10;
        this.zzf = new long[10];
        this.zzz = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
        this.zzr = -1;
        this.zzs = -1;
        this.zzu = -1.0f;
        this.zzq = -1.0f;
        zzab();
    }

    private static int zzN(zzart zzartVar) {
        int i10 = zzartVar.zzm;
        if (i10 == -1) {
            return 0;
        }
        return i10;
    }

    private final void zzab() {
        this.zzv = -1;
        this.zzw = -1;
        this.zzy = -1.0f;
        this.zzx = -1;
    }

    private final void zzac() {
        if (this.zzn > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zzd.zzd(this.zzn, elapsedRealtime - this.zzm);
            this.zzn = 0;
            this.zzm = elapsedRealtime;
        }
    }

    private final void zzad() {
        int i10 = this.zzv;
        int i11 = this.zzr;
        if (i10 == i11 && this.zzw == this.zzs && this.zzx == this.zzt && this.zzy == this.zzu) {
            return;
        }
        this.zzd.zzh(i11, this.zzs, this.zzt, this.zzu);
        this.zzv = this.zzr;
        this.zzw = this.zzs;
        this.zzx = this.zzt;
        this.zzy = this.zzu;
    }

    private final void zzae() {
        if (this.zzv == -1 && this.zzw == -1) {
            return;
        }
        this.zzd.zzh(this.zzr, this.zzs, this.zzt, this.zzu);
    }

    private static boolean zzaf(long j10) {
        return j10 < -30000;
    }

    private final boolean zzag(boolean z10) {
        return zzazo.zza >= 23 && (!z10 || zzazu.zzb(this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzary
    public final boolean zzF() {
        Surface surface;
        if (super.zzF() && (this.zzk || (((surface = this.zzj) != null && this.zzi == surface) || zzU() == null))) {
            this.zzl = -9223372036854775807L;
            return true;
        } else if (this.zzl == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.zzl) {
                return true;
            }
            this.zzl = -9223372036854775807L;
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    protected final int zzH(zzavt zzavtVar, zzart zzartVar) throws zzavw {
        boolean z10;
        int i10;
        int i11;
        String str = zzartVar.zzf;
        if (zzaze.zzb(str)) {
            zzats zzatsVar = zzartVar.zzi;
            if (zzatsVar != null) {
                z10 = false;
                for (int i12 = 0; i12 < zzatsVar.zza; i12++) {
                    z10 |= zzatsVar.zza(i12).zzc;
                }
            } else {
                z10 = false;
            }
            zzavp zzc = zzawb.zzc(str, z10);
            if (zzc == null) {
                return 1;
            }
            boolean zze = zzc.zze(zzartVar.zzc);
            if (zze && (i10 = zzartVar.zzj) > 0 && (i11 = zzartVar.zzk) > 0) {
                if (zzazo.zza >= 21) {
                    zze = zzc.zzf(i10, i11, zzartVar.zzl);
                } else {
                    zze = i10 * i11 <= zzawb.zza();
                    if (!zze) {
                        int i13 = zzartVar.zzj;
                        int i14 = zzartVar.zzk;
                        String str2 = zzazo.zze;
                        Log.d("MediaCodecVideoRenderer", "FalseCheck [legacyFrameSize, " + i13 + "x" + i14 + "] [" + str2 + "]");
                    }
                }
            }
            return (true != zze ? 2 : 3) | (true != zzc.zzb ? 4 : 8) | (true == zzc.zzc ? 16 : 0);
        }
        return 0;
    }

    final void zzI() {
        if (this.zzk) {
            return;
        }
        this.zzk = true;
        this.zzd.zzg(this.zzi);
    }

    protected final void zzJ(MediaCodec mediaCodec, int i10, long j10) {
        zzad();
        zzazm.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, true);
        zzazm.zzb();
        ((zzavr) this).zza.zzd++;
        this.zzo = 0;
        zzI();
    }

    @TargetApi(21)
    protected final void zzK(MediaCodec mediaCodec, int i10, long j10, long j11) {
        zzad();
        zzazm.zza("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i10, j11);
        zzazm.zzb();
        ((zzavr) this).zza.zzd++;
        this.zzo = 0;
        zzI();
    }

    protected final void zzL(MediaCodec mediaCodec, int i10, long j10) {
        zzazm.zza("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i10, false);
        zzazm.zzb();
        ((zzavr) this).zza.zze++;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzavr
    protected final void zzO(zzavp zzavpVar, MediaCodec mediaCodec, zzart zzartVar, MediaCrypto mediaCrypto) throws zzavw {
        char c10;
        int i10;
        zzart[] zzartVarArr = this.zzg;
        int i11 = zzartVar.zzj;
        int i12 = zzartVar.zzk;
        int i13 = zzartVar.zzg;
        if (i13 == -1) {
            String str = zzartVar.zzf;
            if (i11 != -1 && i12 != -1) {
                int i14 = 4;
                switch (str.hashCode()) {
                    case -1664118616:
                        if (str.equals("video/3gpp")) {
                            c10 = 0;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case -1662541442:
                        if (str.equals("video/hevc")) {
                            c10 = 4;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1187890754:
                        if (str.equals("video/mp4v-es")) {
                            c10 = 1;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1331836730:
                        if (str.equals("video/avc")) {
                            c10 = 2;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1599127256:
                        if (str.equals("video/x-vnd.on2.vp8")) {
                            c10 = 3;
                            break;
                        }
                        c10 = 65535;
                        break;
                    case 1599127257:
                        if (str.equals("video/x-vnd.on2.vp9")) {
                            c10 = 5;
                            break;
                        }
                        c10 = 65535;
                        break;
                    default:
                        c10 = 65535;
                        break;
                }
                if (c10 != 0 && c10 != 1) {
                    if (c10 != 2) {
                        if (c10 != 3) {
                            if (c10 == 4 || c10 == 5) {
                                i10 = i11 * i12;
                                i13 = (i10 * 3) / (i14 + i14);
                            }
                        }
                    } else if (!"BRAVIA 4K 2015".equals(zzazo.zzd)) {
                        i10 = zzazo.zzd(i11, 16) * zzazo.zzd(i12, 16) * 256;
                        i14 = 2;
                        i13 = (i10 * 3) / (i14 + i14);
                    }
                }
                i10 = i11 * i12;
                i14 = 2;
                i13 = (i10 * 3) / (i14 + i14);
            }
            i13 = -1;
        }
        int length = zzartVarArr.length;
        zzazw zzazwVar = new zzazw(i11, i12, i13);
        this.zzh = zzazwVar;
        boolean z10 = this.zze;
        MediaFormat zzb = zzartVar.zzb();
        zzb.setInteger("max-width", zzazwVar.zza);
        zzb.setInteger("max-height", zzazwVar.zzb);
        int i15 = zzazwVar.zzc;
        if (i15 != -1) {
            zzb.setInteger("max-input-size", i15);
        }
        if (z10) {
            zzb.setInteger("auto-frc", 0);
        }
        if (this.zzi == null) {
            zzayz.zze(zzag(zzavpVar.zzd));
            if (this.zzj == null) {
                this.zzj = zzazu.zza(this.zzb, zzavpVar.zzd);
            }
            this.zzi = this.zzj;
        }
        mediaCodec.configure(zzb, this.zzi, (MediaCrypto) null, 0);
        int i16 = zzazo.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    protected final void zzP(String str, long j10, long j11) {
        this.zzd.zzb(str, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzQ(zzart zzartVar) throws zzarf {
        super.zzQ(zzartVar);
        this.zzd.zzf(zzartVar);
        float f10 = zzartVar.zzn;
        if (f10 == -1.0f) {
            f10 = 1.0f;
        }
        this.zzq = f10;
        this.zzp = zzN(zzartVar);
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    protected final void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z10 = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z10 = true;
        }
        if (z10) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.zzr = integer;
        if (z10) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.zzs = integer2;
        float f10 = this.zzq;
        this.zzu = f10;
        if (zzazo.zza >= 21) {
            int i10 = this.zzp;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.zzr;
                this.zzr = integer2;
                this.zzs = i11;
                this.zzu = 1.0f / f10;
            }
        } else {
            this.zzt = this.zzp;
        }
        mediaCodec.setVideoScalingMode(1);
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    protected final boolean zzT(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) {
        while (true) {
            int i12 = this.zzA;
            if (i12 == 0) {
                break;
            }
            long[] jArr = this.zzf;
            long j13 = jArr[0];
            if (j12 < j13) {
                break;
            }
            this.zzz = j13;
            int i13 = i12 - 1;
            this.zzA = i13;
            System.arraycopy(jArr, 1, jArr, 0, i13);
        }
        long j14 = j12 - this.zzz;
        if (z10) {
            zzL(mediaCodec, i10, j14);
            return true;
        }
        long j15 = j12 - j10;
        if (this.zzi == this.zzj) {
            if (zzaf(j15)) {
                zzL(mediaCodec, i10, j14);
                return true;
            }
            return false;
        } else if (!this.zzk) {
            if (zzazo.zza >= 21) {
                zzK(mediaCodec, i10, j14, System.nanoTime());
            } else {
                zzJ(mediaCodec, i10, j14);
            }
            return true;
        } else if (zzb() != 2) {
            return false;
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long nanoTime = System.nanoTime();
            long zza = this.zzc.zza(j12, ((j15 - ((elapsedRealtime * 1000) - j11)) * 1000) + nanoTime);
            long j16 = (zza - nanoTime) / 1000;
            if (zzaf(j16)) {
                zzazm.zza("dropVideoBuffer");
                mediaCodec.releaseOutputBuffer(i10, false);
                zzazm.zzb();
                zzatn zzatnVar = ((zzavr) this).zza;
                zzatnVar.zzf++;
                this.zzn++;
                int i14 = this.zzo + 1;
                this.zzo = i14;
                zzatnVar.zzg = Math.max(i14, zzatnVar.zzg);
                if (this.zzn == -1) {
                    zzac();
                }
                return true;
            }
            if (zzazo.zza >= 21) {
                if (j16 < 50000) {
                    zzK(mediaCodec, i10, j14, zza);
                    return true;
                }
            } else if (j16 < 30000) {
                if (j16 > 11000) {
                    try {
                        Thread.sleep((j16 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                zzJ(mediaCodec, i10, j14);
                return true;
            }
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    protected final void zzX(zzato zzatoVar) {
        int i10 = zzazo.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzY() {
        try {
            super.zzY();
        } finally {
            Surface surface = this.zzj;
            if (surface != null) {
                if (this.zzi == surface) {
                    this.zzi = null;
                }
                surface.release();
                this.zzj = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    protected final boolean zzZ(MediaCodec mediaCodec, boolean z10, zzart zzartVar, zzart zzartVar2) {
        if (zzartVar.zzf.equals(zzartVar2.zzf) && zzN(zzartVar) == zzN(zzartVar2)) {
            if (z10 || (zzartVar.zzj == zzartVar2.zzj && zzartVar.zzk == zzartVar2.zzk)) {
                int i10 = zzartVar2.zzj;
                zzazw zzazwVar = this.zzh;
                return i10 <= zzazwVar.zza && zzartVar2.zzk <= zzazwVar.zzb && zzartVar2.zzg <= zzazwVar.zzc;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    protected final boolean zzaa(zzavp zzavpVar) {
        return this.zzi != null || zzag(zzavpVar.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzard, com.google.android.gms.internal.ads.zzarh
    public final void zzl(int i10, Object obj) throws zzarf {
        if (i10 == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.zzj;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    zzavp zzV = zzV();
                    if (zzV != null && zzag(zzV.zzd)) {
                        surface = zzazu.zza(this.zzb, zzV.zzd);
                        this.zzj = surface;
                    }
                }
            }
            if (this.zzi != surface) {
                this.zzi = surface;
                int zzb = zzb();
                if (zzb == 1 || zzb == 2) {
                    MediaCodec zzU = zzU();
                    if (zzazo.zza >= 23 && zzU != null && surface != null) {
                        zzU.setOutputSurface(surface);
                    } else {
                        zzY();
                        zzW();
                    }
                }
                if (surface != null && surface != this.zzj) {
                    zzae();
                    this.zzk = false;
                    int i11 = zzazo.zza;
                    if (zzb == 2) {
                        this.zzl = -9223372036854775807L;
                        return;
                    }
                    return;
                }
                zzab();
                this.zzk = false;
                int i12 = zzazo.zza;
            } else if (surface == null || surface == this.zzj) {
            } else {
                zzae();
                if (this.zzk) {
                    this.zzd.zzg(this.zzi);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzard
    public final void zzn() {
        this.zzr = -1;
        this.zzs = -1;
        this.zzu = -1.0f;
        this.zzq = -1.0f;
        this.zzz = -9223372036854775807L;
        this.zzA = 0;
        zzab();
        this.zzk = false;
        int i10 = zzazo.zza;
        this.zzc.zzb();
        try {
            super.zzn();
        } finally {
            ((zzavr) this).zza.zza();
            this.zzd.zzc(((zzavr) this).zza);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzard
    public final void zzo(boolean z10) throws zzarf {
        super.zzo(z10);
        int i10 = zzg().zzb;
        this.zzd.zze(((zzavr) this).zza);
        this.zzc.zzc();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzard
    public final void zzp(long j10, boolean z10) throws zzarf {
        super.zzp(j10, z10);
        this.zzk = false;
        int i10 = zzazo.zza;
        this.zzo = 0;
        int i11 = this.zzA;
        if (i11 != 0) {
            this.zzz = this.zzf[i11 - 1];
            this.zzA = 0;
        }
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzard
    protected final void zzq() {
        this.zzn = 0;
        this.zzm = SystemClock.elapsedRealtime();
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzard
    protected final void zzr() {
        zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzard
    protected final void zzs(zzart[] zzartVarArr, long j10) throws zzarf {
        this.zzg = zzartVarArr;
        if (this.zzz == -9223372036854775807L) {
            this.zzz = j10;
            return;
        }
        int i10 = this.zzA;
        if (i10 == 10) {
            long j11 = this.zzf[9];
            Log.w("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + j11);
        } else {
            this.zzA = i10 + 1;
        }
        this.zzf[this.zzA - 1] = j10;
    }
}
