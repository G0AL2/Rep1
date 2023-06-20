package com.fyber.inneractive.sdk.util;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public static Application f20301a;

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator<ResolveInfo> f20302b = new a();

    /* loaded from: classes2.dex */
    public class a implements Comparator<ResolveInfo> {
        @Override // java.util.Comparator
        public int compare(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
            ActivityInfo activityInfo;
            String str;
            ResolveInfo resolveInfo3 = resolveInfo2;
            ActivityInfo activityInfo2 = resolveInfo.activityInfo;
            if (activityInfo2 == null || (activityInfo = resolveInfo3.activityInfo) == null || (str = activityInfo2.packageName) == null) {
                return 1;
            }
            return str.compareTo(activityInfo.packageName);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static Map<String, String> f20303a = new HashMap();
    }

    public static Application a() {
        return f20301a;
    }

    public static boolean b(String str) {
        try {
            return f20301a.checkCallingOrSelfPermission(str) == 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int c(int i10) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) f20301a.getSystemService("window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return (int) ((i10 / displayMetrics.density) + 0.5f);
        }
        return i10;
    }

    public static int d() {
        int i10;
        WindowManager windowManager;
        Display defaultDisplay;
        Application application = f20301a;
        if (application == null || (windowManager = (WindowManager) application.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            i10 = -1;
        } else {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i10 = point.y;
        }
        if (i10 == -1) {
            try {
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                if (displayMetrics != null) {
                    i10 = displayMetrics.heightPixels;
                }
            } catch (Throwable unused) {
            }
            if (i10 == -1) {
                return 480;
            }
            return i10;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int e() {
        /*
            r0 = -1
            android.app.Application r1 = com.fyber.inneractive.sdk.util.l.f20301a     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            java.lang.String r2 = "window"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch: java.lang.Throwable -> L20
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L20
            android.graphics.Point r2 = new android.graphics.Point     // Catch: java.lang.Throwable -> L20
            r2.<init>()     // Catch: java.lang.Throwable -> L20
            r1.getSize(r2)     // Catch: java.lang.Throwable -> L20
            int r1 = r2.x     // Catch: java.lang.Throwable -> L20
            goto L21
        L20:
            r1 = -1
        L21:
            if (r1 != r0) goto L35
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()     // Catch: java.lang.Throwable -> L30
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L31
            int r1 = r2.widthPixels     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
        L31:
            if (r1 != r0) goto L35
            r1 = 320(0x140, float:4.48E-43)
        L35:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.l.e():int");
    }

    public static String f() {
        IAConfigManager iAConfigManager;
        int i10 = 0;
        while (true) {
            iAConfigManager = IAConfigManager.J;
            if (iAConfigManager.f16889y.f20338c.compareAndSet(true, true) || i10 >= 25) {
                break;
            }
            IAlog.a("UserAgentProvider | waiting on user agent", new Object[0]);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            i10++;
        }
        return iAConfigManager.f16889y.a();
    }

    public static int a(float f10) {
        return (int) (TypedValue.applyDimension(1, f10, f20301a.getResources().getDisplayMetrics()) + 0.5f);
    }

    public static int b(int i10) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) f20301a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return (int) ((i10 * displayMetrics.density) + 0.5f);
    }

    public static int a(int i10) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) f20301a.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return Math.round((i10 * displayMetrics.density) + 0.5f);
    }

    public static int c() {
        Application application = f20301a;
        int i10 = (application == null || application.getResources() == null || application.getResources().getConfiguration() == null) ? 1 : application.getResources().getConfiguration().orientation;
        try {
            if (Settings.System.getInt(application.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                i10 = 1;
            }
        } catch (Throwable th) {
            IAlog.a("failed getOrientation. returning portrait orientation", th, new Object[0]);
        }
        Object[] objArr = new Object[1];
        objArr[0] = i10 == 1 ? DtbDeviceDataRetriever.ORIENTATION_PORTRAIT : DtbDeviceDataRetriever.ORIENTATION_LANDSCAPE;
        IAlog.a("The device orientation: %s", objArr);
        return i10;
    }

    public static String b(String str, Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            return j7.a.a(str, collection);
        }
        return TextUtils.join(str, collection);
    }

    @SuppressLint({"NewApi"})
    public static Drawable d(int i10) {
        if (Build.VERSION.SDK_INT >= 21) {
            return f20301a.getDrawable(i10);
        }
        return f20301a.getResources().getDrawable(i10);
    }

    public static boolean a(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean a(String... strArr) {
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= strArr.length) {
                return true;
            }
            try {
                Class.forName(strArr[i10]);
            } catch (ClassNotFoundException unused) {
                z10 = false;
            }
            if (!z10) {
                return false;
            }
            i10++;
        }
    }

    public static String b() {
        try {
            return Environment.getExternalStorageState();
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String c(String str) {
        String str2 = (String) ((HashMap) b.f20303a).get(str);
        if (TextUtils.isEmpty(str2)) {
            IAlog.a("Assets cache: reading file: %s", str);
            try {
                InputStream open = f20301a.getAssets().open(str, 3);
                StringBuffer stringBuffer = new StringBuffer();
                byte[] bArr = new byte[4096];
                for (int i10 = 0; i10 != -1; i10 = open.read(bArr)) {
                    stringBuffer.append(new String(bArr, 0, i10));
                }
                open.close();
                str2 = stringBuffer.toString();
                IAlog.a("Assets cache: success - %s", str);
            } catch (IOException e10) {
                IAlog.a("Assets cache: Could not read response from file", new Object[0]);
                IAlog.d(s.a(e10), new Object[0]);
            }
            if (!TextUtils.isEmpty(str2)) {
                ((HashMap) b.f20303a).put(str, str2);
            }
        } else {
            IAlog.a("Assets cache: returning cached assets for %s", str);
        }
        return str2;
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static String a(String str, Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        for (Integer num : collection) {
            arrayList.add(String.valueOf(num));
        }
        return b(str, arrayList);
    }

    public static boolean a(String str, Context context, byte[] bArr) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = context.openFileOutput(str, 0);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.flush();
                return true;
            } catch (Throwable unused) {
                try {
                    IAlog.a("writeFileWithContext failed writing %s", str);
                    s.a(fileOutputStream);
                    return false;
                } finally {
                    s.a(fileOutputStream);
                }
            }
        } catch (Throwable unused2) {
            fileOutputStream = null;
        }
    }
}
