package com.facebook.react.modules.clipboard;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.facebook.fbreact.specs.NativeClipboardSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import o6.a;

@a(name = ClipboardModule.NAME)
/* loaded from: classes.dex */
public class ClipboardModule extends NativeClipboardSpec {
    public static final String NAME = "Clipboard";

    public ClipboardModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private ClipboardManager getClipboardService() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        getReactApplicationContext();
        return (ClipboardManager) reactApplicationContext.getSystemService("clipboard");
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeClipboardSpec
    public void getString(Promise promise) {
        try {
            ClipboardManager clipboardService = getClipboardService();
            ClipData primaryClip = clipboardService.getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() >= 1) {
                ClipData.Item itemAt = clipboardService.getPrimaryClip().getItemAt(0);
                promise.resolve("" + ((Object) itemAt.getText()));
            } else {
                promise.resolve("");
            }
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeClipboardSpec
    public void setString(String str) {
        getClipboardService().setPrimaryClip(ClipData.newPlainText(null, str));
    }
}
