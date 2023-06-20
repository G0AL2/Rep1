package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.facebook.ads.redexgen.X.Pl */
/* loaded from: assets/audience_network.dex */
public final class C1183Pl extends FrameLayout {
    public static byte[] A0C;
    public static String[] A0D = {"2LrpfYyae0azpeRldXrTpIs5j5WolZYJ", "aTWFoH17M5HvBaS06GyoTMgY8LK09kB1", "ZT9jJV1ne", "vwbwskwEgIVHj6V8wHV", "a8UIfMhCahgZVDol7QIaAFMNjSR7v8Rm", "pauq9xVSe1TSbn6Nh8iDWIypG", "tig0s2h3zWgeN1kA13N6tuAlrnUP1dby", "gu60Pcp0oAdbO9RcUpkXMIBgrMh0CW0V"};
    public static final float A0E;
    public static final RelativeLayout.LayoutParams A0F;
    public int A00;
    public long A01;
    public Map<String, String> A02;
    public final AnonymousClass18 A03;
    public final C1W A04;
    public final C1400Xy A05;
    public final InterfaceC1028Jh A06;
    public final O9 A07;
    public final T5 A08;
    public final InterfaceC1181Pj A09;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] ^ i12;
            if (A0D[5].length() != 25) {
                throw new RuntimeException();
            }
            A0D[4] = "2xsSJQdmJTzWNKbVkLPVv70adF3crTtp";
            copyOfRange[i13] = (byte) (i14 ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0C = new byte[]{11, 47, 29, 33, 44, 52, 44, 47, 33, 40, 12, 41, 52, 5, 22, 23, 13, 10, 3, 68, 1, 22, 22, 11, 22, 52, 8, 5, 29, 5, 6, 8, 1, 68, 0, 11, 39, 16, 5, 39, 8, 13, 7, 15, 68, 16, 22, 13, 3, 3, 1, 22, 1, 0, 68, 19, 13, 16, 12, 68, 20, 22, 1, 73, 1, 18, 1, 10, 16, 68, 7, 8, 13, 7, 15, 23, 68, 7, 11, 17, 10, 16, 68, 5, 10, 0, 68, 32, 1, 8, 5, 29, 106, 86, 91, 67, 91, 88, 86, 95, 123, 94, 73, 108, 83, 95, 77, 102, 97, 99, 109, 106, 36, 104, 107, 101, 96, 109, 106, 99, 36, 118, 97, 105, 107, 112, 97, 36, 116, 104, 101, 125, 101, 102, 104, 97, 61, 50, 55, 61, 53, 45, 112, 113, 120, 117, 109, 93, 65, 76, 84, 76, 79, 65, 72, 55, 43, 38, 62, 38, 37, 43, 34, 24, 53, 34, 42, 40, 51, 34, 21, 2, 10, 8, 19, 2, 56, 20, 2, 20, 20, 14, 8, 9, 56, 14, 3, 20, 15, 11, 5, 14, 107, 121, 126, 67, 106, 117, 121, 107};
    }

    static {
        A09();
        A0E = (int) (Lr.A00 * 4.0f);
        A0F = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C1183Pl(C1400Xy c1400Xy, AnonymousClass18 anonymousClass18, C1W c1w, InterfaceC1028Jh interfaceC1028Jh, InterfaceC1181Pj interfaceC1181Pj, Map<String, String> map) {
        super(c1400Xy);
        this.A0A = new AtomicBoolean(false);
        this.A0B = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A00 = 0;
        this.A07 = new T8() { // from class: com.facebook.ads.redexgen.X.8J
            @Override // com.facebook.ads.redexgen.X.O9
            public final void AA3() {
            }

            @Override // com.facebook.ads.redexgen.X.T8, com.facebook.ads.redexgen.X.O9
            public final void AAn(int i10, @Nullable String str) {
                C1183Pl.A07(C1183Pl.this).set(true);
                C1183Pl.A05(C1183Pl.this).ABK();
            }

            @Override // com.facebook.ads.redexgen.X.T8, com.facebook.ads.redexgen.X.O9
            public final void AAz() {
                if (!C1183Pl.A07(C1183Pl.this).get() && C1183Pl.A08(C1183Pl.this).compareAndSet(false, true)) {
                    C1183Pl.A05(C1183Pl.this).AAz();
                }
            }

            @Override // com.facebook.ads.redexgen.X.O9
            public final void ACu() {
                C1183Pl.A05(C1183Pl.this).ACu();
            }
        };
        this.A05 = c1400Xy;
        this.A03 = anonymousClass18;
        this.A04 = c1w;
        this.A06 = interfaceC1028Jh;
        this.A09 = interfaceC1181Pj;
        this.A02 = map;
        this.A08 = A04();
        if (JR.A1I(this.A05)) {
            this.A05.A09().AFP(this.A08, this.A03.A0U(), false);
        }
        addView(this.A08, A0F);
    }

    public static /* synthetic */ int A00(C1183Pl c1183Pl) {
        int i10 = c1183Pl.A00;
        c1183Pl.A00 = i10 + 1;
        return i10;
    }

    @SuppressLint({"AddJavascriptInterface", "ClickableViewAccessibility"})
    private T5 A04() {
        T5 t52 = new T5(this.A05, new WeakReference(this.A07), 10, JR.A1P(this.A05));
        t52.setCornerRadius(A0E);
        t52.setLogMultipleImpressions(false);
        t52.setCheckAssetsByJavascriptBridge(false);
        t52.setWebViewTimeoutInMillis(this.A04.A08());
        t52.setRequestId(this.A03.A0Z());
        t52.setOnTouchListener(new View$OnTouchListenerC1182Pk(this));
        WebSettings settings = t52.getSettings();
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(true);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(true);
        }
        if (Build.VERSION.SDK_INT > 16) {
            t52.addJavascriptInterface(new C1184Pm(this.A05, this, this.A06, this.A02, this.A03.A0U()), A06(0, 12, 104));
        }
        return t52;
    }

    public static /* synthetic */ InterfaceC1181Pj A05(C1183Pl c1183Pl) {
        return c1183Pl.A09;
    }

    public static /* synthetic */ AtomicBoolean A07(C1183Pl c1183Pl) {
        return c1183Pl.A0B;
    }

    public static /* synthetic */ AtomicBoolean A08(C1183Pl c1183Pl) {
        return c1183Pl.A0A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b8, code lost:
        if (r3 <= com.facebook.ads.redexgen.X.JR.A0F(r8)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ba, code lost:
        r3 = r9.A09;
        r2 = com.facebook.ads.redexgen.X.C1183Pl.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
        if (r2[0].charAt(14) == r2[7].charAt(14)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
        r3.AAQ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d4, code lost:
        r2 = com.facebook.ads.redexgen.X.C1183Pl.A0D;
        r2[0] = "1qrV4xG42mjJ5wR1PYF4mguO0xYm8sMw";
        r2[7] = "To2gWJFbGkwQ4PRGYAw3BZd3UXo54AHv";
        r3.AAQ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
        if (r3 <= com.facebook.ads.redexgen.X.JR.A0F(r8)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f5, code lost:
        r6.A03(0);
        r9.A05.A06().A8y(r5, com.facebook.ads.redexgen.X.C07828z.A2D, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0A() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1183Pl.A0A():void");
    }

    public final void A0B() {
        String A0E2;
        if (this.A04.A0J()) {
            AnonymousClass90 anonymousClass90 = new AnonymousClass90(A06(107, 29, 33));
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A06(170, 17, 66), this.A04.A0F());
                jSONObject.put(A06(187, 5, 69), this.A03.A0U());
            } catch (JSONException e10) {
                Log.e(A06(92, 15, 31), A06(12, 13, 65), e10);
            }
            anonymousClass90.A05(jSONObject);
            anonymousClass90.A03(1);
            InterfaceC07818y A06 = this.A05.A06();
            if (A0D[4].charAt(0) == 'P') {
                throw new RuntimeException();
            }
            A0D[1] = "TEDpWyR4sKSlO4xRZxixfnQAFgDgpHMF";
            int i10 = C07828z.A2F;
            String A062 = A06(155, 15, 98);
            A06.A8z(A062, i10, anonymousClass90);
            if (JR.A0l(this.A05) && MH.A00(this.A05) == MG.A07) {
                this.A05.A06().A8z(A062, C07828z.A2E, anonymousClass90);
                this.A07.AAn(0, null);
                return;
            }
        }
        try {
            T5 t52 = this.A08;
            if (!TextUtils.isEmpty(this.A04.A0B())) {
                A0E2 = this.A04.A0B();
            } else {
                A0E2 = this.A04.A0E();
            }
            t52.loadUrl(A0E2);
        } catch (Exception e11) {
            this.A05.A06().A8y(A06(DownloadResource.STATUS_RUNNING, 8, 57), C07828z.A2c, new AnonymousClass90(e11));
        }
    }

    public final void A0C() {
        if (JR.A1I(this.A05)) {
            C1400Xy c1400Xy = this.A05;
            if (A0D[2].length() == 31) {
                throw new RuntimeException();
            }
            A0D[1] = "2a9geg5CZy9bcTekyOeVTlcxLNQduX9G";
            c1400Xy.A09().AFF(this.A08);
        }
        this.A08.removeJavascriptInterface(A06(0, 12, 104));
        if (A0D[3].length() != 23) {
            A0D[6] = "33aduEcFLWt6pdjLdZ5sJJvVvr5WDkst";
            this.A08.destroy();
            return;
        }
        this.A08.destroy();
    }

    public MK getTouchDataRecorder() {
        return this.A08.getTouchDataRecorder();
    }

    @Nullable
    public C1220Qw getViewabilityChecker() {
        return this.A08.getViewabilityChecker();
    }
}
