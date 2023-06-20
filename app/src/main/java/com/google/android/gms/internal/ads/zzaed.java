package com.google.android.gms.internal.ads;

import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzaed {
    private static final byte[] zza = zzeg.zzZ("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (r3 != 13) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzadu r11) {
        /*
            com.google.android.gms.internal.ads.zzdy r11 = r11.zza
            r0 = 8
            r11.zzF(r0)
            r1 = 0
            r2 = r1
            r3 = r2
        La:
            int r4 = r11.zza()
            if (r4 < r0) goto Lda
            int r4 = r11.zzc()
            int r5 = r11.zze()
            int r6 = r11.zze()
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r6 != r7) goto L75
            r11.zzF(r4)
            int r2 = r4 + r5
            r11.zzG(r0)
            zzd(r11)
        L2c:
            int r6 = r11.zzc()
            if (r6 >= r2) goto L73
            int r6 = r11.zzc()
            int r7 = r11.zze()
            int r8 = r11.zze()
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r8 != r9) goto L6e
            r11.zzF(r6)
            int r6 = r6 + r7
            r11.zzG(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L4f:
            int r7 = r11.zzc()
            if (r7 >= r6) goto L5f
            com.google.android.gms.internal.ads.zzbk r7 = com.google.android.gms.internal.ads.zzaek.zza(r11)
            if (r7 == 0) goto L4f
            r2.add(r7)
            goto L4f
        L5f:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L66
            goto L73
        L66:
            com.google.android.gms.internal.ads.zzbl r6 = new com.google.android.gms.internal.ads.zzbl
            r6.<init>(r2)
            r2 = r6
            goto Ld4
        L6e:
            int r6 = r6 + r7
            r11.zzF(r6)
            goto L2c
        L73:
            r2 = r1
            goto Ld4
        L75:
            r7 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r6 != r7) goto Ld4
            r11.zzF(r4)
            int r3 = r4 + r5
            r6 = 12
            r11.zzG(r6)
        L84:
            int r7 = r11.zzc()
            if (r7 >= r3) goto Ld3
            int r7 = r11.zzc()
            int r8 = r11.zze()
            int r9 = r11.zze()
            r10 = 1935766900(0x73617574, float:1.7862687E31)
            if (r9 != r10) goto Lce
            r3 = 14
            if (r8 >= r3) goto La0
            goto Ld3
        La0:
            r3 = 5
            r11.zzG(r3)
            int r3 = r11.zzk()
            r7 = 1123024896(0x42f00000, float:120.0)
            if (r3 == r6) goto Lb1
            r6 = 13
            if (r3 == r6) goto Lb5
            goto Ld3
        Lb1:
            if (r3 != r6) goto Lb5
            r7 = 1131413504(0x43700000, float:240.0)
        Lb5:
            r3 = 1
            r11.zzG(r3)
            int r6 = r11.zzk()
            com.google.android.gms.internal.ads.zzbl r8 = new com.google.android.gms.internal.ads.zzbl
            com.google.android.gms.internal.ads.zzbk[] r3 = new com.google.android.gms.internal.ads.zzbk[r3]
            com.google.android.gms.internal.ads.zzacu r9 = new com.google.android.gms.internal.ads.zzacu
            r9.<init>(r7, r6)
            r6 = 0
            r3[r6] = r9
            r8.<init>(r3)
            r3 = r8
            goto Ld4
        Lce:
            int r7 = r7 + r8
            r11.zzF(r7)
            goto L84
        Ld3:
            r3 = r1
        Ld4:
            int r4 = r4 + r5
            r11.zzF(r4)
            goto La
        Lda:
            android.util.Pair r11 = android.util.Pair.create(r2, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaed.zza(com.google.android.gms.internal.ads.zzadu):android.util.Pair");
    }

    public static zzbl zzb(zzadt zzadtVar) {
        zzaco zzacoVar;
        zzadu zzb = zzadtVar.zzb(1751411826);
        zzadu zzb2 = zzadtVar.zzb(1801812339);
        zzadu zzb3 = zzadtVar.zzb(1768715124);
        if (zzb == null || zzb2 == null || zzb3 == null || zzg(zzb.zza) != 1835299937) {
            return null;
        }
        zzdy zzdyVar = zzb2.zza;
        zzdyVar.zzF(12);
        int zze = zzdyVar.zze();
        String[] strArr = new String[zze];
        for (int i10 = 0; i10 < zze; i10++) {
            int zze2 = zzdyVar.zze();
            zzdyVar.zzG(4);
            strArr[i10] = zzdyVar.zzx(zze2 - 8, zzfoi.zzc);
        }
        zzdy zzdyVar2 = zzb3.zza;
        zzdyVar2.zzF(8);
        ArrayList arrayList = new ArrayList();
        while (zzdyVar2.zza() > 8) {
            int zzc = zzdyVar2.zzc();
            int zze3 = zzdyVar2.zze();
            int zze4 = zzdyVar2.zze() - 1;
            if (zze4 >= 0 && zze4 < zze) {
                String str = strArr[zze4];
                int i11 = zzc + zze3;
                int i12 = zzaek.zzb;
                while (true) {
                    int zzc2 = zzdyVar2.zzc();
                    if (zzc2 >= i11) {
                        zzacoVar = null;
                        break;
                    }
                    int zze5 = zzdyVar2.zze();
                    if (zzdyVar2.zze() == 1684108385) {
                        int zze6 = zzdyVar2.zze();
                        int zze7 = zzdyVar2.zze();
                        int i13 = zze5 - 16;
                        byte[] bArr = new byte[i13];
                        zzdyVar2.zzB(bArr, 0, i13);
                        zzacoVar = new zzaco(str, bArr, zze7, zze6);
                        break;
                    }
                    zzdyVar2.zzF(zzc2 + zze5);
                }
                if (zzacoVar != null) {
                    arrayList.add(zzacoVar);
                }
            } else {
                Log.w("AtomParsers", "Skipped metadata with unknown key index: " + zze4);
            }
            zzdyVar2.zzF(zzc + zze3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbl(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b7, code lost:
        if (r7 == 0) goto L639;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0669, code lost:
        if (r1 != 3) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x0762, code lost:
        if (r25 == null) goto L586;
     */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07e9  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x09d9  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0aa0 A[LOOP:13: B:487:0x0aa0->B:491:0x0aaa, LOOP_START, PHI: r23 
      PHI: (r23v8 int) = (r23v7 int), (r23v9 int) binds: [B:486:0x0a9e, B:491:0x0aaa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0ab3  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0afe  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0b13  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0b16  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0b8f  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0e04  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0a99 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List zzc(com.google.android.gms.internal.ads.zzadt r58, com.google.android.gms.internal.ads.zzzg r59, long r60, com.google.android.gms.internal.ads.zzv r62, boolean r63, boolean r64, com.google.android.gms.internal.ads.zzfok r65) throws com.google.android.gms.internal.ads.zzbp {
        /*
            Method dump skipped, instructions count: 3603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaed.zzc(com.google.android.gms.internal.ads.zzadt, com.google.android.gms.internal.ads.zzzg, long, com.google.android.gms.internal.ads.zzv, boolean, boolean, com.google.android.gms.internal.ads.zzfok):java.util.List");
    }

    public static void zzd(zzdy zzdyVar) {
        int zzc = zzdyVar.zzc();
        zzdyVar.zzG(4);
        if (zzdyVar.zze() != 1751411826) {
            zzc += 4;
        }
        zzdyVar.zzF(zzc);
    }

    private static int zze(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    private static int zzf(zzdy zzdyVar) {
        int zzk = zzdyVar.zzk();
        int i10 = zzk & 127;
        while ((zzk & 128) == 128) {
            zzk = zzdyVar.zzk();
            i10 = (i10 << 7) | (zzk & 127);
        }
        return i10;
    }

    private static int zzg(zzdy zzdyVar) {
        zzdyVar.zzF(16);
        return zzdyVar.zze();
    }

    private static Pair zzh(zzadt zzadtVar) {
        zzadu zzb = zzadtVar.zzb(1701606260);
        if (zzb == null) {
            return null;
        }
        zzdy zzdyVar = zzb.zza;
        zzdyVar.zzF(8);
        int zze = zzadv.zze(zzdyVar.zze());
        int zzn = zzdyVar.zzn();
        long[] jArr = new long[zzn];
        long[] jArr2 = new long[zzn];
        for (int i10 = 0; i10 < zzn; i10++) {
            jArr[i10] = zze == 1 ? zzdyVar.zzt() : zzdyVar.zzs();
            jArr2[i10] = zze == 1 ? zzdyVar.zzr() : zzdyVar.zze();
            if (zzdyVar.zzy() == 1) {
                zzdyVar.zzG(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzi(zzdy zzdyVar) {
        zzdyVar.zzF(8);
        int zze = zzadv.zze(zzdyVar.zze());
        zzdyVar.zzG(zze == 0 ? 8 : 16);
        long zzs = zzdyVar.zzs();
        zzdyVar.zzG(zze == 0 ? 4 : 8);
        int zzo = zzdyVar.zzo();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) (((zzo >> 10) & 31) + 96));
        sb2.append((char) (((zzo >> 5) & 31) + 96));
        sb2.append((char) ((zzo & 31) + 96));
        return Pair.create(Long.valueOf(zzs), sb2.toString());
    }

    private static Pair zzj(zzdy zzdyVar, int i10, int i11) throws zzbp {
        Integer num;
        zzaeu zzaeuVar;
        Pair create;
        int i12;
        int i13;
        byte[] bArr;
        int zzc = zzdyVar.zzc();
        while (zzc - i10 < i11) {
            zzdyVar.zzF(zzc);
            int zze = zzdyVar.zze();
            zzyv.zzb(zze > 0, "childAtomSize must be positive");
            if (zzdyVar.zze() == 1936289382) {
                int i14 = zzc + 8;
                int i15 = -1;
                int i16 = 0;
                String str = null;
                Integer num2 = null;
                while (i14 - zzc < zze) {
                    zzdyVar.zzF(i14);
                    int zze2 = zzdyVar.zze();
                    int zze3 = zzdyVar.zze();
                    if (zze3 == 1718775137) {
                        num2 = Integer.valueOf(zzdyVar.zze());
                    } else if (zze3 == 1935894637) {
                        zzdyVar.zzG(4);
                        str = zzdyVar.zzx(4, zzfoi.zzc);
                    } else if (zze3 == 1935894633) {
                        i15 = i14;
                        i16 = zze2;
                    }
                    i14 += zze2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzyv.zzb(num2 != null, "frma atom is mandatory");
                    zzyv.zzb(i15 != -1, "schi atom is mandatory");
                    int i17 = i15 + 8;
                    while (true) {
                        if (i17 - i15 >= i16) {
                            num = num2;
                            zzaeuVar = null;
                            break;
                        }
                        zzdyVar.zzF(i17);
                        int zze4 = zzdyVar.zze();
                        if (zzdyVar.zze() == 1952804451) {
                            int zze5 = zzdyVar.zze();
                            zzdyVar.zzG(1);
                            if (zzadv.zze(zze5) == 0) {
                                zzdyVar.zzG(1);
                                i12 = 0;
                                i13 = 0;
                            } else {
                                int zzk = zzdyVar.zzk();
                                i12 = zzk & 15;
                                i13 = (zzk & 240) >> 4;
                            }
                            boolean z10 = zzdyVar.zzk() == 1;
                            int zzk2 = zzdyVar.zzk();
                            byte[] bArr2 = new byte[16];
                            zzdyVar.zzB(bArr2, 0, 16);
                            if (z10 && zzk2 == 0) {
                                int zzk3 = zzdyVar.zzk();
                                byte[] bArr3 = new byte[zzk3];
                                zzdyVar.zzB(bArr3, 0, zzk3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzaeuVar = new zzaeu(z10, str, zzk2, bArr2, i13, i12, bArr);
                        } else {
                            i17 += zze4;
                        }
                    }
                    zzyv.zzb(zzaeuVar != null, "tenc atom is mandatory");
                    int i18 = zzeg.zza;
                    create = Pair.create(num, zzaeuVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzc += zze;
        }
        return null;
    }

    private static zzadx zzk(zzdy zzdyVar, int i10) {
        zzdyVar.zzF(i10 + 12);
        zzdyVar.zzG(1);
        zzf(zzdyVar);
        zzdyVar.zzG(2);
        int zzk = zzdyVar.zzk();
        if ((zzk & 128) != 0) {
            zzdyVar.zzG(2);
        }
        if ((zzk & 64) != 0) {
            zzdyVar.zzG(zzdyVar.zzo());
        }
        if ((zzk & 32) != 0) {
            zzdyVar.zzG(2);
        }
        zzdyVar.zzG(1);
        zzf(zzdyVar);
        String zzd = zzbo.zzd(zzdyVar.zzk());
        if (!"audio/mpeg".equals(zzd) && !"audio/vnd.dts".equals(zzd) && !"audio/vnd.dts.hd".equals(zzd)) {
            zzdyVar.zzG(4);
            int zzn = zzdyVar.zzn();
            int zzn2 = zzdyVar.zzn();
            zzdyVar.zzG(1);
            int zzf = zzf(zzdyVar);
            byte[] bArr = new byte[zzf];
            zzdyVar.zzB(bArr, 0, zzf);
            if (zzn2 <= 0) {
                zzn2 = -1;
            }
            return new zzadx(zzd, bArr, zzn2, zzn > 0 ? zzn : -1);
        }
        return new zzadx(zzd, null, -1, -1);
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void zzm(com.google.android.gms.internal.ads.zzdy r24, int r25, int r26, int r27, int r28, java.lang.String r29, boolean r30, com.google.android.gms.internal.ads.zzv r31, com.google.android.gms.internal.ads.zzadz r32, int r33) throws com.google.android.gms.internal.ads.zzbp {
        /*
            Method dump skipped, instructions count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaed.zzm(com.google.android.gms.internal.ads.zzdy, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzv, com.google.android.gms.internal.ads.zzadz, int):void");
    }

    private static void zzn(zzdy zzdyVar, int i10, int i11, int i12, zzadz zzadzVar) {
        zzdyVar.zzF(i11 + 16);
        zzdyVar.zzv((char) 0);
        String zzv = zzdyVar.zzv((char) 0);
        if (zzv != null) {
            zzab zzabVar = new zzab();
            zzabVar.zzG(i12);
            zzabVar.zzS(zzv);
            zzadzVar.zzb = zzabVar.zzY();
        }
    }

    private static boolean zzo(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length;
        int i10 = length - 1;
        return jArr[0] <= j11 && j11 < jArr[zzeg.zzf(4, 0, i10)] && jArr[zzeg.zzf(length + (-4), 0, i10)] < j12 && j12 <= j10;
    }
}
