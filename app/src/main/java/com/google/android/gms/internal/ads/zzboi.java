package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzboi implements zzbom {
    @Override // com.google.android.gms.internal.ads.zzbom
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcli zzcliVar = (zzcli) obj;
        String str = (String) map.get("action");
        if ("pause".equals(str)) {
            zzcliVar.zzbn();
        } else if ("resume".equals(str)) {
            zzcliVar.zzbo();
        }
    }
}
