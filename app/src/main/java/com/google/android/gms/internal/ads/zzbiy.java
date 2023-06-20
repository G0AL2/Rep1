package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbiy {
    private MotionEvent zza = MotionEvent.obtain(0, 0, 1, 0.0f, 0.0f, 0);
    private MotionEvent zzb = MotionEvent.obtain(0, 0, 0, 0.0f, 0.0f, 0);
    private final Context zzc;
    private final ScheduledExecutorService zzd;
    private final zzfhs zze;
    private final zzbja zzf;

    public zzbiy(Context context, ScheduledExecutorService scheduledExecutorService, zzbja zzbjaVar, zzfhs zzfhsVar, byte[] bArr) {
        this.zzc = context;
        this.zzd = scheduledExecutorService;
        this.zzf = zzbjaVar;
        this.zze = zzfhsVar;
    }

    public final zzfvl zza() {
        return (zzfut) zzfvc.zzo(zzfut.zzv(zzfvc.zzi(null)), ((Long) zzbjo.zzc.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd);
    }

    public final void zzb(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > this.zza.getEventTime()) {
            this.zza = MotionEvent.obtain(motionEvent);
        } else if (motionEvent.getAction() != 0 || motionEvent.getEventTime() <= this.zzb.getEventTime()) {
        } else {
            this.zzb = MotionEvent.obtain(motionEvent);
        }
    }
}
