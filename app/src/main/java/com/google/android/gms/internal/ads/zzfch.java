package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfch {
    public static com.google.android.gms.ads.internal.client.zzq zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfbm zzfbmVar = (zzfbm) it.next();
            if (zzfbmVar.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzfbmVar.zza, zzfbmVar.zzb));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzfbm zzb(List list, zzfbm zzfbmVar) {
        return (zzfbm) list.get(0);
    }

    public static zzfbm zzc(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzqVar.zzi ? new zzfbm(-3, 0, true) : new zzfbm(zzqVar.zze, zzqVar.zzb, false);
    }
}
