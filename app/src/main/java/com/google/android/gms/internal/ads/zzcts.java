package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcts implements zzdbt, zzddh, zzdcn, com.google.android.gms.ads.internal.client.zza, zzdcj {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfbx zze;
    private final zzfbl zzf;
    private final zzfie zzg;
    private final zzfcm zzh;
    private final zzaoc zzi;
    private final zzbiy zzj;
    private final zzfhs zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private boolean zzn;
    private final AtomicBoolean zzo = new AtomicBoolean();
    private final zzbja zzp;

    public zzcts(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfbx zzfbxVar, zzfbl zzfblVar, zzfie zzfieVar, zzfcm zzfcmVar, View view, zzcli zzcliVar, zzaoc zzaocVar, zzbiy zzbiyVar, zzbja zzbjaVar, zzfhs zzfhsVar, byte[] bArr) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfbxVar;
        this.zzf = zzfblVar;
        this.zzg = zzfieVar;
        this.zzh = zzfcmVar;
        this.zzi = zzaocVar;
        this.zzl = new WeakReference(view);
        this.zzm = new WeakReference(zzcliVar);
        this.zzj = zzbiyVar;
        this.zzp = zzbjaVar;
        this.zzk = zzfhsVar;
    }

    public static /* synthetic */ void zzf(zzcts zzctsVar) {
        zzctsVar.zzs();
    }

    public final void zzs() {
        int i10;
        String zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcF)).booleanValue() ? this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), null) : null;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzal)).booleanValue() && this.zze.zzb.zzb.zzg) || !((Boolean) zzbjo.zzh.zze()).booleanValue()) {
            zzfcm zzfcmVar = this.zzh;
            zzfie zzfieVar = this.zzg;
            zzfbx zzfbxVar = this.zze;
            zzfbl zzfblVar = this.zzf;
            zzfcmVar.zza(zzfieVar.zzb(zzfbxVar, zzfblVar, false, zzh, null, zzfblVar.zzd));
            return;
        }
        if (((Boolean) zzbjo.zzg.zze()).booleanValue() && ((i10 = this.zzf.zzb) == 1 || i10 == 2 || i10 == 5)) {
            zzcli zzcliVar = (zzcli) this.zzm.get();
        }
        zzfvc.zzr((zzfut) zzfvc.zzo(zzfut.zzv(zzfvc.zzi(null)), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzctr(this, zzh), this.zzb);
    }

    private final void zzt(final int i10, final int i11) {
        View view;
        if (i10 > 0 && ((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctl
                @Override // java.lang.Runnable
                public final void run() {
                    zzcts.this.zzi(i10, i11);
                }
            }, i11, TimeUnit.MILLISECONDS);
        } else {
            zzs();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if ((!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzal)).booleanValue() || !this.zze.zzb.zzb.zzg) && ((Boolean) zzbjo.zzd.zze()).booleanValue()) {
            zzfvc.zzr(zzfvc.zzf(zzfut.zzv(this.zzj.zza()), Throwable.class, new zzfok() { // from class: com.google.android.gms.internal.ads.zzctm
                @Override // com.google.android.gms.internal.ads.zzfok
                public final Object apply(Object obj) {
                    Throwable th = (Throwable) obj;
                    return "failure_click_attok";
                }
            }, zzcfv.zzf), new zzctq(this), this.zzb);
            return;
        }
        zzfcm zzfcmVar = this.zzh;
        zzfie zzfieVar = this.zzg;
        zzfbx zzfbxVar = this.zze;
        zzfbl zzfblVar = this.zzf;
        zzfcmVar.zzc(zzfieVar.zza(zzfbxVar, zzfblVar, zzfblVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzo().zzv(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
        zzfcm zzfcmVar = this.zzh;
        zzfie zzfieVar = this.zzg;
        zzfbx zzfbxVar = this.zze;
        zzfbl zzfblVar = this.zzf;
        zzfcmVar.zza(zzfieVar.zza(zzfbxVar, zzfblVar, zzfblVar.zzj));
    }

    public final /* synthetic */ void zzg() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctp
            @Override // java.lang.Runnable
            public final void run() {
                zzcts.zzf(zzcts.this);
            }
        });
    }

    public final /* synthetic */ void zzh(int i10, int i11) {
        zzt(i10 - 1, i11);
    }

    public final /* synthetic */ void zzi(final int i10, final int i11) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzctn
            @Override // java.lang.Runnable
            public final void run() {
                zzcts.this.zzh(i10, i11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcj
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbo)).booleanValue()) {
            this.zzh.zza(this.zzg.zza(this.zze, this.zzf, zzfie.zzd(2, zzeVar.zza, this.zzf.zzp)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        if (this.zzo.compareAndSet(false, true)) {
            int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcI)).intValue();
            if (intValue > 0) {
                zzt(intValue, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcJ)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcH)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcto
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcts.this.zzg();
                    }
                });
            } else {
                zzs();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final synchronized void zzn() {
        if (this.zzn) {
            ArrayList arrayList = new ArrayList(this.zzf.zzd);
            arrayList.addAll(this.zzf.zzg);
            this.zzh.zza(this.zzg.zzb(this.zze, this.zzf, true, null, null, arrayList));
        } else {
            zzfcm zzfcmVar = this.zzh;
            zzfie zzfieVar = this.zzg;
            zzfbx zzfbxVar = this.zze;
            zzfbl zzfblVar = this.zzf;
            zzfcmVar.zza(zzfieVar.zza(zzfbxVar, zzfblVar, zzfblVar.zzn));
            zzfcm zzfcmVar2 = this.zzh;
            zzfie zzfieVar2 = this.zzg;
            zzfbx zzfbxVar2 = this.zze;
            zzfbl zzfblVar2 = this.zzf;
            zzfcmVar2.zza(zzfieVar2.zza(zzfbxVar2, zzfblVar2, zzfblVar2.zzg));
        }
        this.zzn = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzp(zzcal zzcalVar, String str, String str2) {
        zzfcm zzfcmVar = this.zzh;
        zzfie zzfieVar = this.zzg;
        zzfbl zzfblVar = this.zzf;
        zzfcmVar.zza(zzfieVar.zzc(zzfblVar, zzfblVar.zzi, zzcalVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
        zzfcm zzfcmVar = this.zzh;
        zzfie zzfieVar = this.zzg;
        zzfbx zzfbxVar = this.zze;
        zzfbl zzfblVar = this.zzf;
        zzfcmVar.zza(zzfieVar.zza(zzfbxVar, zzfblVar, zzfblVar.zzh));
    }
}
