package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbr {
    private final int zza;
    private final zzbbo zzb = new zzbbt();

    public zzbbr(int i10) {
        this.zza = i10;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append('\n');
        }
        String[] split = sb2.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzbbq zzbbqVar = new zzbbq();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzbbp(this));
        for (String str : split) {
            String[] zzb = zzbbs.zzb(str, false);
            if (zzb.length != 0) {
                zzbbw.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbbqVar.zzb.write(this.zzb.zzb(((zzbbv) it.next()).zzb));
            } catch (IOException e10) {
                zzcfi.zzh("Error while writing hash to byteStream", e10);
            }
        }
        return zzbbqVar.toString();
    }
}
