package n1;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* compiled from: BatteryChargingTracker.kt */
/* loaded from: classes.dex */
public final class a extends e<Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, q1.c cVar) {
        super(context, cVar);
        qe.k.f(context, "context");
        qe.k.f(cVar, "taskExecutor");
    }

    private final boolean m(Intent intent) {
        if (Build.VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }

    @Override // n1.e
    public IntentFilter j() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    @Override // n1.e
    public void k(Intent intent) {
        String str;
        qe.k.f(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        androidx.work.l e10 = androidx.work.l.e();
        str = b.f34601a;
        e10.a(str, "Received " + action);
        switch (action.hashCode()) {
            case -1886648615:
                if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    g(Boolean.FALSE);
                    return;
                }
                return;
            case -54942926:
                if (action.equals("android.os.action.DISCHARGING")) {
                    g(Boolean.FALSE);
                    return;
                }
                return;
            case 948344062:
                if (action.equals("android.os.action.CHARGING")) {
                    g(Boolean.TRUE);
                    return;
                }
                return;
            case 1019184907:
                if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    g(Boolean.TRUE);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // n1.h
    /* renamed from: l */
    public Boolean e() {
        String str;
        Intent registerReceiver = d().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            androidx.work.l e10 = androidx.work.l.e();
            str = b.f34601a;
            e10.c(str, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        return Boolean.valueOf(m(registerReceiver));
    }
}
