package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.android.gms.measurement.internal.zzio;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.2 */
/* loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* renamed from: c  reason: collision with root package name */
    private static volatile FirebaseAnalytics f23166c;

    /* renamed from: a  reason: collision with root package name */
    private final zzee f23167a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f23168b;

    public FirebaseAnalytics(zzee zzeeVar) {
        Preconditions.checkNotNull(zzeeVar);
        this.f23167a = zzeeVar;
    }

    @Keep
    public static FirebaseAnalytics getInstance(Context context) {
        if (f23166c == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f23166c == null) {
                    f23166c = new FirebaseAnalytics(zzee.zzg(context, null, null, null, null));
                }
            }
        }
        return f23166c;
    }

    @Keep
    public static zzio getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzee zzg = zzee.zzg(context, null, null, null, bundle);
        if (zzg == null) {
            return null;
        }
        return new c(zzg);
    }

    public Task<String> a() {
        ExecutorService executorService;
        try {
            synchronized (FirebaseAnalytics.class) {
                if (this.f23168b == null) {
                    this.f23168b = new a(this, 0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                }
                executorService = this.f23168b;
            }
            return Tasks.call(executorService, new b(this));
        } catch (RuntimeException e10) {
            this.f23167a.zzA(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e10);
        }
    }

    public void b(String str, Bundle bundle) {
        this.f23167a.zzx(str, bundle);
    }

    public void c() {
        this.f23167a.zzC();
    }

    public void d(boolean z10) {
        this.f23167a.zzK(Boolean.valueOf(z10));
    }

    public void e(Bundle bundle) {
        this.f23167a.zzI(bundle);
    }

    public void f(long j10) {
        this.f23167a.zzL(j10);
    }

    public void g(String str) {
        this.f23167a.zzM(str);
    }

    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) Tasks.await(com.google.firebase.installations.c.n().getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            throw new IllegalStateException(e10);
        } catch (ExecutionException e11) {
            throw new IllegalStateException(e11.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public void h(String str, String str2) {
        this.f23167a.zzN(null, str, str2, false);
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(Activity activity, String str, String str2) {
        this.f23167a.zzG(activity, str, str2);
    }
}
