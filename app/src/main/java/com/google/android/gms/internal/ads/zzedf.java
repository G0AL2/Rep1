package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzedf implements zzfgg {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final zzfgo zzc;

    public zzedf(Set set, zzfgo zzfgoVar) {
        zzffz zzffzVar;
        String str;
        zzffz zzffzVar2;
        String str2;
        this.zzc = zzfgoVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzede zzedeVar = (zzede) it.next();
            Map map = this.zza;
            zzffzVar = zzedeVar.zzb;
            str = zzedeVar.zza;
            map.put(zzffzVar, str);
            Map map2 = this.zzb;
            zzffzVar2 = zzedeVar.zzc;
            str2 = zzedeVar.zza;
            map2.put(zzffzVar2, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzbF(zzffz zzffzVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzbG(zzffz zzffzVar, String str, Throwable th) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "f.");
        if (this.zzb.containsKey(zzffzVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzffzVar))), "f.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzc(zzffz zzffzVar, String str) {
        this.zzc.zzd("task.".concat(String.valueOf(str)));
        if (this.zza.containsKey(zzffzVar)) {
            this.zzc.zzd("label.".concat(String.valueOf((String) this.zza.get(zzffzVar))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzd(zzffz zzffzVar, String str) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "s.");
        if (this.zzb.containsKey(zzffzVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzffzVar))), "s.");
        }
    }
}
