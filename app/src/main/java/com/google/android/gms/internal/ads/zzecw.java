package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.customtabs.b;
import com.google.android.gms.ads.MobileAds;
import com.inmobi.media.au;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzecw implements zzdgk, com.google.android.gms.ads.internal.client.zza, zzdcn, zzdbx {
    private final Context zza;
    private final zzfcs zzb;
    private final zzfbx zzc;
    private final zzfbl zzd;
    private final zzees zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfO)).booleanValue();
    private final zzfgp zzh;
    private final String zzi;

    public zzecw(Context context, zzfcs zzfcsVar, zzfbx zzfbxVar, zzfbl zzfblVar, zzees zzeesVar, zzfgp zzfgpVar, String str) {
        this.zza = context;
        this.zzb = zzfcsVar;
        this.zzc = zzfbxVar;
        this.zzd = zzfblVar;
        this.zze = zzeesVar;
        this.zzh = zzfgpVar;
        this.zzi = str;
    }

    private final zzfgo zzf(String str) {
        zzfgo zzb = zzfgo.zzb(str);
        zzb.zzh(this.zzc, null);
        zzb.zzf(this.zzd);
        zzb.zza("request_id", this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzb.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzak) {
            zzb.zza("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzv(this.zza) ? "offline" : b.ONLINE_EXTRAS_KEY);
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
            zzb.zza("offline_ad", "1");
        }
        return zzb;
    }

    private final void zzg(zzfgo zzfgoVar) {
        if (this.zzd.zzak) {
            this.zze.zzd(new zzeeu(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfgoVar), 2));
            return;
        }
        this.zzh.zzb(zzfgoVar);
    }

    private final boolean zzh() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbm);
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String zzo = com.google.android.gms.ads.internal.util.zzs.zzo(this.zza);
                    boolean z10 = false;
                    if (str != null && zzo != null) {
                        try {
                            z10 = Pattern.matches(str, zzo);
                        } catch (RuntimeException e10) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzt(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzf = Boolean.valueOf(z10);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzd.zzak) {
            zzg(zzf(au.CLICK_BEACON));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzg) {
            int i10 = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i10 = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String zza = this.zzb.zza(str);
            zzfgo zzf = zzf("ifts");
            zzf.zza(IronSourceConstants.EVENTS_ERROR_REASON, "adapter");
            if (i10 >= 0) {
                zzf.zza("arec", String.valueOf(i10));
            }
            if (zza != null) {
                zzf.zza("areec", zza);
            }
            this.zzh.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zzb() {
        if (this.zzg) {
            zzfgp zzfgpVar = this.zzh;
            zzfgo zzf = zzf("ifts");
            zzf.zza(IronSourceConstants.EVENTS_ERROR_REASON, "blocked");
            zzfgpVar.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgk
    public final void zzc() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgk
    public final void zzd() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zze(zzdlf zzdlfVar) {
        if (this.zzg) {
            zzfgo zzf = zzf("ifts");
            zzf.zza(IronSourceConstants.EVENTS_ERROR_REASON, "exception");
            if (!TextUtils.isEmpty(zzdlfVar.getMessage())) {
                zzf.zza("msg", zzdlfVar.getMessage());
            }
            this.zzh.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        if (zzh() || this.zzd.zzak) {
            zzg(zzf("impression"));
        }
    }
}
