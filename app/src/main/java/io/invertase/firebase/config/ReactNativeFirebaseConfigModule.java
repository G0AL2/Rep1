package io.invertase.firebase.config;

import com.amazon.device.ads.DtbDeviceDataRetriever;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ReactNativeFirebaseConfigModule extends ReactNativeFirebaseModule {
    private static final String SERVICE_NAME = "Config";
    private final m module;

    public ReactNativeFirebaseConfigModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, SERVICE_NAME);
        this.module = new m(reactApplicationContext, SERVICE_NAME);
    }

    public static /* synthetic */ void g(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise, Task task) {
        reactNativeFirebaseConfigModule.lambda$ensureInitialized$7(promise, task);
    }

    public static /* synthetic */ void i(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise, Task task) {
        reactNativeFirebaseConfigModule.lambda$activate$0(promise, task);
    }

    public static /* synthetic */ void j(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise, Task task) {
        reactNativeFirebaseConfigModule.lambda$reset$3(promise, task);
    }

    public static /* synthetic */ void k(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise, Task task) {
        reactNativeFirebaseConfigModule.lambda$setConfigSettings$4(promise, task);
    }

    public static /* synthetic */ void l(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise, Task task) {
        reactNativeFirebaseConfigModule.lambda$setDefaultsFromResource$6(promise, task);
    }

    public /* synthetic */ void lambda$activate$0(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public /* synthetic */ void lambda$ensureInitialized$7(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(null));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public /* synthetic */ void lambda$fetch$1(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            rejectPromiseWithConfigException(promise, task.getException());
        }
    }

    public /* synthetic */ void lambda$fetchAndActivate$2(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            rejectPromiseWithConfigException(promise, task.getException());
        }
    }

    public /* synthetic */ void lambda$reset$3(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            rejectPromiseWithConfigException(promise, task.getException());
        }
    }

    public /* synthetic */ void lambda$setConfigSettings$4(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public /* synthetic */ void lambda$setDefaults$5(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public /* synthetic */ void lambda$setDefaultsFromResource$6(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(resultWithConstants(task.getResult()));
            return;
        }
        Exception exception = task.getException();
        if (exception != null && exception.getMessage().equals("resource_not_found")) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "resource_not_found", "The specified resource name was not found.");
        }
        ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
    }

    public static /* synthetic */ void m(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise, Task task) {
        reactNativeFirebaseConfigModule.lambda$fetch$1(promise, task);
    }

    public static /* synthetic */ void n(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise, Task task) {
        reactNativeFirebaseConfigModule.lambda$setDefaults$5(promise, task);
    }

    public static /* synthetic */ void o(ReactNativeFirebaseConfigModule reactNativeFirebaseConfigModule, Promise promise, Task task) {
        reactNativeFirebaseConfigModule.lambda$fetchAndActivate$2(promise, task);
    }

    private void rejectPromiseWithConfigException(Promise promise, Exception exc) {
        if (exc == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, DtbDeviceDataRetriever.ORIENTATION_UNKNOWN, "Operation cannot be completed successfully, due to an unknown error.");
        } else if (exc.getCause() instanceof dd.m) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "throttled", "fetch() operation cannot be completed successfully, due to throttling.", exc.getMessage());
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "failure", "fetch() operation cannot be completed successfully.", exc.getMessage());
        }
    }

    private WritableMap resultWithConstants(Object obj) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(IronSourceConstants.EVENTS_RESULT, obj);
        hashMap.put("constants", this.module.o("[DEFAULT]"));
        return Arguments.makeNativeMap(hashMap);
    }

    @ReactMethod
    public void activate(String str, final Promise promise) {
        this.module.i(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.b
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.i(ReactNativeFirebaseConfigModule.this, promise, task);
            }
        });
    }

    @ReactMethod
    public void ensureInitialized(String str, final Promise promise) {
        this.module.k(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.g(ReactNativeFirebaseConfigModule.this, promise, task);
            }
        });
    }

    @ReactMethod
    public void fetch(String str, double d10, final Promise promise) {
        this.module.l(str, (long) d10).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.f
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.m(ReactNativeFirebaseConfigModule.this, promise, task);
            }
        });
    }

    @ReactMethod
    public void fetchAndActivate(String str, final Promise promise) {
        this.module.m(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.o(ReactNativeFirebaseConfigModule.this, promise, task);
            }
        });
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.module.b();
    }

    @ReactMethod
    public void reset(String str, final Promise promise) {
        this.module.u(str).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.c
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.j(ReactNativeFirebaseConfigModule.this, promise, task);
            }
        });
    }

    @ReactMethod
    public void setConfigSettings(String str, ReadableMap readableMap, final Promise promise) {
        this.module.v(str, Arguments.toBundle(readableMap)).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.d
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.k(ReactNativeFirebaseConfigModule.this, promise, task);
            }
        });
    }

    @ReactMethod
    public void setDefaults(String str, ReadableMap readableMap, final Promise promise) {
        this.module.w(str, readableMap.toHashMap()).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.g
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.n(ReactNativeFirebaseConfigModule.this, promise, task);
            }
        });
    }

    @ReactMethod
    public void setDefaultsFromResource(String str, String str2, final Promise promise) {
        this.module.x(str, str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.config.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseConfigModule.l(ReactNativeFirebaseConfigModule.this, promise, task);
            }
        });
    }
}
