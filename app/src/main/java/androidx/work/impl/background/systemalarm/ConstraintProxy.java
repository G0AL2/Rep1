package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.l;
import androidx.work.m;
import java.util.List;
import o1.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4476a = l.i("ConstraintProxy");

    /* loaded from: classes.dex */
    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    /* loaded from: classes.dex */
    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    /* loaded from: classes.dex */
    public static class NetworkStateProxy extends ConstraintProxy {
    }

    /* loaded from: classes.dex */
    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    ConstraintProxy() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, List<u> list) {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (u uVar : list) {
            androidx.work.c cVar = uVar.f34914j;
            z10 |= cVar.f();
            z11 |= cVar.g();
            z12 |= cVar.i();
            z13 |= cVar.d() != m.NOT_REQUIRED;
            if (z10 && z11 && z12 && z13) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z10, z11, z12, z13));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        l e10 = l.e();
        String str = f4476a;
        e10.a(str, "onReceive : " + intent);
        context.startService(b.a(context));
    }
}
