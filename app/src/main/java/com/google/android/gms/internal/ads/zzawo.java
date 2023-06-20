package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawo implements Runnable {
    final /* synthetic */ zzawv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzawo(zzawv zzawvVar) {
        this.zza = zzawvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzawv.zzp(this.zza);
    }
}
