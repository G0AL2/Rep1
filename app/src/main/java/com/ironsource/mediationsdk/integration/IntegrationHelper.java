package com.ironsource.mediationsdk.integration;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.util.Log;
import android.util.Pair;
import com.ironsource.mediationsdk.IntegrationData;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class IntegrationHelper {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r4 == 1) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r4 == 2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
        r3 = "--------------- " + r10 + " --------------";
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
        r3 = "--------------- Google (AdMob and Ad Manager) --------------";
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        r3 = "--------------- Meta --------------";
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(android.app.Activity r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.integration.IntegrationHelper.a(android.app.Activity, java.lang.String):boolean");
    }

    private static boolean a(Activity activity, String[] strArr) {
        boolean z10 = true;
        if (strArr == null) {
            return true;
        }
        PackageManager packageManager = activity.getPackageManager();
        Log.i("IntegrationHelper", "*** Services ***");
        for (String str : strArr) {
            try {
            } catch (ClassNotFoundException unused) {
                Log.e("IntegrationHelper", str + " - MISSING");
            }
            if (packageManager.queryIntentServices(new Intent(activity, Class.forName(str)), Constants.MIN_PROGRESS_STEP).size() > 0) {
                Log.i("IntegrationHelper", str + " - VERIFIED");
            } else {
                Log.e("IntegrationHelper", str + " - MISSING");
                z10 = false;
            }
        }
        return z10;
    }

    private static boolean a(Context context, String[] strArr) {
        boolean z10;
        String str;
        List<PackageInfo> installedPackages;
        ArrayList arrayList = new ArrayList();
        if (context != null && (installedPackages = context.getPackageManager().getInstalledPackages(8)) != null) {
            for (PackageInfo packageInfo : installedPackages) {
                ProviderInfo[] providerInfoArr = packageInfo.providers;
                if (providerInfoArr != null) {
                    for (ProviderInfo providerInfo : providerInfoArr) {
                        arrayList.add(providerInfo.name);
                    }
                }
            }
        }
        boolean z11 = true;
        if (strArr != null) {
            Log.i("IntegrationHelper", "*** Content Providers ***");
            int length = strArr.length;
            int i10 = 0;
            while (i10 < length) {
                String str2 = strArr[i10];
                if (arrayList.contains(str2)) {
                    z10 = z11;
                    str = "- VERIFIED";
                } else {
                    str = "- MISSING";
                    z10 = false;
                }
                Log.d("IntegrationHelper", str2 + str);
                i10++;
                z11 = z10;
            }
        }
        return z11;
    }

    private static boolean a(ArrayList<Pair<String, String>> arrayList) {
        boolean z10 = true;
        if (arrayList == null) {
            return true;
        }
        Log.i("IntegrationHelper", "*** External Libraries ***");
        Iterator<Pair<String, String>> it = arrayList.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            try {
                Class.forName((String) next.first);
                Log.i("IntegrationHelper", ((String) next.second) + " - VERIFIED");
            } catch (ClassNotFoundException unused) {
                z10 = false;
                Log.e("IntegrationHelper", ((String) next.second) + " - MISSING");
            }
        }
        return z10;
    }

    private static IntegrationData b(Activity activity, String str) {
        String str2;
        try {
            IntegrationData integrationData = (IntegrationData) Class.forName(str).getMethod("getIntegrationData", Activity.class).invoke(null, activity);
            Log.i("IntegrationHelper", "Adapter " + integrationData.version + " - VERIFIED");
            return integrationData;
        } catch (ClassNotFoundException unused) {
            str2 = "Adapter - MISSING";
            Log.e("IntegrationHelper", str2);
            return null;
        } catch (Exception unused2) {
            str2 = "Adapter version - NOT VERIFIED";
            Log.e("IntegrationHelper", str2);
            return null;
        }
    }

    private static boolean b(Activity activity, String[] strArr) {
        boolean z10 = true;
        if (strArr == null) {
            return true;
        }
        Log.i("IntegrationHelper", "*** Activities ***");
        for (String str : strArr) {
            try {
            } catch (ClassNotFoundException unused) {
                Log.e("IntegrationHelper", str + " - MISSING");
            }
            if (activity.getPackageManager().queryIntentActivities(new Intent(activity, Class.forName(str)), Constants.MIN_PROGRESS_STEP).size() > 0) {
                Log.i("IntegrationHelper", str + " - VERIFIED");
            } else {
                Log.e("IntegrationHelper", str + " - MISSING");
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
        if (r6.equals("facebook") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
        if (r6.equals("facebook") == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void validateIntegration(final android.app.Activity r22) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.integration.IntegrationHelper.validateIntegration(android.app.Activity):void");
    }
}
