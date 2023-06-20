package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfyl implements zzfwf {
    private static final byte[] zza = new byte[0];
    private final zzgfo zzb;
    private final zzfwf zzc;

    public zzfyl(zzgfo zzgfoVar, zzfwf zzfwfVar) {
        this.zzb = zzgfoVar;
        this.zzc = zzfwfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 > 0 && i10 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i10];
                wrap.get(bArr3, 0, i10);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                return ((zzfwf) zzfxk.zzh(this.zzb.zzf(), this.zzc.zza(bArr3, zza), zzfwf.class)).zza(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzaw = zzfxk.zzd(this.zzb).zzaw();
        byte[] zzb = this.zzc.zzb(zzaw, zza);
        byte[] zzb2 = ((zzfwf) zzfxk.zzh(this.zzb.zzf(), zzaw, zzfwf.class)).zzb(bArr, bArr2);
        int length = zzb.length;
        return ByteBuffer.allocate(length + 4 + zzb2.length).putInt(length).put(zzb).put(zzb2).array();
    }
}
