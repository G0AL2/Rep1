package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeSourceCodeSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;

@o6.a(name = SourceCodeModule.NAME)
/* loaded from: classes.dex */
public class SourceCodeModule extends NativeSourceCodeSpec {
    public static final String NAME = "SourceCode";

    public SourceCodeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeSourceCodeSpec
    protected Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put("scriptURL", (String) f6.a.d(getReactApplicationContext().getSourceURL(), "No source URL loaded, have you initialised the instance?"));
        return hashMap;
    }
}
