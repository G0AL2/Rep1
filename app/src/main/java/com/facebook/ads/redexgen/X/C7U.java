package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.7U  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7U {
    public static AnonymousClass00 A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"8gkZjHnxCvZyg7TzwjjGeSdvls9L7Gam", "fcbSC3ja3K2jNylkxCBC51G6bXitMdQ0", "2foOCT", "ocB0m3", "KfMQJM794wt5IuG", "feDb68pnVWWOEqV45c", "KnEa0S3Tnigt4irEXno07XBXpnYxFsFq", "aK1UKkDbG3zR1xh0x3umKxUvmkPLseuR"};
    public static final String A0E;
    public static final Map<String, AnonymousClass06> A0F;
    public static final Map<String, C7W> A0G;
    public long A00;
    public C1036Jp A01;
    public final C7V A03;
    public final C8U A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 10);
        }
        return new String(copyOfRange);
    }

    public static void A0F() {
        A0C = new byte[]{124, Byte.MIN_VALUE, -83, 122, -125, -85, 122, -80, 108, -105, 108, 103, 108, 106, 106, 108, 85, 84, -126, 78, Byte.MAX_VALUE, 85, 81, -119, -89, -87, -82, -85, 102, -71, -70, -89, -72, -70, -85, -86, 116, -113, -83, -81, -76, -75, -70, -77, 108, -81, -69, -71, -68, -72, -79, -64, -79, Byte.MAX_VALUE, -99, -97, -92, -91, -86, -93, 92, -94, -99, -91, -88, -95, -96, 100, -126, -124, -119, -118, -113, -120, 65, -108, -107, -126, -109, -107, -122, -123, 79, 79, 79, -116, -65, -86, -84, -73, -69, -80, -74, -75, 103, -66, -81, -80, -77, -84, 103, -84, -65, -84, -86, -68, -69, -80, -75, -82, 103, -86, -88, -86, -81, -84, 103, -85, -74, -66, -75, -77, -74, -88, -85, -70, 117, -79, -81, -79, -74, -77, -111, -67, -69, -66, -70, -77, -62, -73, -67, -68, -106, -67, -67, -71, 120, 118, 120, 125, 122, 91, 118, 126, -127, -118, -121, 122, 93, -124, -124, Byte.MIN_VALUE, -120, -101, -120, -122, -104, -105, -120, -24, -21, -35, -32, -27, -24, -38, -35, -40, -19, -30, -26, -34, -40, -26, -20, -96, -107, -100, -92};
    }

    static {
        A0F();
        A0E = C7U.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
        A0G = Collections.synchronizedMap(new HashMap());
    }

    public C7U(C8U c8u) {
        this.A04 = c8u;
        this.A03 = C7V.A06(c8u.A00());
        this.A08 = JR.A1y(c8u);
        this.A09 = JR.A26(c8u, C1204Qg.A03());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.07] */
    public static synchronized AnonymousClass00 A03(C1399Xx c1399Xx) {
        AnonymousClass00 anonymousClass00;
        synchronized (C7U.class) {
            if (A0A == null) {
                A0A = AnonymousClass01.A00(c1399Xx, new Object() { // from class: com.facebook.ads.redexgen.X.07
                    public int A00;
                    public int A01;
                    public boolean A02;
                    public boolean A03;
                    public boolean A04;

                    public final AnonymousClass07 A00(int i10) {
                        this.A00 = i10;
                        return this;
                    }

                    public final AnonymousClass07 A01(int i10) {
                        this.A01 = i10;
                        return this;
                    }

                    public final AnonymousClass07 A02(boolean z10) {
                        this.A02 = z10;
                        return this;
                    }

                    public final AnonymousClass07 A03(boolean z10) {
                        this.A03 = z10;
                        return this;
                    }

                    public final AnonymousClass07 A04(boolean z10) {
                        this.A04 = z10;
                        return this;
                    }

                    public final AnonymousClass08 A05() {
                        return new AnonymousClass08(this.A00, this.A02, this.A01, this.A03, this.A04);
                    }
                }.A00(JR.A04(c1399Xx)).A02(c1399Xx.A03().A8P()).A01(-1).A03(JR.A0j(c1399Xx)).A04(JR.A25(c1399Xx)).A05(), A05(c1399Xx));
            }
            anonymousClass00 = A0A;
        }
        return anonymousClass00;
    }

    public static AnonymousClass06 A04(C8U c8u, String str) {
        AnonymousClass06 anonymousClass06 = A0F.get(str);
        if (C7X.A06(c8u) && anonymousClass06 != null) {
            return new AnonymousClass06(anonymousClass06);
        }
        return new AnonymousClass06(str);
    }

    public static C0L A05(C1399Xx c1399Xx) {
        return new Y1(c1399Xx);
    }

    public static synchronized List<String> A09(C8U c8u) {
        List<String> list;
        synchronized (C7U.class) {
            if (A0B == null) {
                A0B = new ArrayList();
                A0J(A0B, c8u);
            }
            list = A0B;
        }
        return list;
    }

    public static AtomicBoolean A0D(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList<Future> arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0D;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "";
            if (!hasNext) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                try {
                    for (Future future : arrayList2) {
                        Boolean bool = (Boolean) future.get();
                        atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
                    }
                } catch (InterruptedException | ExecutionException e10) {
                    Log.e(A0E, A08(85, 42, 61), e10);
                    atomicBoolean.set(false);
                }
                return atomicBoolean;
            }
            arrayList2.add(MX.A02().submit(it.next()));
        }
    }

    public static void A0H(C8U c8u, String str) {
        C7W c7w;
        if (C7X.A06(c8u) && !TextUtils.isEmpty(str) && (c7w = A0G.get(str)) != null) {
            c7w.A00 = A08(185, 4, 35);
            C1399Xx A00 = c8u.A00();
            C1208Qk A05 = C1208Qk.A05(A00);
            String cacheKey = C1208Qk.A08(A00, C1070La.A00(str));
            if (cacheKey == null) {
                cacheKey = str;
            }
            C7X.A04(c8u, c7w, A05.A0H(cacheKey));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(EnumC1035Jo enumC1035Jo) {
        if (this.A01 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A08(173, 12, 111), MJ.A04(this.A00));
        this.A01.A02(enumC1035Jo, hashMap);
    }

    public static void A0J(List<String> list, C8U c8u) {
        A0K(list, C1697e2.A01(c8u));
        A0K(list, C7V.A07(c8u));
    }

    public static void A0K(List<String> list, File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        String[] strArr = A0D;
        if (strArr[3].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[3] = "Vghlgc";
        strArr2[2] = "qwUey9";
        if (path != A08(0, 0, 127)) {
            list.add(path.toLowerCase(Locale.getDefault()));
        }
    }

    @Nullable
    public final Bitmap A0M(String str) {
        return this.A07.get(str);
    }

    @Nullable
    public final Bitmap A0N(String str, int i10, int i11) {
        if (this.A08) {
            AnonymousClass06 A04 = A04(this.A04, str);
            A04.A03 = A08(185, 4, 35);
            A04.A01 = i11;
            A04.A00 = i10;
            return A03(this.A04.A00()).AE6(A04, true).A00();
        }
        return this.A03.A0E(this.A04, str, i10, i11, A08(169, 4, 114));
    }

    @Nullable
    public final File A0O(String str) {
        AnonymousClass06 A04 = A04(this.A04, str);
        A04.A03 = A08(185, 4, 35);
        return A03(this.A04.A00()).AE7(A04);
    }

    @Nullable
    public final File A0P(String str) {
        if (this.A08) {
            return A0O(str);
        }
        return this.A03.A0F(str);
    }

    public final String A0Q(String str) {
        if (this.A08) {
            return A0R(str);
        }
        return this.A03.A0G(str);
    }

    public final String A0R(String cachedUrl) {
        AnonymousClass06 A04 = A04(this.A04, cachedUrl);
        A04.A03 = A08(185, 4, 35);
        String AE9 = A03(this.A04.A00()).AE9(A04);
        return AE9 != null ? AE9 : cachedUrl;
    }

    public final String A0S(String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0R(str);
    }

    public final void A0T() {
        KV.A05(A08(127, 19, 68), A08(37, 16, 66), A08(0, 8, 64));
    }

    public final void A0U() {
        KV.A05(A08(146, 16, 11), A08(53, 14, 50), A08(16, 7, 19));
    }

    public final void A0V() {
        this.A07.clear();
    }

    public final void A0W(@Nullable C7M c7m, C7N c7n) {
        KV.A05(A08(162, 7, 25), A08(67, 18, 23), A08(8, 8, 44));
        this.A00 = System.currentTimeMillis();
        C7X.A02(this.A04, c7n, C7X.A07, A08(23, 14, 60), -1L);
        MX.A03().execute(new Y2(this, new ArrayList(this.A05), c7m, c7n, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0X(C7Q c7q) {
        this.A05.add(new C7R(this, c7q));
    }

    public final void A0Y(C7Q c7q) {
        c7q.A05 = true;
        this.A06.add(new C7R(this, c7q));
    }

    public final void A0Z(C7Q c7q) {
        c7q.A05 = true;
        if (this.A09) {
            this.A06.add(new C7P(this, c7q));
        } else {
            this.A06.add(new C7R(this, c7q));
        }
    }

    public final void A0a(C7Q c7q) {
        if (this.A09) {
            this.A05.add(new C7P(this, c7q));
        } else {
            this.A05.add(new C7R(this, c7q));
        }
    }

    public final void A0b(final C7S c7s) {
        Callable<Boolean> callable = new Callable<Boolean>(c7s) { // from class: com.facebook.ads.redexgen.X.7T
            public static byte[] A02;
            public static String[] A03 = {"jwTNBF52XqMGgcVEiQTwvXvSBsl43Bcu", "zl9XISU", "9LwyCiCzMXmNgkxTRjX8XUqiNT4UlidW", "Jar4Zz8ck96tLH67JFbLbWmYESMeU49V", "Yd8bjyjazIom6Oxe2tnjIAJyfdSlHwWG", "VgUZ5KaBAYbzt3oMIew8EQ4BA2c", "hXTgBapwd4emagenALPcDOSBW5zmdf3H", "17k"};
            public final C7S A00;

            public static String A01(int i10, int i11, int i12) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
                int i13 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    if (A03[1].length() == 32) {
                        throw new RuntimeException();
                    }
                    A03[3] = "";
                    if (i13 >= length) {
                        return new String(copyOfRange);
                    }
                    copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
                    i13++;
                }
            }

            public static void A02() {
                A02 = new byte[]{-20, -16, -28, -22, -24};
            }

            static {
                A02();
            }

            {
                this.A00 = c7s;
            }

            private final Boolean A00() {
                C8U c8u;
                boolean z10;
                C8U c8u2;
                AnonymousClass00 A032;
                boolean z11;
                boolean z12;
                C7V c7v;
                Map map;
                if (L0.A02(this)) {
                    return null;
                }
                try {
                    TrafficStats.setThreadStatsTag(61453);
                    AnonymousClass06 anonymousClass06 = new AnonymousClass06(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, 83), this.A00.A01, this.A00.A02);
                    anonymousClass06.A01 = this.A00.A04;
                    anonymousClass06.A00 = this.A00.A03;
                    c8u = C7U.this.A04;
                    if (C7X.A06(c8u)) {
                        map = C7U.A0F;
                        map.put(this.A00.A07, anonymousClass06);
                    }
                    z10 = C7U.this.A08;
                    boolean z13 = false;
                    if (A03[3].length() != 5) {
                        A03[4] = "CZcPy1KhLDdCOlGcBT5xxsnRB32IUDMD";
                        if (!z10) {
                            c7v = C7U.this.A03;
                            if (c7v.A0D(this.A00) != null) {
                                z13 = true;
                            }
                        } else {
                            c8u2 = C7U.this.A04;
                            A032 = C7U.A03(c8u2.A00());
                            z13 = A032.AE6(anonymousClass06, false).A01();
                        }
                        C7Z c7z = this.A00.A00;
                        if (c7z != null && c7z.A02()) {
                            int A00 = c7z.A00();
                            int A01 = c7z.A01();
                            if (A00 <= 0 || A01 <= 0) {
                                z11 = C7U.this.A08;
                                if (z11) {
                                    A04(this.A00.A07, anonymousClass06);
                                } else {
                                    int i10 = this.A00.A03;
                                    int width = this.A00.A04;
                                    A03(i10, width);
                                }
                            } else {
                                z12 = C7U.this.A08;
                                if (z12) {
                                    anonymousClass06.A00 = A00;
                                    anonymousClass06.A01 = A01;
                                    A04(this.A00.A07, anonymousClass06);
                                } else {
                                    A03(A00, A01);
                                }
                            }
                        }
                        return Boolean.valueOf(z13);
                    }
                    throw new RuntimeException();
                } catch (Throwable th) {
                    L0.A00(th, this);
                    return null;
                }
            }

            private void A03(int i10, int i11) {
                C7V c7v;
                C8U c8u;
                Map map;
                c7v = C7U.this.A03;
                c8u = C7U.this.A04;
                Bitmap A0E2 = c7v.A0E(c8u, this.A00.A07, i10, i11, this.A00.A01);
                if (A0E2 == null) {
                    return;
                }
                map = C7U.this.A07;
                map.put(this.A00.A07, A0E2);
            }

            private void A04(String str, AnonymousClass06 anonymousClass06) {
                C8U c8u;
                AnonymousClass00 A032;
                Map map;
                c8u = C7U.this.A04;
                A032 = C7U.A03(c8u.A00());
                Bitmap A00 = A032.AE6(anonymousClass06, true).A00();
                if (A00 == null) {
                    return;
                }
                map = C7U.this.A07;
                map.put(str, A00);
            }

            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
                if (L0.A02(this)) {
                    return null;
                }
                try {
                    return A00();
                } catch (Throwable th) {
                    L0.A00(th, this);
                    return null;
                }
            }
        };
        if (!c7s.A02) {
            this.A05.add(callable);
        } else {
            this.A06.add(callable);
        }
    }

    public final void A0c(C7S c7s) {
        c7s.A02 = true;
        A0b(c7s);
    }

    public final void A0d(C1036Jp c1036Jp) {
        this.A01 = c1036Jp;
    }
}
