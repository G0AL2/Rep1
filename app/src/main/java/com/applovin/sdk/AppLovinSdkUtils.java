package com.applovin.sdk;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.g;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinSdkUtils {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f9091a = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static final class Size {
        public static final Size ZERO = new Size(0, 0);

        /* renamed from: a  reason: collision with root package name */
        private int f9092a;

        /* renamed from: b  reason: collision with root package name */
        private int f9093b;

        private Size() {
        }

        public Size(int i10, int i11) {
            this.f9092a = i10;
            this.f9093b = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Size) {
                Size size = (Size) obj;
                return this.f9092a == size.getWidth() && this.f9093b == size.getHeight();
            }
            return false;
        }

        public int getHeight() {
            return this.f9093b;
        }

        public int getWidth() {
            return this.f9092a;
        }

        public int hashCode() {
            int i10 = this.f9093b;
            int i11 = this.f9092a;
            return i10 ^ ((i11 >>> 16) | (i11 << 16));
        }

        public String toString() {
            return this.f9092a + "x" + this.f9093b;
        }
    }

    private static boolean a(String str, String str2) {
        for (String str3 : CollectionUtils.explode(str2)) {
            if (str.startsWith(str3)) {
                return true;
            }
        }
        return false;
    }

    public static int dpToPx(Context context, int i10) {
        return (int) TypedValue.applyDimension(1, i10, context.getResources().getDisplayMetrics());
    }

    public static boolean isEmulator() {
        return a(Build.DEVICE, "goldfish,vbox") || a(Build.HARDWARE, "ranchu,generic,vbox") || a(Build.MANUFACTURER, "Genymotion") || a(Build.MODEL, "Android SDK built for x86");
    }

    public static boolean isFireOS(Context context) {
        return "amazon".equalsIgnoreCase(Build.MANUFACTURER) || isFireTv(context);
    }

    public static boolean isFireTv(Context context) {
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static boolean isSdkVersionGreaterThanOrEqualTo(String str) {
        return AppLovinSdk.VERSION_CODE >= Utils.toVersionCode(str);
    }

    public static boolean isTablet(Context context) {
        Point a10 = g.a(context);
        return Math.min(a10.x, a10.y) >= dpToPx(context, 600);
    }

    public static boolean isTv(Context context) {
        if (isFireTv(context)) {
            return true;
        }
        return context.getPackageManager().hasSystemFeature(g.d() ? "android.software.leanback" : "android.hardware.type.television");
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static int pxToDp(Context context, int i10) {
        return (int) Math.ceil(i10 / context.getResources().getDisplayMetrics().density);
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(false, runnable);
    }

    public static void runOnUiThread(boolean z10, Runnable runnable) {
        if (z10 || !Utils.isMainThread()) {
            f9091a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j10) {
        runOnUiThreadDelayed(runnable, j10, f9091a);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j10, Handler handler) {
        if (j10 > 0) {
            handler.postDelayed(runnable, j10);
        } else if (Utils.isMainThread()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        return JsonUtils.toStringMap(jSONObject);
    }
}
