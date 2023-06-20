package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzghm implements zzfwn {
    private static final byte[] zza = new byte[0];
    private final zzghp zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzghk zze;
    private final int zzf;

    public zzghm(ECPublicKey eCPublicKey, byte[] bArr, String str, int i10, zzghk zzghkVar) throws GeneralSecurityException {
        zzghq.zzc(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zzb = new zzghp(eCPublicKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zzf = i10;
        this.zze = zzghkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzgho zza2 = this.zzb.zza(this.zzc, this.zzd, bArr2, this.zze.zza(), this.zzf);
        byte[] zza3 = this.zze.zzb(zza2.zzb()).zza(bArr, zza);
        byte[] zza4 = zza2.zza();
        return ByteBuffer.allocate(zza4.length + zza3.length).put(zza4).put(zza3).array();
    }
}
