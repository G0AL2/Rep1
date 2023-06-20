package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.d8  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1642d8 implements C7M {
    public final C1W A00;
    public final InterfaceC06021l A01;
    public final C7U A02;
    public final C1400Xy A03;
    public final boolean A04;

    public C1642d8(C1400Xy c1400Xy, InterfaceC06021l interfaceC06021l, C7U c7u, C1W c1w, boolean z10) {
        this.A03 = c1400Xy;
        this.A01 = interfaceC06021l;
        this.A02 = c7u;
        this.A00 = c1w;
        this.A04 = z10;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C06031m(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z10) {
        if (this.A00.A09() == C1X.A05) {
            A00();
            return;
        }
        String A0E = this.A00.A0E();
        if (z10) {
            A0E = this.A02.A0R(this.A00.A0E());
        }
        this.A00.A0H(A0E);
        this.A01.ABn();
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAH() {
        if (this.A04) {
            this.A01.ABm(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7M
    public final void AAO() {
        A01(true);
    }
}
