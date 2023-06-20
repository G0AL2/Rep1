package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import rb.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.1.2 */
/* loaded from: classes3.dex */
public final class c implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f23178a;

    public c(d dVar) {
        this.f23178a = dVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzhj
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        a.b bVar;
        if (this.f23178a.f23179a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("events", b.c(str2));
            bVar = this.f23178a.f23180b;
            bVar.a(2, bundle2);
        }
    }
}
