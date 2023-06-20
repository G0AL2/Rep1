package com.google.android.gms.measurement.internal;

import androidx.collection.a;
import com.google.android.gms.internal.measurement.zzoi;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzt {
    final /* synthetic */ zzz zza;
    private String zzb;
    private boolean zzc;
    private com.google.android.gms.internal.measurement.zzgh zzd;
    private BitSet zze;
    private BitSet zzf;
    private Map zzg;
    private Map zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzt(zzz zzzVar, String str, zzs zzsVar) {
        this.zza = zzzVar;
        this.zzb = str;
        this.zzc = true;
        this.zze = new BitSet();
        this.zzf = new BitSet();
        this.zzg = new a();
        this.zzh = new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ BitSet zzb(zzt zztVar) {
        return zztVar.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final com.google.android.gms.internal.measurement.zzfo zza(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.zzfn zzb = com.google.android.gms.internal.measurement.zzfo.zzb();
        zzb.zza(i10);
        zzb.zzc(this.zzc);
        com.google.android.gms.internal.measurement.zzgh zzghVar = this.zzd;
        if (zzghVar != null) {
            zzb.zzd(zzghVar);
        }
        com.google.android.gms.internal.measurement.zzgg zzf = com.google.android.gms.internal.measurement.zzgh.zzf();
        zzf.zzb(zzlk.zzr(this.zze));
        zzf.zzd(zzlk.zzr(this.zzf));
        Map map = this.zzg;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.zzg.keySet()) {
                int intValue = num.intValue();
                Long l10 = (Long) this.zzg.get(Integer.valueOf(intValue));
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.zzfp zzc = com.google.android.gms.internal.measurement.zzfq.zzc();
                    zzc.zzb(intValue);
                    zzc.zza(l10.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.zzfq) zzc.zzaE());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            zzf.zza(arrayList);
        }
        Map map2 = this.zzh;
        if (map2 == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.zzh.keySet()) {
                com.google.android.gms.internal.measurement.zzgi zzd = com.google.android.gms.internal.measurement.zzgj.zzd();
                zzd.zzb(num2.intValue());
                List list2 = (List) this.zzh.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    zzd.zza(list2);
                }
                arrayList3.add((com.google.android.gms.internal.measurement.zzgj) zzd.zzaE());
            }
            list = arrayList3;
        }
        zzf.zzc(list);
        zzb.zzb(zzf);
        return (com.google.android.gms.internal.measurement.zzfo) zzb.zzaE();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzc(zzx zzxVar) {
        int zza = zzxVar.zza();
        Boolean bool = zzxVar.zzd;
        if (bool != null) {
            this.zzf.set(zza, bool.booleanValue());
        }
        Boolean bool2 = zzxVar.zze;
        if (bool2 != null) {
            this.zze.set(zza, bool2.booleanValue());
        }
        if (zzxVar.zzf != null) {
            Map map = this.zzg;
            Integer valueOf = Integer.valueOf(zza);
            Long l10 = (Long) map.get(valueOf);
            long longValue = zzxVar.zzf.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.zzg.put(valueOf, Long.valueOf(longValue));
            }
        }
        if (zzxVar.zzg != null) {
            Map map2 = this.zzh;
            Integer valueOf2 = Integer.valueOf(zza);
            List list = (List) map2.get(valueOf2);
            if (list == null) {
                list = new ArrayList();
                this.zzh.put(valueOf2, list);
            }
            if (zzxVar.zzc()) {
                list.clear();
            }
            zzoi.zzc();
            zzaf zzf = this.zza.zzs.zzf();
            String str = this.zzb;
            zzek zzekVar = zzel.zzX;
            if (zzf.zzs(str, zzekVar) && zzxVar.zzb()) {
                list.clear();
            }
            zzoi.zzc();
            if (this.zza.zzs.zzf().zzs(this.zzb, zzekVar)) {
                Long valueOf3 = Long.valueOf(zzxVar.zzg.longValue() / 1000);
                if (list.contains(valueOf3)) {
                    return;
                }
                list.add(valueOf3);
                return;
            }
            list.add(Long.valueOf(zzxVar.zzg.longValue() / 1000));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzt(zzz zzzVar, String str, com.google.android.gms.internal.measurement.zzgh zzghVar, BitSet bitSet, BitSet bitSet2, Map map, Map map2, zzs zzsVar) {
        this.zza = zzzVar;
        this.zzb = str;
        this.zze = bitSet;
        this.zzf = bitSet2;
        this.zzg = map;
        this.zzh = new a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.zzh.put(num, arrayList);
        }
        this.zzc = false;
        this.zzd = zzghVar;
    }
}
