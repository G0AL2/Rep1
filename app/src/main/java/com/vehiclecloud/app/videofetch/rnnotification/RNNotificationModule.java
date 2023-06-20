package com.vehiclecloud.app.videofetch.rnnotification;

import android.app.Activity;
import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.format.DateFormat;
import androidx.core.app.l;
import androidx.work.v;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.vehiclecloud.app.videofetch.unit.AsyncStorageHelper;
import downloader.video.download.free.R;
import ee.h;
import ee.j;
import ee.u;
import java.io.IOException;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONObject;
import qe.g;
import qe.k;
import we.e0;
import we.f0;
import we.n1;
import we.q;
import we.s0;
import ye.b0;
import ye.c0;
import ye.d0;
import ye.e;
import ye.f;
import ye.z;

/* compiled from: RNNotificationModule.kt */
/* loaded from: classes3.dex */
public final class RNNotificationModule extends ReactContextBaseJavaModule {
    public static final String EXTRA_NOTIFICATION = "vc_notification";
    public static final String EXTRA_SERVER_PARAMS = "vc_server_params";
    public static final String PUSH_CHANNEL = "pushNotification";
    public static final String TAG = "RNNotificationModule";
    private static final int UNWATCH_NOTIFICATION_HOUR = 20;
    private static final String UNWATCH_NOTIFICATION_WORKER_TAG = "unwatchNotification";
    private final h mFirebaseAnalytics$delegate;
    private final h notificationManager$delegate;
    private final e0 scope;
    private final h workManager$delegate;
    public static final Companion Companion = new Companion(null);
    private static final z httpClient = new z.a().c();

    /* compiled from: RNNotificationModule.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void createChannel$app_orangeRelease(Context context, l lVar) {
            k.f(context, "context");
            k.f(lVar, "mNotificationManager");
            if (Build.VERSION.SDK_INT >= 26) {
                lVar.e(new NotificationChannel(RNNotificationModule.PUSH_CHANNEL, context.getText(R.string.push_channel_name), 4));
            }
        }

        public final void logEvent$app_orangeRelease(FirebaseAnalytics firebaseAnalytics, String str, Bundle bundle) {
            k.f(firebaseAnalytics, "firebaseAnalytics");
            k.f(str, "event");
            k.f(bundle, "message");
            firebaseAnalytics.b(str, bundle);
        }

        public final void postCastboxEvent$app_orangeRelease(Context context, String str, String str2) {
            JSONObject query;
            Locale locale;
            k.f(context, "context");
            k.f(str, "eventType");
            JSONObject query2 = AsyncStorageHelper.query(context, "castBox");
            if (query2 == null || (query = AsyncStorageHelper.query(context, "fcmToken")) == null) {
                return;
            }
            b0.a aVar = new b0.a();
            String string = context.getString(R.string.push_castbox_event_url);
            k.e(string, "context.getString(if (Bu…g.push_castbox_event_url)");
            b0.a e10 = aVar.l(string).e("Accept", "application/json").e("Content-Type", "application/json").e("X-APP-ID", "application/json").e("X-ACCESS-TOKEN", "application/json");
            c0.a aVar2 = c0.Companion;
            JSONObject put = new JSONObject().put("appEventTime", DateFormat.format("yyyy-MM-ddTHH:mm:ssZ", System.currentTimeMillis()));
            JSONObject jSONObject = new JSONObject();
            String string2 = Settings.System.getString(context.getContentResolver(), "android_id");
            if (Build.VERSION.SDK_INT < 24) {
                locale = context.getResources().getConfiguration().locale;
            } else {
                locale = context.getResources().getConfiguration().getLocales().get(0);
            }
            jSONObject.put("androidId", string2);
            jSONObject.put("appIdentifier", context.getPackageName());
            jSONObject.put("appVersion", "1.23.0");
            jSONObject.put("brand", Build.BRAND);
            jSONObject.put("deviceCountry", locale.getCountry());
            jSONObject.put("deviceId", string2);
            jSONObject.put("deviceToken", query.optString("fcmToken"));
            jSONObject.put("deviceType", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            jSONObject.put("language", locale.getLanguage());
            jSONObject.put("locale", locale.toLanguageTag());
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("pushType", "FCM");
            jSONObject.put("timezone", TimeZone.getDefault().getID());
            jSONObject.put("uid", query2.optString("uid"));
            u uVar = u.f29813a;
            JSONObject put2 = put.put("deviceData", jSONObject).put("eventType", str);
            if (str2 == null) {
                str2 = "";
            }
            String jSONObject2 = put2.put("serverParams", str2).toString();
            k.e(jSONObject2, "JSONObject()\n           …              .toString()");
            RNNotificationModule.httpClient.a(e10.h(c0.a.i(aVar2, jSONObject2, null, 1, null)).b()).i1(new f() { // from class: com.vehiclecloud.app.videofetch.rnnotification.RNNotificationModule$Companion$postCastboxEvent$1
                @Override // ye.f
                public void onFailure(e eVar, IOException iOException) {
                    k.f(eVar, "call");
                    k.f(iOException, "e");
                    timber.log.a.f37331a.e(iOException, "postCastboxEvent get ex:", new Object[0]);
                }

                @Override // ye.f
                public void onResponse(e eVar, d0 d0Var) {
                    k.f(eVar, "call");
                    k.f(d0Var, "response");
                    timber.log.a.f37331a.d("postCastboxEvent resp: %d", Integer.valueOf(d0Var.h()));
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNNotificationModule(final ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        q b10;
        h a10;
        h a11;
        h a12;
        k.f(reactApplicationContext, "reactContext");
        b10 = n1.b(null, 1, null);
        this.scope = f0.a(b10.plus(s0.b()));
        a10 = j.a(new RNNotificationModule$mFirebaseAnalytics$2(reactApplicationContext));
        this.mFirebaseAnalytics$delegate = a10;
        a11 = j.a(new RNNotificationModule$workManager$2(reactApplicationContext));
        this.workManager$delegate = a11;
        a12 = j.a(new RNNotificationModule$notificationManager$2(reactApplicationContext));
        this.notificationManager$delegate = a12;
        reactApplicationContext.addLifecycleEventListener(new LifecycleEventListener() { // from class: com.vehiclecloud.app.videofetch.rnnotification.RNNotificationModule.1
            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostDestroy() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostPause() {
            }

            @Override // com.facebook.react.bridge.LifecycleEventListener
            public void onHostResume() {
                Activity currentActivity = reactApplicationContext.getCurrentActivity();
                if (currentActivity != null) {
                    this.logNotificationOpenEvent(currentActivity.getIntent());
                }
                reactApplicationContext.removeLifecycleEventListener(this);
            }
        });
        reactApplicationContext.addActivityEventListener(new BaseActivityEventListener() { // from class: com.vehiclecloud.app.videofetch.rnnotification.RNNotificationModule.2
            {
                RNNotificationModule.this = this;
            }

            @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
            public void onNewIntent(Intent intent) {
                RNNotificationModule.this.logNotificationOpenEvent(intent);
            }
        });
        initLifecycleListener();
        Companion companion = Companion;
        l f10 = l.f(reactApplicationContext);
        k.e(f10, "from(reactContext)");
        companion.createChannel$app_orangeRelease(reactApplicationContext, f10);
    }

    public static /* synthetic */ void g(Promise promise, Task task) {
        m6getToken$lambda0(promise, task);
    }

