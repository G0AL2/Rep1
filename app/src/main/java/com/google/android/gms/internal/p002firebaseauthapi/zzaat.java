package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaat  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzaat<T> implements zzabc<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzacd.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzaaq zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzaae zzn;
    private final zzabt zzo;
    private final zzyz zzp;
    private final zzaav zzq;
    private final zzaal zzr;

    private zzaat(int[] iArr, Object[] objArr, int i10, int i11, zzaaq zzaaqVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzaav zzaavVar, zzaae zzaaeVar, zzabt zzabtVar, zzyz zzyzVar, zzaal zzaalVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzaaqVar instanceof zzzl;
        this.zzj = z10;
        boolean z12 = false;
        if (zzyzVar != null && zzyzVar.zzh(zzaaqVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzk = iArr2;
        this.zzl = i12;
        this.zzm = i13;
        this.zzq = zzaavVar;
        this.zzn = zzaaeVar;
        this.zzo = zzabtVar;
        this.zzp = zzyzVar;
        this.zzg = zzaaqVar;
        this.zzr = zzaalVar;
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
        return ((Long) zzacd.zzf(obj, j10)).longValue();
    }

    private final zzzp zzE(int i10) {
        int i11 = i10 / 3;
        return (zzzp) this.zzd[i11 + i11 + 1];
    }

    private final zzabc zzF(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzabc zzabcVar = (zzabc) this.zzd[i12];
        if (zzabcVar != null) {
            return zzabcVar;
        }
        zzabc zzb2 = zzaay.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzG(Object obj, int i10, Object obj2, zzabt zzabtVar) {
        int i11 = this.zzc[i10];
        Object zzf = zzacd.zzf(obj, zzC(i10) & 1048575);
        if (zzf == null || zzE(i10) == null) {
            return obj2;
        }
        zzaak zzaakVar = (zzaak) zzf;
        zzaaj zzaajVar = (zzaaj) zzH(i10);
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
            Object zzf = zzacd.zzf(obj, zzC);
            Object zzf2 = zzacd.zzf(obj2, zzC);
            if (zzf != null && zzf2 != null) {
                zzacd.zzs(obj, zzC, zzzr.zzg(zzf, zzf2));
                zzM(obj, i10);
            } else if (zzf2 != null) {
                zzacd.zzs(obj, zzC, zzf2);
                zzM(obj, i10);
            }
        }
    }

    private final void zzK(Object obj, Object obj2, int i10) {
        int zzC = zzC(i10);
        int i11 = this.zzc[i10];
        long j10 = zzC & 1048575;
        if (zzT(obj2, i11, i10)) {
            Object zzf = zzT(obj, i11, i10) ? zzacd.zzf(obj, j10) : null;
            Object zzf2 = zzacd.zzf(obj2, j10);
            if (zzf != null && zzf2 != null) {
                zzacd.zzs(obj, j10, zzzr.zzg(zzf, zzf2));
                zzN(obj, i11, i10);
            } else if (zzf2 != null) {
                zzacd.zzs(obj, j10, zzf2);
                zzN(obj, i11, i10);
            }
        }
    }

    private final void zzL(Object obj, int i10, zzabb zzabbVar) throws IOException {
        if (zzP(i10)) {
            zzacd.zzs(obj, i10 & 1048575, zzabbVar.zzu());
        } else if (this.zzi) {
            zzacd.zzs(obj, i10 & 1048575, zzabbVar.zzt());
        } else {
            zzacd.zzs(obj, i10 & 1048575, zzabbVar.zzp());
        }
    }

    private final void zzM(Object obj, int i10) {
        int zzz = zzz(i10);
        long j10 = 1048575 & zzz;
        if (j10 == 1048575) {
            return;
        }
        zzacd.zzq(obj, j10, (1 << (zzz >>> 20)) | zzacd.zzc(obj, j10));
    }

    private final void zzN(Object obj, int i10, int i11) {
        zzacd.zzq(obj, zzz(i11) & 1048575, i10);
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
            return (zzacd.zzc(obj, j10) & (1 << (zzz >>> 20))) != 0;
        }
        int zzC = zzC(i10);
        long j11 = zzC & 1048575;
        switch (zzB(zzC)) {
            case 0:
                return Double.doubleToRawLongBits(zzacd.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzacd.zzb(obj, j11)) != 0;
            case 2:
                return zzacd.zzd(obj, j11) != 0;
            case 3:
                return zzacd.zzd(obj, j11) != 0;
            case 4:
                return zzacd.zzc(obj, j11) != 0;
            case 5:
                return zzacd.zzd(obj, j11) != 0;
            case 6:
                return zzacd.zzc(obj, j11) != 0;
            case 7:
                return zzacd.zzw(obj, j11);
            case 8:
                Object zzf = zzacd.zzf(obj, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzyi) {
                    return !zzyi.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzacd.zzf(obj, j11) != null;
            case 10:
                return !zzyi.zzb.equals(zzacd.zzf(obj, j11));
            case 11:
                return zzacd.zzc(obj, j11) != 0;
            case 12:
                return zzacd.zzc(obj, j11) != 0;
            case 13:
                return zzacd.zzc(obj, j11) != 0;
            case 14:
                return zzacd.zzd(obj, j11) != 0;
            case 15:
                return zzacd.zzc(obj, j11) != 0;
            case 16:
                return zzacd.zzd(obj, j11) != 0;
            case 17:
                return zzacd.zzf(obj, j11) != null;
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

    private static boolean zzS(Object obj, int i10, zzabc zzabcVar) {
        return zzabcVar.zzk(zzacd.zzf(obj, i10 & 1048575));
    }

    private final boolean zzT(Object obj, int i10, int i11) {
        return zzacd.zzc(obj, (long) (zzz(i11) & 1048575)) == i10;
    }

    private static boolean zzU(Object obj, long j10) {
        return ((Boolean) zzacd.zzf(obj, j10)).booleanValue();
    }

    private final void zzV(Object obj, zzyu zzyuVar) throws IOException {
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
                            zzyuVar.zzf(i15, zzacd.zza(obj, j10));
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 1:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzo(i15, zzacd.zzb(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 2:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzt(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 3:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzJ(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 4:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzr(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 5:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzm(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 6:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzk(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 7:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzb(i15, zzacd.zzw(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 8:
                        if ((i13 & i10) != 0) {
                            zzX(i15, unsafe.getObject(obj, j10), zzyuVar);
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 9:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzv(i15, unsafe.getObject(obj, j10), zzF(i12));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 10:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzd(i15, (zzyi) unsafe.getObject(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 11:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzH(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 12:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzi(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 13:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzw(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 14:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzy(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 15:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzA(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 16:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzC(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 17:
                        if ((i13 & i10) != 0) {
                            zzyuVar.zzq(i15, unsafe.getObject(obj, j10), zzF(i12));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 18:
                        zzabe.zzL(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 19:
                        zzabe.zzP(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 20:
                        zzabe.zzS(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 21:
                        zzabe.zzaa(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 22:
                        zzabe.zzR(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 23:
                        zzabe.zzO(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 24:
                        zzabe.zzN(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 25:
                        zzabe.zzJ(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 26:
                        zzabe.zzY(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar);
                        break;
                    case 27:
                        zzabe.zzT(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, zzF(i12));
                        break;
                    case 28:
                        zzabe.zzK(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar);
                        break;
                    case 29:
                        zzabe.zzZ(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, false);
                        break;
                    case 30:
                        zzabe.zzM(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, false);
                        break;
                    case 31:
                        zzabe.zzU(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, false);
                        break;
                    case 32:
                        zzabe.zzV(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, false);
                        break;
                    case 33:
                        zzabe.zzW(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, false);
                        break;
                    case 34:
                        zzabe.zzX(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, false);
                        break;
                    case 35:
                        zzabe.zzL(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, true);
                        break;
                    case 36:
                        zzabe.zzP(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, true);
                        break;
                    case 37:
                        zzabe.zzS(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, true);
                        break;
                    case 38:
                        zzabe.zzaa(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, true);
                        break;
                    case 39:
                        zzabe.zzR(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, true);
                        break;
                    case 40:
                        zzabe.zzO(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, true);
                        break;
                    case 41:
                        zzabe.zzN(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, true);
                        break;
                    case 42:
                        zzabe.zzJ(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, true);
                        break;
                    case 43:
                        zzabe.zzZ(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, true);
                        break;
                    case 44:
                        zzabe.zzM(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, true);
                        break;
                    case 45:
                        zzabe.zzU(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, true);
                        break;
                    case 46:
                        zzabe.zzV(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, true);
                        break;
                    case 47:
                        zzabe.zzW(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, true);
                        break;
                    case 48:
                        zzabe.zzX(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, true);
                        break;
                    case 49:
                        zzabe.zzQ(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzyuVar, zzF(i12));
                        break;
                    case 50:
                        zzW(zzyuVar, i15, unsafe.getObject(obj, j10), i12);
                        break;
                    case 51:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzf(i15, zzo(obj, j10));
                            break;
                        }
                        break;
                    case 52:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzo(i15, zzp(obj, j10));
                            break;
                        }
                        break;
                    case 53:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzt(i15, zzD(obj, j10));
                            break;
                        }
                        break;
                    case 54:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzJ(i15, zzD(obj, j10));
                            break;
                        }
                        break;
                    case 55:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzr(i15, zzs(obj, j10));
                            break;
                        }
                        break;
                    case 56:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzm(i15, zzD(obj, j10));
                            break;
                        }
                        break;
                    case 57:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzk(i15, zzs(obj, j10));
                            break;
                        }
                        break;
                    case 58:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzb(i15, zzU(obj, j10));
                            break;
                        }
                        break;
                    case 59:
                        if (zzT(obj, i15, i12)) {
                            zzX(i15, unsafe.getObject(obj, j10), zzyuVar);
                            break;
                        }
                        break;
                    case 60:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzv(i15, unsafe.getObject(obj, j10), zzF(i12));
                            break;
                        }
                        break;
                    case 61:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzd(i15, (zzyi) unsafe.getObject(obj, j10));
                            break;
                        }
                        break;
                    case 62:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzH(i15, zzs(obj, j10));
                            break;
                        }
                        break;
                    case 63:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzi(i15, zzs(obj, j10));
                            break;
                        }
                        break;
                    case 64:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzw(i15, zzs(obj, j10));
                            break;
                        }
                        break;
                    case 65:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzy(i15, zzD(obj, j10));
                            break;
                        }
                        break;
                    case 66:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzA(i15, zzs(obj, j10));
                            break;
                        }
                        break;
                    case 67:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzC(i15, zzD(obj, j10));
                            break;
                        }
                        break;
                    case 68:
                        if (zzT(obj, i15, i12)) {
                            zzyuVar.zzq(i15, unsafe.getObject(obj, j10), zzF(i12));
                            break;
                        }
                        break;
                }
                i12 += 3;
                i11 = 1048575;
            }
            zzabt zzabtVar = this.zzo;
            zzabtVar.zzr(zzabtVar.zzd(obj), zzyuVar);
            return;
        }
        this.zzp.zza(obj);
        throw null;
    }

    private final void zzW(zzyu zzyuVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        zzaaj zzaajVar = (zzaaj) zzH(i11);
        throw null;
    }

    private static final void zzX(int i10, Object obj, zzyu zzyuVar) throws IOException {
        if (obj instanceof String) {
            zzyuVar.zzF(i10, (String) obj);
        } else {
            zzyuVar.zzd(i10, (zzyi) obj);
        }
    }

    static zzabu zzd(Object obj) {
        zzzl zzzlVar = (zzzl) obj;
        zzabu zzabuVar = zzzlVar.zzc;
        if (zzabuVar == zzabu.zzc()) {
            zzabu zze = zzabu.zze();
            zzzlVar.zzc = zze;
            return zze;
        }
        return zzabuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzaat zzl(Class cls, zzaan zzaanVar, zzaav zzaavVar, zzaae zzaaeVar, zzabt zzabtVar, zzyz zzyzVar, zzaal zzaalVar) {
        if (zzaanVar instanceof zzaba) {
            return zzm((zzaba) zzaanVar, zzaavVar, zzaaeVar, zzabtVar, zzyzVar, zzaalVar);
        }
        zzabq zzabqVar = (zzabq) zzaanVar;
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
    static com.google.android.gms.internal.p002firebaseauthapi.zzaat zzm(com.google.android.gms.internal.p002firebaseauthapi.zzaba r34, com.google.android.gms.internal.p002firebaseauthapi.zzaav r35, com.google.android.gms.internal.p002firebaseauthapi.zzaae r36, com.google.android.gms.internal.p002firebaseauthapi.zzabt r37, com.google.android.gms.internal.p002firebaseauthapi.zzyz r38, com.google.android.gms.internal.p002firebaseauthapi.zzaal r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaat.zzm(com.google.android.gms.internal.firebase-auth-api.zzaba, com.google.android.gms.internal.firebase-auth-api.zzaav, com.google.android.gms.internal.firebase-auth-api.zzaae, com.google.android.gms.internal.firebase-auth-api.zzabt, com.google.android.gms.internal.firebase-auth-api.zzyz, com.google.android.gms.internal.firebase-auth-api.zzaal):com.google.android.gms.internal.firebase-auth-api.zzaat");
    }

    private static double zzo(Object obj, long j10) {
        return ((Double) zzacd.zzf(obj, j10)).doubleValue();
    }

    private static float zzp(Object obj, long j10) {
        return ((Float) zzacd.zzf(obj, j10)).floatValue();
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
                        zzE = zzyt.zzE(i19 << 3);
                        zzE5 = zzE + 8;
                        i16 += zzE5;
                        break;
                    }
                case 1:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE2 = zzyt.zzE(i19 << 3);
                        zzE5 = zzE2 + 4;
                        i16 += zzE5;
                        break;
                    }
                case 2:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(obj, j10);
                        zzE3 = zzyt.zzE(i19 << 3);
                        zzF = zzyt.zzF(j11);
                        i16 += zzE3 + zzF;
                        break;
                    }
                case 3:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(obj, j10);
                        zzE3 = zzyt.zzE(i19 << 3);
                        zzF = zzyt.zzF(j12);
                        i16 += zzE3 + zzF;
                        break;
                    }
                case 4:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i22 = unsafe.getInt(obj, j10);
                        zzE4 = zzyt.zzE(i19 << 3);
                        zzy = zzyt.zzy(i22);
                        i11 = zzE4 + zzy;
                        i16 += i11;
                        break;
                    }
                case 5:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE = zzyt.zzE(i19 << 3);
                        zzE5 = zzE + 8;
                        i16 += zzE5;
                        break;
                    }
                case 6:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE2 = zzyt.zzE(i19 << 3);
                        zzE5 = zzE2 + 4;
                        i16 += zzE5;
                        break;
                    }
                case 7:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE5 = zzyt.zzE(i19 << 3) + 1;
                        i16 += zzE5;
                        break;
                    }
                case 8:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzyi) {
                            zzE6 = zzyt.zzE(i19 << 3);
                            zzd = ((zzyi) object).zzd();
                            zzE7 = zzyt.zzE(zzd);
                            i11 = zzE6 + zzE7 + zzd;
                            i16 += i11;
                            break;
                        } else {
                            zzE4 = zzyt.zzE(i19 << 3);
                            zzy = zzyt.zzC((String) object);
                            i11 = zzE4 + zzy;
                            i16 += i11;
                        }
                    }
                case 9:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE5 = zzabe.zzo(i19, unsafe.getObject(obj, j10), zzF(i15));
                        i16 += zzE5;
                        break;
                    }
                case 10:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE6 = zzyt.zzE(i19 << 3);
                        zzd = ((zzyi) unsafe.getObject(obj, j10)).zzd();
                        zzE7 = zzyt.zzE(zzd);
                        i11 = zzE6 + zzE7 + zzd;
                        i16 += i11;
                        break;
                    }
                case 11:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i23 = unsafe.getInt(obj, j10);
                        zzE4 = zzyt.zzE(i19 << 3);
                        zzy = zzyt.zzE(i23);
                        i11 = zzE4 + zzy;
                        i16 += i11;
                        break;
                    }
                case 12:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i24 = unsafe.getInt(obj, j10);
                        zzE4 = zzyt.zzE(i19 << 3);
                        zzy = zzyt.zzy(i24);
                        i11 = zzE4 + zzy;
                        i16 += i11;
                        break;
                    }
                case 13:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE2 = zzyt.zzE(i19 << 3);
                        zzE5 = zzE2 + 4;
                        i16 += zzE5;
                        break;
                    }
                case 14:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE = zzyt.zzE(i19 << 3);
                        zzE5 = zzE + 8;
                        i16 += zzE5;
                        break;
                    }
                case 15:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i25 = unsafe.getInt(obj, j10);
                        zzE4 = zzyt.zzE(i19 << 3);
                        zzy = zzyt.zzE((i25 >> 31) ^ (i25 + i25));
                        i11 = zzE4 + zzy;
                        i16 += i11;
                        break;
                    }
                case 16:
                    if ((i10 & i17) == 0) {
                        break;
                    } else {
                        long j13 = unsafe.getLong(obj, j10);
                        i16 += zzyt.zzE(i19 << 3) + zzyt.zzF((j13 >> 63) ^ (j13 + j13));
                        break;
                    }
                case 17:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzE5 = zzyt.zzx(i19, (zzaaq) unsafe.getObject(obj, j10), zzF(i15));
                        i16 += zzE5;
                        break;
                    }
                case 18:
                    zzE5 = zzabe.zzh(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 19:
                    zzE5 = zzabe.zzf(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 20:
                    zzE5 = zzabe.zzm(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 21:
                    zzE5 = zzabe.zzx(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 22:
                    zzE5 = zzabe.zzk(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 23:
                    zzE5 = zzabe.zzh(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 24:
                    zzE5 = zzabe.zzf(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 25:
                    zzE5 = zzabe.zza(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzE5;
                    break;
                case 26:
                    zzu = zzabe.zzu(i19, (List) unsafe.getObject(obj, j10));
                    i16 += zzu;
                    break;
                case 27:
                    zzu = zzabe.zzp(i19, (List) unsafe.getObject(obj, j10), zzF(i15));
                    i16 += zzu;
                    break;
                case 28:
                    zzu = zzabe.zzc(i19, (List) unsafe.getObject(obj, j10));
                    i16 += zzu;
                    break;
                case 29:
                    zzu = zzabe.zzv(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 30:
                    zzu = zzabe.zzd(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 31:
                    zzu = zzabe.zzf(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 32:
                    zzu = zzabe.zzh(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 33:
                    zzu = zzabe.zzq(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 34:
                    zzu = zzabe.zzs(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 35:
                    zzi = zzabe.zzi((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzyt.zzD(i19);
                        zzE8 = zzyt.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 36:
                    zzi = zzabe.zzg((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzyt.zzD(i19);
                        zzE8 = zzyt.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 37:
                    zzi = zzabe.zzn((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzyt.zzD(i19);
                        zzE8 = zzyt.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 38:
                    zzi = zzabe.zzy((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzyt.zzD(i19);
                        zzE8 = zzyt.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 39:
                    zzi = zzabe.zzl((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzyt.zzD(i19);
                        zzE8 = zzyt.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 40:
                    zzi = zzabe.zzi((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzyt.zzD(i19);
                        zzE8 = zzyt.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 41:
                    zzi = zzabe.zzg((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzyt.zzD(i19);
                        zzE8 = zzyt.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 42:
                    zzi = zzabe.zzb((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzyt.zzD(i19);
                        zzE8 = zzyt.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 43:
                    zzi = zzabe.zzw((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzyt.zzD(i19);
                        zzE8 = zzyt.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 44:
                    zzi = zzabe.zze((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzyt.zzD(i19);
                        zzE8 = zzyt.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 45:
                    zzi = zzabe.zzg((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzyt.zzD(i19);
                        zzE8 = zzyt.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 46:
                    zzi = zzabe.zzi((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzyt.zzD(i19);
                        zzE8 = zzyt.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 47:
                    zzi = zzabe.zzr((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzyt.zzD(i19);
                        zzE8 = zzyt.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 48:
                    zzi = zzabe.zzt((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzD = zzyt.zzD(i19);
                        zzE8 = zzyt.zzE(zzi);
                        i12 = zzD + zzE8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 49:
                    zzu = zzabe.zzj(i19, (List) unsafe.getObject(obj, j10), zzF(i15));
                    i16 += zzu;
                    break;
                case 50:
                    zzaal.zza(i19, unsafe.getObject(obj, j10), zzH(i15));
                    break;
                case 51:
                    if (zzT(obj, i19, i15)) {
                        zzE9 = zzyt.zzE(i19 << 3);
                        zzu = zzE9 + 8;
                        i16 += zzu;
                    }
                    break;
                case 52:
                    if (zzT(obj, i19, i15)) {
                        zzE10 = zzyt.zzE(i19 << 3);
                        zzu = zzE10 + 4;
                        i16 += zzu;
                    }
                    break;
                case 53:
                    if (zzT(obj, i19, i15)) {
                        long zzD2 = zzD(obj, j10);
                        zzE11 = zzyt.zzE(i19 << 3);
                        zzF2 = zzyt.zzF(zzD2);
                        i16 += zzE11 + zzF2;
                    }
                    break;
                case 54:
                    if (zzT(obj, i19, i15)) {
                        long zzD3 = zzD(obj, j10);
                        zzE11 = zzyt.zzE(i19 << 3);
                        zzF2 = zzyt.zzF(zzD3);
                        i16 += zzE11 + zzF2;
                    }
                    break;
                case 55:
                    if (zzT(obj, i19, i15)) {
                        int zzs = zzs(obj, j10);
                        i12 = zzyt.zzE(i19 << 3);
                        zzi = zzyt.zzy(zzs);
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 56:
                    if (zzT(obj, i19, i15)) {
                        zzE9 = zzyt.zzE(i19 << 3);
                        zzu = zzE9 + 8;
                        i16 += zzu;
                    }
                    break;
                case 57:
                    if (zzT(obj, i19, i15)) {
                        zzE10 = zzyt.zzE(i19 << 3);
                        zzu = zzE10 + 4;
                        i16 += zzu;
                    }
                    break;
                case 58:
                    if (zzT(obj, i19, i15)) {
                        zzu = zzyt.zzE(i19 << 3) + 1;
                        i16 += zzu;
                    }
                    break;
                case 59:
                    if (zzT(obj, i19, i15)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzyi) {
                            zzE12 = zzyt.zzE(i19 << 3);
                            zzd2 = ((zzyi) object2).zzd();
                            zzE13 = zzyt.zzE(zzd2);
                            i13 = zzE12 + zzE13 + zzd2;
                            i16 += i13;
                        } else {
                            i12 = zzyt.zzE(i19 << 3);
                            zzi = zzyt.zzC((String) object2);
                            i13 = i12 + zzi;
                            i16 += i13;
                        }
                    }
                    break;
                case 60:
                    if (zzT(obj, i19, i15)) {
                        zzu = zzabe.zzo(i19, unsafe.getObject(obj, j10), zzF(i15));
                        i16 += zzu;
                    }
                    break;
                case 61:
                    if (zzT(obj, i19, i15)) {
                        zzE12 = zzyt.zzE(i19 << 3);
                        zzd2 = ((zzyi) unsafe.getObject(obj, j10)).zzd();
                        zzE13 = zzyt.zzE(zzd2);
                        i13 = zzE12 + zzE13 + zzd2;
                        i16 += i13;
                    }
                    break;
                case 62:
                    if (zzT(obj, i19, i15)) {
                        int zzs2 = zzs(obj, j10);
                        i12 = zzyt.zzE(i19 << 3);
                        zzi = zzyt.zzE(zzs2);
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 63:
                    if (zzT(obj, i19, i15)) {
                        int zzs3 = zzs(obj, j10);
                        i12 = zzyt.zzE(i19 << 3);
                        zzi = zzyt.zzy(zzs3);
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 64:
                    if (zzT(obj, i19, i15)) {
                        zzE10 = zzyt.zzE(i19 << 3);
                        zzu = zzE10 + 4;
                        i16 += zzu;
                    }
                    break;
                case 65:
                    if (zzT(obj, i19, i15)) {
                        zzE9 = zzyt.zzE(i19 << 3);
                        zzu = zzE9 + 8;
                        i16 += zzu;
                    }
                    break;
                case 66:
                    if (zzT(obj, i19, i15)) {
                        int zzs4 = zzs(obj, j10);
                        i12 = zzyt.zzE(i19 << 3);
                        zzi = zzyt.zzE((zzs4 >> 31) ^ (zzs4 + zzs4));
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 67:
                    if (zzT(obj, i19, i15)) {
                        long zzD4 = zzD(obj, j10);
                        i16 += zzyt.zzE(i19 << 3) + zzyt.zzF((zzD4 >> 63) ^ (zzD4 + zzD4));
                    }
                    break;
                case 68:
                    if (zzT(obj, i19, i15)) {
                        zzu = zzyt.zzx(i19, (zzaaq) unsafe.getObject(obj, j10), zzF(i15));
                        i16 += zzu;
                    }
                    break;
            }
            i15 += 3;
            i14 = 1048575;
        }
        zzabt zzabtVar = this.zzo;
        int zza2 = i16 + zzabtVar.zza(zzabtVar.zzd(obj));
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
            if (zzB >= zzze.zzJ.zza() && zzB <= zzze.zzW.zza()) {
                int i14 = this.zzc[i12 + 2];
            }
            switch (zzB) {
                case 0:
                    if (zzQ(obj, i12)) {
                        zzE = zzyt.zzE(i13 << 3);
                        zzo = zzE + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(obj, i12)) {
                        zzE2 = zzyt.zzE(i13 << 3);
                        zzo = zzE2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(obj, i12)) {
                        long zzd2 = zzacd.zzd(obj, j10);
                        zzE3 = zzyt.zzE(i13 << 3);
                        zzF = zzyt.zzF(zzd2);
                        i11 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(obj, i12)) {
                        long zzd3 = zzacd.zzd(obj, j10);
                        zzE3 = zzyt.zzE(i13 << 3);
                        zzF = zzyt.zzF(zzd3);
                        i11 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(obj, i12)) {
                        int zzc = zzacd.zzc(obj, j10);
                        zzE4 = zzyt.zzE(i13 << 3);
                        zzy = zzyt.zzy(zzc);
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(obj, i12)) {
                        zzE = zzyt.zzE(i13 << 3);
                        zzo = zzE + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(obj, i12)) {
                        zzE2 = zzyt.zzE(i13 << 3);
                        zzo = zzE2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(obj, i12)) {
                        zzE5 = zzyt.zzE(i13 << 3);
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
                        Object zzf = zzacd.zzf(obj, j10);
                        if (zzf instanceof zzyi) {
                            zzE6 = zzyt.zzE(i13 << 3);
                            zzd = ((zzyi) zzf).zzd();
                            zzE7 = zzyt.zzE(zzd);
                            i10 = zzE6 + zzE7 + zzd;
                            i11 += i10;
                            break;
                        } else {
                            zzE4 = zzyt.zzE(i13 << 3);
                            zzy = zzyt.zzC((String) zzf);
                            i10 = zzE4 + zzy;
                            i11 += i10;
                        }
                    }
                case 9:
                    if (zzQ(obj, i12)) {
                        zzo = zzabe.zzo(i13, zzacd.zzf(obj, j10), zzF(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzQ(obj, i12)) {
                        zzE6 = zzyt.zzE(i13 << 3);
                        zzd = ((zzyi) zzacd.zzf(obj, j10)).zzd();
                        zzE7 = zzyt.zzE(zzd);
                        i10 = zzE6 + zzE7 + zzd;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(obj, i12)) {
                        int zzc2 = zzacd.zzc(obj, j10);
                        zzE4 = zzyt.zzE(i13 << 3);
                        zzy = zzyt.zzE(zzc2);
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(obj, i12)) {
                        int zzc3 = zzacd.zzc(obj, j10);
                        zzE4 = zzyt.zzE(i13 << 3);
                        zzy = zzyt.zzy(zzc3);
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(obj, i12)) {
                        zzE2 = zzyt.zzE(i13 << 3);
                        zzo = zzE2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(obj, i12)) {
                        zzE = zzyt.zzE(i13 << 3);
                        zzo = zzE + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(obj, i12)) {
                        int zzc4 = zzacd.zzc(obj, j10);
                        zzE4 = zzyt.zzE(i13 << 3);
                        zzy = zzyt.zzE((zzc4 >> 31) ^ (zzc4 + zzc4));
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(obj, i12)) {
                        long zzd4 = zzacd.zzd(obj, j10);
                        zzE4 = zzyt.zzE(i13 << 3);
                        zzy = zzyt.zzF((zzd4 >> 63) ^ (zzd4 + zzd4));
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzQ(obj, i12)) {
                        zzo = zzyt.zzx(i13, (zzaaq) zzacd.zzf(obj, j10), zzF(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzabe.zzh(i13, (List) zzacd.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 19:
                    zzo = zzabe.zzf(i13, (List) zzacd.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 20:
                    zzo = zzabe.zzm(i13, (List) zzacd.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 21:
                    zzo = zzabe.zzx(i13, (List) zzacd.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 22:
                    zzo = zzabe.zzk(i13, (List) zzacd.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 23:
                    zzo = zzabe.zzh(i13, (List) zzacd.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 24:
                    zzo = zzabe.zzf(i13, (List) zzacd.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 25:
                    zzo = zzabe.zza(i13, (List) zzacd.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 26:
                    zzo = zzabe.zzu(i13, (List) zzacd.zzf(obj, j10));
                    i11 += zzo;
                    break;
                case 27:
                    zzo = zzabe.zzp(i13, (List) zzacd.zzf(obj, j10), zzF(i12));
                    i11 += zzo;
                    break;
                case 28:
                    zzo = zzabe.zzc(i13, (List) zzacd.zzf(obj, j10));
                    i11 += zzo;
                    break;
                case 29:
                    zzo = zzabe.zzv(i13, (List) zzacd.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 30:
                    zzo = zzabe.zzd(i13, (List) zzacd.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 31:
                    zzo = zzabe.zzf(i13, (List) zzacd.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 32:
                    zzo = zzabe.zzh(i13, (List) zzacd.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 33:
                    zzo = zzabe.zzq(i13, (List) zzacd.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 34:
                    zzo = zzabe.zzs(i13, (List) zzacd.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 35:
                    zzy = zzabe.zzi((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzyt.zzD(i13);
                        zzE8 = zzyt.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzy = zzabe.zzg((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzyt.zzD(i13);
                        zzE8 = zzyt.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzy = zzabe.zzn((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzyt.zzD(i13);
                        zzE8 = zzyt.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzy = zzabe.zzy((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzyt.zzD(i13);
                        zzE8 = zzyt.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzy = zzabe.zzl((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzyt.zzD(i13);
                        zzE8 = zzyt.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzy = zzabe.zzi((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzyt.zzD(i13);
                        zzE8 = zzyt.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzy = zzabe.zzg((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzyt.zzD(i13);
                        zzE8 = zzyt.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzy = zzabe.zzb((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzyt.zzD(i13);
                        zzE8 = zzyt.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzy = zzabe.zzw((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzyt.zzD(i13);
                        zzE8 = zzyt.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzy = zzabe.zze((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzyt.zzD(i13);
                        zzE8 = zzyt.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzy = zzabe.zzg((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzyt.zzD(i13);
                        zzE8 = zzyt.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzy = zzabe.zzi((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzyt.zzD(i13);
                        zzE8 = zzyt.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzy = zzabe.zzr((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzyt.zzD(i13);
                        zzE8 = zzyt.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzy = zzabe.zzt((List) unsafe.getObject(obj, j10));
                    if (zzy > 0) {
                        zzD = zzyt.zzD(i13);
                        zzE8 = zzyt.zzE(zzy);
                        zzE4 = zzD + zzE8;
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzabe.zzj(i13, (List) zzacd.zzf(obj, j10), zzF(i12));
                    i11 += zzo;
                    break;
                case 50:
                    zzaal.zza(i13, zzacd.zzf(obj, j10), zzH(i12));
                    break;
                case 51:
                    if (zzT(obj, i13, i12)) {
                        zzE = zzyt.zzE(i13 << 3);
                        zzo = zzE + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i13, i12)) {
                        zzE2 = zzyt.zzE(i13 << 3);
                        zzo = zzE2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i13, i12)) {
                        long zzD2 = zzD(obj, j10);
                        zzE3 = zzyt.zzE(i13 << 3);
                        zzF = zzyt.zzF(zzD2);
                        i11 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i13, i12)) {
                        long zzD3 = zzD(obj, j10);
                        zzE3 = zzyt.zzE(i13 << 3);
                        zzF = zzyt.zzF(zzD3);
                        i11 += zzE3 + zzF;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i13, i12)) {
                        int zzs = zzs(obj, j10);
                        zzE4 = zzyt.zzE(i13 << 3);
                        zzy = zzyt.zzy(zzs);
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i13, i12)) {
                        zzE = zzyt.zzE(i13 << 3);
                        zzo = zzE + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i13, i12)) {
                        zzE2 = zzyt.zzE(i13 << 3);
                        zzo = zzE2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i13, i12)) {
                        zzE5 = zzyt.zzE(i13 << 3);
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
                        Object zzf2 = zzacd.zzf(obj, j10);
                        if (zzf2 instanceof zzyi) {
                            zzE6 = zzyt.zzE(i13 << 3);
                            zzd = ((zzyi) zzf2).zzd();
                            zzE7 = zzyt.zzE(zzd);
                            i10 = zzE6 + zzE7 + zzd;
                            i11 += i10;
                            break;
                        } else {
                            zzE4 = zzyt.zzE(i13 << 3);
                            zzy = zzyt.zzC((String) zzf2);
                            i10 = zzE4 + zzy;
                            i11 += i10;
                        }
                    }
                case 60:
                    if (zzT(obj, i13, i12)) {
                        zzo = zzabe.zzo(i13, zzacd.zzf(obj, j10), zzF(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i13, i12)) {
                        zzE6 = zzyt.zzE(i13 << 3);
                        zzd = ((zzyi) zzacd.zzf(obj, j10)).zzd();
                        zzE7 = zzyt.zzE(zzd);
                        i10 = zzE6 + zzE7 + zzd;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i13, i12)) {
                        int zzs2 = zzs(obj, j10);
                        zzE4 = zzyt.zzE(i13 << 3);
                        zzy = zzyt.zzE(zzs2);
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i13, i12)) {
                        int zzs3 = zzs(obj, j10);
                        zzE4 = zzyt.zzE(i13 << 3);
                        zzy = zzyt.zzy(zzs3);
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i13, i12)) {
                        zzE2 = zzyt.zzE(i13 << 3);
                        zzo = zzE2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i13, i12)) {
                        zzE = zzyt.zzE(i13 << 3);
                        zzo = zzE + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i13, i12)) {
                        int zzs4 = zzs(obj, j10);
                        zzE4 = zzyt.zzE(i13 << 3);
                        zzy = zzyt.zzE((zzs4 >> 31) ^ (zzs4 + zzs4));
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i13, i12)) {
                        long zzD4 = zzD(obj, j10);
                        zzE4 = zzyt.zzE(i13 << 3);
                        zzy = zzyt.zzF((zzD4 >> 63) ^ (zzD4 + zzD4));
                        i10 = zzE4 + zzy;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i13, i12)) {
                        zzo = zzyt.zzx(i13, (zzaaq) zzacd.zzf(obj, j10), zzF(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzabt zzabtVar = this.zzo;
        return i11 + zzabtVar.zza(zzabtVar.zzd(obj));
    }

    private static int zzs(Object obj, long j10) {
        return ((Integer) zzacd.zzf(obj, j10)).intValue();
    }

    private final int zzt(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzxv zzxvVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i12);
        Object object = unsafe.getObject(obj, j10);
        if (zzaal.zzb(object)) {
            zzaak zzb2 = zzaak.zza().zzb();
            zzaal.zzc(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        zzaaj zzaajVar = (zzaaj) zzH;
        throw null;
    }

    private final int zzu(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzxv zzxvVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzxw.zzn(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzxw.zzb(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int zzm = zzxw.zzm(bArr, i10, zzxvVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzxvVar.zzb));
                    unsafe.putInt(obj, j11, i13);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int zzj = zzxw.zzj(bArr, i10, zzxvVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzxvVar.zza));
                    unsafe.putInt(obj, j11, i13);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(zzxw.zzn(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(zzxw.zzb(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int zzm2 = zzxw.zzm(bArr, i10, zzxvVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(zzxvVar.zzb != 0));
                    unsafe.putInt(obj, j11, i13);
                    return zzm2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int zzj2 = zzxw.zzj(bArr, i10, zzxvVar);
                    int i18 = zzxvVar.zza;
                    if (i18 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else if ((i15 & 536870912) != 0 && !zzaci.zzf(bArr, zzj2, zzj2 + i18)) {
                        throw zzzt.zzd();
                    } else {
                        unsafe.putObject(obj, j10, new String(bArr, zzj2, i18, zzzr.zzb));
                        zzj2 += i18;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzj2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    int zzd = zzxw.zzd(zzF(i17), bArr, i10, i11, zzxvVar);
                    Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j10, zzxvVar.zzc);
                    } else {
                        unsafe.putObject(obj, j10, zzzr.zzg(object, zzxvVar.zzc));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzd;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int zza2 = zzxw.zza(bArr, i10, zzxvVar);
                    unsafe.putObject(obj, j10, zzxvVar.zzc);
                    unsafe.putInt(obj, j11, i13);
                    return zza2;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int zzj3 = zzxw.zzj(bArr, i10, zzxvVar);
                    int i19 = zzxvVar.zza;
                    zzzp zzE = zzE(i17);
                    if (zzE != null && !zzE.zza()) {
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
                    int zzj4 = zzxw.zzj(bArr, i10, zzxvVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzym.zzs(zzxvVar.zza)));
                    unsafe.putInt(obj, j11, i13);
                    return zzj4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int zzm3 = zzxw.zzm(bArr, i10, zzxvVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzym.zzt(zzxvVar.zzb)));
                    unsafe.putInt(obj, j11, i13);
                    return zzm3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    int zzc = zzxw.zzc(zzF(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzxvVar);
                    Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j10, zzxvVar.zzc);
                    } else {
                        unsafe.putObject(obj, j10, zzzr.zzg(object2, zzxvVar.zzc));
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
    private final int zzv(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.p002firebaseauthapi.zzxv r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaat.zzv(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzxv):int");
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
    private final int zzw(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.p002firebaseauthapi.zzxv r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaat.zzw(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.firebase-auth-api.zzxv):int");
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final int zza(Object obj) {
        return this.zzj ? zzr(obj) : zzq(obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
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
                    zzc = zzzr.zzc(Double.doubleToLongBits(zzacd.zza(obj, j10)));
                    i11 = i10 + zzc;
                    break;
                case 1:
                    i10 = i11 * 53;
                    zzc = Float.floatToIntBits(zzacd.zzb(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 2:
                    i10 = i11 * 53;
                    zzc = zzzr.zzc(zzacd.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 3:
                    i10 = i11 * 53;
                    zzc = zzzr.zzc(zzacd.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 4:
                    i10 = i11 * 53;
                    zzc = zzacd.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 5:
                    i10 = i11 * 53;
                    zzc = zzzr.zzc(zzacd.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 6:
                    i10 = i11 * 53;
                    zzc = zzacd.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 7:
                    i10 = i11 * 53;
                    zzc = zzzr.zza(zzacd.zzw(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 8:
                    i10 = i11 * 53;
                    zzc = ((String) zzacd.zzf(obj, j10)).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 9:
                    Object zzf = zzacd.zzf(obj, j10);
                    if (zzf != null) {
                        i14 = zzf.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    zzc = zzacd.zzf(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 11:
                    i10 = i11 * 53;
                    zzc = zzacd.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 12:
                    i10 = i11 * 53;
                    zzc = zzacd.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 13:
                    i10 = i11 * 53;
                    zzc = zzacd.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 14:
                    i10 = i11 * 53;
                    zzc = zzzr.zzc(zzacd.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 15:
                    i10 = i11 * 53;
                    zzc = zzacd.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 16:
                    i10 = i11 * 53;
                    zzc = zzzr.zzc(zzacd.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzacd.zzf(obj, j10);
                    if (zzf2 != null) {
                        i14 = zzf2.hashCode();
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
                    zzc = zzacd.zzf(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 50:
                    i10 = i11 * 53;
                    zzc = zzacd.zzf(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 51:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzzr.zzc(Double.doubleToLongBits(zzo(obj, j10)));
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
                        zzc = zzzr.zzc(zzD(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzzr.zzc(zzD(obj, j10));
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
                        zzc = zzzr.zzc(zzD(obj, j10));
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
                        zzc = zzzr.zza(zzU(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = ((String) zzacd.zzf(obj, j10)).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzacd.zzf(obj, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzacd.zzf(obj, j10).hashCode();
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
                        zzc = zzzr.zzc(zzD(obj, j10));
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
                        zzc = zzzr.zzc(zzD(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzacd.zzf(obj, j10).hashCode();
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
    public final int zzc(Object obj, byte[] bArr, int i10, int i11, int i12, zzxv zzxvVar) throws IOException {
        Unsafe unsafe;
        int i13;
        Object obj2;
        zzaat<T> zzaatVar;
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
        zzxv zzxvVar2;
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
        zzaat<T> zzaatVar2 = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i33 = i11;
        int i34 = i12;
        zzxv zzxvVar3 = zzxvVar;
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
                    i16 = zzxw.zzk(b10, bArr2, i41, zzxvVar3);
                    i15 = zzxvVar3.zza;
                } else {
                    i15 = b10;
                    i16 = i41;
                }
                int i42 = i15 >>> 3;
                int i43 = i15 & 7;
                if (i42 > i37) {
                    zzx = zzaatVar2.zzy(i42, i38 / 3);
                } else {
                    zzx = zzaatVar2.zzx(i42);
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
                    int[] iArr = zzaatVar2.zzc;
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
                                    zzacd.zzo(obj5, j10, Double.longBitsToDouble(zzxw.zzn(bArr2, i26)));
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
                                    zzacd.zzp(obj5, j10, Float.intBitsToFloat(zzxw.zzb(bArr2, i26)));
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
                                    zzm = zzxw.zzm(bArr2, i26, zzxvVar3);
                                    unsafe2.putLong(obj, j10, zzxvVar3.zzb);
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
                                    i35 = zzxw.zzj(bArr2, i26, zzxvVar3);
                                    unsafe2.putInt(obj5, j10, zzxvVar3.zza);
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
                                    unsafe2.putLong(obj, j10, zzxw.zzn(bArr2, i29));
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
                                    unsafe2.putInt(obj5, j10, zzxw.zzb(bArr2, i29));
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
                                    i35 = zzxw.zzm(bArr2, i29, zzxvVar3);
                                    zzacd.zzm(obj5, j10, zzxvVar3.zzb != 0);
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
                                        i35 = zzxw.zzg(bArr2, i29, zzxvVar3);
                                    } else {
                                        i35 = zzxw.zzh(bArr2, i29, zzxvVar3);
                                    }
                                    unsafe2.putObject(obj5, j10, zzxvVar3.zzc);
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
                                    i35 = zzxw.zzd(zzaatVar2.zzF(i28), bArr2, i29, i33, zzxvVar3);
                                    if ((i50 & i48) == 0) {
                                        unsafe2.putObject(obj5, j10, zzxvVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j10, zzzr.zzg(unsafe2.getObject(obj5, j10), zzxvVar3.zzc));
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
                                    i35 = zzxw.zza(bArr2, i29, zzxvVar3);
                                    unsafe2.putObject(obj5, j10, zzxvVar3.zzc);
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
                                    i35 = zzxw.zzj(bArr2, i29, zzxvVar3);
                                    int i51 = zzxvVar3.zza;
                                    zzzp zzE = zzaatVar2.zzE(i28);
                                    if (zzE != null && !zzE.zza()) {
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
                                    i35 = zzxw.zzj(bArr2, i29, zzxvVar3);
                                    unsafe2.putInt(obj5, j10, zzym.zzs(zzxvVar3.zza));
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
                                    zzm = zzxw.zzm(bArr2, i46, zzxvVar3);
                                    i25 = i45;
                                    i27 = i42;
                                    i28 = i23;
                                    unsafe2.putLong(obj, j10, zzym.zzt(zzxvVar3.zzb));
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
                                    i35 = zzxw.zzc(zzaatVar2.zzF(i28), bArr, i26, i11, (i27 << 3) | 4, zzxvVar);
                                    if ((i50 & i48) == 0) {
                                        unsafe2.putObject(obj5, j10, zzxvVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j10, zzzr.zzg(unsafe2.getObject(obj5, j10), zzxvVar3.zzc));
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
                                i35 = zzw(obj, bArr, i46, i11, i45, i42, i43, i21, i44, zzB, j10, zzxvVar);
                                if (i35 != i46) {
                                    zzaatVar2 = this;
                                    obj5 = obj;
                                    bArr2 = bArr;
                                    i36 = i32;
                                    i33 = i11;
                                    i34 = i12;
                                    zzxvVar3 = zzxvVar;
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
                                    i35 = zzu(obj, bArr, i31, i11, i32, i20, i43, i44, zzB, j10, i21, zzxvVar);
                                    if (i35 != i31) {
                                        zzaatVar2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i36 = i32;
                                        i33 = i11;
                                        i34 = i12;
                                        zzxvVar3 = zzxvVar;
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
                                    i35 = zzt(obj, bArr, i31, i11, i21, j10, zzxvVar);
                                    if (i35 != i31) {
                                        zzaatVar2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i36 = i32;
                                        i33 = i11;
                                        i34 = i12;
                                        zzxvVar3 = zzxvVar;
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
                            zzzq zzzqVar = (zzzq) unsafe2.getObject(obj5, j10);
                            if (!zzzqVar.zzc()) {
                                int size = zzzqVar.size();
                                zzzqVar = zzzqVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj5, j10, zzzqVar);
                            }
                            i24 = i40;
                            i35 = zzxw.zze(zzaatVar2.zzF(i52), i45, bArr, i46, i11, zzzqVar, zzxvVar);
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
                        zzxvVar2 = zzxvVar;
                        if (zzxvVar2.zzd != zzyy.zza()) {
                            i22 = i20;
                            if (zzxvVar2.zzd.zzb(this.zzg, i22) == null) {
                                i35 = zzxw.zzi(i18, bArr, i17, i11, zzd(obj), zzxvVar);
                                obj4 = obj;
                                i33 = i11;
                                i36 = i18;
                                zzaatVar2 = this;
                                zzxvVar3 = zzxvVar2;
                                i37 = i22;
                                obj5 = obj4;
                                i38 = i21;
                                i39 = i19;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i34 = i13;
                            } else {
                                zzzi zzziVar = (zzzi) obj;
                                throw null;
                            }
                        } else {
                            obj4 = obj;
                        }
                    } else {
                        obj4 = obj;
                        zzxvVar2 = zzxvVar;
                    }
                    i22 = i20;
                    i35 = zzxw.zzi(i18, bArr, i17, i11, zzd(obj), zzxvVar);
                    i33 = i11;
                    i36 = i18;
                    zzaatVar2 = this;
                    zzxvVar3 = zzxvVar2;
                    i37 = i22;
                    obj5 = obj4;
                    i38 = i21;
                    i39 = i19;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i34 = i13;
                } else {
                    i14 = 1048575;
                    zzaatVar = this;
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
                zzaatVar = zzaatVar2;
                obj3 = null;
                i14 = 1048575;
            }
        }
        if (i40 != i14) {
            unsafe.putInt(obj2, i40, i39);
        }
        for (int i53 = zzaatVar.zzl; i53 < zzaatVar.zzm; i53++) {
            zzaatVar.zzG(obj2, zzaatVar.zzk[i53], obj3, zzaatVar.zzo);
        }
        if (i13 == 0) {
            if (i35 != i11) {
                throw zzzt.zzg();
            }
        } else if (i35 > i11 || i36 != i13) {
            throw zzzt.zzg();
        }
        return i35;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final Object zze() {
        return ((zzzl) this.zzg).zzj(4, null, null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final void zzf(Object obj) {
        int i10;
        int i11 = this.zzl;
        while (true) {
            i10 = this.zzm;
            if (i11 >= i10) {
                break;
            }
            long zzC = zzC(this.zzk[i11]) & 1048575;
            Object zzf = zzacd.zzf(obj, zzC);
            if (zzf != null) {
                ((zzaak) zzf).zzc();
                zzacd.zzs(obj, zzC, zzf);
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final void zzg(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzC = zzC(i10);
            long j10 = 1048575 & zzC;
            int i11 = this.zzc[i10];
            switch (zzB(zzC)) {
                case 0:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzo(obj, j10, zzacd.zza(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzp(obj, j10, zzacd.zzb(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzr(obj, j10, zzacd.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzr(obj, j10, zzacd.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzq(obj, j10, zzacd.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzr(obj, j10, zzacd.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzq(obj, j10, zzacd.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzm(obj, j10, zzacd.zzw(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzs(obj, j10, zzacd.zzf(obj2, j10));
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
                        zzacd.zzs(obj, j10, zzacd.zzf(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzq(obj, j10, zzacd.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzq(obj, j10, zzacd.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzq(obj, j10, zzacd.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzr(obj, j10, zzacd.zzd(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzq(obj, j10, zzacd.zzc(obj2, j10));
                        zzM(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(obj2, i10)) {
                        zzacd.zzr(obj, j10, zzacd.zzd(obj2, j10));
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
                    zzabe.zzI(this.zzr, obj, obj2, j10);
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
                        zzacd.zzs(obj, j10, zzacd.zzf(obj2, j10));
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
                        zzacd.zzs(obj, j10, zzacd.zzf(obj2, j10));
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
        zzabe.zzF(this.zzo, obj, obj2);
        if (this.zzh) {
            zzabe.zzE(this.zzp, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final void zzh(Object obj, zzabb zzabbVar, zzyy zzyyVar) throws IOException {
        Objects.requireNonNull(zzyyVar);
        zzabt zzabtVar = this.zzo;
        zzyz zzyzVar = this.zzp;
        zzzd zzzdVar = null;
        Object obj2 = null;
        while (true) {
            try {
                int zzc = zzabbVar.zzc();
                int zzx = zzx(zzc);
                if (zzx >= 0) {
                    int zzC = zzC(zzx);
                    try {
                        switch (zzB(zzC)) {
                            case 0:
                                zzacd.zzo(obj, zzC & 1048575, zzabbVar.zza());
                                zzM(obj, zzx);
                                break;
                            case 1:
                                zzacd.zzp(obj, zzC & 1048575, zzabbVar.zzb());
                                zzM(obj, zzx);
                                break;
                            case 2:
                                zzacd.zzr(obj, zzC & 1048575, zzabbVar.zzl());
                                zzM(obj, zzx);
                                break;
                            case 3:
                                zzacd.zzr(obj, zzC & 1048575, zzabbVar.zzo());
                                zzM(obj, zzx);
                                break;
                            case 4:
                                zzacd.zzq(obj, zzC & 1048575, zzabbVar.zzg());
                                zzM(obj, zzx);
                                break;
                            case 5:
                                zzacd.zzr(obj, zzC & 1048575, zzabbVar.zzk());
                                zzM(obj, zzx);
                                break;
                            case 6:
                                zzacd.zzq(obj, zzC & 1048575, zzabbVar.zzf());
                                zzM(obj, zzx);
                                break;
                            case 7:
                                zzacd.zzm(obj, zzC & 1048575, zzabbVar.zzN());
                                zzM(obj, zzx);
                                break;
                            case 8:
                                zzL(obj, zzC, zzabbVar);
                                zzM(obj, zzx);
                                break;
                            case 9:
                                if (zzQ(obj, zzx)) {
                                    long j10 = zzC & 1048575;
                                    zzacd.zzs(obj, j10, zzzr.zzg(zzacd.zzf(obj, j10), zzabbVar.zzs(zzF(zzx), zzyyVar)));
                                    break;
                                } else {
                                    zzacd.zzs(obj, zzC & 1048575, zzabbVar.zzs(zzF(zzx), zzyyVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 10:
                                zzacd.zzs(obj, zzC & 1048575, zzabbVar.zzp());
                                zzM(obj, zzx);
                                break;
                            case 11:
                                zzacd.zzq(obj, zzC & 1048575, zzabbVar.zzj());
                                zzM(obj, zzx);
                                break;
                            case 12:
                                int zze = zzabbVar.zze();
                                zzzp zzE = zzE(zzx);
                                if (zzE != null && !zzE.zza()) {
                                    obj2 = zzabe.zzD(zzc, zze, obj2, zzabtVar);
                                    break;
                                }
                                zzacd.zzq(obj, zzC & 1048575, zze);
                                zzM(obj, zzx);
                                break;
                            case 13:
                                zzacd.zzq(obj, zzC & 1048575, zzabbVar.zzh());
                                zzM(obj, zzx);
                                break;
                            case 14:
                                zzacd.zzr(obj, zzC & 1048575, zzabbVar.zzm());
                                zzM(obj, zzx);
                                break;
                            case 15:
                                zzacd.zzq(obj, zzC & 1048575, zzabbVar.zzi());
                                zzM(obj, zzx);
                                break;
                            case 16:
                                zzacd.zzr(obj, zzC & 1048575, zzabbVar.zzn());
                                zzM(obj, zzx);
                                break;
                            case 17:
                                if (zzQ(obj, zzx)) {
                                    long j11 = zzC & 1048575;
                                    zzacd.zzs(obj, j11, zzzr.zzg(zzacd.zzf(obj, j11), zzabbVar.zzr(zzF(zzx), zzyyVar)));
                                    break;
                                } else {
                                    zzacd.zzs(obj, zzC & 1048575, zzabbVar.zzr(zzF(zzx), zzyyVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 18:
                                zzabbVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 19:
                                zzabbVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 20:
                                zzabbVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 21:
                                zzabbVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 22:
                                zzabbVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 23:
                                zzabbVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 24:
                                zzabbVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 25:
                                zzabbVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 26:
                                if (zzP(zzC)) {
                                    ((zzyn) zzabbVar).zzK(this.zzn.zza(obj, zzC & 1048575), true);
                                    break;
                                } else {
                                    ((zzyn) zzabbVar).zzK(this.zzn.zza(obj, zzC & 1048575), false);
                                    break;
                                }
                            case 27:
                                zzabbVar.zzF(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzyyVar);
                                break;
                            case 28:
                                zzabbVar.zzw(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 29:
                                zzabbVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 30:
                                List zza2 = this.zzn.zza(obj, zzC & 1048575);
                                zzabbVar.zzy(zza2);
                                obj2 = zzabe.zzC(zzc, zza2, zzE(zzx), obj2, zzabtVar);
                                break;
                            case 31:
                                zzabbVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 32:
                                zzabbVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 33:
                                zzabbVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 34:
                                zzabbVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 35:
                                zzabbVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 36:
                                zzabbVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 37:
                                zzabbVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 38:
                                zzabbVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 39:
                                zzabbVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 40:
                                zzabbVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 41:
                                zzabbVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 42:
                                zzabbVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 43:
                                zzabbVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 44:
                                List zza3 = this.zzn.zza(obj, zzC & 1048575);
                                zzabbVar.zzy(zza3);
                                obj2 = zzabe.zzC(zzc, zza3, zzE(zzx), obj2, zzabtVar);
                                break;
                            case 45:
                                zzabbVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 46:
                                zzabbVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 47:
                                zzabbVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 48:
                                zzabbVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 49:
                                zzabbVar.zzC(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzyyVar);
                                break;
                            case 50:
                                Object zzH = zzH(zzx);
                                long zzC2 = zzC(zzx) & 1048575;
                                Object zzf = zzacd.zzf(obj, zzC2);
                                if (zzf != null) {
                                    if (zzaal.zzb(zzf)) {
                                        Object zzb2 = zzaak.zza().zzb();
                                        zzaal.zzc(zzb2, zzf);
                                        zzacd.zzs(obj, zzC2, zzb2);
                                        zzf = zzb2;
                                    }
                                } else {
                                    zzf = zzaak.zza().zzb();
                                    zzacd.zzs(obj, zzC2, zzf);
                                }
                                zzaak zzaakVar = (zzaak) zzf;
                                zzaaj zzaajVar = (zzaaj) zzH;
                                throw null;
                                break;
                            case 51:
                                zzacd.zzs(obj, zzC & 1048575, Double.valueOf(zzabbVar.zza()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 52:
                                zzacd.zzs(obj, zzC & 1048575, Float.valueOf(zzabbVar.zzb()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 53:
                                zzacd.zzs(obj, zzC & 1048575, Long.valueOf(zzabbVar.zzl()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 54:
                                zzacd.zzs(obj, zzC & 1048575, Long.valueOf(zzabbVar.zzo()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 55:
                                zzacd.zzs(obj, zzC & 1048575, Integer.valueOf(zzabbVar.zzg()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 56:
                                zzacd.zzs(obj, zzC & 1048575, Long.valueOf(zzabbVar.zzk()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 57:
                                zzacd.zzs(obj, zzC & 1048575, Integer.valueOf(zzabbVar.zzf()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 58:
                                zzacd.zzs(obj, zzC & 1048575, Boolean.valueOf(zzabbVar.zzN()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 59:
                                zzL(obj, zzC, zzabbVar);
                                zzN(obj, zzc, zzx);
                                break;
                            case 60:
                                if (zzT(obj, zzc, zzx)) {
                                    long j12 = zzC & 1048575;
                                    zzacd.zzs(obj, j12, zzzr.zzg(zzacd.zzf(obj, j12), zzabbVar.zzs(zzF(zzx), zzyyVar)));
                                } else {
                                    zzacd.zzs(obj, zzC & 1048575, zzabbVar.zzs(zzF(zzx), zzyyVar));
                                    zzM(obj, zzx);
                                }
                                zzN(obj, zzc, zzx);
                                break;
                            case 61:
                                zzacd.zzs(obj, zzC & 1048575, zzabbVar.zzp());
                                zzN(obj, zzc, zzx);
                                break;
                            case 62:
                                zzacd.zzs(obj, zzC & 1048575, Integer.valueOf(zzabbVar.zzj()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 63:
                                int zze2 = zzabbVar.zze();
                                zzzp zzE2 = zzE(zzx);
                                if (zzE2 != null && !zzE2.zza()) {
                                    obj2 = zzabe.zzD(zzc, zze2, obj2, zzabtVar);
                                    break;
                                }
                                zzacd.zzs(obj, zzC & 1048575, Integer.valueOf(zze2));
                                zzN(obj, zzc, zzx);
                                break;
                            case 64:
                                zzacd.zzs(obj, zzC & 1048575, Integer.valueOf(zzabbVar.zzh()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 65:
                                zzacd.zzs(obj, zzC & 1048575, Long.valueOf(zzabbVar.zzm()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 66:
                                zzacd.zzs(obj, zzC & 1048575, Integer.valueOf(zzabbVar.zzi()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 67:
                                zzacd.zzs(obj, zzC & 1048575, Long.valueOf(zzabbVar.zzn()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 68:
                                zzacd.zzs(obj, zzC & 1048575, zzabbVar.zzr(zzF(zzx), zzyyVar));
                                zzN(obj, zzc, zzx);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = zzabtVar.zzf();
                                }
                                if (!zzabtVar.zzp(obj2, zzabbVar)) {
                                    for (int i10 = this.zzl; i10 < this.zzm; i10++) {
                                        obj2 = zzG(obj, this.zzk[i10], obj2, zzabtVar);
                                    }
                                    if (obj2 != null) {
                                        zzabtVar.zzn(obj, obj2);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzzs unused) {
                        zzabtVar.zzq(zzabbVar);
                        if (obj2 == null) {
                            obj2 = zzabtVar.zzc(obj);
                        }
                        if (!zzabtVar.zzp(obj2, zzabbVar)) {
                            for (int i11 = this.zzl; i11 < this.zzm; i11++) {
                                obj2 = zzG(obj, this.zzk[i11], obj2, zzabtVar);
                            }
                            if (obj2 != null) {
                                zzabtVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i12 = this.zzl; i12 < this.zzm; i12++) {
                        obj2 = zzG(obj, this.zzk[i12], obj2, zzabtVar);
                    }
                    if (obj2 != null) {
                        zzabtVar.zzn(obj, obj2);
                        return;
                    }
                    return;
                } else {
                    Object zzc2 = !this.zzh ? null : zzyzVar.zzc(zzyyVar, this.zzg, zzc);
                    if (zzc2 != null) {
                        if (zzzdVar == null) {
                            zzzdVar = zzyzVar.zzb(obj);
                        }
                        zzzd zzzdVar2 = zzzdVar;
                        obj2 = zzyzVar.zzd(zzabbVar, zzc2, zzyyVar, zzzdVar2, obj2, zzabtVar);
                        zzzdVar = zzzdVar2;
                    } else {
                        zzabtVar.zzq(zzabbVar);
                        if (obj2 == null) {
                            obj2 = zzabtVar.zzc(obj);
                        }
                        if (!zzabtVar.zzp(obj2, zzabbVar)) {
                            for (int i13 = this.zzl; i13 < this.zzm; i13++) {
                                obj2 = zzG(obj, this.zzk[i13], obj2, zzabtVar);
                            }
                            if (obj2 != null) {
                                zzabtVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i14 = this.zzl; i14 < this.zzm; i14++) {
                    obj2 = zzG(obj, this.zzk[i14], obj2, zzabtVar);
                }
                if (obj2 != null) {
                    zzabtVar.zzn(obj, obj2);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzxv zzxvVar) throws IOException {
        if (this.zzj) {
            zzv(obj, bArr, i10, i11, zzxvVar);
        } else {
            zzc(obj, bArr, i10, i11, 0, zzxvVar);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzH;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzC = zzC(i10);
            long j10 = zzC & 1048575;
            switch (zzB(zzC)) {
                case 0:
                    if (zzO(obj, obj2, i10) && Double.doubleToLongBits(zzacd.zza(obj, j10)) == Double.doubleToLongBits(zzacd.zza(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i10) && Float.floatToIntBits(zzacd.zzb(obj, j10)) == Float.floatToIntBits(zzacd.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i10) && zzacd.zzd(obj, j10) == zzacd.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i10) && zzacd.zzd(obj, j10) == zzacd.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i10) && zzacd.zzc(obj, j10) == zzacd.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i10) && zzacd.zzd(obj, j10) == zzacd.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i10) && zzacd.zzc(obj, j10) == zzacd.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i10) && zzacd.zzw(obj, j10) == zzacd.zzw(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i10) && zzabe.zzH(zzacd.zzf(obj, j10), zzacd.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i10) && zzabe.zzH(zzacd.zzf(obj, j10), zzacd.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i10) && zzabe.zzH(zzacd.zzf(obj, j10), zzacd.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i10) && zzacd.zzc(obj, j10) == zzacd.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i10) && zzacd.zzc(obj, j10) == zzacd.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i10) && zzacd.zzc(obj, j10) == zzacd.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i10) && zzacd.zzd(obj, j10) == zzacd.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i10) && zzacd.zzc(obj, j10) == zzacd.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i10) && zzacd.zzd(obj, j10) == zzacd.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i10) && zzabe.zzH(zzacd.zzf(obj, j10), zzacd.zzf(obj2, j10))) {
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
                    zzH = zzabe.zzH(zzacd.zzf(obj, j10), zzacd.zzf(obj2, j10));
                    break;
                case 50:
                    zzH = zzabe.zzH(zzacd.zzf(obj, j10), zzacd.zzf(obj2, j10));
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
                    if (zzacd.zzc(obj, zzz) == zzacd.zzc(obj2, zzz) && zzabe.zzH(zzacd.zzf(obj, j10), zzacd.zzf(obj2, j10))) {
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
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
                        if (zzB == 50 && !((zzaak) zzacd.zzf(obj, zzC & 1048575)).isEmpty()) {
                            zzaaj zzaajVar = (zzaaj) zzH(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) zzacd.zzf(obj, zzC & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzabc zzF = zzF(i15);
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzabc
    public final void zzn(Object obj, zzyu zzyuVar) throws IOException {
        if (!this.zzj) {
            zzV(obj, zzyuVar);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzC = zzC(i10);
                int i11 = this.zzc[i10];
                switch (zzB(zzC)) {
                    case 0:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzf(i11, zzacd.zza(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzo(i11, zzacd.zzb(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzt(i11, zzacd.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzJ(i11, zzacd.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzr(i11, zzacd.zzc(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzm(i11, zzacd.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzk(i11, zzacd.zzc(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzb(i11, zzacd.zzw(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzQ(obj, i10)) {
                            zzX(i11, zzacd.zzf(obj, zzC & 1048575), zzyuVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzv(i11, zzacd.zzf(obj, zzC & 1048575), zzF(i10));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzd(i11, (zzyi) zzacd.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzH(i11, zzacd.zzc(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzi(i11, zzacd.zzc(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzw(i11, zzacd.zzc(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzy(i11, zzacd.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzA(i11, zzacd.zzc(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzC(i11, zzacd.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzQ(obj, i10)) {
                            zzyuVar.zzq(i11, zzacd.zzf(obj, zzC & 1048575), zzF(i10));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzabe.zzL(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, false);
                        break;
                    case 19:
                        zzabe.zzP(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, false);
                        break;
                    case 20:
                        zzabe.zzS(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, false);
                        break;
                    case 21:
                        zzabe.zzaa(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, false);
                        break;
                    case 22:
                        zzabe.zzR(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, false);
                        break;
                    case 23:
                        zzabe.zzO(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, false);
                        break;
                    case 24:
                        zzabe.zzN(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, false);
                        break;
                    case 25:
                        zzabe.zzJ(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, false);
                        break;
                    case 26:
                        zzabe.zzY(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar);
                        break;
                    case 27:
                        zzabe.zzT(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, zzF(i10));
                        break;
                    case 28:
                        zzabe.zzK(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar);
                        break;
                    case 29:
                        zzabe.zzZ(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, false);
                        break;
                    case 30:
                        zzabe.zzM(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, false);
                        break;
                    case 31:
                        zzabe.zzU(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, false);
                        break;
                    case 32:
                        zzabe.zzV(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, false);
                        break;
                    case 33:
                        zzabe.zzW(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, false);
                        break;
                    case 34:
                        zzabe.zzX(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, false);
                        break;
                    case 35:
                        zzabe.zzL(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, true);
                        break;
                    case 36:
                        zzabe.zzP(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, true);
                        break;
                    case 37:
                        zzabe.zzS(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, true);
                        break;
                    case 38:
                        zzabe.zzaa(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, true);
                        break;
                    case 39:
                        zzabe.zzR(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, true);
                        break;
                    case 40:
                        zzabe.zzO(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, true);
                        break;
                    case 41:
                        zzabe.zzN(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, true);
                        break;
                    case 42:
                        zzabe.zzJ(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, true);
                        break;
                    case 43:
                        zzabe.zzZ(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, true);
                        break;
                    case 44:
                        zzabe.zzM(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, true);
                        break;
                    case 45:
                        zzabe.zzU(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, true);
                        break;
                    case 46:
                        zzabe.zzV(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, true);
                        break;
                    case 47:
                        zzabe.zzW(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, true);
                        break;
                    case 48:
                        zzabe.zzX(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, true);
                        break;
                    case 49:
                        zzabe.zzQ(i11, (List) zzacd.zzf(obj, zzC & 1048575), zzyuVar, zzF(i10));
                        break;
                    case 50:
                        zzW(zzyuVar, i11, zzacd.zzf(obj, zzC & 1048575), i10);
                        break;
                    case 51:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzf(i11, zzo(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzo(i11, zzp(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzt(i11, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzJ(i11, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzr(i11, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzm(i11, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzk(i11, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzb(i11, zzU(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i11, i10)) {
                            zzX(i11, zzacd.zzf(obj, zzC & 1048575), zzyuVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzv(i11, zzacd.zzf(obj, zzC & 1048575), zzF(i10));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzd(i11, (zzyi) zzacd.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzH(i11, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzi(i11, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzw(i11, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzy(i11, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzA(i11, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzC(i11, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i11, i10)) {
                            zzyuVar.zzq(i11, zzacd.zzf(obj, zzC & 1048575), zzF(i10));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzabt zzabtVar = this.zzo;
            zzabtVar.zzr(zzabtVar.zzd(obj), zzyuVar);
        } else {
            this.zzp.zza(obj);
            throw null;
        }
    }
}
