package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.c;
import com.bytedance.sdk.openadsdk.component.f.a;

/* loaded from: classes.dex */
public class TTC2Proxy {
    private TTC2Proxy() {
    }

    public static void a(Context context) {
        a.a(context);
    }

    public static void load(Context context, AdSlot adSlot, TTAdNative.AppOpenAdListener appOpenAdListener, int i10) {
        adSlot.setDurationSlotType(3);
        c.a(context).a(adSlot, appOpenAdListener, i10);
    }
}
