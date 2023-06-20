package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeExceptionsManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

@o6.a(name = ExceptionsManagerModule.NAME)
/* loaded from: classes.dex */
public class ExceptionsManagerModule extends NativeExceptionsManagerSpec {
    public static final String NAME = "ExceptionsManager";
    private final k6.d mDevSupportManager;

    public ExceptionsManagerModule(k6.d dVar) {
        super(null);
        this.mDevSupportManager = dVar;
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void dismissRedbox() {
        if (this.mDevSupportManager.e()) {
            this.mDevSupportManager.h();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportException(ReadableMap readableMap) {
        String string = readableMap.hasKey("message") ? readableMap.getString("message") : "";
        ReadableArray array = readableMap.hasKey("stack") ? readableMap.getArray("stack") : Arguments.createArray();
        boolean z10 = readableMap.hasKey("isFatal") ? readableMap.getBoolean("isFatal") : false;
        String a10 = b7.a.a(readableMap);
        if (!z10) {
            z3.a.j("ReactNative", b7.b.a(string, array));
            if (a10 != null) {
                z3.a.c("ReactNative", "extraData: %s", a10);
                return;
            }
            return;
        }
        throw new h6.c(b7.b.a(string, array)).a(a10);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportFatalException(String str, ReadableArray readableArray, double d10) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", (int) d10);
        javaOnlyMap.putBoolean("isFatal", true);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void reportSoftException(String str, ReadableArray readableArray, double d10) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putString("message", str);
        javaOnlyMap.putArray("stack", readableArray);
        javaOnlyMap.putInt("id", (int) d10);
        javaOnlyMap.putBoolean("isFatal", false);
        reportException(javaOnlyMap);
    }

    @Override // com.facebook.fbreact.specs.NativeExceptionsManagerSpec
    public void updateExceptionMessage(String str, ReadableArray readableArray, double d10) {
        int i10 = (int) d10;
        if (this.mDevSupportManager.e()) {
            this.mDevSupportManager.o(str, readableArray, i10);
        }
    }
}
