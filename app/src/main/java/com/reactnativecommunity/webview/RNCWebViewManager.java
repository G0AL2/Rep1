package com.reactnativecommunity.webview;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Environment;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.n0;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.internal.ImagesContract;
import com.reactnativecommunity.webview.RNCWebViewManager;
import com.reactnativecommunity.webview.RNCWebViewModule;
import com.vehiclecloud.app.videofetch.rnads.api.RNAdsEvents;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import com.vehiclecloud.app.videofetch.rndownloader.service.DownloadWorker;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import ld.h;
import org.json.JSONException;
import org.json.JSONObject;

@o6.a(name = "RNCWebView")
/* loaded from: classes3.dex */
public class RNCWebViewManager extends SimpleViewManager<WebView> {
    protected static final String BLANK_URL = "about:blank";
    public static final int COMMAND_CLEAR_CACHE = 1001;
    public static final int COMMAND_CLEAR_FORM_DATA = 1000;
    public static final int COMMAND_CLEAR_HISTORY = 1002;
    public static final int COMMAND_FOCUS = 8;
    public static final int COMMAND_GO_BACK = 1;
    public static final int COMMAND_GO_FORWARD = 2;
    public static final int COMMAND_INJECT_JAVASCRIPT = 6;
    public static final int COMMAND_LOAD_URL = 7;
    public static final int COMMAND_POST_MESSAGE = 5;
    public static final int COMMAND_RELOAD = 3;
    public static final int COMMAND_STOP_LOADING = 4;
    protected static final String DEFAULT_DOWNLOADING_MESSAGE = "Downloading";
    protected static final String DEFAULT_LACK_PERMISSION_TO_DOWNLOAD_MESSAGE = "Cannot download files as permission was denied. Please provide permission to write to storage, in order to download files.";
    protected static final String HTML_ENCODING = "UTF-8";
    protected static final String HTML_MIME_TYPE = "text/html";
    protected static final String HTTP_METHOD_POST = "POST";
    protected static final String JAVASCRIPT_INTERFACE = "ReactNativeWebView";
    protected static final String REACT_CLASS = "RNCWebView";
    protected static final int SHOULD_OVERRIDE_URL_LOADING_TIMEOUT = 250;
    private static final String TAG = "RNCWebViewManager";
    protected boolean mAllowsFullscreenVideo;
    protected String mDownloadingMessage;
    protected String mLackPermissionToDownloadMessage;
    protected String mUserAgent;
    protected String mUserAgentWithApplicationName;
    protected e mWebChromeClient;
    protected com.reactnativecommunity.webview.d mWebViewConfig;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements com.reactnativecommunity.webview.d {
        a(RNCWebViewManager rNCWebViewManager) {
        }

        @Override // com.reactnativecommunity.webview.d
        public void a(WebView webView) {
        }
    }

    /* loaded from: classes3.dex */
    public class b implements DownloadListener {

        /* renamed from: a */
        final /* synthetic */ f f28338a;

        /* renamed from: b */
        final /* synthetic */ n0 f28339b;

