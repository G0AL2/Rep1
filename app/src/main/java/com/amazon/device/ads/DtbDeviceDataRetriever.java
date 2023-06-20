package com.amazon.device.ads;

import android.content.Context;
import android.view.WindowManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class DtbDeviceDataRetriever {
    public static final String ORIENTATION_LANDSCAPE = "landscape";
    public static final String ORIENTATION_PORTRAIT = "portrait";
    public static final String ORIENTATION_UNKNOWN = "unknown";
    private static final int SMALLEST_TABLET_SCREEN_WIDTH = 600;
    private static int[][] rotationArray = {new int[]{1, 0, 9, 8}, new int[]{0, 9, 8, 1}};

    DtbDeviceDataRetriever() {
    }

    private static int determineCanonicalScreenOrientation(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i10 = context.getResources().getConfiguration().orientation;
        char c10 = 0;
        if (i10 != 1 ? i10 != 2 || rotation == 1 || rotation == 3 : rotation == 0 || rotation == 2) {
            c10 = 1;
        }
        return rotationArray[c10 ^ 1][rotation];
    }

    public static String getCanonicalOrientation(Context context) {
        int determineCanonicalScreenOrientation = determineCanonicalScreenOrientation(context);
        if (determineCanonicalScreenOrientation != 0) {
            if (determineCanonicalScreenOrientation != 1) {
                if (determineCanonicalScreenOrientation != 8) {
                    if (determineCanonicalScreenOrientation != 9) {
                        return ORIENTATION_UNKNOWN;
                    }
                }
            }
            return ORIENTATION_PORTRAIT;
        }
        return ORIENTATION_LANDSCAPE;
    }

    public static String getOrientation(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        return (rotation == 0 || rotation == 2) ? ORIENTATION_PORTRAIT : ORIENTATION_LANDSCAPE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (r0 > r3) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String getScreenSize(android.util.DisplayMetrics r3, java.lang.String r4) {
        /*
            android.content.Context r0 = com.amazon.device.ads.AdRegistration.getContext()     // Catch: java.lang.Exception -> L4c
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Exception -> L4c
            android.view.WindowManager r0 = (android.view.WindowManager) r0     // Catch: java.lang.Exception -> L4c
            android.view.Display r0 = r0.getDefaultDisplay()     // Catch: java.lang.Exception -> L4c
            r0.getRealMetrics(r3)     // Catch: java.lang.Exception -> L4c
            int r0 = r3.widthPixels     // Catch: java.lang.Exception -> L4c
            int r3 = r3.heightPixels     // Catch: java.lang.Exception -> L4c
            int r0 = com.amazon.device.ads.DTBAdUtil.pixelsToDeviceIndependenPixels(r0)     // Catch: java.lang.Exception -> L4c
            int r3 = com.amazon.device.ads.DTBAdUtil.pixelsToDeviceIndependenPixels(r3)     // Catch: java.lang.Exception -> L4c
            java.lang.String r1 = "landscape"
            boolean r4 = r4.equals(r1)     // Catch: java.lang.Exception -> L4c
            if (r4 == 0) goto L2a
            if (r0 >= r3) goto L2f
            goto L2c
        L2a:
            if (r0 <= r3) goto L2f
        L2c:
            r2 = r0
            r0 = r3
            r3 = r2
        L2f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4c
            r4.<init>()     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Exception -> L4c
            r4.append(r0)     // Catch: java.lang.Exception -> L4c
            java.lang.String r0 = "x"
            r4.append(r0)     // Catch: java.lang.Exception -> L4c
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L4c
            r4.append(r3)     // Catch: java.lang.Exception -> L4c
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Exception -> L4c
            return r3
        L4c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DtbDeviceDataRetriever.getScreenSize(android.util.DisplayMetrics, java.lang.String):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean isTablet() {
        return AdRegistration.getContext().getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }
}
