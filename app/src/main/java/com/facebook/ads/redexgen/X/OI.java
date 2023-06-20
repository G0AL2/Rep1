package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class OI implements MB<Bundle> {
    public static byte[] A0D;
    public static String[] A0E = {"nkjKj1MvUJoP2SJPYcgbaBjYPy4EsWOF", "UEaFlSlVJfgDxU2HAGuUlGjRHCZL3UC5", "HKOtxcgqDUvcB7Zt0rEFxuoEqCvYEtNO", "rowCAjgGiKT2zEBSq3xmGSL0Kf3UrlyG", "EJAz0i2eNdRPLBpGYGjYpv17GQTuD6uU", "hVbT72qq2pp8XHiEw", "RwROuq5e2nKVw7hJaeybV0hHAIDx5UQQ", "neuOh54FNoDLqHEFUxNtW4G7fWRiy4GW"};
    public int A00;
    public int A01;
    @Nullable
    public String A02;
    public boolean A03;
    public final C1608cZ A04;
    public final C1400Xy A05;
    public final InterfaceC1028Jh A06;
    public final InterfaceC1197Pz A07;
    public final Q4 A08;
    public final Q5 A09;
    public final Object A0A;
    public final String A0B;
    @Nullable
    public final Map<String, String> A0C;

    public static String A0G(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 48);
        }
        return new String(copyOfRange);
    }

    public static void A0O() {
        A0D = new byte[]{11, 13, 30, 19, 25, 24, -82, -79, -98, -62, -82, -71, -74, -63, -58, -102, -82, -69, -82, -76, -78, -65, -18, 1, -10, -6, -14, -20, -6, 0, -96, -77, -86, -85, -89, -100, -76, -96, -83, -56, -67, -49, -48, -98, -53, -47, -54, -64, -67, -50, -43, -80, -59, -55, -63, -87, -81, -98, -109, -91, -90, -126, -92, -95, -103, -92, -105, -91, -91, -122, -101, -97, -105, Byte.MAX_VALUE, -123, -21, -31, -33, -14, -35, -21, -15, -23, -33, -14, -16, -37, -23, -17, 20, 12, -33, -37, -45, -43, -56, -45, 26, 30, 13, 17, 6, 10, 2, 27, 34, -87, -98, -94, -102, 37, 27, 16, -16, -26, -25, 19, 9, 10, -2, 21, -64, -70, -78, 10, 4, 11, 5, 3, -8, -4, -12, -18, -4, 2, -64, -63, -87, -68, -67, -72, 0, 1, -21, -9, -8, -18, 5, 6, -4, -16, 7, -73, -87, -82, -92, -81, -73};
    }

    static {
        A0O();
    }

    public OI(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, InterfaceC1197Pz interfaceC1197Pz, List<C2A> list, String str, boolean z10, @Nullable Bundle bundle, Q4 q42) {
        this(c1400Xy, interfaceC1028Jh, interfaceC1197Pz, list, str, z10, bundle, null, q42);
    }

    public OI(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, InterfaceC1197Pz interfaceC1197Pz, List<C2A> list, String str, boolean z10, @Nullable Bundle bundle, @Nullable Map<String, String> map, Q4 q42) {
        this.A0A = new Object();
        this.A01 = 0;
        this.A00 = 0;
        this.A02 = null;
        this.A05 = c1400Xy;
        this.A06 = interfaceC1028Jh;
        this.A07 = interfaceC1197Pz;
        this.A0B = str;
        this.A0C = map;
        this.A03 = z10;
        this.A08 = q42;
        list.add(new C1147Ob(this, 0.5d, -1.0d, 2.0d, true));
        list.add(new C1146Oa(this, 1.0E-7d, -1.0d, 0.001d, false));
        if (bundle != null) {
            this.A04 = new C1608cZ(list, bundle.getBundle(A0G(6, 16, 29)), this.A08);
            this.A01 = bundle.getInt(A0G(57, 18, 2));
            this.A00 = bundle.getInt(A0G(39, 18, 44));
        } else {
            this.A04 = new C1608cZ(list, this.A08);
        }
        this.A09 = new Q5(new Handler(), this);
    }

    public OI(C1400Xy c1400Xy, InterfaceC1028Jh interfaceC1028Jh, InterfaceC1197Pz interfaceC1197Pz, List<C2A> list, String str, boolean z10, Q4 q42) {
        this(c1400Xy, interfaceC1028Jh, interfaceC1197Pz, list, str, z10, null, q42);
    }

    private final float A0E() {
        return MP.A00(this.A05) * this.A07.getVolume();
    }

    private Map<String, String> A0I(int i10) {
        HashMap<String, String> hashMap = new HashMap<>();
        MP.A03(hashMap, this.A07.getVideoStartReason() == Q6.A02, !this.A07.A8W());
        A0S(hashMap);
        A0R(hashMap);
        A0U(hashMap, i10);
        A0T(hashMap);
        A0Q(hashMap);
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A0J(Q0 q02) {
        return A0K(q02, this.A07.getCurrentPositionInMillis());
    }

    private Map<String, String> A0K(Q0 q02, int i10) {
        Map<String, String> A0I = A0I(i10);
        A0I.put(A0G(0, 6, 122), String.valueOf(q02.A00));
        return A0I;
    }

    private void A0M() {
        this.A06.A9R(this.A0B, A0J(Q0.A04));
    }

    private void A0N() {
        this.A06.A9R(this.A0B, A0J(Q0.A0A));
    }

    private final void A0P(int i10, boolean z10, boolean z11) {
        int i11;
        if (i10 <= 0.0d || i10 < (i11 = this.A01)) {
            return;
        }
        if (i10 > i11) {
            this.A04.A06((i10 - i11) / 1000.0f, A0E());
            this.A01 = i10;
            if (z11 || i10 - this.A00 >= 5000) {
                InterfaceC1028Jh interfaceC1028Jh = this.A06;
                String str = this.A0B;
                Map<String, String> A0K = A0K(Q0.A09, i10);
                if (A0E[5].length() == 0) {
                    throw new RuntimeException();
                }
                String[] strArr = A0E;
                strArr[1] = "IXDsMs8MiMzYVjpFmNZXbOdNx8hS7U1p";
                strArr[6] = "KaqaEYbZ8TBX2kyM8fVmd1OK78kemUif";
                interfaceC1028Jh.A9R(str, A0K);
                this.A00 = this.A01;
                this.A04.A05();
                return;
            }
        }
        if (z10) {
            this.A06.A9R(this.A0B, A0K(Q0.A09, i10));
        }
    }

    private void A0Q(HashMap<String, String> hashMap) {
        Map<String, String> map = this.A0C;
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    private void A0R(Map<String, String> map) {
        C2C A03 = this.A04.A03();
        C2B A00 = A03.A00();
        map.put(A0G(141, 3, 90), String.valueOf(A00.A00()));
        map.put(A0G(144, 3, 81), String.valueOf(A00.A05()));
        map.put(A0G(147, 5, 95), String.valueOf(A00.A02()));
        map.put(A0G(127, 8, 95), String.valueOf(A00.A01() * 1000.0d));
        map.put(A0G(82, 7, 76), String.valueOf(A00.A03() * 1000.0d));
        String str = this.A02;
        if (str != null) {
            map.put(A0G(135, 6, 26), str);
        }
        C2B A01 = A03.A01();
        map.put(A0G(110, 3, 127), String.valueOf(A01.A00()));
        map.put(A0G(113, 3, 74), String.valueOf(A01.A05()));
        map.put(A0G(116, 5, 109), String.valueOf(A01.A02()));
        map.put(A0G(22, 8, 93), String.valueOf(A01.A01() * 1000.0d));
        map.put(A0G(75, 7, 78), String.valueOf(A01.A03() * 1000.0d));
    }

    private void A0S(Map<String, String> map) {
        map.put(A0G(30, 9, 11), String.valueOf(this.A07.A8T()));
        map.put(A0G(93, 4, 51), Long.toString(this.A07.getInitialBufferTime()));
    }

    private void A0T(Map<String, String> map) {
        Rect rect = new Rect();
        this.A07.getGlobalVisibleRect(rect);
        map.put(A0G(97, 2, 122), String.valueOf(rect.top));
        map.put(A0G(91, 2, 63), String.valueOf(rect.left));
        map.put(A0G(89, 2, 116), String.valueOf(this.A07.getMeasuredHeight()));
        map.put(A0G(104, 2, 123), String.valueOf(this.A07.getMeasuredWidth()));
        DisplayMetrics metrics = new DisplayMetrics();
        ((WindowManager) this.A05.getSystemService(A0G(152, 6, 16))).getDefaultDisplay().getMetrics(metrics);
        map.put(A0G(121, 3, 26), String.valueOf(metrics.heightPixels));
        map.put(A0G(124, 3, 100), String.valueOf(metrics.widthPixels));
    }

    private void A0U(Map<String, String> map, int i10) {
        map.put(A0G(99, 5, 109), String.valueOf(this.A00 / 1000.0f));
        map.put(A0G(106, 4, 5), String.valueOf(i10 / 1000.0f));
    }

    public final int A0V() {
        return this.A01;
    }

    public final Bundle A0W() {
        A0f(A0V(), A0V());
        Bundle bundle = new Bundle();
        bundle.putInt(A0G(57, 18, 2), this.A01);
        bundle.putInt(A0G(39, 18, 44), this.A00);
        bundle.putBundle(A0G(6, 16, 29), this.A04.A02());
        return bundle;
    }

    public final void A0X() {
        this.A06.A9R(this.A0B, A0J(Q0.A07));
    }

    public final void A0Y() {
        this.A06.A9R(this.A0B, A0J(Q0.A08));
    }

    public final void A0Z() {
        if (A0E() < 0.05d) {
            synchronized (this.A0A) {
                if (this.A03) {
                    A0M();
                    this.A03 = false;
                }
            }
            return;
        }
        synchronized (this.A0A) {
            if (!this.A03) {
                A0N();
                this.A03 = true;
            }
        }
    }

    public final void A0a() {
        this.A05.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this.A09);
    }

    public final void A0b() {
        this.A05.getContentResolver().unregisterContentObserver(this.A09);
    }

    public final void A0c(int i10) {
        this.A04.A04();
        this.A06.A9R(this.A0B, A0J(Q0.A05));
        A0P(i10, false, ((double) i10) < 2000.0d);
    }

    public final void A0d(int i10) {
        A0P(i10, true, false);
        this.A00 = 0;
        this.A01 = 0;
        this.A04.A05();
        this.A04.A04();
    }

    public final void A0e(int i10) {
        A0P(i10, false, false);
    }

    public final void A0f(int i10, int i11) {
        A0P(i10, true, false);
        this.A00 = i11;
        this.A01 = i11;
        this.A04.A05();
        this.A04.A04();
    }
}
