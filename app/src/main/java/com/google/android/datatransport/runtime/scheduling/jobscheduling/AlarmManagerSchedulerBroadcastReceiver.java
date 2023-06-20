package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import w7.o;
import w7.t;

/* loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static /* synthetic */ void a() {
        b();
    }

    public static /* synthetic */ void b() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        t.f(context);
        o.a d10 = o.a().b(queryParameter).d(i8.a.b(intValue));
        if (queryParameter2 != null) {
            d10.c(Base64.decode(queryParameter2, 0));
        }
        t.c().e().v(d10.a(), i10, new Runnable() { // from class: e8.b
            @Override // java.lang.Runnable
            public final void run() {
                AlarmManagerSchedulerBroadcastReceiver.a();
            }
        });
    }
}
