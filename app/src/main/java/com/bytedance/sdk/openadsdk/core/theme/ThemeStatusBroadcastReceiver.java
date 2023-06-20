package com.bytedance.sdk.openadsdk.core.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.l;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<a> f12748a;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        l.b("ThemeStatusBroadcastReceiver", "====主题状态更新====");
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        WeakReference<a> weakReference = this.f12748a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f12748a.get().a(intExtra);
    }
}
