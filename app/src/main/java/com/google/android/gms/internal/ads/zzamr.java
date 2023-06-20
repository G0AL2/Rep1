package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzamr {
    static boolean zza = false;
    private static MessageDigest zzc;
    private static final Object zzd = new Object();
    private static final Object zze = new Object();
    static final CountDownLatch zzb = new CountDownLatch(1);

    public static String zza(zzaly zzalyVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zzg;
        byte[] zzaw = zzalyVar.zzaw();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcu)).booleanValue()) {
            Vector zzb2 = zzb(zzaw, 255);
            if (zzb2 != null && zzb2.size() != 0) {
                zzamk zza2 = zzaml.zza();
                int size = zzb2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    zza2.zza(zzgji.zzv(zzg((byte[]) zzb2.get(i10), str, false)));
                }
                zza2.zzb(zzgji.zzv(zze(zzaw)));
                zzg = ((zzaml) zza2.zzal()).zzaw();
            } else {
                zzg = zzg(zzf(4096).zzaw(), str, true);
            }
        } else if (zzapd.zza != null) {
            byte[] zza3 = zzapd.zza.zza(zzaw, str != null ? str.getBytes() : new byte[0]);
            zzamk zza4 = zzaml.zza();
            zza4.zza(zzgji.zzv(zza3));
            zza4.zzc(3);
            zzg = ((zzaml) zza4.zzal()).zzaw();
        } else {
            throw new GeneralSecurityException();
        }
        return zzamn.zza(zzg, true);
    }

    static Vector zzb(byte[] bArr, int i10) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i11 = (length + 254) / 255;
        Vector vector = new Vector();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i13 > 255) {
                    length2 = i13 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i13, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zzd() {
        synchronized (zze) {
            if (!zza) {
                zza = true;
                new Thread(new zzamq(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x001e, code lost:
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzamr.zzc.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] zze(byte[] r6) throws java.security.NoSuchAlgorithmException {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzamr.zzd
            monitor-enter(r0)
            zzd()     // Catch: java.lang.Throwable -> L34
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.zzamr.zzb     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            r3 = 2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            boolean r2 = r2.await(r3, r5)     // Catch: java.lang.InterruptedException -> L1b java.lang.Throwable -> L34
            if (r2 != 0) goto L14
            goto L1c
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.zzamr.zzc     // Catch: java.lang.Throwable -> L34
            if (r2 != 0) goto L19
            goto L1c
        L19:
            r1 = r2
            goto L1c
        L1b:
        L1c:
            if (r1 == 0) goto L2c
            r1.reset()     // Catch: java.lang.Throwable -> L34
            r1.update(r6)     // Catch: java.lang.Throwable -> L34
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.zzamr.zzc     // Catch: java.lang.Throwable -> L34
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            return r6
        L2c:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L34
            throw r6     // Catch: java.lang.Throwable -> L34
        L34:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamr.zze(byte[]):byte[]");
    }

    static zzaly zzf(int i10) {
        zzali zza2 = zzaly.zza();
        zza2.zzC(4096L);
        return (zzaly) zza2.zzal();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z10) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] array;
        int i10 = true != z10 ? 255 : 239;
        if (bArr.length > i10) {
            bArr = zzf(4096).zzaw();
        }
        int length = bArr.length;
        if (length < i10) {
            byte[] bArr2 = new byte[i10 - length];
            new SecureRandom().nextBytes(bArr2);
            array = ByteBuffer.allocate(i10 + 1).put((byte) length).put(bArr).put(bArr2).array();
        } else {
            array = ByteBuffer.allocate(i10 + 1).put((byte) length).put(bArr).array();
        }
        if (z10) {
            array = ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzams[] zzamsVarArr = new zzanr().zzcG;
        int length2 = zzamsVarArr.length;
        for (int i11 = 0; i11 < 12; i11++) {
            zzamsVarArr[i11].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzgip(str.getBytes("UTF-8")).zza(bArr3);
        }
        return bArr3;
    }
}
