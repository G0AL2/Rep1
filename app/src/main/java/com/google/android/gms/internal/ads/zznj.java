package com.google.android.gms.internal.ads;

import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zznj {
    private final Handler zza;
    private final zznk zzb;

    public zznj(Handler handler, zznk zznkVar) {
        this.zza = zznkVar == null ? null : handler;
        this.zzb = zznkVar;
    }

    public final void zza(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzmz
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzh(exc);
                }
            });
        }
    }

    public final void zzb(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznf
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzi(exc);
                }
            });
        }
    }

    public final void zzc(final String str, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzne
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzj(str, j10, j11);
                }
            });
        }
    }

    public final void zzd(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzng
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzk(str);
                }
            });
        }
    }

    public final void zze(final zzgl zzglVar) {
        zzglVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzna
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzl(zzglVar);
                }
            });
        }
    }

    public final void zzf(final zzgl zzglVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznb
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzm(zzglVar);
                }
            });
        }
    }

    public final void zzg(final zzad zzadVar, final zzgm zzgmVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznh
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzn(zzadVar, zzgmVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(Exception exc) {
        zznk zznkVar = this.zzb;
        int i10 = zzeg.zza;
        zznkVar.zzc(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzi(Exception exc) {
        zznk zznkVar = this.zzb;
        int i10 = zzeg.zza;
        zznkVar.zzj(exc);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(String str, long j10, long j11) {
        zznk zznkVar = this.zzb;
        int i10 = zzeg.zza;
        zznkVar.zzd(str, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzk(String str) {
        zznk zznkVar = this.zzb;
        int i10 = zzeg.zza;
        zznkVar.zze(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzl(zzgl zzglVar) {
        zzglVar.zza();
        zznk zznkVar = this.zzb;
        int i10 = zzeg.zza;
        zznkVar.zzf(zzglVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(zzgl zzglVar) {
        zznk zznkVar = this.zzb;
        int i10 = zzeg.zza;
        zznkVar.zzg(zzglVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(zzad zzadVar, zzgm zzgmVar) {
        int i10 = zzeg.zza;
        this.zzb.zzh(zzadVar, zzgmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(long j10) {
        zznk zznkVar = this.zzb;
        int i10 = zzeg.zza;
        zznkVar.zzi(j10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(boolean z10) {
        zznk zznkVar = this.zzb;
        int i10 = zzeg.zza;
        zznkVar.zzn(z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzq(int i10, long j10, long j11) {
        zznk zznkVar = this.zzb;
        int i11 = zzeg.zza;
        zznkVar.zzk(i10, j10, j11);
    }

    public final void zzr(final long j10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznc
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzo(j10);
                }
            });
        }
    }

    public final void zzs(final boolean z10) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zznd
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzp(z10);
                }
            });
        }
    }

    public final void zzt(final int i10, final long j10, final long j11) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzni
                @Override // java.lang.Runnable
                public final void run() {
                    zznj.this.zzq(i10, j10, j11);
                }
            });
        }
    }
}
