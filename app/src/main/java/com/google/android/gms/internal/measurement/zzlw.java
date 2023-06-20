package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzlw {
    private static final Class zza;
    private static final zzml zzb;
    private static final zzml zzc;
    private static final zzml zzd;

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
        zzd = new zzmn();
    }

    public static zzml zzA() {
        return zzc;
    }

    public static zzml zzB() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzC(int i10, List list, zzkg zzkgVar, Object obj, zzml zzmlVar) {
        if (zzkgVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzkgVar.zza(intValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj = zzD(i10, intValue, obj, zzmlVar);
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
                if (!zzkgVar.zza(intValue2)) {
                    obj = zzD(i10, intValue2, obj, zzmlVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static Object zzD(int i10, int i11, Object obj, zzml zzmlVar) {
        if (obj == null) {
            obj = zzmlVar.zze();
        }
        zzmlVar.zzf(obj, i10, i11);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzE(zzjp zzjpVar, Object obj, Object obj2) {
        zzjpVar.zza(obj2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzF(zzml zzmlVar, Object obj, Object obj2) {
        zzmlVar.zzh(obj, zzmlVar.zzd(zzmlVar.zzc(obj), zzmlVar.zzc(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzkc.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzH(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzc(i10, list, z10);
    }

    public static void zzI(int i10, List list, zznd zzndVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zze(i10, list);
    }

    public static void zzJ(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzg(i10, list, z10);
    }

    public static void zzK(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzj(i10, list, z10);
    }

    public static void zzL(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzl(i10, list, z10);
    }

    public static void zzM(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzn(i10, list, z10);
    }

    public static void zzN(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzp(i10, list, z10);
    }

    public static void zzO(int i10, List list, zznd zzndVar, zzlu zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzjk) zzndVar).zzq(i10, list.get(i11), zzluVar);
        }
    }

    public static void zzP(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzs(i10, list, z10);
    }

    public static void zzQ(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzu(i10, list, z10);
    }

    public static void zzR(int i10, List list, zznd zzndVar, zzlu zzluVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((zzjk) zzndVar).zzv(i10, list.get(i11), zzluVar);
        }
    }

    public static void zzS(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzx(i10, list, z10);
    }

    public static void zzT(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzz(i10, list, z10);
    }

    public static void zzU(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzB(i10, list, z10);
    }

    public static void zzV(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzD(i10, list, z10);
    }

    public static void zzW(int i10, List list, zznd zzndVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzG(i10, list);
    }

    public static void zzX(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzI(i10, list, z10);
    }

    public static void zzY(int i10, List list, zznd zzndVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzndVar.zzK(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzZ(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjj.zzA(i10 << 3) + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzaa(zzle zzleVar, Object obj, Object obj2, long j10) {
        zzmv.zzs(obj, j10, zzle.zzb(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10)));
    }

    private static zzml zzab(boolean z10) {
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
            return (zzml) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
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
        int zzz = size * zzjj.zzz(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzz += zzjj.zzt((zzjb) list.get(i11));
        }
        return zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzjj.zzz(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkd) {
            zzkd zzkdVar = (zzkd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjj.zzv(zzkdVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjj.zzv(((Integer) list.get(i11)).intValue());
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
        return size * (zzjj.zzA(i10 << 3) + 4);
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
        return size * (zzjj.zzA(i10 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i10, List list, zzlu zzluVar) {
        int size = list.size();
        if (size != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += zzjj.zzu(i10, (zzlj) list.get(i12), zzluVar);
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
        return zzl(list) + (size * zzjj.zzz(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkd) {
            zzkd zzkdVar = (zzkd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjj.zzv(zzkdVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjj.zzv(((Integer) list.get(i11)).intValue());
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
        return zzn(list) + (list.size() * zzjj.zzz(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzky) {
            zzky zzkyVar = (zzky) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjj.zzB(zzkyVar.zza(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjj.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i10, Object obj, zzlu zzluVar) {
        if (obj instanceof zzkp) {
            int zzA = zzjj.zzA(i10 << 3);
            int zza2 = ((zzkp) obj).zza();
            return zzA + zzjj.zzA(zza2) + zza2;
        }
        return zzjj.zzA(i10 << 3) + zzjj.zzx((zzlj) obj, zzluVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i10, List list, zzlu zzluVar) {
        int zzx;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzz = zzjj.zzz(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzkp) {
                zzx = zzjj.zzw((zzkp) obj);
            } else {
                zzx = zzjj.zzx((zzlj) obj, zzluVar);
            }
            zzz += zzx;
        }
        return zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzq(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzjj.zzz(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkd) {
            zzkd zzkdVar = (zzkd) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzkdVar.zze(i11);
                i10 += zzjj.zzA((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzjj.zzA((intValue >> 31) ^ (intValue + intValue));
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
        return zzt(list) + (size * zzjj.zzz(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzky) {
            zzky zzkyVar = (zzky) list;
            i10 = 0;
            while (i11 < size) {
                long zza2 = zzkyVar.zza(i11);
                i10 += zzjj.zzB((zza2 >> 63) ^ (zza2 + zza2));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzjj.zzB((longValue >> 63) ^ (longValue + longValue));
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzu(int i10, List list) {
        int zzy;
        int zzy2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int zzz = zzjj.zzz(i10) * size;
        if (list instanceof zzkr) {
            zzkr zzkrVar = (zzkr) list;
            while (i11 < size) {
                Object zzf = zzkrVar.zzf(i11);
                if (zzf instanceof zzjb) {
                    zzy2 = zzjj.zzt((zzjb) zzf);
                } else {
                    zzy2 = zzjj.zzy((String) zzf);
                }
                zzz += zzy2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzjb) {
                    zzy = zzjj.zzt((zzjb) obj);
                } else {
                    zzy = zzjj.zzy((String) obj);
                }
                zzz += zzy;
                i11++;
            }
        }
        return zzz;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzv(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzjj.zzz(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkd) {
            zzkd zzkdVar = (zzkd) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjj.zzA(zzkdVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjj.zzA(((Integer) list.get(i11)).intValue());
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
        return zzy(list) + (size * zzjj.zzz(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzy(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzky) {
            zzky zzkyVar = (zzky) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzjj.zzB(zzkyVar.zza(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzjj.zzB(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzml zzz() {
        return zzb;
    }
}
