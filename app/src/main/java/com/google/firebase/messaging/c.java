package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.i;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CommonNotificationBuilder.java */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicInteger f23472a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: CommonNotificationBuilder.java */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final i.e f23473a;

        /* renamed from: b  reason: collision with root package name */
        public final String f23474b;

        /* renamed from: c  reason: collision with root package name */
        public final int f23475c;

        a(i.e eVar, String str, int i10) {
            this.f23473a = eVar;
            this.f23474b = str;
            this.f23475c = i10;
        }
    }

    private static PendingIntent a(Context context, h0 h0Var, String str, PackageManager packageManager) {
        Intent g10 = g(str, h0Var, packageManager);
        if (g10 == null) {
            return null;
        }
        g10.addFlags(67108864);
        g10.putExtras(h0Var.y());
        if (r(h0Var)) {
            g10.putExtra("gcm.n.analytics_data", h0Var.x());
        }
        return PendingIntent.getActivity(context, h(), g10, m(1073741824));
    }

    private static PendingIntent b(Context context, Context context2, h0 h0Var) {
        if (r(h0Var)) {
            return c(context, context2, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(h0Var.x()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, h(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), m(1073741824));
    }

    public static a d(Context context, Context context2, h0 h0Var, String str, Bundle bundle) {
        return e(context, context2, h0Var, str, bundle, context2.getPackageName(), context2.getResources(), context2.getPackageManager());
    }

    public static a e(Context context, Context context2, h0 h0Var, String str, Bundle bundle, String str2, Resources resources, PackageManager packageManager) {
        i.e eVar = new i.e(context2, str);
        String n10 = h0Var.n(resources, str2, "gcm.n.title");
        if (!TextUtils.isEmpty(n10)) {
            eVar.k(n10);
        }
        String n11 = h0Var.n(resources, str2, "gcm.n.body");
        if (!TextUtils.isEmpty(n11)) {
            eVar.j(n11);
            eVar.z(new i.c().h(n11));
        }
        eVar.x(n(packageManager, resources, str2, h0Var.p("gcm.n.icon"), bundle));
        Uri o10 = o(str2, h0Var, resources);
        if (o10 != null) {
            eVar.y(o10);
        }
        eVar.i(a(context, h0Var, str2, packageManager));
        PendingIntent b10 = b(context, context2, h0Var);
        if (b10 != null) {
            eVar.m(b10);
        }
        Integer i10 = i(context2, h0Var.p("gcm.n.color"), bundle);
        if (i10 != null) {
            eVar.h(i10.intValue());
        }
        eVar.f(!h0Var.a("gcm.n.sticky"));
        eVar.r(h0Var.a("gcm.n.local_only"));
        String p10 = h0Var.p("gcm.n.ticker");
        if (p10 != null) {
            eVar.B(p10);
        }
        Integer m10 = h0Var.m();
        if (m10 != null) {
            eVar.u(m10.intValue());
        }
        Integer r10 = h0Var.r();
        if (r10 != null) {
            eVar.D(r10.intValue());
        }
        Integer l10 = h0Var.l();
        if (l10 != null) {
            eVar.s(l10.intValue());
        }
        Long j10 = h0Var.j("gcm.n.event_time");
        if (j10 != null) {
            eVar.w(true);
            eVar.E(j10.longValue());
        }
        long[] q10 = h0Var.q();
        if (q10 != null) {
            eVar.C(q10);
        }
        int[] e10 = h0Var.e();
        if (e10 != null) {
            eVar.q(e10[0], e10[1], e10[2]);
        }
        eVar.l(j(h0Var));
        return new a(eVar, p(h0Var), 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a f(Context context, h0 h0Var) {
        Bundle k10 = k(context.getPackageManager(), context.getPackageName());
        return d(context, context, h0Var, l(context, h0Var.k(), k10), k10);
    }

    private static Intent g(String str, h0 h0Var, PackageManager packageManager) {
        String p10 = h0Var.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(p10)) {
            Intent intent = new Intent(p10);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f10 = h0Var.f();
        if (f10 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f10);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    private static int h() {
        return f23472a.incrementAndGet();
    }

    private static Integer i(Context context, String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                Log.w("FirebaseMessaging", "Color is invalid: " + str + ". Notification will use default color.");
            }
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
            try {
                return Integer.valueOf(androidx.core.content.b.d(context, i10));
            } catch (Resources.NotFoundException unused2) {
                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    private static int j(h0 h0Var) {
        boolean a10 = h0Var.a("gcm.n.default_sound");
        ?? r02 = a10;
        if (h0Var.a("gcm.n.default_vibrate_timings")) {
            r02 = (a10 ? 1 : 0) | true;
        }
        return h0Var.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    private static Bundle k(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        return Bundle.EMPTY;
    }

    @TargetApi(26)
    public static String l(Context context, String str, Bundle bundle) {
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str)) {
                if (notificationManager.getNotificationChannel(str) != null) {
                    return str;
                }
                Log.w("FirebaseMessaging", "Notification Channel requested (" + str + ") has not been created by the app. Manifest configuration, or default, value will be used.");
            }
            String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string2)) {
                if (notificationManager.getNotificationChannel(string2) != null) {
                    return string2;
                }
                Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
            } else {
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                if (identifier == 0) {
                    Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                    string = "Misc";
                } else {
                    string = context.getString(identifier);
                }
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int m(int i10) {
        return Build.VERSION.SDK_INT >= 23 ? i10 | 67108864 : i10;
    }

    private static int n(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && q(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && q(resources, identifier2)) {
                return identifier2;
            }
            Log.w("FirebaseMessaging", "Icon resource " + str2 + " not found. Notification will use default icon.");
        }
        int i10 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 == 0 || !q(resources, i10)) {
            try {
                i10 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e10) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
            }
        }
        if (i10 == 0 || !q(resources, i10)) {
            return 17301651;
        }
        return i10;
    }

    private static Uri o(String str, h0 h0Var, Resources resources) {
        String o10 = h0Var.o();
        if (TextUtils.isEmpty(o10)) {
            return null;
        }
        if (!"default".equals(o10) && resources.getIdentifier(o10, "raw", str) != 0) {
            return Uri.parse("android.resource://" + str + "/raw/" + o10);
        }
        return RingtoneManager.getDefaultUri(2);
    }

    private static String p(h0 h0Var) {
        String p10 = h0Var.p("gcm.n.tag");
        if (TextUtils.isEmpty(p10)) {
            return "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return p10;
    }

    @TargetApi(26)
    private static boolean q(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable) {
                Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
                return false;
            }
            return true;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }

    static boolean r(h0 h0Var) {
        return h0Var.a("google.c.a.e");
    }
}
