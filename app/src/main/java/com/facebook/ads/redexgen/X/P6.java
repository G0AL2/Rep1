package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network.dex */
public class P6 extends WebViewClient {
    public static byte[] A01;
    public static String[] A02 = {"hfMJ0frXuRQdVVGg5HhbkedMp84qvG2m", "353suYezQm1X4xGGmKd", "JSegO1TQToLz4SD5sG2", "wzs2neDsiDlXGMSMfb3", "O6PuLNBrYuNMqKQgURK12L6N", "9iUPqfJGnhoj94eJuJeS1Wm6njk1Rmvr", "BdwoSzPq3MvWa04biSMwYNzp8DFOBLqT", "enVVpEgx3aC4K8YdK2hdvlOQVko"};
    public final /* synthetic */ PA A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{3, 4, 18, 2, 17, 8, 15, 19, 8, 14, 13, -11, -6, -11, -44, 3, -14, 4, -7, 13, 26, 26, 23, 26, -21, 23, 12, 13, 48, 43, 64, 51, 45, 57, 56, -8, 51, 45, 57, 39, 51, 51, 47, 30, 36, 49, 49, 46, 49, 71, 73, 64, 70, 73, 64, 75, 80, -4, -7, -13};
    }

    static {
        A01();
    }

    public P6(PA pa2) {
        this.A00 = pa2;
    }

    private void A02(int i10, String str, String str2, boolean z10) {
        C1036Jp c1036Jp;
        C1400Xy c1400Xy;
        C1169Ox c1169Ox;
        if (z10) {
            this.A00.A0S();
        }
        c1036Jp = this.A00.A0D;
        c1036Jp.A02(EnumC1035Jo.A0Q, null);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(19, 9, 44), i10);
            jSONObject.put(A00(0, 11, 35), str);
            jSONObject.put(A00(57, 3, 11), str2);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1400Xy = this.A00.A0B;
        c1400Xy.A0D().A54(jSONObject2);
        c1169Ox = this.A00.A0E;
        c1169Ox.A04(C07828z.A16, jSONObject2);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C1036Jp c1036Jp;
        C1400Xy c1400Xy;
        long j10;
        P8 p82;
        P8 p83;
        c1036Jp = this.A00.A0D;
        c1036Jp.A02(EnumC1035Jo.A0R, null);
        c1400Xy = this.A00.A0B;
        C0R A0D = c1400Xy.A0D();
        j10 = this.A00.A00;
        A0D.A55(MJ.A01(j10));
        this.A00.A0S();
        this.A00.A06 = true;
        this.A00.A0E();
        p82 = this.A00.A03;
        if (p82 == null) {
            return;
        }
        p83 = this.A00.A03;
        p83.ACv();
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            A02(i10, str, str2, true);
        }
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        int errorCode = webResourceError.getErrorCode();
        StringBuilder sb2 = new StringBuilder();
        String A00 = A00(0, 0, 48);
        sb2.append(A00);
        sb2.append((Object) webResourceError.getDescription());
        String sb3 = sb2.toString();
        A02(errorCode, sb3, A00 + webResourceRequest.getUrl(), true);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 21)
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        int i10;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (webResourceRequest.getUrl().toString().toLowerCase(Locale.US).contains(A00(28, 11, 78))) {
            return;
        }
        if (webResourceResponse != null) {
            i10 = webResourceResponse.getStatusCode();
        } else {
            i10 = -1;
        }
        A02(i10, A00(39, 10, 67), A00(0, 0, 48) + webResourceRequest.getUrl(), false);
    }

    @Override // android.webkit.WebViewClient
    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        C1400Xy c1400Xy;
        AnonymousClass18 anonymousClass18;
        P9 p92;
        P9 p93;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A00(11, 8, 21), renderProcessGoneDetail.didCrash());
            jSONObject.put(A00(49, 8, 91), renderProcessGoneDetail.rendererPriorityAtExit());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        c1400Xy = this.A00.A0B;
        c1400Xy.A0D().A50(jSONObject2);
        anonymousClass18 = this.A00.A09;
        PB.A04(anonymousClass18.A0Z());
        p92 = this.A00.A04;
        if (p92 == null) {
            return true;
        }
        p93 = this.A00.A04;
        String[] strArr = A02;
        if (strArr[1].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A02[0] = "kv0KfCNN1XAdbICEJBZwu3dTiw7XNBbg";
        p93.ABx();
        return true;
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    @RequiresApi(api = 21)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C1400Xy c1400Xy;
        C7U c7u;
        PM pm;
        AnonymousClass18 anonymousClass18;
        c1400Xy = this.A00.A0B;
        c7u = this.A00.A0A;
        pm = this.A00.A0H;
        anonymousClass18 = this.A00.A09;
        return PO.A00(c1400Xy, c7u, webResourceRequest, pm, anonymousClass18.A0n());
    }
}
