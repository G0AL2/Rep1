package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;

@Deprecated
/* loaded from: classes3.dex */
public class SSAFactory {
    public static f getPublisherInstance(Activity activity) {
        return com.ironsource.sdk.d.b.a((Context) activity);
    }

    public static f getPublisherTestInstance(Activity activity, int i10) {
        return com.ironsource.sdk.d.b.a(activity, i10);
    }
}
