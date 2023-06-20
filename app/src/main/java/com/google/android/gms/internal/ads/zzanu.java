package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzanu implements Runnable {
    final /* synthetic */ zzanv zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzanu(zzanv zzanvVar) {
        this.zza = zzanvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z10;
        zzfku zzfkuVar;
        Object obj2;
        obj = this.zza.zzm;
        synchronized (obj) {
            z10 = this.zza.zzn;
            if (z10) {
                return;
            }
            this.zza.zzn = true;
            try {
                zzanv.zzj(this.zza);
            } catch (Exception e10) {
                zzfkuVar = this.zza.zzh;
                zzfkuVar.zzc(2023, -1L, e10);
            }
            obj2 = this.zza.zzm;
            synchronized (obj2) {
                this.zza.zzn = false;
            }
        }
    }
}
