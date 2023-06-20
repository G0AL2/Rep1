package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaih {
    public static X509Certificate[][] zza(String str) throws zzaie, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair zzc = zzaii.zzc(randomAccessFile);
            if (zzc != null) {
                ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
                long longValue = ((Long) zzc.second).longValue();
                long j10 = (-20) + longValue;
                if (j10 >= 0) {
                    randomAccessFile.seek(j10);
                    if (randomAccessFile.readInt() == 1347094023) {
                        throw new zzaie("ZIP64 APK not supported");
                    }
                }
                long zza = zzaii.zza(byteBuffer);
                if (zza < longValue) {
                    if (zzaii.zzb(byteBuffer) + zza == longValue) {
                        if (zza >= 32) {
                            ByteBuffer allocate = ByteBuffer.allocate(24);
                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                            allocate.order(byteOrder);
                            randomAccessFile.seek(zza - allocate.capacity());
                            randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                            if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                                int i10 = 0;
                                long j11 = allocate.getLong(0);
                                if (j11 < allocate.capacity() || j11 > 2147483639) {
                                    throw new zzaie("APK Signing Block size out of range: " + j11);
                                }
                                int i11 = (int) (8 + j11);
                                long j12 = zza - i11;
                                if (j12 >= 0) {
                                    ByteBuffer allocate2 = ByteBuffer.allocate(i11);
                                    allocate2.order(byteOrder);
                                    randomAccessFile.seek(j12);
                                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                                    long j13 = allocate2.getLong(0);
                                    if (j13 == j11) {
                                        Pair create = Pair.create(allocate2, Long.valueOf(j12));
                                        ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                                        long longValue2 = ((Long) create.second).longValue();
                                        if (byteBuffer2.order() == byteOrder) {
                                            int capacity = byteBuffer2.capacity() - 24;
                                            if (capacity >= 8) {
                                                int capacity2 = byteBuffer2.capacity();
                                                if (capacity <= byteBuffer2.capacity()) {
                                                    int limit = byteBuffer2.limit();
                                                    int position = byteBuffer2.position();
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.limit(capacity);
                                                    byteBuffer2.position(8);
                                                    ByteBuffer slice = byteBuffer2.slice();
                                                    slice.order(byteBuffer2.order());
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.limit(limit);
                                                    byteBuffer2.position(position);
                                                    while (slice.hasRemaining()) {
                                                        i10++;
                                                        if (slice.remaining() >= 8) {
                                                            long j14 = slice.getLong();
                                                            if (j14 >= 4 && j14 <= 2147483647L) {
                                                                int i12 = (int) j14;
                                                                int position2 = slice.position() + i12;
                                                                if (i12 <= slice.remaining()) {
                                                                    if (slice.getInt() == 1896449818) {
                                                                        X509Certificate[][] zzl = zzl(randomAccessFile.getChannel(), new zzaid(zze(slice, i12 - 4), longValue2, zza, longValue, byteBuffer, null));
                                                                        randomAccessFile.close();
                                                                        return zzl;
                                                                    }
                                                                    slice.position(position2);
                                                                } else {
                                                                    throw new zzaie("APK Signing Block entry #" + i10 + " size out of range: " + i12 + ", available: " + slice.remaining());
                                                                }
                                                            } else {
                                                                throw new zzaie("APK Signing Block entry #" + i10 + " size out of range: " + j14);
                                                            }
                                                        } else {
                                                            throw new zzaie("Insufficient data to read size of APK Signing Block entry #" + i10);
                                                        }
                                                    }
                                                    throw new zzaie("No APK Signature Scheme v2 block in APK Signing Block");
                                                }
                                                throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                                            }
                                            throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                                        }
                                        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                                    }
                                    throw new zzaie("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j11);
                                }
                                throw new zzaie("APK Signing Block offset out of range: " + j12);
                            }
                            throw new zzaie("No APK Signing Block before ZIP Central Directory");
                        }
                        throw new zzaie("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
                    }
                    throw new zzaie("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                throw new zzaie("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
            }
            throw new zzaie("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int zzb(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return 64;
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
        }
        return 32;
    }

    private static int zzc(int i10) {
        if (i10 != 513) {
            if (i10 != 514) {
                if (i10 != 769) {
                    switch (i10) {
                        case 257:
                        case 259:
                            return 1;
                        case 258:
                        case 260:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static String zzd(int i10) {
        if (i10 != 1) {
            if (i10 == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
        }
        return "SHA-256";
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i10) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (i11 >= position && i11 <= limit) {
            byteBuffer.limit(i11);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i11);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        }
        throw new BufferUnderflowException();
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i10 = byteBuffer.getInt();
            if (i10 >= 0) {
                if (i10 <= byteBuffer.remaining()) {
                    return zze(byteBuffer, i10);
                }
                throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i10 + ", remaining: " + byteBuffer.remaining());
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
    }

    private static void zzg(int i10, byte[] bArr, int i11) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j10, long j11, long j12, ByteBuffer byteBuffer) throws SecurityException {
        if (!map.isEmpty()) {
            zzaic zzaicVar = new zzaic(fileChannel, 0L, j10);
            zzaic zzaicVar2 = new zzaic(fileChannel, j11, j12 - j11);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.order(ByteOrder.LITTLE_ENDIAN);
            zzaii.zzd(duplicate, j10);
            zzaia zzaiaVar = new zzaia(duplicate);
            int size = map.size();
            int[] iArr = new int[size];
            int i10 = 0;
            for (Integer num : map.keySet()) {
                iArr[i10] = num.intValue();
                i10++;
            }
            try {
                byte[][] zzk = zzk(iArr, new zzaib[]{zzaicVar, zzaicVar2, zzaiaVar});
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = iArr[i11];
                    if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i12)), zzk[i11])) {
                        throw new SecurityException(zzd(i12).concat(" digest of contents did not verify"));
                    }
                }
                return;
            } catch (DigestException e10) {
                throw new SecurityException("Failed to compute digest(s) of contents", e10);
            }
        }
        throw new SecurityException("No digests provided");
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 >= 0) {
            if (i10 <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i10];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException("Underflow while reading length-prefixed value. Length: " + i10 + ", available: " + byteBuffer.remaining());
        }
        throw new IOException("Negative length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = zzc(r5);
        r12 = zzc(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer r22, java.util.Map r23, java.security.cert.CertificateFactory r24) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaih.zzj(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zzk(int[] iArr, zzaib[] zzaibVarArr) throws DigestException {
        long j10;
        int i10;
        int length;
        MessageDigest messageDigest;
        long j11 = 0;
        int i11 = 0;
        long j12 = 0;
        int i12 = 0;
        while (true) {
            j10 = 1048576;
            if (i12 >= 3) {
                break;
            }
            j12 += (zzaibVarArr[i12].zza() + 1048575) / 1048576;
            i12++;
        }
        if (j12 < 2097151) {
            int i13 = (int) j12;
            byte[][] bArr = new byte[iArr.length];
            int i14 = 0;
            while (true) {
                length = iArr.length;
                if (i14 >= length) {
                    break;
                }
                byte[] bArr2 = new byte[(zzb(iArr[i14]) * i13) + 5];
                bArr2[0] = 90;
                zzg(i13, bArr2, 1);
                bArr[i14] = bArr2;
                i14++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i15 = 0; i15 < iArr.length; i15++) {
                String zzd = zzd(iArr[i15]);
                try {
                    messageDigestArr[i15] = MessageDigest.getInstance(zzd);
                } catch (NoSuchAlgorithmException e10) {
                    throw new RuntimeException(zzd.concat(" digest not supported"), e10);
                }
            }
            int i16 = 0;
            int i17 = 0;
            for (i10 = 3; i16 < i10; i10 = 3) {
                zzaib zzaibVar = zzaibVarArr[i16];
                long j13 = j11;
                long zza = zzaibVar.zza();
                while (zza > j11) {
                    int min = (int) Math.min(zza, j10);
                    zzg(min, bArr3, 1);
                    for (int i18 = 0; i18 < length; i18++) {
                        messageDigestArr[i18].update(bArr3);
                    }
                    long j14 = j13;
                    try {
                        zzaibVar.zzb(messageDigestArr, j14, min);
                        byte[] bArr4 = bArr3;
                        int i19 = 0;
                        while (i19 < iArr.length) {
                            int i20 = iArr[i19];
                            zzaib zzaibVar2 = zzaibVar;
                            byte[] bArr5 = bArr[i19];
                            int zzb = zzb(i20);
                            int i21 = length;
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigestArr[i19].digest(bArr5, (i17 * zzb) + 5, zzb);
                            if (digest != zzb) {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                            i19++;
                            zzaibVar = zzaibVar2;
                            length = i21;
                            messageDigestArr = messageDigestArr2;
                        }
                        MessageDigest[] messageDigestArr3 = messageDigestArr;
                        long j15 = min;
                        long j16 = j14 + j15;
                        zza -= j15;
                        i17++;
                        bArr3 = bArr4;
                        j11 = 0;
                        j13 = j16;
                        messageDigestArr = messageDigestArr3;
                        j10 = 1048576;
                    } catch (IOException e11) {
                        throw new DigestException("Failed to digest chunk #" + i17 + " of section #" + i11, e11);
                    }
                }
                i11++;
                i16++;
                j11 = 0;
                j10 = 1048576;
            }
            byte[][] bArr6 = new byte[iArr.length];
            for (int i22 = 0; i22 < iArr.length; i22++) {
                int i23 = iArr[i22];
                byte[] bArr7 = bArr[i22];
                String zzd2 = zzd(i23);
                try {
                    bArr6[i22] = MessageDigest.getInstance(zzd2).digest(bArr7);
                } catch (NoSuchAlgorithmException e12) {
                    throw new RuntimeException(zzd2.concat(" digest not supported"), e12);
                }
            }
            return bArr6;
        }
        throw new DigestException("Too many chunks: " + j12);
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzaid zzaidVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j10;
        long j11;
        long j12;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzaidVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i10 = 0;
                while (zzf.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException("Failed to parse/verify signer #" + i10 + " block", e10);
                    }
                }
                if (i10 > 0) {
                    if (!hashMap.isEmpty()) {
                        j10 = zzaidVar.zzb;
                        j11 = zzaidVar.zzc;
                        j12 = zzaidVar.zzd;
                        byteBuffer2 = zzaidVar.zze;
                        zzh(hashMap, fileChannel, j10, j11, j12, byteBuffer2);
                        return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                    }
                    throw new SecurityException("No content digests found");
                }
                throw new SecurityException("No signers found");
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }
}
