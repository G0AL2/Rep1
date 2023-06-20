package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import rb.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.2 */
/* loaded from: classes3.dex */
public final class e implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f23183a;

    public e(f fVar) {
        this.f23183a = fVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzhj
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        a.b bVar;
        if (str == null || str.equals(AppMeasurement.CRASH_ORIGIN) || !b.h(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        bVar = this.f23183a.f23184a;
        bVar.a(3, bundle2);
    }
}
