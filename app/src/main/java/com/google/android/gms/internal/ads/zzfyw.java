package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
abstract class zzfyw {
    int[] zza;
    private final int zzb;

    public zzfyw(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.zza = zzfys.zzd(bArr);
            this.zzb = i10;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    private final void zzf(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length == zza()) {
            int remaining = byteBuffer2.remaining();
            int i10 = (remaining / 64) + 1;
            for (int i11 = 0; i11 < i10; i11++) {
                ByteBuffer zzc = zzc(bArr, this.zzb + i11);
                if (i11 == i10 - 1) {
                    zzghh.zza(byteBuffer, byteBuffer2, zzc, remaining % 64);
                } else {
                    zzghh.zza(byteBuffer, byteBuffer2, zzc, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + zza());
    }

    abstract int zza();

    abstract int[] zzb(int[] iArr, int i10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ByteBuffer zzc(byte[] bArr, int i10) {
        int[] zzb = zzb(zzfys.zzd(bArr), i10);
        int[] iArr = (int[]) zzb.clone();
        zzfys.zzc(iArr);
        for (int i11 = 0; i11 < 16; i11++) {
            zzb[i11] = zzb[i11] + iArr[i11];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(zzb, 0, 16);
        return order;
    }

    public final void zzd(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            zzf(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public final byte[] zze(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        zzf(bArr, allocate, byteBuffer);
        return allocate.array();
    }
}
