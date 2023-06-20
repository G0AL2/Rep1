package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzatf extends zzavr implements zzazd {
    private final zzasp zzb;
    private final zzatb zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private boolean zzh;

    public zzatf(zzavt zzavtVar, zzatt zzattVar, boolean z10, Handler handler, zzasq zzasqVar) {
        super(1, zzavtVar, null, true);
        this.zzc = new zzatb(null, new zzasi[0], new zzate(this, null));
        this.zzb = new zzasp(handler, zzasqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzary
    public final boolean zzE() {
        return super.zzE() && this.zzc.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzary
    public final boolean zzF() {
        return this.zzc.zzn() || super.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    protected final int zzH(zzavt zzavtVar, zzart zzartVar) throws zzavw {
        int i10;
        int i11;
        String str = zzartVar.zzf;
        if (zzaze.zza(str)) {
            int i12 = zzazo.zza;
            int i13 = i12 >= 21 ? 16 : 0;
            zzavp zzc = zzawb.zzc(str, false);
            if (zzc == null) {
                return 1;
            }
            int i14 = 2;
            if (i12 < 21 || (((i10 = zzartVar.zzs) == -1 || zzc.zzd(i10)) && ((i11 = zzartVar.zzr) == -1 || zzc.zzc(i11)))) {
                i14 = 3;
            }
            return i13 | 4 | i14;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    public final long zzI() {
        long zza = this.zzc.zza(zzE());
        if (zza != Long.MIN_VALUE) {
            if (!this.zzh) {
                zza = Math.max(this.zzg, zza);
            }
            this.zzg = zza;
            this.zzh = false;
        }
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    public final zzarx zzJ() {
        return this.zzc.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzazd
    public final zzarx zzK(zzarx zzarxVar) {
        return this.zzc.zzd(zzarxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    protected final zzavp zzM(zzavt zzavtVar, zzart zzartVar, boolean z10) throws zzavw {
        return super.zzM(zzavtVar, zzartVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        if (r4.startsWith("heroqlte") == false) goto L16;
     */
    @Override // com.google.android.gms.internal.ads.zzavr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void zzO(com.google.android.gms.internal.ads.zzavp r4, android.media.MediaCodec r5, com.google.android.gms.internal.ads.zzart r6, android.media.MediaCrypto r7) {
        /*
            r3 = this;
            java.lang.String r4 = r4.zza
            int r7 = com.google.android.gms.internal.ads.zzazo.zza
            r0 = 1
            r1 = 0
            r2 = 24
            if (r7 >= r2) goto L37
            java.lang.String r7 = "OMX.SEC.aac.dec"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.google.android.gms.internal.ads.zzazo.zzc
            java.lang.String r7 = "samsung"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L37
            java.lang.String r4 = com.google.android.gms.internal.ads.zzazo.zzb
            java.lang.String r7 = "zeroflte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L38
            java.lang.String r7 = "herolte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L38
            java.lang.String r7 = "heroqlte"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L37
            goto L38
        L37:
            r0 = 0
        L38:
            r3.zzd = r0
            android.media.MediaFormat r4 = r6.zzb()
            r6 = 0
            r5.configure(r4, r6, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzatf.zzO(com.google.android.gms.internal.ads.zzavp, android.media.MediaCodec, com.google.android.gms.internal.ads.zzart, android.media.MediaCrypto):void");
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    protected final void zzP(String str, long j10, long j11) {
        this.zzb.zzd(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    protected final void zzQ(zzart zzartVar) throws zzarf {
        super.zzQ(zzartVar);
        this.zzb.zzg(zzartVar);
        this.zze = "audio/raw".equals(zzartVar.zzf) ? zzartVar.zzt : 2;
        this.zzf = zzartVar.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    protected final void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzarf {
        int i10;
        int[] iArr;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.zzd && integer == 6) {
            int i11 = this.zzf;
            if (i11 < 6) {
                int[] iArr2 = new int[i11];
                for (int i12 = 0; i12 < this.zzf; i12++) {
                    iArr2[i12] = i12;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i10 = 6;
        } else {
            i10 = integer;
            iArr = null;
        }
        try {
            this.zzc.zze("audio/raw", i10, integer2, this.zze, 0, iArr);
        } catch (zzasv e10) {
            throw zzarf.zza(e10, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    protected final void zzS() throws zzarf {
        try {
            this.zzc.zzi();
        } catch (zzata e10) {
            throw zzarf.zza(e10, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    protected final boolean zzT(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws zzarf {
        if (z10) {
            mediaCodec.releaseOutputBuffer(i10, false);
            ((zzavr) this).zza.zze++;
            this.zzc.zzf();
            return true;
        }
        try {
            if (this.zzc.zzm(byteBuffer, j12)) {
                mediaCodec.releaseOutputBuffer(i10, false);
                ((zzavr) this).zza.zzd++;
                return true;
            }
            return false;
        } catch (zzasw | zzata e10) {
            throw zzarf.zza(e10, zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzard, com.google.android.gms.internal.ads.zzary
    public final zzazd zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzard, com.google.android.gms.internal.ads.zzarh
    public final void zzl(int i10, Object obj) throws zzarf {
        if (i10 != 2) {
            return;
        }
        this.zzc.zzl(((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzard
    protected final void zzn() {
        try {
            this.zzc.zzj();
            try {
                super.zzn();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzn();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzard
    protected final void zzo(boolean z10) throws zzarf {
        super.zzo(z10);
        this.zzb.zzf(((zzavr) this).zza);
        int i10 = zzg().zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzavr, com.google.android.gms.internal.ads.zzard
    protected final void zzp(long j10, boolean z10) throws zzarf {
        super.zzp(j10, z10);
        this.zzc.zzk();
        this.zzg = j10;
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzard
    protected final void zzq() {
        this.zzc.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzard
    protected final void zzr() {
        this.zzc.zzg();
    }
}
