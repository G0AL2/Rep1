package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdst extends zzcxx {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdlg zze;
    private final zzdip zzf;
    private final zzdcg zzg;
    private final zzddn zzh;
    private final zzcyr zzi;
    private final zzcbb zzj;
    private final zzflf zzk;
    private boolean zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdst(zzcxw zzcxwVar, Context context, zzcli zzcliVar, zzdlg zzdlgVar, zzdip zzdipVar, zzdcg zzdcgVar, zzddn zzddnVar, zzcyr zzcyrVar, zzfbl zzfblVar, zzflf zzflfVar) {
        super(zzcxwVar);
        this.zzl = false;
        this.zzc = context;
        this.zze = zzdlgVar;
        this.zzd = new WeakReference(zzcliVar);
        this.zzf = zzdipVar;
        this.zzg = zzdcgVar;
        this.zzh = zzddnVar;
        this.zzi = zzcyrVar;
        this.zzk = zzflfVar;
        zzcax zzcaxVar = zzfblVar.zzm;
        this.zzj = new zzcbv(zzcaxVar != null ? zzcaxVar.zza : "", zzcaxVar != null ? zzcaxVar.zzb : 1);
    }

    public final void finalize() throws Throwable {
        try {
            final zzcli zzcliVar = (zzcli) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfI)).booleanValue()) {
                if (!this.zzl && zzcliVar != null) {
                    zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdss
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcli.this.destroy();
                        }
                    });
                }
            } else if (zzcliVar != null) {
                zzcliVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzcbb zzc() {
        return this.zzj;
    }

    public final boolean zzd() {
        return this.zzi.zzg();
    }

    public final boolean zze() {
        return this.zzl;
    }

    public final boolean zzf() {
        zzcli zzcliVar = (zzcli) this.zzd.get();
        return (zzcliVar == null || zzcliVar.zzaD()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzg(boolean z10, Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzay)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zzc)) {
                zzcfi.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaz)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzl) {
            zzcfi.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfdc.zzd(10, null, null));
            return false;
        }
        this.zzl = true;
        this.zzf.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            this.zze.zza(z10, activity2, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdlf e10) {
            this.zzg.zze(e10);
            return false;
        }
    }
}
