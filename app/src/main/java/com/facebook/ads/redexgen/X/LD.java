package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class LD {
    public static String[] A01 = {"vWOWhJ9TqiA1ty478f", "MWb8A3Nd6tPLcAimCp0hVAmYX6QHiaZm", "Xd3YBUkiMhOleC4V056rVyOXhinwtSii", "tT8mJINbcEXXPPmKiWyTepfA0JHaFg93", "WoudJsrKOqRuVhNYSdRTZjqc00A0B3WY", "YTheXaZSxrm1KPF5Yd", "huHeChgRkwF7QVPgKoMeW6tLhEc13T9K", "ASVM8zHOtJrSOKsDwpZwweqDqvgS8KFW"};
    public static final ThreadLocal<LD> A02 = new ThreadLocal<>();
    public final C1066Kw A00 = new C1066Kw();

    public static C1066Kw A00() {
        return A02().A00;
    }

    public static C1066Kw A01(LC lc2) {
        C1066Kw c1066Kw = new C1066Kw(A00());
        c1066Kw.add(lc2);
        return c1066Kw;
    }

    public static LD A02() {
        LD ld2 = A02.get();
        String[] strArr = A01;
        if (strArr[6].charAt(1) != strArr[2].charAt(1)) {
            String[] strArr2 = A01;
            strArr2[7] = "JnfSkSuIf6osqUQGv4Nkh0Vi2QZsQFPV";
            strArr2[4] = "e9u3CRl6fKpCeCDR9nRPR0cml03xK1Bs";
            if (ld2 == null) {
                LD ld3 = new LD();
                A02.set(ld3);
                return ld3;
            }
            return ld2;
        }
        throw new RuntimeException();
    }

    public static void A03(L8 l82) {
        C1066Kw createRunnableAsyncStackTrace = l82.A05();
        if (createRunnableAsyncStackTrace != null) {
            A02().A00.addAll(createRunnableAsyncStackTrace);
        }
    }

    public static void A04(L8 l82) {
        C1066Kw createRunnableAsyncStackTrace = l82.A05();
        if (createRunnableAsyncStackTrace != null) {
            A02().A00.removeAll(createRunnableAsyncStackTrace);
        }
    }
}
