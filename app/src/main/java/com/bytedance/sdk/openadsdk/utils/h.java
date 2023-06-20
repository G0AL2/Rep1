package com.bytedance.sdk.openadsdk.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import com.amazon.device.ads.DtbDeviceDataRetriever;
import java.util.ArrayList;
import java.util.List;

/* compiled from: InitChecker.java */
/* loaded from: classes.dex */
public class h {
    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a() {
        /*
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.m.a()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r1 = com.bytedance.sdk.component.utils.l.c()
            if (r1 != 0) goto Le
            return
        Le:
            java.lang.String r1 = a(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Current process name："
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "TTAdSdk-InitChecker"
            com.bytedance.sdk.component.utils.l.e(r2, r1)
            java.lang.String r1 = "The pangolin sdk access, the environment is debug, the initial configuration detection starts"
            com.bytedance.sdk.component.utils.l.e(r2, r1)
            java.lang.String r1 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r4 = 4096(0x1000, float:5.74E-42)
            r5 = 0
            r6 = 1
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r4)     // Catch: java.lang.Throwable -> L9e
            java.lang.String[] r0 = r0.requestedPermissions     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L98
            int r1 = r0.length     // Catch: java.lang.Throwable -> L9e
            if (r1 <= 0) goto L98
            java.util.List r1 = b()     // Catch: java.lang.Throwable -> L9e
            int r4 = r0.length     // Catch: java.lang.Throwable -> L9e
            r7 = 0
        L50:
            if (r7 >= r4) goto L5c
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L9e
            if (r8 == 0) goto L59
            r1.remove(r8)     // Catch: java.lang.Throwable -> L9e
        L59:
            int r7 = r7 + 1
            goto L50
        L5c:
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L68
            java.lang.String r0 = "AndroidManifest.xml permissions configuration is normal"
            com.bytedance.sdk.component.utils.l.e(r2, r0)     // Catch: java.lang.Throwable -> L9e
            goto La6
        L68:
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L9e
        L6c:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L95
            if (r1 == 0) goto La6
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L95
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r4.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "    May be missing permissions："
            r4.append(r6)     // Catch: java.lang.Throwable -> L93
            r4.append(r1)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "，Please refer to the access documentation"
            r4.append(r1)     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = r4.toString()     // Catch: java.lang.Throwable -> L93
            com.bytedance.sdk.component.utils.l.e(r2, r1)     // Catch: java.lang.Throwable -> L93
            r6 = 0
            goto L6c
        L93:
            r0 = move-exception
            goto La0
        L95:
            r0 = move-exception
            r5 = r6
            goto La0
        L98:
            java.lang.String r0 = "The uses-permission configuration in AndroidManifest.xml is missing, please refer to the access documentation"
            com.bytedance.sdk.component.utils.l.e(r2, r0)     // Catch: java.lang.Throwable -> L9e
            goto La6
        L9e:
            r0 = move-exception
            r5 = 1
        La0:
            java.lang.String r1 = "The usage-permission configuration error in AndroidManifest.xml, please refer to the access documentation"
            com.bytedance.sdk.component.utils.l.c(r2, r1, r0)
            r6 = r5
        La6:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Ld3
            r1 = 23
            if (r0 < r1) goto Lae
            if (r3 >= r1) goto Ld9
        Lae:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld3
            r4.<init>()     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r5 = "No adaptation required for dynamic permissions：target="
            r4.append(r5)     // Catch: java.lang.Throwable -> Ld3
            r4.append(r3)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r3 = "&phone="
            r4.append(r3)     // Catch: java.lang.Throwable -> Ld3
            r4.append(r0)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = ", require="
            r4.append(r0)     // Catch: java.lang.Throwable -> Ld3
            r4.append(r1)     // Catch: java.lang.Throwable -> Ld3
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> Ld3
            com.bytedance.sdk.component.utils.l.e(r2, r0)     // Catch: java.lang.Throwable -> Ld3
            goto Ld9
        Ld3:
            r0 = move-exception
            java.lang.String r1 = "The dynamic permission is abnormal. Please check and read the access document in detail： "
            com.bytedance.sdk.component.utils.l.c(r2, r1, r0)
        Ld9:
            if (r6 != 0) goto Le0
            java.lang.String r0 = "You have not configured permission, please refer to the access documentation, otherwise it will affect the conversion"
            com.bytedance.sdk.component.utils.l.e(r2, r0)
        Le0:
            java.lang.String r0 = "End of pangolin sdk initial configuration test"
            com.bytedance.sdk.component.utils.l.e(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.utils.h.a():void");
    }

    private static List<String> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }

    private static String a(Context context) {
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        return runningAppProcessInfo.processName;
                    }
                }
                return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
            }
            return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        } catch (Throwable unused) {
            return DtbDeviceDataRetriever.ORIENTATION_UNKNOWN;
        }
    }
}
