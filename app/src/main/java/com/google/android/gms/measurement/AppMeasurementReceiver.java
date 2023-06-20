package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.zzfr;
import s0.a;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class AppMeasurementReceiver extends a implements zzfr.zza {
    private zzfr zza;

    public BroadcastReceiver.PendingResult doGoAsync() {
        return goAsync();
    }

    @Override // com.google.android.gms.measurement.internal.zzfr.zza
    public void doStartService(Context context, Intent intent) {
        a.startWakefulService(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.zza == null) {
            this.zza = new zzfr(this);
        }
        this.zza.zza(context, intent);
    }
}
