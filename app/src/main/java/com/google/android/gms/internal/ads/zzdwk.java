package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdwk implements zzfgg {
    private final zzdwc zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdwk(zzdwc zzdwcVar, Set set, Clock clock) {
        zzffz zzffzVar;
        this.zzb = zzdwcVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdwj zzdwjVar = (zzdwj) it.next();
            Map map = this.zzd;
            zzffzVar = zzdwjVar.zzc;
            map.put(zzffzVar, zzdwjVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzffz zzffzVar, boolean z10) {
        zzffz zzffzVar2;
        String str;
        zzffzVar2 = ((zzdwj) this.zzd.get(zzffzVar)).zzb;
        String str2 = true != z10 ? "f." : "s.";
        if (this.zza.containsKey(zzffzVar2)) {
            long elapsedRealtime = this.zzc.elapsedRealtime();
            long longValue = ((Long) this.zza.get(zzffzVar2)).longValue();
            Map zza = this.zzb.zza();
            str = ((zzdwj) this.zzd.get(zzffzVar)).zza;
            zza.put("label.".concat(str), str2.concat(String.valueOf(Long.toString(elapsedRealtime - longValue))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzbF(zzffz zzffzVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzbG(zzffz zzffzVar, String str, Throwable th) {
        if (this.zza.containsKey(zzffzVar)) {
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzffzVar)).longValue()))));
        }
        if (this.zzd.containsKey(zzffzVar)) {
            zze(zzffzVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzc(zzffz zzffzVar, String str) {
        this.zza.put(zzffzVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfgg
    public final void zzd(zzffz zzffzVar, String str) {
        if (this.zza.containsKey(zzffzVar)) {
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzffzVar)).longValue()))));
        }
        if (this.zzd.containsKey(zzffzVar)) {
            zze(zzffzVar, true);
        }
    }
}
