package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;

@o6.a(name = HeadlessJsTaskSupportModule.NAME)
/* loaded from: classes.dex */
public class HeadlessJsTaskSupportModule extends NativeHeadlessJsTaskSupportSpec {
    public static final String NAME = "HeadlessJsTaskSupport";

    public HeadlessJsTaskSupportModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskFinished(double d10) {
        int i10 = (int) d10;
        n6.b e10 = n6.b.e(getReactApplicationContext());
        if (e10.g(i10)) {
            e10.d(i10);
        } else {
            z3.a.E(HeadlessJsTaskSupportModule.class, "Tried to finish non-active task with id %d. Did it time out?", Integer.valueOf(i10));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeHeadlessJsTaskSupportSpec
    public void notifyTaskRetry(double d10, Promise promise) {
        int i10 = (int) d10;
        n6.b e10 = n6.b.e(getReactApplicationContext());
        if (e10.g(i10)) {
            promise.resolve(Boolean.valueOf(e10.j(i10)));
            return;
        }
        z3.a.E(HeadlessJsTaskSupportModule.class, "Tried to retry non-active task with id %d. Did it time out?", Integer.valueOf(i10));
        promise.resolve(Boolean.FALSE);
    }
}
