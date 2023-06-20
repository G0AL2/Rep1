package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i10, int i11, zzlj zzljVar, boolean z10, boolean z11, int[] iArr2, int i12, int i13, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = z10;
        boolean z12 = false;
        if (zzjpVar != null && zzjpVar.zzc(zzljVar)) {
            z12 = true;
        }
        this.zzh = z12;
        this.zzj = iArr2;
        this.zzk = i12;
        this.zzl = i13;
        this.zzp = zzloVar;
        this.zzm = zzkxVar;
        this.zzn = zzmlVar;
        this.zzo = zzjpVar;
        this.zzg = zzljVar;
        this.zzq = zzleVar;
    }

    private static int zzA(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzB(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzC(Object obj, long j10) {
        return ((Long) zzmv.zzf(obj, j10)).longValue();
    }

    private final zzkg zzD(int i10) {
        int i11 = i10 / 3;
        return (zzkg) this.zzd[i11 + i11 + 1];
    }

    private final zzlu zzE(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzlu zzluVar = (zzlu) this.zzd[i12];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu zzb2 = zzlr.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private static Field zzG(Class cls, String str) {
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

    private final void zzH(Object obj, Object obj2, int i10) {
        long zzB = zzB(i10) & 1048575;
        if (zzO(obj2, i10)) {
            Object zzf = zzmv.zzf(obj, zzB);
            Object zzf2 = zzmv.zzf(obj2, zzB);
            if (zzf != null && zzf2 != null) {
                zzmv.zzs(obj, zzB, zzkk.zzg(zzf, zzf2));
                zzJ(obj, i10);
            } else if (zzf2 != null) {
                zzmv.zzs(obj, zzB, zzf2);
                zzJ(obj, i10);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i10) {
        int zzB = zzB(i10);
        int i11 = this.zzc[i10];
        long j10 = zzB & 1048575;
        if (zzR(obj2, i11, i10)) {
            Object zzf = zzR(obj, i11, i10) ? zzmv.zzf(obj, j10) : null;
            Object zzf2 = zzmv.zzf(obj2, j10);
            if (zzf != null && zzf2 != null) {
                zzmv.zzs(obj, j10, zzkk.zzg(zzf, zzf2));
                zzK(obj, i11, i10);
            } else if (zzf2 != null) {
                zzmv.zzs(obj, j10, zzf2);
                zzK(obj, i11, i10);
            }
        }
    }

    private final void zzJ(Object obj, int i10) {
        int zzy = zzy(i10);
        long j10 = 1048575 & zzy;
        if (j10 == 1048575) {
            return;
        }
        zzmv.zzq(obj, j10, (1 << (zzy >>> 20)) | zzmv.zzc(obj, j10));
    }

    private final void zzK(Object obj, int i10, int i11) {
        zzmv.zzq(obj, zzy(i11) & 1048575, i10);
    }

    private final void zzL(Object obj, zznd zzndVar) throws IOException {
        int i10;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i11 = 1048575;
            int i12 = 0;
            int i13 = 0;
            int i14 = 1048575;
            while (i12 < length) {
                int zzB = zzB(i12);
                int[] iArr = this.zzc;
                int i15 = iArr[i12];
                int zzA = zzA(zzB);
                if (zzA <= 17) {
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
                long j10 = zzB & i11;
                switch (zzA) {
                    case 0:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzf(i15, zzmv.zza(obj, j10));
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 1:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzo(i15, zzmv.zzb(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 2:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzt(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 3:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzJ(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 4:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzr(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 5:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzm(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 6:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzk(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 7:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzb(i15, zzmv.zzw(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 8:
                        if ((i13 & i10) != 0) {
                            zzT(i15, unsafe.getObject(obj, j10), zzndVar);
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 9:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzv(i15, unsafe.getObject(obj, j10), zzE(i12));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 10:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzd(i15, (zzjb) unsafe.getObject(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 11:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzH(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 12:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzi(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 13:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzw(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 14:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzy(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 15:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzA(i15, unsafe.getInt(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 16:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzC(i15, unsafe.getLong(obj, j10));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 17:
                        if ((i13 & i10) != 0) {
                            zzndVar.zzq(i15, unsafe.getObject(obj, j10), zzE(i12));
                        } else {
                            continue;
                        }
                        i12 += 3;
                        i11 = 1048575;
                    case 18:
                        zzlw.zzJ(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 19:
                        zzlw.zzN(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 20:
                        zzlw.zzQ(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 21:
                        zzlw.zzY(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 22:
                        zzlw.zzP(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 23:
                        zzlw.zzM(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 24:
                        zzlw.zzL(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 25:
                        zzlw.zzH(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, false);
                        continue;
                        i12 += 3;
                        i11 = 1048575;
                    case 26:
                        zzlw.zzW(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar);
                        break;
                    case 27:
                        zzlw.zzR(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, zzE(i12));
                        break;
                    case 28:
                        zzlw.zzI(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar);
                        break;
                    case 29:
                        zzlw.zzX(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, false);
                        break;
                    case 30:
                        zzlw.zzK(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, false);
                        break;
                    case 31:
                        zzlw.zzS(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, false);
                        break;
                    case 32:
                        zzlw.zzT(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, false);
                        break;
                    case 33:
                        zzlw.zzU(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, false);
                        break;
                    case 34:
                        zzlw.zzV(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, false);
                        break;
                    case 35:
                        zzlw.zzJ(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, true);
                        break;
                    case 36:
                        zzlw.zzN(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, true);
                        break;
                    case 37:
                        zzlw.zzQ(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, true);
                        break;
                    case 38:
                        zzlw.zzY(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, true);
                        break;
                    case 39:
                        zzlw.zzP(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, true);
                        break;
                    case 40:
                        zzlw.zzM(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, true);
                        break;
                    case 41:
                        zzlw.zzL(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, true);
                        break;
                    case 42:
                        zzlw.zzH(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, true);
                        break;
                    case 43:
                        zzlw.zzX(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, true);
                        break;
                    case 44:
                        zzlw.zzK(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, true);
                        break;
                    case 45:
                        zzlw.zzS(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, true);
                        break;
                    case 46:
                        zzlw.zzT(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, true);
                        break;
                    case 47:
                        zzlw.zzU(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, true);
                        break;
                    case 48:
                        zzlw.zzV(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, true);
                        break;
                    case 49:
                        zzlw.zzO(this.zzc[i12], (List) unsafe.getObject(obj, j10), zzndVar, zzE(i12));
                        break;
                    case 50:
                        zzM(zzndVar, i15, unsafe.getObject(obj, j10), i12);
                        break;
                    case 51:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzf(i15, zzn(obj, j10));
                            break;
                        }
                        break;
                    case 52:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzo(i15, zzo(obj, j10));
                            break;
                        }
                        break;
                    case 53:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzt(i15, zzC(obj, j10));
                            break;
                        }
                        break;
                    case 54:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzJ(i15, zzC(obj, j10));
                            break;
                        }
                        break;
                    case 55:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzr(i15, zzr(obj, j10));
                            break;
                        }
                        break;
                    case 56:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzm(i15, zzC(obj, j10));
                            break;
                        }
                        break;
                    case 57:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzk(i15, zzr(obj, j10));
                            break;
                        }
                        break;
                    case 58:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzb(i15, zzS(obj, j10));
                            break;
                        }
                        break;
                    case 59:
                        if (zzR(obj, i15, i12)) {
                            zzT(i15, unsafe.getObject(obj, j10), zzndVar);
                            break;
                        }
                        break;
                    case 60:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzv(i15, unsafe.getObject(obj, j10), zzE(i12));
                            break;
                        }
                        break;
                    case 61:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzd(i15, (zzjb) unsafe.getObject(obj, j10));
                            break;
                        }
                        break;
                    case 62:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzH(i15, zzr(obj, j10));
                            break;
                        }
                        break;
                    case 63:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzi(i15, zzr(obj, j10));
                            break;
                        }
                        break;
                    case 64:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzw(i15, zzr(obj, j10));
                            break;
                        }
                        break;
                    case 65:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzy(i15, zzC(obj, j10));
                            break;
                        }
                        break;
                    case 66:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzA(i15, zzr(obj, j10));
                            break;
                        }
                        break;
                    case 67:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzC(i15, zzC(obj, j10));
                            break;
                        }
                        break;
                    case 68:
                        if (zzR(obj, i15, i12)) {
                            zzndVar.zzq(i15, unsafe.getObject(obj, j10), zzE(i12));
                            break;
                        }
                        break;
                }
                i12 += 3;
                i11 = 1048575;
            }
            zzml zzmlVar = this.zzn;
            zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
            return;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final void zzM(zznd zzndVar, int i10, Object obj, int i11) throws IOException {
        if (obj == null) {
            return;
        }
        zzlc zzlcVar = (zzlc) zzF(i11);
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i10) {
        return zzO(obj, i10) == zzO(obj2, i10);
    }

    private final boolean zzO(Object obj, int i10) {
        int zzy = zzy(i10);
        long j10 = zzy & 1048575;
        if (j10 != 1048575) {
            return (zzmv.zzc(obj, j10) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i10);
        long j11 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmv.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmv.zzb(obj, j11)) != 0;
            case 2:
                return zzmv.zzd(obj, j11) != 0;
            case 3:
                return zzmv.zzd(obj, j11) != 0;
            case 4:
                return zzmv.zzc(obj, j11) != 0;
            case 5:
                return zzmv.zzd(obj, j11) != 0;
            case 6:
                return zzmv.zzc(obj, j11) != 0;
            case 7:
                return zzmv.zzw(obj, j11);
            case 8:
                Object zzf = zzmv.zzf(obj, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzjb) {
                    return !zzjb.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzmv.zzf(obj, j11) != null;
            case 10:
                return !zzjb.zzb.equals(zzmv.zzf(obj, j11));
            case 11:
                return zzmv.zzc(obj, j11) != 0;
            case 12:
                return zzmv.zzc(obj, j11) != 0;
            case 13:
                return zzmv.zzc(obj, j11) != 0;
            case 14:
                return zzmv.zzd(obj, j11) != 0;
            case 15:
                return zzmv.zzc(obj, j11) != 0;
            case 16:
                return zzmv.zzd(obj, j11) != 0;
            case 17:
                return zzmv.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzO(obj, i10);
        }
        return (i12 & i13) != 0;
    }

    private static boolean zzQ(Object obj, int i10, zzlu zzluVar) {
        return zzluVar.zzk(zzmv.zzf(obj, i10 & 1048575));
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzmv.zzc(obj, (long) (zzy(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzmv.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zznd zzndVar) throws IOException {
        if (obj instanceof String) {
            zzndVar.zzF(i10, (String) obj);
        } else {
            zzndVar.zzd(i10, (zzjb) obj);
        }
    }

    static zzmm zzd(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        zzmm zzmmVar = zzkcVar.zzc;
        if (zzmmVar == zzmm.zzc()) {
            zzmm zze = zzmm.zze();
            zzkcVar.zzc = zze;
            return zze;
        }
        return zzmmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
        }
        zzmi zzmiVar = (zzmi) zzlgVar;
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
    static com.google.android.gms.internal.measurement.zzlm zzm(com.google.android.gms.internal.measurement.zzlt r34, com.google.android.gms.internal.measurement.zzlo r35, com.google.android.gms.internal.measurement.zzkx r36, com.google.android.gms.internal.measurement.zzml r37, com.google.android.gms.internal.measurement.zzjp r38, com.google.android.gms.internal.measurement.zzle r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzm(com.google.android.gms.internal.measurement.zzlt, com.google.android.gms.internal.measurement.zzlo, com.google.android.gms.internal.measurement.zzkx, com.google.android.gms.internal.measurement.zzml, com.google.android.gms.internal.measurement.zzjp, com.google.android.gms.internal.measurement.zzle):com.google.android.gms.internal.measurement.zzlm");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzmv.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzmv.zzf(obj, j10)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zzp(Object obj) {
        int i10;
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int i11;
        int zzu;
        int zzi;
        int zzz;
        int zzA8;
        int i12;
        int zzA9;
        int zzA10;
        int zzA11;
        int zzB2;
        int zzA12;
        int zzd2;
        int zzA13;
        int i13;
        Unsafe unsafe = zzb;
        int i14 = 1048575;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1048575;
        while (i15 < this.zzc.length) {
            int zzB3 = zzB(i15);
            int[] iArr = this.zzc;
            int i19 = iArr[i15];
            int zzA14 = zzA(zzB3);
            if (zzA14 <= 17) {
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
            long j10 = zzB3 & i14;
            switch (zzA14) {
                case 0:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzA = zzjj.zzA(i19 << 3);
                        zzA5 = zzA + 8;
                        i16 += zzA5;
                        break;
                    }
                case 1:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzA2 = zzjj.zzA(i19 << 3);
                        zzA5 = zzA2 + 4;
                        i16 += zzA5;
                        break;
                    }
                case 2:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        long j11 = unsafe.getLong(obj, j10);
                        zzA3 = zzjj.zzA(i19 << 3);
                        zzB = zzjj.zzB(j11);
                        i16 += zzA3 + zzB;
                        break;
                    }
                case 3:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        long j12 = unsafe.getLong(obj, j10);
                        zzA3 = zzjj.zzA(i19 << 3);
                        zzB = zzjj.zzB(j12);
                        i16 += zzA3 + zzB;
                        break;
                    }
                case 4:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i22 = unsafe.getInt(obj, j10);
                        zzA4 = zzjj.zzA(i19 << 3);
                        zzv = zzjj.zzv(i22);
                        i11 = zzA4 + zzv;
                        i16 += i11;
                        break;
                    }
                case 5:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzA = zzjj.zzA(i19 << 3);
                        zzA5 = zzA + 8;
                        i16 += zzA5;
                        break;
                    }
                case 6:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzA2 = zzjj.zzA(i19 << 3);
                        zzA5 = zzA2 + 4;
                        i16 += zzA5;
                        break;
                    }
                case 7:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzA5 = zzjj.zzA(i19 << 3) + 1;
                        i16 += zzA5;
                        break;
                    }
                case 8:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j10);
                        if (object instanceof zzjb) {
                            zzA6 = zzjj.zzA(i19 << 3);
                            zzd = ((zzjb) object).zzd();
                            zzA7 = zzjj.zzA(zzd);
                            i11 = zzA6 + zzA7 + zzd;
                            i16 += i11;
                            break;
                        } else {
                            zzA4 = zzjj.zzA(i19 << 3);
                            zzv = zzjj.zzy((String) object);
                            i11 = zzA4 + zzv;
                            i16 += i11;
                        }
                    }
                case 9:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzA5 = zzlw.zzo(i19, unsafe.getObject(obj, j10), zzE(i15));
                        i16 += zzA5;
                        break;
                    }
                case 10:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzA6 = zzjj.zzA(i19 << 3);
                        zzd = ((zzjb) unsafe.getObject(obj, j10)).zzd();
                        zzA7 = zzjj.zzA(zzd);
                        i11 = zzA6 + zzA7 + zzd;
                        i16 += i11;
                        break;
                    }
                case 11:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i23 = unsafe.getInt(obj, j10);
                        zzA4 = zzjj.zzA(i19 << 3);
                        zzv = zzjj.zzA(i23);
                        i11 = zzA4 + zzv;
                        i16 += i11;
                        break;
                    }
                case 12:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i24 = unsafe.getInt(obj, j10);
                        zzA4 = zzjj.zzA(i19 << 3);
                        zzv = zzjj.zzv(i24);
                        i11 = zzA4 + zzv;
                        i16 += i11;
                        break;
                    }
                case 13:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzA2 = zzjj.zzA(i19 << 3);
                        zzA5 = zzA2 + 4;
                        i16 += zzA5;
                        break;
                    }
                case 14:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzA = zzjj.zzA(i19 << 3);
                        zzA5 = zzA + 8;
                        i16 += zzA5;
                        break;
                    }
                case 15:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        int i25 = unsafe.getInt(obj, j10);
                        zzA4 = zzjj.zzA(i19 << 3);
                        zzv = zzjj.zzA((i25 >> 31) ^ (i25 + i25));
                        i11 = zzA4 + zzv;
                        i16 += i11;
                        break;
                    }
                case 16:
                    if ((i10 & i17) == 0) {
                        break;
                    } else {
                        long j13 = unsafe.getLong(obj, j10);
                        i16 += zzjj.zzA(i19 << 3) + zzjj.zzB((j13 >> 63) ^ (j13 + j13));
                        break;
                    }
                case 17:
                    if ((i17 & i10) == 0) {
                        break;
                    } else {
                        zzA5 = zzjj.zzu(i19, (zzlj) unsafe.getObject(obj, j10), zzE(i15));
                        i16 += zzA5;
                        break;
                    }
                case 18:
                    zzA5 = zzlw.zzh(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzA5;
                    break;
                case 19:
                    zzA5 = zzlw.zzf(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzA5;
                    break;
                case 20:
                    zzA5 = zzlw.zzm(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzA5;
                    break;
                case 21:
                    zzA5 = zzlw.zzx(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzA5;
                    break;
                case 22:
                    zzA5 = zzlw.zzk(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzA5;
                    break;
                case 23:
                    zzA5 = zzlw.zzh(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzA5;
                    break;
                case 24:
                    zzA5 = zzlw.zzf(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzA5;
                    break;
                case 25:
                    zzA5 = zzlw.zza(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzA5;
                    break;
                case 26:
                    zzu = zzlw.zzu(i19, (List) unsafe.getObject(obj, j10));
                    i16 += zzu;
                    break;
                case 27:
                    zzu = zzlw.zzp(i19, (List) unsafe.getObject(obj, j10), zzE(i15));
                    i16 += zzu;
                    break;
                case 28:
                    zzu = zzlw.zzc(i19, (List) unsafe.getObject(obj, j10));
                    i16 += zzu;
                    break;
                case 29:
                    zzu = zzlw.zzv(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 30:
                    zzu = zzlw.zzd(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 31:
                    zzu = zzlw.zzf(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 32:
                    zzu = zzlw.zzh(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 33:
                    zzu = zzlw.zzq(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 34:
                    zzu = zzlw.zzs(i19, (List) unsafe.getObject(obj, j10), false);
                    i16 += zzu;
                    break;
                case 35:
                    zzi = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i19);
                        zzA8 = zzjj.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 36:
                    zzi = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i19);
                        zzA8 = zzjj.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 37:
                    zzi = zzlw.zzn((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i19);
                        zzA8 = zzjj.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 38:
                    zzi = zzlw.zzy((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i19);
                        zzA8 = zzjj.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 39:
                    zzi = zzlw.zzl((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i19);
                        zzA8 = zzjj.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 40:
                    zzi = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i19);
                        zzA8 = zzjj.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 41:
                    zzi = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i19);
                        zzA8 = zzjj.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 42:
                    zzi = zzlw.zzb((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i19);
                        zzA8 = zzjj.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 43:
                    zzi = zzlw.zzw((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i19);
                        zzA8 = zzjj.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 44:
                    zzi = zzlw.zze((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i19);
                        zzA8 = zzjj.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 45:
                    zzi = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i19);
                        zzA8 = zzjj.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 46:
                    zzi = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i19);
                        zzA8 = zzjj.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 47:
                    zzi = zzlw.zzr((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i19);
                        zzA8 = zzjj.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 48:
                    zzi = zzlw.zzt((List) unsafe.getObject(obj, j10));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i19);
                        zzA8 = zzjj.zzA(zzi);
                        i12 = zzz + zzA8;
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 49:
                    zzu = zzlw.zzj(i19, (List) unsafe.getObject(obj, j10), zzE(i15));
                    i16 += zzu;
                    break;
                case 50:
                    zzle.zza(i19, unsafe.getObject(obj, j10), zzF(i15));
                    break;
                case 51:
                    if (zzR(obj, i19, i15)) {
                        zzA9 = zzjj.zzA(i19 << 3);
                        zzu = zzA9 + 8;
                        i16 += zzu;
                    }
                    break;
                case 52:
                    if (zzR(obj, i19, i15)) {
                        zzA10 = zzjj.zzA(i19 << 3);
                        zzu = zzA10 + 4;
                        i16 += zzu;
                    }
                    break;
                case 53:
                    if (zzR(obj, i19, i15)) {
                        long zzC = zzC(obj, j10);
                        zzA11 = zzjj.zzA(i19 << 3);
                        zzB2 = zzjj.zzB(zzC);
                        i16 += zzA11 + zzB2;
                    }
                    break;
                case 54:
                    if (zzR(obj, i19, i15)) {
                        long zzC2 = zzC(obj, j10);
                        zzA11 = zzjj.zzA(i19 << 3);
                        zzB2 = zzjj.zzB(zzC2);
                        i16 += zzA11 + zzB2;
                    }
                    break;
                case 55:
                    if (zzR(obj, i19, i15)) {
                        int zzr = zzr(obj, j10);
                        i12 = zzjj.zzA(i19 << 3);
                        zzi = zzjj.zzv(zzr);
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 56:
                    if (zzR(obj, i19, i15)) {
                        zzA9 = zzjj.zzA(i19 << 3);
                        zzu = zzA9 + 8;
                        i16 += zzu;
                    }
                    break;
                case 57:
                    if (zzR(obj, i19, i15)) {
                        zzA10 = zzjj.zzA(i19 << 3);
                        zzu = zzA10 + 4;
                        i16 += zzu;
                    }
                    break;
                case 58:
                    if (zzR(obj, i19, i15)) {
                        zzu = zzjj.zzA(i19 << 3) + 1;
                        i16 += zzu;
                    }
                    break;
                case 59:
                    if (zzR(obj, i19, i15)) {
                        Object object2 = unsafe.getObject(obj, j10);
                        if (object2 instanceof zzjb) {
                            zzA12 = zzjj.zzA(i19 << 3);
                            zzd2 = ((zzjb) object2).zzd();
                            zzA13 = zzjj.zzA(zzd2);
                            i13 = zzA12 + zzA13 + zzd2;
                            i16 += i13;
                        } else {
                            i12 = zzjj.zzA(i19 << 3);
                            zzi = zzjj.zzy((String) object2);
                            i13 = i12 + zzi;
                            i16 += i13;
                        }
                    }
                    break;
                case 60:
                    if (zzR(obj, i19, i15)) {
                        zzu = zzlw.zzo(i19, unsafe.getObject(obj, j10), zzE(i15));
                        i16 += zzu;
                    }
                    break;
                case 61:
                    if (zzR(obj, i19, i15)) {
                        zzA12 = zzjj.zzA(i19 << 3);
                        zzd2 = ((zzjb) unsafe.getObject(obj, j10)).zzd();
                        zzA13 = zzjj.zzA(zzd2);
                        i13 = zzA12 + zzA13 + zzd2;
                        i16 += i13;
                    }
                    break;
                case 62:
                    if (zzR(obj, i19, i15)) {
                        int zzr2 = zzr(obj, j10);
                        i12 = zzjj.zzA(i19 << 3);
                        zzi = zzjj.zzA(zzr2);
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 63:
                    if (zzR(obj, i19, i15)) {
                        int zzr3 = zzr(obj, j10);
                        i12 = zzjj.zzA(i19 << 3);
                        zzi = zzjj.zzv(zzr3);
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 64:
                    if (zzR(obj, i19, i15)) {
                        zzA10 = zzjj.zzA(i19 << 3);
                        zzu = zzA10 + 4;
                        i16 += zzu;
                    }
                    break;
                case 65:
                    if (zzR(obj, i19, i15)) {
                        zzA9 = zzjj.zzA(i19 << 3);
                        zzu = zzA9 + 8;
                        i16 += zzu;
                    }
                    break;
                case 66:
                    if (zzR(obj, i19, i15)) {
                        int zzr4 = zzr(obj, j10);
                        i12 = zzjj.zzA(i19 << 3);
                        zzi = zzjj.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        i13 = i12 + zzi;
                        i16 += i13;
                    }
                    break;
                case 67:
                    if (zzR(obj, i19, i15)) {
                        long zzC3 = zzC(obj, j10);
                        i16 += zzjj.zzA(i19 << 3) + zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                    }
                    break;
                case 68:
                    if (zzR(obj, i19, i15)) {
                        zzu = zzjj.zzu(i19, (zzlj) unsafe.getObject(obj, j10), zzE(i15));
                        i16 += zzu;
                    }
                    break;
            }
            i15 += 3;
            i14 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        int zza2 = i16 + zzmlVar.zza(zzmlVar.zzc(obj));
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return zza2;
    }

    private final int zzq(Object obj) {
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int zzo;
        int zzz;
        int zzA8;
        int i10;
        Unsafe unsafe = zzb;
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzc.length; i12 += 3) {
            int zzB2 = zzB(i12);
            int zzA9 = zzA(zzB2);
            int i13 = this.zzc[i12];
            long j10 = zzB2 & 1048575;
            if (zzA9 >= zzju.zzJ.zza() && zzA9 <= zzju.zzW.zza()) {
                int i14 = this.zzc[i12 + 2];
            }
            switch (zzA9) {
                case 0:
                    if (zzO(obj, i12)) {
                        zzA = zzjj.zzA(i13 << 3);
                        zzo = zzA + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj, i12)) {
                        zzA2 = zzjj.zzA(i13 << 3);
                        zzo = zzA2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj, i12)) {
                        long zzd2 = zzmv.zzd(obj, j10);
                        zzA3 = zzjj.zzA(i13 << 3);
                        zzB = zzjj.zzB(zzd2);
                        i11 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj, i12)) {
                        long zzd3 = zzmv.zzd(obj, j10);
                        zzA3 = zzjj.zzA(i13 << 3);
                        zzB = zzjj.zzB(zzd3);
                        i11 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj, i12)) {
                        int zzc = zzmv.zzc(obj, j10);
                        zzA4 = zzjj.zzA(i13 << 3);
                        zzv = zzjj.zzv(zzc);
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj, i12)) {
                        zzA = zzjj.zzA(i13 << 3);
                        zzo = zzA + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj, i12)) {
                        zzA2 = zzjj.zzA(i13 << 3);
                        zzo = zzA2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj, i12)) {
                        zzA5 = zzjj.zzA(i13 << 3);
                        zzo = zzA5 + 1;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!zzO(obj, i12)) {
                        break;
                    } else {
                        Object zzf = zzmv.zzf(obj, j10);
                        if (zzf instanceof zzjb) {
                            zzA6 = zzjj.zzA(i13 << 3);
                            zzd = ((zzjb) zzf).zzd();
                            zzA7 = zzjj.zzA(zzd);
                            i10 = zzA6 + zzA7 + zzd;
                            i11 += i10;
                            break;
                        } else {
                            zzA4 = zzjj.zzA(i13 << 3);
                            zzv = zzjj.zzy((String) zzf);
                            i10 = zzA4 + zzv;
                            i11 += i10;
                        }
                    }
                case 9:
                    if (zzO(obj, i12)) {
                        zzo = zzlw.zzo(i13, zzmv.zzf(obj, j10), zzE(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (zzO(obj, i12)) {
                        zzA6 = zzjj.zzA(i13 << 3);
                        zzd = ((zzjb) zzmv.zzf(obj, j10)).zzd();
                        zzA7 = zzjj.zzA(zzd);
                        i10 = zzA6 + zzA7 + zzd;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj, i12)) {
                        int zzc2 = zzmv.zzc(obj, j10);
                        zzA4 = zzjj.zzA(i13 << 3);
                        zzv = zzjj.zzA(zzc2);
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj, i12)) {
                        int zzc3 = zzmv.zzc(obj, j10);
                        zzA4 = zzjj.zzA(i13 << 3);
                        zzv = zzjj.zzv(zzc3);
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj, i12)) {
                        zzA2 = zzjj.zzA(i13 << 3);
                        zzo = zzA2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj, i12)) {
                        zzA = zzjj.zzA(i13 << 3);
                        zzo = zzA + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj, i12)) {
                        int zzc4 = zzmv.zzc(obj, j10);
                        zzA4 = zzjj.zzA(i13 << 3);
                        zzv = zzjj.zzA((zzc4 >> 31) ^ (zzc4 + zzc4));
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj, i12)) {
                        long zzd4 = zzmv.zzd(obj, j10);
                        zzA4 = zzjj.zzA(i13 << 3);
                        zzv = zzjj.zzB((zzd4 >> 63) ^ (zzd4 + zzd4));
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (zzO(obj, i12)) {
                        zzo = zzjj.zzu(i13, (zzlj) zzmv.zzf(obj, j10), zzE(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    zzo = zzlw.zzh(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 19:
                    zzo = zzlw.zzf(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 20:
                    zzo = zzlw.zzm(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 21:
                    zzo = zzlw.zzx(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 22:
                    zzo = zzlw.zzk(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 23:
                    zzo = zzlw.zzh(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 24:
                    zzo = zzlw.zzf(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 25:
                    zzo = zzlw.zza(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 26:
                    zzo = zzlw.zzu(i13, (List) zzmv.zzf(obj, j10));
                    i11 += zzo;
                    break;
                case 27:
                    zzo = zzlw.zzp(i13, (List) zzmv.zzf(obj, j10), zzE(i12));
                    i11 += zzo;
                    break;
                case 28:
                    zzo = zzlw.zzc(i13, (List) zzmv.zzf(obj, j10));
                    i11 += zzo;
                    break;
                case 29:
                    zzo = zzlw.zzv(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 30:
                    zzo = zzlw.zzd(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 31:
                    zzo = zzlw.zzf(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 32:
                    zzo = zzlw.zzh(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 33:
                    zzo = zzlw.zzq(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 34:
                    zzo = zzlw.zzs(i13, (List) zzmv.zzf(obj, j10), false);
                    i11 += zzo;
                    break;
                case 35:
                    zzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i13);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 36:
                    zzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i13);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 37:
                    zzv = zzlw.zzn((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i13);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 38:
                    zzv = zzlw.zzy((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i13);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    zzv = zzlw.zzl((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i13);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    zzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i13);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    zzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i13);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    zzv = zzlw.zzb((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i13);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    zzv = zzlw.zzw((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i13);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    zzv = zzlw.zze((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i13);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    zzv = zzlw.zzg((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i13);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    zzv = zzlw.zzi((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i13);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    zzv = zzlw.zzr((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i13);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    zzv = zzlw.zzt((List) unsafe.getObject(obj, j10));
                    if (zzv > 0) {
                        zzz = zzjj.zzz(i13);
                        zzA8 = zzjj.zzA(zzv);
                        zzA4 = zzz + zzA8;
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    zzo = zzlw.zzj(i13, (List) zzmv.zzf(obj, j10), zzE(i12));
                    i11 += zzo;
                    break;
                case 50:
                    zzle.zza(i13, zzmv.zzf(obj, j10), zzF(i12));
                    break;
                case 51:
                    if (zzR(obj, i13, i12)) {
                        zzA = zzjj.zzA(i13 << 3);
                        zzo = zzA + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i13, i12)) {
                        zzA2 = zzjj.zzA(i13 << 3);
                        zzo = zzA2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i13, i12)) {
                        long zzC = zzC(obj, j10);
                        zzA3 = zzjj.zzA(i13 << 3);
                        zzB = zzjj.zzB(zzC);
                        i11 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i13, i12)) {
                        long zzC2 = zzC(obj, j10);
                        zzA3 = zzjj.zzA(i13 << 3);
                        zzB = zzjj.zzB(zzC2);
                        i11 += zzA3 + zzB;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i13, i12)) {
                        int zzr = zzr(obj, j10);
                        zzA4 = zzjj.zzA(i13 << 3);
                        zzv = zzjj.zzv(zzr);
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i13, i12)) {
                        zzA = zzjj.zzA(i13 << 3);
                        zzo = zzA + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i13, i12)) {
                        zzA2 = zzjj.zzA(i13 << 3);
                        zzo = zzA2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i13, i12)) {
                        zzA5 = zzjj.zzA(i13 << 3);
                        zzo = zzA5 + 1;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!zzR(obj, i13, i12)) {
                        break;
                    } else {
                        Object zzf2 = zzmv.zzf(obj, j10);
                        if (zzf2 instanceof zzjb) {
                            zzA6 = zzjj.zzA(i13 << 3);
                            zzd = ((zzjb) zzf2).zzd();
                            zzA7 = zzjj.zzA(zzd);
                            i10 = zzA6 + zzA7 + zzd;
                            i11 += i10;
                            break;
                        } else {
                            zzA4 = zzjj.zzA(i13 << 3);
                            zzv = zzjj.zzy((String) zzf2);
                            i10 = zzA4 + zzv;
                            i11 += i10;
                        }
                    }
                case 60:
                    if (zzR(obj, i13, i12)) {
                        zzo = zzlw.zzo(i13, zzmv.zzf(obj, j10), zzE(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i13, i12)) {
                        zzA6 = zzjj.zzA(i13 << 3);
                        zzd = ((zzjb) zzmv.zzf(obj, j10)).zzd();
                        zzA7 = zzjj.zzA(zzd);
                        i10 = zzA6 + zzA7 + zzd;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i13, i12)) {
                        int zzr2 = zzr(obj, j10);
                        zzA4 = zzjj.zzA(i13 << 3);
                        zzv = zzjj.zzA(zzr2);
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i13, i12)) {
                        int zzr3 = zzr(obj, j10);
                        zzA4 = zzjj.zzA(i13 << 3);
                        zzv = zzjj.zzv(zzr3);
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i13, i12)) {
                        zzA2 = zzjj.zzA(i13 << 3);
                        zzo = zzA2 + 4;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i13, i12)) {
                        zzA = zzjj.zzA(i13 << 3);
                        zzo = zzA + 8;
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i13, i12)) {
                        int zzr4 = zzr(obj, j10);
                        zzA4 = zzjj.zzA(i13 << 3);
                        zzv = zzjj.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i13, i12)) {
                        long zzC3 = zzC(obj, j10);
                        zzA4 = zzjj.zzA(i13 << 3);
                        zzv = zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        i10 = zzA4 + zzv;
                        i11 += i10;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i13, i12)) {
                        zzo = zzjj.zzu(i13, (zzlj) zzmv.zzf(obj, j10), zzE(i12));
                        i11 += zzo;
                        break;
                    } else {
                        break;
                    }
            }
        }
        zzml zzmlVar = this.zzn;
        return i11 + zzmlVar.zza(zzmlVar.zzc(obj));
    }

    private static int zzr(Object obj, long j10) {
        return ((Integer) zzmv.zzf(obj, j10)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((zzld) object).zze()) {
            zzld zzb2 = zzld.zza().zzb();
            zzle.zzb(zzb2, object);
            unsafe.putObject(obj, j10, zzb2);
        }
        zzlc zzlcVar = (zzlc) zzF;
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i10))));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int zzm = zzip.zzm(bArr, i10, zzioVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzioVar.zzb));
                    unsafe.putInt(obj, j11, i13);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int zzj = zzip.zzj(bArr, i10, zzioVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzioVar.zza));
                    unsafe.putInt(obj, j11, i13);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(obj, j10, Long.valueOf(zzip.zzn(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 8;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(obj, j10, Integer.valueOf(zzip.zzb(bArr, i10)));
                    unsafe.putInt(obj, j11, i13);
                    return i10 + 4;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int zzm2 = zzip.zzm(bArr, i10, zzioVar);
                    unsafe.putObject(obj, j10, Boolean.valueOf(zzioVar.zzb != 0));
                    unsafe.putInt(obj, j11, i13);
                    return zzm2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int zzj2 = zzip.zzj(bArr, i10, zzioVar);
                    int i18 = zzioVar.zza;
                    if (i18 == 0) {
                        unsafe.putObject(obj, j10, "");
                    } else if ((i15 & 536870912) != 0 && !zzna.zzf(bArr, zzj2, zzj2 + i18)) {
                        throw zzkm.zzc();
                    } else {
                        unsafe.putObject(obj, j10, new String(bArr, zzj2, i18, zzkk.zzb));
                        zzj2 += i18;
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzj2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    int zzd = zzip.zzd(zzE(i17), bArr, i10, i11, zzioVar);
                    Object object = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j10, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j10, zzkk.zzg(object, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j11, i13);
                    return zzd;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int zza2 = zzip.zza(bArr, i10, zzioVar);
                    unsafe.putObject(obj, j10, zzioVar.zzc);
                    unsafe.putInt(obj, j11, i13);
                    return zza2;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int zzj3 = zzip.zzj(bArr, i10, zzioVar);
                    int i19 = zzioVar.zza;
                    zzkg zzD = zzD(i17);
                    if (zzD != null && !zzD.zza(i19)) {
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
                    int zzj4 = zzip.zzj(bArr, i10, zzioVar);
                    unsafe.putObject(obj, j10, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                    unsafe.putInt(obj, j11, i13);
                    return zzj4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int zzm3 = zzip.zzm(bArr, i10, zzioVar);
                    unsafe.putObject(obj, j10, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                    unsafe.putInt(obj, j11, i13);
                    return zzm3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    int zzc = zzip.zzc(zzE(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzioVar);
                    Object object2 = unsafe.getInt(obj, j11) == i13 ? unsafe.getObject(obj, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j10, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j10, zzkk.zzg(object2, zzioVar.zzc));
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
    private final int zzu(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.measurement.zzio r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 958
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzu(java.lang.Object, byte[], int, int, com.google.android.gms.internal.measurement.zzio):int");
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
    private final int zzv(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.measurement.zzio r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzlm.zzv(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.zzio):int");
    }

    private final int zzw(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, 0);
    }

    private final int zzx(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzz(i10, i11);
    }

    private final int zzy(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzz(int i10, int i11) {
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

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object obj) {
        int i10;
        int zzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int zzB = zzB(i12);
            int i13 = this.zzc[i12];
            long j10 = 1048575 & zzB;
            int i14 = 37;
            switch (zzA(zzB)) {
                case 0:
                    i10 = i11 * 53;
                    zzc = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j10)));
                    i11 = i10 + zzc;
                    break;
                case 1:
                    i10 = i11 * 53;
                    zzc = Float.floatToIntBits(zzmv.zzb(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 2:
                    i10 = i11 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 3:
                    i10 = i11 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 4:
                    i10 = i11 * 53;
                    zzc = zzmv.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 5:
                    i10 = i11 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 6:
                    i10 = i11 * 53;
                    zzc = zzmv.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 7:
                    i10 = i11 * 53;
                    zzc = zzkk.zza(zzmv.zzw(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 8:
                    i10 = i11 * 53;
                    zzc = ((String) zzmv.zzf(obj, j10)).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 9:
                    Object zzf = zzmv.zzf(obj, j10);
                    if (zzf != null) {
                        i14 = zzf.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    zzc = zzmv.zzf(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 11:
                    i10 = i11 * 53;
                    zzc = zzmv.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 12:
                    i10 = i11 * 53;
                    zzc = zzmv.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 13:
                    i10 = i11 * 53;
                    zzc = zzmv.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 14:
                    i10 = i11 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 15:
                    i10 = i11 * 53;
                    zzc = zzmv.zzc(obj, j10);
                    i11 = i10 + zzc;
                    break;
                case 16:
                    i10 = i11 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j10));
                    i11 = i10 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzmv.zzf(obj, j10);
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
                    zzc = zzmv.zzf(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 50:
                    i10 = i11 * 53;
                    zzc = zzmv.zzf(obj, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 51:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j10)));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = Float.floatToIntBits(zzo(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzr(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzr(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzkk.zza(zzS(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = ((String) zzmv.zzf(obj, j10)).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzmv.zzf(obj, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzmv.zzf(obj, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzr(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzr(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzr(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzr(obj, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzkk.zzc(zzC(obj, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzmv.zzf(obj, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i11 * 53) + this.zzn.zzc(obj).hashCode();
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return hashCode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzc(Object obj, byte[] bArr, int i10, int i11, int i12, zzio zzioVar) throws IOException {
        Unsafe unsafe;
        int i13;
        Object obj2;
        zzlm<T> zzlmVar;
        byte b10;
        int zzw;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Object obj3;
        int i19;
        zzio zzioVar2;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        zzlm<T> zzlmVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i30 = i11;
        int i31 = i12;
        zzio zzioVar3 = zzioVar;
        Unsafe unsafe2 = zzb;
        int i32 = i10;
        int i33 = 0;
        int i34 = -1;
        int i35 = 0;
        int i36 = 0;
        int i37 = 1048575;
        while (true) {
            if (i32 < i30) {
                int i38 = i32 + 1;
                byte b11 = bArr2[i32];
                if (b11 < 0) {
                    int zzk = zzip.zzk(b11, bArr2, i38, zzioVar3);
                    b10 = zzioVar3.zza;
                    i38 = zzk;
                } else {
                    b10 = b11;
                }
                int i39 = b10 >>> 3;
                int i40 = b10 & 7;
                if (i39 > i34) {
                    zzw = zzlmVar2.zzx(i39, i35 / 3);
                } else {
                    zzw = zzlmVar2.zzw(i39);
                }
                if (zzw == -1) {
                    i14 = i39;
                    i15 = i38;
                    i16 = b10;
                    i17 = i36;
                    unsafe = unsafe2;
                    i13 = i31;
                    i18 = 0;
                } else {
                    int[] iArr = zzlmVar2.zzc;
                    int i41 = iArr[zzw + 1];
                    int zzA = zzA(i41);
                    int i42 = i38;
                    long j10 = i41 & 1048575;
                    if (zzA <= 17) {
                        int i43 = iArr[zzw + 2];
                        int i44 = 1 << (i43 >>> 20);
                        int i45 = i43 & 1048575;
                        if (i45 != i37) {
                            i20 = b10;
                            if (i37 != 1048575) {
                                unsafe2.putInt(obj4, i37, i36);
                            }
                            i36 = unsafe2.getInt(obj4, i45);
                            i21 = i45;
                        } else {
                            i20 = b10;
                            i21 = i37;
                        }
                        int i46 = i36;
                        switch (zzA) {
                            case 0:
                                i22 = zzw;
                                i14 = i39;
                                i23 = i42;
                                if (i40 == 1) {
                                    zzmv.zzo(obj4, j10, Double.longBitsToDouble(zzip.zzn(bArr2, i23)));
                                    i32 = i23 + 8;
                                    i36 = i46 | i44;
                                    i34 = i14;
                                    i31 = i12;
                                    i35 = i22;
                                    i33 = i20;
                                    i37 = i21;
                                    i30 = i11;
                                    break;
                                } else {
                                    i42 = i23;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 1:
                                i22 = zzw;
                                i14 = i39;
                                i23 = i42;
                                if (i40 == 5) {
                                    zzmv.zzp(obj4, j10, Float.intBitsToFloat(zzip.zzb(bArr2, i23)));
                                    i32 = i23 + 4;
                                    i36 = i46 | i44;
                                    i34 = i14;
                                    i31 = i12;
                                    i35 = i22;
                                    i33 = i20;
                                    i37 = i21;
                                    i30 = i11;
                                    break;
                                } else {
                                    i42 = i23;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 2:
                            case 3:
                                i22 = zzw;
                                i14 = i39;
                                i23 = i42;
                                if (i40 == 0) {
                                    int zzm = zzip.zzm(bArr2, i23, zzioVar3);
                                    unsafe2.putLong(obj, j10, zzioVar3.zzb);
                                    i36 = i46 | i44;
                                    i34 = i14;
                                    i31 = i12;
                                    i32 = zzm;
                                    i35 = i22;
                                    i33 = i20;
                                    i37 = i21;
                                    i30 = i11;
                                    break;
                                } else {
                                    i42 = i23;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 4:
                            case 11:
                                i22 = zzw;
                                i14 = i39;
                                i23 = i42;
                                if (i40 == 0) {
                                    i32 = zzip.zzj(bArr2, i23, zzioVar3);
                                    unsafe2.putInt(obj4, j10, zzioVar3.zza);
                                    i36 = i46 | i44;
                                    i34 = i14;
                                    i31 = i12;
                                    i35 = i22;
                                    i33 = i20;
                                    i37 = i21;
                                    i30 = i11;
                                    break;
                                } else {
                                    i42 = i23;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 5:
                            case 14:
                                int i47 = i20;
                                i14 = i39;
                                if (i40 == 1) {
                                    i22 = zzw;
                                    i20 = i47;
                                    i23 = i42;
                                    unsafe2.putLong(obj, j10, zzip.zzn(bArr2, i42));
                                    i32 = i23 + 8;
                                    i36 = i46 | i44;
                                    i34 = i14;
                                    i31 = i12;
                                    i35 = i22;
                                    i33 = i20;
                                    i37 = i21;
                                    i30 = i11;
                                    break;
                                } else {
                                    i22 = zzw;
                                    i20 = i47;
                                    i42 = i42;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 6:
                            case 13:
                                i24 = i20;
                                i14 = i39;
                                i25 = i42;
                                if (i40 == 5) {
                                    unsafe2.putInt(obj4, j10, zzip.zzb(bArr2, i25));
                                    i32 = i25 + 4;
                                    i36 = i46 | i44;
                                    i35 = zzw;
                                    i33 = i24;
                                    i37 = i21;
                                    i34 = i14;
                                    i31 = i12;
                                    break;
                                } else {
                                    i22 = zzw;
                                    i42 = i25;
                                    i20 = i24;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 7:
                                i24 = i20;
                                i14 = i39;
                                i25 = i42;
                                if (i40 == 0) {
                                    i32 = zzip.zzm(bArr2, i25, zzioVar3);
                                    zzmv.zzm(obj4, j10, zzioVar3.zzb != 0);
                                    i36 = i46 | i44;
                                    i35 = zzw;
                                    i33 = i24;
                                    i37 = i21;
                                    i34 = i14;
                                    i31 = i12;
                                    break;
                                } else {
                                    i22 = zzw;
                                    i42 = i25;
                                    i20 = i24;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 8:
                                i24 = i20;
                                i14 = i39;
                                i25 = i42;
                                if (i40 == 2) {
                                    if ((536870912 & i41) == 0) {
                                        i32 = zzip.zzg(bArr2, i25, zzioVar3);
                                    } else {
                                        i32 = zzip.zzh(bArr2, i25, zzioVar3);
                                    }
                                    unsafe2.putObject(obj4, j10, zzioVar3.zzc);
                                    i36 = i46 | i44;
                                    i35 = zzw;
                                    i33 = i24;
                                    i37 = i21;
                                    i34 = i14;
                                    i31 = i12;
                                    break;
                                } else {
                                    i22 = zzw;
                                    i42 = i25;
                                    i20 = i24;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 9:
                                i26 = zzw;
                                i24 = i20;
                                i14 = i39;
                                i27 = i42;
                                if (i40 == 2) {
                                    i32 = zzip.zzd(zzlmVar2.zzE(i26), bArr2, i27, i30, zzioVar3);
                                    if ((i46 & i44) == 0) {
                                        unsafe2.putObject(obj4, j10, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j10, zzkk.zzg(unsafe2.getObject(obj4, j10), zzioVar3.zzc));
                                    }
                                    i36 = i46 | i44;
                                    i34 = i14;
                                    i35 = i26;
                                    i33 = i24;
                                    i37 = i21;
                                    i31 = i12;
                                    break;
                                } else {
                                    i42 = i27;
                                    i22 = i26;
                                    i20 = i24;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 10:
                                i26 = zzw;
                                i24 = i20;
                                i14 = i39;
                                i27 = i42;
                                if (i40 == 2) {
                                    i32 = zzip.zza(bArr2, i27, zzioVar3);
                                    unsafe2.putObject(obj4, j10, zzioVar3.zzc);
                                    i36 = i46 | i44;
                                    i34 = i14;
                                    i35 = i26;
                                    i33 = i24;
                                    i37 = i21;
                                    i31 = i12;
                                    break;
                                } else {
                                    i42 = i27;
                                    i22 = i26;
                                    i20 = i24;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 12:
                                i26 = zzw;
                                i24 = i20;
                                i14 = i39;
                                i27 = i42;
                                if (i40 == 0) {
                                    i32 = zzip.zzj(bArr2, i27, zzioVar3);
                                    int i48 = zzioVar3.zza;
                                    zzkg zzD = zzlmVar2.zzD(i26);
                                    if (zzD != null && !zzD.zza(i48)) {
                                        zzd(obj).zzh(i24, Long.valueOf(i48));
                                        i34 = i14;
                                        i36 = i46;
                                        i35 = i26;
                                        i33 = i24;
                                        i37 = i21;
                                        i31 = i12;
                                    } else {
                                        unsafe2.putInt(obj4, j10, i48);
                                        i36 = i46 | i44;
                                        i34 = i14;
                                        i35 = i26;
                                        i33 = i24;
                                        i37 = i21;
                                        i31 = i12;
                                        break;
                                    }
                                } else {
                                    i42 = i27;
                                    i22 = i26;
                                    i20 = i24;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                                break;
                            case 15:
                                i26 = zzw;
                                i24 = i20;
                                i14 = i39;
                                i27 = i42;
                                if (i40 == 0) {
                                    i32 = zzip.zzj(bArr2, i27, zzioVar3);
                                    unsafe2.putInt(obj4, j10, zzjf.zzb(zzioVar3.zza));
                                    i36 = i46 | i44;
                                    i34 = i14;
                                    i35 = i26;
                                    i33 = i24;
                                    i37 = i21;
                                    i31 = i12;
                                    break;
                                } else {
                                    i42 = i27;
                                    i22 = i26;
                                    i20 = i24;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            case 16:
                                if (i40 == 0) {
                                    int zzm2 = zzip.zzm(bArr2, i42, zzioVar3);
                                    i26 = zzw;
                                    i24 = i20;
                                    unsafe2.putLong(obj, j10, zzjf.zzc(zzioVar3.zzb));
                                    i36 = i46 | i44;
                                    i34 = i39;
                                    i32 = zzm2;
                                    i35 = i26;
                                    i33 = i24;
                                    i37 = i21;
                                    i31 = i12;
                                    break;
                                } else {
                                    i14 = i39;
                                    i22 = zzw;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                            default:
                                i22 = zzw;
                                i14 = i39;
                                i23 = i42;
                                if (i40 == 3) {
                                    i32 = zzip.zzc(zzlmVar2.zzE(i22), bArr, i23, i11, (i14 << 3) | 4, zzioVar);
                                    if ((i46 & i44) == 0) {
                                        unsafe2.putObject(obj4, j10, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j10, zzkk.zzg(unsafe2.getObject(obj4, j10), zzioVar3.zzc));
                                    }
                                    i36 = i46 | i44;
                                    bArr2 = bArr;
                                    i34 = i14;
                                    i31 = i12;
                                    i35 = i22;
                                    i33 = i20;
                                    i37 = i21;
                                    i30 = i11;
                                    break;
                                } else {
                                    i42 = i23;
                                    i13 = i12;
                                    i17 = i46;
                                    unsafe = unsafe2;
                                    i16 = i20;
                                    i15 = i42;
                                    i37 = i21;
                                    i18 = i22;
                                    break;
                                }
                        }
                    } else {
                        int i49 = zzw;
                        int i50 = b10;
                        if (zzA != 27) {
                            i17 = i36;
                            i28 = i37;
                            if (zzA <= 49) {
                                i14 = i39;
                                unsafe = unsafe2;
                                i18 = i49;
                                i32 = zzv(obj, bArr, i42, i11, i50, i39, i40, i49, i41, zzA, j10, zzioVar);
                                if (i32 != i42) {
                                    zzlmVar2 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i34 = i14;
                                    i30 = i11;
                                    i31 = i12;
                                    zzioVar3 = zzioVar;
                                    i33 = i50;
                                    i35 = i18;
                                    i36 = i17;
                                    i37 = i28;
                                    unsafe2 = unsafe;
                                } else {
                                    i13 = i12;
                                    i15 = i32;
                                    i16 = i50;
                                    i37 = i28;
                                }
                            } else {
                                i14 = i39;
                                unsafe = unsafe2;
                                i29 = i42;
                                i18 = i49;
                                if (zzA != 50) {
                                    i32 = zzt(obj, bArr, i29, i11, i50, i14, i40, i41, zzA, j10, i18, zzioVar);
                                    if (i32 != i29) {
                                        zzlmVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i34 = i14;
                                        i30 = i11;
                                        i31 = i12;
                                        zzioVar3 = zzioVar;
                                        i33 = i50;
                                        i35 = i18;
                                        i36 = i17;
                                        i37 = i28;
                                        unsafe2 = unsafe;
                                    } else {
                                        i13 = i12;
                                        i15 = i32;
                                        i16 = i50;
                                        i37 = i28;
                                    }
                                } else if (i40 == 2) {
                                    i32 = zzs(obj, bArr, i29, i11, i18, j10, zzioVar);
                                    if (i32 != i29) {
                                        zzlmVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i34 = i14;
                                        i30 = i11;
                                        i31 = i12;
                                        zzioVar3 = zzioVar;
                                        i33 = i50;
                                        i35 = i18;
                                        i36 = i17;
                                        i37 = i28;
                                        unsafe2 = unsafe;
                                    } else {
                                        i13 = i12;
                                        i15 = i32;
                                        i16 = i50;
                                        i37 = i28;
                                    }
                                }
                            }
                        } else if (i40 == 2) {
                            zzkj zzkjVar = (zzkj) unsafe2.getObject(obj4, j10);
                            if (!zzkjVar.zzc()) {
                                int size = zzkjVar.size();
                                zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j10, zzkjVar);
                            }
                            i33 = i50;
                            i21 = i37;
                            i32 = zzip.zze(zzlmVar2.zzE(i49), i33, bArr, i42, i11, zzkjVar, zzioVar);
                            bArr2 = bArr;
                            i31 = i12;
                            i34 = i39;
                            i35 = i49;
                            i36 = i36;
                            i37 = i21;
                            i30 = i11;
                        } else {
                            i17 = i36;
                            i28 = i37;
                            i14 = i39;
                            unsafe = unsafe2;
                            i29 = i42;
                            i18 = i49;
                        }
                        i13 = i12;
                        i15 = i29;
                        i16 = i50;
                        i37 = i28;
                    }
                }
                if (i16 != i13 || i13 == 0) {
                    if (this.zzh) {
                        zzioVar2 = zzioVar;
                        if (zzioVar2.zzd != zzjo.zza()) {
                            i19 = i14;
                            if (zzioVar2.zzd.zzc(this.zzg, i19) == null) {
                                i32 = zzip.zzi(i16, bArr, i15, i11, zzd(obj), zzioVar);
                                obj3 = obj;
                                i30 = i11;
                                i33 = i16;
                                zzlmVar2 = this;
                                zzioVar3 = zzioVar2;
                                i34 = i19;
                                obj4 = obj3;
                                i35 = i18;
                                i36 = i17;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i31 = i13;
                            } else {
                                zzjz zzjzVar = (zzjz) obj;
                                throw null;
                            }
                        } else {
                            obj3 = obj;
                            i19 = i14;
                        }
                    } else {
                        obj3 = obj;
                        i19 = i14;
                        zzioVar2 = zzioVar;
                    }
                    i32 = zzip.zzi(i16, bArr, i15, i11, zzd(obj), zzioVar);
                    i30 = i11;
                    i33 = i16;
                    zzlmVar2 = this;
                    zzioVar3 = zzioVar2;
                    i34 = i19;
                    obj4 = obj3;
                    i35 = i18;
                    i36 = i17;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i31 = i13;
                } else {
                    zzlmVar = this;
                    obj2 = obj;
                    i32 = i15;
                    i33 = i16;
                    i36 = i17;
                }
            } else {
                unsafe = unsafe2;
                i13 = i31;
                obj2 = obj4;
                zzlmVar = zzlmVar2;
            }
        }
        if (i37 != 1048575) {
            unsafe.putInt(obj2, i37, i36);
        }
        for (int i51 = zzlmVar.zzk; i51 < zzlmVar.zzl; i51++) {
            int i52 = zzlmVar.zzj[i51];
            int i53 = zzlmVar.zzc[i52];
            Object zzf = zzmv.zzf(obj2, zzlmVar.zzB(i52) & 1048575);
            if (zzf != null && zzlmVar.zzD(i52) != null) {
                zzld zzldVar = (zzld) zzf;
                zzlc zzlcVar = (zzlc) zzlmVar.zzF(i52);
                throw null;
            }
        }
        if (i13 == 0) {
            if (i32 != i11) {
                throw zzkm.zze();
            }
        } else if (i32 > i11 || i33 != i13) {
            throw zzkm.zze();
        }
        return i32;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzf(Object obj) {
        int i10;
        int i11 = this.zzk;
        while (true) {
            i10 = this.zzl;
            if (i11 >= i10) {
                break;
            }
            long zzB = zzB(this.zzj[i11]) & 1048575;
            Object zzf = zzmv.zzf(obj, zzB);
            if (zzf != null) {
                ((zzld) zzf).zzc();
                zzmv.zzs(obj, zzB, zzf);
            }
            i11++;
        }
        int length = this.zzj.length;
        while (i10 < length) {
            this.zzm.zza(obj, this.zzj[i10]);
            i10++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzg(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzB = zzB(i10);
            long j10 = 1048575 & zzB;
            int i11 = this.zzc[i10];
            switch (zzA(zzB)) {
                case 0:
                    if (zzO(obj2, i10)) {
                        zzmv.zzo(obj, j10, zzmv.zza(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj2, i10)) {
                        zzmv.zzp(obj, j10, zzmv.zzb(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj2, i10)) {
                        zzmv.zzm(obj, j10, zzmv.zzw(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj2, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i10);
                    break;
                case 10:
                    if (zzO(obj2, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj2, i10)) {
                        zzmv.zzq(obj, j10, zzmv.zzc(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj2, i10)) {
                        zzmv.zzr(obj, j10, zzmv.zzd(obj2, j10));
                        zzJ(obj, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i10);
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
                    this.zzm.zzb(obj, obj2, j10);
                    break;
                case 50:
                    zzlw.zzaa(this.zzq, obj, obj2, j10);
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
                    if (zzR(obj2, i11, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i11, i10)) {
                        zzmv.zzs(obj, j10, zzmv.zzf(obj2, j10));
                        zzK(obj, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i10);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzio zzioVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i10, i11, zzioVar);
        } else {
            zzc(obj, bArr, i10, i11, 0, zzioVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzi(Object obj, zznd zzndVar) throws IOException {
        if (!this.zzi) {
            zzL(obj, zzndVar);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int zzB = zzB(i10);
                int i11 = this.zzc[i10];
                switch (zzA(zzB)) {
                    case 0:
                        if (zzO(obj, i10)) {
                            zzndVar.zzf(i11, zzmv.zza(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzO(obj, i10)) {
                            zzndVar.zzo(i11, zzmv.zzb(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzO(obj, i10)) {
                            zzndVar.zzt(i11, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzO(obj, i10)) {
                            zzndVar.zzJ(i11, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzO(obj, i10)) {
                            zzndVar.zzr(i11, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzO(obj, i10)) {
                            zzndVar.zzm(i11, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzO(obj, i10)) {
                            zzndVar.zzk(i11, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzO(obj, i10)) {
                            zzndVar.zzb(i11, zzmv.zzw(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzO(obj, i10)) {
                            zzT(i11, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzO(obj, i10)) {
                            zzndVar.zzv(i11, zzmv.zzf(obj, zzB & 1048575), zzE(i10));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzO(obj, i10)) {
                            zzndVar.zzd(i11, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzO(obj, i10)) {
                            zzndVar.zzH(i11, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzO(obj, i10)) {
                            zzndVar.zzi(i11, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzO(obj, i10)) {
                            zzndVar.zzw(i11, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzO(obj, i10)) {
                            zzndVar.zzy(i11, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzO(obj, i10)) {
                            zzndVar.zzA(i11, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzO(obj, i10)) {
                            zzndVar.zzC(i11, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzO(obj, i10)) {
                            zzndVar.zzq(i11, zzmv.zzf(obj, zzB & 1048575), zzE(i10));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzlw.zzJ(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 19:
                        zzlw.zzN(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 20:
                        zzlw.zzQ(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 21:
                        zzlw.zzY(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 22:
                        zzlw.zzP(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 23:
                        zzlw.zzM(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 24:
                        zzlw.zzL(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 25:
                        zzlw.zzH(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 26:
                        zzlw.zzW(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    case 27:
                        zzlw.zzR(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i10));
                        break;
                    case 28:
                        zzlw.zzI(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    case 29:
                        zzlw.zzX(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 30:
                        zzlw.zzK(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 31:
                        zzlw.zzS(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 32:
                        zzlw.zzT(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 33:
                        zzlw.zzU(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 34:
                        zzlw.zzV(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 35:
                        zzlw.zzJ(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 36:
                        zzlw.zzN(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 37:
                        zzlw.zzQ(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 38:
                        zzlw.zzY(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 39:
                        zzlw.zzP(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 40:
                        zzlw.zzM(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 41:
                        zzlw.zzL(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 42:
                        zzlw.zzH(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 43:
                        zzlw.zzX(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 44:
                        zzlw.zzK(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 45:
                        zzlw.zzS(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 46:
                        zzlw.zzT(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 47:
                        zzlw.zzU(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 48:
                        zzlw.zzV(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 49:
                        zzlw.zzO(i11, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i10));
                        break;
                    case 50:
                        zzM(zzndVar, i11, zzmv.zzf(obj, zzB & 1048575), i10);
                        break;
                    case 51:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzf(i11, zzn(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzo(i11, zzo(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzt(i11, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzJ(i11, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzr(i11, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzm(i11, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzk(i11, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzb(i11, zzS(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzR(obj, i11, i10)) {
                            zzT(i11, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzv(i11, zzmv.zzf(obj, zzB & 1048575), zzE(i10));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzd(i11, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzH(i11, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzi(i11, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzw(i11, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzy(i11, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzA(i11, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzC(i11, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzR(obj, i11, i10)) {
                            zzndVar.zzq(i11, zzmv.zzf(obj, zzB & 1048575), zzE(i10));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzml zzmlVar = this.zzn;
            zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
        } else {
            this.zzo.zza(obj);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzZ;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzB = zzB(i10);
            long j10 = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzN(obj, obj2, i10) && Double.doubleToLongBits(zzmv.zza(obj, j10)) == Double.doubleToLongBits(zzmv.zza(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzN(obj, obj2, i10) && Float.floatToIntBits(zzmv.zzb(obj, j10)) == Float.floatToIntBits(zzmv.zzb(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzN(obj, obj2, i10) && zzmv.zzd(obj, j10) == zzmv.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzN(obj, obj2, i10) && zzmv.zzd(obj, j10) == zzmv.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzN(obj, obj2, i10) && zzmv.zzc(obj, j10) == zzmv.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzN(obj, obj2, i10) && zzmv.zzd(obj, j10) == zzmv.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzN(obj, obj2, i10) && zzmv.zzc(obj, j10) == zzmv.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzN(obj, obj2, i10) && zzmv.zzw(obj, j10) == zzmv.zzw(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzN(obj, obj2, i10) && zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzN(obj, obj2, i10) && zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzN(obj, obj2, i10) && zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzN(obj, obj2, i10) && zzmv.zzc(obj, j10) == zzmv.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzN(obj, obj2, i10) && zzmv.zzc(obj, j10) == zzmv.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzN(obj, obj2, i10) && zzmv.zzc(obj, j10) == zzmv.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzN(obj, obj2, i10) && zzmv.zzd(obj, j10) == zzmv.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzN(obj, obj2, i10) && zzmv.zzc(obj, j10) == zzmv.zzc(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzN(obj, obj2, i10) && zzmv.zzd(obj, j10) == zzmv.zzd(obj2, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzN(obj, obj2, i10) && zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
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
                    zzZ = zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10));
                    break;
                case 50:
                    zzZ = zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10));
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
                    long zzy = zzy(i10) & 1048575;
                    if (zzmv.zzc(obj, zzy) == zzmv.zzc(obj2, zzy) && zzlw.zzZ(zzmv.zzf(obj, j10), zzmv.zzf(obj2, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzZ) {
                return false;
            }
        }
        if (this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            if (this.zzh) {
                this.zzo.zza(obj);
                this.zzo.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzk(Object obj) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzk) {
            int i15 = this.zzj[i14];
            int i16 = this.zzc[i15];
            int zzB = zzB(i15);
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
            if ((268435456 & zzB) != 0 && !zzP(obj, i15, i10, i11, i19)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzR(obj, i16, i15) && !zzQ(obj, zzB, zzE(i15))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzld) zzmv.zzf(obj, zzB & 1048575)).isEmpty()) {
                            zzlc zzlcVar = (zzlc) zzF(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) zzmv.zzf(obj, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlu zzE = zzE(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzE.zzk(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzP(obj, i15, i10, i11, i19) && !zzQ(obj, zzB, zzE(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return true;
    }
}
