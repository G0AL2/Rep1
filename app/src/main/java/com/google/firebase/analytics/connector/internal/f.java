package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import rb.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.2 */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final a.b f23184a;

    /* renamed from: b  reason: collision with root package name */
    private final AppMeasurementSdk f23185b;

    /* renamed from: c  reason: collision with root package name */
    private final e f23186c;

    public f(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f23184a = bVar;
        this.f23185b = appMeasurementSdk;
        e eVar = new e(this);
        this.f23186c = eVar;
        appMeasurementSdk.registerOnMeasurementEventListener(eVar);
    }
}
