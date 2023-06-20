package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbqc implements Runnable {
    final /* synthetic */ zzbqf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbqc(zzbqf zzbqfVar) {
        this.zza = zzbqfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbqf.zzc(this.zza);
    }
}
