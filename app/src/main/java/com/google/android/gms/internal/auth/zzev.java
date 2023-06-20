package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public final class zzev {
    static final Charset zza = Charset.forName("UTF-8");
    static final Charset zzb = Charset.forName("ISO-8859-1");
    public static final byte[] zzc;
    public static final ByteBuffer zzd;
    public static final zzee zze;

    static {
        byte[] bArr = new byte[0];
        zzc = bArr;
        zzd = ByteBuffer.wrap(bArr);
        int i10 = zzee.zza;
        zzed zzedVar = new zzed(bArr, 0, 0, false, null);
        try {
            zzedVar.zza(0);
            zze = zzedVar;
        } catch (zzew e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int zzb(byte[] bArr) {
        int length = bArr.length;
        int zzd2 = zzd(length, bArr, 0, length);
        if (zzd2 == 0) {
            return 1;
        }
        return zzd2;
    }

    public static int zzc(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zze(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zzf(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzg(Object obj, Object obj2) {
        return ((zzfq) obj).zze().zzc((zzfq) obj2).zzg();
    }

    public static String zzh(byte[] bArr) {
        return new String(bArr, zza);
    }

    public static boolean zzi(byte[] bArr) {
        return zzhd.zzc(bArr);
    }
}
