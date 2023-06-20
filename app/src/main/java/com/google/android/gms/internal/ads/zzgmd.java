package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgmd<T> implements zzgmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgnu.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgma zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzglo zzn;
    private final zzgnk zzo;
    private final zzgkd zzp;
    private final zzgmf zzq;
    private final zzglv zzr;

    private zzgmd(int[] iArr, Object[] objArr, int i10, int i11, zzgma zzgmaVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzgmf zzgmfVar, zzglo zzgloVar, zzgnk zzgnkVar, zzgkd zzgkdVar, zzglv zzglvVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzgmaVar instanceof zzgkq;
        this.zzj = z10;
        boolean z12 = false;
        if (zzgkdVar != null && zzgkdVar.zzh(zzgmaVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzk = iArr2;
        this.zzl = i12;
        this.zzm = i13;
        this.zzq = zzgmfVar;
        this.zzn = zzgloVar;
        this.zzo = zzgnkVar;
        this.zzp = zzgkdVar;
        this.zzg = zzgmaVar;
        this.zzr = zzglvVar;
    }

    private final int zzA(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zzB(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzC(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzD(Object obj, long j10) {
        return ((Long) zzgnu.zzh(obj, j10)).longValue();
    }

    private final zzgku zzE(int i10) {
        int i11 = i10 / 3;
        return (zzgku) this.zzd[i11 + i11 + 1];
    }

    private final zzgmt zzF(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgmt zzgmtVar = (zzgmt) this.zzd[i12];
        if (zzgmtVar != null) {
            return zzgmtVar;
        }
        zzgmt zzb2 = zzgmi.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzG(Object obj, int i10, Object obj2, zzgnk zzgnkVar) {
        int i11 = this.zzc[i10];
        Object zzh = zzgnu.zzh(obj, zzC(i10) & 1048575);
        if (zzh == null || zzE(i10) == null) {
            return obj2;
        }
        zzglu zzgluVar = (zzglu) zzh;
        zzglt zzgltVar = (zzglt) zzH(i10);
        throw null;
    }

    private final Object zzH(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private static Field zzI(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i10) {
        long zzC = zzC(i10) & 1048575;
        if (zzQ(obj2, i10)) {
            Object zzh = zzgnu.zzh(obj, zzC);
            Object zzh2 = zzgnu.zzh(obj2, zzC);
            if (zzh != null && zzh2 != null) {
                zzgnu.zzv(obj, zzC, zzgla.zzg(zzh, zzh2));
                zzM(obj, i10);
            } else if (zzh2 != null) {
                zzgnu.zzv(obj, zzC, zzh2);
                zzM(obj, i10);
            }
        }
    }

    private final void zzK(Object obj, Object obj2, int i10) {
        int zzC = zzC(i10);
        int i11 = this.zzc[i10];
        long j10 = zzC & 1048575;
        if (zzT(obj2, i11, i10)) {
            Object zzh = zzT(obj, i11, i10) ? zzgnu.zzh(obj, j10) : null;
            Object zzh2 = zzgnu.zzh(obj2, j10);
            if (zzh != null && zzh2 != null) {
                zzgnu.zzv(obj, j10, zzgla.zzg(zzh, zzh2));
                zzN(obj, i11, i10);
            } else if (zzh2 != null) {
                zzgnu.zzv(obj, j10, zzh2);
                zzN(obj, i11, i10);
            }
        }
    }

    private final void zzL(Object obj, int i10, zzgml zzgmlVar) throws IOException {
        if (zzP(i10)) {
            zzgnu.zzv(obj, i10 & 1048575, zzgmlVar.zzu());
        } else if (this.zzi) {
            zzgnu.zzv(obj, i10 & 1048575, zzgmlVar.zzt());
        } else {
            zzgnu.zzv(obj, i10 & 1048575, zzgmlVar.zzp());
        }
    }

    private final void zzM(Object obj, int i10) {
        int zzz = zzz(i10);
        long j10 = 1048575 & zzz;
        if (j10 == 1048575) {
            return;
        }
        zzgnu.zzt(obj, j10, (1 << (zzz >>> 20)) | zzgnu.zzd(obj, j10));
    }

    private final void zzN(Object obj, int i10, int i11) {
        zzgnu.zzt(obj, zzz(i11) & 1048575, i10);
    }

    private final boolean zzO(Object obj, Object obj2, int i10) {
        return zzQ(obj, i10) == zzQ(obj2, i10);
    }

    private static boolean zzP(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzQ(Object obj, int i10) {
        int zzz = zzz(i10);
        long j10 = zzz & 1048575;
        if (j10 != 1048575) {
            return (zzgnu.zzd(obj, j10) & (1 << (zzz >>> 20))) != 0;
        }
        int zzC = zzC(i10);
        long j11 = zzC & 1048575;
        switch (zzB(zzC)) {
            case 0:
                return Double.doubleToRawLongBits(zzgnu.zzb(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgnu.zzc(obj, j11)) != 0;
            case 2:
                return zzgnu.zzf(obj, j11) != 0;
            case 3:
                return zzgnu.zzf(obj, j11) != 0;
            case 4:
                return zzgnu.zzd(obj, j11) != 0;
            case 5:
                return zzgnu.zzf(obj, j11) != 0;
            case 6:
                return zzgnu.zzd(obj, j11) != 0;
            case 7:
                return zzgnu.zzz(obj, j11);
            case 8:
                Object zzh = zzgnu.zzh(obj, j11);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                } else if (zzh instanceof zzgji) {
                    return !zzgji.zzb.equals(zzh);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzgnu.zzh(obj, j11) != null;
            case 10:
                return !zzgji.zzb.equals(zzgnu.zzh(obj, j11));
            case 11:
                return zzgnu.zzd(obj, j11) != 0;
            case 12:
                return zzgnu.zzd(obj, j11) != 0;
            case 13:
                return zzgnu.zzd(obj, j11) != 0;
            case 14:
                return zzgnu.zzf(obj, j11) != 0;
            case 15:
                return zzgnu.zzd(obj, j11) != 0;
            case 16:
                return zzgnu.zzf(obj, j11) != 0;
            case 17:
                return zzgnu.zzh(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzR(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzQ(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzS(Object obj, int i10, zzgmt zzgmtVar) {
        return zzgmtVar.zzk(zzgnu.zzh(obj, i10 & 1048575));
    }

    private final boolean zzT(Object obj, int i10, int i11) {
        return zzgnu.zzd(obj, (long) (zzz(i11) & 1048575)) == i10;
    }

    private static boolean zzU(Object obj, long j10) {
        return ((Boolean) zzgnu.zzh(obj, j10)).booleanValue();
    }

    private final void zzV(Object obj, zzgjy zzgjyVar) throws IOException {
        int i10;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i11 = 1048575;
            int i12 = 0;
            int i13 = 0;
            int i14 = 1048575;
            while (i12 < length) {
                int zzC = zzC(i12);
                int[] iArr = this.zzc;
                int i15 = iArr[i12];
                int zzB = zzB(zzC);
                if (zzB <= 17) {
                    int i16 = iArr[i12 + 2];
                    int i17 = i16 & i11;
                    if (i17 != i14) {
                        i13 = unsafe.getInt(obj, i17);
                        i14 = i17;
                    }
                    i10 = 1 << (i16 >>> 20);
                } else {
                    i10 = 0;
                }
                long j10 = zzC & i11;
                switch (zzB) {
                    case 0:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzf(i15, zzgnu.zzb(obj, j10));
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 1:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzo(i15, zzgnu.zzc(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 2:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzt(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 3:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzJ(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 4:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzr(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 5:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzm(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 6:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzk(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 7:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzb(i15, zzgnu.zzz(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 8:
                        if ((i13 & i10) != 0) {
                            zzX(i15, unsafe.getObject(obj, j10), zzgjyVar);
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 9:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzv(i15, unsafe.getObject(obj, j10), zzF(i12));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 10:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzd(i15, (zzgji) unsafe.getObject(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 11:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzH(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 12:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzi(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 13:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzw(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 14:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzy(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 15:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzA(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 16:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzC(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 17:
                        if ((i13 & i10) != 0) {
                            zzgjyVar.zzq(i15, unsafe.getObject(obj, j10), zzF(i12));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 18:
                        zzgmv.zzL(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 19:
                        zzgmv.zzP(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 20:
                        zzgmv.zzS(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 21:
                        zzgmv.zzaa(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 22:
                        zzgmv.zzR(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 23:
                        zzgmv.zzO(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 24:
                        zzgmv.zzN(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 25:
                        zzgmv.zzJ(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 26:
                        zzgmv.zzY(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar);
                        break;
                    case 27:
                        zzgmv.zzT(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, zzF(i12));
                        break;
                    case 28:
                        zzgmv.zzK(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar);
                        break;
                    case 29:
                        zzgmv.zzZ(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, false);
                        break;
                    case 30:
                        zzgmv.zzM(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, false);
                        break;
                    case 31:
                        zzgmv.zzU(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, false);
                        break;
                    case 32:
                        zzgmv.zzV(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, false);
                        break;
                    case 33:
                        zzgmv.zzW(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, false);
                        break;
                    case 34:
                        zzgmv.zzX(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, false);
                        break;
                    case 35:
                        zzgmv.zzL(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, true);
                        break;
                    case 36:
                        zzgmv.zzP(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, true);
                        break;
                    case 37:
                        zzgmv.zzS(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, true);
                        break;
                    case 38:
                        zzgmv.zzaa(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, true);
                        break;
                    case 39:
                        zzgmv.zzR(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, true);
                        break;
                    case 40:
                        zzgmv.zzO(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, true);
                        break;
                    case 41:
                        zzgmv.zzN(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, true);
                        break;
                    case 42:
                        zzgmv.zzJ(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, true);
                        break;
                    case 43:
                        zzgmv.zzZ(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, true);
                        break;
                    case 44:
                        zzgmv.zzM(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, true);
                        break;
                    case 45:
                        zzgmv.zzU(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, true);
                        break;
                    case 46:
                        zzgmv.zzV(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, true);
                        break;
                    case 47:
                        zzgmv.zzW(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, true);
                        break;
                    case 48:
                        zzgmv.zzX(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, true);
                        break;
                    case 49:
                        zzgmv.zzQ(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzgjyVar, zzF(i12));
                        break;
                    case 50:
                        zzW(zzgjyVar, i15, unsafe.getObject(obj, j10), i12);
                        break;
                    case 51:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzf(i15, zzo(obj, j10));
                            break;
                        }
                        break;
                    case 52:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzo(i15, zzp(obj, j10));
                            break;
                        }
                        break;
                    case 53:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzt(i15, zzD(obj, j10));
                            break;
                        }
                        break;
                    case 54:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzJ(i15, zzD(obj, j10));
                            break;
                        }
                        break;
                    case 55:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzr(i15, zzs(obj, j10));
                            break;
                        }
                        break;
                    case 56:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzm(i15, zzD(obj, j10));
                            break;
                        }
                        break;
                    case 57:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzk(i15, zzs(obj, j10));
                            break;
                        }
                        break;
                    case 58:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzb(i15, zzU(obj, j10));
                            break;
                        }
                        break;
                    case 59:
                        if (zzT(obj, i15, i12)) {
                            zzX(i15, unsafe.getObject(obj, j10), zzgjyVar);
                            break;
                        }
                        break;
                    case 60:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzv(i15, unsafe.getObject(obj, j10), zzF(i12));
                            break;
                        }
                        break;
                    case 61:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzd(i15, (zzgji) unsafe.getObject(obj, j10));
                            break;
                        }
                        break;
                    case 62:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzH(i15, zzs(obj, j10));
                            break;
                        }
                        break;
                    case 63:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzi(i15, zzs(obj, j10));
                            break;
                        }
                        break;
                    case 64:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzw(i15, zzs(obj, j10));
                            break;
                        }
                        break;
                    case 65:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzy(i15, zzD(obj, j10));
                            break;
                        }
                        break;
                    case 66:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzA(i15, zzs(obj, j10));
                            break;
                        }
                        break;
                    case 67:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzC(i15, zzD(obj, j10));
                            break;
                        }
                        break;
                    case 68:
                        if (zzT(obj, i15, i12)) {
                            zzgjyVar.zzq(i15, unsafe.getObject(obj, j10), zzF(i12));
                            break;
                        }
                        break;
                }
                i12 += 3;
                i11 = 1048575;
            }
            zzgnk zzgnkVar = this.zzo;
            zzgnkVar.zzr(zzgnkVar.zzd(obj), zzgjyVar);
            return;
        }
        this.zzp.zza(obj);
        throw null;
    }

    private final void zzW(zzgjy zzgjyVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        zzglt zzgltVar = (zzglt) zzH(i11);
        throw null;
    }

    private static final void zzX(int i10, Object obj, zzgjy zzgjyVar) throws IOException {
        if (obj instanceof String) {
            zzgjyVar.zzF(i10, (String) obj);
        } else {
            zzgjyVar.zzd(i10, (zzgji) obj);
        }
    }

    static zzgnl zzd(Object obj) {
        zzgkq zzgkqVar = (zzgkq) obj;
        zzgnl zzgnlVar = zzgkqVar.zzc;
        if (zzgnlVar == zzgnl.zzc()) {
            zzgnl zze = zzgnl.zze();
            zzgkqVar.zzc = zze;
            return zze;
        }
        return zzgnlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzgmd zzl(Class cls, zzglx zzglxVar, zzgmf zzgmfVar, zzglo zzgloVar, zzgnk zzgnkVar, zzgkd zzgkdVar, zzglv zzglvVar) {
        if (zzglxVar instanceof zzgmk) {
            return zzm((zzgmk) zzglxVar, zzgmfVar, zzgloVar, zzgnkVar, zzgkdVar, zzglvVar);
        }
        zzgnh zzgnhVar = (zzgnh) zzglxVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.ads.zzgmd zzm(com.google.android.gms.internal.ads.zzgmk r34, com.google.android.gms.internal.ads.zzgmf r35, com.google.android.gms.internal.ads.zzglo r36, com.google.android.gms.internal.ads.zzgnk r37, com.google.android.gms.internal.ads.zzgkd r38, com.google.android.gms.internal.ads.zzglv r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgmd.zzm(com.google.android.gms.internal.ads.zzgmk, com.google.android.gms.internal.ads.zzgmf, com.google.android.gms.internal.ads.zzglo, com.google.android.gms.internal.ads.zzgnk, com.google.android.gms.internal.ads.zzgkd, com.google.android.gms.internal.ads.zzglv):com.google.android.gms.internal.ads.zzgmd");
    }

    private static double zzo(Object obj, long j10) {
        return ((Double) zzgnu.zzh(obj, j10)).doubleValue();
    }

    private static float zzp(Object obj, long j10) {
        return ((Float) zzgnu.zzh(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzq(Object obj) {
        int i10;
        int zzE;
        int zzE2;
        int zzE3;
        int zzF;
        int zzE4;
        int zzy;
        int zzE5;
        int zzE6;
        int zzd;
        int zzE7;
        int i11;
        int zzu;
        int zzi;
        int zzD;
        int zzE8;
        int i12;
        int zzE9;
        int zzE10;
        int zzE11;
        int zzF2;
        int zzE12;
        int zzd2;
        int zzE13;
        int i13;
        Unsafe unsafe = zzb;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (i15 < this.zzc.length) {
            int zzC = zzC(i15);
            int[] iArr = this.zzc;
            int i19 = iArr[i15];
            int zzB = zzB(zzC);
            if (zzB <= 17) {
                int i20 = iArr[i15 + 2];
                int i21 = i20 & i14;
                i10 = 1 << (i20 >>> 20);
                if (i21 != i18) {
                    i17 = unsafe.getInt(obj, i21);
                    i18 = i21;
                }
            } else {
                i10 = 0;
            }
            long j10 = zzC & i14;
            switch (zzB) {
                case 0:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE = zzgjx.zzE(i19 << 3);
                        zzE5 = zzE + 8;
                        i16 += zzE5;
                        break;
                    }
                case 1:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE2 = zzgjx.zzE(i19 << 3);
                        zzE5 = zzE2 + 4;
                        i16 += zzE5;
                        break;
                    }
                case 2:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(obj, j10);
                        zzE3 = zzgjx.zzE(i19 << 3);
                        zzF = zzgjx.zzF(j11);
                        i16 += zzE3 + zzF;
                        break;
                    }
                case 3:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(obj, j10);
                        zzE3 = zzgjx.zzE(i19 << 3);
                        zzF = zzgjx.zzF(j12);
                        i16 += zzE3 + zzF;
                        break;
                    }
                case 4:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i22 = unsafe.getInt(obj, j10);
                        zzE4 = zzgjx.zzE(i19 << 3);
                        zzy = zzgjx.zzy(i22);
                        i11 = zzE4 + zzy;
                        i16 += i11;
                        break;
                    }
                case 5:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE = zzgjx.zzE(i19 << 3);
                        zzE5 = zzE + 8;
                        i16 += zzE5;
                        break;
                    }
                case 6:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE2 = zzgjx.zzE(i19 << 3);
                        zzE5 = zzE2 + 4;
                        i16 += zzE5;
                        break;
                    }
                case 7:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE5 = zzgjx.zzE(i19 << 3) + 1;
                        i16 += zzE5;
                        break;
                    }
                case 8:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzgji) {
                            zzE6 = zzgjx.zzE(i19 << 3);
                            zzd = ((zzgji) object).zzd();
                            zzE7 = zzgjx.zzE(zzd);
                            i11 = zzE6 + zzE7 + zzd;
                            i16 += i11;
                            break;
                        } else {
                            zzE4 = zzgjx.zzE(i19 << 3);
                            zzy = zzgjx.zzC((String) object);
                            i11 = zzE4 + zzy;
                            i16 += i11;
                        }
                    }
                case 9:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE5 = zzgmv.zzo(i19, unsafe.getObject(obj, j10), zzF(i15));
                        i16 += zzE5;
                        break;
                    }
                case 10:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE6 = zzgjx.zzE(i19 << 3);
                        zzd = ((zzgji) unsafe.getObject(obj, j10)).zzd();
                        zzE7 = zzgjx.zzE(zzd);
                        i11 = zzE6 + zzE7 + zzd;
                        i16 += i11;
                        break;
                    }
                case 11:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i23 = unsafe.getInt(obj, j10);
                        zzE4 = zzgjx.zzE(i19 << 3);
                        zzy = zzgjx.zzE(i23);
                        i11 = zzE4 + zzy;
                        i16 += i11;
                        break;
                    }
                case 12:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i24 = unsafe.getInt(obj, j10);
                        zzE4 = zzgjx.zzE(i19 << 3);
                        zzy = zzgjx.zzy(i24);
                        i11 = zzE4 + zzy;
                        i16 += i11;
                        break;
                    }
                case 13:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE2 = zzgjx.zzE(i19 << 3);
                        zzE5 = zzE2 + 4;
                        i16 += zzE5;
                        break;
                    }
                case 14:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE = zzgjx.zzE(i19 << 3);
                        zzE5 = zzE + 8;
                        i16 += zzE5;
                        break;
                    }
                case 15:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i25 = unsafe.getInt(obj, j10);
                        zzE4 = zzgjx.zzE(i19 << 3);
                        zzy = zzgjx.zzE((i25 >> 31) ^ (i25 + i25));
                        i11 = zzE4 + zzy;
                        i16 += i11;
                        break;
                    }
                case 16:
                    if ((i10 & i17) == 0) {
                        break;
                    } else {
                        long j13 = unsafe.getLong(obj, j10);
                        i16 += zzgjx.zzE(i19 << 3) + zzgjx.zzF((j13 >> 63) ^ (j13 + j13));
                        break;
                    }
                case 17:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE5 = zzgjx.zzx(i19, (zzgma) unsafe.getObject(obj, j10), zzF(i15));
                        i16 += zzE5;
                        break;
                    }
                case 18:
                    zzE5 = zzgmv.zzh(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 19:
                    zzE5 = zzgmv.zzf(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 20:
                    zzE5 = zzgmv.zzm(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 21:
                    zzE5 = zzgmv.zzx(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 22:
                    zzE5 = zzgmv.zzk(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 23:
                    zzE5 = zzgmv.zzh(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 24:
                    zzE5 = zzgmv.zzf(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 25:
                    zzE5 = zzgmv.zza(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 26:
                    zzu = zzgmv.zzu(i19, (List) unsafe.getObject(obj, j10));
                    i16 += zzu;
                    break;
                case 27:
                    zzu = zzgmv.zzp(i19, (List) unsafe.getObject(obj, j10), zzF(i15));
                    i16 += zzu;
                    break;
                case 28:
                    zzu = zzgmv.zzc(i19, (List) unsafe.getObject(obj, j10));
                    i16 += zzu;
                    break;
                case 29:
                    zzu = zzgmv.zzv(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 30:
                    zzu = zzgmv.zzd(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 31:
                    zzu = zzgmv.zzf(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 32:
                    zzu = zzgmv.zzh(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 33:
                    zzu = zzgmv.zzq(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 34:
                    zzu = zzgmv.zzs(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 35:
                    zzi = zzgmv.zzi((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i19);
                        zzE8 = zzgjx.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 36:
                    zzi = zzgmv.zzg((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i19);
                        zzE8 = zzgjx.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 37:
                    zzi = zzgmv.zzn((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i19);
                        zzE8 = zzgjx.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 38:
                    zzi = zzgmv.zzy((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i19);
                        zzE8 = zzgjx.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 39:
                    zzi = zzgmv.zzl((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i19);
                        zzE8 = zzgjx.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 40:
                    zzi = zzgmv.zzi((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i19);
                        zzE8 = zzgjx.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 41:
                    zzi = zzgmv.zzg((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i19);
                        zzE8 = zzgjx.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 42:
                    zzi = zzgmv.zzb((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i19);
                        zzE8 = zzgjx.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 43:
                    zzi = zzgmv.zzw((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i19);
                        zzE8 = zzgjx.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 44:
                    zzi = zzgmv.zze((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i19);
                        zzE8 = zzgjx.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 45:
                    zzi = zzgmv.zzg((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i19);
                        zzE8 = zzgjx.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 46:
                    zzi = zzgmv.zzi((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i19);
                        zzE8 = zzgjx.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 47:
                    zzi = zzgmv.zzr((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i19);
                        zzE8 = zzgjx.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 48:
                    zzi = zzgmv.zzt((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i19);
                        zzE8 = zzgjx.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 49:
                    zzu = zzgmv.zzj(i19, (List) unsafe.getObject(obj, j10), zzF(i15));
                    i16 += zzu;
                    break;
                case 50:
                    zzglv.zza(i19, unsafe.getObject(obj, j10), zzH(i15));
                    break;
                case 51:
                    if (zzT(obj, i19, i15)) {
                        zzE9 = zzgjx.zzE(i19 << 3);
                        zzu = zzE9 + 8;
                        i16 += zzu;
                    }
                    break;
                case 52:
                    if (zzT(obj, i19, i15)) {
                        zzE10 = zzgjx.zzE(i19 << 3);
                        zzu = zzE10 + 4;
                        i16 += zzu;
                    }
                    break;
                case 53:
                    if (zzT(obj, i19, i15)) {
                        long zzD2 = zzD(obj, j10);
                        zzE11 = zzgjx.zzE(i19 << 3);
                        zzF2 = zzgjx.zzF(zzD2);
                        i16 += zzE11 + zzF2;
                    }
                    break;
                case 54:
                    if (zzT(obj, i19, i15)) {
                        long zzD3 = zzD(obj, j10);
                        zzE11 = zzgjx.zzE(i19 << 3);
                        zzF2 = zzgjx.zzF(zzD3);
                        i16 += zzE11 + zzF2;
                    }
                    break;
                case 55:
                    if (zzT(obj, i19, i15)) {
                        int zzs = zzs(obj, j10);
                        i12 = zzgjx.zzE(i19 << 3);
                        zzi = zzgjx.zzy(zzs);
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 56:
                    if (zzT(obj, i19, i15)) {
                        zzE9 = zzgjx.zzE(i19 << 3);
                        zzu = zzE9 + 8;
                        i16 += zzu;
                    }
                    break;
                case 57:
                    if (zzT(obj, i19, i15)) {
                        zzE10 = zzgjx.zzE(i19 << 3);
                        zzu = zzE10 + 4;
                        i16 += zzu;
                    }
                    break;
                case 58:
                    if (zzT(obj, i19, i15)) {
                        zzu = zzgjx.zzE(i19 << 3) + 1;
                        i16 += zzu;
                    }
                    break;
                case 59:
                    if (zzT(obj, i19, i15)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzgji) {
                            zzE12 = zzgjx.zzE(i19 << 3);
                            zzd2 = ((zzgji) object2).zzd();
                            zzE13 = zzgjx.zzE(zzd2);
                            i13 = zzE12 + zzE13 + zzd2;
                            i16 += i13;
                        } else {
                            i12 = zzgjx.zzE(i19 << 3);
                            zzi = zzgjx.zzC((String) object2);
                            i13 = i12 + zzi;
                            i16 += i13;
                        }
                    }
                    break;
                case 60:
                    if (zzT(obj, i19, i15)) {
                        zzu = zzgmv.zzo(i19, unsafe.getObject(obj, j10), zzF(i15));
                        i16 += zzu;
                    }
                    break;
                case 61:
                    if (zzT(obj, i19, i15)) {
                        zzE12 = zzgjx.zzE(i19 << 3);
                        zzd2 = ((zzgji) unsafe.getObject(obj, j10)).zzd();
                        zzE13 = zzgjx.zzE(zzd2);
                        i13 = zzE12 + zzE13 + zzd2;
                        i16 += i13;
                    }
                    break;
                case 62:
                    if (zzT(obj, i19, i15)) {
                        int zzs2 = zzs(obj, j10);
                        i12 = zzgjx.zzE(i19 << 3);
                        zzi = zzgjx.zzE(zzs2);
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 63:
                    if (zzT(obj, i19, i15)) {
                        int zzs3 = zzs(obj, j10);
                        i12 = zzgjx.zzE(i19 << 3);
                        zzi = zzgjx.zzy(zzs3);
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 64:
                    if (zzT(obj, i19, i15)) {
                        zzE10 = zzgjx.zzE(i19 << 3);
                        zzu = zzE10 + 4;
                        i16 += zzu;
                    }
                    break;
                case 65:
                    if (zzT(obj, i19, i15)) {
                        zzE9 = zzgjx.zzE(i19 << 3);
                        zzu = zzE9 + 8;
                        i16 += zzu;
                    }
                    break;
                case 66:
                    if (zzT(obj, i19, i15)) {
                        int zzs4 = zzs(obj, j10);
                        i12 = zzgjx.zzE(i19 << 3);
                        zzi = zzgjx.zzE((zzs4 >> 31) ^ (zzs4 + zzs4));
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 67:
                    if (zzT(obj, i19, i15)) {
                        long zzD4 = zzD(obj, j10);
                        i16 += zzgjx.zzE(i19 << 3) + zzgjx.zzF((zzD4 >> 63) ^ (zzD4 + zzD4));
                    }
                    break;
                case 68:
                    if (zzT(obj, i19, i15)) {
                        zzu = zzgjx.zzx(i19, (zzgma) unsafe.getObject(obj, j10), zzF(i15));
                        i16 += zzu;
                    }
                    break;
            }
            i15 += 3;
            i14 = 1048575;
        }
        zzgnk zzgnkVar = this.zzo;
        int zza2 = i16 + zzgnkVar.zza(zzgnkVar.zzd(obj));
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return zza2;
    }

    private final int zzr(Object obj) {
        int zzE;
        int zzE2;
        int zzE3;
        int zzF;
        int zzE4;
        int zzy;
        int zzE5;
        int zzE6;
        int zzd;
        int zzE7;
        int zzo;
        int zzD;
        int zzE8;
        int i10;
        Unsafe unsafe = zzb;
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzc.length; i12 += 3) {
            int zzC = zzC(i12);
            int zzB = zzB(zzC);
            int i13 = this.zzc[i12];
            long j10 = zzC & 1048575;
            if (zzB >= zzgki.zzJ.zza() && zzB <= zzgki.zzW.zza()) {
                int i14 = this.zzc[i12 + 2];
            }
            switch (zzB) {
                case 0:
                    if (zzQ(obj, i12)) {
                        zzE = zzgjx.zzE(i13 << 3);
                        zzo = zzE + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(obj, i12)) {
                        zzE2 = zzgjx.zzE(i13 << 3);
                        zzo = zzE2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(obj, i12)) {
                        long zzf = zzgnu.zzf(obj, j10);
                        zzE3 = zzgjx.zzE(i13 << 3);
                        zzF = zzgjx.zzF(zzf);
                        i11 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(obj, i12)) {
                        long zzf2 = zzgnu.zzf(obj, j10);
                        zzE3 = zzgjx.zzE(i13 << 3);
                        zzF = zzgjx.zzF(zzf2);
                        i11 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(obj, i12)) {
                        int zzd2 = zzgnu.zzd(obj, j10);
                        zzE4 = zzgjx.zzE(i13 << 3);
                        zzy = zzgjx.zzy(zzd2);
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(obj, i12)) {
                        zzE = zzgjx.zzE(i13 << 3);
                        zzo = zzE + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(obj, i12)) {
                        zzE2 = zzgjx.zzE(i13 << 3);
                        zzo = zzE2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(obj, i12)) {
                        zzE5 = zzgjx.zzE(i13 << 3);
                        zzo = zzE5 + 1;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzQ(obj, i12)) {
                        break;
                    } else {
                        Object zzh = zzgnu.zzh(obj, j10);
                        if (zzh instanceof zzgji) {
                            zzE6 = zzgjx.zzE(i13 << 3);
                            zzd = ((zzgji) zzh).zzd();
                            zzE7 = zzgjx.zzE(zzd);
                            i10 = zzE6 + zzE7 + zzd;
                            i11 += i10;
                            break;
                        } else {
                            zzE4 = zzgjx.zzE(i13 << 3);
                            zzy = zzgjx.zzC((String) zzh);
                            i10 = zzE4 + zzy;
                            i11 += i10;
                        }
                    }
                case 9:
                    if (zzQ(obj, i12)) {
                        zzo = zzgmv.zzo(i13, zzgnu.zzh(obj, j10), zzF(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzQ(obj, i12)) {
                        zzE6 = zzgjx.zzE(i13 << 3);
                        zzd = ((zzgji) zzgnu.zzh(obj, j10)).zzd();
                        zzE7 = zzgjx.zzE(zzd);
                        i10 = zzE6 + zzE7 + zzd;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(obj, i12)) {
                        int zzd3 = zzgnu.zzd(obj, j10);
                        zzE4 = zzgjx.zzE(i13 << 3);
                        zzy = zzgjx.zzE(zzd3);
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(obj, i12)) {
                        int zzd4 = zzgnu.zzd(obj, j10);
                        zzE4 = zzgjx.zzE(i13 << 3);
                        zzy = zzgjx.zzy(zzd4);
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(obj, i12)) {
                        zzE2 = zzgjx.zzE(i13 << 3);
                        zzo = zzE2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(obj, i12)) {
                        zzE = zzgjx.zzE(i13 << 3);
                        zzo = zzE + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(obj, i12)) {
                        int zzd5 = zzgnu.zzd(obj, j10);
                        zzE4 = zzgjx.zzE(i13 << 3);
                        zzy = zzgjx.zzE((zzd5 >> 31) ^ (zzd5 + zzd5));
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(obj, i12)) {
                        long zzf3 = zzgnu.zzf(obj, j10);
                        zzE4 = zzgjx.zzE(i13 << 3);
                        zzy = zzgjx.zzF((zzf3 >> 63) ^ (zzf3 + zzf3));
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzQ(obj, i12)) {
                        zzo = zzgjx.zzx(i13, (zzgma) zzgnu.zzh(obj, j10), zzF(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzgmv.zzh(i13, (List) zzgnu.zzh(obj, j10), false);
                    i11 += zzo;
                    break;
                case 19:
                    zzo = zzgmv.zzf(i13, (List) zzgnu.zzh(obj, j10), false);
                    i11 += zzo;
                    break;
                case 20:
                    zzo = zzgmv.zzm(i13, (List) zzgnu.zzh(obj, j10), false);
                    i11 += zzo;
                    break;
                case 21:
                    zzo = zzgmv.zzx(i13, (List) zzgnu.zzh(obj, j10), false);
                    i11 += zzo;
                    break;
                case 22:
                    zzo = zzgmv.zzk(i13, (List) zzgnu.zzh(obj, j10), false);
                    i11 += zzo;
                    break;
                case 23:
                    zzo = zzgmv.zzh(i13, (List) zzgnu.zzh(obj, j10), false);
                    i11 += zzo;
                    break;
                case 24:
                    zzo = zzgmv.zzf(i13, (List) zzgnu.zzh(obj, j10), false);
                    i11 += zzo;
                    break;
                case 25:
                    zzo = zzgmv.zza(i13, (List) zzgnu.zzh(obj, j10), false);
                    i11 += zzo;
                    break;
                case 26:
                    zzo = zzgmv.zzu(i13, (List) zzgnu.zzh(obj, j10));
                    i11 += zzo;
                    break;
                case 27:
                    zzo = zzgmv.zzp(i13, (List) zzgnu.zzh(obj, j10), zzF(i12));
                    i11 += zzo;
                    break;
                case 28:
                    zzo = zzgmv.zzc(i13, (List) zzgnu.zzh(obj, j10));
                    i11 += zzo;
                    break;
                case 29:
                    zzo = zzgmv.zzv(i13, (List) zzgnu.zzh(obj, j10), false);
                    i11 += zzo;
                    break;
                case 30:
                    zzo = zzgmv.zzd(i13, (List) zzgnu.zzh(obj, j10), false);
                    i11 += zzo;
                    break;
                case 31:
                    zzo = zzgmv.zzf(i13, (List) zzgnu.zzh(obj, j10), false);
                    i11 += zzo;
                    break;
                case 32:
                    zzo = zzgmv.zzh(i13, (List) zzgnu.zzh(obj, j10), false);
                    i11 += zzo;
                    break;
                case 33:
                    zzo = zzgmv.zzq(i13, (List) zzgnu.zzh(obj, j10), false);
                    i11 += zzo;
                    break;
                case 34:
                    zzo = zzgmv.zzs(i13, (List) zzgnu.zzh(obj, j10), false);
                    i11 += zzo;
                    break;
                case 35:
                    zzy = zzgmv.zzi((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzgjx.zzD(i13);
                        zzE8 = zzgjx.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzy = zzgmv.zzg((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzgjx.zzD(i13);
                        zzE8 = zzgjx.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzy = zzgmv.zzn((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzgjx.zzD(i13);
                        zzE8 = zzgjx.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzy = zzgmv.zzy((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzgjx.zzD(i13);
                        zzE8 = zzgjx.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzy = zzgmv.zzl((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzgjx.zzD(i13);
                        zzE8 = zzgjx.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzy = zzgmv.zzi((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzgjx.zzD(i13);
                        zzE8 = zzgjx.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzy = zzgmv.zzg((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzgjx.zzD(i13);
                        zzE8 = zzgjx.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzy = zzgmv.zzb((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzgjx.zzD(i13);
                        zzE8 = zzgjx.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzy = zzgmv.zzw((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzgjx.zzD(i13);
                        zzE8 = zzgjx.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzy = zzgmv.zze((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzgjx.zzD(i13);
                        zzE8 = zzgjx.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzy = zzgmv.zzg((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzgjx.zzD(i13);
                        zzE8 = zzgjx.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzy = zzgmv.zzi((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzgjx.zzD(i13);
                        zzE8 = zzgjx.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzy = zzgmv.zzr((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzgjx.zzD(i13);
                        zzE8 = zzgjx.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzy = zzgmv.zzt((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzgjx.zzD(i13);
                        zzE8 = zzgjx.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzgmv.zzj(i13, (List) zzgnu.zzh(obj, j10), zzF(i12));
                    i11 += zzo;
                    break;
                case 50:
                    zzglv.zza(i13, zzgnu.zzh(obj, j10), zzH(i12));
                    break;
                case 51:
                    if (zzT(obj, i13, i12)) {
                        zzE = zzgjx.zzE(i13 << 3);
                        zzo = zzE + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i13, i12)) {
                        zzE2 = zzgjx.zzE(i13 << 3);
                        zzo = zzE2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i13, i12)) {
                        long zzD2 = zzD(obj, j10);
                        zzE3 = zzgjx.zzE(i13 << 3);
                        zzF = zzgjx.zzF(zzD2);
                        i11 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i13, i12)) {
                        long zzD3 = zzD(obj, j10);
                        zzE3 = zzgjx.zzE(i13 << 3);
                        zzF = zzgjx.zzF(zzD3);
                        i11 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i13, i12)) {
                        int zzs = zzs(obj, j10);
                        zzE4 = zzgjx.zzE(i13 << 3);
                        zzy = zzgjx.zzy(zzs);
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i13, i12)) {
                        zzE = zzgjx.zzE(i13 << 3);
                        zzo = zzE + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i13, i12)) {
                        zzE2 = zzgjx.zzE(i13 << 3);
                        zzo = zzE2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i13, i12)) {
                        zzE5 = zzgjx.zzE(i13 << 3);
                        zzo = zzE5 + 1;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzT(obj, i13, i12)) {
                        break;
                    } else {
                        Object zzh2 = zzgnu.zzh(obj, j10);
                        if (zzh2 instanceof zzgji) {
                            zzE6 = zzgjx.zzE(i13 << 3);
                            zzd = ((zzgji) zzh2).zzd();
                            zzE7 = zzgjx.zzE(zzd);
                            i10 = zzE6 + zzE7 + zzd;
                            i11 += i10;
                            break;
                        } else {
                            zzE4 = zzgjx.zzE(i13 << 3);
                            zzy = zzgjx.zzC((String) zzh2);
                            i10 = zzE4 + zzy;
                            i11 += i10;
                        }
                    }
                case 60:
                    if (zzT(obj, i13, i12)) {
                        zzo = zzgmv.zzo(i13, zzgnu.zzh(obj, j10), zzF(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i13, i12)) {
                        zzE6 = zzgjx.zzE(i13 << 3);
                        zzd = ((zzgji) zzgnu.zzh(obj, j10)).zzd();
                        zzE7 = zzgjx.zzE(zzd);
                        i10 = zzE6 + zzE7 + zzd;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i13, i12)) {
                        int zzs2 = zzs(obj, j10);
                        zzE4 = zzgjx.zzE(i13 << 3);
                        zzy = zzgjx.zzE(zzs2);
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i13, i12)) {
                        int zzs3 = zzs(obj, j10);
                        zzE4 = zzgjx.zzE(i13 << 3);
                        zzy = zzgjx.zzy(zzs3);
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i13, i12)) {
                        zzE2 = zzgjx.zzE(i13 << 3);
                        zzo = zzE2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i13, i12)) {
                        zzE = zzgjx.zzE(i13 << 3);
                        zzo = zzE + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i13, i12)) {
                        int zzs4 = zzs(obj, j10);
                        zzE4 = zzgjx.zzE(i13 << 3);
                        zzy = zzgjx.zzE((zzs4 >> 31) ^ (zzs4 + zzs4));
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i13, i12)) {
                        long zzD4 = zzD(obj, j10);
                        zzE4 = zzgjx.zzE(i13 << 3);
                        zzy = zzgjx.zzF((zzD4 >> 63) ^ (zzD4 + zzD4));
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i13, i12)) {
                        zzo = zzgjx.zzx(i13, (zzgma) zzgnu.zzh(obj, j10), zzF(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzgnk zzgnkVar = this.zzo;
        return i11 + zzgnkVar.zza(zzgnkVar.zzd(obj));
    }

    private static int zzs(Object obj, long j10) {
        return ((Integer) zzgnu.zzh(obj, j10)).intValue();
    }

    private final int zzt(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzgiu zzgiuVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i12);
        Object object = unsafe.getObject(obj, j10);
        if (zzglv.zzb(object)) {
            zzglu zzb2 = zzglu.zza().zzb();
            zzglv.zzc(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        zzglt zzgltVar = (zzglt) zzH;
        throw null;
    }

    private final int zzu(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzgiu zzgiuVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzgiv.zzn(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzgiv.zzb(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int zzm = zzgiv.zzm(bArr, i10, zzgiuVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzgiuVar.zzb));
                    unsafe.putInt(obj, j11, i13);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int zzj = zzgiv.zzj(bArr, i10, zzgiuVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzgiuVar.zza));
                    unsafe.putInt(obj, j11, i13);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(zzgiv.zzn(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(zzgiv.zzb(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int zzm2 = zzgiv.zzm(bArr, i10, zzgiuVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(zzgiuVar.zzb != 0));
                    unsafe.putInt(obj, j11, i13);
                    return zzm2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int zzj2 = zzgiv.zzj(bArr, i10, zzgiuVar);
                    int i18 = zzgiuVar.zza;
                    if (i18 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else if ((i15 & 536870912) != 0 && !zzgnz.zzj(bArr, zzj2, zzj2 + i18)) {
                        throw zzglc.zzd();
                    } else {
                        unsafe.putObject(obj, j10, new String(bArr, zzj2, i18, zzgla.zzb));
                        zzj2 += i18;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzj2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    int zzd = zzgiv.zzd(zzF(i17), bArr, i10, i11, zzgiuVar);
                    Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j10, zzgiuVar.zzc);
                    } else {
                        unsafe.putObject(obj, j10, zzgla.zzg(object, zzgiuVar.zzc));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzd;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int zza2 = zzgiv.zza(bArr, i10, zzgiuVar);
                    unsafe.putObject(obj, j10, zzgiuVar.zzc);
                    unsafe.putInt(obj, j11, i13);
                    return zza2;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int zzj3 = zzgiv.zzj(bArr, i10, zzgiuVar);
                    int i19 = zzgiuVar.zza;
                    zzgku zzE = zzE(i17);
                    if (zzE != null && !zzE.zza(i19)) {
                        zzd(obj).zzh(i12, Long.valueOf(i19));
                    } else {
                        unsafe.putObject(obj, j10, Integer.valueOf(i19));
                        unsafe.putInt(obj, j11, i13);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int zzj4 = zzgiv.zzj(bArr, i10, zzgiuVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzgjq.zzF(zzgiuVar.zza)));
                    unsafe.putInt(obj, j11, i13);
                    return zzj4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int zzm3 = zzgiv.zzm(bArr, i10, zzgiuVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzgjq.zzG(zzgiuVar.zzb)));
                    unsafe.putInt(obj, j11, i13);
                    return zzm3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    int zzc = zzgiv.zzc(zzF(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzgiuVar);
                    Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j10, zzgiuVar.zzc);
                    } else {
                        unsafe.putObject(obj, j10, zzgla.zzg(object2, zzgiuVar.zzc));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzc;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02e7, code lost:
        if (r0 != r5) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02e9, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r1 = r20;
        r2 = r23;
        r6 = r26;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x032e, code lost:
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0351, code lost:
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzv(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.ads.zzgiu r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgmd.zzv(java.lang.Object, byte[], int, int, com.google.android.gms.internal.ads.zzgiu):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzw(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.ads.zzgiu r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgmd.zzw(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.ads.zzgiu):int");
    }

    private final int zzx(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzA(i10, 0);
    }

    private final int zzy(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzA(i10, i11);
    }

    private final int zzz(int i10) {
        return this.zzc[i10 + 2];
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final int zza(Object obj) {
        return this.zzj ? zzr(obj) : zzq(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final int zzb(Object obj) {
        int i10;
        int zzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int zzC = zzC(i12);
            int i13 = this.zzc[i12];
            long j10 = 1048575 & zzC;
            int i14 = 37;
            switch (zzB(zzC)) {
                case 0:
                    i10 = i11 * 53;
                    zzc = zzgla.zzc(Double.doubleToLongBits(zzgnu.zzb(obj, j10)));
                    i11 = i10 + zzc;
                    break;
                case 1:
                    i10 = i11 * 53;
                    zzc = Float.floatToIntBits(zzgnu.zzc(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 2:
                    i10 = i11 * 53;
                    zzc = zzgla.zzc(zzgnu.zzf(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 3:
                    i10 = i11 * 53;
                    zzc = zzgla.zzc(zzgnu.zzf(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 4:
                    i10 = i11 * 53;
                    zzc = zzgnu.zzd(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 5:
                    i10 = i11 * 53;
                    zzc = zzgla.zzc(zzgnu.zzf(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 6:
                    i10 = i11 * 53;
                    zzc = zzgnu.zzd(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 7:
                    i10 = i11 * 53;
                    zzc = zzgla.zza(zzgnu.zzz(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 8:
                    i10 = i11 * 53;
                    zzc = ((String) zzgnu.zzh(obj, j10)).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 9:
                    Object zzh = zzgnu.zzh(obj, j10);
                    if (zzh != null) {
                        i14 = zzh.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    zzc = zzgnu.zzh(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 11:
                    i10 = i11 * 53;
                    zzc = zzgnu.zzd(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 12:
                    i10 = i11 * 53;
                    zzc = zzgnu.zzd(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 13:
                    i10 = i11 * 53;
                    zzc = zzgnu.zzd(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 14:
                    i10 = i11 * 53;
                    zzc = zzgla.zzc(zzgnu.zzf(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 15:
                    i10 = i11 * 53;
                    zzc = zzgnu.zzd(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 16:
                    i10 = i11 * 53;
                    zzc = zzgla.zzc(zzgnu.zzf(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 17:
                    Object zzh2 = zzgnu.zzh(obj, j10);
                    if (zzh2 != null) {
                        i14 = zzh2.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    zzc = zzgnu.zzh(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 50:
                    i10 = i11 * 53;
                    zzc = zzgnu.zzh(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 51:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzgla.zzc(Double.doubleToLongBits(zzo(obj, j10)));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = Float.floatToIntBits(zzp(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzgla.zzc(zzD(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzgla.zzc(zzD(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzs(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzgla.zzc(zzD(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzs(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzgla.zza(zzU(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = ((String) zzgnu.zzh(obj, j10)).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzgnu.zzh(obj, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzgnu.zzh(obj, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzs(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzs(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzs(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzgla.zzc(zzD(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzs(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzgla.zzc(zzD(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzgnu.zzh(obj, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.zzo.zzd(obj).hashCode();
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzc(Object obj, byte[] bArr, int i10, int i11, int i12, zzgiu zzgiuVar) throws IOException {
        Unsafe unsafe;
        int i13;
        Object obj2;
        zzgmd<T> zzgmdVar;
        Object obj3;
        int i14;
        int i15;
        int i16;
        int zzx;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        Object obj4;
        zzgiu zzgiuVar2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int zzm;
        int i29;
        int i30;
        int i31;
        int i32;
        zzgmd<T> zzgmdVar2 = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i33 = i11;
        int i34 = i12;
        zzgiu zzgiuVar3 = zzgiuVar;
        Unsafe unsafe2 = zzb;
        int i35 = i10;
        int i36 = 0;
        int i37 = -1;
        int i38 = 0;
        int i39 = 0;
        int i40 = 1048575;
        while (true) {
            if (i35 < i33) {
                int i41 = i35 + 1;
                byte b10 = bArr2[i35];
                if (b10 < 0) {
                    i16 = zzgiv.zzk(b10, bArr2, i41, zzgiuVar3);
                    i15 = zzgiuVar3.zza;
                } else {
                    i15 = b10;
                    i16 = i41;
                }
                int i42 = i15 >>> 3;
                int i43 = i15 & 7;
                if (i42 > i37) {
                    zzx = zzgmdVar2.zzy(i42, i38 / 3);
                } else {
                    zzx = zzgmdVar2.zzx(i42);
                }
                if (zzx == -1) {
                    i17 = i16;
                    i18 = i15;
                    i19 = i39;
                    i20 = i42;
                    unsafe = unsafe2;
                    i13 = i34;
                    i21 = 0;
                } else {
                    int[] iArr = zzgmdVar2.zzc;
                    int i44 = iArr[zzx + 1];
                    int zzB = zzB(i44);
                    int i45 = i15;
                    int i46 = i16;
                    long j10 = i44 & 1048575;
                    if (zzB <= 17) {
                        int i47 = iArr[zzx + 2];
                        int i48 = 1 << (i47 >>> 20);
                        int i49 = i47 & 1048575;
                        if (i49 != i40) {
                            i23 = zzx;
                            if (i40 != 1048575) {
                                unsafe2.putInt(obj5, i40, i39);
                            }
                            i39 = unsafe2.getInt(obj5, i49);
                            i24 = i49;
                        } else {
                            i23 = zzx;
                            i24 = i40;
                        }
                        int i50 = i39;
                        switch (zzB) {
                            case 0:
                                i25 = i45;
                                i26 = i46;
                                i27 = i42;
                                i28 = i23;
                                if (i43 != 1) {
                                    i17 = i26;
                                    i19 = i50;
                                    i21 = i28;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i20 = i27;
                                    i40 = i24;
                                    i13 = i12;
                                    break;
                                } else {
                                    zzgnu.zzr(obj5, j10, Double.longBitsToDouble(zzgiv.zzn(bArr2, i26)));
                                    i35 = i26 + 8;
                                    i39 = i50 | i48;
                                    i38 = i28;
                                    i36 = i25;
                                    i37 = i27;
                                    i40 = i24;
                                    i34 = i12;
                                }
                            case 1:
                                i25 = i45;
                                i26 = i46;
                                i27 = i42;
                                i28 = i23;
                                if (i43 != 5) {
                                    i17 = i26;
                                    i19 = i50;
                                    i21 = i28;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i20 = i27;
                                    i40 = i24;
                                    i13 = i12;
                                    break;
                                } else {
                                    zzgnu.zzs(obj5, j10, Float.intBitsToFloat(zzgiv.zzb(bArr2, i26)));
                                    i35 = i26 + 4;
                                    i39 = i50 | i48;
                                    i38 = i28;
                                    i36 = i25;
                                    i37 = i27;
                                    i40 = i24;
                                    i34 = i12;
                                }
                            case 2:
                            case 3:
                                i25 = i45;
                                i26 = i46;
                                i27 = i42;
                                i28 = i23;
                                if (i43 != 0) {
                                    i17 = i26;
                                    i19 = i50;
                                    i21 = i28;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i20 = i27;
                                    i40 = i24;
                                    i13 = i12;
                                    break;
                                } else {
                                    zzm = zzgiv.zzm(bArr2, i26, zzgiuVar3);
                                    unsafe2.putLong(obj, j10, zzgiuVar3.zzb);
                                    i39 = i50 | i48;
                                    i38 = i28;
                                    i35 = zzm;
                                    i36 = i25;
                                    i37 = i27;
                                    i40 = i24;
                                    i34 = i12;
                                }
                            case 4:
                            case 11:
                                i25 = i45;
                                i26 = i46;
                                i27 = i42;
                                i28 = i23;
                                if (i43 != 0) {
                                    i17 = i26;
                                    i19 = i50;
                                    i21 = i28;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i20 = i27;
                                    i40 = i24;
                                    i13 = i12;
                                    break;
                                } else {
                                    i35 = zzgiv.zzj(bArr2, i26, zzgiuVar3);
                                    unsafe2.putInt(obj5, j10, zzgiuVar3.zza);
                                    i39 = i50 | i48;
                                    i38 = i28;
                                    i36 = i25;
                                    i37 = i27;
                                    i40 = i24;
                                    i34 = i12;
                                }
                            case 5:
                            case 14:
                                i25 = i45;
                                i29 = i46;
                                i27 = i42;
                                i28 = i23;
                                if (i43 != 1) {
                                    i26 = i29;
                                    i17 = i26;
                                    i19 = i50;
                                    i21 = i28;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i20 = i27;
                                    i40 = i24;
                                    i13 = i12;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, j10, zzgiv.zzn(bArr2, i29));
                                    i35 = i29 + 8;
                                    i39 = i50 | i48;
                                    i38 = i28;
                                    i36 = i25;
                                    i37 = i27;
                                    i40 = i24;
                                    i34 = i12;
                                }
                            case 6:
                            case 13:
                                i25 = i45;
                                i29 = i46;
                                i27 = i42;
                                i28 = i23;
                                if (i43 != 5) {
                                    i26 = i29;
                                    i17 = i26;
                                    i19 = i50;
                                    i21 = i28;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i20 = i27;
                                    i40 = i24;
                                    i13 = i12;
                                    break;
                                } else {
                                    unsafe2.putInt(obj5, j10, zzgiv.zzb(bArr2, i29));
                                    i35 = i29 + 4;
                                    i39 = i50 | i48;
                                    i38 = i28;
                                    i36 = i25;
                                    i37 = i27;
                                    i40 = i24;
                                    i34 = i12;
                                }
                            case 7:
                                i25 = i45;
                                i29 = i46;
                                i27 = i42;
                                i28 = i23;
                                if (i43 != 0) {
                                    i26 = i29;
                                    i17 = i26;
                                    i19 = i50;
                                    i21 = i28;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i20 = i27;
                                    i40 = i24;
                                    i13 = i12;
                                    break;
                                } else {
                                    i35 = zzgiv.zzm(bArr2, i29, zzgiuVar3);
                                    zzgnu.zzp(obj5, j10, zzgiuVar3.zzb != 0);
                                    i39 = i50 | i48;
                                    i38 = i28;
                                    i36 = i25;
                                    i37 = i27;
                                    i40 = i24;
                                    i34 = i12;
                                }
                            case 8:
                                i25 = i45;
                                i29 = i46;
                                i27 = i42;
                                i28 = i23;
                                if (i43 != 2) {
                                    i26 = i29;
                                    i17 = i26;
                                    i19 = i50;
                                    i21 = i28;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i20 = i27;
                                    i40 = i24;
                                    i13 = i12;
                                    break;
                                } else {
                                    if ((536870912 & i44) == 0) {
                                        i35 = zzgiv.zzg(bArr2, i29, zzgiuVar3);
                                    } else {
                                        i35 = zzgiv.zzh(bArr2, i29, zzgiuVar3);
                                    }
                                    unsafe2.putObject(obj5, j10, zzgiuVar3.zzc);
                                    i39 = i50 | i48;
                                    i38 = i28;
                                    i36 = i25;
                                    i37 = i27;
                                    i40 = i24;
                                    i34 = i12;
                                }
                            case 9:
                                i25 = i45;
                                i29 = i46;
                                i27 = i42;
                                i28 = i23;
                                if (i43 != 2) {
                                    i26 = i29;
                                    i17 = i26;
                                    i19 = i50;
                                    i21 = i28;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i20 = i27;
                                    i40 = i24;
                                    i13 = i12;
                                    break;
                                } else {
                                    i35 = zzgiv.zzd(zzgmdVar2.zzF(i28), bArr2, i29, i33, zzgiuVar3);
                                    if ((i50 & i48) == 0) {
                                        unsafe2.putObject(obj5, j10, zzgiuVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j10, zzgla.zzg(unsafe2.getObject(obj5, j10), zzgiuVar3.zzc));
                                    }
                                    i39 = i50 | i48;
                                    i38 = i28;
                                    i36 = i25;
                                    i37 = i27;
                                    i40 = i24;
                                    i34 = i12;
                                }
                            case 10:
                                i25 = i45;
                                i29 = i46;
                                i27 = i42;
                                i28 = i23;
                                if (i43 != 2) {
                                    i26 = i29;
                                    i17 = i26;
                                    i19 = i50;
                                    i21 = i28;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i20 = i27;
                                    i40 = i24;
                                    i13 = i12;
                                    break;
                                } else {
                                    i35 = zzgiv.zza(bArr2, i29, zzgiuVar3);
                                    unsafe2.putObject(obj5, j10, zzgiuVar3.zzc);
                                    i39 = i50 | i48;
                                    i38 = i28;
                                    i36 = i25;
                                    i37 = i27;
                                    i40 = i24;
                                    i34 = i12;
                                }
                            case 12:
                                i25 = i45;
                                i29 = i46;
                                i27 = i42;
                                i28 = i23;
                                if (i43 != 0) {
                                    i26 = i29;
                                    i17 = i26;
                                    i19 = i50;
                                    i21 = i28;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i20 = i27;
                                    i40 = i24;
                                    i13 = i12;
                                    break;
                                } else {
                                    i35 = zzgiv.zzj(bArr2, i29, zzgiuVar3);
                                    int i51 = zzgiuVar3.zza;
                                    zzgku zzE = zzgmdVar2.zzE(i28);
                                    if (zzE != null && !zzE.zza(i51)) {
                                        zzd(obj).zzh(i25, Long.valueOf(i51));
                                        i39 = i50;
                                        i38 = i28;
                                        i36 = i25;
                                        i37 = i27;
                                        i40 = i24;
                                        i34 = i12;
                                    } else {
                                        unsafe2.putInt(obj5, j10, i51);
                                        i39 = i50 | i48;
                                        i38 = i28;
                                        i36 = i25;
                                        i37 = i27;
                                        i40 = i24;
                                        i34 = i12;
                                    }
                                }
                                break;
                            case 15:
                                i25 = i45;
                                i29 = i46;
                                i27 = i42;
                                i28 = i23;
                                if (i43 != 0) {
                                    i26 = i29;
                                    i17 = i26;
                                    i19 = i50;
                                    i21 = i28;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i20 = i27;
                                    i40 = i24;
                                    i13 = i12;
                                    break;
                                } else {
                                    i35 = zzgiv.zzj(bArr2, i29, zzgiuVar3);
                                    unsafe2.putInt(obj5, j10, zzgjq.zzF(zzgiuVar3.zza));
                                    i39 = i50 | i48;
                                    i38 = i28;
                                    i36 = i25;
                                    i37 = i27;
                                    i40 = i24;
                                    i34 = i12;
                                }
                            case 16:
                                if (i43 != 0) {
                                    i25 = i45;
                                    i27 = i42;
                                    i28 = i23;
                                    i26 = i46;
                                    i17 = i26;
                                    i19 = i50;
                                    i21 = i28;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i20 = i27;
                                    i40 = i24;
                                    i13 = i12;
                                    break;
                                } else {
                                    zzm = zzgiv.zzm(bArr2, i46, zzgiuVar3);
                                    i25 = i45;
                                    i27 = i42;
                                    i28 = i23;
                                    unsafe2.putLong(obj, j10, zzgjq.zzG(zzgiuVar3.zzb));
                                    i39 = i50 | i48;
                                    i38 = i28;
                                    i35 = zzm;
                                    i36 = i25;
                                    i37 = i27;
                                    i40 = i24;
                                    i34 = i12;
                                }
                            default:
                                i25 = i45;
                                i26 = i46;
                                i27 = i42;
                                i28 = i23;
                                if (i43 != 3) {
                                    i17 = i26;
                                    i19 = i50;
                                    i21 = i28;
                                    unsafe = unsafe2;
                                    i18 = i25;
                                    i20 = i27;
                                    i40 = i24;
                                    i13 = i12;
                                    break;
                                } else {
                                    i35 = zzgiv.zzc(zzgmdVar2.zzF(i28), bArr, i26, i11, (i27 << 3) | 4, zzgiuVar);
                                    if ((i50 & i48) == 0) {
                                        unsafe2.putObject(obj5, j10, zzgiuVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j10, zzgla.zzg(unsafe2.getObject(obj5, j10), zzgiuVar3.zzc));
                                    }
                                    i39 = i50 | i48;
                                    bArr2 = bArr;
                                    i33 = i11;
                                    i38 = i28;
                                    i36 = i25;
                                    i37 = i27;
                                    i40 = i24;
                                    i34 = i12;
                                }
                        }
                    } else {
                        int i52 = zzx;
                        if (zzB != 27) {
                            i19 = i39;
                            i30 = i40;
                            if (zzB <= 49) {
                                i32 = i45;
                                i21 = i52;
                                i20 = i42;
                                unsafe = unsafe2;
                                i35 = zzw(obj, bArr, i46, i11, i45, i42, i43, i21, i44, zzB, j10, zzgiuVar);
                                if (i35 != i46) {
                                    zzgmdVar2 = this;
                                    obj5 = obj;
                                    bArr2 = bArr;
                                    i36 = i32;
                                    i33 = i11;
                                    i34 = i12;
                                    zzgiuVar3 = zzgiuVar;
                                    i38 = i21;
                                    i39 = i19;
                                    i37 = i20;
                                    i40 = i30;
                                    unsafe2 = unsafe;
                                } else {
                                    i18 = i32;
                                    i13 = i12;
                                    i17 = i35;
                                    i40 = i30;
                                }
                            } else {
                                i31 = i46;
                                i32 = i45;
                                i21 = i52;
                                unsafe = unsafe2;
                                i20 = i42;
                                if (zzB != 50) {
                                    i35 = zzu(obj, bArr, i31, i11, i32, i20, i43, i44, zzB, j10, i21, zzgiuVar);
                                    if (i35 != i31) {
                                        zzgmdVar2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i36 = i32;
                                        i33 = i11;
                                        i34 = i12;
                                        zzgiuVar3 = zzgiuVar;
                                        i38 = i21;
                                        i39 = i19;
                                        i37 = i20;
                                        i40 = i30;
                                        unsafe2 = unsafe;
                                    } else {
                                        i18 = i32;
                                        i13 = i12;
                                        i17 = i35;
                                        i40 = i30;
                                    }
                                } else if (i43 == 2) {
                                    i35 = zzt(obj, bArr, i31, i11, i21, j10, zzgiuVar);
                                    if (i35 != i31) {
                                        zzgmdVar2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i36 = i32;
                                        i33 = i11;
                                        i34 = i12;
                                        zzgiuVar3 = zzgiuVar;
                                        i38 = i21;
                                        i39 = i19;
                                        i37 = i20;
                                        i40 = i30;
                                        unsafe2 = unsafe;
                                    } else {
                                        i18 = i32;
                                        i13 = i12;
                                        i17 = i35;
                                        i40 = i30;
                                    }
                                }
                            }
                        } else if (i43 == 2) {
                            zzgkz zzgkzVar = (zzgkz) unsafe2.getObject(obj5, j10);
                            if (!zzgkzVar.zzc()) {
                                int size = zzgkzVar.size();
                                zzgkzVar = zzgkzVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj5, j10, zzgkzVar);
                            }
                            i24 = i40;
                            i35 = zzgiv.zze(zzgmdVar2.zzF(i52), i45, bArr, i46, i11, zzgkzVar, zzgiuVar);
                            bArr2 = bArr;
                            i33 = i11;
                            i38 = i52;
                            i36 = i45;
                            i37 = i42;
                            i39 = i39;
                            i40 = i24;
                            i34 = i12;
                        } else {
                            i19 = i39;
                            i30 = i40;
                            i31 = i46;
                            i32 = i45;
                            i21 = i52;
                            unsafe = unsafe2;
                            i20 = i42;
                        }
                        i18 = i32;
                        i13 = i12;
                        i17 = i31;
                        i40 = i30;
                    }
                }
                if (i18 != i13 || i13 == 0) {
                    if (this.zzh) {
                        zzgiuVar2 = zzgiuVar;
                        if (zzgiuVar2.zzd != zzgkc.zza()) {
                            i22 = i20;
                            if (zzgiuVar2.zzd.zzc(this.zzg, i22) == null) {
                                i35 = zzgiv.zzi(i18, bArr, i17, i11, zzd(obj), zzgiuVar);
                                obj4 = obj;
                                i33 = i11;
                                i36 = i18;
                                zzgmdVar2 = this;
                                zzgiuVar3 = zzgiuVar2;
                                i37 = i22;
                                obj5 = obj4;
                                i38 = i21;
                                i39 = i19;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i34 = i13;
                            } else {
                                zzgkn zzgknVar = (zzgkn) obj;
                                throw null;
                            }
                        } else {
                            obj4 = obj;
                        }
                    } else {
                        obj4 = obj;
                        zzgiuVar2 = zzgiuVar;
                    }
                    i22 = i20;
                    i35 = zzgiv.zzi(i18, bArr, i17, i11, zzd(obj), zzgiuVar);
                    i33 = i11;
                    i36 = i18;
                    zzgmdVar2 = this;
                    zzgiuVar3 = zzgiuVar2;
                    i37 = i22;
                    obj5 = obj4;
                    i38 = i21;
                    i39 = i19;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i34 = i13;
                } else {
                    i14 = 1048575;
                    zzgmdVar = this;
                    obj2 = obj;
                    i35 = i17;
                    i36 = i18;
                    i39 = i19;
                    obj3 = null;
                }
            } else {
                unsafe = unsafe2;
                i13 = i34;
                obj2 = obj5;
                zzgmdVar = zzgmdVar2;
                obj3 = null;
                i14 = 1048575;
            }
        }
        if (i40 != i14) {
            unsafe.putInt(obj2, i40, i39);
        }
        for (int i53 = zzgmdVar.zzl; i53 < zzgmdVar.zzm; i53++) {
            zzgmdVar.zzG(obj2, zzgmdVar.zzk[i53], obj3, zzgmdVar.zzo);
        }
        if (i13 == 0) {
            if (i35 != i11) {
                throw zzglc.zzg();
            }
        } else if (i35 > i11 || i36 != i13) {
            throw zzglc.zzg();
        }
        return i35;
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final Object zze() {
        return ((zzgkq) this.zzg).zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzf(Object obj) {
        int i10;
        int i11 = this.zzl;
        while (true) {
            i10 = this.zzm;
            if (i11 >= i10) {
                break;
            }
            long zzC = zzC(this.zzk[i11]) & 1048575;
            Object zzh = zzgnu.zzh(obj, zzC);
            if (zzh != null) {
                ((zzglu) zzh).zzc();
                zzgnu.zzv(obj, zzC, zzh);
            }
            i11++;
        }
        int length = this.zzk.length;
        while (i10 < length) {
            this.zzn.zzb(obj, this.zzk[i10]);
            i10++;
        }
        this.zzo.zzm(obj);
        if (this.zzh) {
            this.zzp.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzg(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzC = zzC(i10);
            long j10 = 1048575 & zzC;
            int i11 = this.zzc[i10];
            switch (zzB(zzC)) {
                case 0:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzr(obj, j10, zzgnu.zzb(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzs(obj, j10, zzgnu.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzu(obj, j10, zzgnu.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzu(obj, j10, zzgnu.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzt(obj, j10, zzgnu.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzu(obj, j10, zzgnu.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzt(obj, j10, zzgnu.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzp(obj, j10, zzgnu.zzz(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzv(obj, j10, zzgnu.zzh(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i10);
                    break;
                case 10:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzv(obj, j10, zzgnu.zzh(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzt(obj, j10, zzgnu.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzt(obj, j10, zzgnu.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzt(obj, j10, zzgnu.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzu(obj, j10, zzgnu.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzt(obj, j10, zzgnu.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(obj2, i10)) {
                        zzgnu.zzu(obj, j10, zzgnu.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzJ(obj, obj2, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzn.zzc(obj, obj2, j10);
                    break;
                case 50:
                    zzgmv.zzI(this.zzr, obj, obj2, j10);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzT(obj2, i11, i10)) {
                        zzgnu.zzv(obj, j10, zzgnu.zzh(obj2, j10));
                        zzN(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzK(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i11, i10)) {
                        zzgnu.zzv(obj, j10, zzgnu.zzh(obj2, j10));
                        zzN(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzK(obj, obj2, i10);
                    break;
            }
        }
        zzgmv.zzF(this.zzo, obj, obj2);
        if (this.zzh) {
            zzgmv.zzE(this.zzp, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzh(Object obj, zzgml zzgmlVar, zzgkc zzgkcVar) throws IOException {
        Objects.requireNonNull(zzgkcVar);
        zzgnk zzgnkVar = this.zzo;
        zzgkd zzgkdVar = this.zzp;
        zzgkh zzgkhVar = null;
        Object obj2 = null;
        while (true) {
            try {
                int zzc = zzgmlVar.zzc();
                int zzx = zzx(zzc);
                if (zzx >= 0) {
                    int zzC = zzC(zzx);
                    try {
                        switch (zzB(zzC)) {
                            case 0:
                                zzgnu.zzr(obj, zzC & 1048575, zzgmlVar.zza());
                                zzM(obj, zzx);
                                break;
                            case 1:
                                zzgnu.zzs(obj, zzC & 1048575, zzgmlVar.zzb());
                                zzM(obj, zzx);
                                break;
                            case 2:
                                zzgnu.zzu(obj, zzC & 1048575, zzgmlVar.zzl());
                                zzM(obj, zzx);
                                break;
                            case 3:
                                zzgnu.zzu(obj, zzC & 1048575, zzgmlVar.zzo());
                                zzM(obj, zzx);
                                break;
                            case 4:
                                zzgnu.zzt(obj, zzC & 1048575, zzgmlVar.zzg());
                                zzM(obj, zzx);
                                break;
                            case 5:
                                zzgnu.zzu(obj, zzC & 1048575, zzgmlVar.zzk());
                                zzM(obj, zzx);
                                break;
                            case 6:
                                zzgnu.zzt(obj, zzC & 1048575, zzgmlVar.zzf());
                                zzM(obj, zzx);
                                break;
                            case 7:
                                zzgnu.zzp(obj, zzC & 1048575, zzgmlVar.zzN());
                                zzM(obj, zzx);
                                break;
                            case 8:
                                zzL(obj, zzC, zzgmlVar);
                                zzM(obj, zzx);
                                break;
                            case 9:
                                if (zzQ(obj, zzx)) {
                                    long j10 = zzC & 1048575;
                                    zzgnu.zzv(obj, j10, zzgla.zzg(zzgnu.zzh(obj, j10), zzgmlVar.zzs(zzF(zzx), zzgkcVar)));
                                    break;
                                } else {
                                    zzgnu.zzv(obj, zzC & 1048575, zzgmlVar.zzs(zzF(zzx), zzgkcVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 10:
                                zzgnu.zzv(obj, zzC & 1048575, zzgmlVar.zzp());
                                zzM(obj, zzx);
                                break;
                            case 11:
                                zzgnu.zzt(obj, zzC & 1048575, zzgmlVar.zzj());
                                zzM(obj, zzx);
                                break;
                            case 12:
                                int zze = zzgmlVar.zze();
                                zzgku zzE = zzE(zzx);
                                if (zzE != null && !zzE.zza(zze)) {
                                    obj2 = zzgmv.zzD(zzc, zze, obj2, zzgnkVar);
                                    break;
                                }
                                zzgnu.zzt(obj, zzC & 1048575, zze);
                                zzM(obj, zzx);
                                break;
                            case 13:
                                zzgnu.zzt(obj, zzC & 1048575, zzgmlVar.zzh());
                                zzM(obj, zzx);
                                break;
                            case 14:
                                zzgnu.zzu(obj, zzC & 1048575, zzgmlVar.zzm());
                                zzM(obj, zzx);
                                break;
                            case 15:
                                zzgnu.zzt(obj, zzC & 1048575, zzgmlVar.zzi());
                                zzM(obj, zzx);
                                break;
                            case 16:
                                zzgnu.zzu(obj, zzC & 1048575, zzgmlVar.zzn());
                                zzM(obj, zzx);
                                break;
                            case 17:
                                if (zzQ(obj, zzx)) {
                                    long j11 = zzC & 1048575;
                                    zzgnu.zzv(obj, j11, zzgla.zzg(zzgnu.zzh(obj, j11), zzgmlVar.zzr(zzF(zzx), zzgkcVar)));
                                    break;
                                } else {
                                    zzgnu.zzv(obj, zzC & 1048575, zzgmlVar.zzr(zzF(zzx), zzgkcVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 18:
                                zzgmlVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 19:
                                zzgmlVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 20:
                                zzgmlVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 21:
                                zzgmlVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 22:
                                zzgmlVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 23:
                                zzgmlVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 24:
                                zzgmlVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 25:
                                zzgmlVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 26:
                                if (zzP(zzC)) {
                                    ((zzgjr) zzgmlVar).zzK(this.zzn.zza(obj, zzC & 1048575), true);
                                    break;
                                } else {
                                    ((zzgjr) zzgmlVar).zzK(this.zzn.zza(obj, zzC & 1048575), false);
                                    break;
                                }
                            case 27:
                                zzgmlVar.zzF(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzgkcVar);
                                break;
                            case 28:
                                zzgmlVar.zzw(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 29:
                                zzgmlVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 30:
                                List zza2 = this.zzn.zza(obj, zzC & 1048575);
                                zzgmlVar.zzy(zza2);
                                obj2 = zzgmv.zzC(zzc, zza2, zzE(zzx), obj2, zzgnkVar);
                                break;
                            case 31:
                                zzgmlVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 32:
                                zzgmlVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 33:
                                zzgmlVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 34:
                                zzgmlVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 35:
                                zzgmlVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 36:
                                zzgmlVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 37:
                                zzgmlVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 38:
                                zzgmlVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 39:
                                zzgmlVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 40:
                                zzgmlVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 41:
                                zzgmlVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 42:
                                zzgmlVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 43:
                                zzgmlVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 44:
                                List zza3 = this.zzn.zza(obj, zzC & 1048575);
                                zzgmlVar.zzy(zza3);
                                obj2 = zzgmv.zzC(zzc, zza3, zzE(zzx), obj2, zzgnkVar);
                                break;
                            case 45:
                                zzgmlVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 46:
                                zzgmlVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 47:
                                zzgmlVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 48:
                                zzgmlVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 49:
                                zzgmlVar.zzC(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzgkcVar);
                                break;
                            case 50:
                                Object zzH = zzH(zzx);
                                long zzC2 = zzC(zzx) & 1048575;
                                Object zzh = zzgnu.zzh(obj, zzC2);
                                if (zzh != null) {
                                    if (zzglv.zzb(zzh)) {
                                        Object zzb2 = zzglu.zza().zzb();
                                        zzglv.zzc(zzb2, zzh);
                                        zzgnu.zzv(obj, zzC2, zzb2);
                                        zzh = zzb2;
                                    }
                                } else {
                                    zzh = zzglu.zza().zzb();
                                    zzgnu.zzv(obj, zzC2, zzh);
                                }
                                zzglu zzgluVar = (zzglu) zzh;
                                zzglt zzgltVar = (zzglt) zzH;
                                throw null;
                                break;
                            case 51:
                                zzgnu.zzv(obj, zzC & 1048575, Double.valueOf(zzgmlVar.zza()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 52:
                                zzgnu.zzv(obj, zzC & 1048575, Float.valueOf(zzgmlVar.zzb()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 53:
                                zzgnu.zzv(obj, zzC & 1048575, Long.valueOf(zzgmlVar.zzl()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 54:
                                zzgnu.zzv(obj, zzC & 1048575, Long.valueOf(zzgmlVar.zzo()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 55:
                                zzgnu.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmlVar.zzg()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 56:
                                zzgnu.zzv(obj, zzC & 1048575, Long.valueOf(zzgmlVar.zzk()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 57:
                                zzgnu.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmlVar.zzf()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 58:
                                zzgnu.zzv(obj, zzC & 1048575, Boolean.valueOf(zzgmlVar.zzN()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 59:
                                zzL(obj, zzC, zzgmlVar);
                                zzN(obj, zzc, zzx);
                                break;
                            case 60:
                                if (zzT(obj, zzc, zzx)) {
                                    long j12 = zzC & 1048575;
                                    zzgnu.zzv(obj, j12, zzgla.zzg(zzgnu.zzh(obj, j12), zzgmlVar.zzs(zzF(zzx), zzgkcVar)));
                                } else {
                                    zzgnu.zzv(obj, zzC & 1048575, zzgmlVar.zzs(zzF(zzx), zzgkcVar));
                                    zzM(obj, zzx);
                                }
                                zzN(obj, zzc, zzx);
                                break;
                            case 61:
                                zzgnu.zzv(obj, zzC & 1048575, zzgmlVar.zzp());
                                zzN(obj, zzc, zzx);
                                break;
                            case 62:
                                zzgnu.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmlVar.zzj()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 63:
                                int zze2 = zzgmlVar.zze();
                                zzgku zzE2 = zzE(zzx);
                                if (zzE2 != null && !zzE2.zza(zze2)) {
                                    obj2 = zzgmv.zzD(zzc, zze2, obj2, zzgnkVar);
                                    break;
                                }
                                zzgnu.zzv(obj, zzC & 1048575, Integer.valueOf(zze2));
                                zzN(obj, zzc, zzx);
                                break;
                            case 64:
                                zzgnu.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmlVar.zzh()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 65:
                                zzgnu.zzv(obj, zzC & 1048575, Long.valueOf(zzgmlVar.zzm()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 66:
                                zzgnu.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmlVar.zzi()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 67:
                                zzgnu.zzv(obj, zzC & 1048575, Long.valueOf(zzgmlVar.zzn()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 68:
                                zzgnu.zzv(obj, zzC & 1048575, zzgmlVar.zzr(zzF(zzx), zzgkcVar));
                                zzN(obj, zzc, zzx);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = zzgnkVar.zzf();
                                }
                                if (!zzgnkVar.zzp(obj2, zzgmlVar)) {
                                    for (int i10 = this.zzl; i10 < this.zzm; i10++) {
                                        obj2 = zzG(obj, this.zzk[i10], obj2, zzgnkVar);
                                    }
                                    if (obj2 != null) {
                                        zzgnkVar.zzn(obj, obj2);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzglb unused) {
                        zzgnkVar.zzq(zzgmlVar);
                        if (obj2 == null) {
                            obj2 = zzgnkVar.zzc(obj);
                        }
                        if (!zzgnkVar.zzp(obj2, zzgmlVar)) {
                            for (int i11 = this.zzl; i11 < this.zzm; i11++) {
                                obj2 = zzG(obj, this.zzk[i11], obj2, zzgnkVar);
                            }
                            if (obj2 != null) {
                                zzgnkVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i12 = this.zzl; i12 < this.zzm; i12++) {
                        obj2 = zzG(obj, this.zzk[i12], obj2, zzgnkVar);
                    }
                    if (obj2 != null) {
                        zzgnkVar.zzn(obj, obj2);
                        return;
                    }
                    return;
                } else {
                    Object zzc2 = !this.zzh ? null : zzgkdVar.zzc(zzgkcVar, this.zzg, zzc);
                    if (zzc2 != null) {
                        if (zzgkhVar == null) {
                            zzgkhVar = zzgkdVar.zzb(obj);
                        }
                        zzgkh zzgkhVar2 = zzgkhVar;
                        obj2 = zzgkdVar.zzd(zzgmlVar, zzc2, zzgkcVar, zzgkhVar2, obj2, zzgnkVar);
                        zzgkhVar = zzgkhVar2;
                    } else {
                        zzgnkVar.zzq(zzgmlVar);
                        if (obj2 == null) {
                            obj2 = zzgnkVar.zzc(obj);
                        }
                        if (!zzgnkVar.zzp(obj2, zzgmlVar)) {
                            for (int i13 = this.zzl; i13 < this.zzm; i13++) {
                                obj2 = zzG(obj, this.zzk[i13], obj2, zzgnkVar);
                            }
                            if (obj2 != null) {
                                zzgnkVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i14 = this.zzl; i14 < this.zzm; i14++) {
                    obj2 = zzG(obj, this.zzk[i14], obj2, zzgnkVar);
                }
                if (obj2 != null) {
                    zzgnkVar.zzn(obj, obj2);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzgiu zzgiuVar) throws IOException {
        if (this.zzj) {
            zzv(obj, bArr, i10, i11, zzgiuVar);
        } else {
            zzc(obj, bArr, i10, i11, 0, zzgiuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzH;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzC = zzC(i10);
            long j10 = zzC & 1048575;
            switch (zzB(zzC)) {
                case 0:
                    if (zzO(obj, obj2, i10) && Double.doubleToLongBits(zzgnu.zzb(obj, j10)) == Double.doubleToLongBits(zzgnu.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i10) && Float.floatToIntBits(zzgnu.zzc(obj, j10)) == Float.floatToIntBits(zzgnu.zzc(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i10) && zzgnu.zzf(obj, j10) == zzgnu.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i10) && zzgnu.zzf(obj, j10) == zzgnu.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i10) && zzgnu.zzd(obj, j10) == zzgnu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i10) && zzgnu.zzf(obj, j10) == zzgnu.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i10) && zzgnu.zzd(obj, j10) == zzgnu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i10) && zzgnu.zzz(obj, j10) == zzgnu.zzz(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i10) && zzgmv.zzH(zzgnu.zzh(obj, j10), zzgnu.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i10) && zzgmv.zzH(zzgnu.zzh(obj, j10), zzgnu.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i10) && zzgmv.zzH(zzgnu.zzh(obj, j10), zzgnu.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i10) && zzgnu.zzd(obj, j10) == zzgnu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i10) && zzgnu.zzd(obj, j10) == zzgnu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i10) && zzgnu.zzd(obj, j10) == zzgnu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i10) && zzgnu.zzf(obj, j10) == zzgnu.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i10) && zzgnu.zzd(obj, j10) == zzgnu.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i10) && zzgnu.zzf(obj, j10) == zzgnu.zzf(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i10) && zzgmv.zzH(zzgnu.zzh(obj, j10), zzgnu.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzH = zzgmv.zzH(zzgnu.zzh(obj, j10), zzgnu.zzh(obj2, j10));
                    break;
                case 50:
                    zzH = zzgmv.zzH(zzgnu.zzh(obj, j10), zzgnu.zzh(obj2, j10));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzz = zzz(i10) & 1048575;
                    if (zzgnu.zzd(obj, zzz) == zzgnu.zzd(obj2, zzz) && zzgmv.zzH(zzgnu.zzh(obj, j10), zzgnu.zzh(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzH) {
                return false;
            }
        }
        if (this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            if (this.zzh) {
                this.zzp.zza(obj);
                this.zzp.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzl) {
            int i15 = this.zzk[i14];
            int i16 = this.zzc[i15];
            int zzC = zzC(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(obj, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & zzC) != 0 && !zzR(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzB = zzB(zzC);
            if (zzB != 9 && zzB != 17) {
                if (zzB != 27) {
                    if (zzB == 60 || zzB == 68) {
                        if (zzT(obj, i16, i15) && !zzS(obj, zzC, zzF(i15))) {
                            return false;
                        }
                    } else if (zzB != 49) {
                        if (zzB == 50 && !((zzglu) zzgnu.zzh(obj, zzC & 1048575)).isEmpty()) {
                            zzglt zzgltVar = (zzglt) zzH(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgnu.zzh(obj, zzC & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgmt zzF = zzF(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzF.zzk(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzR(obj, i15, i10, i11, i19) && !zzS(obj, zzC, zzF(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzn(Object obj, zzgjy zzgjyVar) throws IOException {
        if (!this.zzj) {
            zzV(obj, zzgjyVar);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzC = zzC(i10);
                int i11 = this.zzc[i10];
                switch (zzB(zzC)) {
                    case 0:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzf(i11, zzgnu.zzb(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzo(i11, zzgnu.zzc(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzt(i11, zzgnu.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzJ(i11, zzgnu.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzr(i11, zzgnu.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzm(i11, zzgnu.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzk(i11, zzgnu.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzb(i11, zzgnu.zzz(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzQ(obj, i10)) {
                            zzX(i11, zzgnu.zzh(obj, zzC & 1048575), zzgjyVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzv(i11, zzgnu.zzh(obj, zzC & 1048575), zzF(i10));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzd(i11, (zzgji) zzgnu.zzh(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzH(i11, zzgnu.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzi(i11, zzgnu.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzw(i11, zzgnu.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzy(i11, zzgnu.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzA(i11, zzgnu.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzC(i11, zzgnu.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzQ(obj, i10)) {
                            zzgjyVar.zzq(i11, zzgnu.zzh(obj, zzC & 1048575), zzF(i10));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzgmv.zzL(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 19:
                        zzgmv.zzP(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 20:
                        zzgmv.zzS(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 21:
                        zzgmv.zzaa(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 22:
                        zzgmv.zzR(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 23:
                        zzgmv.zzO(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 24:
                        zzgmv.zzN(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 25:
                        zzgmv.zzJ(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 26:
                        zzgmv.zzY(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar);
                        break;
                    case 27:
                        zzgmv.zzT(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, zzF(i10));
                        break;
                    case 28:
                        zzgmv.zzK(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar);
                        break;
                    case 29:
                        zzgmv.zzZ(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 30:
                        zzgmv.zzM(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 31:
                        zzgmv.zzU(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 32:
                        zzgmv.zzV(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 33:
                        zzgmv.zzW(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 34:
                        zzgmv.zzX(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 35:
                        zzgmv.zzL(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 36:
                        zzgmv.zzP(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 37:
                        zzgmv.zzS(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 38:
                        zzgmv.zzaa(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 39:
                        zzgmv.zzR(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 40:
                        zzgmv.zzO(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 41:
                        zzgmv.zzN(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 42:
                        zzgmv.zzJ(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 43:
                        zzgmv.zzZ(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 44:
                        zzgmv.zzM(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 45:
                        zzgmv.zzU(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 46:
                        zzgmv.zzV(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 47:
                        zzgmv.zzW(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 48:
                        zzgmv.zzX(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 49:
                        zzgmv.zzQ(i11, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, zzF(i10));
                        break;
                    case 50:
                        zzW(zzgjyVar, i11, zzgnu.zzh(obj, zzC & 1048575), i10);
                        break;
                    case 51:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzf(i11, zzo(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzo(i11, zzp(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzt(i11, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzJ(i11, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzr(i11, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzm(i11, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzk(i11, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzb(i11, zzU(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i11, i10)) {
                            zzX(i11, zzgnu.zzh(obj, zzC & 1048575), zzgjyVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzv(i11, zzgnu.zzh(obj, zzC & 1048575), zzF(i10));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzd(i11, (zzgji) zzgnu.zzh(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzH(i11, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzi(i11, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzw(i11, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzy(i11, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzA(i11, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzC(i11, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i11, i10)) {
                            zzgjyVar.zzq(i11, zzgnu.zzh(obj, zzC & 1048575), zzF(i10));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzgnk zzgnkVar = this.zzo;
            zzgnkVar.zzr(zzgnkVar.zzd(obj), zzgjyVar);
        } else {
            this.zzp.zza(obj);
            throw null;
        }
    }
}
