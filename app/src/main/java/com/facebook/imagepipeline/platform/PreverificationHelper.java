package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;

@com.facebook.soloader.e
/* loaded from: classes.dex */
class PreverificationHelper {
    /* JADX INFO: Access modifiers changed from: package-private */
    @com.facebook.soloader.e
    @TargetApi(26)
    public boolean shouldUseHardwareBitmapConfig(Bitmap.Config config) {
        return config == Bitmap.Config.HARDWARE;
    }
}
