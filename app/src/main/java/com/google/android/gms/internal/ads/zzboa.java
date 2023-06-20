package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzboa implements zzbom {
    @Override // com.google.android.gms.internal.ads.zzbom
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        JSONObject zza;
        zzcli zzcliVar = (zzcli) obj;
        zzbko zzM = zzcliVar.zzM();
        if (zzM != null && (zza = zzM.zza()) != null) {
            zzcliVar.zze("nativeAdViewSignalsReady", zza);
        } else {
            zzcliVar.zze("nativeAdViewSignalsReady", new JSONObject());
        }
    }
}
