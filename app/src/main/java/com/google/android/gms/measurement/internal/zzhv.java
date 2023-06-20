package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzhv implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzin zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhv(zzin zzinVar, long j10) {
        this.zzb = zzinVar;
        this.zza = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzM(this.zza, true);
        this.zzb.zzs.zzt().zzu(new AtomicReference());
    }
}
