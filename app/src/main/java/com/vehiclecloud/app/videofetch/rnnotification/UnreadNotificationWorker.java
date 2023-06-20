package com.vehiclecloud.app.videofetch.rnnotification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.i;
import androidx.core.app.l;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.k;
import downloader.video.download.free.R;
import ee.u;
import free.files.downloader.save.video.manager.MainActivity;
import qe.g;
import qe.k;

/* compiled from: UnreadNotificationWorker.kt */
/* loaded from: classes3.dex */
public final class UnreadNotificationWorker extends Worker {
    public static final Companion Companion = new Companion(null);
    public static final String INPUT_UNWATCH_COUNT = "unwatchCount";
    private static final String KEY_ID = "workerId";
    private static final Bundle NOTIFICATION_ANALYTICS_PARAMS;
    private static final String SHARED_PREFERENCE = "com.vehiclecloud.app.videofetch.UNREAD_NOTIFICATION";

    /* compiled from: UnreadNotificationWorker.kt */
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    static {
        Bundle bundle = new Bundle();
        bundle.putString("title", "");
        bundle.putString("body", "");
        bundle.putString("type", "");
        bundle.putString("uri", "");
        NOTIFICATION_ANALYTICS_PARAMS = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnreadNotificationWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        k.f(context, "appContext");
        k.f(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public k.a doWork() {
        int h10 = getInputData().h(INPUT_UNWATCH_COUNT, 0);
        timber.log.a.f37331a.d("doWork unread count: %d, id: %s", Integer.valueOf(h10), getId());
        if (h10 == 0) {
            k.a c10 = k.a.c();
            qe.k.e(c10, "success()");
            return c10;
        }
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences(SHARED_PREFERENCE, 0);
        if (qe.k.a(sharedPreferences.getString("workerId", null), getId().toString())) {
            k.a c11 = k.a.c();
            qe.k.e(c11, "success()");
            return c11;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString("workerId", getId().toString());
        edit.apply();
        i.e eVar = new i.e(getApplicationContext(), RNNotificationModule.PUSH_CHANNEL);
        eVar.B(getApplicationContext().getString(R.string.app_name));
        eVar.k(getApplicationContext().getResources().getQuantityString(R.plurals.push_unwatch_hint_title, h10, Integer.valueOf(h10)));
        eVar.j(getApplicationContext().getString(R.string.push_unwatch_hint_message));
        eVar.w(true);
        eVar.E(System.currentTimeMillis());
        eVar.x(R.mipmap.ic_notification);
        eVar.h(16750848);
        Context applicationContext = getApplicationContext();
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra(RNNotificationModule.EXTRA_NOTIFICATION, NOTIFICATION_ANALYTICS_PARAMS);
        intent.putExtra("android.intent.extra.TEXT", "vc://files");
        u uVar = u.f29813a;
        eVar.i(PendingIntent.getActivity(applicationContext, 0, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728));
        Notification b10 = eVar.b();
        qe.k.e(b10, "Builder(applicationConte…                }.build()");
        l f10 = l.f(getApplicationContext());
        qe.k.e(f10, "from(applicationContext)");
        f10.h(-999, b10);
        k.a c12 = k.a.c();
        qe.k.e(c12, "success()");
        return c12;
    }
}
