package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzhq implements Runnable {
    final /* synthetic */ zzin zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhq(zzin zzinVar) {
        this.zza = zzinVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb.zzb();
    }
}
