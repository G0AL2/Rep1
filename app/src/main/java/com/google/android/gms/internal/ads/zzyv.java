package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzyv {
    public static int zza(zzys zzysVar, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        while (i12 < i11) {
            int zzb = zzysVar.zzb(bArr, i10 + i12, i11 - i12);
            if (zzb == -1) {
                break;
            }
            i12 += zzb;
        }
        return i12;
    }

    public static void zzb(boolean z10, String str) throws zzbp {
        if (!z10) {
            throw zzbp.zza(str, null);
        }
    }

    public static boolean zzc(zzys zzysVar, byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        try {
            return zzysVar.zzm(bArr, 0, i11, z10);
        } catch (EOFException e10) {
            if (z10) {
                return false;
            }
            throw e10;
        }
    }

    public static boolean zzd(zzys zzysVar, byte[] bArr, int i10, int i11) throws IOException {
        try {
            ((zzyl) zzysVar).zzn(bArr, i10, i11, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzys zzysVar, int i10) throws IOException {
        try {
            ((zzyl) zzysVar).zzo(i10, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
