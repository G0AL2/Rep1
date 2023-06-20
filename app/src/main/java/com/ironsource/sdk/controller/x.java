package com.ironsource.sdk.controller;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.inmobi.media.de;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.i;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.controller.l;
import com.ironsource.sdk.controller.r;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.f.a;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class x extends WebView implements DownloadListener, com.ironsource.sdk.controller.m, com.ironsource.sdk.k.c {
    private static int W = 0;

    /* renamed from: b  reason: collision with root package name */
    public static String f27892b = "is_store";

    /* renamed from: c  reason: collision with root package name */
    public static String f27893c = "external_url";

    /* renamed from: d  reason: collision with root package name */
    public static String f27894d = "secondary_web_view";

    /* renamed from: g0  reason: collision with root package name */
    private static String f27895g0 = "success";

    /* renamed from: h0  reason: collision with root package name */
    private static String f27896h0 = "fail";
    private com.ironsource.sdk.j.a.c A;
    private com.ironsource.sdk.j.e B;
    private com.ironsource.sdk.j.a.b C;
    private Boolean D;
    private String E;
    private com.ironsource.sdk.controller.f F;
    com.ironsource.sdk.controller.w G;
    com.ironsource.sdk.g.b H;
    private Object I;
    private boolean J;
    private com.ironsource.sdk.controller.j K;
    com.ironsource.sdk.controller.q L;
    com.ironsource.sdk.controller.r M;
    com.ironsource.sdk.controller.v N;
    com.ironsource.sdk.controller.k O;
    com.ironsource.sdk.controller.a P;
    com.ironsource.sdk.controller.l Q;
    com.ironsource.sdk.controller.y R;
    private com.ironsource.sdk.controller.e S;
    private com.ironsource.sdk.service.Connectivity.b T;
    com.ironsource.sdk.controller.c U;
    com.ironsource.sdk.j.g V;

    /* renamed from: a  reason: collision with root package name */
    private final com.ironsource.environment.e.a f27897a;

    /* renamed from: e  reason: collision with root package name */
    String f27898e;

    /* renamed from: f  reason: collision with root package name */
    public CountDownTimer f27899f;

    /* renamed from: g  reason: collision with root package name */
    private String f27900g;

    /* renamed from: h  reason: collision with root package name */
    private String f27901h;

    /* renamed from: i  reason: collision with root package name */
    private String f27902i;

    /* renamed from: j  reason: collision with root package name */
    private Map<String, String> f27903j;

    /* renamed from: k  reason: collision with root package name */
    private com.ironsource.sdk.k.b f27904k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f27905l;

    /* renamed from: m  reason: collision with root package name */
    v f27906m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f27907n;

    /* renamed from: o  reason: collision with root package name */
    private CountDownTimer f27908o;

    /* renamed from: p  reason: collision with root package name */
    private int f27909p;

    /* renamed from: q  reason: collision with root package name */
    private int f27910q;

    /* renamed from: r  reason: collision with root package name */
    private String f27911r;

    /* renamed from: s  reason: collision with root package name */
    u f27912s;

    /* renamed from: t  reason: collision with root package name */
    View f27913t;

    /* renamed from: u  reason: collision with root package name */
    private FrameLayout f27914u;

    /* renamed from: v  reason: collision with root package name */
    private WebChromeClient.CustomViewCallback f27915v;

    /* renamed from: w  reason: collision with root package name */
    FrameLayout f27916w;

    /* renamed from: x  reason: collision with root package name */
    g f27917x;

    /* renamed from: y  reason: collision with root package name */
    String f27918y;

    /* renamed from: z  reason: collision with root package name */
    private com.ironsource.sdk.j.a.d f27919z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ d.e f27920a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f27921b;

        a(d.e eVar, String str) {
            this.f27920a = eVar;
            this.f27921b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.e eVar = this.f27920a;
            if (eVar != d.e.RewardedVideo && eVar != d.e.Interstitial) {
                if (eVar == d.e.OfferWall) {
                    x.this.B.onOWAdClosed();
                    return;
                }
                return;
            }
            com.ironsource.sdk.j.a.a M = x.this.M(eVar);
            if (M != null) {
                M.a(this.f27920a, this.f27921b);
            }
        }
    }

    /* loaded from: classes3.dex */
    class a0 extends WebViewClient {
        private a0() {
        }

        /* synthetic */ a0(x xVar, byte b10) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                x.this.b(x.i0("pageFinished"));
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i10, String str, String str2) {
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains("mobileController.html") && x.this.S != null) {
                com.ironsource.sdk.controller.e eVar = x.this.S;
                eVar.a("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i10 + ")");
            }
            super.onReceivedError(webView, i10, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str = x.this.f27898e;
            Log.e(str, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            String str2 = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            if (x.this.S != null) {
                x.this.S.b(str2);
            }
            x xVar = x.this;
            if (xVar.f27906m != null) {
                xVar.s0();
                v vVar = xVar.f27906m;
                d.e eVar = vVar.f28035a;
                String str3 = vVar.f28036b;
                if (xVar.J(eVar.toString())) {
                    xVar.D(eVar, str3);
                    return true;
                }
                return true;
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z10;
            Logger.i("shouldInterceptRequest", str);
            try {
                z10 = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException unused) {
                z10 = false;
            }
            if (z10) {
                String str2 = "file://" + x.this.E + File.separator + "mraid.js";
                try {
                    new FileInputStream(new File(str2));
                    return new WebResourceResponse("text/javascript", "UTF-8", a0.class.getResourceAsStream(str2));
                } catch (FileNotFoundException unused2) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (x.this.f(str)) {
                    x.this.i();
                    return true;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class b implements com.ironsource.sdk.controller.y {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        @Override // com.ironsource.sdk.controller.y
        public final void a(String str, JSONObject jSONObject) {
            x.this.b(x.t(x.this, str, jSONObject.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ JSONObject f27925a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f27926b;

        c(JSONObject jSONObject, String str) {
            this.f27925a = jSONObject;
            this.f27926b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            x.C(x.this, this.f27925a);
            x.n0(x.this, "about:blank");
            x.n0(x.this, this.f27926b);
        }
    }

    /* loaded from: classes3.dex */
    public class d {

        /* loaded from: classes3.dex */
        public class a {
            public a() {
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            public final void a(boolean z10, String str, com.ironsource.sdk.g.f fVar) {
                fVar.a(z10 ? x.f27895g0 : x.f27896h0, str);
                x.B(x.this, fVar.toString(), z10, null, null);
            }

            public final void a(boolean z10, String str, JSONObject jSONObject) {
                try {
                    jSONObject.put(z10 ? x.f27895g0 : x.f27896h0, str);
                    x.B(x.this, jSONObject.toString(), z10, null, null);
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    e10.getMessage();
                }
            }
        }

        /* loaded from: classes3.dex */
        final class a0 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27930a;

            a0(String str) {
                this.f27930a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Log.d(x.this.f27898e, "onInterstitialInitSuccess()");
                x.this.A.a(d.e.Interstitial, this.f27930a, (com.ironsource.sdk.g.a) null);
            }
        }

        /* loaded from: classes3.dex */
        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                Log.d(x.this.f27898e, "onOfferWallInitSuccess()");
                x.this.B.onOfferwallInitSuccess();
            }
        }

        /* loaded from: classes3.dex */
        final class b0 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27933a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ String f27934b;

            b0(String str, String str2) {
                this.f27933a = str;
                this.f27934b = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f27933a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String str2 = x.this.f27898e;
                Log.d(str2, "onInterstitialInitFail(message:" + str + ")");
                x.this.A.a(d.e.Interstitial, this.f27934b, str);
            }
        }

        /* loaded from: classes3.dex */
        final class c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27936a;

            c(String str) {
                this.f27936a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f27936a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String str2 = x.this.f27898e;
                Log.d(str2, "onOfferWallInitFail(message:" + str + ")");
                x.this.B.onOfferwallInitFail(str);
            }
        }

        /* loaded from: classes3.dex */
        final class c0 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ com.ironsource.sdk.j.a.a f27938a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ d.e f27939b;

            /* renamed from: c  reason: collision with root package name */
            private /* synthetic */ String f27940c;

            c0(d dVar, com.ironsource.sdk.j.a.a aVar, d.e eVar, String str) {
                this.f27938a = aVar;
                this.f27939b = eVar;
                this.f27940c = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f27938a.b(this.f27939b, this.f27940c);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.x$d$d  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class RunnableC0347d implements Runnable {
            RunnableC0347d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.k();
            }
        }

        /* loaded from: classes3.dex */
        final class d0 implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27942a;

            d0(String str) {
                this.f27942a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.A.c(d.e.Interstitial, this.f27942a);
                x.this.A.d(this.f27942a);
            }
        }

        /* loaded from: classes3.dex */
        final class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27944a;

            e(String str) {
                this.f27944a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.A.c(this.f27944a);
            }
        }

        /* loaded from: classes3.dex */
        final class f implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27946a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ String f27947b;

            f(String str, String str2) {
                this.f27946a = str;
                this.f27947b = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f27946a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.A.b(this.f27947b, str);
            }
        }

        /* loaded from: classes3.dex */
        final class g implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27949a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ String f27950b;

            g(String str, String str2) {
                this.f27949a = str;
                this.f27950b = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f27949a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.A.c(this.f27950b, str);
            }
        }

        /* loaded from: classes3.dex */
        final class h implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27952a;

            h(String str) {
                this.f27952a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Log.d(x.this.f27898e, "onBannerInitSuccess()");
                x.this.C.a(d.e.Banner, this.f27952a, (com.ironsource.sdk.g.a) null);
            }
        }

        /* loaded from: classes3.dex */
        final class i implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27954a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ String f27955b;

            i(String str, String str2) {
                this.f27954a = str;
                this.f27955b = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f27954a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String str2 = x.this.f27898e;
                Log.d(str2, "onBannerInitFail(message:" + str + ")");
                x.this.C.a(d.e.Banner, this.f27955b, str);
            }
        }

        /* loaded from: classes3.dex */
        final class j implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27957a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ com.ironsource.sdk.c.a f27958b;

            j(String str, com.ironsource.sdk.c.a aVar) {
                this.f27957a = str;
                this.f27958b = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Log.d(x.this.f27898e, "onBannerLoadSuccess()");
                x.this.C.a(this.f27957a, this.f27958b);
            }
        }

        /* loaded from: classes3.dex */
        final class k implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27960a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ String f27961b;

            k(String str, String str2) {
                this.f27960a = str;
                this.f27961b = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Log.d(x.this.f27898e, "onLoadBannerFail()");
                String str = this.f27960a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.C.d(this.f27961b, str);
            }
        }

        /* loaded from: classes3.dex */
        final class l implements Runnable {
            l() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.l();
            }
        }

        /* loaded from: classes3.dex */
        final class m implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27964a;

            m(String str) {
                this.f27964a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f27964a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.B.onGetOWCreditsFailed(str);
            }
        }

        /* loaded from: classes3.dex */
        final class n implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ d.e f27966a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ String f27967b;

            /* renamed from: c  reason: collision with root package name */
            private /* synthetic */ String f27968c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ JSONObject f27969d;

            n(d.e eVar, String str, String str2, JSONObject jSONObject) {
                this.f27966a = eVar;
                this.f27967b = str;
                this.f27968c = str2;
                this.f27969d = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d.e eVar = this.f27966a;
                if (eVar != d.e.Interstitial && eVar != d.e.RewardedVideo && eVar != d.e.Banner) {
                    if (eVar == d.e.OfferWall) {
                        x.this.B.onOfferwallEventNotificationReceived(this.f27968c, this.f27969d);
                        return;
                    }
                    return;
                }
                com.ironsource.sdk.j.a.a M = x.this.M(eVar);
                if (M != null) {
                    M.a(this.f27966a, this.f27967b, this.f27968c, this.f27969d);
                }
            }
        }

        /* loaded from: classes3.dex */
        final class o implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27971a;

            o(String str) {
                this.f27971a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    String str = x.this.f27898e;
                    Logger.i(str, "omidAPI(" + this.f27971a + ")");
                    x.this.L.a(new com.ironsource.sdk.g.f(this.f27971a).toString(), new a());
                } catch (Exception e10) {
                    e10.printStackTrace();
                    String str2 = x.this.f27898e;
                    Logger.i(str2, "omidAPI failed with exception " + e10.getMessage());
                }
            }
        }

        /* loaded from: classes3.dex */
        final class p implements Runnable {
            p() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.removeJavascriptInterface("GenerateTokenForMessaging");
            }
        }

        /* loaded from: classes3.dex */
        final class q implements Runnable {
            q() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (Build.VERSION.SDK_INT >= 21) {
                    x.this.getSettings().setMixedContentMode(0);
                }
            }
        }

        /* loaded from: classes3.dex */
        final class r implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ int f27975a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ String f27976b;

            /* renamed from: c  reason: collision with root package name */
            private /* synthetic */ com.ironsource.sdk.g.a f27977c;

            r(int i10, String str, com.ironsource.sdk.g.a aVar) {
                this.f27975a = i10;
                this.f27976b = str;
                this.f27977c = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (this.f27975a <= 0) {
                    x.this.f27919z.b(this.f27976b);
                    return;
                }
                Log.d(x.this.f27898e, "onRVInitSuccess()");
                x.this.f27919z.a(d.e.RewardedVideo, this.f27976b, this.f27977c);
            }
        }

        /* loaded from: classes3.dex */
        final class s implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27979a;

            s(String str) {
                this.f27979a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JSONObject d10;
                try {
                    com.ironsource.sdk.controller.l lVar = x.this.Q;
                    JSONObject jSONObject = new JSONObject(this.f27979a);
                    a aVar = new a();
                    com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(jSONObject);
                    com.ironsource.sdk.controller.o oVar = new com.ironsource.sdk.controller.o(aVar);
                    try {
                        String str = nVar.f27821a;
                        JSONObject jSONObject2 = nVar.f27822b;
                        char c10 = 65535;
                        boolean z10 = false;
                        switch (str.hashCode()) {
                            case -2073025383:
                                if (str.equals("saveFile")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case -1137024519:
                                if (str.equals("deleteFolder")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case -318115535:
                                if (str.equals("getTotalSizeOfFiles")) {
                                    c10 = 4;
                                    break;
                                }
                                break;
                            case 537556755:
                                if (str.equals("updateAttributesOfFile")) {
                                    c10 = 5;
                                    break;
                                }
                                break;
                            case 1764172231:
                                if (str.equals("deleteFile")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case 1953259713:
                                if (str.equals("getFiles")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                        }
                        if (c10 == 0) {
                            com.ironsource.sdk.h.c a10 = com.ironsource.sdk.controller.l.a(jSONObject2, lVar.f27816a);
                            String optString = jSONObject2.optString("fileUrl");
                            final l.a aVar2 = new l.a(oVar, nVar);
                            final com.ironsource.sdk.h.b bVar = lVar.f27817b;
                            if (TextUtils.isEmpty(optString)) {
                                throw new Exception("Missing params for file");
                            }
                            if (com.ironsource.environment.h.a(bVar.f28192b.f28203b) <= 0) {
                                throw new Exception("no_disk_space");
                            }
                            if (!SDKUtils.isExternalStorageAvailable()) {
                                throw new Exception("sotrage_unavailable");
                            }
                            if (!a.AnonymousClass1.b(bVar.f28191a)) {
                                throw new Exception("no_network_connection");
                            }
                            com.ironsource.sdk.h.a aVar3 = bVar.f28193c;
                            String path = a10.getPath();
                            com.ironsource.sdk.k.c cVar = new com.ironsource.sdk.k.c() { // from class: com.ironsource.sdk.h.b.1

                                /* renamed from: com.ironsource.sdk.h.b$1$a */
                                /* loaded from: classes3.dex */
                                final class a extends JSONObject {
                                    a(AnonymousClass1 anonymousClass1) {
                                        put("lastReferencedTime", System.currentTimeMillis());
                                    }
                                }

                                @Override // com.ironsource.sdk.k.c
                                public final void a(c cVar2) {
                                    aVar2.a(cVar2);
                                    try {
                                        bVar.f28194d.c(cVar2.getName(), new a(this));
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                }

                                @Override // com.ironsource.sdk.k.c
                                public final void a(c cVar2, com.ironsource.sdk.g.e eVar) {
                                    aVar2.a(cVar2, eVar);
                                }
                            };
                            if (path != null) {
                                aVar3.f28190a.put(path, cVar);
                            }
                            if (!a10.exists()) {
                                bVar.f28192b.a(a10, optString, bVar.f28193c);
                                return;
                            }
                            Message message = new Message();
                            message.obj = a10;
                            message.what = IronSourceError.ERROR_SESSION_KEY_ENCRYPTION_FAILURE;
                            bVar.f28193c.sendMessage(message);
                            return;
                        }
                        if (c10 == 1) {
                            com.ironsource.sdk.h.c a11 = com.ironsource.sdk.controller.l.a(jSONObject2, lVar.f27816a);
                            com.ironsource.sdk.h.b bVar2 = lVar.f27817b;
                            if (a11.exists()) {
                                if (!a11.delete()) {
                                    throw new Exception("Failed to delete file");
                                }
                                bVar2.f28194d.a(a11.getName());
                            }
                            d10 = com.ironsource.sdk.controller.l.d(nVar, a11.a());
                        } else if (c10 == 2) {
                            com.ironsource.sdk.h.c e10 = com.ironsource.sdk.controller.l.e(jSONObject2, lVar.f27816a);
                            com.ironsource.sdk.h.b bVar3 = lVar.f27817b;
                            if (e10.exists()) {
                                ArrayList<com.ironsource.sdk.h.c> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(e10);
                                if (IronSourceStorageUtils.deleteFolderContentRecursive(e10) && e10.delete()) {
                                    z10 = true;
                                }
                                if (!z10) {
                                    throw new Exception("Failed to delete folder");
                                }
                                bVar3.f28194d.a(filesInFolderRecursive);
                            }
                            d10 = com.ironsource.sdk.controller.l.d(nVar, e10.a());
                        } else if (c10 == 3) {
                            com.ironsource.sdk.h.c e11 = com.ironsource.sdk.controller.l.e(jSONObject2, lVar.f27816a);
                            com.ironsource.sdk.h.b bVar4 = lVar.f27817b;
                            if (!e11.exists()) {
                                throw new Exception("Folder does not exist");
                            }
                            d10 = com.ironsource.sdk.controller.l.d(nVar, IronSourceStorageUtils.buildFilesMapOfDirectory(e11, bVar4.f28194d.a()));
                        } else if (c10 != 4) {
                            if (c10 != 5) {
                                return;
                            }
                            com.ironsource.sdk.h.c a12 = com.ironsource.sdk.controller.l.a(jSONObject2, lVar.f27816a);
                            JSONObject optJSONObject = jSONObject2.optJSONObject("attributesToUpdate");
                            com.ironsource.sdk.h.b bVar5 = lVar.f27817b;
                            if (optJSONObject == null) {
                                throw new Exception("Missing attributes to update");
                            }
                            if (!a12.exists()) {
                                throw new Exception("File does not exist");
                            }
                            if (!bVar5.f28194d.b(a12.getName(), optJSONObject)) {
                                throw new Exception("Failed to update attribute");
                            }
                            oVar.a(nVar, com.ironsource.sdk.controller.l.d(nVar, a12.a()));
                            return;
                        } else {
                            com.ironsource.sdk.h.c e12 = com.ironsource.sdk.controller.l.e(jSONObject2, lVar.f27816a);
                            if (!e12.exists()) {
                                throw new Exception("Folder does not exist");
                            }
                            d10 = com.ironsource.sdk.controller.l.b(nVar, IronSourceStorageUtils.getTotalSizeOfDir(e12));
                        }
                        oVar.a(nVar, d10);
                    } catch (Exception e13) {
                        oVar.b(nVar, com.ironsource.sdk.controller.l.c(nVar, e13.getMessage()));
                    }
                } catch (Exception e14) {
                    e14.printStackTrace();
                    String str2 = x.this.f27898e;
                    Logger.i(str2, "fileSystemAPI failed with exception " + e14.getMessage());
                }
            }
        }

        /* loaded from: classes3.dex */
        final class t implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27981a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ String f27982b;

            /* renamed from: c  reason: collision with root package name */
            private /* synthetic */ int f27983c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ boolean f27984d;

            /* renamed from: e  reason: collision with root package name */
            private /* synthetic */ int f27985e;

            /* renamed from: f  reason: collision with root package name */
            private /* synthetic */ boolean f27986f;

            /* renamed from: g  reason: collision with root package name */
            private /* synthetic */ String f27987g;

            /* renamed from: h  reason: collision with root package name */
            private /* synthetic */ String f27988h;

            t(String str, String str2, int i10, boolean z10, int i11, boolean z11, String str3, String str4) {
                this.f27981a = str;
                this.f27982b = str2;
                this.f27983c = i10;
                this.f27984d = z10;
                this.f27985e = i11;
                this.f27986f = z11;
                this.f27987g = str3;
                this.f27988h = str4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (this.f27981a.equalsIgnoreCase(d.e.RewardedVideo.toString())) {
                    x.this.f27919z.a(this.f27982b, this.f27983c);
                } else if (this.f27981a.equalsIgnoreCase(d.e.OfferWall.toString()) && this.f27984d && x.this.B.onOWAdCredited(this.f27983c, this.f27985e, this.f27986f) && !TextUtils.isEmpty(this.f27987g)) {
                    if (com.ironsource.sdk.utils.b.a().a(this.f27987g, x.this.f27901h, x.this.f27902i)) {
                        x.B(x.this, this.f27988h, true, null, null);
                    } else {
                        x.B(x.this, this.f27988h, false, "Time Stamp could not be stored", null);
                    }
                }
            }
        }

        /* loaded from: classes3.dex */
        final class u implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27990a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ int f27991b;

            u(String str, int i10) {
                this.f27990a = str;
                this.f27991b = i10;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.A.b(this.f27990a, this.f27991b);
            }
        }

        /* loaded from: classes3.dex */
        final class v implements Runnable {
            v() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x xVar = x.this;
                xVar.setOnTouchListener(new z(xVar, (byte) 0));
            }
        }

        /* loaded from: classes3.dex */
        final class w implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27994a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ String f27995b;

            w(String str, String str2) {
                this.f27994a = str;
                this.f27995b = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f27994a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String str2 = x.this.f27898e;
                Log.d(str2, "onRVInitFail(message:" + str + ")");
                x.this.f27919z.a(d.e.RewardedVideo, this.f27995b, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.x$d$x  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class RunnableC0348x implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f27997a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ String f27998b;

            RunnableC0348x(String str, String str2) {
                this.f27997a = str;
                this.f27998b = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f27997a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String str2 = x.this.f27898e;
                Log.d(str2, "onRVShowFail(message:" + this.f27997a + ")");
                x.this.f27919z.a(this.f27998b, str);
            }
        }

        /* loaded from: classes3.dex */
        final class y implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f28000a;

            y(String str) {
                this.f28000a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.B.onOWShowSuccess(this.f28000a);
            }
        }

        /* loaded from: classes3.dex */
        final class z implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            private /* synthetic */ String f28002a;

            z(String str) {
                this.f28002a = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.f28002a;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.B.onOWShowFail(str);
            }
        }

        public d() {
        }

        private void a(String str, boolean z10) {
            com.ironsource.sdk.g.c a10 = x.this.K.a(d.e.Interstitial, str);
            if (a10 != null) {
                a10.f28147f = z10;
            }
        }

        private void b(JSONObject jSONObject) {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put("nativeFeatures", new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e10) {
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27595m, new com.ironsource.sdk.a.a().a("callfailreason", e10.getMessage()).f27575a);
                Logger.d(x.this.f27898e, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(JSONObject jSONObject, String str) {
            if (d(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException unused) {
                    Logger.d(x.this.f27898e, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        private static boolean d(String str) {
            if (TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        private void e(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", x.this.F.h());
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "adClicked(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            d.e e02 = x.e0(x.this, d10);
            com.ironsource.sdk.j.a.a M = x.this.M(e02);
            if (e02 == null || M == null) {
                return;
            }
            x.this.Y(new c0(this, M, e02, fetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            String str2;
            boolean z10;
            boolean z11;
            com.ironsource.sdk.g.c a10;
            Log.d(x.this.f27900g, "adCredited(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("credits");
            boolean z12 = false;
            int parseInt = d10 != null ? Integer.parseInt(d10) : 0;
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d11 = fVar.d("productType");
            if (TextUtils.isEmpty(d11)) {
                Log.d(x.this.f27900g, "adCredited | product type is missing");
            }
            d.e eVar = d.e.Interstitial;
            if (eVar.toString().equalsIgnoreCase(d11)) {
                if (!x.this.J(eVar.toString()) || (a10 = x.this.K.a(eVar, fetchDemandSourceId)) == null) {
                    return;
                }
                Map<String, String> map = a10.f28145d;
                if (map != null && map.containsKey(RNAdsEvents.EVENT_REWARDED)) {
                    z12 = Boolean.parseBoolean(a10.f28145d.get(RNAdsEvents.EVENT_REWARDED));
                }
                if (z12) {
                    x.this.Y(new u(fetchDemandSourceId, parseInt));
                    return;
                }
                return;
            }
            String d12 = fVar.d("total");
            int parseInt2 = d12 != null ? Integer.parseInt(d12) : 0;
            if (!d.e.OfferWall.toString().equalsIgnoreCase(d11)) {
                str2 = null;
                z10 = false;
                z11 = false;
            } else if (fVar.b(InAppPurchaseMetaData.KEY_SIGNATURE) || fVar.b("timestamp") || fVar.b("totalCreditsFlag")) {
                x.B(x.this, str, false, "One of the keys are missing: signature/timestamp/totalCreditsFlag", null);
                return;
            } else {
                if (fVar.d(InAppPurchaseMetaData.KEY_SIGNATURE).equalsIgnoreCase(SDKUtils.getMD5(d12 + x.this.f27901h + x.this.f27902i))) {
                    z12 = true;
                } else {
                    x.B(x.this, str, false, "Controller signature is not equal to SDK signature", null);
                }
                boolean e10 = fVar.e("totalCreditsFlag");
                str2 = fVar.d("timestamp");
                z11 = e10;
                z10 = z12;
            }
            if (x.this.J(d11)) {
                x.this.Y(new t(d11, fetchDemandSourceId, parseInt, z10, parseInt2, z11, str2, str));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "adUnitsReady(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            com.ironsource.sdk.g.a aVar = new com.ironsource.sdk.g.a(str);
            if (!aVar.f28127c) {
                x.B(x.this, str, false, "Num Of Ad Units Do Not Exist", null);
                return;
            }
            x.B(x.this, str, true, null, null);
            String str3 = aVar.f28125a;
            if (d.e.RewardedVideo.toString().equalsIgnoreCase(str3) && x.this.J(str3)) {
                x.this.Y(new r(Integer.parseInt(aVar.f28126b), fetchDemandSourceId, aVar));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                String str2 = x.this.f27898e;
                Logger.i(str2, "adViewAPI(" + str + ")");
                x.this.P.a(new com.ironsource.sdk.g.f(str).toString(), new a());
            } catch (Exception e10) {
                e10.printStackTrace();
                String str3 = x.this.f27898e;
                Logger.i(str3, "adViewAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.e(x.this.f27898e, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            d.e e02;
            Map<String, com.ironsource.sdk.g.c> c10;
            com.ironsource.sdk.g.c remove;
            try {
                String str2 = x.this.f27898e;
                Logger.i(str2, "cleanAdInstance(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d10 = fVar.d("productType");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                if (TextUtils.isEmpty(fetchDemandSourceId) || (e02 = x.e0(x.this, d10)) == null) {
                    return;
                }
                com.ironsource.sdk.controller.j jVar = x.this.K;
                if (TextUtils.isEmpty(fetchDemandSourceId) || (c10 = jVar.c(e02)) == null || (remove = c10.remove(fetchDemandSourceId)) == null) {
                    return;
                }
                remove.f28148g = null;
                Map<String, String> map = remove.f28145d;
                if (map != null) {
                    map.clear();
                }
                remove.f28145d = null;
            } catch (Exception e10) {
                x.B(x.this, str, false, e10.getMessage(), null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                com.ironsource.sdk.utils.b a10 = com.ironsource.sdk.utils.b.a();
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) a10.f28257a.getAll().keySet().toArray(new String[0]);
                SharedPreferences.Editor edit = a10.f28257a.edit();
                for (String str2 : strArr) {
                    if (com.ironsource.sdk.utils.b.b(str2)) {
                        arrayList.add(str2);
                        edit.remove(str2);
                    }
                }
                edit.apply();
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                if (!arrayList.isEmpty()) {
                    fVar.a("removedAdsLastUpdateTime", arrayList.toString());
                }
                x.B(x.this, fVar.toString(), true, null, null);
            } catch (Exception e10) {
                x.B(x.this, str, false, e10.getMessage(), null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                String str2 = x.this.f27898e;
                Logger.i(str2, "deleteFile(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d10 = fVar.d("file");
                String d11 = fVar.d("path");
                if (d11 != null && !TextUtils.isEmpty(d10)) {
                    com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(x.this.E, d11), d10);
                    if (!cVar.exists()) {
                        x.B(x.this, str, false, "File not exist", "1");
                        return;
                    }
                    x.B(x.this, str, IronSourceStorageUtils.deleteFile(cVar), null, null);
                    return;
                }
                x.B(x.this, str, false, "Missing parameters for file", "1");
            } catch (Exception e10) {
                x.B(x.this, str, false, e10.getMessage(), null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                String str2 = x.this.f27898e;
                Logger.i(str2, "deleteFolder(" + str + ")");
                String d10 = new com.ironsource.sdk.g.f(str).d("path");
                if (d10 == null) {
                    x.B(x.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(x.this.E, d10));
                if (!cVar.exists()) {
                    x.B(x.this, str, false, "Folder not exist", "1");
                    return;
                }
                x.B(x.this, str, IronSourceStorageUtils.deleteFolder(cVar.getPath()), null, null);
            } catch (Exception e10) {
                x.B(x.this, str, false, e10.getMessage(), null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                String str2 = x.this.f27898e;
                Logger.i(str2, "deviceDataAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                com.ironsource.sdk.controller.k kVar = x.this.O;
                String fVar2 = fVar.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar2);
                k.a aVar2 = new k.a((byte) 0);
                aVar2.f27814a = jSONObject.optString("deviceDataFunction");
                jSONObject.optJSONObject("deviceDataParams");
                aVar2.f27815b = jSONObject.optString("success");
                jSONObject.optString("fail");
                if (!"getDeviceData".equals(aVar2.f27814a)) {
                    String str3 = com.ironsource.sdk.controller.k.f27812b;
                    Logger.i(str3, "unhandled API request " + fVar2);
                    return;
                }
                String str4 = aVar2.f27815b;
                com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                fVar3.a(SDKUtils.encodeString("sdCardAvailable"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.d())));
                fVar3.a(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.d(kVar.f27813a))));
                fVar3.a(SDKUtils.encodeString("isCharging"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.e(kVar.f27813a))));
                fVar3.a(SDKUtils.encodeString("chargingType"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.f(kVar.f27813a))));
                fVar3.a(SDKUtils.encodeString("airplaneMode"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.g(kVar.f27813a))));
                fVar3.a(SDKUtils.encodeString("stayOnWhenPluggedIn"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.h(kVar.f27813a))));
                aVar.a(true, str4, fVar3);
            } catch (Exception e10) {
                e10.printStackTrace();
                String str5 = x.this.f27898e;
                Logger.i(str5, "deviceDataAPI failed with exception " + e10.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "displayWebView(" + str + ")");
            x.B(x.this, str, true, null, null);
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            boolean booleanValue = ((Boolean) fVar.c("display")).booleanValue();
            String d10 = fVar.d("productType");
            boolean e10 = fVar.e("standaloneView");
            String d11 = fVar.d("adViewId");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            boolean e11 = fVar.e("ctrWVPauseResume");
            if (!booleanValue) {
                x xVar = x.this;
                xVar.f27917x = g.Gone;
                xVar.s0();
                return;
            }
            x.this.J = fVar.e("immersive");
            boolean e12 = fVar.e("activityThemeTranslucent");
            x xVar2 = x.this;
            g gVar = xVar2.f27917x;
            g gVar2 = g.Display;
            if (gVar == gVar2) {
                String str3 = xVar2.f27898e;
                Logger.i(str3, "State: " + x.this.f27917x);
                return;
            }
            xVar2.f27917x = gVar2;
            String str4 = xVar2.f27898e;
            Logger.i(str4, "State: " + x.this.f27917x);
            Activity a10 = x.this.U.a();
            String str5 = x.this.f27918y;
            int k10 = com.ironsource.environment.h.k(a10);
            if (e10) {
                com.ironsource.sdk.controller.i iVar = new com.ironsource.sdk.controller.i(a10);
                iVar.addView(x.this.f27916w);
                x xVar3 = x.this;
                iVar.f27806b = xVar3;
                xVar3.V = iVar;
                xVar3.requestFocus();
                Activity a11 = iVar.f27806b.U.a();
                iVar.f27805a = a11;
                int i10 = (((a11.getWindow().getAttributes().flags & IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES) != 0) || (i10 = iVar.a()) <= 0) ? 0 : 0;
                int c10 = iVar.c();
                try {
                    Context context = iVar.f27805a;
                    if (context != null) {
                        int o10 = com.ironsource.environment.h.o(context);
                        if (o10 == 1) {
                            iVar.setPadding(0, i10, 0, c10);
                        } else if (o10 == 2) {
                            iVar.setPadding(0, i10, c10, 0);
                        }
                    }
                } catch (Exception unused) {
                }
                ((Activity) iVar.f27805a).runOnUiThread(new i.a());
                return;
            }
            Intent intent = e12 ? new Intent(a10, InterstitialActivity.class) : new Intent(a10, ControllerActivity.class);
            d.e eVar = d.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(d10)) {
                if ("application".equals(str5)) {
                    str5 = SDKUtils.translateRequestedOrientation(com.ironsource.environment.h.m(a10));
                }
                intent.putExtra("productType", eVar.toString());
                x.this.H.f28132e = eVar.ordinal();
                x.this.H.f28130c = fetchDemandSourceId;
                if (x.this.J(eVar.toString())) {
                    x.this.f27919z.c(eVar, fetchDemandSourceId);
                }
            } else {
                d.e eVar2 = d.e.OfferWall;
                if (eVar2.toString().equalsIgnoreCase(d10)) {
                    intent.putExtra("productType", eVar2.toString());
                    x.this.H.f28132e = eVar2.ordinal();
                } else {
                    d.e eVar3 = d.e.Interstitial;
                    if (eVar3.toString().equalsIgnoreCase(d10)) {
                        if ("application".equals(str5)) {
                            str5 = SDKUtils.translateRequestedOrientation(com.ironsource.environment.h.m(a10));
                        }
                        intent.putExtra("productType", eVar3.toString());
                    }
                }
            }
            if (d11 != null) {
                intent.putExtra("adViewId", d11);
            }
            intent.putExtra("ctrWVPauseResume", e11);
            intent.setFlags(536870912);
            intent.putExtra("immersive", x.this.J);
            intent.putExtra("orientation_set_flag", str5);
            intent.putExtra("rotation_set_flag", k10);
            x xVar4 = x.this;
            xVar4.f27906m = new v(x.e0(xVar4, d10), fetchDemandSourceId);
            a10.startActivity(intent);
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "fileSystemAPI(" + str + ")");
            x.this.R(new s(str));
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L6;
         */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void getApplicationInfo(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                java.lang.String r0 = com.ironsource.sdk.controller.x.N(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getApplicationInfo("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                java.lang.String r0 = com.ironsource.sdk.controller.x.O(r0, r5)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.x.this
                java.lang.String r1 = com.ironsource.sdk.controller.x.V(r1, r5)
                com.ironsource.sdk.g.f r2 = new com.ironsource.sdk.g.f
                r2.<init>(r5)
                java.lang.String r5 = "productType"
                java.lang.String r5 = r2.d(r5)
                java.lang.String r2 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(r2)
                com.ironsource.sdk.controller.x r3 = com.ironsource.sdk.controller.x.this
                java.lang.Object[] r5 = com.ironsource.sdk.controller.x.T(r3, r5, r2)
                r2 = 0
                r2 = r5[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r5 = r5[r3]
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L55
                boolean r5 = android.text.TextUtils.isEmpty(r1)
                if (r5 != 0) goto L5c
                r0 = r1
                goto L5d
            L55:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L5c
                goto L5d
            L5c:
                r0 = 0
            L5d:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L72
                com.ironsource.sdk.controller.x r5 = com.ironsource.sdk.controller.x.this
                java.lang.String r1 = "onGetApplicationInfoSuccess"
                java.lang.String r3 = "onGetApplicationInfoFail"
                java.lang.String r5 = com.ironsource.sdk.controller.x.u(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                com.ironsource.sdk.controller.x.z(r0, r5)
            L72:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.d.getApplicationInfo(java.lang.String):void");
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            x xVar;
            String str2;
            String str3 = x.this.f27898e;
            Logger.i(str3, "getCachedFilesMap(" + str + ")");
            String O = x.O(x.this, str);
            if (TextUtils.isEmpty(O)) {
                return;
            }
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (fVar.a("path")) {
                String str4 = (String) fVar.c("path");
                if (IronSourceStorageUtils.isPathExist(x.this.E, str4)) {
                    x.this.b(x.u(x.this, O, IronSourceStorageUtils.getCachedFilesMap(x.this.E, str4), "onGetCachedFilesMapSuccess", "onGetCachedFilesMapFail"));
                    return;
                }
                xVar = x.this;
                str2 = "path file does not exist on disk";
            } else {
                xVar = x.this;
                str2 = "path key does not exist";
            }
            x.B(xVar, str, false, str2, null);
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String t10;
            String str2 = x.this.f27898e;
            Logger.i(str2, "getConnectivityInfo(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d(x.f27895g0);
            String d11 = fVar.d(x.f27896h0);
            JSONObject jSONObject = new JSONObject();
            if (x.this.T != null) {
                com.ironsource.sdk.service.Connectivity.b bVar = x.this.T;
                jSONObject = bVar.f28222a.c(x.this.getContext());
            }
            if (jSONObject.length() > 0) {
                t10 = x.t(x.this, d10, jSONObject.toString());
            } else {
                t10 = x.t(x.this, d11, x.v(x.this, "errMsg", "failed to retrieve connection info", null, null, null, null, null, null, null, false));
            }
            x.this.b(t10);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "getControllerConfig(" + str + ")");
            String d10 = new com.ironsource.sdk.g.f(str).d(x.f27895g0);
            if (TextUtils.isEmpty(d10)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            b(controllerConfigAsJSONObject);
            c(controllerConfigAsJSONObject, SDKUtils.getTesterParameters());
            e(controllerConfigAsJSONObject);
            x.this.b(x.t(x.this, d10, controllerConfigAsJSONObject.toString()));
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[Catch: Exception -> 0x008c, TRY_LEAVE, TryCatch #0 {Exception -> 0x008c, blocks: (B:6:0x0036, B:8:0x003c, B:10:0x0058, B:15:0x0062, B:17:0x0076, B:19:0x0080, B:16:0x0070), top: B:24:0x0036 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void getDemandSourceState(java.lang.String r9) {
            /*
                r8 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                java.lang.String r0 = com.ironsource.sdk.controller.x.N(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getMediationState("
                r1.<init>(r2)
                r1.append(r9)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
                r0.<init>(r9)
                java.lang.String r1 = "demandSourceName"
                java.lang.String r2 = r0.d(r1)
                java.lang.String r3 = com.ironsource.sdk.utils.SDKUtils.fetchDemandSourceId(r0)
                java.lang.String r4 = "productType"
                java.lang.String r0 = r0.d(r4)
                if (r0 == 0) goto L9a
                if (r2 == 0) goto L9a
                r5 = 0
                com.ironsource.sdk.g.d$e r6 = com.ironsource.sdk.utils.SDKUtils.getProductType(r0)     // Catch: java.lang.Exception -> L8c
                if (r6 == 0) goto L9a
                com.ironsource.sdk.controller.x r7 = com.ironsource.sdk.controller.x.this     // Catch: java.lang.Exception -> L8c
                com.ironsource.sdk.controller.j r7 = com.ironsource.sdk.controller.x.J0(r7)     // Catch: java.lang.Exception -> L8c
                com.ironsource.sdk.g.c r6 = r7.a(r6, r3)     // Catch: java.lang.Exception -> L8c
                org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L8c
                r7.<init>()     // Catch: java.lang.Exception -> L8c
                r7.put(r4, r0)     // Catch: java.lang.Exception -> L8c
                r7.put(r1, r2)     // Catch: java.lang.Exception -> L8c
                java.lang.String r0 = "demandSourceId"
                r7.put(r0, r3)     // Catch: java.lang.Exception -> L8c
                if (r6 == 0) goto L70
                int r0 = r6.f28144c     // Catch: java.lang.Exception -> L8c
                r1 = -1
                if (r0 != r1) goto L5f
                r0 = 1
                goto L60
            L5f:
                r0 = 0
            L60:
                if (r0 != 0) goto L70
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this     // Catch: java.lang.Exception -> L8c
                java.lang.String r0 = com.ironsource.sdk.controller.x.O(r0, r9)     // Catch: java.lang.Exception -> L8c
                java.lang.String r1 = "state"
                int r2 = r6.f28144c     // Catch: java.lang.Exception -> L8c
                r7.put(r1, r2)     // Catch: java.lang.Exception -> L8c
                goto L76
            L70:
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this     // Catch: java.lang.Exception -> L8c
                java.lang.String r0 = com.ironsource.sdk.controller.x.V(r0, r9)     // Catch: java.lang.Exception -> L8c
            L76:
                java.lang.String r1 = r7.toString()     // Catch: java.lang.Exception -> L8c
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L8c
                if (r2 != 0) goto L9a
                com.ironsource.sdk.controller.x r2 = com.ironsource.sdk.controller.x.this     // Catch: java.lang.Exception -> L8c
                java.lang.String r0 = com.ironsource.sdk.controller.x.t(r2, r0, r1)     // Catch: java.lang.Exception -> L8c
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.x.this     // Catch: java.lang.Exception -> L8c
                com.ironsource.sdk.controller.x.z(r1, r0)     // Catch: java.lang.Exception -> L8c
                goto L9a
            L8c:
                r0 = move-exception
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.x.this
                java.lang.String r2 = r0.getMessage()
                r3 = 0
                com.ironsource.sdk.controller.x.B(r1, r9, r5, r2, r3)
                r0.printStackTrace()
            L9a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.d.getDemandSourceState(java.lang.String):void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x004e, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L6;
         */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void getDeviceStatus(java.lang.String r5) {
            /*
                r4 = this;
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                java.lang.String r0 = com.ironsource.sdk.controller.x.N(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "getDeviceStatus("
                r1.<init>(r2)
                r1.append(r5)
                java.lang.String r2 = ")"
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                com.ironsource.sdk.utils.Logger.i(r0, r1)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                java.lang.String r0 = com.ironsource.sdk.controller.x.O(r0, r5)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.x.this
                java.lang.String r5 = com.ironsource.sdk.controller.x.V(r1, r5)
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.x.this
                android.content.Context r2 = r1.getContext()
                java.lang.Object[] r1 = com.ironsource.sdk.controller.x.K(r1, r2)
                r2 = 0
                r2 = r1[r2]
                java.lang.String r2 = (java.lang.String) r2
                r3 = 1
                r1 = r1[r3]
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L4a
                boolean r0 = android.text.TextUtils.isEmpty(r5)
                if (r0 != 0) goto L51
                r0 = r5
                goto L52
            L4a:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L51
                goto L52
            L51:
                r0 = 0
            L52:
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 != 0) goto L67
                com.ironsource.sdk.controller.x r5 = com.ironsource.sdk.controller.x.this
                java.lang.String r1 = "onGetDeviceStatusSuccess"
                java.lang.String r3 = "onGetDeviceStatusFail"
                java.lang.String r5 = com.ironsource.sdk.controller.x.u(r5, r0, r2, r1, r3)
                com.ironsource.sdk.controller.x r0 = com.ironsource.sdk.controller.x.this
                com.ironsource.sdk.controller.x.z(r0, r5)
            L67:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.d.getDeviceStatus(java.lang.String):void");
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "getDeviceVolume(" + str + ")");
            try {
                com.ironsource.sdk.utils.a.a(x.this.U.a());
                float b10 = com.ironsource.sdk.utils.a.b(x.this.U.a());
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                fVar.a("deviceVolume", String.valueOf(b10));
                x.B(x.this, fVar.toString(), true, null, null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            Activity a10 = x.this.U.a();
            if (a10 != null) {
                String O = x.O(x.this, str);
                String jSONObject = SDKUtils.getOrientation(a10).toString();
                if (TextUtils.isEmpty(O)) {
                    return;
                }
                x.this.b(x.u(x.this, O, jSONObject, "onGetOrientationSuccess", "onGetOrientationFail"));
            }
        }

        @JavascriptInterface
        public void getUserData(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "getUserData(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (!fVar.a("key")) {
                x.B(x.this, str, false, "key does not exist", null);
                return;
            }
            String O = x.O(x.this, str);
            String d10 = fVar.d("key");
            String string = com.ironsource.sdk.utils.b.a().f28257a.getString(d10, null);
            if (string == null) {
                string = JsonUtils.EMPTY_JSON;
            }
            x.this.b(x.t(x.this, O, x.v(x.this, d10, string, null, null, null, null, null, null, null, false)));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                String str2 = x.this.f27898e;
                Logger.i(str2, "iabTokenAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                com.ironsource.sdk.controller.v vVar = x.this.N;
                String fVar2 = fVar.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar2);
                v.a aVar2 = new v.a((byte) 0);
                aVar2.f27888a = jSONObject.optString("functionName");
                aVar2.f27889b = jSONObject.optJSONObject("functionParams");
                aVar2.f27890c = jSONObject.optString("success");
                aVar2.f27891d = jSONObject.optString("fail");
                if ("updateToken".equals(aVar2.f27888a)) {
                    JSONObject jSONObject2 = aVar2.f27889b;
                    com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                    try {
                        com.ironsource.sdk.service.c cVar = vVar.f27885b;
                        com.ironsource.mediationsdk.adunit.a.a.a("ctgp", jSONObject2);
                        vVar.f27884a.a(jSONObject2);
                        aVar.a(true, aVar2.f27890c, fVar3);
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        String str3 = com.ironsource.sdk.controller.v.f27883e;
                        Logger.i(str3, "updateToken exception " + e10.getMessage());
                        aVar.a(false, aVar2.f27891d, fVar3);
                        return;
                    }
                } else if (!"getToken".equals(aVar2.f27888a)) {
                    String str4 = com.ironsource.sdk.controller.v.f27883e;
                    Logger.i(str4, "unhandled API request " + fVar2);
                    return;
                } else {
                    try {
                        aVar.a(true, aVar2.f27890c, SDKUtils.getControllerConfigAsJSONObject().optBoolean("oneToken") ? vVar.a() : vVar.f27884a.b(vVar.f27886c));
                        return;
                    } catch (Exception e11) {
                        String str5 = aVar2.f27891d;
                        String message = e11.getMessage();
                        com.ironsource.sdk.g.f fVar4 = new com.ironsource.sdk.g.f();
                        fVar4.a(x.f27896h0, str5);
                        fVar4.a("data", message);
                        x.B(x.this, fVar4.toString(), false, null, null);
                        return;
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                String str6 = x.this.f27898e;
                Logger.i(str6, "iabTokenAPI failed with exception " + e12.getMessage());
            }
            e12.printStackTrace();
            String str62 = x.this.f27898e;
            Logger.i(str62, "iabTokenAPI failed with exception " + e12.getMessage());
        }

        @JavascriptInterface
        public void initController(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "initController(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            CountDownTimer countDownTimer = x.this.f27899f;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                x.this.f27899f = null;
            }
            if (fVar.a("stage")) {
                String d10 = fVar.d("stage");
                if ("ready".equalsIgnoreCase(d10)) {
                    x.S(x.this, true);
                    x.this.S.b();
                } else if (RNAdsEvents.EVENT_LOADED.equalsIgnoreCase(d10)) {
                    x.this.S.a();
                } else if (!"failed".equalsIgnoreCase(d10)) {
                    Logger.i(x.this.f27898e, "No STAGE mentioned! should not get here!");
                } else {
                    String d11 = fVar.d("errMsg");
                    com.ironsource.sdk.controller.e eVar = x.this.S;
                    eVar.a("controller js failed to initialize : " + d11);
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            x.this.E(new o(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onAdWindowsClosed(" + str + ")");
            x.this.H.f28132e = -1;
            x.this.H.f28130c = null;
            x.this.f27906m = null;
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            d.e e02 = x.e0(x.this, d10);
            String str3 = x.this.f27900g;
            Log.d(str3, "onAdClosed() with type " + e02);
            if (x.this.J(d10)) {
                x.this.D(e02, fetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onGetApplicationInfoFail(" + str + ")");
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onGetApplicationInfoFail", str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onGetApplicationInfoSuccess(" + str + ")");
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onGetApplicationInfoSuccess", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onGetCachedFilesMapFail(" + str + ")");
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onGetCachedFilesMapFail", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onGetCachedFilesMapSuccess(" + str + ")");
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onGetCachedFilesMapSuccess", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onGetDeviceStatusFail(" + str + ")");
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onGetDeviceStatusFail", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onGetDeviceStatusSuccess(" + str + ")");
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onGetDeviceStatusSuccess", str);
        }

        @JavascriptInterface
        public void onGetUserCreditsFail(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onGetUserCreditsFail(" + str + ")");
            String d10 = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (x.this.J(d.e.OfferWall.toString())) {
                x.this.Y(new m(d10));
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onGetUserCreditsFail", str);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onInitBannerFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.f27898e, "onInitBannerFail failed with no demand source");
                return;
            }
            com.ironsource.sdk.controller.j jVar = x.this.K;
            d.e eVar = d.e.Banner;
            com.ironsource.sdk.g.c a10 = jVar.a(eVar, fetchDemandSourceId);
            if (a10 != null) {
                a10.a(3);
            }
            if (x.this.J(eVar.toString())) {
                x.this.Y(new i(d10, fetchDemandSourceId));
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onInitBannerFail", str);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(x.this.f27898e, "onInitBannerSuccess()");
            x.X(x.this, "onInitBannerSuccess", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.f27898e, "onInitBannerSuccess failed with no demand source");
            } else if (x.this.J(d.e.Banner.toString())) {
                x.this.Y(new h(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onInitInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.f27898e, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            com.ironsource.sdk.controller.j jVar = x.this.K;
            d.e eVar = d.e.Interstitial;
            com.ironsource.sdk.g.c a10 = jVar.a(eVar, fetchDemandSourceId);
            if (a10 != null) {
                a10.a(3);
            }
            if (x.this.J(eVar.toString())) {
                x.this.Y(new b0(d10, fetchDemandSourceId));
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onInitInterstitialFail", str);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(x.this.f27898e, "onInitInterstitialSuccess()");
            x.X(x.this, "onInitInterstitialSuccess", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.f27898e, "onInitInterstitialSuccess failed with no demand source");
            } else if (x.this.J(d.e.Interstitial.toString())) {
                x.this.Y(new a0(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitOfferWallFail(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onInitOfferWallFail(" + str + ")");
            x.this.H.f28136i = false;
            String d10 = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (x.this.H.f28135h) {
                x.this.H.f28135h = false;
                if (x.this.J(d.e.OfferWall.toString())) {
                    x.this.Y(new c(d10));
                }
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onInitOfferWallFail", str);
        }

        @JavascriptInterface
        public void onInitOfferWallSuccess(String str) {
            x.X(x.this, "onInitOfferWallSuccess", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
            x.this.H.f28136i = true;
            if (x.this.H.f28135h) {
                x.this.H.f28135h = false;
                if (x.this.J(d.e.OfferWall.toString())) {
                    x.this.Y(new b());
                }
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onInitRewardedVideoFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            com.ironsource.sdk.controller.j jVar = x.this.K;
            d.e eVar = d.e.RewardedVideo;
            com.ironsource.sdk.g.c a10 = jVar.a(eVar, fetchDemandSourceId);
            if (a10 != null) {
                a10.a(3);
            }
            if (x.this.J(eVar.toString())) {
                x.this.Y(new w(d10, fetchDemandSourceId));
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onInitRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(x.this.f27898e, "onLoadBannerFail()");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            x.B(x.this, str, true, null, null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && x.this.J(d.e.Banner.toString())) {
                x.this.Y(new k(d10, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(x.this.f27898e, "onLoadBannerSuccess()");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d10 = fVar.d("adViewId");
            x.B(x.this, str, true, null, null);
            com.ironsource.sdk.c.e a10 = com.ironsource.sdk.c.d.a().a(d10);
            if (a10 == null) {
                com.ironsource.sdk.j.a.b bVar = x.this.C;
                bVar.d(fetchDemandSourceId, "not found view for the current adViewId= " + d10);
            } else if (a10 instanceof com.ironsource.sdk.c.a) {
                com.ironsource.sdk.c.a aVar = (com.ironsource.sdk.c.a) a10;
                if (x.this.J(d.e.Banner.toString())) {
                    x.this.Y(new j(fetchDemandSourceId, aVar));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onLoadInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            x.B(x.this, str, true, null, null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            a(fetchDemandSourceId, false);
            if (x.this.J(d.e.Interstitial.toString())) {
                x.this.Y(new f(d10, fetchDemandSourceId));
            }
            x.X(x.this, "onLoadInterstitialFail", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onLoadInterstitialSuccess(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            a(fetchDemandSourceId, true);
            x.B(x.this, str, true, null, null);
            if (x.this.J(d.e.Interstitial.toString())) {
                x.this.Y(new e(fetchDemandSourceId));
            }
            x.X(x.this, "onLoadInterstitialSuccess", InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
        }

        @JavascriptInterface
        public void onOfferWallGeneric(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onOfferWallGeneric(" + str + ")");
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onShowInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            x.B(x.this, str, true, null, null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            a(fetchDemandSourceId, false);
            if (x.this.J(d.e.Interstitial.toString())) {
                x.this.Y(new g(d10, fetchDemandSourceId));
            }
            x.X(x.this, "onShowInterstitialFail", str);
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onShowInterstitialSuccess(" + str + ")");
            x.B(x.this, str, true, null, null);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.f27898e, "onShowInterstitialSuccess called with no demand");
                return;
            }
            com.ironsource.sdk.g.b bVar = x.this.H;
            d.e eVar = d.e.Interstitial;
            bVar.f28132e = eVar.ordinal();
            x.this.H.f28130c = fetchDemandSourceId;
            if (x.this.J(eVar.toString())) {
                x.this.Y(new d0(fetchDemandSourceId));
                x.X(x.this, "onShowInterstitialSuccess", str);
            }
            a(fetchDemandSourceId, false);
        }

        @JavascriptInterface
        public void onShowOfferWallFail(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onShowOfferWallFail(" + str + ")");
            String d10 = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (x.this.J(d.e.OfferWall.toString())) {
                x.this.Y(new z(d10));
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onShowOfferWallFail", str);
        }

        @JavascriptInterface
        public void onShowOfferWallSuccess(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onShowOfferWallSuccess(" + str + ")");
            com.ironsource.sdk.g.b bVar = x.this.H;
            d.e eVar = d.e.OfferWall;
            bVar.f28132e = eVar.ordinal();
            String valueFromJsonObject = SDKUtils.getValueFromJsonObject(str, "placementId");
            if (x.this.J(eVar.toString())) {
                x.this.Y(new y(valueFromJsonObject));
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onShowOfferWallSuccess", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onShowRewardedVideoFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (x.this.J(d.e.RewardedVideo.toString())) {
                x.this.Y(new RunnableC0348x(d10, fetchDemandSourceId));
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onShowRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onShowRewardedVideoSuccess(" + str + ")");
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onShowRewardedVideoSuccess", str);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            String str2 = x.this.f27898e;
            Log.d(str2, "onVideoStatusChanged(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("productType");
            if (x.this.G == null || TextUtils.isEmpty(d10)) {
                return;
            }
            String d11 = fVar.d("status");
            if ("started".equalsIgnoreCase(d11)) {
                x.this.G.onVideoStarted();
            } else if ("paused".equalsIgnoreCase(d11)) {
                x.this.G.onVideoPaused();
            } else if ("playing".equalsIgnoreCase(d11)) {
                x.this.G.onVideoResumed();
            } else if ("ended".equalsIgnoreCase(d11)) {
                x.this.G.onVideoEnded();
            } else if ("stopped".equalsIgnoreCase(d11)) {
                x.this.G.onVideoStopped();
            } else {
                String str3 = x.this.f27898e;
                Logger.i(str3, "onVideoStatusChanged: unknown status: " + d11);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
            if (r6 == 1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
            if (r6 == 2) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
            r1 = new android.content.Intent(r4, com.ironsource.sdk.controller.OpenUrlActivity.class);
            r1.putExtra(com.ironsource.sdk.controller.x.f27893c, r2);
            r1.putExtra(com.ironsource.sdk.controller.x.f27892b, true);
            r1.putExtra(com.ironsource.sdk.controller.x.f27894d, true);
            r4.startActivity(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
            r1 = new android.content.Intent(r4, com.ironsource.sdk.controller.OpenUrlActivity.class);
            r1.putExtra(com.ironsource.sdk.controller.x.f27893c, r2);
            r1.putExtra(com.ironsource.sdk.controller.x.f27894d, true);
            r1.putExtra("immersive", r11.f27928a.J);
            r4.startActivity(r1);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        @android.webkit.JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void openUrl(java.lang.String r12) {
            /*
                r11 = this;
                java.lang.Class<com.ironsource.sdk.controller.OpenUrlActivity> r0 = com.ironsource.sdk.controller.OpenUrlActivity.class
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.x.this
                java.lang.String r1 = com.ironsource.sdk.controller.x.N(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "openUrl("
                r2.<init>(r3)
                r2.append(r12)
                java.lang.String r3 = ")"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                com.ironsource.sdk.utils.Logger.i(r1, r2)
                com.ironsource.sdk.g.f r1 = new com.ironsource.sdk.g.f
                r1.<init>(r12)
                java.lang.String r2 = "url"
                java.lang.String r2 = r1.d(r2)
                java.lang.String r3 = "method"
                java.lang.String r3 = r1.d(r3)
                java.lang.String r4 = "package_name"
                java.lang.String r1 = r1.d(r4)
                com.ironsource.sdk.controller.x r4 = com.ironsource.sdk.controller.x.this
                com.ironsource.sdk.controller.c r4 = r4.U
                android.app.Activity r4 = r4.a()
                r5 = 0
                java.lang.String r3 = r3.toLowerCase()     // Catch: java.lang.Exception -> Lb7
                r6 = -1
                int r7 = r3.hashCode()     // Catch: java.lang.Exception -> Lb7
                r8 = -1455867212(0xffffffffa9393ab4, float:-4.112917E-14)
                r9 = 2
                r10 = 1
                if (r7 == r8) goto L6d
                r8 = 109770977(0x68af8e1, float:5.2275525E-35)
                if (r7 == r8) goto L63
                r8 = 1224424441(0x48fb3bf9, float:514527.78)
                if (r7 == r8) goto L59
                goto L76
            L59:
                java.lang.String r7 = "webview"
                boolean r3 = r3.equals(r7)     // Catch: java.lang.Exception -> Lb7
                if (r3 == 0) goto L76
                r6 = 1
                goto L76
            L63:
                java.lang.String r7 = "store"
                boolean r3 = r3.equals(r7)     // Catch: java.lang.Exception -> Lb7
                if (r3 == 0) goto L76
                r6 = 2
                goto L76
            L6d:
                java.lang.String r7 = "external_browser"
                boolean r3 = r3.equals(r7)     // Catch: java.lang.Exception -> Lb7
                if (r3 == 0) goto L76
                r6 = 0
            L76:
                if (r6 == 0) goto Lb3
                if (r6 == r10) goto L95
                if (r6 == r9) goto L7d
                goto L94
            L7d:
                android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> Lb7
                r1.<init>(r4, r0)     // Catch: java.lang.Exception -> Lb7
                java.lang.String r0 = com.ironsource.sdk.controller.x.f27893c     // Catch: java.lang.Exception -> Lb7
                r1.putExtra(r0, r2)     // Catch: java.lang.Exception -> Lb7
                java.lang.String r0 = com.ironsource.sdk.controller.x.f27892b     // Catch: java.lang.Exception -> Lb7
                r1.putExtra(r0, r10)     // Catch: java.lang.Exception -> Lb7
                java.lang.String r0 = com.ironsource.sdk.controller.x.f27894d     // Catch: java.lang.Exception -> Lb7
                r1.putExtra(r0, r10)     // Catch: java.lang.Exception -> Lb7
                r4.startActivity(r1)     // Catch: java.lang.Exception -> Lb7
            L94:
                return
            L95:
                android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Exception -> Lb7
                r1.<init>(r4, r0)     // Catch: java.lang.Exception -> Lb7
                java.lang.String r0 = com.ironsource.sdk.controller.x.f27893c     // Catch: java.lang.Exception -> Lb7
                r1.putExtra(r0, r2)     // Catch: java.lang.Exception -> Lb7
                java.lang.String r0 = com.ironsource.sdk.controller.x.f27894d     // Catch: java.lang.Exception -> Lb7
                r1.putExtra(r0, r10)     // Catch: java.lang.Exception -> Lb7
                java.lang.String r0 = "immersive"
                com.ironsource.sdk.controller.x r2 = com.ironsource.sdk.controller.x.this     // Catch: java.lang.Exception -> Lb7
                boolean r2 = com.ironsource.sdk.controller.x.G0(r2)     // Catch: java.lang.Exception -> Lb7
                r1.putExtra(r0, r2)     // Catch: java.lang.Exception -> Lb7
                r4.startActivity(r1)     // Catch: java.lang.Exception -> Lb7
                goto Lc5
            Lb3:
                com.ironsource.environment.a.AnonymousClass1.a(r4, r2, r1)     // Catch: java.lang.Exception -> Lb7
                goto Lc5
            Lb7:
                r0 = move-exception
                com.ironsource.sdk.controller.x r1 = com.ironsource.sdk.controller.x.this
                java.lang.String r2 = r0.getMessage()
                r3 = 0
                com.ironsource.sdk.controller.x.B(r1, r12, r5, r2, r3)
                r0.printStackTrace()
            Lc5:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.d.openUrl(java.lang.String):void");
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            x.this.E(new RunnableC0347d());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            com.ironsource.sdk.g.f fVar;
            String str2;
            try {
                String str3 = x.this.f27898e;
                Logger.i(str3, "permissionsAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar2 = new com.ironsource.sdk.g.f(str);
                com.ironsource.sdk.controller.r rVar = x.this.M;
                String fVar3 = fVar2.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar3);
                r.a aVar2 = new r.a((byte) 0);
                aVar2.f27867a = jSONObject.optString("functionName");
                aVar2.f27868b = jSONObject.optJSONObject("functionParams");
                aVar2.f27869c = jSONObject.optString("success");
                aVar2.f27870d = jSONObject.optString("fail");
                if ("getPermissions".equals(aVar2.f27867a)) {
                    JSONObject jSONObject2 = aVar2.f27868b;
                    fVar = new com.ironsource.sdk.g.f();
                    try {
                        fVar.a("permissions", com.ironsource.environment.c.a(rVar.f27866a, jSONObject2.getJSONArray("permissions")));
                        aVar.a(true, aVar2.f27869c, fVar);
                        return;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                        String str4 = com.ironsource.sdk.controller.r.f27865b;
                        Logger.i(str4, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e10.getMessage());
                        fVar.a("errMsg", e10.getMessage());
                        str2 = aVar2.f27870d;
                        aVar.a(false, str2, fVar);
                        return;
                    }
                } else if (!"isPermissionGranted".equals(aVar2.f27867a)) {
                    String str5 = com.ironsource.sdk.controller.r.f27865b;
                    Logger.i(str5, "PermissionsJSAdapter unhandled API request " + fVar3);
                    return;
                } else {
                    JSONObject jSONObject3 = aVar2.f27868b;
                    fVar = new com.ironsource.sdk.g.f();
                    try {
                        String string = jSONObject3.getString("permission");
                        fVar.a("permission", string);
                        if (com.ironsource.environment.c.a(rVar.f27866a, string)) {
                            fVar.a("status", String.valueOf(com.ironsource.environment.c.b(rVar.f27866a, string)));
                            aVar.a(true, aVar2.f27869c, fVar);
                            return;
                        }
                        fVar.a("status", "unhandledPermission");
                        aVar.a(false, aVar2.f27870d, fVar);
                        return;
                    } catch (Exception e11) {
                        e11.printStackTrace();
                        fVar.a("errMsg", e11.getMessage());
                        str2 = aVar2.f27870d;
                        aVar.a(false, str2, fVar);
                        return;
                    }
                }
            } catch (Exception e12) {
                e12.printStackTrace();
                String str6 = x.this.f27898e;
                Logger.i(str6, "permissionsAPI failed with exception " + e12.getMessage());
            }
            e12.printStackTrace();
            String str62 = x.this.f27898e;
            Logger.i(str62, "permissionsAPI failed with exception " + e12.getMessage());
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            try {
                String str2 = x.this.f27898e;
                Logger.i(str2, "postAdEventNotification(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d10 = fVar.d("eventName");
                if (TextUtils.isEmpty(d10)) {
                    x.B(x.this, str, false, "eventName does not exist", null);
                    return;
                }
                String d11 = fVar.d("dsName");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                String str3 = !TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d11;
                JSONObject jSONObject = (JSONObject) fVar.c("extData");
                String d12 = fVar.d("productType");
                d.e e02 = x.e0(x.this, d12);
                if (!x.this.J(d12)) {
                    x.B(x.this, str, false, "productType does not exist", null);
                    return;
                }
                String O = x.O(x.this, str);
                if (!TextUtils.isEmpty(O)) {
                    x.this.b(x.u(x.this, O, x.v(x.this, "productType", d12, "eventName", d10, "demandSourceName", d11, "demandSourceId", str3, null, false), "postAdEventNotificationSuccess", "postAdEventNotificationFail"));
                }
                x.this.Y(new n(e02, str3, d10, jSONObject));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "removeCloseEventHandler(" + str + ")");
            if (x.this.f27908o != null) {
                x.this.f27908o.cancel();
            }
            x.this.f27907n = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            x.this.E(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            x.this.E(new l());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                String str2 = x.this.f27898e;
                Logger.i(str2, "saveFile(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d10 = fVar.d("path");
                String d11 = fVar.d("file");
                if (TextUtils.isEmpty(d11)) {
                    x.B(x.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(x.this.E, d10), SDKUtils.getFileName(d11));
                if (com.ironsource.environment.h.a(x.this.E) <= 0) {
                    x.B(x.this, str, false, "no_disk_space", null);
                } else if (!SDKUtils.isExternalStorageAvailable()) {
                    x.B(x.this, str, false, "sotrage_unavailable", null);
                } else if (cVar.exists()) {
                    x.B(x.this, str, false, "file_already_exist", null);
                } else if (!a.AnonymousClass1.b(x.this.getContext())) {
                    x.B(x.this, str, false, "no_network_connection", null);
                } else {
                    x.B(x.this, str, true, null, null);
                    com.ironsource.sdk.k.b bVar = x.this.f27904k;
                    bVar.a(cVar, d11, bVar.f28202a);
                }
            } catch (Exception e10) {
                x.B(x.this, str, false, e10.getMessage(), null);
                e10.printStackTrace();
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "setBackButtonState(" + str + ")");
            String d10 = new com.ironsource.sdk.g.f(str).d("state");
            SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().f28257a.edit();
            edit.putString("back_button_state", d10);
            edit.apply();
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "setForceClose(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d10 = fVar.d("width");
            String d11 = fVar.d("height");
            x.this.f27909p = Integer.parseInt(d10);
            x.this.f27910q = Integer.parseInt(d11);
            x.this.f27911r = fVar.d("position");
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "setMixedContentAlwaysAllow(" + str + ")");
            x.this.E(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "setOrientation(" + str + ")");
            String d10 = new com.ironsource.sdk.g.f(str).d(AdUnitActivity.EXTRA_ORIENTATION);
            x xVar = x.this;
            xVar.f27918y = d10;
            if (xVar.V != null) {
                x.this.V.onOrientationChanged(d10, com.ironsource.environment.h.k(x.this.getContext()));
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "setStoreSearchKeys(" + str + ")");
            SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().f28257a.edit();
            edit.putString("search_keys", str);
            edit.apply();
        }

        @JavascriptInterface
        public void setTouchListener(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "removeCloseEventHandler(" + str + ")");
            x.this.E(new v());
        }

        @JavascriptInterface
        public void setUserData(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "setUserData(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (!fVar.a("key")) {
                x.B(x.this, str, false, "key does not exist", null);
            } else if (!fVar.a(AppMeasurementSdk.ConditionalUserProperty.VALUE)) {
                x.B(x.this, str, false, "value does not exist", null);
            } else {
                String d10 = fVar.d("key");
                String d11 = fVar.d(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().f28257a.edit();
                edit.putString(d10, d11);
                edit.apply();
                x.this.b(x.t(x.this, x.O(x.this, str), x.v(x.this, d10, d11, null, null, null, null, null, null, null, false)));
            }
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            String str2 = x.this.f27898e;
            Logger.i(str2, "setWebviewBackgroundColor(" + str + ")");
            x.j0(x.this, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class e extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ int f28004a;

        /* loaded from: classes3.dex */
        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.S.a("controller html - failed to load into web-view");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, long j11, int i10) {
            super(50000L, 1000L);
            this.f28004a = i10;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            Logger.i(x.this.f27898e, "Loading Controller Timer Finish");
            int i10 = this.f28004a;
            if (i10 == 3) {
                x.this.Y(new a());
            } else {
                x.this.a(i10 + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j10) {
            String str = x.this.f27898e;
            Logger.i(str, "Loading Controller Timer Tick " + j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class f implements InterfaceC0349x {
        f() {
        }

        @Override // com.ironsource.sdk.controller.x.InterfaceC0349x
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.A(x.this, str, eVar, cVar);
        }
    }

    /* loaded from: classes3.dex */
    public enum g {
        Display,
        Gone
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class h implements InterfaceC0349x {
        h() {
        }

        @Override // com.ironsource.sdk.controller.x.InterfaceC0349x
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.A(x.this, str, eVar, cVar);
        }
    }

    /* loaded from: classes3.dex */
    final class i implements InterfaceC0349x {
        i() {
        }

        @Override // com.ironsource.sdk.controller.x.InterfaceC0349x
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.A(x.this, str, eVar, cVar);
        }
    }

    /* loaded from: classes3.dex */
    final class j implements InterfaceC0349x {
        j() {
        }

        @Override // com.ironsource.sdk.controller.x.InterfaceC0349x
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.A(x.this, str, eVar, cVar);
        }
    }

    /* loaded from: classes3.dex */
    final class k implements InterfaceC0349x {
        k() {
        }

        @Override // com.ironsource.sdk.controller.x.InterfaceC0349x
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.A(x.this, str, eVar, cVar);
        }
    }

    /* loaded from: classes3.dex */
    final class l extends com.ironsource.sdk.service.Connectivity.b {
        l(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.sdk.service.Connectivity.b, com.ironsource.sdk.service.Connectivity.d
        public final void a() {
            if (x.this.f27905l) {
                x.this.d("none");
            }
        }

        @Override // com.ironsource.sdk.service.Connectivity.b, com.ironsource.sdk.service.Connectivity.d
        public final void a(String str) {
            if (x.this.f27905l) {
                x.this.d(str);
            }
        }

        @Override // com.ironsource.sdk.service.Connectivity.b, com.ironsource.sdk.service.Connectivity.d
        public final void a(String str, JSONObject jSONObject) {
            if (jSONObject == null || !x.this.f27905l) {
                return;
            }
            try {
                jSONObject.put("connectionType", str);
                x xVar = x.this;
                String str2 = xVar.f27898e;
                Logger.i(str2, "device connection info changed: " + jSONObject.toString());
                xVar.b(x.b("connectionInfoChanged", x.a("connectionInfo", jSONObject.toString(), null, null, null, null, null, null, null, false)));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ d.e f28016a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.c f28017b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ String f28018c;

        m(d.e eVar, com.ironsource.sdk.g.c cVar, String str) {
            this.f28016a = eVar;
            this.f28017b = cVar;
            this.f28018c = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.e eVar = d.e.RewardedVideo;
            d.e eVar2 = this.f28016a;
            if (eVar != eVar2 && d.e.Interstitial != eVar2 && d.e.Banner != eVar2) {
                if (d.e.OfferWall == eVar2) {
                    x.this.B.onOfferwallInitFail(this.f28018c);
                    return;
                } else if (d.e.OfferWallCredits == eVar2) {
                    x.this.B.onGetOWCreditsFailed(this.f28018c);
                    return;
                } else {
                    return;
                }
            }
            com.ironsource.sdk.g.c cVar = this.f28017b;
            if (cVar == null || TextUtils.isEmpty(cVar.f28143b)) {
                return;
            }
            com.ironsource.sdk.j.a.a M = x.this.M(this.f28016a);
            String str = x.this.f27898e;
            Log.d(str, "onAdProductInitFailed (message:" + this.f28018c + ")(" + this.f28016a + ")");
            if (M != null) {
                M.a(this.f28016a, this.f28017b.f28143b, this.f28018c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ StringBuilder f28020a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f28021b;

        n(StringBuilder sb2, String str) {
            this.f28020a = sb2;
            this.f28021b = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (x.this.D != null) {
                    if (x.this.D.booleanValue()) {
                        x.this.evaluateJavascript(this.f28020a.toString(), null);
                    } else {
                        x.this.loadUrl(this.f28021b);
                    }
                } else if (Build.VERSION.SDK_INT >= 19) {
                    x.this.evaluateJavascript(this.f28020a.toString(), null);
                    x.this.D = Boolean.TRUE;
                } else {
                    x.this.loadUrl(this.f28021b);
                    x.this.D = Boolean.FALSE;
                }
            } catch (Throwable th) {
                String str = x.this.f27898e;
                Logger.e(str, "injectJavascript: " + th.toString());
            }
        }
    }

    /* loaded from: classes3.dex */
    final class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x.this.a(1);
        }
    }

    /* loaded from: classes3.dex */
    final class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x.this.a(1);
        }
    }

    /* loaded from: classes3.dex */
    final class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ com.ironsource.sdk.g.e f28025a;

        q(com.ironsource.sdk.g.e eVar) {
            this.f28025a = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.controller.e eVar = x.this.S;
            eVar.a("controller html - failed to download - " + this.f28025a.f28187a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class r implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ String f28027a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ String f28028b;

        r(String str, String str2) {
            this.f28027a = str;
            this.f28028b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (x.b() == d.EnumC0353d.MODE_3.f28179d) {
                Activity a10 = x.this.U.a();
                Toast.makeText(a10, this.f28027a + " : " + this.f28028b, 1).show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class s implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Context f28030a;

        s(Context context) {
            this.f28030a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            x.Q(x.this, this.f28030a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class t implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Context f28032a;

        t(Context context) {
            this.f28032a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            x.W(x.this, this.f28032a);
        }
    }

    /* loaded from: classes3.dex */
    class u extends WebChromeClient {
        private u() {
        }

        /* synthetic */ u(x xVar, byte b10) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public final View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(x.this.U.a());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new w(x.this, (byte) 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            if (x.this.f27913t == null) {
                return;
            }
            x.this.f27913t.setVisibility(8);
            x.this.f27914u.removeView(x.this.f27913t);
            x.this.f27913t = null;
            x.this.f27914u.setVisibility(8);
            x.this.f27915v.onCustomViewHidden();
            x.this.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            x.this.setVisibility(8);
            if (x.this.f27913t != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            x.this.f27914u.addView(view);
            x.this.f27913t = view;
            x.this.f27915v = customViewCallback;
            x.this.f27914u.setVisibility(0);
        }
    }

    /* loaded from: classes3.dex */
    static class v {

        /* renamed from: a  reason: collision with root package name */
        d.e f28035a;

        /* renamed from: b  reason: collision with root package name */
        String f28036b;

        public v(d.e eVar, String str) {
            this.f28035a = eVar;
            this.f28036b = str;
        }
    }

    /* loaded from: classes3.dex */
    class w extends WebViewClient {
        private w() {
        }

        /* synthetic */ w(x xVar, byte b10) {
            this();
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str = x.this.f27898e;
            Logger.e(str, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Activity a10 = x.this.U.a();
            Intent intent = new Intent(a10, OpenUrlActivity.class);
            intent.putExtra(x.f27893c, str);
            intent.putExtra(x.f27894d, false);
            a10.startActivity(intent);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.sdk.controller.x$x  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0349x {
        void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class y {

        /* renamed from: a  reason: collision with root package name */
        String f28038a;

        y() {
        }
    }

    /* loaded from: classes3.dex */
    class z implements View.OnTouchListener {

        /* loaded from: classes3.dex */
        final class a extends CountDownTimer {
            a(long j10, long j11) {
                super(Constants.MIN_PROGRESS_TIME, 500L);
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                Logger.i(x.this.f27898e, "Close Event Timer Finish");
                if (x.this.f27907n) {
                    x.this.f27907n = false;
                } else {
                    x.this.e("forceClose");
                }
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j10) {
                String str = x.this.f27898e;
                Logger.i(str, "Close Event Timer Tick " + j10);
            }
        }

        private z() {
        }

        /* synthetic */ z(x xVar, byte b10) {
            this();
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                String str = x.this.f27898e;
                StringBuilder sb2 = new StringBuilder("X:");
                int i10 = (int) x10;
                sb2.append(i10);
                sb2.append(" Y:");
                int i11 = (int) y10;
                sb2.append(i11);
                Logger.i(str, sb2.toString());
                int m10 = com.ironsource.environment.h.m();
                int n10 = com.ironsource.environment.h.n();
                String str2 = x.this.f27898e;
                Logger.i(str2, "Width:" + m10 + " Height:" + n10);
                int dpToPx = SDKUtils.dpToPx((long) x.this.f27909p);
                int dpToPx2 = SDKUtils.dpToPx((long) x.this.f27910q);
                if (de.DEFAULT_POSITION.equalsIgnoreCase(x.this.f27911r)) {
                    i10 = m10 - i10;
                } else if (!"top-left".equalsIgnoreCase(x.this.f27911r)) {
                    if ("bottom-right".equalsIgnoreCase(x.this.f27911r)) {
                        i10 = m10 - i10;
                    } else if (!"bottom-left".equalsIgnoreCase(x.this.f27911r)) {
                        i10 = 0;
                        i11 = 0;
                    }
                    i11 = n10 - i11;
                }
                if (i10 <= dpToPx && i11 <= dpToPx2) {
                    x.this.f27907n = false;
                    if (x.this.f27908o != null) {
                        x.this.f27908o.cancel();
                    }
                    x.this.f27908o = new a(Constants.MIN_PROGRESS_TIME, 500L).start();
                }
            }
            return false;
        }
    }

    public x(Context context, com.ironsource.sdk.controller.j jVar, com.ironsource.sdk.controller.c cVar, com.ironsource.sdk.controller.e eVar, com.ironsource.environment.e.a aVar) {
        super(context);
        String simpleName = x.class.getSimpleName();
        this.f27898e = simpleName;
        this.f27900g = IronSourceConstants.IRONSOURCE_CONFIG_NAME;
        this.f27909p = 50;
        this.f27910q = 50;
        this.f27911r = de.DEFAULT_POSITION;
        this.D = null;
        this.I = new Object();
        this.J = false;
        Logger.i(simpleName, "C'tor");
        this.U = cVar;
        this.S = eVar;
        this.f27897a = aVar;
        this.E = IronSourceStorageUtils.getNetworkStorageDir(context);
        this.K = jVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f27916w = new FrameLayout(context);
        this.f27914u = new FrameLayout(context);
        this.f27914u.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f27914u.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this);
        this.f27916w.addView(this.f27914u, layoutParams);
        this.f27916w.addView(frameLayout);
        this.H = new com.ironsource.sdk.g.b();
        com.ironsource.sdk.k.b r10 = r();
        this.f27904k = r10;
        r10.f28202a.f28200a = this;
        this.F = new com.ironsource.sdk.controller.f(SDKUtils.getNetworkConfiguration(), this.E, SDKUtils.getControllerUrl(), this.f27904k);
        this.f27912s = new u(this, (byte) 0);
        setWebViewClient(new a0(this, (byte) 0));
        setWebChromeClient(this.f27912s);
        com.ironsource.sdk.utils.d.a(this);
        com.ironsource.sdk.controller.t tVar = new com.ironsource.sdk.controller.t(UUID.randomUUID().toString());
        addJavascriptInterface(new com.ironsource.sdk.controller.h(new com.ironsource.sdk.controller.d(new d()), tVar), "Android");
        addJavascriptInterface(new com.ironsource.sdk.controller.s(tVar), "GenerateTokenForMessaging");
        setDownloadListener(this);
        this.T = new l(SDKUtils.getControllerConfigAsJSONObject(), context);
        a(context);
        W = FeaturesManager.getInstance().getDebugMode();
    }

    static /* synthetic */ void A(x xVar, String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
        if (xVar.J(eVar.toString())) {
            xVar.Y(new m(eVar, cVar, str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void B(com.ironsource.sdk.controller.x r3, java.lang.String r4, boolean r5, java.lang.String r6, java.lang.String r7) {
        /*
            com.ironsource.sdk.g.f r0 = new com.ironsource.sdk.g.f
            r0.<init>(r4)
            java.lang.String r1 = com.ironsource.sdk.controller.x.f27895g0
            java.lang.String r1 = r0.d(r1)
            java.lang.String r2 = com.ironsource.sdk.controller.x.f27896h0
            java.lang.String r0 = r0.d(r2)
            if (r5 == 0) goto L1a
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L22
            goto L23
        L1a:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L22
            r1 = r0
            goto L23
        L22:
            r1 = 0
        L23:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L5c
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L40
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3f
            r5.<init>(r4)     // Catch: org.json.JSONException -> L3f
            java.lang.String r0 = "errMsg"
            org.json.JSONObject r5 = r5.put(r0, r6)     // Catch: org.json.JSONException -> L3f
            java.lang.String r4 = r5.toString()     // Catch: org.json.JSONException -> L3f
            goto L40
        L3f:
        L40:
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto L55
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L55
            r5.<init>(r4)     // Catch: org.json.JSONException -> L55
            java.lang.String r6 = "errCode"
            org.json.JSONObject r5 = r5.put(r6, r7)     // Catch: org.json.JSONException -> L55
            java.lang.String r4 = r5.toString()     // Catch: org.json.JSONException -> L55
        L55:
            java.lang.String r4 = b(r1, r4)
            r3.b(r4)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.B(com.ironsource.sdk.controller.x, java.lang.String, boolean, java.lang.String, java.lang.String):void");
    }

    static /* synthetic */ void C(x xVar, JSONObject jSONObject) {
        if (!jSONObject.optBoolean("inspectWebview") || Build.VERSION.SDK_INT < 19) {
            return;
        }
        WebView.setWebContentsDebuggingEnabled(true);
    }

    private void F(String str, String str2, d.e eVar, com.ironsource.sdk.g.c cVar, InterfaceC0349x interfaceC0349x) {
        String str3;
        String x10;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            interfaceC0349x.a("User id or Application key are missing", eVar, cVar);
            return;
        }
        y yVar = new y();
        d.e eVar2 = d.e.RewardedVideo;
        if (eVar != eVar2 && eVar != d.e.Interstitial && eVar != d.e.OfferWall && eVar != d.e.Banner) {
            if (eVar == d.e.OfferWallCredits) {
                x10 = x("getUserCredits", a("productType", "OfferWall", "applicationKey", this.f27901h, "applicationUserId", this.f27902i, null, null, null, false), "null", "onGetUserCreditsFail");
            }
            b(yVar.f28038a);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("applicationKey", this.f27901h);
        hashMap.put("applicationUserId", this.f27902i);
        if (cVar != null) {
            Map<String, String> map = cVar.f28145d;
            if (map != null) {
                hashMap.putAll(map);
                com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.f28229a;
                hashMap.put("loadStartTime", String.valueOf(com.ironsource.sdk.service.a.a(cVar.f28143b)));
            }
            hashMap.put("demandSourceName", cVar.f28142a);
            hashMap.put("demandSourceId", cVar.f28143b);
        }
        Map<String, String> y10 = y(eVar);
        if (y10 != null) {
            hashMap.putAll(y10);
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        a.C0352a c0352a = new a.C0352a();
        if (eVar == eVar2) {
            c0352a.f28115a = "initRewardedVideo";
            c0352a.f28116b = "onInitRewardedVideoSuccess";
            str3 = "onInitRewardedVideoFail";
        } else if (eVar == d.e.Interstitial) {
            c0352a.f28115a = "initInterstitial";
            c0352a.f28116b = "onInitInterstitialSuccess";
            str3 = "onInitInterstitialFail";
        } else if (eVar == d.e.OfferWall) {
            c0352a.f28115a = "initOfferWall";
            c0352a.f28116b = "onInitOfferWallSuccess";
            str3 = "onInitOfferWallFail";
        } else {
            if (eVar == d.e.Banner) {
                c0352a.f28115a = "initBanner";
                c0352a.f28116b = "onInitBannerSuccess";
                str3 = "onInitBannerFail";
            }
            x10 = x(c0352a.f28115a, flatMapToJsonAsString, c0352a.f28116b, c0352a.f28117c);
        }
        c0352a.f28117c = str3;
        x10 = x(c0352a.f28115a, flatMapToJsonAsString, c0352a.f28116b, c0352a.f28117c);
        yVar.f28038a = x10;
        b(yVar.f28038a);
    }

    private void G(String str, String str2, String str3) {
        try {
            b(b("assetCachedFailed", a("file", str, "path", p0(str2), "errMsg", str3, null, null, null, false)));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.ironsource.sdk.j.a.a M(d.e eVar) {
        if (eVar == d.e.Interstitial) {
            return this.A;
        }
        if (eVar == d.e.RewardedVideo) {
            return this.f27919z;
        }
        if (eVar == d.e.Banner) {
            return this.C;
        }
        return null;
    }

    static /* synthetic */ String O(x xVar, String str) {
        return new com.ironsource.sdk.g.f(str).d(f27895g0);
    }

    private String P(JSONObject jSONObject) {
        com.ironsource.sdk.utils.a a10 = com.ironsource.sdk.utils.a.a(getContext());
        StringBuilder sb2 = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            sb2.append("SDKVersion=");
            sb2.append(sDKVersion);
            sb2.append("&");
        }
        String str = a10.f28252c;
        if (!TextUtils.isEmpty(str)) {
            sb2.append("deviceOs=");
            sb2.append(str);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str2 = parse.getScheme() + ":";
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + ":" + port;
            }
            sb2.append("&protocol");
            sb2.append("=");
            sb2.append(str2);
            sb2.append("&domain");
            sb2.append("=");
            sb2.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{"isSecured", "applicationKey"}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb2.append("&controllerConfig");
                        sb2.append("=");
                        sb2.append(jSONObject2);
                    }
                } catch (JSONException e10) {
                    e10.printStackTrace();
                }
            }
            sb2.append("&debug");
            sb2.append("=");
            sb2.append(W);
        }
        return sb2.toString();
    }

    static /* synthetic */ void Q(x xVar, Context context) {
        try {
            com.ironsource.sdk.service.Connectivity.b bVar = xVar.T;
            if (bVar == null) {
                return;
            }
            bVar.f28222a.a(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static /* synthetic */ boolean S(x xVar, boolean z10) {
        xVar.f27905l = true;
        return true;
    }

    static /* synthetic */ String V(x xVar, String str) {
        return new com.ironsource.sdk.g.f(str).d(f27896h0);
    }

    static /* synthetic */ void W(x xVar, Context context) {
        try {
            com.ironsource.sdk.service.Connectivity.b bVar = xVar.T;
            if (bVar == null) {
                return;
            }
            bVar.f28222a.b(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static /* synthetic */ void X(x xVar, String str, String str2) {
        String d10 = new com.ironsource.sdk.g.f(str2).d("errMsg");
        if (TextUtils.isEmpty(d10)) {
            return;
        }
        xVar.E(new r(str, d10));
    }

    public static String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z10);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] a0(Context context) {
        boolean z10;
        com.ironsource.sdk.utils.a a10 = com.ironsource.sdk.utils.a.a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appOrientation", "none");
            jSONObject.put("deviceOrientation", SDKUtils.translateDeviceOrientation(com.ironsource.environment.h.o(context)));
            String str = a10.f28250a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a10.f28251b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
                z10 = false;
            } else {
                z10 = true;
            }
        } catch (JSONException e10) {
            e = e10;
            z10 = false;
        }
        try {
            SDKUtils.loadGoogleAdvertiserInfo(context);
            String advertiserId = SDKUtils.getAdvertiserId();
            Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(this.f27898e, "add AID and LAT");
                jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            String str3 = a10.f28252c;
            if (str3 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
            } else {
                z10 = true;
            }
            String str4 = a10.f28253d;
            if (str4 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
            } else {
                z10 = true;
            }
            String str5 = a10.f28253d;
            if (str5 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
            }
            String valueOf2 = String.valueOf(a10.f28254e);
            if (valueOf2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), valueOf2);
            } else {
                z10 = true;
            }
            String sDKVersion = SDKUtils.getSDKVersion();
            if (sDKVersion != null) {
                jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(sDKVersion));
            }
            String str6 = a10.f28255f;
            if (str6 != null && str6.length() > 0) {
                jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a10.f28255f));
            }
            String a11 = com.ironsource.d.a.a(context);
            if (a11.equals("none")) {
                z10 = true;
            } else {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a11));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject.put(SDKUtils.encodeString("hasVPN"), com.ironsource.d.a.c(context));
            }
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
            }
            if (SDKUtils.isExternalStorageAvailable()) {
                jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.a(this.E))));
            } else {
                z10 = true;
            }
            String valueOf3 = String.valueOf(com.ironsource.environment.h.m());
            if (TextUtils.isEmpty(valueOf3)) {
                z10 = true;
            } else {
                jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString("width") + "]", SDKUtils.encodeString(valueOf3));
            }
            String valueOf4 = String.valueOf(com.ironsource.environment.h.n());
            jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString("height") + "]", SDKUtils.encodeString(valueOf4));
            String packageName = getContext().getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
            }
            String valueOf5 = String.valueOf(com.ironsource.environment.h.o());
            if (!TextUtils.isEmpty(valueOf5)) {
                jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf5));
            }
            String valueOf6 = String.valueOf(com.ironsource.environment.h.j());
            if (!TextUtils.isEmpty(valueOf6)) {
                jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf6));
            }
            com.ironsource.sdk.utils.a.a(context);
            jSONObject.put(SDKUtils.encodeString("deviceVolume"), com.ironsource.sdk.utils.a.b(context));
            jSONObject.put(SDKUtils.encodeString("batteryLevel"), com.ironsource.environment.h.v(context));
            jSONObject.put(SDKUtils.encodeString("mcc"), a.AnonymousClass1.c(context));
            jSONObject.put(SDKUtils.encodeString("mnc"), a.AnonymousClass1.d(context));
            jSONObject.put(SDKUtils.encodeString("phoneType"), a.AnonymousClass1.f(context));
            jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(a.AnonymousClass1.e(context)));
            jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), com.ironsource.environment.c.b(context));
            jSONObject.put(SDKUtils.encodeString("firstInstallTime"), com.ironsource.environment.c.a(context));
            jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(com.ironsource.environment.c.c(context)));
            String d10 = com.ironsource.environment.c.d(context);
            if (!TextUtils.isEmpty(d10)) {
                jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d10));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), com.ironsource.environment.k.a(getContext()));
            jSONObject.put(SDKUtils.encodeString("screenBrightness"), com.ironsource.environment.h.z(context));
        } catch (JSONException e11) {
            e = e11;
            e.printStackTrace();
            return new Object[]{jSONObject.toString(), Boolean.valueOf(z10)};
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z10)};
    }

    public static int b() {
        return W;
    }

    public static String b(String str, String str2) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "');";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] b0(String str, String str2) {
        boolean z10;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = null;
        if (TextUtils.isEmpty(str)) {
            z10 = true;
        } else {
            d.e m02 = m0(str);
            if (m02 == d.e.OfferWall) {
                map = this.f27903j;
            } else {
                com.ironsource.sdk.g.c a10 = this.K.a(m02, str2);
                if (a10 != null) {
                    Map<String, String> map2 = a10.f28145d;
                    map2.put("demandSourceName", a10.f28142a);
                    map2.put("demandSourceId", a10.f28143b);
                    map = map2;
                }
            }
            try {
                jSONObject.put("productType", str);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            z10 = false;
        }
        if (TextUtils.isEmpty(this.f27902i)) {
            z10 = true;
        } else {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationUserId"), SDKUtils.encodeString(this.f27902i));
            } catch (JSONException e12) {
                e12.printStackTrace();
            }
        }
        if (TextUtils.isEmpty(this.f27901h)) {
            z10 = true;
        } else {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationKey"), SDKUtils.encodeString(this.f27901h));
            } catch (JSONException e13) {
                e13.printStackTrace();
            }
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    if (entry.getValue().equalsIgnoreCase("0")) {
                        getSettings().setCacheMode(2);
                    } else {
                        getSettings().setCacheMode(-1);
                    }
                }
                try {
                    jSONObject.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e14) {
                    e14.printStackTrace();
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z10)};
    }

    static /* synthetic */ d.e e0(x xVar, String str) {
        return m0(str);
    }

    static String i0(String str) {
        return "SSA_CORE.SDKController.runFunction('" + str + "');";
    }

    static /* synthetic */ void j0(x xVar, String str) {
        com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
        String d10 = fVar.d("color");
        String d11 = fVar.d("adViewId");
        int parseColor = !"transparent".equalsIgnoreCase(d10) ? Color.parseColor(d10) : 0;
        if (d11 == null) {
            xVar.setBackgroundColor(parseColor);
            return;
        }
        WebView b10 = com.ironsource.sdk.c.d.a().a(d11).b();
        if (b10 != null) {
            b10.setBackgroundColor(parseColor);
        }
    }

    private static d.e m0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d.e eVar = d.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        d.e eVar2 = d.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        d.e eVar3 = d.e.OfferWall;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        d.e eVar4 = d.e.Banner;
        if (str.equalsIgnoreCase(eVar4.toString())) {
            return eVar4;
        }
        return null;
    }

    static /* synthetic */ void n0(x xVar, String str) {
        try {
            String str2 = xVar.f27898e;
            Logger.i(str2, "load(): " + str);
            xVar.loadUrl(str);
        } catch (Throwable th) {
            String str3 = xVar.f27898e;
            Logger.e(str3, "WebViewController::load: " + th);
        }
    }

    private String p0(String str) {
        String str2 = this.E + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    static /* synthetic */ String t(x xVar, String str, String str2) {
        return b(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String u(x xVar, String str, String str2, String str3, String str4) {
        return x(str, str2, str3, str4);
    }

    static /* synthetic */ String v(x xVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10) {
        return a(str, str2, str3, str4, str5, str6, str7, str8, null, false);
    }

    private String w(d.e eVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.toString(jSONObject.optInt(IronSourceConstants.KEY_SESSION_DEPTH)));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        com.ironsource.sdk.g.c a10 = this.K.a(eVar, fetchDemandSourceId);
        if (a10 != null) {
            Map<String, String> map = a10.f28145d;
            if (map != null) {
                hashMap.putAll(map);
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        Map<String, String> y10 = y(eVar);
        if (y10 != null) {
            hashMap.putAll(y10);
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        a.C0352a a11 = a.C0352a.a(eVar);
        return x(a11.f28115a, flatMapToJsonAsString, a11.f28116b, a11.f28117c);
    }

    private static String x(String str, String str2, String str3, String str4) {
        return "SSA_CORE.SDKController.runFunction('" + str + "?parameters=" + str2 + "','" + str3 + "','" + str4 + "');";
    }

    private Map<String, String> y(d.e eVar) {
        if (eVar == d.e.OfferWall) {
            return this.f27903j;
        }
        return null;
    }

    final void D(d.e eVar, String str) {
        Y(new a(eVar, str));
    }

    final void E(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.f27897a;
        if (aVar != null) {
            aVar.a(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean J(String str) {
        boolean z10 = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.f27898e, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(d.e.Interstitial.toString()) ? !str.equalsIgnoreCase(d.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(d.e.Banner.toString()) ? (str.equalsIgnoreCase(d.e.OfferWall.toString()) || str.equalsIgnoreCase(d.e.OfferWallCredits.toString())) && this.B != null : this.C != null : this.f27919z != null : this.A != null) {
            z10 = true;
        }
        if (!z10) {
            String str2 = this.f27898e;
            Logger.d(str2, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z10;
    }

    final void R(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.f27897a;
        if (aVar != null) {
            aVar.b(runnable);
        }
    }

    final void Y(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.f27897a;
        if (aVar != null) {
            aVar.c(runnable);
        }
    }

    public final void a(int i10) {
        if (!this.F.c()) {
            Logger.i(this.f27898e, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String P = P(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            P = String.format("%s&sessionid=%s", P, initSDKParams.get("sessionid"));
        }
        String uri = this.F.f().toURI().toString();
        this.f27897a.a(new c(controllerConfigAsJSONObject, uri + "?" + P));
        this.f27899f = new e(50000L, 1000L, i10).start();
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Context context) {
        R(new s(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.ironsource.sdk.g.b r11) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.x.a(com.ironsource.sdk.g.b):void");
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()});
        if (map != null) {
            b(x("loadBanner", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadBannerSuccess", "onLoadBannerFail"));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()});
        this.H.a(cVar.f28143b, true);
        b(x("loadInterstitial", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    @Override // com.ironsource.sdk.k.c
    public final void a(com.ironsource.sdk.h.c cVar) {
        if (!cVar.getName().contains("mobileController.html")) {
            String name = cVar.getName();
            String parent = cVar.getParent();
            try {
                b(b("assetCached", a("file", name, "path", p0(parent), null, null, null, null, null, false)));
                return;
            } catch (Exception e10) {
                G(name, parent, e10.getMessage());
                return;
            }
        }
        com.ironsource.sdk.controller.f fVar = this.F;
        o oVar = new o();
        if (fVar.c()) {
            return;
        }
        if (fVar.f27717c == f.a.f27723b) {
            fVar.e();
        }
        f.b bVar = f.b.CONTROLLER_FROM_SERVER;
        fVar.f27718d = bVar;
        fVar.a(bVar);
        oVar.run();
    }

    @Override // com.ironsource.sdk.k.c
    public final void a(com.ironsource.sdk.h.c cVar, com.ironsource.sdk.g.e eVar) {
        if (!cVar.getName().contains("mobileController.html")) {
            G(cVar.getName(), cVar.getParent(), eVar.f28187a);
            return;
        }
        com.ironsource.sdk.controller.f fVar = this.F;
        p pVar = new p();
        q qVar = new q(eVar);
        if (fVar.c()) {
            return;
        }
        if (fVar.f27717c == f.a.f27723b && fVar.g()) {
            f.b bVar = f.b.FALLBACK_CONTROLLER_RECOVERY;
            fVar.f27718d = bVar;
            fVar.a(bVar);
            pVar.run();
            return;
        }
        com.ironsource.sdk.a.a a10 = new com.ironsource.sdk.a.a().a("generalmessage", Integer.valueOf(fVar.f27716b));
        if (fVar.f27715a > 0) {
            a10.a("timingvalue", Long.valueOf(System.currentTimeMillis() - fVar.f27715a));
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27602t, a10.f27575a);
        qVar.run();
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, com.ironsource.sdk.j.a.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.H.a(str, true);
        b(x("loadInterstitial", flatMapToJsonAsString, "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    public final void a(String str, String str2) {
        b(b("onNativeLifeCycleEvent", a("lifeCycleEvent", str2, "productType", str, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
        this.f27901h = str;
        this.f27902i = str2;
        this.C = bVar;
        F(str, str2, d.e.Banner, cVar, new k());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
        this.f27901h = str;
        this.f27902i = str2;
        this.A = cVar2;
        com.ironsource.sdk.g.b bVar = this.H;
        bVar.f28133f = str;
        bVar.f28134g = str2;
        F(str, str2, d.e.Interstitial, cVar, new h());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar) {
        this.f27901h = str;
        this.f27902i = str2;
        this.f27919z = dVar;
        com.ironsource.sdk.g.b bVar = this.H;
        bVar.f28128a = str;
        bVar.f28129b = str2;
        F(str, str2, d.e.RewardedVideo, cVar, new f());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        this.f27901h = str;
        this.f27902i = str2;
        this.B = eVar;
        F(str, str2, d.e.OfferWallCredits, null, new j());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f27901h = str;
        this.f27902i = str2;
        this.f27903j = map;
        this.B = eVar;
        com.ironsource.sdk.g.b bVar = this.H;
        bVar.f28137j = map;
        bVar.f28135h = true;
        F(str, str2, d.e.OfferWall, null, new i());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.f27903j = map;
        b("SSA_CORE.SDKController.runFunction('showOfferWall','onShowOfferWallSuccess','onShowOfferWallFail');");
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject) {
        b(b("updateConsentInfo", jSONObject != null ? jSONObject.toString() : null));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar) {
        b(w(d.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar) {
        b(w(d.e.RewardedVideo, jSONObject));
    }

    public final void a(boolean z10, String str) {
        b(b("viewableChange", a("webview", str, null, null, null, null, null, null, "isViewable", z10)));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(Context context) {
        R(new t(context));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        b(w(d.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()}))));
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = "console.log(\"JS exeption: \" + JSON.stringify(e));";
        if (W != d.EnumC0353d.MODE_0.f28179d && (W < d.EnumC0353d.MODE_1.f28179d || W > d.EnumC0353d.MODE_3.f28179d)) {
            str2 = "empty";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("try{");
        sb2.append(str);
        sb2.append("}catch(e){");
        sb2.append(str2);
        sb2.append("}");
        String str3 = "javascript:" + sb2.toString();
        Logger.i(this.f27898e, str3);
        E(new n(sb2, str3));
    }

    @Override // com.ironsource.sdk.controller.m
    public final d.c c() {
        return d.c.Web;
    }

    @Override // com.ironsource.sdk.controller.m
    public final boolean c(String str) {
        com.ironsource.sdk.g.c a10 = this.K.a(d.e.Interstitial, str);
        return a10 != null && a10.f28147f;
    }

    @Override // com.ironsource.sdk.controller.m
    public final void d() {
        b(x("destroyBanner", "", "onDestroyBannersSuccess", "onDestroyBannersFail"));
    }

    public final void d(String str) {
        String str2 = this.f27898e;
        Logger.i(str2, "device status changed, connection type " + str);
        com.ironsource.sdk.a.b.a(str);
        b(b("deviceStatusChanged", a("connectionType", str, null, null, null, null, null, null, null, false)));
    }

    @Override // android.webkit.WebView, com.ironsource.sdk.controller.m
    public void destroy() {
        super.destroy();
        com.ironsource.sdk.k.b bVar = this.f27904k;
        if (bVar != null) {
            bVar.a();
        }
        com.ironsource.sdk.service.Connectivity.b bVar2 = this.T;
        if (bVar2 != null) {
            bVar2.f28222a.a();
        }
        CountDownTimer countDownTimer = this.f27899f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void e() {
        b(i0("enterForeground"));
    }

    public final void e(String str) {
        if (str.equals("forceClose")) {
            s0();
        }
        b(b("engageEnd", a("action", str, null, null, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void f() {
        b(i0("enterBackground"));
    }

    public final boolean f(String str) {
        List<String> b10 = com.ironsource.sdk.utils.b.a().b();
        try {
            if (b10.isEmpty()) {
                return false;
            }
            for (String str2 : b10) {
                if (str.contains(str2)) {
                    a.AnonymousClass1.a(this.U.a(), str, null);
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void g() {
        a(this.H);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void h() {
        com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
        com.ironsource.sdk.controller.f fVar = this.F;
        aVar.a("generalmessage", Integer.valueOf(fVar.f27716b));
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.f27600r, aVar.f27575a);
        fVar.f27715a = System.currentTimeMillis();
        if (this.F.d()) {
            a(1);
        }
    }

    public final void i() {
        b(i0("interceptedUrlToStore"));
    }

    public final void k() {
        try {
            onPause();
        } catch (Throwable th) {
            String str = this.f27898e;
            Logger.i(str, "WebViewController: onPause() - " + th);
        }
    }

    public final void l() {
        try {
            onResume();
        } catch (Throwable th) {
            String str = this.f27898e;
            Logger.i(str, "WebViewController: onResume() - " + th);
        }
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        String str5 = this.f27898e;
        Logger.i(str5, str + " " + str4);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        com.ironsource.sdk.j.g gVar;
        if (i10 == 4 && (gVar = this.V) != null && gVar.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.ironsource.sdk.k.b r() {
        return com.ironsource.sdk.k.b.a(this.E, this.f27897a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void s0() {
        com.ironsource.sdk.j.g gVar = this.V;
        if (gVar != null) {
            gVar.onCloseRequested();
        }
    }

    @Override // android.webkit.WebView
    public WebBackForwardList saveState(Bundle bundle) {
        return super.saveState(bundle);
    }
}
