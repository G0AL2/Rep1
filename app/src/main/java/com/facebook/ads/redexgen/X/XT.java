package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64OutputStream;
import androidx.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.DeflaterOutputStream;
import ms.bd.o.Pgl.c;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public final class XT implements C9T {
    @Nullable
    public static PackageInfo A03;
    public static EnumC1082Lm A04;
    @Nullable
    public static String A05;
    public static boolean A06;
    public static byte[] A07;
    public static String[] A08 = {"rjWu3o3XUIKJimpXtRLH", "N3hUjd9gC1zTrolrzHWDwio6K0KaeF7v", "V8BOZxTrBek9nlJry76rEN1tEiA1lgnf", "2kaCuDD1e44XjFqxj97oS3bW7Y4jUXps", "VcJxC1jbHxk7XwGyeCWvHwY9E4qRcx1x", "dO6RHNbAuKw0kDbwpnJR", "8jPNINbp0cYAxxIn", "ugIdyp1aSJPFHYCiUHctz2XPYC5YD6Ud"};
    public static final C0T[] A09;
    public static final AtomicBoolean A0A;
    public static final AtomicInteger A0B;
    public final AnonymousClass66 A00;
    public final C8U A01;
    public final AnonymousClass99 A02;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A08[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[1] = "AJGqtkftO03LFXDJsHlFXR4ujVWNfKsn";
            strArr[7] = "0weTThgY8dzMPuXGgH30KJvXs1017h9U";
            if (i13 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 73);
            i13++;
        }
    }

    public static void A08() {
        A07 = new byte[]{40, 13, 21, 23, 23, 17, 7, 7, 29, 22, 29, 24, 29, 0, 13, 11, 17, 26, 21, 22, 24, 17, 16, 41, 46, 56, 45, 42, 60, 87, 98, 109, 98, 111, 108, 100, 85, 68, 68, 75, 89, 93, 90, 75, 71, 80, 95, 75, 66, 81, 70, 71, 93, 91, 90, 78, 92, 71, 78, 92, 44, 62, 36, 41, 86, 67, 67, 69, 94, 85, 66, 67, 94, 88, 89, 72, 94, 83, 106, 97, 108, 108, 109, 122, 119, 124, 103, 99, 109, 102, 119, 109, 112, 124, 122, 105, 123, 62, 41, 50, 56, 48, 57, 79, 77, 92, 92, 73, 72, 83, 69, 72, 95, 21, 23, 4, 4, 31, 19, 4, 67, 70, 83, 70, 88, 87, 85, 72, 68, 66, 84, 84, 78, 73, 64, 88, 72, 87, 83, 78, 72, 73, 84, 92, 89, 76, 89, 71, 72, 74, 87, 91, 93, 75, 75, 81, 86, 95, 71, 87, 72, 76, 81, 87, 86, 75, 71, 91, 87, 77, 86, 76, 74, 65, 111, 106, Byte.MAX_VALUE, 106, 116, 123, 121, 100, 104, 110, 120, 120, 98, 101, 108, 116, 100, 123, Byte.MAX_VALUE, 98, 100, 101, 120, 116, 120, Byte.MAX_VALUE, 106, Byte.MAX_VALUE, 110, 28, 29, 22, 11, 17, 12, 1, 13, 30, 5, 5, 14, 7, 20, 8, 4, 25, 14, 20, 14, 29, 14, 5, 31, 24, 48, 35, 56, 56, 51, 58, 41, 58, 57, 49, 49, 51, 50, 30, 57, 49, 52, 61, 60, 120, 44, 55, 120, 58, 45, 49, 52, 60, 120, 45, 43, 61, 42, 120, 44, 55, 51, 61, 54, 95, 86, 68, 72, 82, 79, 88, 71, 91, 86, 78, 82, 69, 52, 57, 59, 60, 48, 61, 38, 58, 56, 58, 49, 60, 38, 45, 42, 38, 52, 42, 37, 40, 51, 63, 35, 57, 62, 47, 41, 47, 40, 53, 50, 39, 42, 42, 35, 52, 75, 72, 68, 70, 75, 66, 109, 97, 107, 101, 5, 13, 12, 1, 9, 28, 1, 7, 6, 23, 27, 13, 26, 30, 1, 11, 13, 72, 67, 82, 81, 73, 84, 77, 89, 82, 95, 86, 67, 64, 76, 90, 67, 90, 92, 80, 90, 92, 74, 93, 80, 70, 75, 15, 18, 18, 9, 24, 25, 96, 102, 116, 109, 116, 112, 109, 115, 98, 98, 109, 123, 124, 97, 102, 115, 126, 126, 119, 118, 96, 102, 116, 109, 116, 112, 109, 115, 98, 98, 109, 100, 119, 96, 97, 123, 125, 124, 63, 47, 62, 41, 41, 34, 51, 36, 41, 37, 43, 36, 56, Byte.MAX_VALUE, 111, 126, 105, 105, 98, 115, 123, 101, 104, 120, 100, 53, 34, 45, 57, 37, 39, 54, 39, 36, 47, 42, 47, 50, 63, 28, 10, 28, 28, 6, 0, 1, 16, 27, 6, 2, 10, 70, 93, 90, 71, 74, 34, 36, 50, 37, 40, 54, 48, 50, 57, 35, 66, 85, 88, 68, 85, 70, 85, 89, 71, Byte.MAX_VALUE, 125, 118, 125, 106, 113, 123, 53, 46, 55, 55};
    }

    static {
        A08();
        A0A = new AtomicBoolean();
        A0B = new AtomicInteger(0);
        A05 = null;
        A06 = false;
        A09 = new C0T[]{C0T.A10, C0T.A0e, C0T.A11, C0T.A19, C0T.A0v, C0T.A0x, C0T.A1v, C0T.A1w, C0T.A1x};
    }

    public XT(C8U c8u, boolean z10, AnonymousClass66 anonymousClass66) {
        this.A01 = c8u;
        this.A02 = new AnonymousClass99(c8u);
        this.A00 = anonymousClass66;
        A09(c8u, z10);
    }

    @Nullable
    public static synchronized PackageInfo A00(C8U c8u) {
        PackageInfo packageInfo;
        synchronized (XT.class) {
            if (!A06) {
                A03 = M0.A00(c8u);
                A06 = true;
            }
            packageInfo = A03;
        }
        return packageInfo;
    }

    public static synchronized EnumC1082Lm A01(C8U c8u) {
        EnumC1082Lm enumC1082Lm;
        synchronized (XT.class) {
            if (A04 == null) {
                A04 = C1083Ln.A00(c8u.A03().A8P());
            }
            enumC1082Lm = A04;
        }
        return enumC1082Lm;
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static String A04(C8U c8u, String str) {
        try {
            PackageManager packageManager = c8u.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return C1088Lu.A03(packageManager.getApplicationInfo(str, 0).sourceDir);
        } catch (Exception e10) {
            if (A0A.compareAndSet(false, true)) {
                c8u.A06().A8y(A03(488, 7, 81), C07828z.A1P, new AnonymousClass90(e10));
            }
            return null;
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A09(final C8U c8u, boolean z10) {
        if (!A0B.compareAndSet(0, 1)) {
            return;
        }
        A01(c8u);
        try {
            final SharedPreferences A00 = C1063Kt.A00(c8u);
            final AnonymousClass99 anonymousClass99 = new AnonymousClass99(c8u);
            final String str = A03(26, 4, 37) + anonymousClass99.A06();
            A05 = A00.getString(str, null);
            FutureTask futureTask = new FutureTask(new Callable<Boolean>() { // from class: com.facebook.ads.redexgen.X.9V
                public static byte[] A04;
                public static String[] A05 = {"XdxsWQHKmAYrPa6mv803llFsbG6xUBv1", "0ZMGl2pSIAaZIEqvxPmnMQII5PMyDfzp", "xK6bN8ERsE3qlK", "WJOztIfqKvqLg1zb8DcclROO5I1m6hYl", "NZ35AS4Ok4U2uFg9Bn0RAVLmEZFAhNaA", "i6NGDYiwjEbiTB59W8H8ewYatIcL2Rm5", "tt3j", "3tQ5yRyF2hXRO3n7qZm1zDaXW"};

                public static String A01(int i10, int i11, int i12) {
                    byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
                    int i13 = 0;
                    while (true) {
                        int length = copyOfRange.length;
                        if (A05[2].length() != 14) {
                            throw new RuntimeException();
                        }
                        A05[0] = "ijq86j9eF5Bfako4vk0V9m1lrfYXSgO1";
                        if (i13 >= length) {
                            return new String(copyOfRange);
                        }
                        copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 105);
                        i13++;
                    }
                }

                public static void A02() {
                    A04 = new byte[]{124, 125, 115, 110, 125, 109, 106, 102, 100, 39, 104, 103, 109, 123, 102, 96, 109, 39, Byte.MAX_VALUE, 108, 103, 109, 96, 103, 110, 120, 104, 122, 107, 114, 78, 94, 65, 74, 78, 111, 109, 102, 109, 122, 97, 107};
                }

                static {
                    A02();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
                    if (A01(0, 1, 70).equals(android.os.Build.VERSION.CODENAME) != false) goto L15;
                 */
                @Override // java.util.concurrent.Callable
                /* renamed from: A00 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Boolean call() throws java.lang.Exception {
                    /*
                        r8 = this;
                        r7 = 0
                        int r1 = android.os.Build.VERSION.SDK_INT
                        r0 = 31
                        if (r1 >= r0) goto L17
                        java.lang.String r3 = android.os.Build.VERSION.CODENAME
                        r2 = 0
                        r1 = 1
                        r0 = 70
                        java.lang.String r0 = A01(r2, r1, r0)
                        boolean r0 = r0.equals(r3)
                        if (r0 == 0) goto L3a
                    L17:
                        com.facebook.ads.redexgen.X.8U r0 = com.facebook.ads.redexgen.X.C8U.this
                        boolean r0 = com.facebook.ads.redexgen.X.JR.A1w(r0)
                        if (r0 == 0) goto L3a
                        com.facebook.ads.redexgen.X.99 r0 = r2
                        java.lang.String r3 = r0.A0B()
                        r2 = 6
                        r1 = 19
                        r0 = 96
                        java.lang.String r0 = A01(r2, r1, r0)
                        boolean r0 = r0.equals(r3)
                        if (r0 == 0) goto L3a
                        com.facebook.ads.redexgen.X.8U r0 = com.facebook.ads.redexgen.X.C8U.this
                        java.lang.String r7 = com.facebook.ads.redexgen.X.C1088Lu.A01(r0)
                    L3a:
                        r6 = 1
                        if (r7 != 0) goto L6a
                        com.facebook.ads.redexgen.X.8U r1 = com.facebook.ads.redexgen.X.C8U.this
                        java.lang.String r0 = r1.getPackageName()
                        java.lang.String r0 = com.facebook.ads.redexgen.X.XT.A05(r1, r0)
                        com.facebook.ads.redexgen.X.XT.A06(r0)
                    L4a:
                        android.content.SharedPreferences r0 = r3
                        android.content.SharedPreferences$Editor r2 = r0.edit()
                        java.lang.String r1 = r4
                        java.lang.String r0 = com.facebook.ads.redexgen.X.XT.A02()
                        android.content.SharedPreferences$Editor r0 = r2.putString(r1, r0)
                        r0.apply()
                        java.util.concurrent.atomic.AtomicInteger r1 = com.facebook.ads.redexgen.X.XT.A07()
                        r0 = 2
                        r1.set(r0)
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
                        return r0
                    L6a:
                        com.facebook.ads.redexgen.X.8U r0 = com.facebook.ads.redexgen.X.C8U.this
                        boolean r0 = com.facebook.ads.redexgen.X.JR.A15(r0)
                        if (r0 == 0) goto Lc7
                        com.facebook.ads.redexgen.X.8U r1 = com.facebook.ads.redexgen.X.C8U.this
                        java.lang.String r0 = r1.getPackageName()
                        java.lang.String r4 = com.facebook.ads.redexgen.X.XT.A05(r1, r0)
                        r2 = 1
                        r1 = 5
                        r0 = 119(0x77, float:1.67E-43)
                        java.lang.String r0 = A01(r2, r1, r0)
                        com.facebook.ads.redexgen.X.90 r5 = new com.facebook.ads.redexgen.X.90
                        r5.<init>(r0)
                        r5.A03(r6)
                        r5.A04(r6)
                        r0 = 0
                        r5.A08(r0)
                        org.json.JSONObject r3 = new org.json.JSONObject
                        r3.<init>()
                        r2 = 25
                        r1 = 5
                        r0 = 114(0x72, float:1.6E-43)
                        java.lang.String r0 = A01(r2, r1, r0)
                        r3.put(r0, r7)
                        r2 = 30
                        r1 = 5
                        r0 = 68
                        java.lang.String r0 = A01(r2, r1, r0)
                        r3.put(r0, r4)
                        r5.A05(r3)
                        com.facebook.ads.redexgen.X.8U r0 = com.facebook.ads.redexgen.X.C8U.this
                        com.facebook.ads.redexgen.X.8y r4 = r0.A06()
                        int r3 = com.facebook.ads.redexgen.X.C07828z.A1I
                        r2 = 35
                        r1 = 7
                        r0 = 97
                        java.lang.String r0 = A01(r2, r1, r0)
                        r4.A8z(r0, r3, r5)
                    Lc7:
                        com.facebook.ads.redexgen.X.XT.A06(r7)
                        goto L4a
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C9V.call():java.lang.Boolean");
                }
            });
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z10) {
                futureTask.get();
            }
        } catch (Exception unused) {
            A0B.set(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x01b8, code lost:
        if (r3 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x01ba, code lost:
        r5.put(A03(55, 5, 70), r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x01c6, code lost:
        r5.put(A03(464, 5, 90), java.lang.String.valueOf(com.facebook.ads.redexgen.X.C1086Ls.A05(r9.A01)));
        r3 = r9.A01.A03().A6z();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x01e6, code lost:
        if (r3 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x01e8, code lost:
        r0 = A03(326, 17, 1);
        r5.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x01f4, code lost:
        r3 = java.lang.String.valueOf(r9.A02.A0C());
        r0 = A03(2, 21, 29);
        r5.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0211, code lost:
        if (r9.A02.A03() == (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0213, code lost:
        r3 = java.lang.String.valueOf(r9.A02.A03());
        r0 = A03(36, 19, 93);
        r5.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x022a, code lost:
        r3 = com.facebook.ads.redexgen.X.C9O.A05(r9.A01);
        r0 = A03(479, 9, 93);
        r5.put(r0, r3);
        r3 = com.facebook.ads.redexgen.X.C1091Lx.A01(com.facebook.ads.redexgen.X.AnonymousClass98.A02());
        r0 = A03(30, 6, 106);
        r5.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0257, code lost:
        if (com.facebook.ads.redexgen.X.JQ.A05(r9.A01) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0259, code lost:
        r3 = r9.A01.A03().A6f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0263, code lost:
        if (r3 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0265, code lost:
        r0 = A03(60, 4, 36);
        r5.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0271, code lost:
        r3 = r9.A01.A03().A72();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x027f, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0281, code lost:
        r0 = A03(355, 14, 70);
        r5.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x028e, code lost:
        r8 = r9.A01.A05().A6K();
        r4 = A03(174, 29, 98);
        r7 = A03(143, 31, 81);
        r3 = A03(120, 23, 78);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x02b6, code lost:
        if (r8 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x02b8, code lost:
        r0 = r8.A08();
        r5.put(r3, r0);
        r0 = java.lang.String.valueOf(r8.A05());
        r5.put(r7, r0);
        r0 = java.lang.String.valueOf(r8.A06());
        r5.put(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x02d5, code lost:
        r3 = com.facebook.ads.redexgen.X.C05850u.A01(r9.A01).A0K();
        r0 = A03(103, 10, 69);
        r5.put(r0, r3);
        r3 = r9.A00.A03(r9.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x02f4, code lost:
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x02fa, code lost:
        if (android.text.TextUtils.isEmpty(r3) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x02fc, code lost:
        r0 = A03(78, 19, 97);
        r5.put(r0, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0309, code lost:
        r3 = java.lang.String.valueOf(r9.A01.A02().A82());
        r0 = A03(267, 13, 94);
        r5.put(r0, r3);
        r3 = java.lang.String.valueOf(com.facebook.ads.redexgen.X.C07768t.A0H(r9.A01));
        r0 = A03(228, 13, 63);
        r5.put(r0, r3);
        r7 = new java.lang.StringBuilder();
        r4 = com.facebook.ads.redexgen.X.XT.A09;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0343, code lost:
        r0 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0345, code lost:
        if (r3 >= r0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0347, code lost:
        r0 = r4[r3].A02();
        r7.append(r0 + com.bytedance.sdk.openadsdk.TTAdSdk.INIT_LOCAL_FAIL_CODE);
        r0 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0354, code lost:
        if (r3 == (r0 - 1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0356, code lost:
        r7.append(A03(1, 1, 104));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0361, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0364, code lost:
        r0 = A03(com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource.STATUS_HTTP_DATA_ERROR, 4, 18);
        r5.put(r3, r0);
        r5.put(r7, r0);
        r5.put(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0384, code lost:
        if (r3 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0388, code lost:
        r5.put(A03(210, 18, 2), r7.toString());
        r4 = A00(r9.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x039e, code lost:
        if (r4 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x03a0, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x03a1, code lost:
        r5.put(A03(375, 20, 123), java.lang.String.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x03b2, code lost:
        if (r4 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x03b4, code lost:
        r5.put(A03(395, 18, 123), java.lang.String.valueOf(r4.versionCode));
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03c7, code lost:
        return r5;
     */
    @Override // com.facebook.ads.redexgen.X.C9T
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.String> A6W() {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XT.A6W():java.util.Map");
    }

    @Override // com.facebook.ads.redexgen.X.C9T
    public final String A7Y() {
        return A7Z(C9S.A00());
    }

    @Override // com.facebook.ads.redexgen.X.C9T
    public final String A7Z(C9R c9r) {
        A09(this.A01, true);
        ByteArrayOutputStream byteArrayOutputStream = null;
        Base64OutputStream base64OutputStream = null;
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
                deflaterOutputStream = new DeflaterOutputStream(base64OutputStream);
                Map<String, String> A6W = A6W();
                if (TextUtils.isEmpty(C07105s.A00().A03())) {
                    C07105s.A07(this.A01);
                }
                A6W.put(A03(c.COLLECT_MODE_ML_TEEN, 4, 52), C07105s.A00().A03());
                A6W.put(A03(469, 10, 62), C9Y.A06(this.A02, this.A01, false));
                if (JR.A1K(this.A01)) {
                    A6W.put(A03(103, 10, 69), C05850u.A01(this.A01).A0K());
                }
                Iterator<Map.Entry<String, String>> it = A6W.entrySet().iterator();
                while (it.hasNext()) {
                    if (!c9r.A2N(it.next().getKey())) {
                        it.remove();
                    }
                }
                deflaterOutputStream.write(new JSONObject(A6W).toString().getBytes());
                deflaterOutputStream.close();
                String replaceAll = byteArrayOutputStream.toString().replaceAll(A03(0, 1, 107), A03(0, 0, 37));
                try {
                    deflaterOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                return replaceAll;
            } catch (IOException e10) {
                throw new RuntimeException(A03(241, 26, 17), e10);
            }
        } catch (Throwable th) {
            if (deflaterOutputStream != null) {
                try {
                    deflaterOutputStream.close();
                } catch (IOException unused2) {
                    throw th;
                }
            }
            if (base64OutputStream != null) {
                base64OutputStream.close();
            }
            if (byteArrayOutputStream != null) {
                byteArrayOutputStream.close();
            }
            throw th;
        }
    }
}
