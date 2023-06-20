package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzbod implements zzbom {
    @Override // com.google.android.gms.internal.ads.zzbom
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcliVar = (zzcli) obj;
        if (zzcliVar.zzL() != null) {
            zzcliVar.zzL().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzl zzN = zzcliVar.zzN();
        if (zzN != null) {
            zzN.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzO = zzcliVar.zzO();
        if (zzO != null) {
            zzO.zzb();
        } else {
            zzcfi.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
