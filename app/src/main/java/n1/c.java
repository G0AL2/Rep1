package n1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;

/* compiled from: BatteryNotLowTracker.kt */
/* loaded from: classes.dex */
public final class c extends e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, q1.c cVar) {
        super(context, cVar);
        qe.k.f(context, "context");
        qe.k.f(cVar, "taskExecutor");
    }

    @Override // n1.e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // n1.e
    public void k(Intent intent) {
        String str;
        qe.k.f(intent, "intent");
        if (intent.getAction() == null) {
            return;
        }
        androidx.work.l e10 = androidx.work.l.e();
        str = d.f34602a;
        e10.a(str, "Received " + intent.getAction());
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    g(Boolean.TRUE);
                }
            } else if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                g(Boolean.FALSE);
            }
        }
    }

    @Override // n1.h
    /* renamed from: l */
    public Boolean e() {
        String str;
        Intent registerReceiver = d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            androidx.work.l e10 = androidx.work.l.e();
            str = d.f34602a;
            e10.c(str, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) / registerReceiver.getIntExtra("scale", -1);
        boolean z10 = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
