package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.Ul  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1312Ul extends I8 {
    public static byte[] A00;
    public static final Pattern A01;
    public static final Pattern A02;
    public static final Pattern A03;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{120, 86, 14, 75, 86, 29, 0, 23, 39, 81, 87, 82, 80, 37, 87, 81, 37, 29, 82, 80, 37, 87, 81, 37, 29, 82, 80, 37, 87, 15, 72, 37, 87, 28, 1, 22, 93, 107, 29, 27, 30, 28, 105, 27, 29, 105, 81, 30, 28, 105, 27, 29, 105, 81, 30, 28, 105, 27, 67, 7, 105, 27, 80, 77, 90, 17, 85, 35, 87, 111, 32, 34, 87, 37, 35, 87, 111, 32, 34, 87, 37, 35, 87, 111, 32, 34, 87, 37, 125, 56, 87, 37, 110, 115, 100, 47};
    }

    static {
        A07();
        A01 = Pattern.compile(A06(8, 29, 107), 32);
        A02 = Pattern.compile(A06(37, 29, 39), 32);
        A03 = Pattern.compile(A06(66, 30, 25), 32);
    }

    public C1312Ul(String str, long j10, long j11, long j12, @Nullable File file) {
        super(str, j10, j11, j12, file);
    }

    @Nullable
    public static C1312Ul A00(File file, IC ic2) {
        String name = file.getName();
        if (!name.endsWith(A06(1, 7, 106))) {
            file = A05(file, ic2);
            if (file == null) {
                return null;
            }
            name = file.getName();
        }
        Matcher matcher = A03.matcher(name);
        if (matcher.matches()) {
            long length = file.length();
            int id2 = Integer.parseInt(matcher.group(1));
            String A0C = ic2.A0C(id2);
            if (A0C == null) {
                return null;
            }
            String key = matcher.group(2);
            long parseLong = Long.parseLong(key);
            String key2 = matcher.group(3);
            return new C1312Ul(A0C, parseLong, length, Long.parseLong(key2), file);
        }
        return null;
    }

    public static C1312Ul A01(String str, long j10) {
        return new C1312Ul(str, j10, -1L, -9223372036854775807L, null);
    }

    public static C1312Ul A02(String str, long j10) {
        return new C1312Ul(str, j10, -1L, -9223372036854775807L, null);
    }

    public static C1312Ul A03(String str, long j10, long j11) {
        return new C1312Ul(str, j10, j11, -9223372036854775807L, null);
    }

    public static File A04(File file, int i10, long j10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        String A06 = A06(0, 1, 68);
        sb2.append(A06);
        sb2.append(j10);
        sb2.append(A06);
        sb2.append(j11);
        sb2.append(A06(1, 7, 106));
        return new File(file, sb2.toString());
    }

    @Nullable
    public static File A05(File file, IC ic2) {
        String group;
        String name = file.getName();
        Matcher matcher = A02.matcher(name);
        if (matcher.matches()) {
            group = C1020Iz.A0O(matcher.group(1));
            if (group == null) {
                return null;
            }
        } else {
            matcher = A01.matcher(name);
            if (!matcher.matches()) {
                return null;
            }
            group = matcher.group(1);
        }
        File A04 = A04(file.getParentFile(), ic2.A08(group), Long.parseLong(matcher.group(2)), Long.parseLong(matcher.group(3)));
        if (file.renameTo(A04)) {
            return A04;
        }
        return null;
    }

    public final C1312Ul A08(int i10) {
        IK.A04(this.A05);
        long now = System.currentTimeMillis();
        return new C1312Ul(this.A04, this.A02, this.A01, now, A04(this.A03.getParentFile(), i10, this.A02, now));
    }
}
