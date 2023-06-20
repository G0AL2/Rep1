package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.6m  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C07296m {
    public static byte[] A03;
    public static String[] A04 = {"o84FpHzEZxPfIbBPVc3PyJBEasuCfO6c", "JrI1dU8TTdtObirIwzr9PDFTf", "Oz2bxznKOZIoYiu00r0tMjRqahT5L8eX", "WyAMbI9dOM56rsavBzGbIzP4LEeOBa2a", "QAd1wzNDoH5I97BQWX3GR9O2v", "PJ66RTAVo3tttPzwttyvOY4w2twOeZmh", "FZtFZJQ3MyLobIqHR00oY", "wJgkVVpmtRvVSLM2dL7kjEoPPerdmE0p"};
    public final Context A00;
    public final Intent A01;
    public final C6C A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-114, -101, -111, -97, -100, -106, -111, 91, -106, -101, -95, -110, -101, -95, 91, -114, -112, -95, -106, -100, -101, 91, 111, 110, -127, -127, 114, Byte.MAX_VALUE, -122, -116, 112, 117, 110, 123, 116, 114, 113};
    }

    static {
        A01();
    }

    public C07296m(Context context, C6C c6c) {
        this.A00 = context;
        this.A02 = c6c;
        this.A01 = this.A00.registerReceiver(null, new IntentFilter(A00(0, 37, 37)));
    }

    @Nullable
    public final AnonymousClass78 A02() {
        if (this.A02.A0a() == EnumC07426z.A0G) {
            return null;
        }
        Context context = this.A00;
        String[] strArr = A04;
        if (strArr[6].length() != strArr[1].length()) {
            A04[2] = "BdLEpYuR7vP7Yavjfaa4glVMZlrsrS6q";
            AnonymousClass78 signalValueContext = new AnonymousClass78(context == null ? A00(0, 0, 34) : context.getPackageName());
            return signalValueContext;
        }
        throw new RuntimeException();
    }

    public final C7A A03(float f10) {
        return new YC(SystemClock.elapsedRealtime(), A02(), f10);
    }

    public final C7A A04(int i10) {
        return new YA(SystemClock.elapsedRealtime(), A02(), i10);
    }

    public final C7A A05(int i10, HashMap<String, String> hashMap) {
        if (this.A01 != null) {
            HashMap<String, Integer> hashMap2 = new HashMap<>();
            for (String str : hashMap.keySet()) {
                String[] strArr = A04;
                if (strArr[7].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                A04[2] = "InQCvX9bMvCeYEwlTxFUxsBs8sRyWh3b";
                Intent intent = this.A01;
                String key = hashMap.get(str);
                hashMap2.put(str, Integer.valueOf(intent.getIntExtra(key, i10)));
            }
            return A0C(hashMap2);
        }
        return A07(AnonymousClass76.A07);
    }

    public final C7A A06(long j10) {
        return new Y8(SystemClock.elapsedRealtime(), A02(), j10);
    }

    public final C7A A07(AnonymousClass76 anonymousClass76) {
        return new YD(SystemClock.elapsedRealtime(), A02(), new AnonymousClass77(anonymousClass76));
    }

    public final C7A A08(String str) {
        return new Y5(SystemClock.elapsedRealtime(), A02(), str);
    }

    public final C7A A09(String str) {
        Intent intent = this.A01;
        if (intent != null) {
            return A08(intent.getStringExtra(str));
        }
        return A07(AnonymousClass76.A07);
    }

    public final C7A A0A(String str, int i10) {
        Intent intent = this.A01;
        if (intent != null) {
            int intExtra = intent.getIntExtra(str, i10);
            if (A04[4].length() != 16) {
                A04[2] = "oU3Fbet9HTJlYuGSJV9pu56iNwFexhrg";
                return A04(intExtra);
            }
            throw new RuntimeException();
        }
        return A07(AnonymousClass76.A07);
    }

    public final C7A A0B(String str, boolean z10) {
        Intent intent = this.A01;
        if (intent != null) {
            return A0F(intent.getBooleanExtra(str, z10));
        }
        return A07(AnonymousClass76.A07);
    }

    public final C7A A0C(HashMap<String, Integer> hashMap) {
        return new YB(SystemClock.elapsedRealtime(), A02(), hashMap);
    }

    public final C7A A0D(List<AnonymousClass71> list) {
        return new Y9(SystemClock.elapsedRealtime(), A02(), list, AnonymousClass79.A03);
    }

    public final C7A A0E(List<String> resultList) {
        return new Y9(SystemClock.elapsedRealtime(), A02(), resultList, AnonymousClass79.A0C);
    }

    public final C7A A0F(boolean z10) {
        return new YF(SystemClock.elapsedRealtime(), A02(), z10);
    }
}