    private final FirebaseAnalytics getMFirebaseAnalytics() {
        return (FirebaseAnalytics) this.mFirebaseAnalytics$delegate.getValue();
    }

    private final l getNotificationManager() {
        return (l) this.notificationManager$delegate.getValue();
    }

    /* renamed from: getToken$lambda-0 */
    public static final void m6getToken$lambda0(Promise promise, Task task) {
        k.f(promise, "$promise");
        k.f(task, "task");
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            promise.reject(task.getException());
        }
    }

    public final v getWorkManager() {
        return (v) this.workManager$delegate.getValue();
    }

    private final void initLifecycleListener() {
        we.e.b(this.scope, s0.c(), null, new RNNotificationModule$initLifecycleListener$1(this, null), 2, null);
    }

    public final void logNotificationOpenEvent(Intent intent) {
        Bundle extras;
        Bundle bundle = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getBundle(EXTRA_NOTIFICATION);
        if (bundle == null) {
            return;
        }
        getNotificationManager().d();
        Companion companion = Companion;
        companion.logEvent$app_orangeRelease(getMFirebaseAnalytics(), "push_open", bundle);
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        k.e(reactApplicationContext, "reactApplicationContext");
        Bundle extras2 = intent.getExtras();
        companion.postCastboxEvent$app_orangeRelease(reactApplicationContext, "DeviceOpen", extras2 != null ? extras2.getString(EXTRA_SERVER_PARAMS) : null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }

    @ReactMethod
    public final void getToken(final Promise promise) {
        k.f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        FirebaseMessaging.l().o().addOnCompleteListener(new OnCompleteListener() { // from class: com.vehiclecloud.app.videofetch.rnnotification.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                RNNotificationModule.g(Promise.this, task);
            }
        });
    }
}
