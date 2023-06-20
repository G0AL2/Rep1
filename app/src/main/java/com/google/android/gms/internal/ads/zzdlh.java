package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.collection.a;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdlh implements zzddh, com.google.android.gms.ads.internal.overlay.zzo {
    @VisibleForTesting
    IObjectWrapper zza;
    private final Context zzb;
    private final zzcli zzc;
    private final zzfbl zzd;
    private final zzcfo zze;
    private final zzbdw zzf;

    public zzdlh(Context context, zzcli zzcliVar, zzfbl zzfblVar, zzcfo zzcfoVar, zzbdw zzbdwVar) {
        this.zzb = context;
        this.zzc = zzcliVar;
        this.zzd = zzfblVar;
        this.zze = zzcfoVar;
        this.zzf = zzbdwVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        zzcli zzcliVar;
        if (this.zza == null || (zzcliVar = this.zzc) == null) {
            return;
        }
        zzcliVar.zzd("onSdkImpression", new a());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i10) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        zzbxr zzbxrVar;
        zzbxr zzbxrVar2;
        zzbxq zzbxqVar;
        zzbdw zzbdwVar = this.zzf;
        if ((zzbdwVar == zzbdw.REWARD_BASED_VIDEO_AD || zzbdwVar == zzbdw.INTERSTITIAL || zzbdwVar == zzbdw.APP_OPEN) && this.zzd.zzU && this.zzc != null && com.google.android.gms.ads.internal.zzt.zzh().zze(this.zzb)) {
            zzcfo zzcfoVar = this.zze;
            String str = zzcfoVar.zzb + "." + zzcfoVar.zzc;
            String zza = this.zzd.zzW.zza();
            if (this.zzd.zzW.zzb() == 1) {
                zzbxqVar = zzbxq.VIDEO;
                zzbxrVar2 = zzbxr.DEFINED_BY_JAVASCRIPT;
            } else {
                if (this.zzd.zzZ == 2) {
                    zzbxrVar = zzbxr.UNSPECIFIED;
                } else {
                    zzbxrVar = zzbxr.BEGIN_TO_RENDER;
                }
                zzbxrVar2 = zzbxrVar;
                zzbxqVar = zzbxq.HTML_DISPLAY;
            }
            IObjectWrapper zza2 = com.google.android.gms.ads.internal.zzt.zzh().zza(str, this.zzc.zzI(), "", "javascript", zza, zzbxrVar2, zzbxqVar, this.zzd.zzan);
            this.zza = zza2;
            if (zza2 != null) {
                com.google.android.gms.ads.internal.zzt.zzh().zzc(this.zza, (View) this.zzc);
                this.zzc.zzar(this.zza);
                com.google.android.gms.ads.internal.zzt.zzh().zzd(this.zza);
                this.zzc.zzd("onSdkLoaded", new a());
            }
        }
    }
}
