package com.vehiclecloud.app.videofetch.rnnotification;

import androidx.work.e;
import androidx.work.n;
import androidx.work.v;
import com.facebook.react.bridge.ReactApplicationContext;
import com.vehiclecloud.app.videofetch.rndownloader.data.AppDatabase;
import ee.o;
import ee.u;
import ie.d;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import pe.p;
import we.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RNNotificationModule.kt */
@f(c = "com.vehiclecloud.app.videofetch.rnnotification.RNNotificationModule$initLifecycleListener$1$1$1", f = "RNNotificationModule.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class RNNotificationModule$initLifecycleListener$1$1$1 extends k implements p<e0, d<? super u>, Object> {
    int label;
    final /* synthetic */ RNNotificationModule this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNNotificationModule$initLifecycleListener$1$1$1(RNNotificationModule rNNotificationModule, d<? super RNNotificationModule$initLifecycleListener$1$1$1> dVar) {
        super(2, dVar);
        this.this$0 = rNNotificationModule;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<u> create(Object obj, d<?> dVar) {
        return new RNNotificationModule$initLifecycleListener$1$1$1(this.this$0, dVar);
    }

    @Override // pe.p
    public final Object invoke(e0 e0Var, d<? super u> dVar) {
        return ((RNNotificationModule$initLifecycleListener$1$1$1) create(e0Var, dVar)).invokeSuspend(u.f29813a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ReactApplicationContext reactApplicationContext;
        long timeInMillis;
        v workManager;
        je.d.c();
        if (this.label == 0) {
            o.b(obj);
            reactApplicationContext = this.this$0.getReactApplicationContext();
            int unwatchedCount = AppDatabase.getInstance(reactApplicationContext).getDownloadResourceDao().getUnwatchedCount();
            if (unwatchedCount > 0) {
                Calendar calendar = Calendar.getInstance();
                if (calendar.get(11) > 20) {
                    timeInMillis = 86400000;
                } else {
                    calendar.set(11, 20);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    timeInMillis = calendar.getTimeInMillis() - System.currentTimeMillis();
                }
                timber.log.a.f37331a.d("schedule unread notification delay: %d", kotlin.coroutines.jvm.internal.b.c(timeInMillis));
                n.a aVar = new n.a(UnreadNotificationWorker.class);
                e a10 = new e.a().e(UnreadNotificationWorker.INPUT_UNWATCH_COUNT, unwatchedCount).f("ts", System.currentTimeMillis()).a();
                qe.k.e(a10, "Builder().putInt(\n      …rentTimeMillis()).build()");
                workManager = this.this$0.getWorkManager();
                workManager.e("unwatchNotification", androidx.work.f.REPLACE, aVar.m(a10).a("unwatchNotification").l(timeInMillis, TimeUnit.MILLISECONDS).b());
            }
            return u.f29813a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
