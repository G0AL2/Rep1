package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzxp {
    private final Handler zza;
    private final zzxq zzb;

    public zzxp(Handler handler, zzxq zzxqVar) {
        this.zza = zzxqVar == null ? null : handler;
        this.zzb = zzxqVar;
    }

    public final void zza(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxl
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzg(str, j10, j11);
                }
            });
        }
    }

    public final void zzb(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxo
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzh(str);
                }
            });
        }
    }

    public final void zzc(final zzgl zzglVar) {
        zzglVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxk
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzi(zzglVar);
                }
            });
        }
    }

    public final void zzd(final int i10, final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxf
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzj(i10, j10);
                }
            });
        }
    }

    public final void zze(final zzgl zzglVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxj
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzk(zzglVar);
                }
            });
        }
    }

    public final void zzf(final zzad zzadVar, final zzgm zzgmVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxm
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzl(zzadVar, zzgmVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(String str, long j10, long j11) {
        zzxq zzxqVar = this.zzb;
        int i10 = zzeg.zza;
        zzxqVar.zzp(str, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str) {
        zzxq zzxqVar = this.zzb;
        int i10 = zzeg.zza;
        zzxqVar.zzq(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(zzgl zzglVar) {
        zzglVar.zza();
        zzxq zzxqVar = this.zzb;
        int i10 = zzeg.zza;
        zzxqVar.zzr(zzglVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(int i10, long j10) {
        zzxq zzxqVar = this.zzb;
        int i11 = zzeg.zza;
        zzxqVar.zzl(i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(zzgl zzglVar) {
        zzxq zzxqVar = this.zzb;
        int i10 = zzeg.zza;
        zzxqVar.zzs(zzglVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzad zzadVar, zzgm zzgmVar) {
        int i10 = zzeg.zza;
        this.zzb.zzu(zzadVar, zzgmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(Object obj, long j10) {
        zzxq zzxqVar = this.zzb;
        int i10 = zzeg.zza;
        zzxqVar.zzm(obj, j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(long j10, int i10) {
        zzxq zzxqVar = this.zzb;
        int i11 = zzeg.zza;
        zzxqVar.zzt(j10, i10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(Exception exc) {
        zzxq zzxqVar = this.zzb;
        int i10 = zzeg.zza;
        zzxqVar.zzo(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(zzcv zzcvVar) {
        zzxq zzxqVar = this.zzb;
        int i10 = zzeg.zza;
        zzxqVar.zzv(zzcvVar);
    }

    public final void zzq(final Object obj) {
        if (this.zza != null) {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxg
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzm(obj, elapsedRealtime);
                }
            });
        }
    }

    public final void zzr(final long j10, final int i10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxi
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzn(j10, i10);
                }
            });
        }
    }

    public final void zzs(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxh
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzo(exc);
                }
            });
        }
    }

    public final void zzt(final zzcv zzcvVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxn
                @Override // java.lang.Runnable
                public final void run() {
                    zzxp.this.zzp(zzcvVar);
                }
            });
        }
    }
}
