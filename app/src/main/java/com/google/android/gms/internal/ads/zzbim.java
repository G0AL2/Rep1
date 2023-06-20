package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@Deprecated
/* loaded from: classes2.dex */
public final class zzbim {
    private final Map zza = new HashMap();
    private final zzbio zzb;

    public zzbim(zzbio zzbioVar) {
        this.zzb = zzbioVar;
    }

    public final zzbio zza() {
        return this.zzb;
    }

    public final void zzb(String str, zzbil zzbilVar) {
        this.zza.put(str, zzbilVar);
    }

    public final void zzc(String str, String str2, long j10) {
        zzbio zzbioVar = this.zzb;
        zzbil zzbilVar = (zzbil) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbilVar != null) {
            zzbioVar.zze(zzbilVar, j10, strArr);
        }
        this.zza.put(str, new zzbil(j10, null, null));
    }
}
