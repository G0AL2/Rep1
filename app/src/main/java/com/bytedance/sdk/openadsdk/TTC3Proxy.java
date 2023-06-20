package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.component.reward.d;
import com.bytedance.sdk.openadsdk.component.reward.e;
import com.bytedance.sdk.openadsdk.component.reward.f;
import com.bytedance.sdk.openadsdk.component.reward.i;

/* loaded from: classes.dex */
public class TTC3Proxy {
    public static void a(Context context) {
        try {
            i.a(context).b();
        } catch (Throwable unused) {
        }
        try {
            d.a(context).a();
        } catch (Throwable unused2) {
        }
    }

    public static void loadFull(Context context, AdSlot adSlot, TTAdNative.FullScreenVideoAdListener fullScreenVideoAdListener) {
        adSlot.setDurationSlotType(8);
        d.a(context).a(adSlot, new f(fullScreenVideoAdListener));
    }

    public static void loadReward(Context context, AdSlot adSlot, TTAdNative.RewardVideoAdListener rewardVideoAdListener) {
        adSlot.setDurationSlotType(7);
        i.a(context).a(adSlot, new f(rewardVideoAdListener));
    }

    public static void verityPlayable(String str, int i10, String str2, String str3, String str4) {
        e.a(str, i10, str2, str3, str4);
    }
}
