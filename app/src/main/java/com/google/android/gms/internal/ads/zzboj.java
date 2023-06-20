package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzboj implements zzbom {
    @Override // com.google.android.gms.internal.ads.zzbom
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcliVar = (zzcli) obj;
        if (map.keySet().contains("start")) {
            zzcliVar.zzP().zzk();
        } else if (map.keySet().contains("stop")) {
            zzcliVar.zzP().zzl();
        } else if (map.keySet().contains("cancel")) {
            zzcliVar.zzP().zzj();
        }
    }
}
