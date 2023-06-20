package com.google.android.gms.measurement.internal;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
final class zzfy implements com.google.android.gms.internal.measurement.zzo {
    final /* synthetic */ String zza;
    final /* synthetic */ zzfz zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfy(zzfz zzfzVar, String str) {
        this.zzb = zzfzVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzo
    public final String zza(String str) {
        Map map;
        map = this.zzb.zzg;
        Map map2 = (Map) map.get(this.zza);
        if (map2 == null || !map2.containsKey(str)) {
            return null;
        }
        return (String) map2.get(str);
    }
}
