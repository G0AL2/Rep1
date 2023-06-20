package com.amazon.device.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.amazon.device.ads.SDKUtilities;
import com.applovin.impl.sdk.utils.Utils;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class DTBAdMRAIDController implements DTBActivityListener {
    static final String LOG_TAG = "DTBAdMRAIDController";
    static final String MRAID_CLOSE = "window.mraid.close();";
    private static final String MRAID_READY = "window.mraidBridge.event.ready();";
    DTBAdView adView;
    LinearLayout closeIndicatorRegion;
    DTBMRAIDCloseButtonListener customButtonListener;
    private Rect lastRect;
    private MraidExposure lastReportedExposure;
    private Boolean lastViewabilityState;
    private boolean loadReportSubmitted;
    boolean pageLoaded = false;
    protected boolean useCustomClose = false;
    private int lastReportedSizeChangeWidth = -1;
    private int lastReportedSizeChangeHeight = -1;
    protected MraidStateType state = MraidStateType.LOADING;
    private boolean jsReady = false;
    private boolean isTwoPartExpand = false;

    /* renamed from: com.amazon.device.ads.DTBAdMRAIDController$2 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$MraidStateType;

        static {
            int[] iArr = new int[MraidStateType.values().length];
            $SwitchMap$com$amazon$device$ads$MraidStateType = iArr;
            try {
                iArr[MraidStateType.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.RESIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.EXPANDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.HIDDEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class MraidExposure {
        int percent;
        Rect rect;

        MraidExposure(int i10, Rect rect) {
            DTBAdMRAIDController.this = r1;
            this.percent = i10;
            this.rect = new Rect(rect);
        }
    }

    static {
        MraidCommand.registerCommand(MraidOpenCommand.getMraidName(), MraidOpenCommand.class);
        MraidCommand.registerCommand(MraidCloseCommand.getMraidName(), MraidCloseCommand.class);
        MraidCommand.registerCommand(MraidUnloadCommand.getMraidName(), MraidUnloadCommand.class);
        MraidCommand.registerCommand(MraidResizeCommand.getMraidName(), MraidResizeCommand.class);
        MraidCommand.registerCommand(MraidExpandCommand.getMraidName(), MraidExpandCommand.class);
        MraidCommand.registerCommand(MraidUseCustomCloseCommand.getMraidName(), MraidUseCustomCloseCommand.class);
        MraidCommand.registerCommand(MraidJSReadyCommand.getMraidName(), MraidJSReadyCommand.class);
        MraidCommand.registerCommand(MraidFirePixelCommand.getMraidName(), MraidFirePixelCommand.class);
    }

    public DTBAdMRAIDController(DTBAdView dTBAdView) {
        this.adView = dTBAdView;
    }

    public static /* synthetic */ void a(DTBAdMRAIDController dTBAdMRAIDController) {
        dTBAdMRAIDController.lambda$onMRAIDUnload$2();
    }

    public static /* synthetic */ void b(DTBAdMRAIDController dTBAdMRAIDController, String str) {
        dTBAdMRAIDController.lambda$evaluateJavascript$0(str);
    }

    public static /* synthetic */ boolean c(DTBAdMRAIDController dTBAdMRAIDController, View view, MotionEvent motionEvent) {
        return dTBAdMRAIDController.lambda$setCloseIndicatorContent$3(view, motionEvent);
    }

    public static /* synthetic */ void d(DTBAdMRAIDController dTBAdMRAIDController) {
        dTBAdMRAIDController.lambda$setState$1();
    }

    private void evaluateJavascriptMethod(String str, JSONObject jSONObject) {
        evaluateJavascript(String.format(str + "(%s);", jSONObject.toString()));
    }

    private void fireEnforcedExposureChange(int i10, Rect rect) {
        evaluateJavascript(String.format("window.mraidBridge.event.exposureChange(%d, { x:%d, y:%d, width:%d, height: %d}, null);", Integer.valueOf(i10), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.left)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.top)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.right - rect.left)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.bottom - rect.top))));
    }

    private void fireMaxSizeEvent() {
        SDKUtilities.SimpleSize maxSize = DTBAdUtil.getMaxSize(getAdView());
        evaluateJavascript(String.format("window.mraidBridge.property.setMaxSize({'width':%d, 'height':%d});", Integer.valueOf(maxSize.getWidth()), Integer.valueOf(maxSize.getHeight())));
    }

    private JSONObject formProperties(MraidProperty[] mraidPropertyArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (MraidProperty mraidProperty : mraidPropertyArr) {
            mraidProperty.formJSON(jSONObject);
        }
        return jSONObject;
    }

    private MraidProperty getCurrentStateProperty() {
        int i10 = AnonymousClass2.$SwitchMap$com$amazon$device$ads$MraidStateType[this.state.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            return MraidProperty.STATE_DEFAULT_PROPERTY;
                        }
                        return MraidProperty.STATE_HIDDEN_PROPERTY;
                    }
                    return MraidProperty.STATE_EXPANDED_PROPERTY;
                }
                return MraidProperty.STATE_RESIZED_PROPERTY;
            }
            return MraidProperty.STATE_DEFAULT_PROPERTY;
        }
        return MraidProperty.STATE_LOADING_PROPERTY;
    }

    public /* synthetic */ void lambda$evaluateJavascript$0(final String str) {
        if (getAdView() != null) {
            getAdView().evaluateJavascript(str, new ValueCallback<String>() { // from class: com.amazon.device.ads.DTBAdMRAIDController.1
                {
                    DTBAdMRAIDController.this = this;
                }

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str2) {
                    if (str2 == null || "null".equals(str2)) {
                        return;
                    }
                    String str3 = DTBAdMRAIDController.LOG_TAG;
                    DtbLog.debug(str3, "Value received:" + str2 + " for script " + str);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onMRAIDUnload$2() {
        getAdView().loadUrl("about:blank");
    }

    public /* synthetic */ boolean lambda$setCloseIndicatorContent$3(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            evaluateJavascript(MRAID_CLOSE);
            ((ViewGroup) view.getParent()).removeView(view);
            this.closeIndicatorRegion = null;
            return true;
        }
        return true;
    }

    public /* synthetic */ void lambda$setState$1() {
        DTBAdView adView = getAdView();
        if (adView != null) {
            adView.setVisibility(8);
        }
    }

    public void addCloseIndicator(int i10, int i11) {
        removeCloseIndicator();
        addCloseIndicator(i10, i11, false);
    }

    public void closeExpandedPartTwo() {
    }

    public void commandCompleted(String str) {
        evaluateJavascript(String.format("window.mraidBridge.service.acknowledgement('%s');", str));
    }

    public void createContentIndicator() {
        LinearLayout linearLayout = new LinearLayout(getAdView().getContext());
        this.closeIndicatorRegion = linearLayout;
        linearLayout.setVisibility(this.useCustomClose ? 4 : 0);
        this.closeIndicatorRegion.setOrientation(1);
    }

    public void createLoadReport() {
        String bidId = this.adView.getBidId();
        String hostname = this.adView.getHostname();
        if (bidId == null || this.loadReportSubmitted) {
            return;
        }
        DTBMetricsProcessor.getInstance().submitLatencyReportBidId(DTBMetricReport.addBid(bidId, hostname), DTBMetricsProcessor.REPORT_LOAD_LATENCY, (int) (new Date().getTime() - this.adView.getStartTime()));
        this.loadReportSubmitted = true;
    }

    protected void evaluateJavascript(final String str) {
        String str2 = LOG_TAG;
        DtbLog.debug(str2, "MRAID Evaluate JSScript:" + str);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.u
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDController.b(DTBAdMRAIDController.this, str);
            }
        });
    }

    public abstract void expand(Map<String, Object> map);

    void fireEnforcedSizeChange(int i10, int i11) {
        evaluateJavascript(String.format("window.mraidBridge.event.sizeChange(%d, %d);", Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    void fireEnforcedViewableChange(boolean z10) {
        Object[] objArr = new Object[1];
        objArr[0] = z10 ? InneractiveMediationDefs.SHOW_HOUSE_AD_YES : "false";
        evaluateJavascript(String.format("window.mraidBridge.event.viewableChange(%s);", objArr));
    }

    public void fireErrorEvent(String str, String str2) {
        evaluateJavascript(String.format("window.mraidBridge.event.error('%s','%s');", str2, str));
    }

    public void fireExposureChange(int i10, Rect rect) {
        int i11 = rect.right;
        if (this.jsReady) {
            fireEnforcedExposureChange(i10, rect);
        } else {
            this.lastReportedExposure = new MraidExposure(i10, rect);
        }
    }

    void fireMRAIDReadyEvent() {
        evaluateJavascript(MRAID_READY);
    }

    protected void fireMRAIDSupports() {
        evaluateJavascriptMethod("window.mraidBridge.property.setSupports", MraidProperty.SUPPORTS_PROPERTY.getData());
    }

    protected void firePlacementType() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", getPlacementType());
        evaluateJavascriptMethod("window.mraidBridge.property.setPlacementType", jSONObject);
    }

    void fireScreenSizeEvent() {
        SDKUtilities.SimpleSize screenSize = DTBAdUtil.getScreenSize(getAdView());
        evaluateJavascript(String.format("window.mraidBridge.property.setScreenSize({'width':%d, 'height':%d});", Integer.valueOf(screenSize.getWidth()), Integer.valueOf(screenSize.getHeight())));
    }

    public void fireSizeChange(int i10, int i11) {
        if (this.lastReportedSizeChangeWidth == i10 && this.lastReportedSizeChangeHeight == i11) {
            return;
        }
        this.lastReportedSizeChangeWidth = i10;
        this.lastReportedSizeChangeHeight = i11;
        if (this.jsReady) {
            fireEnforcedSizeChange(i10, i11);
        }
    }

    void fireStateChangeEvent() {
        try {
            JSONObject formProperties = formProperties(new MraidProperty[]{getCurrentStateProperty()});
            String str = LOG_TAG;
            DtbLog.debug(str, "State was changed to " + formProperties.toString() + " for controller " + this);
            evaluateJavascript(String.format("window.mraidBridge.event.stateChange(%s);", formProperties.toString()));
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }

    public void fireViewableChange(boolean z10) {
        Boolean bool = this.lastViewabilityState;
        if (bool == null || bool.booleanValue() != z10) {
            if (this.jsReady) {
                fireEnforcedViewableChange(z10);
            }
            this.lastViewabilityState = Boolean.valueOf(z10);
        }
    }

    public DTBAdView getAdView() {
        return this.adView;
    }

    Context getContext() {
        return getAdView().getContext();
    }

    protected MraidStateType getInitialStateType() {
        return MraidStateType.DEFAULT;
    }

    protected String getPlacementType() {
        return "";
    }

    public void impressionFired() {
        commandCompleted(MraidFirePixelCommand.getMraidName());
    }

    public boolean isTwoPartExpand() {
        return this.isTwoPartExpand;
    }

    public void jsReady() {
        int i10;
        commandCompleted("jsready");
        this.jsReady = true;
        Boolean bool = this.lastViewabilityState;
        if (bool != null) {
            fireEnforcedViewableChange(bool.booleanValue());
        }
        MraidExposure mraidExposure = this.lastReportedExposure;
        if (mraidExposure != null) {
            fireEnforcedExposureChange(mraidExposure.percent, mraidExposure.rect);
        }
        int i11 = this.lastReportedSizeChangeWidth;
        if (i11 <= 0 || (i10 = this.lastReportedSizeChangeHeight) <= 0) {
            return;
        }
        fireEnforcedSizeChange(i11, i10);
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityPaused(Activity activity) {
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityResumed(Activity activity) {
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityStopped(Activity activity) {
    }

    public void onAdClicked() {
    }

    public abstract void onAdLeftApplication();

    public void onAdOpened(DTBAdView dTBAdView) {
    }

    public void onAdRemoved() {
    }

    public void onLoadError(String str, int i10) {
        onLoadError();
    }

    public abstract void onMRAIDClose();

    public void onMRAIDUnload() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.s
            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDController.a(DTBAdMRAIDController.this);
            }
        });
    }

    public abstract void onPageLoad();

    public void onPositionChanged(Rect rect) {
        Rect rect2 = this.lastRect;
        if (rect2 == null || !rect2.equals(rect)) {
            int i10 = rect.right - rect.left;
            int i11 = rect.bottom - rect.top;
            Rect rect3 = this.lastRect;
            boolean z10 = true;
            if (rect3 != null) {
                int i12 = rect3.right - rect3.left;
                int i13 = rect3.bottom - rect3.top;
                if (Math.abs(i12 - i10) <= 1 && Math.abs(i13 - i11) <= 1) {
                    z10 = false;
                }
            }
            setCurrentPositionProperty();
            if (z10) {
                fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(i10), DTBAdUtil.pixelsToDeviceIndependenPixels(i11));
            }
            this.lastRect = rect;
        }
    }

    public abstract void onResize(Map<String, Object> map);

    public void onViewabilityChanged(boolean z10) {
        DtbLog.debug("SET MRAID Visible " + z10);
        fireViewableChange(z10);
    }

    public void openUrl(String str) {
        PackageManager packageManager = this.adView.getContext().getPackageManager();
        try {
            Uri parse = Uri.parse(str);
            if ("amazonmobile".equals(parse.getScheme()) && parse.getHost().equals("intent")) {
                String[] split = str.split("intent=");
                if (split.length > 1) {
                    String str2 = null;
                    for (int i10 = 1; i10 < split.length; i10++) {
                        try {
                            String str3 = split[i10];
                            if (str3.lastIndexOf("&") == str3.length() - 1) {
                                str3 = str3.substring(0, str3.length() - 1);
                            }
                            str2 = URLDecoder.decode(str3, "UTF-8");
                            getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                            onAdLeftApplication();
                            break;
                        } catch (ActivityNotFoundException unused) {
                            DtbLog.debug("Intent:" + str2 + " not found.");
                            fireErrorEvent("open", "requested activity not found");
                        } catch (UnsupportedEncodingException unused2) {
                            DtbLog.debug("Unsupported encoding");
                        }
                    }
                }
            } else if ("com.amazon.mobile.shopping".equals(parse.getScheme())) {
                try {
                    if (packageManager.getLaunchIntentForPackage("com.amazon.mShop.android.shopping") != null) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(parse);
                        AdRegistration.getCurrentActivity().startActivity(intent);
                    } else {
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(parse);
                        int indexOf = str.indexOf("products/");
                        if (indexOf > 0) {
                            intent2.setData(Uri.parse("https://www.amazon.com/dp/" + str.substring(indexOf + 9)));
                            AdRegistration.getCurrentActivity().startActivity(intent2);
                        }
                    }
                    onAdLeftApplication();
                } catch (ActivityNotFoundException unused3) {
                    DtbLog.debug(LOG_TAG, "Activity not found com.amazon.mobile.shopping");
                    fireErrorEvent("open", "mshop activity not found");
                } catch (NullPointerException unused4) {
                    DtbLog.debug(LOG_TAG, "Current activity from AdRegistration not found");
                    fireErrorEvent("open", "current activity from AdRegistration not found");
                }
            } else if (!Utils.PLAY_STORE_SCHEME.equals(parse.getScheme()) && !"amzn".equals(parse.getScheme())) {
                if (parse.getScheme() == null) {
                    parse = Uri.parse("https:" + str);
                }
                Intent intent3 = new Intent("android.intent.action.VIEW", parse);
                try {
                    intent3.addFlags(268435456);
                    getContext().startActivity(intent3);
                    onAdLeftApplication();
                } catch (Exception e10) {
                    DtbLog.error(LOG_TAG, e10.getMessage());
                    fireErrorEvent("open", "invalid url " + str);
                }
            } else {
                try {
                    try {
                        Intent intent4 = new Intent("android.intent.action.VIEW");
                        intent4.setData(parse);
                        AdRegistration.getCurrentActivity().startActivity(intent4);
                        onAdLeftApplication();
                    } catch (ActivityNotFoundException unused5) {
                        DTBAdUtil.directAppStoreLinkToBrowser(this, parse);
                    } catch (NullPointerException unused6) {
                        DtbLog.debug(LOG_TAG, "Current activity from AdRegistration not found");
                        fireErrorEvent("open", "current activity from AdRegistration not found");
                    }
                } catch (ActivityNotFoundException unused7) {
                    DtbLog.debug(LOG_TAG, "App stores and browsers not found");
                    fireErrorEvent("open", "app stores and browsers not found");
                } catch (NullPointerException unused8) {
                    DtbLog.debug(LOG_TAG, "Current activity from AdRegistration not found");
                    fireErrorEvent("open", "current activity from AdRegistration not found");
                }
            }
            commandCompleted("open");
        } catch (Exception unused9) {
            fireErrorEvent("open", "invalid url " + str);
            commandCompleted("open");
        }
    }

    void passLoadError() {
    }

    public void prepareMraid() throws JSONException {
        createLoadReport();
        this.pageLoaded = true;
        fireMaxSizeEvent();
        fireScreenSizeEvent();
        if (getAdView().isVisible()) {
            setCurrentPositionProperty();
        }
        fireMRAIDSupports();
        firePlacementType();
        setCurrentAppOrientation();
        setState(getInitialStateType());
        fireMRAIDReadyEvent();
        if (AdRegistration.isTestMode()) {
            evaluateJavascript("window.mraidBridge.service.debug('enable');");
        }
    }

    public void removeCloseIndicator() {
        ViewGroup viewGroup;
        LinearLayout linearLayout = this.closeIndicatorRegion;
        if (linearLayout == null || (viewGroup = (ViewGroup) linearLayout.getParent()) == null) {
            return;
        }
        viewGroup.removeView(this.closeIndicatorRegion);
    }

    public void setCloseIndicatorContent(View.OnTouchListener onTouchListener) {
        this.closeIndicatorRegion.setBackgroundColor(0);
        LinearLayout linearLayout = this.closeIndicatorRegion;
        int i10 = R.id.mraid_close_indicator;
        linearLayout.setId(i10);
        ImageView imageView = new ImageView(getAdView().getContext());
        imageView.setId(i10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(DTBAdUtil.sizeToDevicePixels(24), DTBAdUtil.sizeToDevicePixels(24));
        layoutParams.setMargins(DTBAdUtil.sizeToDevicePixels(14), DTBAdUtil.sizeToDevicePixels(14), 0, 0);
        this.closeIndicatorRegion.addView(imageView, layoutParams);
        imageView.setImageDrawable(e.a.b(getAdView().getContext(), R.drawable.mraid_close));
        if (onTouchListener != null) {
            this.closeIndicatorRegion.setOnTouchListener(onTouchListener);
        } else {
            this.closeIndicatorRegion.setOnTouchListener(new View.OnTouchListener() { // from class: com.amazon.device.ads.q
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return DTBAdMRAIDController.c(DTBAdMRAIDController.this, view, motionEvent);
                }
            });
        }
    }

    protected void setCurrentAppOrientation() throws JSONException {
        int determineSimpleOrientation = DisplayUtils.determineSimpleOrientation();
        String str = determineSimpleOrientation != 1 ? determineSimpleOrientation != 2 ? "unspecified" : DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE : DtbDeviceDataRetriever.ORIENTATION_PORTRAIT;
        boolean isRotationLocked = DisplayUtils.isRotationLocked();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, str);
        jSONObject.put("locked", isRotationLocked);
        evaluateJavascriptMethod("window.mraidBridge.property.setCurrentAppOrientation", jSONObject);
    }

    public void setCurrentPositionProperty() {
        if (this.pageLoaded) {
            int[] iArr = new int[2];
            getAdView().getLocationOnScreen(iArr);
            setCurrentPositionProperty(iArr[0], iArr[1], getAdView().getWidth(), getAdView().getHeight());
        }
    }

    public void setCustomButtonListener(DTBMRAIDCloseButtonListener dTBMRAIDCloseButtonListener) {
        this.customButtonListener = dTBMRAIDCloseButtonListener;
    }

    public void setState(MraidStateType mraidStateType) {
        this.state = mraidStateType;
        if (mraidStateType == MraidStateType.HIDDEN) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.t
                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDController.d(DTBAdMRAIDController.this);
                }
            });
        }
        fireStateChangeEvent();
    }

    public void setTwoPartExpand(boolean z10) {
        this.isTwoPartExpand = z10;
    }

    public void setUseCustomClose(boolean z10) {
        DtbLog.debug("Set useCustomClose to " + z10);
        this.useCustomClose = z10;
        commandCompleted("useCustomClose");
        DTBMRAIDCloseButtonListener dTBMRAIDCloseButtonListener = this.customButtonListener;
        if (dTBMRAIDCloseButtonListener != null) {
            dTBMRAIDCloseButtonListener.useCustomButtonUpdated();
        }
    }

    public void onLoadError() {
        String bidId = this.adView.getBidId();
        String hostname = this.adView.getHostname();
        if (bidId != null) {
            DTBMetricsProcessor.getInstance().submitSimpleReportBidId(DTBMetricReport.addBid(bidId, hostname), DTBMetricsProcessor.REPORT_LOAD_FAILURE);
        }
        passLoadError();
    }

    public void addCloseIndicator(int i10, int i11, boolean z10) {
        removeCloseIndicator();
        addCloseIndicator(i10, i11, null, z10);
    }

    public void setCurrentPositionProperty(float f10, float f11) {
        if (this.pageLoaded) {
            int[] iArr = new int[2];
            getAdView().getLocationOnScreen(iArr);
            setCurrentPositionProperty(iArr[0], iArr[1], f10, f11);
        }
    }

    @SuppressLint({"ResourceType"})
    protected void addCloseIndicator(int i10, int i11, View.OnTouchListener onTouchListener, boolean z10) {
        createContentIndicator();
        DTBAdUtil.getRootView(getAdView()).addView(this.closeIndicatorRegion, DTBAdUtil.sizeToDevicePixels(50), DTBAdUtil.sizeToDevicePixels(50));
        this.closeIndicatorRegion.setX(i10 - DTBAdUtil.sizeToDevicePixels(50));
        this.closeIndicatorRegion.setY(i11);
        setCloseIndicatorContent(onTouchListener);
    }

    void setCurrentPositionProperty(int i10, int i11, float f10, float f11) {
        if (this.pageLoaded) {
            evaluateJavascript(String.format("window.mraidBridge.property.setCurrentPosition({'xPos':%.1f, 'yPos':%.1f, 'width': %.1f, 'height': %.1f});", Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(i10)), Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(i11)), Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels((int) f10)), Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels((int) f11))));
        }
    }
}
