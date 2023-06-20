package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcs  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzcs implements zzan {
    private static final byte[] zza = new byte[0];
    private final zzke zzb;
    private final zzan zzc;

    public zzcs(zzke zzkeVar, zzan zzanVar) {
        this.zzb = zzkeVar;
        this.zzc = zzanVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i10 = wrap.getInt();
            if (i10 > 0 && i10 <= bArr.length - 4) {
                byte[] bArr3 = new byte[i10];
                wrap.get(bArr3, 0, i10);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                return ((zzan) zzbq.zzi(this.zzb.zze(), this.zzc.zza(bArr3, zza), zzan.class)).zza(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e10) {
            throw new GeneralSecurityException("invalid ciphertext", e10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
