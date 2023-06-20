package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.9t  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C08019t {
    public static byte[] A04;
    public int A00;
    public long A01;
    public final RandomAccessFile A02;
    public final long[] A03;

    static {
        A06();
    }

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A04 = new byte[]{-57, -30, -22, -19, -26, -27, -95, -11, -16, -95, -28, -13, -26, -30, -11, -26, -95, -25, -22, -19, -26, -95, -88, -90, -12, -88, 114, -115, -107, -104, -111, -112, 76, -96, -101, 76, -101, -100, -111, -102, 76, -110, -107, -104, -111, 76, 83, 81, -97, 83, -69, -34, -31, -38, -107, -102, -39, -107, -41, -18, -23, -38, -24, -95, -107, -31, -38, -24, -24, -107, -23, -35, -42, -29, -107, -102, -39, -95, -60, -57, -64, 123, -65, -64, -66, -57, -68, -51, -64, -50, 123, -68, 123, -49, -54, -49, -68, -57, 123, -54, -63, 123, Byte.MIN_VALUE, -65, 123, -51, -64, -66, -54, -51, -65, 123, -50, -57, -54, -49, -50, -99, -64, -61, -68, 119, -69, -68, -70, -61, -72, -55, -68, -54, 119, -72, 119, -53, -58, -53, -72, -61, 119, -58, -67, 119, 124, -69, 119, -55, -68, -70, -58, -55, -69, 119, -54, -61, -58, -53, -54, -125, 119, -71, -52, -53, 119, -58, -59, -61, -48, 119, -65, -72, -54, 119, 124, -69, 119, -71, -48, -53, -68, -54, 122, -99, -96, -103, 84, -95, -107, -101, -99, -105, 84, 89, -104, 84, -99, -94, -89, -88, -103, -107, -104, 84, -93, -102, 84, 89, -104, -85, -66, -68, -56, -53, -67, 121, 126, -67, 121, -56, -65, -65, -52, -66, -51, 121, -62, -52, 121, 126, -67, -123, 121, -69, -50, -51, 121, -53, -66, -68, -56, -53, -67, 121, 126, -67, 121, -56, -65, -65, -52, -66, -51, 121, -62, -52, 121, 126, -67, -77, -58, -60, -48, -45, -59, -127, -122, -59, -127, -48, -57, -57, -44, -58, -43, -127, -44, -55, -48, -42, -51, -59, -127, -61, -58, -127, -111, -127, -61, -58, -60, -62, -42, -44, -58, -127, -45, -58, -60, -48, -45, -59, -127, -60, -48, -42, -49, -43, -127, -54, -44, -127, -122, -59, -115, -127, -61, -42, -43, -127, -54, -44, -127, -122, -59, -79, -60, -62, -50, -47, -61, Byte.MAX_VALUE, -124, -61, Byte.MAX_VALUE, -46, -45, -64, -47, -45, -46, Byte.MAX_VALUE, -64, -45, Byte.MAX_VALUE, -50, -59, -59, -46, -60, -45, Byte.MAX_VALUE, -124, -61, -117, Byte.MAX_VALUE, -63, -44, -45, Byte.MAX_VALUE, -59, -56, -53, -60, Byte.MAX_VALUE, -46, -56, -39, -60, Byte.MAX_VALUE, -56, -46, Byte.MAX_VALUE, -124, -61, -107, -88, -90, -78, -75, -89, 99, 115, 99, -78, -87, -87, -74, -88, -73, 99, -88, -69, -77, -88, -90, -73, -88, -89, 99, -92, -73, 99, 104, -89, 99, -91, -72, -73, 99, -84, -74, 99, -92, -73, 99, 104, -89, -57, -52, -56};
    }

    public C08019t(RandomAccessFile randomAccessFile, long[] jArr, long j10) throws IOException {
        this.A02 = randomAccessFile;
        this.A03 = jArr;
        this.A01 = j10;
        for (int i10 = 0; i10 < jArr.length && jArr[i10] != 0; i10++) {
            this.A00++;
        }
        if (this.A00 > 0) {
            long A01 = A01();
            if (jArr[0] != A01) {
                throw new IOException(String.format(Locale.US, A05(373, 43, 23), Long.valueOf(A01), Long.valueOf(jArr[0])));
            }
        }
        for (int i11 = this.A00; i11 < jArr.length; i11++) {
            if (jArr[i11] != 0) {
                throw new IOException(String.format(Locale.US, A05(257, 66, 53), Integer.valueOf(i11), Integer.valueOf(this.A00), Long.valueOf(jArr[i11])));
            }
        }
        int i12 = 1;
        while (true) {
            int i13 = this.A00;
            if (i12 < i13) {
                if (jArr[i12 - 1] <= jArr[i12]) {
                    i12++;
                } else {
                    throw new IOException(String.format(Locale.US, A05(207, 50, 45), Integer.valueOf(i12 - 1), Long.valueOf(jArr[i12 - 1]), Integer.valueOf(i12), Long.valueOf(jArr[i12])));
                }
            } else if (i13 <= 0 || jArr[i13 - 1] <= j10) {
                return;
            } else {
                throw new IOException(String.format(Locale.US, A05(323, 50, 51), Integer.valueOf(this.A00 - 1), Long.valueOf(jArr[this.A00 - 1]), Long.valueOf(j10)));
            }
        }
    }

    public static long A00() {
        return 16L;
    }

    private final long A01() {
        return A00() + (this.A03.length * 8);
    }

    public static long A02(int i10) {
        return A00() + (i10 * 8);
    }

    public static C08019t A03(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, A05(DownloadConnection.HTTP_REQUESTED_RANGE_NOT_SATISFIABLE, 3, 41));
        try {
            randomAccessFile.writeLong(-360011992771067903L);
            randomAccessFile.writeLong(C08029u.A03);
            randomAccessFile.write(new byte[C08029u.A03 * 8]);
            randomAccessFile.getFD().sync();
            return new C08019t(randomAccessFile, new long[C08029u.A03], randomAccessFile.length());
        } catch (IOException unused) {
            A07(randomAccessFile);
            throw new IOException(String.format(Locale.US, A05(0, 26, 85), file.getCanonicalPath()));
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:15:0x004f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.C08019t A04(java.io.File r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C08019t.A04(java.io.File):com.facebook.ads.redexgen.X.9t");
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A07(Closeable closeable) {
        try {
            closeable.close();
        } catch (Exception unused) {
        }
    }
}
