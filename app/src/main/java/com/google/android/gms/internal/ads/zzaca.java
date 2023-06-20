package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaca {
    public static final zzaby zza = new zzaby() { // from class: com.google.android.gms.internal.ads.zzabx
    };

    /* JADX WARN: Removed duplicated region for block: B:34:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.google.android.gms.internal.ads.zzbl zza(byte[] r11, int r12, com.google.android.gms.internal.ads.zzaby r13, com.google.android.gms.internal.ads.zzabb r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaca.zza(byte[], int, com.google.android.gms.internal.ads.zzaby, com.google.android.gms.internal.ads.zzabb):com.google.android.gms.internal.ads.zzbl");
    }

    private static int zzb(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    private static int zzc(byte[] bArr, int i10, int i11) {
        int zzd = zzd(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return zzd;
        }
        while (true) {
            int length = bArr.length;
            if (zzd >= length - 1) {
                return length;
            }
            if ((zzd - i10) % 2 == 0 && bArr[zzd + 1] == 0) {
                return zzd;
            }
            zzd = zzd(bArr, zzd + 1);
        }
    }

    private static int zzd(byte[] bArr, int i10) {
        while (true) {
            int length = bArr.length;
            if (i10 >= length) {
                return length;
            }
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
    }

    private static int zze(zzdy zzdyVar, int i10) {
        byte[] zzH = zzdyVar.zzH();
        int zzc = zzdyVar.zzc();
        int i11 = zzc;
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= zzc + i10) {
                return i10;
            }
            if ((zzH[i11] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) == 255 && zzH[i12] == 0) {
                System.arraycopy(zzH, i11 + 2, zzH, i12, (i10 - (i11 - zzc)) - 2);
                i10--;
            }
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x0273, code lost:
        if (r9 == 67) goto L122;
     */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x0540: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]), block:B:240:0x053e */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzacb zzf(int r34, com.google.android.gms.internal.ads.zzdy r35, boolean r36, int r37, com.google.android.gms.internal.ads.zzaby r38) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaca.zzf(int, com.google.android.gms.internal.ads.zzdy, boolean, int, com.google.android.gms.internal.ads.zzaby):com.google.android.gms.internal.ads.zzacb");
    }

    private static String zzg(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    private static String zzh(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String zzi(int i10, int i11, int i12, int i13, int i14) {
        return i10 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
        if ((r10 & 128) != 0) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean zzj(com.google.android.gms.internal.ads.zzdy r19, int r20, int r21, boolean r22) {
        /*
            r1 = r19
            r0 = r20
            int r2 = r19.zzc()
        L8:
            int r3 = r19.zza()     // Catch: java.lang.Throwable -> Lae
            r4 = 1
            r5 = r21
            if (r3 < r5) goto Laa
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L22
            int r7 = r19.zze()     // Catch: java.lang.Throwable -> Lae
            long r8 = r19.zzs()     // Catch: java.lang.Throwable -> Lae
            int r10 = r19.zzo()     // Catch: java.lang.Throwable -> Lae
            goto L2c
        L22:
            int r7 = r19.zzm()     // Catch: java.lang.Throwable -> Lae
            int r8 = r19.zzm()     // Catch: java.lang.Throwable -> Lae
            long r8 = (long) r8
            r10 = 0
        L2c:
            r11 = 0
            if (r7 != 0) goto L3b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L3b
            if (r10 == 0) goto L37
            goto L3b
        L37:
            r1.zzF(r2)
            return r4
        L3b:
            r7 = 4
            if (r0 != r7) goto L6a
            if (r22 != 0) goto L6a
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L4c
            r1.zzF(r2)
            return r6
        L4c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r11 = r11 & r15
            r15 = 14
            long r11 = r11 << r15
            long r11 = r11 | r13
            r13 = 24
            long r8 = r8 >> r13
            r13 = 21
            long r8 = r8 << r13
            long r8 = r8 | r11
        L6a:
            if (r0 != r7) goto L7a
            r3 = r10 & 64
            if (r3 == 0) goto L71
            goto L72
        L71:
            r4 = 0
        L72:
            r3 = r10 & 1
            r18 = r4
            r4 = r3
            r3 = r18
            goto L8a
        L7a:
            if (r0 != r3) goto L88
            r3 = r10 & 32
            if (r3 == 0) goto L82
            r3 = 1
            goto L83
        L82:
            r3 = 0
        L83:
            r7 = r10 & 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L89
            goto L8a
        L88:
            r3 = 0
        L89:
            r4 = 0
        L8a:
            if (r4 == 0) goto L8e
            int r3 = r3 + 4
        L8e:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L97
            r1.zzF(r2)
            return r6
        L97:
            int r3 = r19.zza()     // Catch: java.lang.Throwable -> Lae
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto La4
            r1.zzF(r2)
            return r6
        La4:
            int r3 = (int) r8
            r1.zzG(r3)     // Catch: java.lang.Throwable -> Lae
            goto L8
        Laa:
            r1.zzF(r2)
            return r4
        Lae:
            r0 = move-exception
            r1.zzF(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaca.zzj(com.google.android.gms.internal.ads.zzdy, int, int, boolean):boolean");
    }

    private static byte[] zzk(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return zzeg.zzf;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }
}
