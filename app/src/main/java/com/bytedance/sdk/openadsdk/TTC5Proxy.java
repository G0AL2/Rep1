package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.b.a;

/* loaded from: classes.dex */
public class TTC5Proxy {
    public static void loadFeed(Context context, AdSlot adSlot, TTAdNative.FeedAdListener feedAdListener) {
        adSlot.setDurationSlotType(5);
        a.a().a(context, adSlot, feedAdListener);
    }
}
