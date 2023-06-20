package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public class O8 {
    public static String[] A07 = {"FOFLIt4izaDLaQDOMIXk8qYNT283z5pM", "oiToeohcscvINDKXEsytRf9HFldaqPXB", "4ipPd9h88IiL3d99rWL92oIsRR1k6HBA", "hPx", "0GhefH5NzI2ypbPnqUG75Cq8VmhNX1", "2b6", "snO0JYp8WiAdMwbOevXppfTs6iFhTSIS", "awSLBYFe7Md8cHgboMT9P3Pgh1wlsZGE"};
    public final String A00 = O8.class.getSimpleName();
    public final WeakReference<AtomicBoolean> A01;
    public final WeakReference<AtomicBoolean> A02;
    public final WeakReference<C0R> A03;
    public final WeakReference<O9> A04;
    public final WeakReference<C1220Qw> A05;
    public final WeakReference<T5> A06;

    public O8(T5 t52, O9 o92, C1220Qw c1220Qw, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, C1400Xy c1400Xy) {
        this.A06 = new WeakReference<>(t52);
        this.A04 = new WeakReference<>(o92);
        this.A05 = new WeakReference<>(c1220Qw);
        this.A01 = new WeakReference<>(atomicBoolean);
        this.A02 = new WeakReference<>(atomicBoolean2);
        this.A03 = new WeakReference<>(c1400Xy.A0D());
    }

    private C0R A00() {
        C0R c0r = this.A03.get();
        if (c0r == null) {
            return new C1685dq();
        }
        return c0r;
    }

    @JavascriptInterface
    public void alert(String str) {
        Log.e(this.A00, str);
    }

    @JavascriptInterface
    public String getAnalogInfo() {
        return C1091Lx.A01(AnonymousClass98.A02());
    }

    @JavascriptInterface
    public void logFunnel(int i10, String str) {
        A00().AFT(i10, str);
    }

    @JavascriptInterface
    public void onMainAssetLoaded() {
        A00().AFU();
        if (this.A06.get() == null || this.A01.get() == null || this.A02.get() == null) {
            return;
        }
        boolean z10 = this.A02.get().get();
        String[] strArr = A07;
        if (strArr[4].length() == strArr[5].length()) {
            throw new RuntimeException();
        }
        A07[1] = "xXjDpbk5Vvc7CvrBd08NYXaJ46SIZN7q";
        if (z10) {
            this.A01.get().set(true);
            A00().AFV();
            if (this.A06.get().isShown()) {
                A00().AFW();
                new Handler(Looper.getMainLooper()).post(new T7(this.A05));
            }
            O9 o92 = this.A04.get();
            if (o92 != null) {
                new Handler(Looper.getMainLooper()).post(new O7(this, o92));
            }
        }
    }

    @JavascriptInterface
    public void onPageInitialized() {
        T5 t52 = this.A06.get();
        if (t52 == null || t52.A06()) {
            A00().AFX(true);
            return;
        }
        O9 o92 = this.A04.get();
        if (o92 == null) {
            A00().AFX(true);
            return;
        }
        A00().AFX(false);
        o92.ABh();
    }
}
