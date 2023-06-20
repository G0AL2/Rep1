package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzflw {
    public static boolean zza(int i10) {
        int i11 = i10 - 1;
        return i11 == 2 || i11 == 4 || i11 == 5 || i11 == 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int zzb(android.content.Context r13, com.google.android.gms.internal.ads.zzfku r14) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzflw.zzb(android.content.Context, com.google.android.gms.internal.ads.zzfku):int");
    }

    private static final String zzc(Context context, zzfku zzfkuVar) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String zza = zzfph.OS_ARCH.zza();
        if (TextUtils.isEmpty(zza) || !hashSet.contains(zza)) {
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                if (strArr != null && strArr.length > 0) {
                    return strArr[0];
                }
            } catch (IllegalAccessException e10) {
                zzfkuVar.zzc(2024, 0L, e10);
            } catch (NoSuchFieldException e11) {
                zzfkuVar.zzc(2024, 0L, e11);
            }
            String str = Build.CPU_ABI;
            return str != null ? str : Build.CPU_ABI2;
        }
        return zza;
    }

    private static final void zzd(byte[] bArr, String str, Context context, zzfku zzfkuVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("os.arch:");
        sb2.append(zzfph.OS_ARCH.zza());
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            sb2.append("dbg:");
            sb2.append(str);
            sb2.append(";");
        }
        zzfkuVar.zzb(4007, sb2.toString());
    }
}
