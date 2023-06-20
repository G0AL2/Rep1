package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbnn implements zzbom {
    private final zzbno zza;

    public zzbnn(zzbno zzbnoVar) {
        this.zza = zzbnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("name");
        if (str == null) {
            zzcfi.zzj("App event with no name parameter.");
        } else {
            this.zza.zzbD(str, (String) map.get("info"));
        }
    }
}
