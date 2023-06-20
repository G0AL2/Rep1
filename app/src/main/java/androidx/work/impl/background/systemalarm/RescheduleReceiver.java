package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.e0;
import androidx.work.l;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static final String f4481a = l.i("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        l e10 = l.e();
        String str = f4481a;
        e10.a(str, "Received intent " + intent);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                e0.n(context).x(goAsync());
                return;
            } catch (IllegalStateException e11) {
                l.e().d(f4481a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e11);
                return;
            }
        }
        context.startService(b.e(context));
    }
}
