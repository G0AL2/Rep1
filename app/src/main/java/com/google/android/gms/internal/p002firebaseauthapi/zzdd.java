package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdd  reason: invalid package */
/* loaded from: classes2.dex */
abstract class zzdd {
    int[] zza;
    private final int zzb;

    public zzdd(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.zza = zzcz.zzd(bArr);
            this.zzb = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    abstract int zza();

    abstract int[] zzb(int[] iArr, int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer zzc(byte[] bArr, int i10) {
        int[] zzb = zzb(zzcz.zzd(bArr), i10);
        int[] iArr = (int[]) zzb.clone();
        zzcz.zzc(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            zzb[i11] = zzb[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb, 0, 16);
        return order;
    }

    public final byte[] zzd(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length == zza()) {
            int remaining = byteBuffer.remaining();
            int i10 = (remaining / 64) + 1;
            for (int i11 = 0; i11 < i10; i11++) {
                ByteBuffer zzc = zzc(bArr, this.zzb + i11);
                if (i11 == i10 - 1) {
                    zzlx.zza(allocate, byteBuffer, zzc, remaining % 64);
                } else {
                    zzlx.zza(allocate, byteBuffer, zzc, 64);
                }
            }
            return allocate.array();
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
    }
}
