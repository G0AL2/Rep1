package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzglv {
    public static final int zza(int i10, Object obj, Object obj2) {
        zzglu zzgluVar = (zzglu) obj;
        zzglt zzgltVar = (zzglt) obj2;
        if (zzgluVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzgluVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final boolean zzb(Object obj) {
        return !((zzglu) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzglu zzgluVar = (zzglu) obj;
        zzglu zzgluVar2 = (zzglu) obj2;
        if (!zzgluVar2.isEmpty()) {
            if (!zzgluVar.zze()) {
                zzgluVar = zzgluVar.zzb();
            }
            zzgluVar.zzd(zzgluVar2);
        }
        return zzgluVar;
    }
}
