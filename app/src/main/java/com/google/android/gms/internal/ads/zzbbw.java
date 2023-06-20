package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbw {
    @VisibleForTesting
    static long zza(long j10, int i10) {
        if (i10 == 1) {
            return j10;
        }
        return ((i10 & 1) == 0 ? zza((j10 * j10) % 1073807359, i10 >> 1) : j10 * (zza((j10 * j10) % 1073807359, i10 >> 1) % 1073807359)) % 1073807359;
    }

    @VisibleForTesting
    static String zzb(String[] strArr, int i10, int i11) {
        int i12 = i11 + i10;
        if (strArr.length < i12) {
            zzcfi.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int i13 = i12 - 1;
            if (i10 < i13) {
                sb2.append(strArr[i10]);
                sb2.append(' ');
                i10++;
            } else {
                sb2.append(strArr[i13]);
                return sb2.toString();
            }
        }
    }

    public static void zzc(String[] strArr, int i10, int i11, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzd(i10, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzd(i10, zze, zzb(strArr, 0, 6), 6, priorityQueue);
        long zza = zza(16785407L, 5);
        int i12 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i12 >= length2 - 5) {
                return;
            }
            zze = ((((((zze + 1073807359) - ((((zzbbs.zza(strArr[i12 - 1]) + 2147483647L) % 1073807359) * zza) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((zzbbs.zza(strArr[i12 + 5]) + 2147483647L) % 1073807359)) % 1073807359;
            zzd(i10, zze, zzb(strArr, i12, 6), length2, priorityQueue);
            i12++;
        }
    }

    @VisibleForTesting
    static void zzd(int i10, long j10, String str, int i11, PriorityQueue priorityQueue) {
        zzbbv zzbbvVar = new zzbbv(j10, str, i11);
        if ((priorityQueue.size() != i10 || (((zzbbv) priorityQueue.peek()).zzc <= zzbbvVar.zzc && ((zzbbv) priorityQueue.peek()).zza <= zzbbvVar.zza)) && !priorityQueue.contains(zzbbvVar)) {
            priorityQueue.add(zzbbvVar);
            if (priorityQueue.size() > i10) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i10, int i11) {
        long zza = (zzbbs.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i12 = 1; i12 < i11; i12++) {
            zza = (((zza * 16785407) % 1073807359) + ((zzbbs.zza(strArr[i12]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
