package com.facebook.react.modules.i18nmanager;

import android.os.Build;
import com.facebook.fbreact.specs.NativeI18nManagerSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import h6.e;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import o6.a;

@a(name = I18nManagerModule.NAME)
/* loaded from: classes.dex */
public class I18nManagerModule extends NativeI18nManagerSpec {
    public static final String NAME = "I18nManager";
    private final s6.a sharedI18nUtilInstance;

    public I18nManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.sharedI18nUtilInstance = s6.a.d();
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void allowRTL(boolean z10) {
        this.sharedI18nUtilInstance.a(getReactApplicationContext(), z10);
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void forceRTL(boolean z10) {
        this.sharedI18nUtilInstance.c(getReactApplicationContext(), z10);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public Map<String, Object> getTypedExportedConstants() {
        Locale locale;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (Build.VERSION.SDK_INT >= 24) {
            locale = reactApplicationContext.getResources().getConfiguration().getLocales().get(0);
        } else {
            locale = reactApplicationContext.getResources().getConfiguration().locale;
        }
        HashMap b10 = e.b();
        b10.put("isRTL", Boolean.valueOf(this.sharedI18nUtilInstance.g(reactApplicationContext)));
        b10.put("doLeftAndRightSwapInRTL", Boolean.valueOf(this.sharedI18nUtilInstance.b(reactApplicationContext)));
        b10.put("localeIdentifier", locale.toString());
        return b10;
    }

    @Override // com.facebook.fbreact.specs.NativeI18nManagerSpec
    public void swapLeftAndRightInRTL(boolean z10) {
        this.sharedI18nUtilInstance.k(getReactApplicationContext(), z10);
    }
}
