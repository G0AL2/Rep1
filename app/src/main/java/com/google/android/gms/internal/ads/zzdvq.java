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
public final class zzdvq implements zzdgk, com.google.android.gms.ads.internal.client.zza, zzdcn, zzdbx {
    private final Context zza;
    private final zzfcs zzb;
    private final zzdwh zzc;
    private final zzfbx zzd;
    private final zzfbl zze;
    private final zzees zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfO)).booleanValue();

    public zzdvq(Context context, zzfcs zzfcsVar, zzdwh zzdwhVar, zzfbx zzfbxVar, zzfbl zzfblVar, zzees zzeesVar) {
        this.zza = context;
        this.zzb = zzfcsVar;
        this.zzc = zzdwhVar;
        this.zzd = zzfbxVar;
        this.zze = zzfblVar;
        this.zzf = zzeesVar;
    }

    private final zzdwg zzf(String str) {
        zzdwg zza = this.zzc.zza();
        zza.zze(this.zzd.zzb.zzb);
        zza.zzd(this.zze);
        zza.zzb("action", str);
        if (!this.zze.zzu.isEmpty()) {
            zza.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzak) {
            zza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzv(this.zza) ? "offline" : b.ONLINE_EXTRAS_KEY);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
            zza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfX)).booleanValue()) {
            boolean z10 = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzd(this.zzd.zza.zza) != 1;
            zza.zzb("scar", String.valueOf(z10));
            if (z10) {
                com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzd.zza.zza.zzd;
                zza.zzc("ragent", zzlVar.zzp);
                zza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzlVar)));
            }
        }
        return zza;
    }

    private final void zzg(zzdwg zzdwgVar) {
        if (this.zze.zzak) {
            this.zzf.zzd(new zzeeu(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdwgVar.zzf(), 2));
            return;
        }
        zzdwgVar.zzg();
    }

    private final boolean zzh() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
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
                    this.zzg = Boolean.valueOf(z10);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zze.zzak) {
            zzg(zzf(au.CLICK_BEACON));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzh) {
            zzdwg zzf = zzf("ifts");
            zzf.zzb(IronSourceConstants.EVENTS_ERROR_REASON, "adapter");
            int i10 = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i10 = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i10 >= 0) {
                zzf.zzb("arec", String.valueOf(i10));
            }
            String zza = this.zzb.zza(str);
            if (zza != null) {
                zzf.zzb("areec", zza);
            }
            zzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zzb() {
        if (this.zzh) {
            zzdwg zzf = zzf("ifts");
            zzf.zzb(IronSourceConstants.EVENTS_ERROR_REASON, "blocked");
            zzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgk
    public final void zzc() {
        if (zzh()) {
            zzf("adapter_shown").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgk
    public final void zzd() {
        if (zzh()) {
            zzf("adapter_impression").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zze(zzdlf zzdlfVar) {
        if (this.zzh) {
            zzdwg zzf = zzf("ifts");
            zzf.zzb(IronSourceConstants.EVENTS_ERROR_REASON, "exception");
            if (!TextUtils.isEmpty(zzdlfVar.getMessage())) {
                zzf.zzb("msg", zzdlfVar.getMessage());
            }
            zzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        if (zzh() || this.zze.zzak) {
            zzg(zzf("impression"));
        }
    }
}
