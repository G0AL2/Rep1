package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzean implements zzfuy {
    final /* synthetic */ zzeao zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzean(zzeao zzeaoVar) {
        this.zza = zzeaoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        Pattern pattern;
        zzeds zzedsVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfg)).booleanValue()) {
            pattern = zzeao.zza;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzedsVar = this.zza.zzf;
                zzedsVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeds zzedsVar;
        zzeds zzedsVar2;
        zzfbx zzfbxVar = (zzfbx) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfg)).booleanValue()) {
            zzedsVar = this.zza.zzf;
            zzedsVar.zzi(zzfbxVar.zzb.zzb.zze);
            zzedsVar2 = this.zza.zzf;
            zzedsVar2.zzj(zzfbxVar.zzb.zzb.zzf);
        }
    }
}
