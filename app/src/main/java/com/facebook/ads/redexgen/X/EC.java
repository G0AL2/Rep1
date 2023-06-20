package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.video.ColorInfo;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

@TargetApi(16)
/* loaded from: assets/audience_network.dex */
public final class EC {
    public static byte[] A00;
    public static String[] A01 = {"Dbr5x2VsG4nNJUzZeTNPRzqkDjV0oi2y", "sqWbbRPXNyW0qNg4n4LbnWr7GpqemFLg", "VW0orVwJIwlFBZUuevBwAx8XihB6GJeh", "sngGG6Fmd4EPEmkegOhqiaCkbznw5fIQ", "fBp67RXxdXXhweTtV", "xhkPbV6ALkx1WmbrpVNjFTeHYiqbNWEs", "xdguQhXu79c53EOEv", "iU2QkTKnw06iORL4QIBjMVUBldIJ1Brw"};

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {102, 106, 105, 106, 119, 40, 119, 100, 107, 98, 96, 13, 1, 2, 1, 28, 67, 29, 26, 15, 0, 10, 15, 28, 10, 99, 111, 108, 111, 114, 45, 116, 114, 97, 110, 115, 102, 101, 114, 0, 16, 7, 78, 92, 80, 70, 25, 71, 64, 85, 64, 93, 87, 25, 93, 90, 82, 91};
        String[] strArr = A01;
        if (strArr[6].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "x3p0Kh6wVb2g5jx4t";
        strArr2[4] = "ATUwahLadetLCyEQ4";
        A00 = bArr;
    }

    static {
        A01();
    }

    public static void A02(MediaFormat mediaFormat, @Nullable ColorInfo colorInfo) {
        if (colorInfo != null) {
            A04(mediaFormat, A00(25, 14, 61), colorInfo.A03);
            A04(mediaFormat, A00(11, 14, 83), colorInfo.A02);
            A04(mediaFormat, A00(0, 11, 56), colorInfo.A01);
            A05(mediaFormat, A00(43, 15, 9), colorInfo.A04);
        }
    }

    public static void A03(MediaFormat mediaFormat, String str, float f10) {
        if (f10 != -1.0f) {
            mediaFormat.setFloat(str, f10);
        }
    }

    public static void A04(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }

    public static void A05(MediaFormat mediaFormat, String str, @Nullable byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void A06(MediaFormat mediaFormat, List<byte[]> list) {
        int i10 = 0;
        while (true) {
            int size = list.size();
            String[] strArr = A01;
            if (strArr[3].charAt(12) == strArr[2].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[6] = "lAJS3mBUvkodW4hvC";
            strArr2[4] = "VpgNqhxD27ukGqVl1";
            if (i10 < size) {
                mediaFormat.setByteBuffer(A00(39, 4, 94) + i10, ByteBuffer.wrap(list.get(i10)));
                i10++;
            } else {
                return;
            }
        }
    }
}
