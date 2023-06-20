package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzig implements Runnable {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzin zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzig(zzin zzinVar, Boolean bool) {
        this.zzb = zzinVar;
        this.zza = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzad(this.zza, true);
    }
}
