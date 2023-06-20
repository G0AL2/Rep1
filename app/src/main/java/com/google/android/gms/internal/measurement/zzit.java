package com.google.android.gms.internal.measurement;

import com.inmobi.media.fq;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
final class zzit implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzjb zzjbVar = (zzjb) obj;
        zzjb zzjbVar2 = (zzjb) obj2;
        zzis zzisVar = new zzis(zzjbVar);
        zzis zzisVar2 = new zzis(zzjbVar2);
        while (zzisVar.hasNext() && zzisVar2.hasNext()) {
            int compareTo = Integer.valueOf(zzisVar.zza() & fq.i.NETWORK_LOAD_LIMIT_DISABLED).compareTo(Integer.valueOf(zzisVar2.zza() & fq.i.NETWORK_LOAD_LIMIT_DISABLED));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzjbVar.zzd()).compareTo(Integer.valueOf(zzjbVar2.zzd()));
    }
}
