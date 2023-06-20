package com.google.firebase.analytics;

import com.google.android.gms.internal.measurement.zzee;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.2 */
/* loaded from: classes3.dex */
public final class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FirebaseAnalytics f23169a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(FirebaseAnalytics firebaseAnalytics) {
        this.f23169a = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzee zzeeVar;
        zzeeVar = this.f23169a.f23167a;
        return zzeeVar.zzk();
    }
}
