package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzatm {
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;
    private final MediaCodec.CryptoInfo zzg;
    private final zzatl zzh;

    public zzatm() {
        int i10 = zzazo.zza;
        MediaCodec.CryptoInfo cryptoInfo = i10 >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.zzg = cryptoInfo;
        this.zzh = i10 >= 24 ? new zzatl(cryptoInfo, null) : null;
    }

    @TargetApi(16)
    public final MediaCodec.CryptoInfo zza() {
        return this.zzg;
    }

    public final void zzb(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11) {
        this.zzf = i10;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = 1;
        int i12 = zzazo.zza;
        if (i12 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.zzg;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i12 >= 24) {
                zzatl.zza(this.zzh, 0, 0);
            }
        }
    }
}
