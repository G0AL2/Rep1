package com.amazon.device.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ScrollView;
import com.amazon.device.ads.DTBAdView;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DTBAdView extends WebView {
    public static final String AMAZON_AD_INFO = "amazon_ad_info";
    static final String AMAZON_BRIDGE = "amzn_bridge";
    public static final String BID_HTML = "bid_html_template";
    public static final String BID_IDENTIFIER = "bid_identifier";
    private static final String ENV_TEMPLATE = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,impFired:true};";
    private static final String ENV_TEMPLATE_INFO = "window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,amznAdInfo:%s,impFired:true};";
    public static final String EVENT_SERVER_PARAMETER = "event_server_parameter";
    public static final String EXPECTED_HEIGHT = "expected_height";
    public static final String EXPECTED_WIDTH = "expected_width";
    public static final String HOSTNAME_IDENTIFIER = "hostname_identifier";
    static final String LOG_TAG = DTBAdView.class.getSimpleName();
    static final String MRAID_IDENTIFIER = "MRAID_ENV";
    public static final String REQUEST_QUEUE = "amazon_request_queue";
    public static final String SMARTBANNER_STATE = "smart_banner_state";
    public static final String START_LOAD_TIME = "start_load_time";
    private String bidId;
    private DTBAdMRAIDController controller;
    private String dtbAdInterstitialId;
    private int exposurePercent;
    ViewTreeObserver.OnGlobalFocusChangeListener focusChangeListener;
    ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private String hostname;
    private boolean ignoreDetachment;
    private boolean isFirstDisplay;
    private boolean isVisible;
    private boolean localOnly;
    ViewTreeObserver.OnScrollChangedListener scrollChangeListener;
    private boolean scrollEnabled;
    private long startTime;
    DTBAdViewSupportClient supportClient;
    private long timeClicked;
    private long timePressed;
    private WebBridge webBridge;

    /* loaded from: classes.dex */
    public class WebBridge {
        Exception execException;

        WebBridge() {
            DTBAdView.this = r1;
        }

        public static /* synthetic */ void a(WebBridge webBridge, String str) {
            webBridge.lambda$echo$0(str);
        }

        public /* synthetic */ void lambda$echo$0(String str) {
            DTBAdView.this.evaluateJavascript(str, null);
        }

        private void logFromJavasScript(String str) {
            DtbLog.debug("mraid:JSNative", str);
        }

        void echo(JSONObject jSONObject) {
            try {
                Integer valueOf = Integer.valueOf(jSONObject.getInt("promiseId"));
                final String format = String.format("window.promiseResolve(%d, '%s');", valueOf, jSONObject.getJSONObject("arguments").getString("greeting") + " Returned");
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        DTBAdView.WebBridge.a(DTBAdView.WebBridge.this, format);
                    }
                });
            } catch (JSONException e10) {
                String str = DTBAdView.LOG_TAG;
                DtbLog.debug(str, "JSON conversion failed:" + e10);
            }
        }

        Exception getExecutionException() {
            return this.execException;
        }

        void handleMraidCommand(JSONObject jSONObject) throws JSONException {
            this.execException = null;
            String string = jSONObject.getString("subtype");
            Class<MraidCommand> findMraidCommandByName = MraidCommand.findMraidCommandByName(string);
            if (findMraidCommandByName == null) {
                DtbLog.error("MRAID Command:" + string + " is not found");
                DTBAdMRAIDController dTBAdMRAIDController = DTBAdView.this.controller;
                dTBAdMRAIDController.fireErrorEvent(string, string + " is not supported");
                DTBAdView.this.controller.commandCompleted(string);
                return;
            }
            try {
                MraidCommand newInstance = findMraidCommandByName.newInstance();
                String str = DTBAdView.LOG_TAG;
                DtbLog.debug(str, "execute command " + newInstance.getName());
                newInstance.execute(jSONObject.getJSONObject("arguments"), DTBAdView.this.controller);
            } catch (JSONException e10) {
                throw e10;
            } catch (Exception e11) {
                this.execException = e11;
                DtbLog.debug("Error execution command " + string + " " + e11.getLocalizedMessage());
            }
        }

        void handleServiceCall(JSONObject jSONObject) throws JSONException {
            if ("log".equals(jSONObject.getString("subtype"))) {
                logFromJavasScript(jSONObject.getJSONObject("arguments").getString("message"));
            }
        }

        @JavascriptInterface
        public void postMessage(String str) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("type")) {
                    String string = jSONObject.getString("type");
                    if ("service".equals(string)) {
                        handleServiceCall(jSONObject);
                        return;
                    } else if ("mraid".equals(string)) {
                        handleMraidCommand(jSONObject);
                        return;
                    } else {
                        return;
                    }
                }
                DtbLog.error("Unrecognized bridge call");
            } catch (JSONException e10) {
                String str2 = DTBAdView.LOG_TAG;
                DtbLog.debug(str2, "JSON conversion failed:" + e10);
            }
        }
    }

    public DTBAdView(Context context, DTBAdInterstitialListener dTBAdInterstitialListener) {
        super(context);
        this.scrollEnabled = true;
        this.ignoreDetachment = false;
        this.isFirstDisplay = true;
        this.isVisible = false;
        this.exposurePercent = -1;
        this.localOnly = WebResourceOptions.isLocalSourcesOnly();
        CookieManager.getInstance().setAcceptCookie(true);
        try {
            this.controller = new DTBAdMRAIDInterstitialController(this, dTBAdInterstitialListener);
            commonInit();
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to initialize DTBAdView class with DTBAdInterstitialListener");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdInterstitialListener", e10);
        }
    }

    public static /* synthetic */ boolean a(DTBAdView dTBAdView, View view, MotionEvent motionEvent) {
        return dTBAdView.lambda$commonInit$0(view, motionEvent);
    }

    private void commonInit() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setAllowContentAccess(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setAppCacheEnabled(true);
        getSettings().setAllowFileAccess(false);
        getSettings().setLoadsImagesAutomatically(true);
        if (AdRegistration.isTestMode() && Build.VERSION.SDK_INT >= 19) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        getSettings().setBlockNetworkImage(false);
        DTBAdViewSupportClient dTBAdViewSupportClient = new DTBAdViewSupportClient(getContext(), this.controller);
        this.supportClient = dTBAdViewSupportClient;
        setWebViewClient(dTBAdViewSupportClient);
        setScrollEnabled(false);
        WebBridge webBridge = new WebBridge();
        this.webBridge = webBridge;
        addJavascriptInterface(webBridge, AMAZON_BRIDGE);
        WebResourceService.init();
        this.globalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.amazon.device.ads.DTBAdView.1
            {
                DTBAdView.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                DTBAdView.this.verifyIsVisible();
            }
        };
        getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
        this.focusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener() { // from class: com.amazon.device.ads.DTBAdView.2
            {
                DTBAdView.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
            public void onGlobalFocusChanged(View view, View view2) {
                DTBAdView.this.verifyIsVisible();
            }
        };
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.focusChangeListener);
        this.scrollChangeListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.amazon.device.ads.DTBAdView.3
            {
                DTBAdView.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public void onScrollChanged() {
                DTBAdView.this.verifyIsVisible();
            }
        };
        getViewTreeObserver().addOnScrollChangedListener(this.scrollChangeListener);
        setOnTouchListener(new View.OnTouchListener() { // from class: com.amazon.device.ads.c0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DTBAdView.a(DTBAdView.this, view, motionEvent);
            }
        });
    }

    private void computeExposureInScrollView(ScrollView scrollView, boolean z10) {
        ViewGroup viewGroup;
        Activity activity = DTBAdUtil.getActivity((View) getParent());
        if (activity == null || (viewGroup = (ViewGroup) activity.findViewById(16908290)) == null) {
            return;
        }
        int[] iArr = new int[2];
        viewGroup.getLocationInWindow(iArr);
        Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + viewGroup.getWidth(), iArr[1] + viewGroup.getHeight());
        int[] iArr2 = new int[2];
        getLocationInWindow(iArr2);
        float width = getWidth() * getHeight();
        Rect rect2 = new Rect(iArr2[0], iArr2[1], iArr2[0] + getWidth(), iArr2[1] + getHeight());
        if (scrollView == null) {
            rect2.intersect(rect);
        } else {
            int[] iArr3 = new int[2];
            scrollView.getLocationInWindow(iArr3);
            Rect rect3 = new Rect(iArr3[0], iArr3[1], iArr3[0] + scrollView.getWidth(), iArr3[1] + scrollView.getHeight());
            rect3.intersect(rect);
            rect2.intersect(rect3);
        }
        int i10 = width != 0.0f ? (int) ((((rect2.right - rect2.left) * (rect2.bottom - rect2.top)) * 100.0f) / width) : 0;
        if (i10 != this.exposurePercent || z10) {
            this.exposurePercent = i10;
            this.controller.fireExposureChange(i10, rect2);
            this.controller.setCurrentPositionProperty();
        }
    }

    private ScrollView getScrollViewParent() {
        View view = this;
        while (true) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            if (parent instanceof ScrollView) {
                return (ScrollView) parent;
            }
            view = (View) parent;
        }
    }

    public /* synthetic */ boolean lambda$commonInit$0(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        long time = new Date().getTime();
        if (action == 0) {
            this.timePressed = time;
            return false;
        } else if (action != 1) {
            this.timePressed = 0L;
            return false;
        } else if (time - this.timeClicked < 1000) {
            return false;
        } else {
            if (time - this.timePressed < 500) {
                this.timeClicked = time;
                this.controller.onAdClicked();
            }
            this.timePressed = 0L;
            return false;
        }
    }

    private void loadLocalFile(String str, StringBuilder sb2) {
        if (!this.localOnly) {
            try {
                String loadFile = WebResourceService.getInstance().loadFile(str);
                if (loadFile != null) {
                    sb2.append("<script>");
                    sb2.append(loadFile);
                    sb2.append("</script>");
                    return;
                }
            } catch (Exception unused) {
                DtbLog.error(LOG_TAG, "Failed to read local file");
            }
        }
        sb2.append("<script>");
        try {
            AssetManager assets = getContext().getAssets();
            InputStream open = assets.open(str + ".js");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb2.append(readLine.trim());
                sb2.append("\n");
            }
            bufferedReader.close();
            open.close();
        } catch (Exception unused2) {
            DtbLog.error("Error reading file:" + str);
        }
        sb2.append("</script>");
    }

    private void setIsVisible(boolean z10) {
        this.isVisible = z10;
        if (z10) {
            return;
        }
        this.exposurePercent = -1;
        DTBAdMRAIDController dTBAdMRAIDController = this.controller;
        if (dTBAdMRAIDController != null) {
            dTBAdMRAIDController.fireExposureChange(0, new Rect(0, 0, 0, 0));
        }
    }

    public void verifyIsVisible() {
        if (getParent() != null && getVisibility() == 0) {
            Activity currentActivity = AdRegistration.getCurrentActivity();
            if (currentActivity == null) {
                if (this.isVisible) {
                    DTBAdMRAIDController dTBAdMRAIDController = this.controller;
                    if (dTBAdMRAIDController != null) {
                        dTBAdMRAIDController.onViewabilityChanged(false);
                    }
                    setIsVisible(false);
                    return;
                }
                return;
            }
            ViewGroup viewGroup = (ViewGroup) currentActivity.findViewById(16908290);
            if (viewGroup == null) {
                if (this.isVisible) {
                    DTBAdMRAIDController dTBAdMRAIDController2 = this.controller;
                    if (dTBAdMRAIDController2 != null) {
                        dTBAdMRAIDController2.onViewabilityChanged(false);
                    }
                    setIsVisible(false);
                    return;
                }
                return;
            }
            int[] iArr = new int[2];
            viewGroup.getLocationInWindow(iArr);
            Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + viewGroup.getWidth(), iArr[1] + viewGroup.getHeight());
            int[] iArr2 = new int[2];
            getLocationInWindow(iArr2);
            Rect rect2 = new Rect(iArr2[0], iArr2[1], iArr2[0] + getWidth(), iArr2[1] + getHeight());
            if (!rect.contains(rect2) && !Rect.intersects(rect, rect2)) {
                if (this.isVisible) {
                    DTBAdMRAIDController dTBAdMRAIDController3 = this.controller;
                    if (dTBAdMRAIDController3 != null) {
                        dTBAdMRAIDController3.onViewabilityChanged(false);
                    }
                    setIsVisible(false);
                    DtbLog.debug("SET MRAID Visible false because of root");
                }
            } else {
                ScrollView scrollViewParent = getScrollViewParent();
                if (scrollViewParent != null) {
                    int[] iArr3 = new int[2];
                    scrollViewParent.getLocationInWindow(iArr3);
                    Rect rect3 = new Rect(iArr3[0], iArr3[1], iArr3[0] + scrollViewParent.getWidth(), iArr3[1] + scrollViewParent.getHeight());
                    if (!Rect.intersects(rect2, rect3) && this.isVisible) {
                        DTBAdMRAIDController dTBAdMRAIDController4 = this.controller;
                        if (dTBAdMRAIDController4 != null) {
                            dTBAdMRAIDController4.onViewabilityChanged(false);
                        }
                        setIsVisible(false);
                        DtbLog.debug("SET MRAID Visible false because of scroll ");
                    } else if (Rect.intersects(rect2, rect3) && !this.isVisible) {
                        DTBAdMRAIDController dTBAdMRAIDController5 = this.controller;
                        if (dTBAdMRAIDController5 != null) {
                            dTBAdMRAIDController5.onViewabilityChanged(true);
                        }
                        setIsVisible(true);
                        DtbLog.debug("SET MRAID Visible true because of scroll ");
                    }
                } else {
                    DTBAdMRAIDController dTBAdMRAIDController6 = this.controller;
                    if (dTBAdMRAIDController6 != null && !this.isVisible) {
                        dTBAdMRAIDController6.onViewabilityChanged(true);
                    }
                    setIsVisible(true);
                }
            }
            if (this.isVisible) {
                computeExposure();
            }
        } else if (this.isVisible) {
            DTBAdMRAIDController dTBAdMRAIDController7 = this.controller;
            if (dTBAdMRAIDController7 != null) {
                dTBAdMRAIDController7.onViewabilityChanged(false);
            }
            setIsVisible(false);
        }
    }

    public void cleanup() {
        removeJavascriptInterface(AMAZON_BRIDGE);
        DTBAdMRAIDController dTBAdMRAIDController = this.controller;
        dTBAdMRAIDController.adView = null;
        dTBAdMRAIDController.customButtonListener = null;
        this.controller = null;
    }

    void computeExposure() {
        computeExposure(false);
    }

    void computeExposureInRootView() {
        computeExposureInRootView(false);
    }

    @Override // android.webkit.WebView
    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    public void fetchAd(Map<String, Object> map) {
        fetchAd((String) null, map);
    }

    public void fetchAdWithLocation(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("<script>");
            sb2.append(getEnvironment(null));
            sb2.append("</script>");
            loadLocalFile("aps-mraid", sb2);
            sb2.append("<script>");
            sb2.append("window.location=\"");
            sb2.append(str);
            sb2.append("\";");
            sb2.append("</script>");
            loadDataWithBaseURL("https://c.amazon-adsystem.com/", sb2.toString(), "text/html", "UTF-8", null);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute fetchAdWithLocation method");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute fetchAdWithLocation method", e10);
        }
    }

    public void finalize() {
        try {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
            getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangeListener);
            getViewTreeObserver().removeOnGlobalFocusChangeListener(this.focusChangeListener);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute finalize method");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute finalize method", e10);
        }
    }

    public String getBidId() {
        return this.bidId;
    }

    public DTBAdMRAIDController getController() {
        return this.controller;
    }

    public String getDtbAdInterstitialId() {
        return this.dtbAdInterstitialId;
    }

    String getEnvironment(Bundle bundle) {
        String string = bundle != null ? bundle.getString(AMAZON_AD_INFO) : null;
        Context context = getContext();
        String str = (String) context.getPackageManager().getApplicationLabel(context.getApplicationInfo());
        String idfa = DtbSharedPreferences.getInstance().getIdfa();
        if (DtbCommonUtils.isNullOrEmpty(idfa)) {
            idfa = DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        }
        Boolean optOut = DtbSharedPreferences.getInstance().getOptOut();
        if (optOut == null) {
            optOut = Boolean.FALSE;
        }
        Boolean bool = Boolean.FALSE;
        return string == null ? String.format(ENV_TEMPLATE, "3.0", DtbCommonUtils.getSDKMRAIDVersion(), "9.3.0", str, idfa, optOut, bool) : String.format(ENV_TEMPLATE_INFO, "3.0", DtbCommonUtils.getSDKMRAIDVersion(), "9.3.0", str, idfa, optOut, bool, string);
    }

    public String getHostname() {
        return this.hostname;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void onAdRemoved() {
        this.controller.onAdRemoved();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            getViewTreeObserver().addOnGlobalLayoutListener(this.globalLayoutListener);
            getViewTreeObserver().addOnGlobalFocusChangeListener(this.focusChangeListener);
            getViewTreeObserver().addOnScrollChangedListener(this.scrollChangeListener);
            DTBAdMRAIDController controller = getController();
            if (controller != null) {
                controller.onAdOpened(this);
            }
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute onAttachedToWindow method in DTBAdView class");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute onAttachedToWindow method in DTBAdView class", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
            getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
            getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangeListener);
            getViewTreeObserver().removeOnGlobalFocusChangeListener(this.focusChangeListener);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute onDetachedFromWindow method in DTBAdView class");
            l2.a.i(m2.b.ERROR, m2.c.EXCEPTION, "Fail to execute onDetachedFromWindow method in DTBAdView class", e10);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.isFirstDisplay) {
            if (DTBTimeTrace.getInstance() != null && AdRegistration.isTestMode()) {
                DTBTimeTrace.getInstance().addPhase(DTBTimeTrace.TIMETRACE_AD_DISPLAY_SUCCEEDED);
                DTBTimeTrace.getInstance().logTrace();
            }
            DTBAdMRAIDController dTBAdMRAIDController = this.controller;
            if (dTBAdMRAIDController instanceof DTBAdViewDisplayListener) {
                ((DTBAdViewDisplayListener) dTBAdMRAIDController).onInitialDisplay();
            }
            this.isFirstDisplay = false;
        }
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        if (this.scrollEnabled) {
            super.onScrollChanged(i10, i11, i13, i12);
        } else {
            scrollTo(0, 0);
        }
    }

    public void setIgnoreDetachment() {
        this.ignoreDetachment = true;
    }

    public void setInterstitialId(String str) {
        this.dtbAdInterstitialId = str;
    }

    public void setScrollEnabled(boolean z10) {
        this.scrollEnabled = z10;
        setVerticalScrollBarEnabled(z10);
        setHorizontalScrollBarEnabled(z10);
    }

    public void computeExposure(boolean z10) {
        ScrollView scrollViewParent = getScrollViewParent();
        if (scrollViewParent != null) {
            computeExposureInScrollView(scrollViewParent, z10);
            return;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + getWidth(), iArr[1] + getHeight());
        if (this.controller != null) {
            computeExposureInRootView(z10);
            this.controller.onPositionChanged(rect);
        }
    }

    void computeExposureInRootView(boolean z10) {
        ViewGroup viewGroup;
        View view = (View) getParent();
        Activity activity = view != null ? DTBAdUtil.getActivity(view) : DTBAdUtil.getActivity(this);
        if (activity == null || (viewGroup = (ViewGroup) activity.findViewById(16908290)) == null) {
            return;
        }
        int[] iArr = new int[2];
        viewGroup.getLocationInWindow(iArr);
        Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + viewGroup.getWidth(), iArr[1] + viewGroup.getHeight());
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        Rect rect2 = new Rect(iArr2[0], iArr2[1], iArr2[0] + getWidth(), iArr2[1] + getHeight());
        float width = getWidth() * getHeight();
        if (rect2.intersect(rect)) {
            int i10 = (int) (((((rect2.right - rect2.left) * (rect2.bottom - rect2.top)) * 100.0d) / width) + 0.5d);
            if (i10 != this.exposurePercent || z10) {
                this.exposurePercent = i10;
                this.controller.fireExposureChange(i10, rect2);
            }
        } else if (this.exposurePercent != 0 || z10) {
            this.exposurePercent = 0;
            rect2.top = rect2.bottom;
            this.controller.fireExposureChange(0, rect2);
        }
    }

    public void fetchAd(String str, Map<String, Object> map) {
        try {
            Bundle initializeEmptyBundle = DtbCommonUtils.initializeEmptyBundle();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    initializeEmptyBundle.putString(entry.getKey(), (String) value);
                } else if (value instanceof Boolean) {
                    initializeEmptyBundle.putBoolean(entry.getKey(), ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    initializeEmptyBundle.putInt(entry.getKey(), ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    initializeEmptyBundle.putLong(entry.getKey(), ((Long) value).longValue());
                }
            }
            fetchAd(str, initializeEmptyBundle);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute fetchAd method with map bundle");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute fetchAd method with map bundle", e10);
        }
    }

    public DTBAdView(Context context, DTBAdBannerListener dTBAdBannerListener) {
        super(context);
        this.scrollEnabled = true;
        this.ignoreDetachment = false;
        this.isFirstDisplay = true;
        this.isVisible = false;
        this.exposurePercent = -1;
        this.localOnly = WebResourceOptions.isLocalSourcesOnly();
        CookieManager.getInstance().setAcceptCookie(true);
        try {
            this.controller = new DTBAdMRAIDBannerController(this, dTBAdBannerListener);
            commonInit();
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to initialize DTBAdView class with DTBAdBannerListener");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdBannerListener", e10);
        }
    }

    public void fetchAd(String str) {
        fetchAd(str, (Bundle) null);
    }

    public void fetchAd(Bundle bundle) {
        fetchAd((String) null, bundle);
    }

    public void fetchAd(String str, Bundle bundle) {
        if (str == null) {
            try {
                str = bundle.getString(BID_HTML, null);
            } catch (RuntimeException e10) {
                DtbLog.error(LOG_TAG, "Fail to execute fetchAd method with bundle");
                l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute fetchAd method with bundle", e10);
                return;
            }
        }
        if (bundle != null) {
            DTBAdMRAIDController dTBAdMRAIDController = this.controller;
            if (dTBAdMRAIDController instanceof DTBAdMRAIDBannerController) {
                DTBAdBannerListener dTBAdBannerListener = ((DTBAdMRAIDBannerController) dTBAdMRAIDController).bannerListener;
                int i10 = bundle.getInt(EXPECTED_WIDTH, 0);
                int i11 = bundle.getInt(EXPECTED_HEIGHT, 0);
                if (i11 > 0 && i10 > 0 && (dTBAdBannerListener instanceof DTBExpectedSizeProvider)) {
                    DTBExpectedSizeProvider dTBExpectedSizeProvider = (DTBExpectedSizeProvider) dTBAdBannerListener;
                    dTBExpectedSizeProvider.setExpectedWidth(i10);
                    dTBExpectedSizeProvider.setExpectedHeight(i11);
                }
            }
        }
        if (bundle != null) {
            this.bidId = bundle.getString(BID_IDENTIFIER);
            this.hostname = bundle.getString(HOSTNAME_IDENTIFIER);
        }
        this.startTime = new Date().getTime();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<!DOCTYPE html><html><head>");
        sb2.append("<script>");
        sb2.append(getEnvironment(bundle));
        sb2.append("</script>");
        loadLocalFile("aps-mraid", sb2);
        loadLocalFile("dtb-m", sb2);
        sb2.append("</head>");
        sb2.append("<body style='margin:0;padding:0;'>");
        sb2.append(str);
        sb2.append("</body></html>");
        loadDataWithBaseURL("https://c.amazon-adsystem.com/", sb2.toString(), "text/html", "UTF-8", null);
    }

    public DTBAdView(Context context, DTBAdExpandedListener dTBAdExpandedListener) {
        this(context, dTBAdExpandedListener, 0);
    }

    public DTBAdView(Context context, DTBAdExpandedListener dTBAdExpandedListener, int i10) {
        super(context);
        this.scrollEnabled = true;
        this.ignoreDetachment = false;
        this.isFirstDisplay = true;
        this.isVisible = false;
        this.exposurePercent = -1;
        this.localOnly = WebResourceOptions.isLocalSourcesOnly();
        CookieManager.getInstance().setAcceptCookie(true);
        try {
            DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController = new DTBAdMRAIDExpandedController(this);
            this.controller = dTBAdMRAIDExpandedController;
            dTBAdMRAIDExpandedController.setMasterController(DTBAdMRAIDBannerController.findControllerByIndex(i10));
            dTBAdExpandedListener.onCreateExpandedController((DTBAdMRAIDExpandedController) this.controller);
            commonInit();
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to initialize DTBAdView class with DTBAdExpandedListener");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to initialize DTBAdView class with DTBAdExpandedListener", e10);
        }
    }
}
