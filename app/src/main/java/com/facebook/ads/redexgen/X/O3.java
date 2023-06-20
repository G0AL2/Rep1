package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.RequiresApi;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class O3 extends WebViewClient {
    public static byte[] A04;
    public WeakReference<O1> A00 = new WeakReference<>(null);
    public final WeakReference<C1400Xy> A01;
    public final WeakReference<O0> A02;
    public final WeakReference<C1143Nx> A03;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 97);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{54, 55, 68, 74, 73, 15, 55, 65, 54, 67, 64, 39, 52, 37, 39, 41, 58, 47, 60, 47, 58, 63, 51, 64, 54, 68, 65, 59, 54, 0, 59, 64, 70, 55, 64, 70, 0, 51, 53, 70, 59, 65, 64, 0, 40, 27, 23, 41, 9, 22, 12, 26, 23, 17, 12, -42, 17, 22, 28, 13, 22, 28, -42, 11, 9, 28, 13, 15, 23, 26, 33, -42, -22, -6, -9, -1, -5, -23, -22, -12, -19, 7, 23, 20, 28, 24, 10, 23, 4, 11, 6, 17, 17, 7, 6, 8, 16, 4, 26, 23, 17, -54, -57, -38, -57, 49, 54, 60, 45, 54, 60, -36, -39, -45, -95, -121, -30, -48, -51, -54, -31, -44, -48, -30};
    }

    public O3(WeakReference<C1400Xy> weakReference, WeakReference<O0> weakReference2, WeakReference<C1143Nx> weakReference3) {
        this.A01 = weakReference;
        this.A02 = weakReference2;
        this.A03 = weakReference3;
    }

    private void A02(String str, C1400Xy c1400Xy) {
        InterfaceC07818y A06 = c1400Xy.A06();
        int i10 = C07828z.A09;
        A06.A8y(A00(11, 11, 101), i10, new AnonymousClass90(A00(111, 5, 6) + str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0152, code lost:
        if (r0.contains(r1) == false) goto L64;
     */
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A03(android.webkit.WebView r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.O3.A03(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void A04(WeakReference<O1> weakReference) {
        this.A00 = weakReference;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C1143Nx c1143Nx = this.A03.get();
        if (c1143Nx != null) {
            c1143Nx.A03();
        }
        O0 o02 = this.A02.get();
        if (o02 != null) {
            o02.ABg(str);
        }
        O1 o12 = this.A00.get();
        if (o12 != null) {
            o12.AAA(webView.canGoBack());
            o12.AAp(webView.canGoForward());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        O0 o02 = this.A02.get();
        if (o02 != null) {
            o02.ABi(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        C1400Xy c1400Xy = this.A01.get();
        if (c1400Xy != null) {
            StringBuilder sb2 = new StringBuilder();
            String A00 = A00(0, 0, 27);
            sb2.append(A00);
            sb2.append(str);
            String sb3 = sb2.toString();
            c1400Xy.A0D().A8B(C1089Lv.A01(i10, sb3, A00 + str2));
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        C1400Xy c1400Xy = this.A01.get();
        if (c1400Xy != null) {
            int errorCode = webResourceError.getErrorCode();
            StringBuilder sb2 = new StringBuilder();
            String A00 = A00(0, 0, 27);
            sb2.append(A00);
            sb2.append((Object) webResourceError.getDescription());
            String sb3 = sb2.toString();
            c1400Xy.A0D().A8B(C1089Lv.A01(errorCode, sb3, A00 + webResourceRequest.getUrl()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        C1400Xy c1400Xy = this.A01.get();
        if (c1400Xy != null) {
            c1400Xy.A0D().A8C();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        C1400Xy c1400Xy = this.A01.get();
        if (c1400Xy != null) {
            c1400Xy.A0D().A8D();
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        O6.A02(C07828z.A2b);
        O0 o02 = this.A02.get();
        if (o02 != null) {
            o02.AC6();
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return A03(webView, webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A03(webView, str);
    }
}
