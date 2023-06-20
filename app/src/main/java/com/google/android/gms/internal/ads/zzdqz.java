package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdqz {
    private final zzfcd zza;
    private final Executor zzb;
    private final zzdtp zzc;
    private final zzdsk zzd;
    private final Context zze;
    private final zzdwh zzf;
    private final zzfgp zzg;
    private final zzfii zzh;
    private final zzees zzi;

    public zzdqz(zzfcd zzfcdVar, Executor executor, zzdtp zzdtpVar, Context context, zzdwh zzdwhVar, zzfgp zzfgpVar, zzfii zzfiiVar, zzees zzeesVar, zzdsk zzdskVar) {
        this.zza = zzfcdVar;
        this.zzb = executor;
        this.zzc = zzdtpVar;
        this.zze = context;
        this.zzf = zzdwhVar;
        this.zzg = zzfgpVar;
        this.zzh = zzfiiVar;
        this.zzi = zzeesVar;
        this.zzd = zzdskVar;
    }

    private final void zzh(zzcli zzcliVar) {
        zzi(zzcliVar);
        zzcliVar.zzaf("/video", zzbol.zzl);
        zzcliVar.zzaf("/videoMeta", zzbol.zzm);
        zzcliVar.zzaf("/precache", new zzcjv());
        zzcliVar.zzaf("/delayPageLoaded", zzbol.zzp);
        zzcliVar.zzaf("/instrument", zzbol.zzn);
        zzcliVar.zzaf("/log", zzbol.zzg);
        zzcliVar.zzaf("/click", zzbol.zza(null));
        if (this.zza.zzb != null) {
            zzcliVar.zzP().zzC(true);
            zzcliVar.zzaf("/open", new zzbox(null, null, null, null, null));
        } else {
            zzcliVar.zzP().zzC(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(zzcliVar.getContext())) {
            zzcliVar.zzaf("/logScionEvent", new zzbos(zzcliVar.getContext()));
        }
    }

    private static final void zzi(zzcli zzcliVar) {
        zzcliVar.zzaf("/videoClicked", zzbol.zzh);
        zzcliVar.zzP().zzE(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcP)).booleanValue()) {
            zzcliVar.zzaf("/getNativeAdViewSignals", zzbol.zzs);
        }
        zzcliVar.zzaf("/getNativeClickMeta", zzbol.zzt);
    }

    public final zzfvl zza(final JSONObject jSONObject) {
        return zzfvc.zzn(zzfvc.zzn(zzfvc.zzi(null), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzdqp
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzdqz.this.zze(obj);
            }
        }, this.zzb), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzdqq
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzdqz.this.zzc(jSONObject, (zzcli) obj);
            }
        }, this.zzb);
    }

    public final zzfvl zzb(final String str, final String str2, final zzfbl zzfblVar, final zzfbo zzfboVar, final com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzfvc.zzn(zzfvc.zzi(null), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzdqs
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzdqz.this.zzd(zzqVar, zzfblVar, zzfboVar, str, str2, obj);
            }
        }, this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(JSONObject jSONObject, final zzcli zzcliVar) throws Exception {
        final zzcfz zza = zzcfz.zza(zzcliVar);
        if (this.zza.zzb != null) {
            zzcliVar.zzai(zzcmx.zzd());
        } else {
            zzcliVar.zzai(zzcmx.zze());
        }
        zzcliVar.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzdqo
            @Override // com.google.android.gms.internal.ads.zzcmt
            public final void zza(boolean z10) {
                zzdqz.this.zzf(zzcliVar, zza, z10);
            }
        });
        zzcliVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzd(com.google.android.gms.ads.internal.client.zzq zzqVar, zzfbl zzfblVar, zzfbo zzfboVar, String str, String str2, Object obj) throws Exception {
        final zzcli zza = this.zzc.zza(zzqVar, zzfblVar, zzfboVar);
        final zzcfz zza2 = zzcfz.zza(zza);
        if (this.zza.zzb != null) {
            zzh(zza);
            zza.zzai(zzcmx.zzd());
        } else {
            zzdsh zzb = this.zzd.zzb();
            zza.zzP().zzL(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzi, this.zzh, this.zzf, this.zzg, null, zzb);
            zzi(zza);
        }
        zza.zzP().zzz(new zzcmt() { // from class: com.google.android.gms.internal.ads.zzdqt
            @Override // com.google.android.gms.internal.ads.zzcmt
            public final void zza(boolean z10) {
                zzdqz.this.zzg(zza, zza2, z10);
            }
        });
        zza.zzad(str, str2, null);
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zze(Object obj) throws Exception {
        zzcli zza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        final zzcfz zza2 = zzcfz.zza(zza);
        zzh(zza);
        zza.zzP().zzF(new zzcmu() { // from class: com.google.android.gms.internal.ads.zzdqr
            @Override // com.google.android.gms.internal.ads.zzcmu
            public final void zza() {
                zzcfz.this.zzb();
            }
        });
        zza.loadUrl((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcO));
        return zza2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcli zzcliVar, zzcfz zzcfzVar, boolean z10) {
        if (this.zza.zza != null && zzcliVar.zzs() != null) {
            zzcliVar.zzs().zzs(this.zza.zza);
        }
        zzcfzVar.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzcli zzcliVar, zzcfz zzcfzVar, boolean z10) {
        if (z10) {
            if (this.zza.zza != null && zzcliVar.zzs() != null) {
                zzcliVar.zzs().zzs(this.zza.zza);
            }
            zzcfzVar.zzb();
            return;
        }
        zzcfzVar.zze(new zzeit(1, "Html video Web View failed to load."));
    }
}
