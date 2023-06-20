package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8t  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C07768t {
    @VisibleForTesting
    public static SparseIntArray A00;
    @VisibleForTesting
    public static Executor A01;
    public static boolean A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"lfqbOpCQc8eNVWWSF0ti", "aQ5ZOD0I", "7f7up0GBGRCd1p0enpCjG4lcj76", "dHBYXWbpLBdqteinvxBO5bOixoP3oT04", "DPNUUQYEctncegz3shse9IBb8Vdl47", "4q0rwT09y0cbatV7Yp", "6l64E9SK9p5G", "edaEIeRSccYYgTnyelVwcwdzoe4C2sfO"};
    public static final List<Integer> A06;
    public static final List<C07778u> A07;
    public static final AtomicBoolean A08;
    public static final AtomicInteger A09;
    public static final AtomicReference<C8r> A0A;
    public static final AtomicReference<InterfaceC07758s> A0B;
    public static final AtomicReference<Boolean> A0C;

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-93, -105, -40, -37, -37, -32, -21, -32, -26, -27, -40, -29, -64, -27, -35, -26, -105, -76, -105, -110, -122, -45, -53, -39, -39, -57, -51, -53, -122, -93, -122, 91, 79, -94, -92, -111, -93, -88, -97, -108, 114, -98, -109, -108, 79, 108, 79, 116, -66, -36, -23, -94, -17, -101, -25, -22, -30, -101, -65, -32, -35, -16, -30, -101, -64, -15, -32, -23, -17, -87, -101, -66, -22, -23, -17, -32, -13, -17, -101, -28, -18, -101, -23, -16, -25, -25, -87, 119, -93, -87, -94, -88, -103, -90, 110, 84, -79, -46, -49, -30, -44, -115, -48, -33, -50, -32, -43, -115, -49, -46, -48, -50, -30, -32, -46, -115, -36, -45, -115, -46, -29, -46, -37, -31, -115, -28, -42, -31, -43, -115, -32, -30, -49, -31, -26, -35, -46, -115, -86, -115, 108, -97, -118, -116, -116, -117, -116, -117, 71, -112, -107, 84, -108, -116, -108, -106, -103, -96, 71, -109, -106, -114, 71, -109, -112, -108, -112, -101, 72, 71, 115, -120, -102, -101, 71, -116, -99, -116, -107, -101, 97, 71, -108, -57, -78, -76, -65, -61, -72, -66, -67, 111, -109, -76, -79, -60, -74, 111, -108, -59, -76, -67, -61, 111, -58, -72, -61, -73, 111, -62, -60, -79, -61, -56, -65, -76, 111, -116, 111, -97, -46, -67, -65, -54, -50, -61, -55, -56, 122, -66, -49, -52, -61, -56, -63, 122, -58, -55, -63, -63, -61, -56, -63, 122, -66, -65, -68, -49, -63, 122, -65, -48, -65, -56, -50, -120, -27, 24, 3, 5, 16, 20, 9, 15, 14, -64, 19, 8, 15, 21, 12, 4, -64, 14, 15, 20, -64, 8, 1, 16, 16, 5, 14, -64, 8, 5, 18, 5, -50, -101, -105, -106, -54, -71, -66, -70, -61, -72, -70, -93, -70, -55, -52, -60, -57, -64, -28, 9, 1, 10, -69, -33, 0, -3, 16, 2, -69, -32, 17, 0, 9, 15, -69, 18, 4, 15, 3, -69, 14, 16, -3, 15, 20, 11, 0, -69, -40, -69, -53, -26, -26, -105, -28, -40, -27, -16, -105, -36, -19, -36, -27, -21, -22, -105, -26, -35, -105, -22, -20, -39, -21, -16, -25, -36, -105, -38, -26, -37, -36, -79, -105, -101, -99, -104, -99, -102, -83, -102, -104, -91, -88, -96, -96, -94, -89, -96, -21, -8, -3, -24, -19, -18, -3, -18, -20, -3, -14, -8, -9, -24, 0, -8, -24, -4, -14, -16, -9, -22, -11, -24, -19, -22, -3, -22, -24, -11, -8, -16, -16, -14, -9, -16, -62, -64, -62, -57, -60, -57, -56, -62, -49, -46, -54, -54, -52, -47, -54, -2, 13, 6, 6, -3, 4, -49, -42, -55, -59, -36, -57, -46, -49, -54, -57, -38, -49, -43, -44, -36, -45, -30, -27, -35, -32, -39};
    }

    static {
        A04();
        A00 = new SparseIntArray();
        A03 = false;
        A0B = new AtomicReference<>();
        A0A = new AtomicReference<>();
        A01 = Executors.newSingleThreadExecutor();
        A06 = Arrays.asList(10, 50, 100, 1000);
        A07 = Collections.synchronizedList(new ArrayList());
        A09 = new AtomicInteger();
        A08 = new AtomicBoolean();
        A0C = new AtomicReference<>();
        A02 = false;
    }

    public static int A00(String str, int i10, C8U c8u) {
        if ((A01(457, 7, 71).equals(str) && C07828z.A1z == i10) || A01(422, 5, 56).equals(str) || A01(437, 6, 113).equals(str)) {
            return 200;
        }
        if (A01(386, 36, 98).equals(str)) {
            return 50;
        }
        if (A01(371, 15, 18).equals(str)) {
            return JT.A05(c8u);
        }
        if (A05[3].charAt(3) != 'Y') {
            throw new RuntimeException();
        }
        A05[7] = "MSKlPe4okWTggpeViHGlBF3nlCraGBz9";
        return -1;
    }

    public static /* synthetic */ List A02() {
        List<C07778u> list = A07;
        String[] strArr = A05;
        if (strArr[4].length() != strArr[0].length()) {
            A05[1] = "TV2BvPAOYvnRV0R5I88rwwfNZOOU8";
            return list;
        }
        throw new RuntimeException();
    }

    public static void A05(C8U c8u, int i10, int i11) {
        c8u.A06().A8y(A01(427, 10, 60), C07828z.A2W, new AnonymousClass90(A01(338, 33, 80) + i10, A01(87, 9, 13) + i11));
    }

    @Deprecated
    public static void A06(@Nullable C8U c8u, String str, int i10, AnonymousClass90 anonymousClass90) {
        if (c8u == null) {
            A0F(new RuntimeException(A01(48, 39, 84)));
            return;
        }
        C8T.A01(c8u.A00());
        if (A02 && anonymousClass90.A00() == 0) {
            A0D(new RuntimeException(A01(96, 44, 70) + str + A01(31, 16, 8) + i10, anonymousClass90));
        }
        try {
            if (A0I(c8u, str, i10, Math.random(), anonymousClass90)) {
                A09(c8u, str, i10, anonymousClass90);
            }
        } catch (Throwable th) {
            A0F(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    @Deprecated
    public static void A07(C8U c8u, String str, int i10, AnonymousClass90 anonymousClass90) {
        try {
            anonymousClass90.A03(2);
            anonymousClass90.A08(false);
            anonymousClass90.A04(1);
            if (JT.A0Q(c8u)) {
                anonymousClass90.A06(true);
            } else {
                anonymousClass90.A06(false);
            }
            A06(c8u, str, i10, anonymousClass90);
        } catch (Throwable th) {
            A0F(th);
        }
    }

    @Deprecated
    public static void A08(C8U c8u, String str, int i10, AnonymousClass90 anonymousClass90) {
        try {
            anonymousClass90.A03(2);
            anonymousClass90.A06(false);
            A06(c8u, str, i10, anonymousClass90);
        } catch (Throwable th) {
            A0F(th);
        }
    }

    public static void A09(C8U c8u, String str, int i10, AnonymousClass90 anonymousClass90) {
        synchronized (C07768t.class) {
            if (!A03) {
                int A012 = JT.A01(c8u);
                if (A09.getAndIncrement() < A012 - 1) {
                    A07.add(new C07778u(str, i10, anonymousClass90));
                } else if (A09.get() == A012) {
                    List<C07778u> list = A07;
                    String A013 = A01(427, 10, 60);
                    int i11 = C07828z.A2T;
                    list.add(new C07778u(A013, i11, new AnonymousClass90(A01(IronSourceConstants.USING_CACHE_FOR_INIT_EVENT, 42, 0) + str + A01(47, 1, 19) + i10)));
                }
            } else {
                A0A(c8u, str, i10, anonymousClass90, true);
            }
        }
    }

    public static void A0A(C8U c8u, String str, int i10, AnonymousClass90 anonymousClass90, boolean z10) {
        InterfaceC07758s interfaceC07758s = A0B.get();
        boolean z11 = interfaceC07758s != null && interfaceC07758s.A8e();
        if (A08.get() || z11) {
            int A002 = anonymousClass90.A00();
            String A012 = A01(289, 17, 46);
            String A013 = A01(31, 16, 8);
            if (A002 == 0) {
                Log.e(A012, A01(182, 37, 40) + str + A013 + i10, anonymousClass90);
            } else {
                Log.i(A012, A01(306, 32, 116) + str + A013 + i10 + A01(19, 12, 63) + anonymousClass90.getMessage() + A01(0, 19, 80) + anonymousClass90.A02());
            }
        }
        C1391Xp c1391Xp = new C1391Xp(c8u, str, i10, anonymousClass90, interfaceC07758s);
        if (z10) {
            A01.execute(c1391Xp);
        } else {
            c1391Xp.run();
        }
    }

    public static void A0C(C1399Xx c1399Xx, InterfaceC07758s interfaceC07758s, C8r c8r, boolean z10) {
        A0A.set(c8r);
        A0B.set(interfaceC07758s);
        A08.set(z10);
        synchronized (C07768t.class) {
            if (!A03) {
                A03 = true;
                A01.execute(new C1392Xq(c1399Xx));
            }
        }
    }

    public static void A0D(final RuntimeException runtimeException) {
        if (A02) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.facebook.ads.redexgen.X.8q
                @Override // java.lang.Runnable
                public final void run() {
                    throw runtimeException;
                }
            });
        }
    }

    @Deprecated
    public static void A0E(Throwable th) {
        if (A02) {
            A0D(new RuntimeException(A01(256, 33, 121), th));
        }
    }

    public static void A0F(Throwable th) {
        Log.e(A01(289, 17, 46), A01(219, 37, 51), th);
        if (A02) {
            A0D(new RuntimeException(th));
        }
    }

    public static boolean A0H(C8U c8u) {
        Boolean bool = A0C.get();
        if (bool != null) {
            return bool.booleanValue();
        }
        return JT.A0A(c8u) != 0;
    }

    @SuppressLint({"CatchGeneralException"})
    @VisibleForTesting
    public static boolean A0I(C8U c8u, String str, int i10, double d10, AnonymousClass90 anonymousClass90) {
        double logProbability;
        int A0E;
        int A032;
        try {
            int A042 = JT.A04(c8u);
            if (A042 < 1) {
                return false;
            }
            HashMap<String, Integer> A0M = JT.A0M(c8u);
            String str2 = str + A01(47, 1, 19) + i10;
            boolean contains = A0M.keySet().contains(str2);
            if (contains) {
                Integer num = A0M.get(str2);
                int intValue = num != null ? num.intValue() : -1;
                if (intValue == 0) {
                    return false;
                }
                if (intValue > 0) {
                    return d10 <= 1.0d / ((double) intValue);
                }
                if (JT.A03(c8u) < 1) {
                    return false;
                }
                logProbability = (A042 * A032) / 10000.0d;
            } else if (!anonymousClass90.A09()) {
                logProbability = 0.0d;
            } else {
                double logProbability2 = A042;
                logProbability = logProbability2 / 100.0d;
            }
            double A002 = c8u.A07().A00();
            if (A01(422, 5, 56).equals(str)) {
                if (c8u.A03().A8P()) {
                    return true;
                }
                int A062 = JT.A06(c8u);
                if (A062 == 0) {
                    return false;
                }
                if (A062 > 0) {
                    double d11 = 1.0d / A062;
                    return contains ? A002 <= d11 * logProbability : A002 <= d11;
                }
            }
            if (A01(457, 7, 71).equals(str) && C07828z.A1z == i10) {
                if (!A08.get()) {
                    A0E = JT.A0E(c8u);
                } else {
                    A0E = 1;
                }
                if (A0E == 0) {
                    return false;
                }
                if (A0E > 0) {
                    double d12 = 1.0d / A0E;
                    if (contains) {
                        return A002 <= d12 * logProbability;
                    }
                    int i11 = (A002 > d12 ? 1 : (A002 == d12 ? 0 : -1));
                    String[] strArr = A05;
                    if (strArr[4].length() != strArr[0].length()) {
                        String[] strArr2 = A05;
                        strArr2[4] = "UCVKOFALDBGOqUDhQrKLO3Bmgt3EZK";
                        strArr2[0] = "0av5HRm0swjvR429TUKJ";
                        return i11 <= 0;
                    }
                    throw new RuntimeException();
                }
            }
            if (A01(437, 6, 113).equals(str)) {
                if (JT.A0S(c8u) && anonymousClass90.A0A()) {
                    return !contains || d10 >= 1.0d - logProbability;
                }
                Boolean bool = A0C.get();
                if (bool != null) {
                    return bool.booleanValue();
                }
                int A0A2 = JT.A0A(c8u);
                if (A0A2 == 0) {
                    A0C.set(false);
                    return false;
                } else if (A0A2 > 0) {
                    double d13 = 1.0d / A0A2;
                    return contains ? A002 <= d13 * logProbability : A002 <= d13;
                }
            }
            if (A01(443, 14, 63).equals(str)) {
                if (c8u.A03().A8P()) {
                    return true;
                }
                int A0B2 = JT.A0B(c8u);
                if (A0B2 == 0) {
                    return false;
                }
                if (A0B2 > 0) {
                    double d14 = 1.0d / A0B2;
                    return contains ? A002 <= d14 * logProbability : A002 <= d14;
                }
            }
            return d10 >= 1.0d - logProbability;
        } catch (Throwable th) {
            A0F(th);
            return false;
        }
    }

    @VisibleForTesting
    public static boolean A0J(C8U c8u, String str, int eventsLimit, AnonymousClass90 anonymousClass90) {
        if (JT.A0P(c8u)) {
            int i10 = A00.get(eventsLimit);
            int A002 = JT.A00(c8u);
            if (anonymousClass90.A01() != -1) {
                A002 = anonymousClass90.A01();
            } else {
                int A003 = A00(str, eventsLimit, c8u);
                if (A002 < A003) {
                    A002 = A003;
                }
            }
            if (i10 >= A002) {
                if (A06.contains(Integer.valueOf(i10))) {
                    boolean A0B2 = anonymousClass90.A0B();
                    if (A05[3].charAt(3) != 'Y') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A05;
                    strArr[5] = "DtDXz8TrFQQZw1pkgy";
                    strArr[2] = "wKGFu6BM2pQR03pr0dyvmA98nTz";
                    if (A0B2) {
                        A05(c8u, eventsLimit, i10);
                    }
                }
                A00.put(eventsLimit, i10 + 1);
                return true;
            }
            A00.put(eventsLimit, i10 + 1);
            return false;
        }
        return true;
    }
}
