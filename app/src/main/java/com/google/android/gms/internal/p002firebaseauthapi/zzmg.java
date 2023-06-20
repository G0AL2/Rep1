package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmg  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzmg implements zzan {
    private final zzms zza;
    private final zzbe zzb;
    private final int zzc;

    public zzmg(zzms zzmsVar, zzbe zzbeVar, int i10) {
        this.zza = zzmsVar;
        this.zzb = zzbeVar;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.zzc;
        if (length >= i10) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - i10);
            this.zzb.zza(Arrays.copyOfRange(bArr, length - this.zzc, length), zzlx.zzc(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8)));
            return this.zza.zza(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzan
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
