package com.amazon.device.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import com.amazon.device.ads.SDKUtilities;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DTBAdUtil {
    private static final String CUSTOM_EVENT = "amazon_custom_event";
    public static final DTBAdUtil INSTANCE = new DTBAdUtil();
    static final String LOG_TAG = "DTBAdUtil";

    private DTBAdUtil() {
    }

    public static String buildMopubTargeting(String str, Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder(str);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                sb2.append(",");
                sb2.append(entry.getKey());
                sb2.append(':');
                sb2.append(entry.getValue());
            }
        }
        String str2 = LOG_TAG;
        DtbLog.debug(str2, "Targeting String:" + sb2.toString());
        return sb2.toString();
    }

    static boolean compareEncodedPrice(String str, String str2) {
        if (DtbCommonUtils.isNullOrEmpty(str) || DtbCommonUtils.isNullOrEmpty(str2)) {
            return false;
        }
        if (str.length() < 8 || str2.length() < 8 || !str.contains("_spp") || !str2.contains("_spp")) {
            return str.compareTo(str2) == 0;
        }
        String replace = str.replace("_spp", "");
        String replace2 = str2.replace("_spp", "");
        String sb2 = new StringBuilder(replace).reverse().toString();
        String sb3 = new StringBuilder(replace2).reverse().toString();
        String clientConfigVal = DTBMetricsConfiguration.getClientConfigVal("leq", "spp_flag");
        if (!DtbCommonUtils.isNullOrEmpty(clientConfigVal)) {
            if ("eq".equals(clientConfigVal)) {
                return sb3.compareTo(sb2) == 0;
            } else if ("geq".equals(clientConfigVal)) {
                return sb3.compareTo(sb2) >= 0;
            }
        }
        return sb3.compareTo(sb2) <= 0;
    }

    public static Bundle createAdMobBannerRequestBundle(String str, int i10, int i11) {
        Bundle initializeEmptyBundle = DtbCommonUtils.initializeEmptyBundle();
        try {
            initializeEmptyBundle.putString(DtbConstants.ADMOB_SLOTUUID_KEY, str);
            initializeEmptyBundle.putInt(DtbConstants.ADMOB_WIDTH_KEY, i10);
            initializeEmptyBundle.putInt(DtbConstants.ADMOB_HEIGHT_KEY, i11);
            initializeEmptyBundle.putString(DtbConstants.ADMOB_REQUEST_ID_KEY, generateRequestId());
            initializeEmptyBundle.putString(DtbConstants.APS_ADAPTER_VERSION, DtbConstants.APS_ADAPTER_VERSION_2);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute createAdMobBannerRequestBundle method to create bundle for non smart banner ads");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute createAdMobBannerRequestBundle method to create bundle for non smart banner ads", e10);
        }
        return initializeEmptyBundle;
    }

    public static Bundle createAdMobInterstitialRequestBundle(String str) {
        Bundle initializeEmptyBundle = DtbCommonUtils.initializeEmptyBundle();
        try {
            initializeEmptyBundle.putString(DtbConstants.ADMOB_SLOTUUID_KEY, str);
            initializeEmptyBundle.putString(DtbConstants.ADMOB_REQUEST_ID_KEY, generateRequestId());
            initializeEmptyBundle.putString(DtbConstants.APS_ADAPTER_VERSION, DtbConstants.APS_ADAPTER_VERSION_2);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute createAdMobInterstitialRequestBundle method");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute createAdMobInterstitialRequestBundle method", e10);
        }
        return initializeEmptyBundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void createDirIfDoesNotExist(String str) {
        Context context = AdRegistration.getContext();
        if (context != null) {
            File filesDir = context.getFilesDir();
            File file = new File(filesDir.getAbsolutePath() + "/" + str);
            if (file.isDirectory() || file.exists()) {
                return;
            }
            file.mkdir();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void directAppStoreLinkToBrowser(DTBAdMRAIDController dTBAdMRAIDController, Uri uri) throws ActivityNotFoundException, NullPointerException {
        String str;
        if ("amzn".equals(uri.getScheme())) {
            DtbLog.debug(LOG_TAG, "Amazon app store unavailable in the device");
            str = "https://www.amazon.com/gp/mas/dl/android?" + uri.getQuery();
        } else {
            DtbLog.debug(LOG_TAG, "App store unavailable in the device");
            str = "https://play.google.com/store/apps/" + uri.getHost() + "?" + uri.getQuery();
        }
        Uri parse = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(parse);
        AdRegistration.getCurrentActivity().startActivity(intent);
        dTBAdMRAIDController.onAdLeftApplication();
    }

    public static View findAncestorOfType(View view, Class cls) {
        while (!cls.isInstance(view)) {
            ViewParent parent = view.getParent();
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
        return view;
    }

    public static List<View> findViewsOfType(ViewGroup viewGroup, Class cls) {
        ArrayList arrayList = new ArrayList();
        findViewsOfType(viewGroup, cls, arrayList);
        return arrayList;
    }

    public static String generateRequestId() {
        String str = UUID.randomUUID().toString() + Constants.FILENAME_SEQUENCE_SEPARATOR + new Date().getTime();
        if (AdRegistration.getAdMobCache(str) != null) {
            l2.a.h(m2.b.FATAL, m2.c.LOG, "Generate a conflict request id which already in request id map");
            AdRegistration.removeAdMobCache(str);
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Activity getActivity(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public static ViewGroup getAdViewWrapper(View view, int i10, int i11, int i12, int i13) {
        AdContainer adContainer = new AdContainer(view.getContext());
        if (i13 != 0 && i12 != 0) {
            adContainer.addView(view, sizeToDevicePixels(i12), sizeToDevicePixels(i13));
        } else {
            adContainer.addView(view, sizeToDevicePixels(i10), sizeToDevicePixels(i11));
        }
        adContainer.setAdView(view);
        return adContainer;
    }

    public static Bundle getBidFromFetchManager(Bundle bundle) {
        DTBFetchManager fetchManager;
        if (bundle == null) {
            return null;
        }
        boolean z10 = bundle.getBoolean(DTBAdView.SMARTBANNER_STATE, false);
        String string = bundle.getString(DTBAdView.REQUEST_QUEUE, null);
        if (!DtbCommonUtils.isNullOrEmpty(string) && (fetchManager = DTBFetchFactory.getInstance().getFetchManager(string)) != null) {
            DtbLog.debug("RELOAD CUSTOM EVENT", "QUEUE:" + string);
            DTBAdResponse peek = fetchManager.peek();
            if (peek != null) {
                DtbLog.debug("RELOAD CUSTOM EVENT: " + peek.getRenderingBundle().getString(DTBAdView.AMAZON_AD_INFO));
                return peek.getRenderingBundle(z10);
            }
        }
        DtbLog.debug("RELOAD CUSTOM EVENT", "NO QUEUE");
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SDKUtilities.SimpleSize getMaxSize(View view) {
        ViewGroup rootView = getRootView(view);
        if (rootView == null) {
            return getScreenSize();
        }
        return new SDKUtilities.SimpleSize(pixelsToDeviceIndependenPixels(rootView.getWidth()), pixelsToDeviceIndependenPixels(rootView.getHeight()));
    }

    public static ViewGroup getRootView(View view) {
        Activity activity = getActivity(view);
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.findViewById(16908290);
    }

    public static SDKUtilities.SimpleSize getScreenSize() {
        return getScreenSize(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isInstalledFromAppStore(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null && installerPackageName.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    private void loadDTBParameters(DTBAdResponse dTBAdResponse, AdManagerAdRequest.Builder builder) {
        for (Map.Entry<String, List<String>> entry : dTBAdResponse.getDefaultDisplayAdsRequestCustomParams().entrySet()) {
            builder.addCustomTargeting(entry.getKey(), entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized String loadFile(String str, String str2) throws IOException {
        synchronized (DTBAdUtil.class) {
            Context context = AdRegistration.getContext();
            if (context == null) {
                return null;
            }
            File filesDir = context.getFilesDir();
            File file = new File(filesDir.getAbsolutePath() + "/" + str2 + "/" + str);
            if (!file.exists()) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return sb2.toString();
                }
                sb2.append(readLine.trim());
                sb2.append("\n");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String loadFromAssets(String str) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        if (AdRegistration.getContext() != null && AdRegistration.getContext().getAssets() != null) {
            InputStream open = AdRegistration.getContext().getAssets().open(str);
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
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static JSONObject loadJsonFromAsset(String str) {
        try {
            return new JSONObject(loadFromAssets(str));
        } catch (IOException unused) {
            DtbLog.debug("Fail to load " + str + "from asset folder");
            return null;
        } catch (JSONException unused2) {
            DtbLog.debug("Fail to parse " + str + " to JSON from asset folder");
            return null;
        }
    }

    public static int pixelsToDeviceIndependenPixels(int i10) {
        return (int) ((i10 / AdRegistration.getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static void setRectShape(View view) {
        setRectShape(view, -16711936, 3.0f);
    }

    public static int sizeToDevicePixels(int i10) {
        return (int) ((i10 * AdRegistration.getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static boolean validateAdMobCustomEvent(String str, Bundle bundle) {
        DtbLog.debug(CUSTOM_EVENT, "AdMob Server Price Point is checked in:" + str + "in AdMob Single Price Custom Event Class");
        return validateAdMobCustomEvent(str, bundle, false);
    }

    public static boolean validateMopubCustomEvent(Map<String, Object> map, Map<String, String> map2) {
        DtbLog.debug(CUSTOM_EVENT, "Amazon Banner Custom Event was hit");
        String str = (String) map.get(DTBAdView.EVENT_SERVER_PARAMETER);
        if (str != null) {
            if (map2.get(str) != null) {
                String str2 = (String) map.get(DTBAdView.BID_IDENTIFIER);
                String str3 = (String) map.get(DTBAdView.BID_HTML);
                String str4 = (String) map.get(DTBAdView.HOSTNAME_IDENTIFIER);
                if (str3 != null) {
                    if (str2 != null && DTBBidInspector.getInstance().wasUsed(str2)) {
                        DtbLog.debug(CUSTOM_EVENT, "Amazon Banner Custom ignored (attempt to reuse bidId)");
                        return false;
                    }
                    Object obj = map.get(DTBAdView.START_LOAD_TIME);
                    if (obj instanceof Long) {
                        Long l10 = (Long) obj;
                        if (l10.longValue() > 0) {
                            DTBMetricsProcessor.getInstance().submitLatencyReportBidId(DTBMetricReport.addBid(str2, str4), DTBMetricsProcessor.REPORT_MEDIATION_LATENCY, (int) (new Date().getTime() - l10.longValue()));
                        }
                    }
                    DtbLog.debug(CUSTOM_EVENT, "Amazon Banner Custom Completed/Accepted");
                    return true;
                }
                DtbLog.debug(CUSTOM_EVENT, "Amazon Banner Custom ignored ( payload is not defined ");
            } else {
                DtbLog.debug(CUSTOM_EVENT, "Amazon Banner Custom ignored ( serverExtras does not have expected key event_server_parameter)");
            }
        } else {
            DtbLog.debug(CUSTOM_EVENT, "Amazon Banner Custom ignored ( localExtras does not have expected key event_server_parameter)");
        }
        DtbLog.debug(CUSTOM_EVENT, "Amazon Banner Custom Completed/Ignored");
        return false;
    }

    public static boolean validateSinglePriceAdMobCustomEvent(String str, Bundle bundle) {
        DtbLog.debug(CUSTOM_EVENT, "AdMob Server Price Point is checked in:" + str + "in AdMob Custom Event Class");
        return validateAdMobCustomEvent(str, bundle, true);
    }

    public AdManagerAdRequest.Builder createAdManagerAdRequestBuilder(DTBAdResponse dTBAdResponse) {
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        if (dTBAdResponse.getAdCount() > 0) {
            loadDTBParameters(dTBAdResponse, builder);
        }
        return builder;
    }

    public AdManagerAdRequest loadDTBParams(AdManagerAdRequest adManagerAdRequest, DTBAdResponse dTBAdResponse) {
        if (dTBAdResponse.getAdCount() == 0) {
            return adManagerAdRequest;
        }
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        builder.setContentUrl(adManagerAdRequest.getContentUrl());
        builder.setLocation(adManagerAdRequest.getLocation());
        builder.setPublisherProvidedId(adManagerAdRequest.getPublisherProvidedId());
        loadDTBParameters(dTBAdResponse, builder);
        return builder.build();
    }

    public static SDKUtilities.SimpleSize getScreenSize(View view) {
        int i10;
        int i11;
        int i12 = AdRegistration.getContext().getResources().getConfiguration().orientation;
        Activity activity = view != null ? getActivity(view) : null;
        if (activity != null) {
            Point point = new Point();
            activity.getWindowManager().getDefaultDisplay().getRealSize(point);
            i11 = point.x;
            i10 = point.y;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) AdRegistration.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i13 = displayMetrics.widthPixels;
            i10 = displayMetrics.heightPixels;
            i11 = i13;
        }
        int pixelsToDeviceIndependenPixels = pixelsToDeviceIndependenPixels(i11);
        int pixelsToDeviceIndependenPixels2 = pixelsToDeviceIndependenPixels(i10);
        if (i12 == 1) {
            return new SDKUtilities.SimpleSize(pixelsToDeviceIndependenPixels, pixelsToDeviceIndependenPixels2);
        }
        return new SDKUtilities.SimpleSize(pixelsToDeviceIndependenPixels2, pixelsToDeviceIndependenPixels);
    }

    public static void setRectShape(View view, int i10, float f10) {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RectShape());
        shapeDrawable.getPaint().setColor(i10);
        shapeDrawable.getPaint().setStrokeWidth(f10);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        view.setBackground(shapeDrawable);
    }

    static int sizeToDevicePixels(Context context, int i10) {
        return (int) ((i10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    static void findViewsOfType(ViewGroup viewGroup, Class cls, List<View> list) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (cls.isInstance(childAt)) {
                list.add(childAt);
            }
            if (childAt instanceof ViewGroup) {
                findViewsOfType((ViewGroup) childAt, cls, list);
            }
        }
    }

    private static boolean validateAdMobCustomEvent(String str, Bundle bundle, boolean z10) {
        boolean equals;
        String str2 = z10 ? "Amazon Single Price Custom Event" : "Amazon Custom Event";
        if (bundle != null) {
            String string = bundle.getString(DTBAdView.EVENT_SERVER_PARAMETER, "Unknown");
            String string2 = bundle.getString(DTBAdView.BID_HTML, null);
            if (string != null && str != null && string2 != null) {
                if (z10) {
                    equals = compareEncodedPrice(string, str);
                } else {
                    equals = str.equals(string);
                }
                if (equals) {
                    String string3 = bundle.getString(DTBAdView.BID_IDENTIFIER, null);
                    String string4 = bundle.getString(DTBAdView.HOSTNAME_IDENTIFIER, null);
                    if (string3 != null && DTBBidInspector.getInstance().wasUsed(string3)) {
                        DtbLog.debug(CUSTOM_EVENT, str2 + " ignored (attempt to reuse bidId)");
                    } else {
                        long j10 = bundle.getLong(DTBAdView.START_LOAD_TIME);
                        if (j10 > 0) {
                            DTBMetricsProcessor.getInstance().submitLatencyReportBidId(DTBMetricReport.addBid(string3, string4), DTBMetricsProcessor.REPORT_MEDIATION_LATENCY, (int) (new Date().getTime() - j10));
                        }
                        DtbLog.debug(CUSTOM_EVENT, str2 + " Completed/Accepted");
                        return true;
                    }
                } else {
                    DtbLog.debug(CUSTOM_EVENT, str2 + " ignored (server " + str + " is not matched with expected parameter " + string + ")");
                }
            }
            if (string == null) {
                DtbLog.debug(CUSTOM_EVENT, str2 + " ignored (expected server parameter is null");
            }
            if (str == null) {
                DtbLog.debug(CUSTOM_EVENT, str2 + " ignored (server parameter is null");
            }
            if (string2 == null) {
                DtbLog.debug(CUSTOM_EVENT, str2 + " ignored (payload is not defined)");
            }
        }
        DtbLog.debug(CUSTOM_EVENT, str2 + " Completed/Ignored ");
        return false;
    }

    public void loadDTBParams(AdManagerAdRequest.Builder builder, DTBAdResponse dTBAdResponse) {
        if (dTBAdResponse.getAdCount() > 0) {
            loadDTBParameters(dTBAdResponse, builder);
        }
    }

    public static Bundle createAdMobBannerRequestBundle(String str) {
        Bundle initializeEmptyBundle = DtbCommonUtils.initializeEmptyBundle();
        try {
            initializeEmptyBundle.putString(DtbConstants.ADMOB_SLOTGROUP_KEY, str);
            initializeEmptyBundle.putString(DtbConstants.ADMOB_REQUEST_ID_KEY, generateRequestId());
            initializeEmptyBundle.putString(DtbConstants.APS_ADAPTER_VERSION, DtbConstants.APS_ADAPTER_VERSION_2);
        } catch (RuntimeException e10) {
            DtbLog.error(LOG_TAG, "Fail to execute createAdMobBannerRequestBundle method to create bundle for smart banner ads");
            l2.a.i(m2.b.FATAL, m2.c.EXCEPTION, "Fail to execute createAdMobBannerRequestBundle method to create bundle for smart banner ads", e10);
        }
        return initializeEmptyBundle;
    }
}
