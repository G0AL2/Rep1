package com.ironsource.mediationsdk;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* loaded from: classes3.dex */
public class AdapterUtils {
    public static final int MIN_TABLET_DP_SIZE = 600;

    public static int dpToPixels(Activity activity, int i10) {
        if (activity == null) {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils dpToPixels - activity is null, returning dpSize", 3);
            return i10;
        }
        return (int) TypedValue.applyDimension(1, i10, activity.getResources().getDisplayMetrics());
    }

    public static String getScreenSizeParams(Activity activity) {
        DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
        float f10 = displayMetrics.density;
        float min = Math.min(displayMetrics.widthPixels / f10, displayMetrics.heightPixels / f10);
        float f11 = displayMetrics.xdpi;
        float f12 = displayMetrics.ydpi;
        float f13 = displayMetrics.widthPixels / f11;
        float f14 = displayMetrics.heightPixels / f12;
        double sqrt = Math.sqrt((f13 * f13) + (f14 * f14));
        int i10 = activity.getResources().getConfiguration().smallestScreenWidthDp;
        return "smallestWidth = " + min + " diagonalInches = " + sqrt + " smallScreenDpApi =  " + i10;
    }

    public static boolean isLargeScreen(Activity activity) {
        if (activity != null) {
            return activity.getResources().getConfiguration().smallestScreenWidthDp >= 600;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils isLargeScreen - activity is null", 3);
        return false;
    }
}
