package androidx.work.impl.background.systemjob;

import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.c;
import androidx.work.l;
import androidx.work.m;
import o1.u;

/* compiled from: SystemJobInfoConverter.java */
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
class a {

    /* renamed from: b  reason: collision with root package name */
    private static final String f4533b = l.i("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    private final ComponentName f4534a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SystemJobInfoConverter.java */
    /* renamed from: androidx.work.impl.background.systemjob.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0084a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f4535a;

        static {
            int[] iArr = new int[m.values().length];
            f4535a = iArr;
            try {
                iArr[m.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4535a[m.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4535a[m.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4535a[m.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4535a[m.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.f4534a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    private static JobInfo.TriggerContentUri b(c.C0082c c0082c) {
        return new JobInfo.TriggerContentUri(c0082c.a(), c0082c.b() ? 1 : 0);
    }

    static int c(m mVar) {
        int i10 = C0084a.f4535a[mVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
                            return 4;
                        }
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        return 3;
                    }
                    l e10 = l.e();
                    String str = f4533b;
                    e10.a(str, "API version too low. Cannot convert network type value " + mVar);
                    return 1;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    static void d(JobInfo.Builder builder, m mVar) {
        if (Build.VERSION.SDK_INT >= 30 && mVar == m.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(c(mVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JobInfo a(u uVar, int i10) {
        c cVar = uVar.f34914j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", uVar.f34905a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", uVar.f());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", uVar.j());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f4534a).setRequiresCharging(cVar.g()).setRequiresDeviceIdle(cVar.h()).setExtras(persistableBundle);
        d(extras, cVar.d());
        if (!cVar.h()) {
            extras.setBackoffCriteria(uVar.f34917m, uVar.f34916l == androidx.work.a.LINEAR ? 0 : 1);
        }
        long max = Math.max(uVar.c() - System.currentTimeMillis(), 0L);
        int i11 = Build.VERSION.SDK_INT;
        if (i11 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!uVar.f34921q) {
            extras.setImportantWhileForeground(true);
        }
        if (i11 >= 24 && cVar.e()) {
            for (c.C0082c c0082c : cVar.c()) {
                extras.addTriggerContentUri(b(c0082c));
            }
            extras.setTriggerContentUpdateDelay(cVar.b());
            extras.setTriggerContentMaxDelay(cVar.a());
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            extras.setRequiresBatteryNotLow(cVar.f());
            extras.setRequiresStorageNotLow(cVar.i());
        }
        boolean z10 = uVar.f34915k > 0;
        boolean z11 = max > 0;
        if (i12 >= 31 && uVar.f34921q && !z10 && !z11) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
