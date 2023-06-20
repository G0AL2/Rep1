package com.chartboost.sdk.Libraries;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.chartboost.sdk.Model.e;
import com.chartboost.sdk.g;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class CBUtility {
    private CBUtility() {
    }

    public static int a(Context context) {
        WindowManager windowManager;
        Display defaultDisplay;
        if (context == null || (windowManager = (WindowManager) context.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return 0;
        }
        int rotation = defaultDisplay.getRotation();
        boolean z10 = defaultDisplay.getWidth() != defaultDisplay.getHeight() ? defaultDisplay.getWidth() < defaultDisplay.getHeight() : context.getResources().getConfiguration().orientation != 2;
        if (rotation != 0 && rotation != 2) {
            z10 = !z10;
        }
        if (z10) {
            if (rotation != 1) {
                if (rotation != 2) {
                    return rotation != 3 ? 0 : 3;
                }
                return 2;
            }
            return 1;
        } else if (rotation != 1) {
            if (rotation != 2) {
                return rotation != 3 ? 1 : 0;
            }
            return 3;
        } else {
            return 2;
        }
    }

    public static boolean a(int i10) {
        return i10 == 1 || i10 == 3;
    }

    public static String b(Context context) {
        int a10 = a(context);
        return a10 != 0 ? a10 != 1 ? a10 != 2 ? a10 != 3 ? DtbDeviceDataRetriever.ORIENTATION_UNKNOWN : DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE : DtbDeviceDataRetriever.ORIENTATION_PORTRAIT : DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE : DtbDeviceDataRetriever.ORIENTATION_PORTRAIT;
    }

    public static boolean b(int i10) {
        return i10 == 0 || i10 == 2;
    }

    public static void throwProguardError(Exception exc) {
        if (exc instanceof NoSuchMethodException) {
            CBLogging.b("CBUtility", "Chartboost library error! Have you used proguard on your application? Make sure to add the line '-keep class com.chartboost.sdk.** { *; }' to your proguard config file.");
        } else if (exc != null && exc.getMessage() != null) {
            CBLogging.b("CBUtility", exc.getMessage());
        } else {
            CBLogging.b("CBUtility", "Unknown Proguard error");
        }
    }

    public static String b() {
        Object[] objArr = new Object[3];
        objArr[0] = "Chartboost-Android-SDK";
        Object obj = g.f13880e;
        if (obj == null) {
            obj = "";
        }
        objArr[1] = obj;
        objArr[2] = "8.4.3";
        return String.format("%s %s %s", objArr);
    }

    public static void b(Activity activity, e eVar) {
        if (activity == null || a(activity) || !eVar.f13720k || !eVar.f13722m) {
            return;
        }
        activity.setRequestedOrientation(-1);
    }

    public static String a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ZZZZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        return simpleDateFormat.format(new Date());
    }

    public static void a(Activity activity, e eVar) {
        if (activity == null || a(activity) || !eVar.f13720k || !eVar.f13722m) {
            return;
        }
        int a10 = a((Context) activity);
        if (a10 == 0) {
            activity.setRequestedOrientation(1);
        } else if (a10 == 2) {
            activity.setRequestedOrientation(9);
        } else if (a10 == 1) {
            activity.setRequestedOrientation(0);
        } else {
            activity.setRequestedOrientation(8);
        }
    }

    public static ArrayList<File> a(File file, boolean z10) {
        if (file == null) {
            return null;
        }
        ArrayList<File> arrayList = new ArrayList<>();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && !file2.getName().equals(".nomedia")) {
                    arrayList.add(file2);
                } else if (file2.isDirectory() && z10) {
                    arrayList.addAll(a(file2, z10));
                }
            }
        }
        return arrayList;
    }

    public static boolean a(Activity activity) {
        if (activity == null || activity.getWindow() == null || activity.getWindow().getDecorView() == null || activity.getWindow().getDecorView().getBackground() == null) {
            return true;
        }
        return Build.VERSION.SDK_INT == 26 && activity.getApplicationInfo().targetSdkVersion > 26 && activity.getWindow().getDecorView().getBackground().getAlpha() != 255;
    }
}
