package com.fyber.inneractive.sdk.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class d0 extends l {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final c f20243a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f20244b;

        /* renamed from: c  reason: collision with root package name */
        public final String f20245c;

        public a(c cVar, Throwable th, String str) {
            this.f20243a = cVar;
            this.f20244b = th;
            this.f20245c = str;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends Exception {
        public b(String str) {
            super(str);
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        FAILED,
        OPENED_IN_INTERNAL_BROWSER,
        OPEN_IN_EXTERNAL_APPLICATION,
        OPEN_IN_EXTERNAL_BROWSER,
        OPENED_USING_CHROME_NAVIGATE
    }

    /* loaded from: classes2.dex */
    public enum d {
        DO_NOT_OPEN_IN_INTERNAL_BROWSER,
        OPEN_EVERYTHING
    }

    public static String a(Context context) {
        try {
            return context.getClass().getName();
        } catch (Throwable unused) {
            return "failed";
        }
    }

    public static boolean d(String str) {
        return str.startsWith("http%3A%2F%2F") || str.startsWith("https%3A%2F%2F");
    }

    public static boolean e(String str) {
        if (!str.startsWith("tel:") && !str.startsWith("voicemail:") && !str.startsWith("sms:") && !str.startsWith("mailto:") && !str.startsWith("geo:") && !str.startsWith("google.streetview:")) {
            try {
                new URL(str);
                return false;
            } catch (MalformedURLException unused) {
                IAlog.e("Failed to open Url: %s", str);
            }
        }
        return true;
    }

    public static boolean f(String str) {
        if (str != null && (!r.a() || IAConfigManager.J.f16882r)) {
            if (!((str.startsWith("http://") || str.startsWith("http%3A%2F%2F")) ? false : true)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:117|(1:159)(1:121)|(7:123|124|125|126|(4:128|129|(1:143)(1:133)|(1:142)(1:136))(3:145|146|147)|137|(2:139|140)(1:141)))|160|124|125|126|(0)(0)|137|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0360, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0361, code lost:
        com.fyber.inneractive.sdk.util.IAlog.a("IAJavaUtil - could not open a browser for url: %s", r17);
        r2 = new com.fyber.inneractive.sdk.util.d0.a(com.fyber.inneractive.sdk.util.d0.c.f20246a, r0, r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0384 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0299 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.util.d0.a a(android.content.Context r16, java.lang.String r17, boolean r18, com.fyber.inneractive.sdk.util.d0.d r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.d0.a(android.content.Context, java.lang.String, boolean, com.fyber.inneractive.sdk.util.d0$d, java.lang.String):com.fyber.inneractive.sdk.util.d0$a");
    }

    public static Intent a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    public static Intent a(Context context, String str, String str2) {
        Intent intent = new Intent(context, InneractiveInternalBrowserActivity.class);
        intent.putExtra(InneractiveInternalBrowserActivity.URL_EXTRA, str);
        intent.putExtra("spotId", str2);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    public static boolean a(Context context, Intent intent) {
        if (context != null && intent != null) {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo.activityInfo.exported) {
                    arrayList.add(resolveInfo);
                }
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            try {
                context.startActivity(intent);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }
}
