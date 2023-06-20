package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.Set;
import rb.a;

/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.2 */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    final Set f23179a;

    /* renamed from: b  reason: collision with root package name */
    private final a.b f23180b;

    /* renamed from: c  reason: collision with root package name */
    private final AppMeasurementSdk f23181c;

    /* renamed from: d  reason: collision with root package name */
    private final c f23182d;

    public d(AppMeasurementSdk appMeasurementSdk, a.b bVar) {
        this.f23180b = bVar;
        this.f23181c = appMeasurementSdk;
        c cVar = new c(this);
        this.f23182d = cVar;
        appMeasurementSdk.registerOnMeasurementEventListener(cVar);
        this.f23179a = new HashSet();
    }
}
