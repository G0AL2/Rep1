package com.chartboost.sdk;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Libraries.CBLogging;
import com.chartboost.sdk.Networking.requests.models.MediationModel;
import com.chartboost.sdk.Privacy.model.COPPA;
import com.chartboost.sdk.f;
import com.chartboost.sdk.impl.j0;
import com.chartboost.sdk.impl.l;
import com.chartboost.sdk.impl.o1;
import com.chartboost.sdk.impl.v2;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.security.ProviderInstaller;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final int f13833a;

    /* renamed from: b  reason: collision with root package name */
    boolean f13834b = false;

    /* renamed from: c  reason: collision with root package name */
    Chartboost.CBFramework f13835c = null;

    /* renamed from: d  reason: collision with root package name */
    String f13836d = null;

    /* renamed from: e  reason: collision with root package name */
    MediationModel f13837e = null;

    /* renamed from: f  reason: collision with root package name */
    String f13838f = null;

    /* renamed from: g  reason: collision with root package name */
    CBLogging.Level f13839g = null;

    /* renamed from: h  reason: collision with root package name */
    ChartboostDelegate f13840h = null;

    /* renamed from: i  reason: collision with root package name */
    Context f13841i = null;

    /* renamed from: j  reason: collision with root package name */
    String f13842j = null;

    /* renamed from: k  reason: collision with root package name */
    String f13843k = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(int i10) {
        this.f13833a = i10;
    }

    private void a() {
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this.f13841i) != 0) {
            return;
        }
        try {
            ProviderInstaller.installIfNeeded(this.f13841i);
        } catch (Exception e10) {
            CBLogging.e("ChartboostCommand", e10.toString());
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        ScheduledExecutorService scheduledExecutorService;
        try {
            switch (this.f13833a) {
                case 0:
                    if (f.a() == null) {
                        synchronized (f.class) {
                            if (f.a() == null) {
                                Context context = this.f13841i;
                                if (context == null) {
                                    CBLogging.b("ChartboostCommand", "Context object is null. Please pass a valid activity object");
                                    return;
                                } else if (!a.b(context)) {
                                    CBLogging.b("ChartboostCommand", "Permissions not set correctly");
                                    return;
                                } else {
                                    if (!a.a(this.f13841i)) {
                                        CBLogging.b("ChartboostCommand", "Please add CBImpressionActivity in AndroidManifest.xml following README.md instructions.");
                                    }
                                    if (!TextUtils.isEmpty(this.f13842j) && !TextUtils.isEmpty(this.f13843k)) {
                                        a();
                                        l b10 = l.b();
                                        o1 a10 = o1.a();
                                        Handler handler = b10.f14142a;
                                        ScheduledExecutorService scheduledExecutorService2 = null;
                                        try {
                                            scheduledExecutorService = (ScheduledExecutorService) a10.a(j0.a());
                                        } catch (Throwable th) {
                                            th = th;
                                        }
                                        try {
                                            f fVar = new f(this.f13841i, this.f13842j, this.f13843k, b10, scheduledExecutorService, handler, (ExecutorService) a10.a(j0.a(4)));
                                            f.a(fVar);
                                            fVar.f13851h.b();
                                            fVar.c(new f.b(3));
                                        } catch (Throwable th2) {
                                            th = th2;
                                            scheduledExecutorService2 = scheduledExecutorService;
                                            if (scheduledExecutorService2 != null) {
                                                scheduledExecutorService2.shutdown();
                                            }
                                            CBLogging.a("ChartboostCommand", "Unable to start threads", th);
                                            return;
                                        }
                                    }
                                    CBLogging.b("ChartboostCommand", "AppId or AppSignature is null. Please pass a valid id's");
                                    return;
                                }
                            }
                        }
                    } else {
                        com.chartboost.sdk.impl.a aVar = g.f13879d;
                        if (aVar != null) {
                            aVar.didInitialize();
                        }
                        f a11 = f.a();
                        Objects.requireNonNull(a11);
                        a11.c(new f.b(3));
                    }
                    if (f.a(this.f13841i).a(COPPA.COPPA_STANDARD) != null || f.a().l()) {
                        return;
                    }
                    Log.w("ChartboostCommand", "COPPA is not set. If this app is child directed, please use ´addDataUseConsent(android.content.Context, com.chartboost.sdk.Privacy.model.COPPA)´ to set the correct value.");
                    return;
                case 1:
                    g.f13890o = this.f13834b;
                    return;
                case 2:
                default:
                    return;
                case 3:
                    g.f13884i = this.f13837e;
                    return;
                case 4:
                    Chartboost.CBFramework cBFramework = this.f13835c;
                    if (cBFramework == null) {
                        CBLogging.b("ChartboostCommand", "Pass a valid CBFramework enum value");
                        return;
                    }
                    g.f13880e = cBFramework;
                    String str = this.f13836d;
                    g.f13881f = str;
                    g.f13882g = String.format("%s %s", cBFramework, str);
                    return;
                case 5:
                    a.a(this.f13836d);
                    return;
                case 6:
                    g.f13877b = this.f13838f;
                    return;
                case 7:
                    if (a.a()) {
                        CBLogging.f13645a = this.f13839g;
                        return;
                    }
                    return;
                case 8:
                    ChartboostDelegate chartboostDelegate = this.f13840h;
                    g.f13879d = chartboostDelegate;
                    v2.a("SdkSettings.assignDelegate", chartboostDelegate);
                    return;
            }
        } catch (Exception e10) {
            CBLogging.b("ChartboostCommand", "run (" + this.f13833a + ")" + e10.toString());
        }
    }
}
