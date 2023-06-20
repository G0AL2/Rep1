package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcht implements Runnable {
    private final zzchf zza;
    private boolean zzb = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcht(zzchf zzchfVar) {
        this.zza = zzchfVar;
    }

    private final void zzc() {
        zzfnw zzfnwVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfnwVar.removeCallbacks(this);
        zzfnwVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzs();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzs();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
