package io.invertase.firebase.analytics;

import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.vehiclecloud.app.videofetch.rnbillingclient.RNBillingClientModule;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class ReactNativeFirebaseAnalyticsModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Analytics";
    private final s module;

    public ReactNativeFirebaseAnalyticsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new s(reactApplicationContext, SERVICE_NAME);
    }

    public static /* synthetic */ void g(Promise promise, Task task) {
        lambda$setAnalyticsCollectionEnabled$1(promise, task);
    }

    public static /* synthetic */ void i(Promise promise, Task task) {
        lambda$getAppInstanceId$3(promise, task);
    }

    public static /* synthetic */ void j(Promise promise, Task task) {
        lambda$setUserProperties$6(promise, task);
    }

    public static /* synthetic */ void k(Promise promise, Task task) {
        lambda$setUserProperty$5(promise, task);
    }

    public static /* synthetic */ void l(Promise promise, Task task) {
        lambda$resetAnalyticsData$7(promise, task);
    }

    public static /* synthetic */ void lambda$getAppInstanceId$3(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void lambda$logEvent$0(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void lambda$resetAnalyticsData$7(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void lambda$setAnalyticsCollectionEnabled$1(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void lambda$setDefaultEventParameters$8(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void lambda$setSessionTimeoutDuration$2(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void lambda$setUserId$4(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void lambda$setUserProperties$6(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void lambda$setUserProperty$5(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void m(Promise promise, Task task) {
        lambda$setSessionTimeoutDuration$2(promise, task);
    }

    public static /* synthetic */ void n(Promise promise, Task task) {
        lambda$setUserId$4(promise, task);
    }

    public static /* synthetic */ void o(Promise promise, Task task) {
        lambda$logEvent$0(promise, task);
    }

    public static /* synthetic */ void p(Promise promise, Task task) {
        lambda$setDefaultEventParameters$8(promise, task);
    }

    private Bundle toBundle(ReadableMap readableMap) {
        Bundle bundle = Arguments.toBundle(readableMap);
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = (ArrayList) bundle.getSerializable(RNBillingClientModule.Result.Params.ITEMS);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Bundle) {
                Bundle bundle2 = (Bundle) next;
                if (bundle2.containsKey("quantity")) {
                    bundle2.putInt("quantity", (int) bundle2.getDouble("quantity"));
                }
            }
        }
        if (bundle.containsKey("extend_session")) {
            bundle.putLong("extend_session", (long) bundle.getDouble("extend_session"));
        }
        return bundle;
    }

    @ReactMethod
    public void getAppInstanceId(final Promise promise) {
        this.module.n().addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.i(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void logEvent(String str, ReadableMap readableMap, final Promise promise) {
        this.module.w(str, toBundle(readableMap)).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.o(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void resetAnalyticsData(final Promise promise) {
        this.module.x().addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.l(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setAnalyticsCollectionEnabled(Boolean bool, final Promise promise) {
        this.module.y(bool).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.g(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setDefaultEventParameters(ReadableMap readableMap, final Promise promise) {
        this.module.z(toBundle(readableMap)).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.i
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.p(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setSessionTimeoutDuration(double d10, final Promise promise) {
        this.module.A((long) d10).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.m(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setUserId(String str, final Promise promise) {
        this.module.B(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.n(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setUserProperties(ReadableMap readableMap, final Promise promise) {
        this.module.C(Arguments.toBundle(readableMap)).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.c
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.j(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void setUserProperty(String str, String str2, final Promise promise) {
        this.module.D(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.analytics.d
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAnalyticsModule.k(Promise.this, task);
            }
        });
    }
}
