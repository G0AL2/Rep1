package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
abstract class zzgnw {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String zzd(ByteBuffer byteBuffer, int i10, int i11) throws zzglc {
        if ((i10 | i11 | ((byteBuffer.limit() - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = byteBuffer.get(i10);
                if (!zzgnv.zzd(b10)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b11 = byteBuffer.get(i10);
                if (zzgnv.zzd(b11)) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) b11;
                    i10 = i15;
                    while (true) {
                        i14 = i16;
                        if (i10 < i12) {
                            byte b12 = byteBuffer.get(i10);
                            if (!zzgnv.zzd(b12)) {
                                break;
                            }
                            i10++;
                            i16 = i14 + 1;
                            cArr[i14] = (char) b12;
                        }
                    }
                } else if (zzgnv.zzf(b11)) {
                    if (i15 < i12) {
                        zzgnv.zzc(b11, byteBuffer.get(i15), cArr, i14);
                        i10 = i15 + 1;
                        i14++;
                    } else {
                        throw zzglc.zzd();
                    }
                } else if (zzgnv.zze(b11)) {
                    if (i15 < i12 - 1) {
                        int i17 = i15 + 1;
                        zzgnv.zzb(b11, byteBuffer.get(i15), byteBuffer.get(i17), cArr, i14);
                        i10 = i17 + 1;
                        i14++;
                    } else {
                        throw zzglc.zzd();
                    }
                } else if (i15 < i12 - 2) {
                    int i18 = i15 + 1;
                    int i19 = i18 + 1;
                    zzgnv.zza(b11, byteBuffer.get(i15), byteBuffer.get(i18), byteBuffer.get(i19), cArr, i14);
                    i14 += 2;
                    i10 = i19 + 1;
                } else {
                    throw zzglc.zzd();
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zza(int i10, byte[] bArr, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract String zzb(byte[] bArr, int i10, int i11) throws zzglc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzc(byte[] bArr, int i10, int i11) {
        return zza(0, bArr, i10, i11) == 0;
    }
}
