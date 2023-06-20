package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Environment;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class ZV extends C07296m {
    public static byte[] A00;
    public static String[] A01 = {"y8Nq67FtAwLOnhnq1UqleBVuRpU5lwEq", "kKy3QSHCMFgMLI4jLKgpj6Ml3G5G", "CtFK8Pc2dFCHV68GnB3BGsunpwsbXZLI", "F24bvZCYxJ", "TOSHYJ1lEJvd7RJrf6C3asPns89jgyAB", "1i4XZgSUiEitKg1uirtbWyvJYEy72451", "xxTjtjFBsKHKUg72VLV3KyKqm", "tv2qbFeBoe5tOdCVBoBS0k7Q0eg7h6FY"};
    public static final String A02;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{73, 91, 95, 74, 41, 75, 14, 119, 106, 102, 109, 97, 118, 12, 47, 24, 24, 5, 24, 74, 8, 31, 3, 6, 14, 3, 4, 13, 74, 12, 3, 6, 15, 74, 37, 8, 0, 15, 9, 30, 47, 30, 13, 12, 26, 95, 58, 17, 9, 95, 41, 30, 13, 22, 30, 29, 19, 26};
    }

    static {
        A09();
        A02 = ZV.class.getSimpleName();
    }

    public ZV(Context context, C6C c6c) {
        super(context, c6c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"Nullable Dereference"})
    public C7A A02(HashMap<String, ZW> hashMap) {
        return new Y7(SystemClock.elapsedRealtime(), A02(), hashMap, AnonymousClass79.A0C);
    }

    @Nullable
    @SuppressLint({"CatchGeneralException", "BadMethodUse-android.util.Log.e"})
    public static File A03(String str) {
        try {
            String substring = str.substring(0, str.lastIndexOf(File.separator));
            String fileName = str.substring(str.lastIndexOf(File.separator) + 1);
            return new File(substring, fileName);
        } catch (Exception e10) {
            Log.e(A02, A05(14, 26, 93), e10);
            return null;
        }
    }

    public static String A06(String str) {
        if (((str.hashCode() == 902502675 && str.equals(A05(6, 8, 5))) ? (char) 0 : (char) 65535) != 0) {
            String A05 = A05(0, 0, 28);
            if (A01[0].charAt(3) != 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[1] = "jdgM3VinY7vKBuJQR961ULiFKj7S";
            strArr[3] = "O0JYmDhqre";
            return A05;
        }
        return Environment.getExternalStorageDirectory().toString();
    }

    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    public static String A07(String regex) {
        String A05 = A05(0, 6, 66);
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = Pattern.compile(A05).matcher(regex);
        while (matcher.find()) {
            String matchedPattern = matcher.group();
            matcher.appendReplacement(stringBuffer, A06(matchedPattern));
        }
        matcher.appendTail(stringBuffer);
        String regex2 = stringBuffer.toString();
        try {
            regex2 = new File(regex2).getCanonicalPath();
            return regex2;
        } catch (IOException e10) {
            Log.e(A02, A05(40, 18, 72), e10);
            return regex2;
        }
    }

    public final InterfaceC07386v A0G(List<C07376u> list) {
        return new ZX(this, list);
    }
}
