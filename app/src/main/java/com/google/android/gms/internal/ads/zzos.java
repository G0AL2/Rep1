package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzos extends zzqi implements zzjb {
    private final Context zzb;
    private final zznj zzc;
    private final zznq zzd;
    private int zze;
    private boolean zzf;
    private zzad zzg;
    private long zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private zzjs zzl;

    public zzos(Context context, zzqc zzqcVar, zzqk zzqkVar, boolean z10, Handler handler, zznk zznkVar, zznq zznqVar) {
        super(1, zzqcVar, zzqkVar, false, 44100.0f);
        this.zzb = context.getApplicationContext();
        this.zzd = zznqVar;
        this.zzc = new zznj(handler, zznkVar);
        zznqVar.zzn(new zzor(this, null));
    }

    private final int zzaw(zzqf zzqfVar, zzad zzadVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(zzqfVar.zza) || (i10 = zzeg.zza) >= 24 || (i10 == 23 && zzeg.zzW(this.zzb))) {
            return zzadVar.zzn;
        }
        return -1;
    }

    private static List zzax(zzqk zzqkVar, zzad zzadVar, boolean z10, zznq zznqVar) throws zzqr {
        zzqf zzd;
        String str = zzadVar.zzm;
        if (str == null) {
            return zzfrj.zzo();
        }
        if (zznqVar.zzv(zzadVar) && (zzd = zzqx.zzd()) != null) {
            return zzfrj.zzp(zzd);
        }
        List zzf = zzqx.zzf(str, false, false);
        String zze = zzqx.zze(zzadVar);
        if (zze == null) {
            return zzfrj.zzm(zzf);
        }
        List zzf2 = zzqx.zzf(zze, false, false);
        zzfrg zzi = zzfrj.zzi();
        zzi.zzf(zzf);
        zzi.zzf(zzf2);
        return zzi.zzg();
    }

    private final void zzay() {
        long zzb = this.zzd.zzb(zzM());
        if (zzb != Long.MIN_VALUE) {
            if (!this.zzj) {
                zzb = Math.max(this.zzh, zzb);
            }
            this.zzh = zzb;
            this.zzj = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjt, com.google.android.gms.internal.ads.zzju
    public final String zzK() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzjt
    public final boolean zzM() {
        return super.zzM() && this.zzd.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzjt
    public final boolean zzN() {
        return this.zzd.zzt() || super.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final float zzP(float f10, zzad zzadVar, zzad[] zzadVarArr) {
        int i10 = -1;
        for (zzad zzadVar2 : zzadVarArr) {
            int i11 = zzadVar2.zzA;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return i10 * f10;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final int zzQ(zzqk zzqkVar, zzad zzadVar) throws zzqr {
        boolean z10;
        if (zzbo.zzg(zzadVar.zzm)) {
            int i10 = zzeg.zza >= 21 ? 32 : 0;
            int i11 = zzadVar.zzF;
            boolean zzav = zzqi.zzav(zzadVar);
            if (zzav && this.zzd.zzv(zzadVar) && (i11 == 0 || zzqx.zzd() != null)) {
                return i10 | IronSourceConstants.USING_CACHE_FOR_INIT_EVENT;
            }
            if ((!"audio/raw".equals(zzadVar.zzm) || this.zzd.zzv(zzadVar)) && this.zzd.zzv(zzeg.zzE(2, zzadVar.zzz, zzadVar.zzA))) {
                List zzax = zzax(zzqkVar, zzadVar, false, this.zzd);
                if (zzax.isEmpty()) {
                    return 129;
                }
                if (zzav) {
                    zzqf zzqfVar = (zzqf) zzax.get(0);
                    boolean zzd = zzqfVar.zzd(zzadVar);
                    if (!zzd) {
                        for (int i12 = 1; i12 < zzax.size(); i12++) {
                            zzqf zzqfVar2 = (zzqf) zzax.get(i12);
                            if (zzqfVar2.zzd(zzadVar)) {
                                zzqfVar = zzqfVar2;
                                z10 = false;
                                zzd = true;
                                break;
                            }
                        }
                    }
                    z10 = true;
                    int i13 = true != zzd ? 3 : 4;
                    int i14 = 8;
                    if (zzd && zzqfVar.zze(zzadVar)) {
                        i14 = 16;
                    }
                    return i13 | i14 | i10 | (true != zzqfVar.zzg ? 0 : 64) | (true != z10 ? 0 : 128);
                }
                return 130;
            }
            return 129;
        }
        return 128;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final zzgm zzR(zzqf zzqfVar, zzad zzadVar, zzad zzadVar2) {
        int i10;
        int i11;
        zzgm zzb = zzqfVar.zzb(zzadVar, zzadVar2);
        int i12 = zzb.zze;
        if (zzaw(zzqfVar, zzadVar2) > this.zze) {
            i12 |= 64;
        }
        String str = zzqfVar.zza;
        if (i12 != 0) {
            i11 = i12;
            i10 = 0;
        } else {
            i10 = zzb.zzd;
            i11 = 0;
        }
        return new zzgm(str, zzadVar, zzadVar2, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzqi
    public final zzgm zzS(zziz zzizVar) throws zzgt {
        zzgm zzS = super.zzS(zzizVar);
        this.zzc.zzg(zzizVar.zza, zzS);
        return zzS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x008b  */
    @Override // com.google.android.gms.internal.ads.zzqi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final com.google.android.gms.internal.ads.zzqb zzV(com.google.android.gms.internal.ads.zzqf r8, com.google.android.gms.internal.ads.zzad r9, android.media.MediaCrypto r10, float r11) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzos.zzV(com.google.android.gms.internal.ads.zzqf, com.google.android.gms.internal.ads.zzad, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.zzqb");
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final List zzW(zzqk zzqkVar, zzad zzadVar, boolean z10) throws zzqr {
        return zzqx.zzg(zzax(zzqkVar, zzadVar, false, this.zzd), zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final void zzX(Exception exc) {
        zzdn.zza("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.zzc.zza(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final void zzY(String str, zzqb zzqbVar, long j10, long j11) {
        this.zzc.zzc(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final void zzZ(String str) {
        this.zzc.zzd(str);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final long zza() {
        if (zzbe() == 2) {
            zzay();
        }
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final void zzaa(zzad zzadVar, MediaFormat mediaFormat) throws zzgt {
        int zzn;
        int i10;
        zzad zzadVar2 = this.zzg;
        int[] iArr = null;
        if (zzadVar2 != null) {
            zzadVar = zzadVar2;
        } else if (zzaj() != null) {
            if ("audio/raw".equals(zzadVar.zzm)) {
                zzn = zzadVar.zzB;
            } else if (zzeg.zza >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                zzn = mediaFormat.getInteger("pcm-encoding");
            } else {
                zzn = mediaFormat.containsKey("v-bits-per-sample") ? zzeg.zzn(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            zzab zzabVar = new zzab();
            zzabVar.zzS("audio/raw");
            zzabVar.zzN(zzn);
            zzabVar.zzC(zzadVar.zzC);
            zzabVar.zzD(zzadVar.zzD);
            zzabVar.zzw(mediaFormat.getInteger("channel-count"));
            zzabVar.zzT(mediaFormat.getInteger("sample-rate"));
            zzad zzY = zzabVar.zzY();
            if (this.zzf && zzY.zzz == 6 && (i10 = zzadVar.zzz) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < zzadVar.zzz; i11++) {
                    iArr[i11] = i11;
                }
            }
            zzadVar = zzY;
        }
        try {
            this.zzd.zzd(zzadVar, 0, iArr);
        } catch (zznl e10) {
            throw zzbg(e10, e10.zza, false, IronSourceConstants.errorCode_biddingDataException);
        }
    }

    public final void zzab() {
        this.zzj = true;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final void zzac() {
        this.zzd.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final void zzad(zzgb zzgbVar) {
        if (!this.zzi || zzgbVar.zzf()) {
            return;
        }
        if (Math.abs(zzgbVar.zzd - this.zzh) > 500000) {
            this.zzh = zzgbVar.zzd;
        }
        this.zzi = false;
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final void zzae() throws zzgt {
        try {
            this.zzd.zzi();
        } catch (zznp e10) {
            throw zzbg(e10, e10.zzc, e10.zzb, IronSourceConstants.errorCode_isReadyException);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final boolean zzaf(long j10, long j11, zzqd zzqdVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, zzad zzadVar) throws zzgt {
        Objects.requireNonNull(byteBuffer);
        if (this.zzg != null && (i11 & 2) != 0) {
            Objects.requireNonNull(zzqdVar);
            zzqdVar.zzn(i10, false);
            return true;
        } else if (z10) {
            if (zzqdVar != null) {
                zzqdVar.zzn(i10, false);
            }
            ((zzqi) this).zza.zzf += i12;
            this.zzd.zzf();
            return true;
        } else {
            try {
                if (this.zzd.zzs(byteBuffer, j12, i12)) {
                    if (zzqdVar != null) {
                        zzqdVar.zzn(i10, false);
                    }
                    ((zzqi) this).zza.zze += i12;
                    return true;
                }
                return false;
            } catch (zznm e10) {
                throw zzbg(e10, e10.zzc, e10.zzb, IronSourceConstants.errorCode_biddingDataException);
            } catch (zznp e11) {
                throw zzbg(e11, zzadVar, e11.zzb, IronSourceConstants.errorCode_isReadyException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqi
    protected final boolean zzag(zzad zzadVar) {
        return this.zzd.zzv(zzadVar);
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final zzbt zzc() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzjb
    public final void zzg(zzbt zzbtVar) {
        this.zzd.zzo(zzbtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgk, com.google.android.gms.internal.ads.zzjt
    public final zzjb zzi() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgk, com.google.android.gms.internal.ads.zzjp
    public final void zzp(int i10, Object obj) throws zzgt {
        if (i10 == 2) {
            this.zzd.zzr(((Float) obj).floatValue());
        } else if (i10 == 3) {
            this.zzd.zzk((zzi) obj);
        } else if (i10 != 6) {
            switch (i10) {
                case 9:
                    this.zzd.zzq(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.zzd.zzl(((Integer) obj).intValue());
                    return;
                case 11:
                    this.zzl = (zzjs) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.zzd.zzm((zzj) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    public final void zzs() {
        this.zzk = true;
        try {
            this.zzd.zze();
            try {
                super.zzs();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.zzs();
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    public final void zzt(boolean z10, boolean z11) throws zzgt {
        super.zzt(z10, z11);
        this.zzc.zzf(((zzqi) this).zza);
        zzk();
        this.zzd.zzp(zzl());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    public final void zzu(long j10, boolean z10) throws zzgt {
        super.zzu(j10, z10);
        this.zzd.zze();
        this.zzh = j10;
        this.zzi = true;
        this.zzj = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzqi, com.google.android.gms.internal.ads.zzgk
    public final void zzv() {
        try {
            super.zzv();
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
        } catch (Throwable th) {
            if (this.zzk) {
                this.zzk = false;
                this.zzd.zzj();
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final void zzw() {
        this.zzd.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgk
    protected final void zzx() {
        zzay();
        this.zzd.zzg();
    }
}
