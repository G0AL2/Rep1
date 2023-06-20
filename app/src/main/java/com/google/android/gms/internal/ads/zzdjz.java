package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdjz extends zzcxx {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdip zze;
    private final zzdlg zzf;
    private final zzcyr zzg;
    private final zzflf zzh;
    private final zzdcg zzi;
    private boolean zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdjz(zzcxw zzcxwVar, Context context, zzcli zzcliVar, zzdip zzdipVar, zzdlg zzdlgVar, zzcyr zzcyrVar, zzflf zzflfVar, zzdcg zzdcgVar) {
        super(zzcxwVar);
        this.zzj = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcliVar);
        this.zze = zzdipVar;
        this.zzf = zzdlgVar;
        this.zzg = zzcyrVar;
        this.zzh = zzflfVar;
        this.zzi = zzdcgVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcli zzcliVar = (zzcli) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfI)).booleanValue()) {
                if (!this.zzj && zzcliVar != null) {
                    zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjy
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

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z10, Activity activity) {
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzay)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zzc)) {
                zzcfi.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaz)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzj) {
            zzcfi.zzj("The interstitial ad has been showed.");
            this.zzi.zza(zzfdc.zzd(10, null, null));
        }
        Activity activity2 = activity;
        if (!this.zzj) {
            if (activity == null) {
                activity2 = this.zzc;
            }
            try {
                this.zzf.zza(z10, activity2, this.zzi);
                this.zze.zza();
                this.zzj = true;
                return true;
            } catch (zzdlf e10) {
                this.zzi.zze(e10);
            }
        }
        return false;
    }
}
