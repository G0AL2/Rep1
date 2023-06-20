package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a0;
import androidx.work.impl.background.systemjob.b;
import androidx.work.impl.e0;
import androidx.work.l;
import androidx.work.u;
import h0.a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o1.r;
import o1.u;
import o1.v;
import p1.n;
import p1.o;

/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private static final String f4656e = l.i("ForceStopRunnable");

    /* renamed from: f  reason: collision with root package name */
    private static final long f4657f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a  reason: collision with root package name */
    private final Context f4658a;

    /* renamed from: b  reason: collision with root package name */
    private final e0 f4659b;

    /* renamed from: c  reason: collision with root package name */
    private final n f4660c;

    /* renamed from: d  reason: collision with root package name */
    private int f4661d = 0;

    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private static final String f4662a = l.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            l.e().j(f4662a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, e0 e0Var) {
        this.f4658a = context.getApplicationContext();
        this.f4659b = e0Var;
        this.f4660c = e0Var.o();
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    @SuppressLint({"ClassVerificationFailure"})
    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i10 = Build.VERSION.SDK_INT;
        PendingIntent d10 = d(context, i10 >= 31 ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f4657f;
        if (alarmManager != null) {
            if (i10 >= 19) {
                alarmManager.setExact(0, currentTimeMillis, d10);
            } else {
                alarmManager.set(0, currentTimeMillis, d10);
            }
        }
    }

    public boolean a() {
        boolean i10 = Build.VERSION.SDK_INT >= 23 ? b.i(this.f4658a, this.f4659b) : false;
        WorkDatabase s10 = this.f4659b.s();
        v h10 = s10.h();
        r g10 = s10.g();
        s10.beginTransaction();
        try {
            List<u> s11 = h10.s();
            boolean z10 = (s11 == null || s11.isEmpty()) ? false : true;
            if (z10) {
                for (u uVar : s11) {
                    h10.q(u.a.ENQUEUED, uVar.f34905a);
                    h10.n(uVar.f34905a, -1L);
                }
            }
            g10.b();
            s10.setTransactionSuccessful();
            return z10 || i10;
        } finally {
            s10.endTransaction();
        }
    }

    public void b() {
        boolean a10 = a();
        if (h()) {
            l.e().a(f4656e, "Rescheduling Workers.");
            this.f4659b.w();
            this.f4659b.o().e(false);
        } else if (e()) {
            l.e().a(f4656e, "Application was force-stopped, rescheduling.");
            this.f4659b.w();
            this.f4660c.d(System.currentTimeMillis());
        } else if (a10) {
            l.e().a(f4656e, "Found unfinished work, scheduling it.");
            androidx.work.impl.u.b(this.f4659b.l(), this.f4659b.s(), this.f4659b.q());
        }
    }

    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        try {
            int i10 = Build.VERSION.SDK_INT;
            PendingIntent d10 = d(this.f4658a, i10 >= 31 ? 570425344 : 536870912);
            if (i10 >= 30) {
                if (d10 != null) {
                    d10.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f4658a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long a10 = this.f4660c.a();
                    for (int i11 = 0; i11 < historicalProcessExitReasons.size(); i11++) {
                        ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i11);
                        if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= a10) {
                            return true;
                        }
                    }
                }
            } else if (d10 == null) {
                g(this.f4658a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e10) {
            l.e().l(f4656e, "Ignoring exception", e10);
            return true;
        }
    }

    public boolean f() {
        androidx.work.b l10 = this.f4659b.l();
        if (TextUtils.isEmpty(l10.c())) {
            l.e().a(f4656e, "The default process name was not specified.");
            return true;
        }
        boolean b10 = o.b(this.f4658a, l10);
        l e10 = l.e();
        String str = f4656e;
        e10.a(str, "Is default app process = " + b10);
        return b10;
    }

    public boolean h() {
        return this.f4659b.o().b();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        try {
            if (f()) {
                while (true) {
                    try {
                        a0.d(this.f4658a);
                        l.e().a(f4656e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException e10) {
                            i10 = this.f4661d + 1;
                            this.f4661d = i10;
                            if (i10 >= 3) {
                                l e11 = l.e();
                                String str = f4656e;
                                e11.d(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                                IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e10);
                                a<Throwable> e12 = this.f4659b.l().e();
                                if (e12 != null) {
                                    l.e().b(str, "Routing exception to the specified exception handler", illegalStateException);
                                    e12.accept(illegalStateException);
                                } else {
                                    throw illegalStateException;
                                }
                            } else {
                                l e13 = l.e();
                                String str2 = f4656e;
                                e13.b(str2, "Retrying after " + (i10 * 300), e10);
                                i(((long) this.f4661d) * 300);
                            }
                        }
                        l e132 = l.e();
                        String str22 = f4656e;
                        e132.b(str22, "Retrying after " + (i10 * 300), e10);
                        i(((long) this.f4661d) * 300);
                    } catch (SQLiteException e14) {
                        l.e().c(f4656e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e14);
                        a<Throwable> e15 = this.f4659b.l().e();
                        if (e15 != null) {
                            e15.accept(illegalStateException2);
                        } else {
                            throw illegalStateException2;
                        }
                    }
                }
            }
        } finally {
            this.f4659b.v();
        }
    }
}
