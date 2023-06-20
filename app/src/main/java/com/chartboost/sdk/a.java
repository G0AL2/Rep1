package com.chartboost.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.impl.l;
import com.google.android.gms.ads.AdRequest;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
        if (g.f13880e == null) {
            CBLogging.b("CBConfig", "Set a valid CBFramework first");
        } else if (TextUtils.isEmpty(str)) {
            CBLogging.b("CBConfig", "Invalid Version String");
        } else {
            g.f13878c = str;
        }
    }

    private static boolean b() {
        return f.a() != null;
    }

    public static boolean c() {
        return a() && b();
    }

    public static boolean b(Context context) {
        int checkCallingOrSelfPermission;
        int checkCallingOrSelfPermission2;
        try {
            if (context != null) {
                if (l.b().a(23)) {
                    checkCallingOrSelfPermission = context.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE");
                    checkCallingOrSelfPermission2 = context.checkSelfPermission("android.permission.INTERNET");
                } else {
                    checkCallingOrSelfPermission = context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE");
                    checkCallingOrSelfPermission2 = context.checkCallingOrSelfPermission("android.permission.INTERNET");
                }
                g.f13887l = checkCallingOrSelfPermission2 != 0;
                g.f13888m = checkCallingOrSelfPermission != 0;
                if (!g.f13887l) {
                    if (g.f13888m) {
                        throw new RuntimeException("Please add the permission : android.permission.ACCESS_NETWORK_STATE in your android manifest.xml");
                    }
                    return true;
                }
                throw new RuntimeException("Please add the permission : android.permission.INTERNET in your android manifest.xml");
            }
            throw new RuntimeException("Invalid activity context passed during intitalization");
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean a(AtomicReference<com.chartboost.sdk.Model.e> atomicReference, JSONObject jSONObject) {
        try {
            atomicReference.set(new com.chartboost.sdk.Model.e(jSONObject));
            return true;
        } catch (Exception e10) {
            CBLogging.b("CBConfig", "updateConfig: " + e10.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a() {
        try {
            if (f.a() != null) {
                if (!TextUtils.isEmpty(g.f13885j)) {
                    if (TextUtils.isEmpty(g.f13886k)) {
                        throw new Exception("SDK Initialization error. AppSignature is missing");
                    }
                    return true;
                }
                throw new Exception("SDK Initialization error. AppId is missing");
            }
            throw new Exception("SDK Initialization error. SDK seems to be not initialized properly, check for any integration issues");
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public static boolean a(Context context) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent(context, CBImpressionActivity.class), 0);
        if (queryIntentActivities.isEmpty()) {
            return false;
        }
        ActivityInfo activityInfo = queryIntentActivities.get(0).activityInfo;
        int i10 = activityInfo.flags;
        if ((i10 & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || (i10 & 32) == 0) {
            return false;
        }
        int i11 = activityInfo.configChanges;
        return ((i11 & 128) == 0 || (i11 & 32) == 0 || (i11 & IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES) == 0) ? false : true;
    }
}
