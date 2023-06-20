package com.vehiclecloud.app.videofetch.webview;

import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.MimeTypeMap;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.common.internal.ImagesContract;
import com.reactnativecommunity.webview.RNCWebViewManager;
import com.vehiclecloud.app.videofetch.webview.RNWebViewManager;
import h6.e;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.regex.Pattern;

@o6.a(name = RNWebViewManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class RNWebViewManager extends RNCWebViewManager {
    protected static final String REACT_CLASS = "RNWebView";
    private static final Pattern UserAgentReplacePattern = Pattern.compile(" Build/.*; wv");
    private boolean mPaused;

    /* loaded from: classes3.dex */
    static final class JsObject {
        JsObject() {
        }

        @JavascriptInterface
        public boolean supportBlob() {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public static final class RNWebView extends RNCWebViewManager.f {
        String iframeJavascript;
        ReadableArray resourceUrlRules;
        float touchEventX;
        float touchEventY;

        public RNWebView(n0 n0Var) {
            super(n0Var);
        }

        public static /* synthetic */ void a(DownloadListener downloadListener, String str, String str2, String str3, String str4, long j10) {
            lambda$setDownloadListener$0(downloadListener, str, str2, str3, str4, j10);
        }

        public static /* synthetic */ void lambda$setDownloadListener$0(DownloadListener downloadListener, String str, String str2, String str3, String str4, long j10) {
            try {
                downloadListener.onDownloadStart(str, str2, str3, str4, j10);
            } catch (Exception unused) {
            }
        }

        @Override // com.reactnativecommunity.webview.RNCWebViewManager.f
        public void dispatchEvent(WebView webView, com.facebook.react.uimanager.events.c cVar) {
            super.dispatchEvent(webView, cVar);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.touchEventX = motionEvent.getX();
            this.touchEventY = motionEvent.getY();
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView
        public void setDownloadListener(final DownloadListener downloadListener) {
            if (downloadListener != null) {
                super.setDownloadListener(new DownloadListener() { // from class: com.vehiclecloud.app.videofetch.webview.b
                    @Override // android.webkit.DownloadListener
                    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
                        RNWebViewManager.RNWebView.a(downloadListener, str, str2, str3, str4, j10);
                    }
                });
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class RNWebViewVideoInterceptClient extends RNCWebViewManager.g {
        private static final String IFrameRequestParamName = "__vc_iframe__";

        protected RNWebViewVideoInterceptClient() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:135:0x0098, code lost:
            continue;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void dispatchVideoEvent(android.webkit.WebView r10, java.lang.String r11) {
            /*
                r9 = this;
                r0 = r10
                com.vehiclecloud.app.videofetch.webview.RNWebViewManager$RNWebView r0 = (com.vehiclecloud.app.videofetch.webview.RNWebViewManager.RNWebView) r0
                com.facebook.react.bridge.ReadableArray r0 = r0.resourceUrlRules
                if (r0 == 0) goto L9c
                int r1 = r0.size()
                if (r1 != 0) goto Lf
                goto L9c
            Lf:
                java.lang.String r1 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r11)
                java.lang.String r1 = r1.toLowerCase()
                r2 = 0
                r3 = 0
            L19:
                int r4 = r0.size()
                if (r3 >= r4) goto L9c
                com.facebook.react.bridge.ReadableMap r4 = r0.getMap(r3)
                if (r4 == 0) goto L98
                java.lang.String r5 = "r"
                boolean r6 = r4.hasKey(r5)
                if (r6 == 0) goto L98
                java.lang.String r6 = "v"
                boolean r7 = r4.hasKey(r6)
                if (r7 != 0) goto L36
                goto L98
            L36:
                java.lang.String r5 = r4.getString(r5)
                if (r5 != 0) goto L3d
                goto L98
            L3d:
                java.lang.String r6 = r4.getString(r6)
                if (r6 != 0) goto L44
                goto L98
            L44:
                java.lang.String r7 = "t"
                java.lang.String r4 = com.vehiclecloud.app.videofetch.rndownloader.util.RN.str(r4, r7, r1)
                r5.hashCode()
                r7 = -1
                int r8 = r5.hashCode()
                switch(r8) {
                    case 3365: goto L6c;
                    case 3635: goto L61;
                    case 3351604: goto L56;
                    default: goto L55;
                }
            L55:
                goto L76
            L56:
                java.lang.String r8 = "mime"
                boolean r5 = r5.equals(r8)
                if (r5 != 0) goto L5f
                goto L76
            L5f:
                r7 = 2
                goto L76
            L61:
                java.lang.String r8 = "re"
                boolean r5 = r5.equals(r8)
                if (r5 != 0) goto L6a
                goto L76
            L6a:
                r7 = 1
                goto L76
            L6c:
                java.lang.String r8 = "in"
                boolean r5 = r5.equals(r8)
                if (r5 != 0) goto L75
                goto L76
            L75:
                r7 = 0
            L76:
                switch(r7) {
                    case 0: goto L8e;
                    case 1: goto L84;
                    case 2: goto L7a;
                    default: goto L79;
                }
            L79:
                goto L98
            L7a:
                boolean r5 = r6.contains(r1)
                if (r5 == 0) goto L98
                com.vehiclecloud.app.videofetch.webview.RNWebViewManager.access$000(r10, r11, r4)
                return
            L84:
                boolean r5 = r11.matches(r6)
                if (r5 == 0) goto L98
                com.vehiclecloud.app.videofetch.webview.RNWebViewManager.access$000(r10, r11, r4)
                return
            L8e:
                boolean r5 = r11.contains(r6)
                if (r5 == 0) goto L98
                com.vehiclecloud.app.videofetch.webview.RNWebViewManager.access$000(r10, r11, r4)
                return
            L98:
                int r3 = r3 + 1
                goto L19
            L9c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vehiclecloud.app.videofetch.webview.RNWebViewManager.RNWebViewVideoInterceptClient.dispatchVideoEvent(android.webkit.WebView, java.lang.String):void");
        }

        @Override // com.reactnativecommunity.webview.RNCWebViewManager.g, android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            Log.i("RNWebViewManager", "onReceivedSslError occurr a sslError url: " + webView.getUrl() + ";err:" + sslError);
            sslErrorHandler.cancel();
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            if (webResourceRequest.getUrl() != null) {
                Uri url = webResourceRequest.getUrl();
                if (url.getQuery() != null && url.getQuery().contains(IFrameRequestParamName)) {
                    RNWebView rNWebView = (RNWebView) webView;
                    if (rNWebView.iframeJavascript != null) {
                        return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(("<script>function targetFi(){let l = location.href;for (let i = 0; i < window.parent.frames.length; i++) {try {if (l.startsWith(window.parent.frames[i].location.href)) return i;} catch(e) {}}return 0}let fi=targetFi(); if (!location.href.endsWith(fi)) {location.search=location.search.substring(0, location.search.lastIndexOf('=')+1) + fi} else " + rNWebView.iframeJavascript + "</script>").getBytes(StandardCharsets.UTF_8)));
                    }
                }
                dispatchVideoEvent(webView, url.toString());
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    private static boolean dispatchLongClickEvent(RNWebView rNWebView, int i10, String str, String str2, String str3) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("type", i10);
        createMap.putDouble("x", rNWebView.touchEventX);
        createMap.putDouble("y", rNWebView.touchEventY);
        if (str2 != null) {
            createMap.putString("src", str2);
            createMap.putString("title", str3);
        }
        if (str != null) {
            createMap.putString("img", str);
        }
        createMap.putString("referer", rNWebView.getUrl());
        String lowerCase = MimeTypeMap.getFileExtensionFromUrl(str2).toLowerCase();
        if (lowerCase != null) {
            createMap.putString("fileExt", lowerCase);
        }
        rNWebView.dispatchEvent(rNWebView, new LongClickEvent(rNWebView.getId(), createMap));
        Log.d(REACT_CLASS, "onLongClick x:" + rNWebView.touchEventX + "; y: " + rNWebView.touchEventY + "; type: " + i10 + "; src: " + str2 + "; img: " + str);
        return true;
    }

    public static void dispatchVideoSourceEvent(WebView webView, String str, String str2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("src", str);
        createMap.putString("type", str2);
        ((RNWebView) webView).dispatchEvent(webView, new VideoSourceEvent(webView.getId(), createMap));
        Log.d(REACT_CLASS, "onVideoSource type:" + str2 + "; src:" + str);
    }

    public static /* synthetic */ boolean g(RNWebView rNWebView, View view) {
        return lambda$createRNCWebViewInstance$0(rNWebView, view);
    }

    public static /* synthetic */ boolean lambda$createRNCWebViewInstance$0(RNWebView rNWebView, View view) {
        WebView.HitTestResult hitTestResult = rNWebView.getHitTestResult();
        int type = hitTestResult.getType();
        if (type != 5) {
            if (type == 7) {
                Message obtainMessage = new Handler().obtainMessage();
                rNWebView.requestFocusNodeHref(obtainMessage);
                return dispatchLongClickEvent(rNWebView, type, null, hitTestResult.getExtra(), obtainMessage.getData().getString("title"));
            } else if (type != 8) {
                return false;
            } else {
                Message obtainMessage2 = new Handler().obtainMessage();
                rNWebView.requestFocusNodeHref(obtainMessage2);
                return dispatchLongClickEvent(rNWebView, type, hitTestResult.getExtra(), obtainMessage2.getData().getString(ImagesContract.URL), obtainMessage2.getData().getString("title"));
            }
        }
        return dispatchLongClickEvent(rNWebView, type, hitTestResult.getExtra(), null, null);
    }

    @Override // com.reactnativecommunity.webview.RNCWebViewManager
    protected RNCWebViewManager.f createRNCWebViewInstance(n0 n0Var) {
        final RNWebView rNWebView = new RNWebView(n0Var);
        setUserAgentString(rNWebView);
        rNWebView.addJavascriptInterface(new JsObject(), "ReactFreeFilesVideoFetch");
        rNWebView.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.vehiclecloud.app.videofetch.webview.a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return RNWebViewManager.g(RNWebViewManager.RNWebView.this, view);
            }
        });
        return rNWebView;
    }

    @Override // com.reactnativecommunity.webview.RNCWebViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = e.b();
        }
        exportedCustomDirectEventTypeConstants.put("onVideoSource", e.d("registrationName", "onVideoSource"));
        exportedCustomDirectEventTypeConstants.put("onLongClick", e.d("registrationName", "onLongClick"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.reactnativecommunity.webview.RNCWebViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @w6.a(name = "iframeJavascript")
    public void setIframeJavascript(WebView webView, String str) {
        ((RNWebView) webView).iframeJavascript = str;
    }

    @w6.a(name = "paused")
    public void setPaused(WebView webView, boolean z10) {
        if (z10 == this.mPaused) {
            return;
        }
        this.mPaused = z10;
        if (z10) {
            webView.onPause();
        } else {
            webView.onResume();
        }
    }

    @w6.a(name = "resourceUrlRules")
    public void setResourceUrlRules(WebView webView, ReadableArray readableArray) {
        ((RNWebView) webView).resourceUrlRules = readableArray;
    }

    @Override // com.reactnativecommunity.webview.RNCWebViewManager
    protected void setUserAgentString(WebView webView) {
        String defaultUserAgent = WebSettings.getDefaultUserAgent(webView.getContext());
        try {
            defaultUserAgent = UserAgentReplacePattern.matcher(defaultUserAgent).replaceFirst("");
        } catch (Exception unused) {
        }
        webView.getSettings().setUserAgentString(defaultUserAgent);
    }

    @Override // com.reactnativecommunity.webview.RNCWebViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, WebView webView) {
        webView.setWebViewClient(new RNWebViewVideoInterceptClient());
    }
}
