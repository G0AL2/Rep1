package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.inmobi.media.fq;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(19)
/* loaded from: classes2.dex */
public abstract class zzavr extends zzard {
    private static final byte[] zzb = zzazo.zzp("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    protected zzatn zza;
    private final zzavt zzc;
    private final zzato zzd;
    private final zzato zze;
    private final zzaru zzf;
    private final List zzg;
    private final MediaCodec.BufferInfo zzh;
    private zzart zzi;
    private MediaCodec zzj;
    private zzavp zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private ByteBuffer[] zzu;
    private ByteBuffer[] zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    public zzavr(int i10, zzavt zzavtVar, zzatt zzattVar, boolean z10) {
        super(i10);
        zzayz.zze(zzazo.zza >= 16);
        this.zzc = zzavtVar;
        this.zzd = new zzato(0);
        this.zze = new zzato(0);
        this.zzf = new zzaru();
        this.zzg = new ArrayList();
        this.zzh = new MediaCodec.BufferInfo();
        this.zzB = 0;
        this.zzC = 0;
    }

    private final void zzI() throws zzarf {
        if (this.zzC == 2) {
            zzY();
            zzW();
            return;
        }
        this.zzG = true;
        zzS();
    }

    private final boolean zzJ() throws zzarf {
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec == null || this.zzC == 2 || this.zzF) {
            return false;
        }
        if (this.zzx < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.zzx = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            zzato zzatoVar = this.zzd;
            zzatoVar.zzb = this.zzu[dequeueInputBuffer];
            zzatoVar.zzb();
        }
        if (this.zzC == 1) {
            if (!this.zzo) {
                this.zzE = true;
                this.zzj.queueInputBuffer(this.zzx, 0, 0, 0L, 4);
                this.zzx = -1;
            }
            this.zzC = 2;
            return false;
        } else if (this.zzs) {
            this.zzs = false;
            ByteBuffer byteBuffer = this.zzd.zzb;
            byte[] bArr = zzb;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.zzj;
            int i10 = this.zzx;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i10, 0, 38, 0L, 0);
            this.zzx = -1;
            this.zzD = true;
            return true;
        } else {
            if (this.zzB == 1) {
                for (int i11 = 0; i11 < this.zzi.zzh.size(); i11++) {
                    this.zzd.zzb.put((byte[]) this.zzi.zzh.get(i11));
                }
                this.zzB = 2;
            }
            int position = this.zzd.zzb.position();
            int zzd = zzd(this.zzf, this.zzd, false);
            if (zzd == -3) {
                return false;
            }
            if (zzd == -5) {
                if (this.zzB == 2) {
                    this.zzd.zzb();
                    this.zzB = 1;
                }
                zzQ(this.zzf.zza);
                return true;
            }
            zzato zzatoVar2 = this.zzd;
            if (zzatoVar2.zzf()) {
                if (this.zzB == 2) {
                    zzatoVar2.zzb();
                    this.zzB = 1;
                }
                this.zzF = true;
                if (!this.zzD) {
                    zzI();
                    return false;
                }
                try {
                    if (!this.zzo) {
                        this.zzE = true;
                        this.zzj.queueInputBuffer(this.zzx, 0, 0, 0L, 4);
                        this.zzx = -1;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw zzarf.zza(e10, zza());
                }
            } else if (this.zzH && !zzatoVar2.zzg()) {
                zzatoVar2.zzb();
                if (this.zzB == 2) {
                    this.zzB = 1;
                }
                return true;
            } else {
                this.zzH = false;
                boolean zzi = zzatoVar2.zzi();
                if (this.zzl && !zzi) {
                    ByteBuffer byteBuffer2 = zzatoVar2.zzb;
                    byte[] bArr2 = zzazf.zza;
                    int position2 = byteBuffer2.position();
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        int i14 = i12 + 1;
                        if (i14 < position2) {
                            int i15 = byteBuffer2.get(i12) & fq.i.NETWORK_LOAD_LIMIT_DISABLED;
                            if (i13 == 3) {
                                if (i15 == 1) {
                                    if ((byteBuffer2.get(i14) & 31) == 7) {
                                        ByteBuffer duplicate = byteBuffer2.duplicate();
                                        duplicate.position(i12 - 3);
                                        duplicate.limit(position2);
                                        byteBuffer2.position(0);
                                        byteBuffer2.put(duplicate);
                                        break;
                                    }
                                    i15 = 1;
                                }
                            } else if (i15 == 0) {
                                i13++;
                            }
                            if (i15 != 0) {
                                i13 = 0;
                            }
                            i12 = i14;
                        } else {
                            byteBuffer2.clear();
                            break;
                        }
                    }
                    if (this.zzd.zzb.position() == 0) {
                        return true;
                    }
                    this.zzl = false;
                }
                try {
                    zzato zzatoVar3 = this.zzd;
                    long j10 = zzatoVar3.zzc;
                    if (zzatoVar3.zze()) {
                        this.zzg.add(Long.valueOf(j10));
                    }
                    this.zzd.zzb.flip();
                    zzX(this.zzd);
                    if (zzi) {
                        MediaCodec.CryptoInfo zza = this.zzd.zza.zza();
                        if (position != 0) {
                            if (zza.numBytesOfClearData == null) {
                                zza.numBytesOfClearData = new int[1];
                            }
                            int[] iArr = zza.numBytesOfClearData;
                            iArr[0] = iArr[0] + position;
                        }
                        this.zzj.queueSecureInputBuffer(this.zzx, 0, zza, j10, 0);
                    } else {
                        this.zzj.queueInputBuffer(this.zzx, 0, this.zzd.zzb.limit(), j10, 0);
                    }
                    this.zzx = -1;
                    this.zzD = true;
                    this.zzB = 0;
                    this.zza.zzc++;
                    return true;
                } catch (MediaCodec.CryptoException e11) {
                    throw zzarf.zza(e11, zza());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public final void zzD(long j10, long j11) throws zzarf {
        boolean zzT;
        int dequeueOutputBuffer;
        boolean z10;
        if (this.zzG) {
            zzS();
            return;
        }
        if (this.zzi == null) {
            this.zze.zzb();
            int zzd = zzd(this.zzf, this.zze, true);
            if (zzd != -5) {
                if (zzd == -4) {
                    zzayz.zze(this.zze.zzf());
                    this.zzF = true;
                    zzI();
                    return;
                }
                return;
            }
            zzQ(this.zzf.zza);
        }
        zzW();
        if (this.zzj != null) {
            zzazm.zza("drainAndFeed");
            while (true) {
                if (this.zzy < 0) {
                    if (this.zzq && this.zzE) {
                        try {
                            dequeueOutputBuffer = this.zzj.dequeueOutputBuffer(this.zzh, 0L);
                            this.zzy = dequeueOutputBuffer;
                        } catch (IllegalStateException unused) {
                            zzI();
                            if (this.zzG) {
                                zzY();
                            }
                        }
                    } else {
                        dequeueOutputBuffer = this.zzj.dequeueOutputBuffer(this.zzh, 0L);
                        this.zzy = dequeueOutputBuffer;
                    }
                    if (dequeueOutputBuffer >= 0) {
                        if (this.zzt) {
                            this.zzt = false;
                            this.zzj.releaseOutputBuffer(dequeueOutputBuffer, false);
                            this.zzy = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo = this.zzh;
                            if ((bufferInfo.flags & 4) != 0) {
                                zzI();
                                this.zzy = -1;
                                break;
                            }
                            ByteBuffer byteBuffer = this.zzv[this.zzy];
                            if (byteBuffer != null) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.zzh;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j12 = this.zzh.presentationTimeUs;
                            int size = this.zzg.size();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= size) {
                                    z10 = false;
                                    break;
                                } else if (((Long) this.zzg.get(i10)).longValue() == j12) {
                                    this.zzg.remove(i10);
                                    z10 = true;
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                            this.zzz = z10;
                        }
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.zzj.getOutputFormat();
                        if (this.zzn && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.zzt = true;
                        } else {
                            if (this.zzr) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            zzR(this.zzj, outputFormat);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.zzv = this.zzj.getOutputBuffers();
                    } else if (this.zzo && (this.zzF || this.zzC == 2)) {
                        zzI();
                    }
                }
                if (this.zzq && this.zzE) {
                    try {
                        MediaCodec mediaCodec = this.zzj;
                        ByteBuffer[] byteBufferArr = this.zzv;
                        int i11 = this.zzy;
                        ByteBuffer byteBuffer2 = byteBufferArr[i11];
                        MediaCodec.BufferInfo bufferInfo3 = this.zzh;
                        zzT = zzT(j10, j11, mediaCodec, byteBuffer2, i11, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.zzz);
                    } catch (IllegalStateException unused2) {
                        zzI();
                        if (this.zzG) {
                            zzY();
                        }
                    }
                } else {
                    MediaCodec mediaCodec2 = this.zzj;
                    ByteBuffer[] byteBufferArr2 = this.zzv;
                    int i12 = this.zzy;
                    ByteBuffer byteBuffer3 = byteBufferArr2[i12];
                    MediaCodec.BufferInfo bufferInfo4 = this.zzh;
                    zzT = zzT(j10, j11, mediaCodec2, byteBuffer3, i12, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.zzz);
                }
                if (!zzT) {
                    break;
                }
                long j13 = this.zzh.presentationTimeUs;
                this.zzy = -1;
            }
            do {
            } while (zzJ());
            zzazm.zzb();
        } else {
            zzx(j10);
            this.zze.zzb();
            int zzd2 = zzd(this.zzf, this.zze, false);
            if (zzd2 == -5) {
                zzQ(this.zzf.zza);
            } else if (zzd2 == -4) {
                zzayz.zze(this.zze.zzf());
                this.zzF = true;
                zzI();
            }
        }
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public boolean zzE() {
        return this.zzG;
    }

    @Override // com.google.android.gms.internal.ads.zzary
    public boolean zzF() {
        if (this.zzi != null) {
            if (zzC() || this.zzy >= 0) {
                return true;
            }
            if (this.zzw != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzw) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzarz
    public final int zzG(zzart zzartVar) throws zzarf {
        try {
            return zzH(this.zzc, zzartVar);
        } catch (zzavw e10) {
            throw zzarf.zza(e10, zza());
        }
    }

    protected abstract int zzH(zzavt zzavtVar, zzart zzartVar) throws zzavw;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzavp zzM(zzavt zzavtVar, zzart zzartVar, boolean z10) throws zzavw {
        return zzawb.zzc(zzartVar.zzf, false);
    }

    protected abstract void zzO(zzavp zzavpVar, MediaCodec mediaCodec, zzart zzartVar, MediaCrypto mediaCrypto) throws zzavw;

    protected void zzP(String str, long j10, long j11) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r6.zzk == r0.zzk) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzQ(com.google.android.gms.internal.ads.zzart r6) throws com.google.android.gms.internal.ads.zzarf {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzart r0 = r5.zzi
            r5.zzi = r6
            com.google.android.gms.internal.ads.zzats r6 = r6.zzi
            if (r0 != 0) goto La
            r1 = 0
            goto Lc
        La:
            com.google.android.gms.internal.ads.zzats r1 = r0.zzi
        Lc:
            boolean r6 = com.google.android.gms.internal.ads.zzazo.zzo(r6, r1)
            if (r6 != 0) goto L29
            com.google.android.gms.internal.ads.zzart r6 = r5.zzi
            com.google.android.gms.internal.ads.zzats r6 = r6.zzi
            if (r6 != 0) goto L19
            goto L29
        L19:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.zza()
            com.google.android.gms.internal.ads.zzarf r6 = com.google.android.gms.internal.ads.zzarf.zza(r6, r0)
            throw r6
        L29:
            android.media.MediaCodec r6 = r5.zzj
            r1 = 1
            if (r6 == 0) goto L56
            com.google.android.gms.internal.ads.zzavp r2 = r5.zzk
            boolean r2 = r2.zzb
            com.google.android.gms.internal.ads.zzart r3 = r5.zzi
            boolean r6 = r5.zzZ(r6, r2, r0, r3)
            if (r6 == 0) goto L56
            r5.zzA = r1
            r5.zzB = r1
            boolean r6 = r5.zzn
            r2 = 0
            if (r6 == 0) goto L52
            com.google.android.gms.internal.ads.zzart r6 = r5.zzi
            int r3 = r6.zzj
            int r4 = r0.zzj
            if (r3 != r4) goto L52
            int r6 = r6.zzk
            int r0 = r0.zzk
            if (r6 != r0) goto L52
            goto L53
        L52:
            r1 = 0
        L53:
            r5.zzs = r1
            return
        L56:
            boolean r6 = r5.zzD
            if (r6 == 0) goto L5d
            r5.zzC = r1
            return
        L5d:
            r5.zzY()
            r5.zzW()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavr.zzQ(com.google.android.gms.internal.ads.zzart):void");
    }

    protected void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzarf {
        throw null;
    }

    protected void zzS() throws zzarf {
    }

    protected abstract boolean zzT(long j10, long j11, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i10, int i11, long j12, boolean z10) throws zzarf;

    /* JADX INFO: Access modifiers changed from: protected */
    public final MediaCodec zzU() {
        return this.zzj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzavp zzV() {
        return this.zzk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzW() throws com.google.android.gms.internal.ads.zzarf {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavr.zzW():void");
    }

    protected void zzX(zzato zzatoVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zzY() {
        this.zzw = -9223372036854775807L;
        this.zzx = -1;
        this.zzy = -1;
        this.zzz = false;
        this.zzg.clear();
        this.zzu = null;
        this.zzv = null;
        this.zzk = null;
        this.zzA = false;
        this.zzD = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = false;
        this.zzp = false;
        this.zzr = false;
        this.zzs = false;
        this.zzt = false;
        this.zzE = false;
        this.zzB = 0;
        this.zzC = 0;
        this.zzd.zzb = null;
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec != null) {
            this.zza.zzb++;
            try {
                mediaCodec.stop();
                try {
                    this.zzj.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.zzj.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    protected boolean zzZ(MediaCodec mediaCodec, boolean z10, zzart zzartVar, zzart zzartVar2) {
        return false;
    }

    protected boolean zzaa(zzavp zzavpVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzard, com.google.android.gms.internal.ads.zzarz
    public final int zze() {
        return 4;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzard
    public void zzn() {
        this.zzi = null;
        zzY();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzard
    public void zzo(boolean z10) throws zzarf {
        this.zza = new zzatn();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzard
    public void zzp(long j10, boolean z10) throws zzarf {
        this.zzF = false;
        this.zzG = false;
        if (this.zzj != null) {
            this.zzw = -9223372036854775807L;
            this.zzx = -1;
            this.zzy = -1;
            this.zzH = true;
            this.zzz = false;
            this.zzg.clear();
            this.zzs = false;
            this.zzt = false;
            if (!this.zzm && (!this.zzp || !this.zzE)) {
                if (this.zzC != 0) {
                    zzY();
                    zzW();
                } else {
                    this.zzj.flush();
                    this.zzD = false;
                }
            } else {
                zzY();
                zzW();
            }
            if (!this.zzA || this.zzi == null) {
                return;
            }
            this.zzB = 1;
        }
    }
}
