package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfgu {
    private final Clock zza;
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();

    public zzfgu(Clock clock) {
        this.zza = clock;
    }

    private final void zzd(String str, String str2) {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, new ArrayList());
        }
        ((List) this.zzb.get(str)).add(str2);
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.zzb.entrySet()) {
            int i10 = 0;
            if (((List) entry.getValue()).size() > 1) {
                for (String str : (List) entry.getValue()) {
                    i10++;
                    arrayList.add(new zzfgt(((String) entry.getKey()) + "." + i10, str));
                }
            } else {
                arrayList.add(new zzfgt((String) entry.getKey(), (String) ((List) entry.getValue()).get(0)));
            }
        }
        return arrayList;
    }

    public final void zzb(String str) {
        if (this.zzc.containsKey(str)) {
            long elapsedRealtime = this.zza.elapsedRealtime();
            long longValue = ((Long) this.zzc.remove(str)).longValue();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(elapsedRealtime - longValue);
            zzd(str, sb2.toString());
            return;
        }
        this.zzc.put(str, Long.valueOf(this.zza.elapsedRealtime()));
    }

    public final void zzc(String str, String str2) {
        if (this.zzc.containsKey(str)) {
            long elapsedRealtime = this.zza.elapsedRealtime();
            long longValue = ((Long) this.zzc.remove(str)).longValue();
            zzd(str, str2 + (elapsedRealtime - longValue));
            return;
        }
        this.zzc.put(str, Long.valueOf(this.zza.elapsedRealtime()));
    }
}
