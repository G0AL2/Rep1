package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzgh implements Runnable {
    final /* synthetic */ zzhl zza;
    final /* synthetic */ zzgi zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgh(zzgi zzgiVar, zzhl zzhlVar) {
        this.zzb = zzgiVar;
        this.zza = zzhlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzgi.zzA(this.zzb, this.zza);
        this.zzb.zzH(this.zza.zzg);
    }
}
