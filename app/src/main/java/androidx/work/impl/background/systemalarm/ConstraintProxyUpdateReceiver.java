package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.e0;
import androidx.work.l;
import p1.m;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    static final String f4477a = l.i("ConstrntProxyUpdtRecvr");

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Intent f4478a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f4479b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f4480c;

        a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f4478a = intent;
            this.f4479b = context;
            this.f4480c = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f4478a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f4478a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f4478a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f4478a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                l.e().a(ConstraintProxyUpdateReceiver.f4477a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                m.a(this.f4479b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                m.a(this.f4479b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                m.a(this.f4479b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                m.a(this.f4479b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f4480c.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z10, boolean z11, boolean z12, boolean z13) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z10).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z11).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z12).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z13);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            l e10 = l.e();
            String str = f4477a;
            e10.a(str, "Ignoring unknown action " + action);
            return;
        }
        e0.n(context).t().c(new a(this, intent, context, goAsync()));
    }
}
