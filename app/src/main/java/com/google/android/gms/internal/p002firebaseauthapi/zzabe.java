package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabe  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzabe {
    private static final Class zza;
    private static final zzabt zzb;
    private static final zzabt zzc;
    private static final zzabt zzd;

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
        zzd = new zzabv();
    }

    public static zzabt zzA() {
        return zzc;
    }

    public static zzabt zzB() {
        return zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzC(int i10, List list, zzzp zzzpVar, Object obj, zzabt zzabtVar) {
        if (zzzpVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int intValue = ((Integer) list.get(i12)).intValue();
                if (zzzpVar.zza()) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(intValue));
                    }
                    i11++;
                } else {
                    obj = zzD(i10, intValue, obj, zzabtVar);
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
                if (!zzzpVar.zza()) {
                    obj = zzD(i10, intValue2, obj, zzabtVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzD(int i10, int i11, Object obj, zzabt zzabtVar) {
        if (obj == null) {
            obj = zzabtVar.zzf();
        }
        zzabtVar.zzl(obj, i10, i11);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzE(zzyz zzyzVar, Object obj, Object obj2) {
        zzyzVar.zza(obj2);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzF(zzabt zzabtVar, Object obj, Object obj2) {
        zzabtVar.zzo(obj, zzabtVar.zze(zzabtVar.zzd(obj), zzabtVar.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzzl.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzI(zzaal zzaalVar, Object obj, Object obj2, long j10) {
        zzacd.zzs(obj, j10, zzaal.zzc(zzacd.zzf(obj, j10), zzacd.zzf(obj2, j10)));
    }

    public static void zzJ(int i10, List list, zzyu zzyuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzc(i10, list, z10);
    }

    public static void zzK(int i10, List list, zzyu zzyuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zze(i10, list);
    }

    public static void zzL(int i10, List list, zzyu zzyuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzg(i10, list, z10);
    }

    public static void zzM(int i10, List list, zzyu zzyuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzj(i10, list, z10);
    }

    public static void zzN(int i10, List list, zzyu zzyuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzl(i10, list, z10);
    }

    public static void zzO(int i10, List list, zzyu zzyuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzn(i10, list, z10);
    }

    public static void zzP(int i10, List list, zzyu zzyuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzp(i10, list, z10);
    }

    public static void zzQ(int i10, List list, zzyu zzyuVar, zzabc zzabcVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzyuVar.zzq(i10, list.get(i11), zzabcVar);
        }
    }

    public static void zzR(int i10, List list, zzyu zzyuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzs(i10, list, z10);
    }

    public static void zzS(int i10, List list, zzyu zzyuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzu(i10, list, z10);
    }

    public static void zzT(int i10, List list, zzyu zzyuVar, zzabc zzabcVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzyuVar.zzv(i10, list.get(i11), zzabcVar);
        }
    }

    public static void zzU(int i10, List list, zzyu zzyuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzx(i10, list, z10);
    }

    public static void zzV(int i10, List list, zzyu zzyuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzz(i10, list, z10);
    }

    public static void zzW(int i10, List list, zzyu zzyuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzB(i10, list, z10);
    }

    public static void zzX(int i10, List list, zzyu zzyuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzD(i10, list, z10);
    }

    public static void zzY(int i10, List list, zzyu zzyuVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzG(i10, list);
    }

    public static void zzZ(int i10, List list, zzyu zzyuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzI(i10, list, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zza(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzyt.zzE(i10 << 3) + 1);
    }

    public static void zzaa(int i10, List list, zzyu zzyuVar, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzyuVar.zzK(i10, list, z10);
    }

    private static zzabt zzab(boolean z10) {
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
            return (zzabt) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
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
        int zzD = size * zzyt.zzD(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            zzD += zzyt.zzw((zzyi) list.get(i11));
        }
        return zzD;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzyt.zzD(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zze(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzm) {
            zzzm zzzmVar = (zzzm) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzyt.zzy(zzzmVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzyt.zzy(((Integer) list.get(i11)).intValue());
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
        return size * (zzyt.zzE(i10 << 3) + 4);
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
        return size * (zzyt.zzE(i10 << 3) + 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzi(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzj(int i10, List list, zzabc zzabcVar) {
        int size = list.size();
        if (size != 0) {
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                i11 += zzyt.zzx(i10, (zzaaq) list.get(i12), zzabcVar);
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
        return zzl(list) + (size * zzyt.zzD(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzl(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzm) {
            zzzm zzzmVar = (zzzm) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzyt.zzy(zzzmVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzyt.zzy(((Integer) list.get(i11)).intValue());
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
        return zzn(list) + (list.size() * zzyt.zzD(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzn(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaaf) {
            zzaaf zzaafVar = (zzaaf) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzyt.zzF(zzaafVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzyt.zzF(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzo(int i10, Object obj, zzabc zzabcVar) {
        if (obj instanceof zzzw) {
            int zzE = zzyt.zzE(i10 << 3);
            int zza2 = ((zzzw) obj).zza();
            return zzE + zzyt.zzE(zza2) + zza2;
        }
        return zzyt.zzE(i10 << 3) + zzyt.zzA((zzaaq) obj, zzabcVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzp(int i10, List list, zzabc zzabcVar) {
        int zzA;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzyt.zzD(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof zzzw) {
                zzA = zzyt.zzz((zzzw) obj);
            } else {
                zzA = zzyt.zzA((zzaaq) obj, zzabcVar);
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
        return zzr(list) + (size * zzyt.zzD(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzr(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzm) {
            zzzm zzzmVar = (zzzm) list;
            i10 = 0;
            while (i11 < size) {
                int zze = zzzmVar.zze(i11);
                i10 += zzyt.zzE((zze >> 31) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                int intValue = ((Integer) list.get(i11)).intValue();
                i10 += zzyt.zzE((intValue >> 31) ^ (intValue + intValue));
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
        return zzt(list) + (size * zzyt.zzD(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzt(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaaf) {
            zzaaf zzaafVar = (zzaaf) list;
            i10 = 0;
            while (i11 < size) {
                long zze = zzaafVar.zze(i11);
                i10 += zzyt.zzF((zze >> 63) ^ (zze + zze));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                long longValue = ((Long) list.get(i11)).longValue();
                i10 += zzyt.zzF((longValue >> 63) ^ (longValue + longValue));
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
        int zzD = zzyt.zzD(i10) * size;
        if (list instanceof zzzy) {
            zzzy zzzyVar = (zzzy) list;
            while (i11 < size) {
                Object zzf = zzzyVar.zzf(i11);
                if (zzf instanceof zzyi) {
                    zzC2 = zzyt.zzw((zzyi) zzf);
                } else {
                    zzC2 = zzyt.zzC((String) zzf);
                }
                zzD += zzC2;
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                if (obj instanceof zzyi) {
                    zzC = zzyt.zzw((zzyi) obj);
                } else {
                    zzC = zzyt.zzC((String) obj);
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
        return zzw(list) + (size * zzyt.zzD(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzw(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzm) {
            zzzm zzzmVar = (zzzm) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzyt.zzE(zzzmVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzyt.zzE(((Integer) list.get(i11)).intValue());
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
        return zzy(list) + (size * zzyt.zzD(i10));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzy(List list) {
        int i10;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaaf) {
            zzaaf zzaafVar = (zzaaf) list;
            i10 = 0;
            while (i11 < size) {
                i10 += zzyt.zzF(zzaafVar.zze(i11));
                i11++;
            }
        } else {
            i10 = 0;
            while (i11 < size) {
                i10 += zzyt.zzF(((Long) list.get(i11)).longValue());
                i11++;
            }
        }
        return i10;
    }

    public static zzabt zzz() {
        return zzb;
    }
}
