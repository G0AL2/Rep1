package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes2.dex */
public final class zzft<T> implements zzgb<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgz.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfq zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzfe zzl;
    private final zzgp<?, ?> zzm;
    private final zzeh<?> zzn;
    private final zzfv zzo;
    private final zzfl zzp;

    /* JADX WARN: Multi-variable type inference failed */
    private zzft(int[] iArr, int[] iArr2, Object[] objArr, int i10, int i11, zzfq zzfqVar, boolean z10, boolean z11, int[] iArr3, int i12, int i13, zzfv zzfvVar, zzfe zzfeVar, zzgp<?, ?> zzgpVar, zzeh<?> zzehVar, zzfl zzflVar) {
        this.zzc = iArr;
        this.zzd = iArr2;
        this.zze = objArr;
        this.zzf = i10;
        this.zzh = zzfqVar;
        this.zzi = z11;
        this.zzj = iArr3;
        this.zzk = i12;
        this.zzo = i13;
        this.zzl = zzfvVar;
        this.zzm = zzfeVar;
        this.zzn = zzgpVar;
        this.zzg = i11;
        this.zzp = zzehVar;
    }

    private static Field zzA(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb2.append("Field ");
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(name);
            sb2.append(" not found. Known fields are ");
            sb2.append(arrays);
            throw new RuntimeException(sb2.toString());
        }
    }

    private final void zzB(T t10, T t11, int i10) {
        long zzv = zzv(i10) & 1048575;
        if (zzG(t11, i10)) {
            Object zzf = zzgz.zzf(t10, zzv);
            Object zzf2 = zzgz.zzf(t11, zzv);
            if (zzf != null && zzf2 != null) {
                zzgz.zzp(t10, zzv, zzev.zzg(zzf, zzf2));
                zzD(t10, i10);
            } else if (zzf2 != null) {
                zzgz.zzp(t10, zzv, zzf2);
                zzD(t10, i10);
            }
        }
    }

    private final void zzC(T t10, T t11, int i10) {
        int zzv = zzv(i10);
        int i11 = this.zzc[i10];
        long j10 = zzv & 1048575;
        if (zzJ(t11, i11, i10)) {
            Object zzf = zzJ(t10, i11, i10) ? zzgz.zzf(t10, j10) : null;
            Object zzf2 = zzgz.zzf(t11, j10);
            if (zzf != null && zzf2 != null) {
                zzgz.zzp(t10, j10, zzev.zzg(zzf, zzf2));
                zzE(t10, i11, i10);
            } else if (zzf2 != null) {
                zzgz.zzp(t10, j10, zzf2);
                zzE(t10, i11, i10);
            }
        }
    }

    private final void zzD(T t10, int i10) {
        int zzs = zzs(i10);
        long j10 = 1048575 & zzs;
        if (j10 == 1048575) {
            return;
        }
        zzgz.zzn(t10, j10, (1 << (zzs >>> 20)) | zzgz.zzc(t10, j10));
    }

    private final void zzE(T t10, int i10, int i11) {
        zzgz.zzn(t10, zzs(i11) & 1048575, i10);
    }

    private final boolean zzF(T t10, T t11, int i10) {
        return zzG(t10, i10) == zzG(t11, i10);
    }

    private final boolean zzG(T t10, int i10) {
        int zzs = zzs(i10);
        long j10 = zzs & 1048575;
        if (j10 != 1048575) {
            return (zzgz.zzc(t10, j10) & (1 << (zzs >>> 20))) != 0;
        }
        int zzv = zzv(i10);
        long j11 = zzv & 1048575;
        switch (zzu(zzv)) {
            case 0:
                return zzgz.zza(t10, j11) != 0.0d;
            case 1:
                return zzgz.zzb(t10, j11) != 0.0f;
            case 2:
                return zzgz.zzd(t10, j11) != 0;
            case 3:
                return zzgz.zzd(t10, j11) != 0;
            case 4:
                return zzgz.zzc(t10, j11) != 0;
            case 5:
                return zzgz.zzd(t10, j11) != 0;
            case 6:
                return zzgz.zzc(t10, j11) != 0;
            case 7:
                return zzgz.zzt(t10, j11);
            case 8:
                Object zzf = zzgz.zzf(t10, j11);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzeb) {
                    return !zzeb.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzgz.zzf(t10, j11) != null;
            case 10:
                return !zzeb.zzb.equals(zzgz.zzf(t10, j11));
            case 11:
                return zzgz.zzc(t10, j11) != 0;
            case 12:
                return zzgz.zzc(t10, j11) != 0;
            case 13:
                return zzgz.zzc(t10, j11) != 0;
            case 14:
                return zzgz.zzd(t10, j11) != 0;
            case 15:
                return zzgz.zzc(t10, j11) != 0;
            case 16:
                return zzgz.zzd(t10, j11) != 0;
            case 17:
                return zzgz.zzf(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzH(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return zzG(t10, i10);
        }
        return (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zzI(Object obj, int i10, zzgb zzgbVar) {
        return zzgbVar.zzi(zzgz.zzf(obj, i10 & 1048575));
    }

    private final boolean zzJ(T t10, int i10, int i11) {
        return zzgz.zzc(t10, (long) (zzs(i11) & 1048575)) == i10;
    }

    static zzgq zzc(Object obj) {
        zzeq zzeqVar = (zzeq) obj;
        zzgq zzgqVar = zzeqVar.zzc;
        if (zzgqVar == zzgq.zza()) {
            zzgq zzc = zzgq.zzc();
            zzeqVar.zzc = zzc;
            return zzc;
        }
        return zzgqVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzft<T> zzj(Class<T> cls, zzfn zzfnVar, zzfv zzfvVar, zzfe zzfeVar, zzgp<?, ?> zzgpVar, zzeh<?> zzehVar, zzfl zzflVar) {
        if (zzfnVar instanceof zzga) {
            return zzk((zzga) zzfnVar, zzfvVar, zzfeVar, zzgpVar, zzehVar, zzflVar);
        }
        zzgm zzgmVar = (zzgm) zzfnVar;
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
    static <T> com.google.android.gms.internal.auth.zzft<T> zzk(com.google.android.gms.internal.auth.zzga r34, com.google.android.gms.internal.auth.zzfv r35, com.google.android.gms.internal.auth.zzfe r36, com.google.android.gms.internal.auth.zzgp<?, ?> r37, com.google.android.gms.internal.auth.zzeh<?> r38, com.google.android.gms.internal.auth.zzfl r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzk(com.google.android.gms.internal.auth.zzga, com.google.android.gms.internal.auth.zzfv, com.google.android.gms.internal.auth.zzfe, com.google.android.gms.internal.auth.zzgp, com.google.android.gms.internal.auth.zzeh, com.google.android.gms.internal.auth.zzfl):com.google.android.gms.internal.auth.zzft");
    }

    private static <T> int zzl(T t10, long j10) {
        return ((Integer) zzgz.zzf(t10, j10)).intValue();
    }

    private final <K, V> int zzm(T t10, byte[] bArr, int i10, int i11, int i12, long j10, zzdp zzdpVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzz = zzz(i12);
        Object object = unsafe.getObject(t10, j10);
        if (!((zzfk) object).zze()) {
            zzfk<K, V> zzb2 = zzfk.zza().zzb();
            zzfl.zza(zzb2, object);
            unsafe.putObject(t10, j10, zzb2);
        }
        zzfj zzfjVar = (zzfj) zzz;
        throw null;
    }

    private final int zzn(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, zzdp zzdpVar) throws IOException {
        Unsafe unsafe = zzb;
        long j11 = this.zzc[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Double.valueOf(Double.longBitsToDouble(zzdq.zzn(bArr, i10))));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 8;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Float.valueOf(Float.intBitsToFloat(zzdq.zzb(bArr, i10))));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 4;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    int zzm = zzdq.zzm(bArr, i10, zzdpVar);
                    unsafe.putObject(t10, j10, Long.valueOf(zzdpVar.zzb));
                    unsafe.putInt(t10, j11, i13);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    int zzj = zzdq.zzj(bArr, i10, zzdpVar);
                    unsafe.putObject(t10, j10, Integer.valueOf(zzdpVar.zza));
                    unsafe.putInt(t10, j11, i13);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(t10, j10, Long.valueOf(zzdq.zzn(bArr, i10)));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 8;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(t10, j10, Integer.valueOf(zzdq.zzb(bArr, i10)));
                    unsafe.putInt(t10, j11, i13);
                    return i10 + 4;
                }
                break;
            case 58:
                if (i14 == 0) {
                    int zzm2 = zzdq.zzm(bArr, i10, zzdpVar);
                    unsafe.putObject(t10, j10, Boolean.valueOf(zzdpVar.zzb != 0));
                    unsafe.putInt(t10, j11, i13);
                    return zzm2;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int zzj2 = zzdq.zzj(bArr, i10, zzdpVar);
                    int i18 = zzdpVar.zza;
                    if (i18 == 0) {
                        unsafe.putObject(t10, j10, "");
                    } else if ((i15 & 536870912) != 0 && !zzhd.zzd(bArr, zzj2, zzj2 + i18)) {
                        throw zzew.zzb();
                    } else {
                        unsafe.putObject(t10, j10, new String(bArr, zzj2, i18, zzev.zza));
                        zzj2 += i18;
                    }
                    unsafe.putInt(t10, j11, i13);
                    return zzj2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    int zzd = zzdq.zzd(zzy(i17), bArr, i10, i11, zzdpVar);
                    Object object = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                    if (object == null) {
                        unsafe.putObject(t10, j10, zzdpVar.zzc);
                    } else {
                        unsafe.putObject(t10, j10, zzev.zzg(object, zzdpVar.zzc));
                    }
                    unsafe.putInt(t10, j11, i13);
                    return zzd;
                }
                break;
            case 61:
                if (i14 == 2) {
                    int zza2 = zzdq.zza(bArr, i10, zzdpVar);
                    unsafe.putObject(t10, j10, zzdpVar.zzc);
                    unsafe.putInt(t10, j11, i13);
                    return zza2;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int zzj3 = zzdq.zzj(bArr, i10, zzdpVar);
                    int i19 = zzdpVar.zza;
                    zzet zzx = zzx(i17);
                    if (zzx != null && !zzx.zza()) {
                        zzc(t10).zzf(i12, Long.valueOf(i19));
                    } else {
                        unsafe.putObject(t10, j10, Integer.valueOf(i19));
                        unsafe.putInt(t10, j11, i13);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i14 == 0) {
                    int zzj4 = zzdq.zzj(bArr, i10, zzdpVar);
                    unsafe.putObject(t10, j10, Integer.valueOf(zzee.zzb(zzdpVar.zza)));
                    unsafe.putInt(t10, j11, i13);
                    return zzj4;
                }
                break;
            case 67:
                if (i14 == 0) {
                    int zzm3 = zzdq.zzm(bArr, i10, zzdpVar);
                    unsafe.putObject(t10, j10, Long.valueOf(zzee.zzc(zzdpVar.zzb)));
                    unsafe.putInt(t10, j11, i13);
                    return zzm3;
                }
                break;
            case 68:
                if (i14 == 3) {
                    int zzc = zzdq.zzc(zzy(i17), bArr, i10, i11, (i12 & (-8)) | 4, zzdpVar);
                    Object object2 = unsafe.getInt(t10, j11) == i13 ? unsafe.getObject(t10, j10) : null;
                    if (object2 == null) {
                        unsafe.putObject(t10, j10, zzdpVar.zzc);
                    } else {
                        unsafe.putObject(t10, j10, zzev.zzg(object2, zzdpVar.zzc));
                    }
                    unsafe.putInt(t10, j11, i13);
                    return zzc;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x02a8, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x02aa, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r2 = r19;
        r1 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02be, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02f1, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0314, code lost:
        if (r0 != r15) goto L152;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzo(T r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.auth.zzdp r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzo(java.lang.Object, byte[], int, int, com.google.android.gms.internal.auth.zzdp):int");
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
    private final int zzp(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.auth.zzdp r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzp(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.auth.zzdp):int");
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzt(i10, 0);
    }

    private final int zzr(int i10, int i11) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzt(i10, i11);
    }

    private final int zzs(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzt(int i10, int i11) {
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

    private static int zzu(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzv(int i10) {
        return this.zzc[i10 + 1];
    }

    private static <T> long zzw(T t10, long j10) {
        return ((Long) zzgz.zzf(t10, j10)).longValue();
    }

    private final zzet zzx(int i10) {
        int i11 = i10 / 3;
        return (zzet) this.zzd[i11 + i11 + 1];
    }

    private final zzgb zzy(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgb zzgbVar = (zzgb) this.zzd[i12];
        if (zzgbVar != null) {
            return zzgbVar;
        }
        zzgb<T> zzb2 = zzfy.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzb2;
        return zzb2;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final int zza(T t10) {
        int i10;
        int zzc;
        int length = this.zzc.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int zzv = zzv(i12);
            int i13 = this.zzc[i12];
            long j10 = 1048575 & zzv;
            int i14 = 37;
            switch (zzu(zzv)) {
                case 0:
                    i10 = i11 * 53;
                    zzc = zzev.zzc(Double.doubleToLongBits(zzgz.zza(t10, j10)));
                    i11 = i10 + zzc;
                    break;
                case 1:
                    i10 = i11 * 53;
                    zzc = Float.floatToIntBits(zzgz.zzb(t10, j10));
                    i11 = i10 + zzc;
                    break;
                case 2:
                    i10 = i11 * 53;
                    zzc = zzev.zzc(zzgz.zzd(t10, j10));
                    i11 = i10 + zzc;
                    break;
                case 3:
                    i10 = i11 * 53;
                    zzc = zzev.zzc(zzgz.zzd(t10, j10));
                    i11 = i10 + zzc;
                    break;
                case 4:
                    i10 = i11 * 53;
                    zzc = zzgz.zzc(t10, j10);
                    i11 = i10 + zzc;
                    break;
                case 5:
                    i10 = i11 * 53;
                    zzc = zzev.zzc(zzgz.zzd(t10, j10));
                    i11 = i10 + zzc;
                    break;
                case 6:
                    i10 = i11 * 53;
                    zzc = zzgz.zzc(t10, j10);
                    i11 = i10 + zzc;
                    break;
                case 7:
                    i10 = i11 * 53;
                    zzc = zzev.zza(zzgz.zzt(t10, j10));
                    i11 = i10 + zzc;
                    break;
                case 8:
                    i10 = i11 * 53;
                    zzc = ((String) zzgz.zzf(t10, j10)).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 9:
                    Object zzf = zzgz.zzf(t10, j10);
                    if (zzf != null) {
                        i14 = zzf.hashCode();
                    }
                    i11 = (i11 * 53) + i14;
                    break;
                case 10:
                    i10 = i11 * 53;
                    zzc = zzgz.zzf(t10, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 11:
                    i10 = i11 * 53;
                    zzc = zzgz.zzc(t10, j10);
                    i11 = i10 + zzc;
                    break;
                case 12:
                    i10 = i11 * 53;
                    zzc = zzgz.zzc(t10, j10);
                    i11 = i10 + zzc;
                    break;
                case 13:
                    i10 = i11 * 53;
                    zzc = zzgz.zzc(t10, j10);
                    i11 = i10 + zzc;
                    break;
                case 14:
                    i10 = i11 * 53;
                    zzc = zzev.zzc(zzgz.zzd(t10, j10));
                    i11 = i10 + zzc;
                    break;
                case 15:
                    i10 = i11 * 53;
                    zzc = zzgz.zzc(t10, j10);
                    i11 = i10 + zzc;
                    break;
                case 16:
                    i10 = i11 * 53;
                    zzc = zzev.zzc(zzgz.zzd(t10, j10));
                    i11 = i10 + zzc;
                    break;
                case 17:
                    Object zzf2 = zzgz.zzf(t10, j10);
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
                    zzc = zzgz.zzf(t10, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 50:
                    i10 = i11 * 53;
                    zzc = zzgz.zzf(t10, j10).hashCode();
                    i11 = i10 + zzc;
                    break;
                case 51:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzev.zzc(Double.doubleToLongBits(((Double) zzgz.zzf(t10, j10)).doubleValue()));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = Float.floatToIntBits(((Float) zzgz.zzf(t10, j10)).floatValue());
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzev.zzc(zzw(t10, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzev.zzc(zzw(t10, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzl(t10, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzev.zzc(zzw(t10, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzl(t10, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzev.zza(((Boolean) zzgz.zzf(t10, j10)).booleanValue());
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = ((String) zzgz.zzf(t10, j10)).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzgz.zzf(t10, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzgz.zzf(t10, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzl(t10, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzl(t10, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzl(t10, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzev.zzc(zzw(t10, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzl(t10, j10);
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzev.zzc(zzw(t10, j10));
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzJ(t10, i13, i12)) {
                        i10 = i11 * 53;
                        zzc = zzgz.zzf(t10, j10).hashCode();
                        i11 = i10 + zzc;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return (i11 * 53) + this.zzm.zza(t10).hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0322, code lost:
        if (r0 != r2) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0324, code lost:
        r15 = r28;
        r14 = r29;
        r12 = r30;
        r13 = r32;
        r11 = r33;
        r9 = r34;
        r1 = r18;
        r2 = r19;
        r3 = r20;
        r5 = r22;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x033c, code lost:
        r7 = r33;
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0366, code lost:
        if (r0 != r15) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0388, code lost:
        if (r0 != r15) goto L178;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(T r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.auth.zzdp r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1086
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzft.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdp):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final T zzd() {
        return (T) ((zzeq) this.zzg).zzj(4, null, null);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zze(T t10) {
        int i10;
        int i11 = this.zzj;
        while (true) {
            i10 = this.zzk;
            if (i11 >= i10) {
                break;
            }
            long zzv = zzv(this.zzi[i11]) & 1048575;
            Object zzf = zzgz.zzf(t10, zzv);
            if (zzf != null) {
                ((zzfk) zzf).zzc();
                zzgz.zzp(t10, zzv, zzf);
            }
            i11++;
        }
        int length = this.zzi.length;
        while (i10 < length) {
            this.zzl.zza(t10, this.zzi[i10]);
            i10++;
        }
        this.zzm.zze(t10);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zzf(T t10, T t11) {
        Objects.requireNonNull(t11);
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int zzv = zzv(i10);
            long j10 = 1048575 & zzv;
            int i11 = this.zzc[i10];
            switch (zzu(zzv)) {
                case 0:
                    if (zzG(t11, i10)) {
                        zzgz.zzl(t10, j10, zzgz.zza(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzG(t11, i10)) {
                        zzgz.zzm(t10, j10, zzgz.zzb(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzG(t11, i10)) {
                        zzgz.zzo(t10, j10, zzgz.zzd(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzG(t11, i10)) {
                        zzgz.zzo(t10, j10, zzgz.zzd(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzG(t11, i10)) {
                        zzgz.zzn(t10, j10, zzgz.zzc(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzG(t11, i10)) {
                        zzgz.zzo(t10, j10, zzgz.zzd(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzG(t11, i10)) {
                        zzgz.zzn(t10, j10, zzgz.zzc(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzG(t11, i10)) {
                        zzgz.zzk(t10, j10, zzgz.zzt(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzG(t11, i10)) {
                        zzgz.zzp(t10, j10, zzgz.zzf(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzB(t10, t11, i10);
                    break;
                case 10:
                    if (zzG(t11, i10)) {
                        zzgz.zzp(t10, j10, zzgz.zzf(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzG(t11, i10)) {
                        zzgz.zzn(t10, j10, zzgz.zzc(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzG(t11, i10)) {
                        zzgz.zzn(t10, j10, zzgz.zzc(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzG(t11, i10)) {
                        zzgz.zzn(t10, j10, zzgz.zzc(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzG(t11, i10)) {
                        zzgz.zzo(t10, j10, zzgz.zzd(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzG(t11, i10)) {
                        zzgz.zzn(t10, j10, zzgz.zzc(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzG(t11, i10)) {
                        zzgz.zzo(t10, j10, zzgz.zzd(t11, j10));
                        zzD(t10, i10);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzB(t10, t11, i10);
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
                    this.zzl.zzb(t10, t11, j10);
                    break;
                case 50:
                    zzgd.zzi(this.zzp, t10, t11, j10);
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
                    if (zzJ(t11, i11, i10)) {
                        zzgz.zzp(t10, j10, zzgz.zzf(t11, j10));
                        zzE(t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzC(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzJ(t11, i11, i10)) {
                        zzgz.zzp(t10, j10, zzgz.zzf(t11, j10));
                        zzE(t10, i11, i10);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzC(t10, t11, i10);
                    break;
            }
        }
        zzgd.zzf(this.zzm, t10, t11);
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final void zzg(T t10, byte[] bArr, int i10, int i11, zzdp zzdpVar) throws IOException {
        if (this.zzh) {
            zzo(t10, bArr, i10, i11, zzdpVar);
        } else {
            zzb(t10, bArr, i10, i11, 0, zzdpVar);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzgb
    public final boolean zzh(T t10, T t11) {
        boolean zzh;
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int zzv = zzv(i10);
            long j10 = zzv & 1048575;
            switch (zzu(zzv)) {
                case 0:
                    if (zzF(t10, t11, i10) && Double.doubleToLongBits(zzgz.zza(t10, j10)) == Double.doubleToLongBits(zzgz.zza(t11, j10))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzF(t10, t11, i10) && Float.floatToIntBits(zzgz.zzb(t10, j10)) == Float.floatToIntBits(zzgz.zzb(t11, j10))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzF(t10, t11, i10) && zzgz.zzd(t10, j10) == zzgz.zzd(t11, j10)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzF(t10, t11, i10) && zzgz.zzd(t10, j10) == zzgz.zzd(t11, j10)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzF(t10, t11, i10) && zzgz.zzc(t10, j10) == zzgz.zzc(t11, j10)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzF(t10, t11, i10) && zzgz.zzd(t10, j10) == zzgz.zzd(t11, j10)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzF(t10, t11, i10) && zzgz.zzc(t10, j10) == zzgz.zzc(t11, j10)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzF(t10, t11, i10) && zzgz.zzt(t10, j10) == zzgz.zzt(t11, j10)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzF(t10, t11, i10) && zzgd.zzh(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzF(t10, t11, i10) && zzgd.zzh(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzF(t10, t11, i10) && zzgd.zzh(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzF(t10, t11, i10) && zzgz.zzc(t10, j10) == zzgz.zzc(t11, j10)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzF(t10, t11, i10) && zzgz.zzc(t10, j10) == zzgz.zzc(t11, j10)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzF(t10, t11, i10) && zzgz.zzc(t10, j10) == zzgz.zzc(t11, j10)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzF(t10, t11, i10) && zzgz.zzd(t10, j10) == zzgz.zzd(t11, j10)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzF(t10, t11, i10) && zzgz.zzc(t10, j10) == zzgz.zzc(t11, j10)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzF(t10, t11, i10) && zzgz.zzd(t10, j10) == zzgz.zzd(t11, j10)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzF(t10, t11, i10) && zzgd.zzh(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10))) {
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
                    zzh = zzgd.zzh(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10));
                    break;
                case 50:
                    zzh = zzgd.zzh(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10));
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
                    long zzs = zzs(i10) & 1048575;
                    if (zzgz.zzc(t10, zzs) == zzgz.zzc(t11, zzs) && zzgd.zzh(zzgz.zzf(t10, j10), zzgz.zzf(t11, j10))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzh) {
                return false;
            }
        }
        return this.zzm.zza(t10).equals(this.zzm.zza(t11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzgb
    public final boolean zzi(T t10) {
        int i10;
        int i11;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.zzj) {
            int i15 = this.zzi[i14];
            int i16 = this.zzc[i15];
            int zzv = zzv(i15);
            int i17 = this.zzc[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = zzb.getInt(t10, i18);
                }
                i11 = i13;
                i10 = i18;
            } else {
                i10 = i12;
                i11 = i13;
            }
            if ((268435456 & zzv) != 0 && !zzH(t10, i15, i10, i11, i19)) {
                return false;
            }
            int zzu = zzu(zzv);
            if (zzu != 9 && zzu != 17) {
                if (zzu != 27) {
                    if (zzu == 60 || zzu == 68) {
                        if (zzJ(t10, i16, i15) && !zzI(t10, zzv, zzy(i15))) {
                            return false;
                        }
                    } else if (zzu != 49) {
                        if (zzu == 50 && !((zzfk) zzgz.zzf(t10, zzv & 1048575)).isEmpty()) {
                            zzfj zzfjVar = (zzfj) zzz(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgz.zzf(t10, zzv & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgb zzy = zzy(i15);
                    for (int i20 = 0; i20 < list.size(); i20++) {
                        if (!zzy.zzi(list.get(i20))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzH(t10, i15, i10, i11, i19) && !zzI(t10, zzv, zzy(i15))) {
                return false;
            }
            i14++;
            i12 = i10;
            i13 = i11;
        }
        return true;
    }
}