        b(f fVar, n0 n0Var) {
            RNCWebViewManager.this = r1;
            this.f28338a = fVar;
            this.f28339b = n0Var;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
            this.f28338a.setIgnoreErrFailedForThisURL(str);
            RNCWebViewModule module = RNCWebViewManager.getModule(this.f28339b);
            try {
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                String guessFileName = URLUtil.guessFileName(str, str3, str4);
                String str5 = "Downloading " + guessFileName;
                try {
                    URL url = new URL(str);
                    request.addRequestHeader("Cookie", CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
                } catch (MalformedURLException e10) {
                    Log.w(RNCWebViewManager.TAG, "Error getting cookie for DownloadManager", e10);
                }
                request.addRequestHeader("User-Agent", str2);
                request.setTitle(guessFileName);
                request.setDescription(str5);
                request.allowScanningByMediaScanner();
                request.setNotificationVisibility(1);
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                module.setDownloadRequest(request);
                if (module.grantFileDownloaderPermissions(RNCWebViewManager.this.getDownloadingMessage(), RNCWebViewManager.this.getLackPermissionToDownloadMessage())) {
                    module.downloadFile(RNCWebViewManager.this.getDownloadingMessage());
                }
            } catch (IllegalArgumentException e11) {
                Log.w(RNCWebViewManager.TAG, "Unsupported URI, aborting download", e11);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c extends e {

        /* renamed from: n */
        final /* synthetic */ Activity f28341n;

        /* renamed from: o */
        final /* synthetic */ int f28342o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(RNCWebViewManager rNCWebViewManager, ReactContext reactContext, WebView webView, Activity activity, int i10) {
            super(reactContext, webView);
            this.f28341n = activity;
            this.f28342o = i10;
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (this.f28346c == null) {
                return;
            }
            ViewGroup c10 = c();
            if (c10.getRootView() != this.f28345b.getRootView()) {
                this.f28345b.getRootView().setVisibility(0);
            } else {
                this.f28345b.setVisibility(0);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                this.f28341n.getWindow().clearFlags(AdRequest.MAX_CONTENT_URL_LENGTH);
            }
            c10.removeView(this.f28346c);
            this.f28347d.onCustomViewHidden();
            this.f28346c = null;
            this.f28347d = null;
            this.f28341n.setRequestedOrientation(this.f28342o);
            this.f28344a.removeLifecycleEventListener(this);
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.f28346c != null) {
                customViewCallback.onCustomViewHidden();
                return;
            }
            this.f28346c = view;
            this.f28347d = customViewCallback;
            this.f28341n.setRequestedOrientation(-1);
            if (Build.VERSION.SDK_INT >= 19) {
                this.f28346c.setSystemUiVisibility(7942);
                this.f28341n.getWindow().setFlags(AdRequest.MAX_CONTENT_URL_LENGTH, AdRequest.MAX_CONTENT_URL_LENGTH);
            }
            this.f28346c.setBackgroundColor(-16777216);
            ViewGroup c10 = c();
            c10.addView(this.f28346c, e.f28343m);
            if (c10.getRootView() != this.f28345b.getRootView()) {
                this.f28345b.getRootView().setVisibility(8);
            } else {
                this.f28345b.setVisibility(8);
            }
            this.f28344a.addLifecycleEventListener(this);
        }
    }

    /* loaded from: classes3.dex */
    public class d extends e {
        d(RNCWebViewManager rNCWebViewManager, ReactContext reactContext, WebView webView) {
            super(reactContext, webView);
        }

        @Override // android.webkit.WebChromeClient
        public Bitmap getDefaultVideoPoster() {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends WebChromeClient implements LifecycleEventListener {

        /* renamed from: m */
        protected static final FrameLayout.LayoutParams f28343m = new FrameLayout.LayoutParams(-1, -1, 17);

        /* renamed from: a */
        protected ReactContext f28344a;

        /* renamed from: b */
        protected View f28345b;

        /* renamed from: c */
        protected View f28346c;

        /* renamed from: d */
        protected WebChromeClient.CustomViewCallback f28347d;

        /* renamed from: e */
        protected PermissionRequest f28348e;

        /* renamed from: f */
        protected List<String> f28349f;

        /* renamed from: g */
        protected GeolocationPermissions.Callback f28350g;

        /* renamed from: h */
        protected String f28351h;

        /* renamed from: i */
        protected boolean f28352i = false;

        /* renamed from: j */
        protected List<String> f28353j = new ArrayList();

        /* renamed from: k */
        protected f.b f28354k = null;
        @TargetApi(21)

        /* renamed from: l */
        private com.facebook.react.modules.core.f f28355l = new com.facebook.react.modules.core.f() { // from class: com.reactnativecommunity.webview.b
            @Override // com.facebook.react.modules.core.f
            public final boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
                return RNCWebViewManager.e.a(RNCWebViewManager.e.this, i10, strArr, iArr);
            }
        };

        public e(ReactContext reactContext, WebView webView) {
            this.f28344a = reactContext;
            this.f28345b = webView;
        }

        public static /* synthetic */ boolean a(e eVar, int i10, String[] strArr, int[] iArr) {
            return eVar.d(i10, strArr, iArr);
        }

        private com.facebook.react.modules.core.e b() {
            Activity currentActivity = this.f28344a.getCurrentActivity();
            if (currentActivity != null) {
                if (currentActivity instanceof com.facebook.react.modules.core.e) {
                    return (com.facebook.react.modules.core.e) currentActivity;
                }
                throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
            }
            throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
        }

        public /* synthetic */ boolean d(int i10, String[] strArr, int[] iArr) {
            PermissionRequest permissionRequest;
            List<String> list;
            List<String> list2;
            List<String> list3;
            List<String> list4;
            GeolocationPermissions.Callback callback;
            String str;
            this.f28352i = false;
            boolean z10 = false;
            for (int i11 = 0; i11 < strArr.length; i11++) {
                String str2 = strArr[i11];
                boolean z11 = iArr[i11] == 0;
                if (str2.equals("android.permission.ACCESS_FINE_LOCATION") && (callback = this.f28350g) != null && (str = this.f28351h) != null) {
                    if (z11) {
                        callback.invoke(str, true, false);
                    } else {
                        callback.invoke(str, false, false);
                    }
                    this.f28350g = null;
                    this.f28351h = null;
                }
                if (str2.equals("android.permission.RECORD_AUDIO")) {
                    if (z11 && (list4 = this.f28349f) != null) {
                        list4.add("android.webkit.resource.AUDIO_CAPTURE");
                    }
                    z10 = true;
                }
                if (str2.equals("android.permission.CAMERA")) {
                    if (z11 && (list3 = this.f28349f) != null) {
                        list3.add("android.webkit.resource.VIDEO_CAPTURE");
                    }
                    z10 = true;
                }
                if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                    if (z11 && (list2 = this.f28349f) != null) {
                        list2.add("android.webkit.resource.PROTECTED_MEDIA_ID");
                    }
                    z10 = true;
                }
            }
            if (z10 && (permissionRequest = this.f28348e) != null && (list = this.f28349f) != null) {
                permissionRequest.grant((String[]) list.toArray(new String[0]));
                this.f28348e = null;
                this.f28349f = null;
            }
            if (this.f28353j.isEmpty()) {
                return true;
            }
            e(this.f28353j);
            return false;
        }

        private synchronized void e(List<String> list) {
            if (this.f28352i) {
                this.f28353j.addAll(list);
                return;
            }
            com.facebook.react.modules.core.e b10 = b();
            this.f28352i = true;
            b10.requestPermissions((String[]) list.toArray(new String[0]), 3, this.f28355l);
            this.f28353j.clear();
        }

        protected ViewGroup c() {
            return (ViewGroup) this.f28344a.getCurrentActivity().findViewById(16908290);
        }

        public void f(f.b bVar) {
            this.f28354k = bVar;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
            ((WebView.WebViewTransport) message.obj).setWebView(new WebView(webView.getContext()));
            message.sendToTarget();
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (androidx.core.content.b.a(this.f28344a, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                this.f28350g = callback;
                this.f28351h = str;
                e(Collections.singletonList("android.permission.ACCESS_FINE_LOCATION"));
                return;
            }
            callback.invoke(str, true, false);
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            View view;
            if (Build.VERSION.SDK_INT < 19 || (view = this.f28346c) == null || view.getSystemUiVisibility() == 7942) {
                return;
            }
            this.f28346c.setSystemUiVisibility(7942);
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            this.f28349f = new ArrayList();
            ArrayList arrayList = new ArrayList();
            String[] resources = permissionRequest.getResources();
            int length = resources.length;
            int i10 = 0;
            while (true) {
                String str = null;
                if (i10 >= length) {
                    break;
                }
                String str2 = resources[i10];
                if (str2.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                    str = "android.permission.RECORD_AUDIO";
                } else if (str2.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    str = "android.permission.CAMERA";
                } else if (str2.equals("android.webkit.resource.PROTECTED_MEDIA_ID")) {
                    str = "android.webkit.resource.PROTECTED_MEDIA_ID";
                }
                if (str != null) {
                    if (androidx.core.content.b.a(this.f28344a, str) == 0) {
                        this.f28349f.add(str2);
                    } else {
                        arrayList.add(str);
                    }
                }
                i10++;
            }
            if (arrayList.isEmpty()) {
                permissionRequest.grant((String[]) this.f28349f.toArray(new String[0]));
                this.f28349f = null;
                return;
            }
            this.f28348e = permissionRequest;
            e(arrayList);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            super.onProgressChanged(webView, i10);
            String url = webView.getUrl();
            if (this.f28354k.a()) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(Analytics.Param.TARGET, webView.getId());
            createMap.putString("title", webView.getTitle());
            createMap.putString(ImagesContract.URL, url);
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            createMap.putDouble(DownloadWorker.KEY_OUT_PROGRESS, i10 / 100.0f);
            ((f) webView).dispatchEvent(webView, new ld.d(webView.getId(), createMap));
        }

        @Override // android.webkit.WebChromeClient
        @TargetApi(21)
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            return RNCWebViewManager.getModule(this.f28344a).startPhotoPickerIntent(valueCallback, fileChooserParams.getAcceptTypes(), fileChooserParams.getMode() == 1);
        }
    }

    /* loaded from: classes3.dex */
    public static class f extends WebView implements LifecycleEventListener {
        protected boolean hasScrollEvent;
        protected String injectedJS;
        protected String injectedJSBeforeContentLoaded;
        protected boolean injectedJavaScriptBeforeContentLoadedForMainFrameOnly;
        protected boolean injectedJavaScriptForMainFrameOnly;
        protected CatalystInstance mCatalystInstance;
        private g7.b mOnScrollDispatchHelper;
        protected g mRNCWebViewClient;
        WebChromeClient mWebChromeClient;
        protected boolean messagingEnabled;
        protected String messagingModuleName;
        protected boolean nestedScrollEnabled;
        protected b progressChangedFilter;
        protected boolean sendContentSizeChangeEvents;

        /* loaded from: classes3.dex */
        public class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ WebView f28356a;

            /* renamed from: b */
            final /* synthetic */ String f28357b;

            /* renamed from: c */
            final /* synthetic */ f f28358c;

            a(WebView webView, String str, f fVar) {
                f.this = r1;
                this.f28356a = webView;
                this.f28357b = str;
                this.f28358c = fVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = f.this.mRNCWebViewClient;
                if (gVar == null) {
                    return;
                }
                WebView webView = this.f28356a;
                WritableMap createWebViewEvent = gVar.createWebViewEvent(webView, webView.getUrl());
                createWebViewEvent.putString("data", this.f28357b);
                f fVar = f.this;
                if (fVar.mCatalystInstance != null) {
                    this.f28358c.sendDirectMessage("onMessage", createWebViewEvent);
                } else {
                    fVar.dispatchEvent(this.f28356a, new ld.f(this.f28356a.getId(), createWebViewEvent));
                }
            }
        }

        /* loaded from: classes3.dex */
        public static class b {

            /* renamed from: a */
            private boolean f28360a = false;

            protected b() {
            }

            public boolean a() {
                return this.f28360a;
            }

            public void b(boolean z10) {
                this.f28360a = z10;
            }
        }

        /* loaded from: classes3.dex */
        public class c {

            /* renamed from: a */
            f f28361a;

            c(f fVar, f fVar2) {
                this.f28361a = fVar2;
            }

            @JavascriptInterface
            public void postMessage(String str) {
                this.f28361a.onMessage(str);
            }
        }

        public f(n0 n0Var) {
            super(n0Var);
            this.injectedJavaScriptForMainFrameOnly = true;
            this.injectedJavaScriptBeforeContentLoadedForMainFrameOnly = true;
            this.messagingEnabled = false;
            this.sendContentSizeChangeEvents = false;
            this.hasScrollEvent = false;
            this.nestedScrollEnabled = false;
            createCatalystInstance();
            this.progressChangedFilter = new b();
        }

        public void callInjectedJavaScript() {
            String str;
            if (!getSettings().getJavaScriptEnabled() || (str = this.injectedJS) == null || TextUtils.isEmpty(str)) {
                return;
            }
            evaluateJavascriptWithFallback("(function() {\n" + this.injectedJS + ";\n})();");
        }

        public void callInjectedJavaScriptBeforeContentLoaded() {
            String str;
            if (!getSettings().getJavaScriptEnabled() || (str = this.injectedJSBeforeContentLoaded) == null || TextUtils.isEmpty(str)) {
                return;
            }
            evaluateJavascriptWithFallback("(function() {\n" + this.injectedJSBeforeContentLoaded + ";\n})();");
        }

        protected void cleanupCallbacksAndDestroy() {
            setWebViewClient(null);
            destroy();
        }

        protected void createCatalystInstance() {
            ReactContext reactContext = (ReactContext) getContext();
            if (reactContext != null) {
                this.mCatalystInstance = reactContext.getCatalystInstance();
            }
        }

        protected c createRNCWebViewBridge(f fVar) {
            return new c(this, fVar);
        }

        @Override // android.webkit.WebView
        public void destroy() {
            WebChromeClient webChromeClient = this.mWebChromeClient;
            if (webChromeClient != null) {
                webChromeClient.onHideCustomView();
            }
            super.destroy();
        }

        public void dispatchEvent(WebView webView, com.facebook.react.uimanager.events.c cVar) {
            ((UIManagerModule) ((ReactContext) webView.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().g(cVar);
        }

        protected void evaluateJavascriptWithFallback(String str) {
            if (Build.VERSION.SDK_INT >= 19) {
                evaluateJavascript(str, null);
                return;
            }
            try {
                loadUrl("javascript:" + URLEncoder.encode(str, RNCWebViewManager.HTML_ENCODING));
            } catch (UnsupportedEncodingException e10) {
                throw new RuntimeException(e10);
            }
        }

        public g getRNCWebViewClient() {
            return this.mRNCWebViewClient;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            cleanupCallbacksAndDestroy();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }

        public void onMessage(String str) {
            ReactContext reactContext = (ReactContext) getContext();
            if (this.mRNCWebViewClient != null) {
                post(new a(this, str, this));
                return;
            }
            WritableMap createMap = Arguments.createMap();
            createMap.putString("data", str);
            if (this.mCatalystInstance != null) {
                sendDirectMessage("onMessage", createMap);
            } else {
                dispatchEvent(this, new ld.f(getId(), createMap));
            }
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onScrollChanged(int i10, int i11, int i12, int i13) {
            super.onScrollChanged(i10, i11, i12, i13);
            if (this.hasScrollEvent) {
                if (this.mOnScrollDispatchHelper == null) {
                    this.mOnScrollDispatchHelper = new g7.b();
                }
                if (this.mOnScrollDispatchHelper.c(i10, i11)) {
                    dispatchEvent(this, g7.g.c(getId(), com.facebook.react.views.scroll.b.SCROLL, i10, i11, this.mOnScrollDispatchHelper.a(), this.mOnScrollDispatchHelper.b(), computeHorizontalScrollRange(), computeVerticalScrollRange(), getWidth(), getHeight()));
                }
            }
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onSizeChanged(int i10, int i11, int i12, int i13) {
            super.onSizeChanged(i10, i11, i12, i13);
            if (this.sendContentSizeChangeEvents) {
                dispatchEvent(this, new com.facebook.react.uimanager.events.b(getId(), i10, i11));
            }
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.nestedScrollEnabled) {
                requestDisallowInterceptTouchEvent(true);
            }
            return super.onTouchEvent(motionEvent);
        }

        protected void sendDirectMessage(String str, WritableMap writableMap) {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putMap("nativeEvent", writableMap);
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            writableNativeArray.pushMap(writableNativeMap);
            this.mCatalystInstance.callFunction(this.messagingModuleName, str, writableNativeArray);
        }

        public void setBasicAuthCredential(com.reactnativecommunity.webview.a aVar) {
            this.mRNCWebViewClient.setBasicAuthCredential(aVar);
        }

        public void setHasScrollEvent(boolean z10) {
            this.hasScrollEvent = z10;
        }

        public void setIgnoreErrFailedForThisURL(String str) {
            this.mRNCWebViewClient.setIgnoreErrFailedForThisURL(str);
        }

        public void setInjectedJavaScript(String str) {
            this.injectedJS = str;
        }

        public void setInjectedJavaScriptBeforeContentLoaded(String str) {
            this.injectedJSBeforeContentLoaded = str;
        }

        public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(boolean z10) {
            this.injectedJavaScriptBeforeContentLoadedForMainFrameOnly = z10;
        }

        public void setInjectedJavaScriptForMainFrameOnly(boolean z10) {
            this.injectedJavaScriptForMainFrameOnly = z10;
        }

        @SuppressLint({"AddJavascriptInterface"})
        public void setMessagingEnabled(boolean z10) {
            if (this.messagingEnabled == z10) {
                return;
            }
            this.messagingEnabled = z10;
            if (z10) {
                addJavascriptInterface(createRNCWebViewBridge(this), RNCWebViewManager.JAVASCRIPT_INTERFACE);
            } else {
                removeJavascriptInterface(RNCWebViewManager.JAVASCRIPT_INTERFACE);
            }
        }

        public void setMessagingModuleName(String str) {
            this.messagingModuleName = str;
        }

        public void setNestedScrollEnabled(boolean z10) {
            this.nestedScrollEnabled = z10;
        }

        public void setSendContentSizeChangeEvents(boolean z10) {
            this.sendContentSizeChangeEvents = z10;
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(WebChromeClient webChromeClient) {
            this.mWebChromeClient = webChromeClient;
            super.setWebChromeClient(webChromeClient);
            if (webChromeClient instanceof e) {
                ((e) webChromeClient).f(this.progressChangedFilter);
            }
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            if (webViewClient instanceof g) {
                g gVar = (g) webViewClient;
                this.mRNCWebViewClient = gVar;
                gVar.setProgressChangedFilter(this.progressChangedFilter);
            }
        }
    }

    public RNCWebViewManager() {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mDownloadingMessage = null;
        this.mLackPermissionToDownloadMessage = null;
        this.mWebViewConfig = new a(this);
    }

    public String getDownloadingMessage() {
        String str = this.mDownloadingMessage;
        return str == null ? DEFAULT_DOWNLOADING_MESSAGE : str;
    }

    public String getLackPermissionToDownloadMessage() {
        return this.mDownloadingMessage == null ? DEFAULT_LACK_PERMISSION_TO_DOWNLOAD_MESSAGE : this.mLackPermissionToDownloadMessage;
    }

    public static RNCWebViewModule getModule(ReactContext reactContext) {
        return (RNCWebViewModule) reactContext.getNativeModule(RNCWebViewModule.class);
    }

    protected f createRNCWebViewInstance(n0 n0Var) {
        return new f(n0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return h6.e.a().b("goBack", 1).b("goForward", 2).b("reload", 3).b("stopLoading", 4).b("postMessage", 5).b("injectJavaScript", 6).b("loadUrl", 7).b("requestFocus", 8).b("clearFormData", 1000).b("clearCache", 1001).b("clearHistory", 1002).a();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = h6.e.b();
        }
        exportedCustomDirectEventTypeConstants.put("topLoadingStart", h6.e.d("registrationName", "onLoadingStart"));
        exportedCustomDirectEventTypeConstants.put("topLoadingFinish", h6.e.d("registrationName", "onLoadingFinish"));
        exportedCustomDirectEventTypeConstants.put("topLoadingError", h6.e.d("registrationName", "onLoadingError"));
        exportedCustomDirectEventTypeConstants.put("topMessage", h6.e.d("registrationName", "onMessage"));
        exportedCustomDirectEventTypeConstants.put("topLoadingProgress", h6.e.d("registrationName", "onLoadingProgress"));
        exportedCustomDirectEventTypeConstants.put("topShouldStartLoadWithRequest", h6.e.d("registrationName", "onShouldStartLoadWithRequest"));
        exportedCustomDirectEventTypeConstants.put(com.facebook.react.views.scroll.b.a(com.facebook.react.views.scroll.b.SCROLL), h6.e.d("registrationName", "onScroll"));
        exportedCustomDirectEventTypeConstants.put("topHttpError", h6.e.d("registrationName", "onHttpError"));
        exportedCustomDirectEventTypeConstants.put("topRenderProcessGone", h6.e.d("registrationName", "onRenderProcessGone"));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCWebView";
    }

    @w6.a(name = "allowFileAccess")
    public void setAllowFileAccess(WebView webView, Boolean bool) {
        webView.getSettings().setAllowFileAccess(bool != null && bool.booleanValue());
    }

    @w6.a(name = "allowFileAccessFromFileURLs")
    public void setAllowFileAccessFromFileURLs(WebView webView, boolean z10) {
        webView.getSettings().setAllowFileAccessFromFileURLs(z10);
    }

    @w6.a(name = "allowUniversalAccessFromFileURLs")
    public void setAllowUniversalAccessFromFileURLs(WebView webView, boolean z10) {
        webView.getSettings().setAllowUniversalAccessFromFileURLs(z10);
    }

    @w6.a(name = "allowsFullscreenVideo")
    public void setAllowsFullscreenVideo(WebView webView, Boolean bool) {
        this.mAllowsFullscreenVideo = bool != null && bool.booleanValue();
        setupWebChromeClient((ReactContext) webView.getContext(), webView);
    }

    @w6.a(name = "applicationNameForUserAgent")
    public void setApplicationNameForUserAgent(WebView webView, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT >= 17) {
                String defaultUserAgent = WebSettings.getDefaultUserAgent(webView.getContext());
                this.mUserAgentWithApplicationName = defaultUserAgent + " " + str;
            }
        } else {
            this.mUserAgentWithApplicationName = null;
        }
        setUserAgentString(webView);
    }

    @w6.a(name = "basicAuthCredential")
    public void setBasicAuthCredential(WebView webView, ReadableMap readableMap) {
        ((f) webView).setBasicAuthCredential((readableMap != null && readableMap.hasKey(AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER) && readableMap.hasKey("password")) ? new com.reactnativecommunity.webview.a(readableMap.getString(AppLovinEventParameters.USER_ACCOUNT_IDENTIFIER), readableMap.getString("password")) : null);
    }

    @w6.a(name = "setBuiltInZoomControls")
    public void setBuiltInZoomControls(WebView webView, boolean z10) {
        webView.getSettings().setBuiltInZoomControls(z10);
    }

    @w6.a(name = "cacheEnabled")
    public void setCacheEnabled(WebView webView, boolean z10) {
        if (z10) {
            if (webView.getContext() != null) {
                webView.getSettings().setCacheMode(-1);
                return;
            }
            return;
        }
        webView.getSettings().setCacheMode(2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @w6.a(name = "cacheMode")
    public void setCacheMode(WebView webView, String str) {
        char c10;
        Integer num;
        switch (str.hashCode()) {
            case -2059164003:
                if (str.equals("LOAD_NO_CACHE")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -1215135800:
                if (str.equals("LOAD_DEFAULT")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case -873877826:
                if (str.equals("LOAD_CACHE_ELSE_NETWORK")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 1548620642:
                if (str.equals("LOAD_CACHE_ONLY")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        if (c10 == 0) {
            num = 3;
        } else if (c10 == 1) {
            num = 1;
        } else if (c10 != 2) {
            num = -1;
        } else {
            num = 2;
        }
        webView.getSettings().setCacheMode(num.intValue());
    }

    @w6.a(name = "setDisplayZoomControls")
    public void setDisplayZoomControls(WebView webView, boolean z10) {
        webView.getSettings().setDisplayZoomControls(z10);
    }

    @w6.a(name = "domStorageEnabled")
    public void setDomStorageEnabled(WebView webView, boolean z10) {
        webView.getSettings().setDomStorageEnabled(z10);
    }

    @w6.a(name = "downloadingMessage")
    public void setDownloadingMessage(WebView webView, String str) {
        this.mDownloadingMessage = str;
    }

    @w6.a(name = "forceDarkOn")
    public void setForceDarkOn(WebView webView, boolean z10) {
        if (Build.VERSION.SDK_INT > 28) {
            if (i1.b.a("FORCE_DARK")) {
                i1.a.b(webView.getSettings(), z10 ? 2 : 0);
            }
            if (z10 && i1.b.a("FORCE_DARK_STRATEGY")) {
                i1.a.c(webView.getSettings(), 2);
            }
        }
    }

    @w6.a(name = "geolocationEnabled")
    public void setGeolocationEnabled(WebView webView, Boolean bool) {
        webView.getSettings().setGeolocationEnabled(bool != null && bool.booleanValue());
    }

    @w6.a(name = "androidHardwareAccelerationDisabled")
    public void setHardwareAccelerationDisabled(WebView webView, boolean z10) {
        if (z10) {
            webView.setLayerType(1, null);
        }
    }

    @w6.a(name = "incognito")
    public void setIncognito(WebView webView, boolean z10) {
        if (z10) {
            if (Build.VERSION.SDK_INT >= 21) {
                CookieManager.getInstance().removeAllCookies(null);
            } else {
                CookieManager.getInstance().removeAllCookie();
            }
            webView.getSettings().setCacheMode(2);
            webView.clearHistory();
            webView.clearCache(true);
            webView.clearFormData();
            webView.getSettings().setSavePassword(false);
            webView.getSettings().setSaveFormData(false);
        }
    }

    @w6.a(name = "injectedJavaScript")
    public void setInjectedJavaScript(WebView webView, String str) {
        ((f) webView).setInjectedJavaScript(str);
    }

    @w6.a(name = "injectedJavaScriptBeforeContentLoaded")
    public void setInjectedJavaScriptBeforeContentLoaded(WebView webView, String str) {
        ((f) webView).setInjectedJavaScriptBeforeContentLoaded(str);
    }

    @w6.a(name = "injectedJavaScriptBeforeContentLoadedForMainFrameOnly")
    public void setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(WebView webView, boolean z10) {
        ((f) webView).setInjectedJavaScriptBeforeContentLoadedForMainFrameOnly(z10);
    }

    @w6.a(name = "injectedJavaScriptForMainFrameOnly")
    public void setInjectedJavaScriptForMainFrameOnly(WebView webView, boolean z10) {
        ((f) webView).setInjectedJavaScriptForMainFrameOnly(z10);
    }

    @w6.a(name = "javaScriptCanOpenWindowsAutomatically")
    public void setJavaScriptCanOpenWindowsAutomatically(WebView webView, boolean z10) {
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(z10);
    }

    @w6.a(name = "javaScriptEnabled")
    public void setJavaScriptEnabled(WebView webView, boolean z10) {
        webView.getSettings().setJavaScriptEnabled(z10);
    }

    @w6.a(name = "lackPermissionToDownloadMessage")
    public void setLackPermissionToDownlaodMessage(WebView webView, String str) {
        this.mLackPermissionToDownloadMessage = str;
    }

    @w6.a(name = "androidLayerType")
    public void setLayerType(WebView webView, String str) {
        str.hashCode();
        webView.setLayerType(!str.equals("hardware") ? !str.equals("software") ? 0 : 1 : 2, null);
    }

    @w6.a(name = "mediaPlaybackRequiresUserAction")
    @TargetApi(17)
    public void setMediaPlaybackRequiresUserAction(WebView webView, boolean z10) {
        webView.getSettings().setMediaPlaybackRequiresUserGesture(z10);
    }

    @w6.a(name = "messagingEnabled")
    public void setMessagingEnabled(WebView webView, boolean z10) {
        ((f) webView).setMessagingEnabled(z10);
    }

    @w6.a(name = "messagingModuleName")
    public void setMessagingModuleName(WebView webView, String str) {
        ((f) webView).setMessagingModuleName(str);
    }

    @w6.a(name = "minimumFontSize")
    public void setMinimumFontSize(WebView webView, int i10) {
        webView.getSettings().setMinimumFontSize(i10);
    }

    @w6.a(name = "mixedContentMode")
    public void setMixedContentMode(WebView webView, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (str != null && !"never".equals(str)) {
                if ("always".equals(str)) {
                    webView.getSettings().setMixedContentMode(0);
                    return;
                } else if ("compatibility".equals(str)) {
                    webView.getSettings().setMixedContentMode(2);
                    return;
                } else {
                    return;
                }
            }
            webView.getSettings().setMixedContentMode(1);
        }
    }

    @w6.a(name = "nestedScrollEnabled")
    public void setNestedScrollEnabled(WebView webView, boolean z10) {
        ((f) webView).setNestedScrollEnabled(z10);
    }

    @w6.a(name = "onContentSizeChange")
    public void setOnContentSizeChange(WebView webView, boolean z10) {
        ((f) webView).setSendContentSizeChangeEvents(z10);
    }

    @w6.a(name = "onScroll")
    public void setOnScroll(WebView webView, boolean z10) {
        ((f) webView).setHasScrollEvent(z10);
    }

    @w6.a(name = "overScrollMode")
    public void setOverScrollMode(WebView webView, String str) {
        char c10;
        Integer num;
        int hashCode = str.hashCode();
        if (hashCode == -1414557169) {
            if (str.equals("always")) {
                c10 = 2;
            }
            c10 = 65535;
        } else if (hashCode != 104712844) {
            if (hashCode == 951530617 && str.equals(AppLovinEventTypes.USER_VIEWED_CONTENT)) {
                c10 = 1;
            }
            c10 = 65535;
        } else {
            if (str.equals("never")) {
                c10 = 0;
            }
            c10 = 65535;
        }
        if (c10 == 0) {
            num = 2;
        } else if (c10 != 1) {
            num = 0;
        } else {
            num = 1;
        }
        webView.setOverScrollMode(num.intValue());
    }

    @w6.a(name = "saveFormDataDisabled")
    public void setSaveFormDataDisabled(WebView webView, boolean z10) {
        webView.getSettings().setSaveFormData(!z10);
    }

    @w6.a(name = "scalesPageToFit")
    public void setScalesPageToFit(WebView webView, boolean z10) {
        webView.getSettings().setLoadWithOverviewMode(z10);
        webView.getSettings().setUseWideViewPort(z10);
    }

    @w6.a(name = "showsHorizontalScrollIndicator")
    public void setShowsHorizontalScrollIndicator(WebView webView, boolean z10) {
        webView.setHorizontalScrollBarEnabled(z10);
    }

    @w6.a(name = "showsVerticalScrollIndicator")
    public void setShowsVerticalScrollIndicator(WebView webView, boolean z10) {
        webView.setVerticalScrollBarEnabled(z10);
    }

    @w6.a(name = "source")
    public void setSource(WebView webView, ReadableMap readableMap) {
        if (readableMap != null) {
            if (readableMap.hasKey("html")) {
                webView.loadDataWithBaseURL(readableMap.hasKey("baseUrl") ? readableMap.getString("baseUrl") : "", readableMap.getString("html"), HTML_MIME_TYPE, HTML_ENCODING, null);
                return;
            } else if (readableMap.hasKey("uri")) {
                String string = readableMap.getString("uri");
                String url = webView.getUrl();
                if (url == null || !url.equals(string)) {
                    if (readableMap.hasKey("method") && readableMap.getString("method").equalsIgnoreCase(HTTP_METHOD_POST)) {
                        byte[] bArr = null;
                        if (readableMap.hasKey("body")) {
                            String string2 = readableMap.getString("body");
                            try {
                                bArr = string2.getBytes(HTML_ENCODING);
                            } catch (UnsupportedEncodingException unused) {
                                bArr = string2.getBytes();
                            }
                        }
                        if (bArr == null) {
                            bArr = new byte[0];
                        }
                        webView.postUrl(string, bArr);
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    if (readableMap.hasKey("headers")) {
                        ReadableMap map = readableMap.getMap("headers");
                        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
                        while (keySetIterator.hasNextKey()) {
                            String nextKey = keySetIterator.nextKey();
                            if ("user-agent".equals(nextKey.toLowerCase(Locale.ENGLISH))) {
                                if (webView.getSettings() != null) {
                                    webView.getSettings().setUserAgentString(map.getString(nextKey));
                                }
                            } else {
                                hashMap.put(nextKey, map.getString(nextKey));
                            }
                        }
                    }
                    webView.loadUrl(string, hashMap);
                    return;
                }
                return;
            }
        }
        webView.loadUrl(BLANK_URL);
    }

    @w6.a(name = "setSupportMultipleWindows")
    public void setSupportMultipleWindows(WebView webView, boolean z10) {
        webView.getSettings().setSupportMultipleWindows(z10);
    }

    @w6.a(name = "textZoom")
    public void setTextZoom(WebView webView, int i10) {
        webView.getSettings().setTextZoom(i10);
    }

    @w6.a(name = "thirdPartyCookiesEnabled")
    public void setThirdPartyCookiesEnabled(WebView webView, boolean z10) {
        if (Build.VERSION.SDK_INT >= 21) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, z10);
        }
    }

    @w6.a(name = "urlPrefixesForDefaultIntent")
    public void setUrlPrefixesForDefaultIntent(WebView webView, ReadableArray readableArray) {
        g rNCWebViewClient = ((f) webView).getRNCWebViewClient();
        if (rNCWebViewClient == null || readableArray == null) {
            return;
        }
        rNCWebViewClient.setUrlPrefixesForDefaultIntent(readableArray);
    }

    @w6.a(name = "userAgent")
    public void setUserAgent(WebView webView, String str) {
        if (str != null) {
            this.mUserAgent = str;
        } else {
            this.mUserAgent = null;
        }
        setUserAgentString(webView);
    }

    protected void setUserAgentString(WebView webView) {
        if (this.mUserAgent != null) {
            webView.getSettings().setUserAgentString(this.mUserAgent);
        } else if (this.mUserAgentWithApplicationName != null) {
            webView.getSettings().setUserAgentString(this.mUserAgentWithApplicationName);
        } else if (Build.VERSION.SDK_INT >= 17) {
            webView.getSettings().setUserAgentString(WebSettings.getDefaultUserAgent(webView.getContext()));
        }
    }

    protected void setupWebChromeClient(ReactContext reactContext, WebView webView) {
        Activity currentActivity = reactContext.getCurrentActivity();
        if (this.mAllowsFullscreenVideo && currentActivity != null) {
            c cVar = new c(this, reactContext, webView, currentActivity, currentActivity.getRequestedOrientation());
            this.mWebChromeClient = cVar;
            webView.setWebChromeClient(cVar);
            return;
        }
        e eVar = this.mWebChromeClient;
        if (eVar != null) {
            eVar.onHideCustomView();
        }
        d dVar = new d(this, reactContext, webView);
        this.mWebChromeClient = dVar;
        webView.setWebChromeClient(dVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, WebView webView) {
        webView.setWebViewClient(new g());
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @TargetApi(21)
    public WebView createViewInstance(n0 n0Var) {
        f createRNCWebViewInstance = createRNCWebViewInstance(n0Var);
        setupWebChromeClient(n0Var, createRNCWebViewInstance);
        n0Var.addLifecycleEventListener(createRNCWebViewInstance);
        this.mWebViewConfig.a(createRNCWebViewInstance);
        WebSettings settings = createRNCWebViewInstance.getSettings();
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        if (Build.VERSION.SDK_INT >= 16) {
            settings.setAllowFileAccessFromFileURLs(false);
            setAllowUniversalAccessFromFileURLs(createRNCWebViewInstance, false);
        }
        setMixedContentMode(createRNCWebViewInstance, "never");
        createRNCWebViewInstance.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        createRNCWebViewInstance.setDownloadListener(new b(createRNCWebViewInstance, n0Var));
        return createRNCWebViewInstance;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(WebView webView) {
        super.onDropViewInstance((RNCWebViewManager) webView);
        f fVar = (f) webView;
        ((n0) webView.getContext()).removeLifecycleEventListener(fVar);
        fVar.cleanupCallbacksAndDestroy();
        this.mWebChromeClient = null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(WebView webView, String str, ReadableArray readableArray) {
        str.hashCode();
        boolean z10 = true;
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1241591313:
                if (str.equals("goBack")) {
                    c10 = 0;
                    break;
                }
                break;
            case -948122918:
                if (str.equals("stopLoading")) {
                    c10 = 1;
                    break;
                }
                break;
            case -934641255:
                if (str.equals("reload")) {
                    c10 = 2;
                    break;
                }
                break;
            case -759238347:
                if (str.equals("clearCache")) {
                    c10 = 3;
                    break;
                }
                break;
            case -318289731:
                if (str.equals("goForward")) {
                    c10 = 4;
                    break;
                }
                break;
            case -265032709:
                if (str.equals("clearFormData")) {
                    c10 = 5;
                    break;
                }
                break;
            case 336631465:
                if (str.equals("loadUrl")) {
                    c10 = 6;
                    break;
                }
                break;
            case 903120263:
                if (str.equals("clearHistory")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1280029577:
                if (str.equals("requestFocus")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1490029383:
                if (str.equals("postMessage")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 2104576510:
                if (str.equals("injectJavaScript")) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                webView.goBack();
                break;
            case 1:
                webView.stopLoading();
                break;
            case 2:
                webView.reload();
                break;
            case 3:
                webView.clearCache((readableArray == null || !readableArray.getBoolean(0)) ? false : false);
                break;
            case 4:
                webView.goForward();
                break;
            case 5:
                webView.clearFormData();
                break;
            case 6:
                if (readableArray != null) {
                    ((f) webView).progressChangedFilter.b(false);
                    webView.loadUrl(readableArray.getString(0));
                    break;
                } else {
                    throw new RuntimeException("Arguments for loading an url are null!");
                }
            case 7:
                webView.clearHistory();
                break;
            case '\b':
                webView.requestFocus();
                break;
            case '\t':
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("data", readableArray.getString(0));
                    ((f) webView).evaluateJavascriptWithFallback("(function () {var event;var data = " + jSONObject.toString() + ";try {event = new MessageEvent('message', data);} catch (e) {event = document.createEvent('MessageEvent');event.initMessageEvent('message', true, true, data.data, data.origin, data.lastEventId, data.source);}document.dispatchEvent(event);})();");
                    break;
                } catch (JSONException e10) {
                    throw new RuntimeException(e10);
                }
            case '\n':
                ((f) webView).evaluateJavascriptWithFallback(readableArray.getString(0));
                break;
        }
        super.receiveCommand((RNCWebViewManager) webView, str, readableArray);
    }

    public RNCWebViewManager(com.reactnativecommunity.webview.d dVar) {
        this.mWebChromeClient = null;
        this.mAllowsFullscreenVideo = false;
        this.mUserAgent = null;
        this.mUserAgentWithApplicationName = null;
        this.mDownloadingMessage = null;
        this.mLackPermissionToDownloadMessage = null;
        this.mWebViewConfig = dVar;
    }

    /* loaded from: classes3.dex */
    public static class g extends WebViewClient {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        protected ReadableArray mUrlPrefixesForDefaultIntent;
        protected boolean mLastLoadFailed = false;
        protected f.b progressChangedFilter = null;
        protected String ignoreErrFailedForThisURL = null;
        protected com.reactnativecommunity.webview.a basicAuthCredential = null;

        protected WritableMap createWebViewEvent(WebView webView, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putDouble(Analytics.Param.TARGET, webView.getId());
            createMap.putString(ImagesContract.URL, str);
            createMap.putBoolean(RNAdsEvents.EVENT_LOADING, (this.mLastLoadFailed || webView.getProgress() == 100) ? false : true);
            createMap.putString("title", webView.getTitle());
            createMap.putBoolean("canGoBack", webView.canGoBack());
            createMap.putBoolean("canGoForward", webView.canGoForward());
            return createMap;
        }

        protected void emitFinishEvent(WebView webView, String str) {
            ((f) webView).dispatchEvent(webView, new ld.c(webView.getId(), createWebViewEvent(webView, str)));
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.mLastLoadFailed) {
                return;
            }
            ((f) webView).callInjectedJavaScript();
            emitFinishEvent(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            this.mLastLoadFailed = false;
            f fVar = (f) webView;
            fVar.callInjectedJavaScriptBeforeContentLoaded();
            fVar.dispatchEvent(webView, new ld.e(webView.getId(), createWebViewEvent(webView, str)));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            String str3 = this.ignoreErrFailedForThisURL;
            if (str3 != null && str2.equals(str3) && i10 == -1 && str.equals("net::ERR_FAILED")) {
                setIgnoreErrFailedForThisURL(null);
                return;
            }
            super.onReceivedError(webView, i10, str, str2);
            this.mLastLoadFailed = true;
            emitFinishEvent(webView, str2);
            WritableMap createWebViewEvent = createWebViewEvent(webView, str2);
            createWebViewEvent.putDouble(Analytics.Param.CODE, i10);
            createWebViewEvent.putString("description", str);
            ((f) webView).dispatchEvent(webView, new ld.b(webView.getId(), createWebViewEvent));
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            com.reactnativecommunity.webview.a aVar = this.basicAuthCredential;
            if (aVar != null) {
                httpAuthHandler.proceed(aVar.f28377a, aVar.f28378b);
            } else {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            if (webResourceRequest.isForMainFrame()) {
                WritableMap createWebViewEvent = createWebViewEvent(webView, webResourceRequest.getUrl().toString());
                createWebViewEvent.putInt("statusCode", webResourceResponse.getStatusCode());
                createWebViewEvent.putString("description", webResourceResponse.getReasonPhrase());
                ((f) webView).dispatchEvent(webView, new ld.a(webView.getId(), createWebViewEvent));
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String url = webView.getUrl();
            String url2 = sslError.getUrl();
            sslErrorHandler.cancel();
            if (!url.equalsIgnoreCase(url2)) {
                Log.w(RNCWebViewManager.TAG, "Resource blocked from loading due to SSL error. Blocked URL: " + url2);
                return;
            }
            int primaryError = sslError.getPrimaryError();
            String str = primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? "Unknown SSL Error" : "A generic error occurred" : "The date of the certificate is invalid" : "The certificate authority is not trusted" : "Hostname mismatch" : "The certificate has expired" : "The certificate is not yet valid";
            onReceivedError(webView, primaryError, "SSL error: " + str, url2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            super.onRenderProcessGone(webView, renderProcessGoneDetail);
            if (renderProcessGoneDetail.didCrash()) {
                Log.e(RNCWebViewManager.TAG, "The WebView rendering process crashed.");
            } else {
                Log.w(RNCWebViewManager.TAG, "The WebView rendering process was killed by the system.");
            }
            if (webView == null) {
                return true;
            }
            WritableMap createWebViewEvent = createWebViewEvent(webView, webView.getUrl());
            createWebViewEvent.putBoolean("didCrash", renderProcessGoneDetail.didCrash());
            ((f) webView).dispatchEvent(webView, new ld.g(webView.getId(), createWebViewEvent));
            return true;
        }

        public void setBasicAuthCredential(com.reactnativecommunity.webview.a aVar) {
            this.basicAuthCredential = aVar;
        }

        public void setIgnoreErrFailedForThisURL(String str) {
            this.ignoreErrFailedForThisURL = str;
        }

        public void setProgressChangedFilter(f.b bVar) {
            this.progressChangedFilter = bVar;
        }

        public void setUrlPrefixesForDefaultIntent(ReadableArray readableArray) {
            this.mUrlPrefixesForDefaultIntent = readableArray;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            f fVar = (f) webView;
            if (!(((ReactContext) webView.getContext()).getJavaScriptContextHolder().get() == 0) && fVar.mCatalystInstance != null) {
                h0.d<Integer, AtomicReference<RNCWebViewModule.d.a>> b10 = RNCWebViewModule.shouldOverrideUrlLoadingLock.b();
                int intValue = b10.f31049a.intValue();
                AtomicReference<RNCWebViewModule.d.a> atomicReference = b10.f31050b;
                WritableMap createWebViewEvent = createWebViewEvent(webView, str);
                createWebViewEvent.putInt("lockIdentifier", intValue);
                fVar.sendDirectMessage("onShouldStartLoadWithRequest", createWebViewEvent);
                try {
                    synchronized (atomicReference) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        while (atomicReference.get() == RNCWebViewModule.d.a.UNDECIDED) {
                            if (SystemClock.elapsedRealtime() - elapsedRealtime > 250) {
                                z3.a.G(RNCWebViewManager.TAG, "Did not receive response to shouldOverrideUrlLoading in time, defaulting to allow loading.");
                                RNCWebViewModule.shouldOverrideUrlLoadingLock.c(Integer.valueOf(intValue));
                                return false;
                            }
                            atomicReference.wait(250L);
                        }
                        boolean z10 = atomicReference.get() == RNCWebViewModule.d.a.SHOULD_OVERRIDE;
                        RNCWebViewModule.shouldOverrideUrlLoadingLock.c(Integer.valueOf(intValue));
                        return z10;
                    }
                } catch (InterruptedException e10) {
                    z3.a.k(RNCWebViewManager.TAG, "shouldOverrideUrlLoading was interrupted while waiting for result.", e10);
                    RNCWebViewModule.shouldOverrideUrlLoadingLock.c(Integer.valueOf(intValue));
                    return false;
                }
            }
            z3.a.G(RNCWebViewManager.TAG, "Couldn't use blocking synchronous call for onShouldStartLoadWithRequest due to debugging or missing Catalyst instance, falling back to old event-and-load.");
            this.progressChangedFilter.b(true);
            ((f) webView).dispatchEvent(webView, new h(webView.getId(), createWebViewEvent(webView, str)));
            return true;
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
    }
}
