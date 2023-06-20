package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgmv {
    private static final Class zza;
    private static final zzgnk zzb;
    private static final zzgnk zzc;
    private static final zzgnk zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzgnm();
    }

    public static zzgnk zzA() {
        return zzc;
    }

    public static zzgnk zzB() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzC(int i10, List list, zzgku zzgkuVar, Object obj, zzgnk zzgnkVar) {
        if (zzgkuVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzgkuVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj = zzD(i10, intValue, obj, zzgnkVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgkuVar.zza(intValue2)) {
                    obj = zzD(i10, intValue2, obj, zzgnkVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzD(int i10, int i11, Object obj, zzgnk zzgnkVar) {
        if (obj == null) {
            obj = zzgnkVar.zzf();
        }
        zzgnkVar.zzl(obj, i10, i11);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzE(zzgkd zzgkdVar, Object obj, Object obj2) {
        zzgkdVar.zza(obj2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzF(zzgnk zzgnkVar, Object obj, Object obj2) {
        zzgnkVar.zzo(obj, zzgnkVar.zze(zzgnkVar.zzd(obj), zzgnkVar.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzgkq.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzI(zzglv zzglvVar, Object obj, Object obj2, long j10) {
        zzgnu.zzv(obj, j10, zzglv.zzc(zzgnu.zzh(obj, j10), zzgnu.zzh(obj2, j10)));
    }

    public static void zzJ(int i10, List list, zzgjy zzgjyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzc(i10, list, z10);
    }

    public static void zzK(int i10, List list, zzgjy zzgjyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zze(i10, list);
    }

    public static void zzL(int i10, List list, zzgjy zzgjyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzg(i10, list, z10);
    }

    public static void zzM(int i10, List list, zzgjy zzgjyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzj(i10, list, z10);
    }

    public static void zzN(int i10, List list, zzgjy zzgjyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzl(i10, list, z10);
    }

    public static void zzO(int i10, List list, zzgjy zzgjyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzn(i10, list, z10);
    }

    public static void zzP(int i10, List list, zzgjy zzgjyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzp(i10, list, z10);
    }

    public static void zzQ(int i10, List list, zzgjy zzgjyVar, zzgmt zzgmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzgjyVar.zzq(i10, list.get(i11), zzgmtVar);
        }
    }

    public static void zzR(int i10, List list, zzgjy zzgjyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzs(i10, list, z10);
    }

    public static void zzS(int i10, List list, zzgjy zzgjyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzu(i10, list, z10);
    }

    public static void zzT(int i10, List list, zzgjy zzgjyVar, zzgmt zzgmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzgjyVar.zzv(i10, list.get(i11), zzgmtVar);
        }
    }

    public static void zzU(int i10, List list, zzgjy zzgjyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzx(i10, list, z10);
    }

    public static void zzV(int i10, List list, zzgjy zzgjyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzz(i10, list, z10);
    }

    public static void zzW(int i10, List list, zzgjy zzgjyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzB(i10, list, z10);
    }

    public static void zzX(int i10, List list, zzgjy zzgjyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzD(i10, list, z10);
    }

    public static void zzY(int i10, List list, zzgjy zzgjyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzG(i10, list);
    }

    public static void zzZ(int i10, List list, zzgjy zzgjyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzI(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgjx.zzE(i10 << 3) + 1);
    }

    public static void zzaa(int i10, List list, zzgjy zzgjyVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzK(i10, list, z10);
    }

    private static zzgnk zzab(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgnk) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzb(List list) {
        return list.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzc(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = size * zzgjx.zzD(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzD += zzgjx.zzw((zzgji) list.get(i11));
        }
        return zzD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzgjx.zzD(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkr) {
            zzgkr zzgkrVar = (zzgkr) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgjx.zzy(zzgkrVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgjx.zzy(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzf(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgjx.zzE(i10 << 3) + 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzg(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzh(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzgjx.zzE(i10 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i10, List list, zzgmt zzgmtVar) {
        int size = list.size();
        if (size != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += zzgjx.zzx(i10, (zzgma) list.get(i12), zzgmtVar);
            }
            return i11;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzgjx.zzD(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkr) {
            zzgkr zzgkrVar = (zzgkr) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgjx.zzy(zzgkrVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgjx.zzy(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzm(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzgjx.zzD(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzglp) {
            zzglp zzglpVar = (zzglp) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgjx.zzF(zzglpVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgjx.zzF(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i10, Object obj, zzgmt zzgmtVar) {
        if (obj instanceof zzglg) {
            int zzE = zzgjx.zzE(i10 << 3);
            int zza2 = ((zzglg) obj).zza();
            return zzE + zzgjx.zzE(zza2) + zza2;
        }
        return zzgjx.zzE(i10 << 3) + zzgjx.zzA((zzgma) obj, zzgmtVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i10, List list, zzgmt zzgmtVar) {
        int zzA;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjx.zzD(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzglg) {
                zzA = zzgjx.zzz((zzglg) obj);
            } else {
                zzA = zzgjx.zzA((zzgma) obj, zzgmtVar);
            }
            zzD += zzA;
        }
        return zzD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzgjx.zzD(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkr) {
            zzgkr zzgkrVar = (zzgkr) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzgkrVar.zze(i11);
                i10 += zzgjx.zzE((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzgjx.zzE((intValue >> 31) ^ (intValue + intValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzs(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzgjx.zzD(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzglp) {
            zzglp zzglpVar = (zzglp) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzglpVar.zze(i11);
                i10 += zzgjx.zzF((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzgjx.zzF((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i10, List list) {
        int zzC;
        int zzC2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjx.zzD(i10) * size;
        if (list instanceof zzgli) {
            zzgli zzgliVar = (zzgli) list;
            while (i11 < size) {
                Object zzf = zzgliVar.zzf(i11);
                if (zzf instanceof zzgji) {
                    zzC2 = zzgjx.zzw((zzgji) zzf);
                } else {
                    zzC2 = zzgjx.zzC((String) zzf);
                }
                zzD += zzC2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzgji) {
                    zzC = zzgjx.zzw((zzgji) obj);
                } else {
                    zzC = zzgjx.zzC((String) obj);
                }
                zzD += zzC;
                i11++;
            }
        }
        return zzD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzgjx.zzD(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkr) {
            zzgkr zzgkrVar = (zzgkr) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgjx.zzE(zzgkrVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgjx.zzE(((Integer) list.get(i11)).intValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzx(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzgjx.zzD(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzy(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzglp) {
            zzglp zzglpVar = (zzglp) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzgjx.zzF(zzglpVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzgjx.zzF(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzgnk zzz() {
        return zzb;
    }
}
