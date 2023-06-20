package io.invertase.firebase.analytics;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: UniversalFirebaseAnalyticsModule.java */
/* loaded from: classes3.dex */
public class s extends io.invertase.firebase.common.c {
    public s(Context context, String str) {
        super(context, str);
    }

    public static /* synthetic */ Void f(s sVar, String str, String str2) {
        return sVar.v(str, str2);
    }

    public static /* synthetic */ Void g(s sVar, long j10) {
        return sVar.s(j10);
    }

    public static /* synthetic */ Void h(s sVar, Bundle bundle) {
        return sVar.u(bundle);
    }

    public static /* synthetic */ Void i(s sVar, String str, Bundle bundle) {
        return sVar.o(str, bundle);
    }

    public static /* synthetic */ Void j(s sVar, String str) {
        return sVar.t(str);
    }

    public static /* synthetic */ Void k(s sVar) {
        return sVar.p();
    }

    public static /* synthetic */ Void l(s sVar, Boolean bool) {
        return sVar.q(bool);
    }

    public static /* synthetic */ Void m(s sVar, Bundle bundle) {
        return sVar.r(bundle);
    }

    public /* synthetic */ Void o(String str, Bundle bundle) throws Exception {
        FirebaseAnalytics.getInstance(c()).b(str, bundle);
        return null;
    }

    public /* synthetic */ Void p() throws Exception {
        FirebaseAnalytics.getInstance(c()).c();
        return null;
    }

    public /* synthetic */ Void q(Boolean bool) throws Exception {
        FirebaseAnalytics.getInstance(c()).d(bool.booleanValue());
        return null;
    }

    public /* synthetic */ Void r(Bundle bundle) throws Exception {
        FirebaseAnalytics.getInstance(c()).e(bundle);
        return null;
    }

    public /* synthetic */ Void s(long j10) throws Exception {
        FirebaseAnalytics.getInstance(c()).f(j10);
        return null;
    }

    public /* synthetic */ Void t(String str) throws Exception {
        FirebaseAnalytics.getInstance(c()).g(str);
        return null;
    }

    public /* synthetic */ Void u(Bundle bundle) throws Exception {
        Set<String> keySet = bundle.keySet();
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(c());
        for (String str : keySet) {
            firebaseAnalytics.h(str, (String) bundle.get(str));
        }
        return null;
    }

    public /* synthetic */ Void v(String str, String str2) throws Exception {
        FirebaseAnalytics.getInstance(c()).h(str, str2);
        return null;
    }

    public Task<Void> A(final long j10) {
        return Tasks.call(new Callable() { // from class: io.invertase.firebase.analytics.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.g(s.this, j10);
            }
        });
    }

    public Task<Void> B(final String str) {
        return Tasks.call(new Callable() { // from class: io.invertase.firebase.analytics.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.j(s.this, str);
            }
        });
    }

    public Task<Void> C(final Bundle bundle) {
        return Tasks.call(new Callable() { // from class: io.invertase.firebase.analytics.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.h(s.this, bundle);
            }
        });
    }

    public Task<Void> D(final String str, final String str2) {
        return Tasks.call(new Callable() { // from class: io.invertase.firebase.analytics.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.f(s.this, str, str2);
            }
        });
    }

    public Task<String> n() {
        return FirebaseAnalytics.getInstance(c()).a();
    }

    public Task<Void> w(final String str, final Bundle bundle) {
        return Tasks.call(new Callable() { // from class: io.invertase.firebase.analytics.q
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.i(s.this, str, bundle);
            }
        });
    }

    public Task<Void> x() {
        return Tasks.call(new Callable() { // from class: io.invertase.firebase.analytics.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.k(s.this);
            }
        });
    }

    public Task<Void> y(final Boolean bool) {
        return Tasks.call(new Callable() { // from class: io.invertase.firebase.analytics.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.l(s.this, bool);
            }
        });
    }

    public Task<Void> z(final Bundle bundle) {
        return Tasks.call(new Callable() { // from class: io.invertase.firebase.analytics.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return s.m(s.this, bundle);
            }
        });
    }
}
