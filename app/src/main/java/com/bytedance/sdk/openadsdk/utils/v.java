package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Picture;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.core.widget.TTRatingBar2;
import com.google.android.gms.common.internal.ImagesContract;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UIUtils.java */
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static float f13611a = -1.0f;

    /* renamed from: b  reason: collision with root package name */
    private static int f13612b = -1;

    /* renamed from: c  reason: collision with root package name */
    private static float f13613c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    private static int f13614d = -1;

    /* renamed from: e  reason: collision with root package name */
    private static int f13615e = -1;

    /* renamed from: f  reason: collision with root package name */
    private static WindowManager f13616f;

    static {
        a(com.bytedance.sdk.openadsdk.core.m.a());
    }

    public static void a(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, WebView webView) {
    }

    private static boolean a() {
        return f13611a < 0.0f || f13612b < 0 || f13613c < 0.0f || f13614d < 0 || f13615e < 0;
    }

    private static boolean a(int i10) {
        return i10 == 0 || i10 == 8 || i10 == 4;
    }

    public static float c(Context context, float f10) {
        a(context);
        return f10 * e(context);
    }

    public static int d(Context context, float f10) {
        a(context, true);
        float e10 = e(context);
        if (e10 <= 0.0f) {
            e10 = 1.0f;
        }
        return (int) ((f10 / e10) + 0.5f);
    }

    public static float e(Context context) {
        a(context);
        return f13611a;
    }

    public static float f(Context context) {
        a(context);
        return f13613c;
    }

    public static int g(Context context) {
        a(context);
        return f13612b;
    }

    public static int h(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.m.a();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public static int i(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.m.a();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealMetrics(displayMetrics);
        } else {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }

    public static float j(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.m.a();
        }
        int identifier = context.getApplicationContext().getResources().getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        if (identifier > 0) {
            return context.getApplicationContext().getResources().getDimensionPixelSize(identifier);
        }
        return 0.0f;
    }

    public static boolean k(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean l(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean m(Context context) {
        String str = Build.MODEL;
        return str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.startsWith("ONEPLUS");
    }

    public static boolean n(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            String string = identifier > 0 ? resources.getString(identifier) : null;
            if (string != null) {
                return !TextUtils.isEmpty(string);
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean o(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static void a(Context context) {
        a(context, false);
    }

    public static float b(Context context, float f10) {
        a(context);
        return (f10 * e(context)) + 0.5f;
    }

    public static void a(Context context, boolean z10) {
        Context a10 = context == null ? com.bytedance.sdk.openadsdk.core.m.a() : context;
        if (a10 == null) {
            return;
        }
        f13616f = (WindowManager) a10.getSystemService("window");
        if (a() || z10) {
            DisplayMetrics displayMetrics = a10.getResources().getDisplayMetrics();
            f13611a = displayMetrics.density;
            f13612b = displayMetrics.densityDpi;
            f13613c = displayMetrics.scaledDensity;
            f13614d = displayMetrics.widthPixels;
            f13615e = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            int i10 = f13614d;
            int i11 = f13615e;
            if (i10 > i11) {
                f13614d = i11;
                f13615e = i10;
                return;
            }
            return;
        }
        int i12 = f13614d;
        int i13 = f13615e;
        if (i12 < i13) {
            f13614d = i13;
            f13615e = i12;
        }
    }

    public static int c(Context context) {
        a(context);
        return f13614d;
    }

    public static int d(Context context) {
        a(context);
        return f13615e;
    }

    public static void e(final View view) {
        if (view == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.v.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                v.a(view, 8);
                ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).setDuration(0L).start();
            }
        });
        ofFloat.setDuration(800L);
        ofFloat.start();
    }

    public static void f(View view) {
        if (view == null) {
            return;
        }
        a(view, 0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.v.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    public static int[] b(Context context) {
        if (context == null) {
            return null;
        }
        if (f13616f == null) {
            f13616f = (WindowManager) com.bytedance.sdk.openadsdk.core.m.a().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = f13616f;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 14 && i12 < 17) {
                try {
                    i10 = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    i11 = ((Integer) Display.class.getMethod("getRawHeight", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                } catch (Exception unused) {
                }
            }
            if (Build.VERSION.SDK_INT >= 17) {
                try {
                    Point point = new Point();
                    Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                    i10 = point.x;
                    i11 = point.y;
                } catch (Exception unused2) {
                }
            }
            iArr[0] = i10;
            iArr[1] = i11;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static int[] c(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static boolean d(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static boolean d(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                return (rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null) != null;
            } catch (Exception e10) {
                e10.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public static boolean c(Activity activity) {
        return d(activity) || a("ro.miui.notch", activity) == 1 || k(activity) || o(activity) || l(activity) || m(activity) || n(activity);
    }

    public static int e(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(com.bytedance.sdk.openadsdk.core.e.n nVar, String str, String str2, Bitmap bitmap, String str3, long j10) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    int a10 = a(bitmap);
                    JSONObject jSONObject3 = null;
                    try {
                        jSONObject2 = new JSONObject();
                        jSONObject2.put(ImagesContract.URL, str3);
                        if (j10 != -1) {
                            jSONObject2.put("page_id", j10);
                        }
                        jSONObject2.put("render_type", "h5");
                        jSONObject2.put("render_type_2", 0);
                        jSONObject2.put("is_blank", a10 == 100 ? 1 : 0);
                        jSONObject2.put("is_playable", com.bytedance.sdk.openadsdk.core.e.p.a(nVar) ? 1 : 0);
                        jSONObject2.put("usecache", com.bytedance.sdk.openadsdk.core.video.b.a.a().a(nVar) ? 1 : 0);
                        jSONObject = new JSONObject();
                    } catch (JSONException unused) {
                    }
                    try {
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (JSONException unused2) {
                        jSONObject3 = jSONObject;
                        jSONObject = jSONObject3;
                        com.bytedance.sdk.openadsdk.b.e.c(com.bytedance.sdk.openadsdk.core.m.a(), nVar, str, str2, jSONObject);
                    }
                    com.bytedance.sdk.openadsdk.b.e.c(com.bytedance.sdk.openadsdk.core.m.a(), nVar, str, str2, jSONObject);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.l.e("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>" + th.toString());
            }
        }
    }

    public static int a(Context context, float f10) {
        a(context);
        float f11 = f(context);
        if (f11 <= 0.0f) {
            f11 = 1.0f;
        }
        return (int) ((f10 / f11) + 0.5f);
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top -= i10;
        rect.bottom += i11;
        rect.left -= i12;
        rect.right += i13;
        ((View) view.getParent()).setTouchDelegate(new com.bytedance.sdk.component.utils.g(rect, view));
    }

    public static int[] b(View view) {
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return iArr;
        }
        return null;
    }

    public static void b(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        a(view, (ViewGroup.MarginLayoutParams) layoutParams, i10, i11, i12, i13);
    }

    public static void b(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static int[] a(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    private static Bitmap b(SSWebView sSWebView) {
        if (sSWebView == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(sSWebView.getWidth(), sSWebView.getHeight(), Bitmap.Config.RGB_565);
            sSWebView.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(View view, int i10) {
        if (view == null || view.getVisibility() == i10 || !a(i10)) {
            return;
        }
        view.setVisibility(i10);
    }

    public static void a(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    private static void a(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i10 && marginLayoutParams.topMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.bottomMargin == i13) {
            return;
        }
        if (i10 != -3) {
            marginLayoutParams.leftMargin = i10;
        }
        if (i11 != -3) {
            marginLayoutParams.topMargin = i11;
        }
        if (i12 != -3) {
            marginLayoutParams.rightMargin = i12;
        }
        if (i13 != -3) {
            marginLayoutParams.bottomMargin = i13;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    private static ArrayList<Integer> b(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            int[] iArr = new int[i10];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = iArr[i11];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i12) >> 16, (65280 & i12) >> 8, i12 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Bitmap a(WebView webView) {
        Bitmap bitmap = null;
        try {
            Picture capturePicture = webView.capturePicture();
            bitmap = Bitmap.createBitmap(capturePicture.getWidth(), capturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            capturePicture.draw(new Canvas(bitmap));
            return bitmap;
        } catch (Throwable th) {
            th.printStackTrace();
            return bitmap;
        }
    }

    public static void a(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 > 11 && i10 < 19) {
                activity.getWindow().getDecorView().setSystemUiVisibility(8);
            } else if (i10 >= 19) {
                activity.getWindow().getDecorView().setSystemUiVisibility(3846);
                activity.getWindow().addFlags(1792);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static int a(String str, Activity activity) {
        if (m.e()) {
            try {
                Class<?> loadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, new String(str), new Integer(0))).intValue();
            } catch (ClassNotFoundException e10) {
                e10.printStackTrace();
                return 0;
            } catch (IllegalAccessException e11) {
                e11.printStackTrace();
                return 0;
            } catch (IllegalArgumentException e12) {
                e12.printStackTrace();
                return 0;
            } catch (NoSuchMethodException e13) {
                e13.printStackTrace();
                return 0;
            } catch (InvocationTargetException e14) {
                e14.printStackTrace();
                return 0;
            }
        }
        return 0;
    }

    public static void a(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.l.e("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void a(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.l.e("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void a(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
    }

    public static void a(TextView textView, TTRatingBar2 tTRatingBar2, com.bytedance.sdk.openadsdk.core.e.n nVar, Context context) {
        a(textView, tTRatingBar2, (nVar == null || nVar.aa() == null) ? -1.0d : nVar.aa().d(), context);
    }

    public static void a(TextView textView, TTRatingBar2 tTRatingBar2, double d10, Context context) {
        if (d10 == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            tTRatingBar2.setVisibility(8);
            return;
        }
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d10)));
        }
        a(tTRatingBar2, d10, 0, 14);
    }

    public static void a(TTRatingBar2 tTRatingBar2, double d10, int i10, int i11) {
        if (d10 < 0.0d) {
            tTRatingBar2.setVisibility(8);
            return;
        }
        tTRatingBar2.setVisibility(0);
        tTRatingBar2.a(d10, i10, i11);
    }

    public static void a(TextView textView, com.bytedance.sdk.openadsdk.core.e.n nVar, Context context, String str) {
        a(textView, nVar.aa() != null ? nVar.aa().e() : -1, context, str);
    }

    public static void a(TextView textView, int i10, Context context, String str) {
        StringBuilder sb2;
        String str2;
        String a10 = com.bytedance.sdk.component.utils.t.a(context, str);
        if (i10 > 10000) {
            sb2 = new StringBuilder();
            sb2.append(i10 / 1000);
            str2 = "k";
        } else {
            sb2 = new StringBuilder();
            sb2.append(i10);
            str2 = "";
        }
        sb2.append(str2);
        textView.setText(String.format(a10, sb2.toString()));
        if (i10 == -1) {
            textView.setVisibility(8);
        }
    }

    public static Bitmap a(SSWebView sSWebView) {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        WebView webView = sSWebView.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap b10 = b(sSWebView);
        if (b10 == null) {
            b10 = a(webView);
        }
        webView.setLayerType(layerType, null);
        if (b10 == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.d.a(b10, b10.getWidth() / 6, b10.getHeight() / 6);
    }

    public static void a(final com.bytedance.sdk.openadsdk.core.e.n nVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j10) {
        com.bytedance.sdk.component.f.e.b(new com.bytedance.sdk.component.f.g("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.v.3
            @Override // java.lang.Runnable
            public void run() {
                v.c(nVar, str, str2, bitmap, str3, j10);
            }
        }, 5);
    }

    public static int a(Bitmap bitmap) {
        try {
            ArrayList<Integer> b10 = b(bitmap);
            if (b10 == null) {
                return -1;
            }
            HashMap hashMap = new HashMap();
            Iterator<Integer> it = b10.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (hashMap.containsKey(next)) {
                    Integer valueOf = Integer.valueOf(((Integer) hashMap.get(next)).intValue() + 1);
                    hashMap.remove(next);
                    hashMap.put(next, valueOf);
                } else {
                    hashMap.put(next, 1);
                }
            }
            int i10 = 0;
            int i11 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i11 < intValue) {
                    i10 = ((Integer) entry.getKey()).intValue();
                    i11 = intValue;
                }
            }
            if (i10 == 0) {
                return -1;
            }
            return (int) ((i11 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
