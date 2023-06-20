package yb;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;

/* compiled from: BatteryState.java */
/* loaded from: classes3.dex */
class d {

    /* renamed from: a  reason: collision with root package name */
    private final Float f39377a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39378b;

    private d(Float f10, boolean z10) {
        this.f39378b = z10;
        this.f39377a = f10;
    }

    public static d a(Context context) {
        Float f10 = null;
        boolean z10 = false;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z10 = e(registerReceiver);
                f10 = d(registerReceiver);
            }
        } catch (IllegalStateException e10) {
            vb.f.f().e("An error occurred getting battery state.", e10);
        }
        return new d(f10, z10);
    }

    private static Float d(Intent intent) {
        int intExtra = intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f39377a;
    }

    public int c() {
        Float f10;
        if (!this.f39378b || (f10 = this.f39377a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }
}
