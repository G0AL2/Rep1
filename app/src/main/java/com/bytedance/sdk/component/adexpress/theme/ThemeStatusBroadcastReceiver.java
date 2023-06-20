package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.component.utils.l;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<a> f9810a;

    public void a(a aVar) {
        this.f9810a = new WeakReference<>(aVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        l.b("ThemeStatusBroadcastReceiver", "====主题状态更新====");
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        WeakReference<a> weakReference = this.f9810a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f9810a.get().b(intExtra);
    }
}
