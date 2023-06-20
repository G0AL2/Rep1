package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public interface ActivityEventListener {
    void onActivityResult(Activity activity, int i10, int i11, Intent intent);

    void onNewIntent(Intent intent);
}
