package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzezc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeza zza(Context context, zzfdk zzfdkVar, zzfec zzfecVar) {
        return zzc(context, zzfdkVar, zzfecVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeza zzb(Context context, zzfdk zzfdkVar, zzfec zzfecVar) {
        return zzc(context, zzfdkVar, zzfecVar);
    }

    private static zzeza zzc(Context context, zzfdk zzfdkVar, zzfec zzfecVar) {
        zzcel zzi;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfo)).booleanValue()) {
            zzi = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzh();
        } else {
            zzi = com.google.android.gms.ads.internal.zzt.zzo().zzh().zzi();
        }
        boolean z10 = false;
        if (zzi != null && zzi.zzh()) {
            z10 = true;
        }
        if (((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfE)).intValue() > 0) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfn)).booleanValue() || z10) {
                zzfeb zza = zzfecVar.zza(zzfds.AppOpen, context, zzfdkVar, new zzeye(new zzeyb()));
                zzeyq zzeyqVar = new zzeyq(new zzeyp());
                zzfdo zzfdoVar = zza.zza;
                zzfvm zzfvmVar = zzcfv.zza;
                return new zzeyg(zzeyqVar, new zzeym(zzfdoVar, zzfvmVar), zza.zzb, zza.zza.zza().zzf, zzfvmVar);
            }
        }
        return new zzeyp();
    }
}
