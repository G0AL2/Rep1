package io.invertase.firebase.app;

import ce.g;
import ce.i;
import ce.j;
import ce.k;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ob.e;

/* loaded from: classes3.dex */
public class ReactNativeFirebaseAppModule extends ReactNativeFirebaseModule {
    private static final String TAG = "App";

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReactNativeFirebaseAppModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @ReactMethod
    public void deleteApp(String str, Promise promise) {
        e o10 = e.o(str);
        if (o10 != null) {
            o10.i();
        }
        promise.resolve(null);
    }

    @ReactMethod
    public void eventsAddListener(String str) {
        g.i().e(str);
    }

    @ReactMethod
    public void eventsGetListeners(Promise promise) {
        promise.resolve(g.i().h());
    }

    @ReactMethod
    public void eventsNotifyReady(Boolean bool) {
        g.i().m(bool);
    }

    @ReactMethod
    public void eventsPing(String str, ReadableMap readableMap, Promise promise) {
        g.i().o(new ce.b(str, ce.a.d(readableMap)));
        promise.resolve(ce.a.d(readableMap));
    }

    @ReactMethod
    public void eventsRemoveListener(String str, Boolean bool) {
        g.i().n(str, bool);
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (e eVar : e.m(getReactApplicationContext())) {
            arrayList.add(ce.a.a(eVar));
        }
        hashMap.put("NATIVE_FIREBASE_APPS", arrayList);
        hashMap.put("FIREBASE_RAW_JSON", i.d().c());
        return hashMap;
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        g.i().f(getContext());
    }

    @ReactMethod
    public void initializeApp(ReadableMap readableMap, ReadableMap readableMap2, Promise promise) {
        promise.resolve(ce.a.b(ce.a.c(readableMap, readableMap2, getContext())));
    }

    @ReactMethod
    public void jsonGetAll(Promise promise) {
        promise.resolve(i.d().a());
    }

    @ReactMethod
    public void metaGetAll(Promise promise) {
        promise.resolve(j.c().a());
    }

    @ReactMethod
    public void preferencesClearAll(Promise promise) {
        k.d().a();
        promise.resolve(null);
    }

    @ReactMethod
    public void preferencesGetAll(Promise promise) {
        promise.resolve(k.d().b());
    }

    @ReactMethod
    public void preferencesSetBool(String str, boolean z10, Promise promise) {
        k.d().e(str, z10);
        promise.resolve(null);
    }

    @ReactMethod
    public void preferencesSetString(String str, String str2, Promise promise) {
        k.d().f(str, str2);
        promise.resolve(null);
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @ReactMethod
    public void setAutomaticDataCollectionEnabled(String str, Boolean bool) {
        e.o(str).E(bool);
    }
}
