package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
final class zzkt extends zzkx {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzkt() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzkt(zzks zzksVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzkx
    public final void zza(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzmv.zzf(obj, j10);
        if (list instanceof zzkr) {
            unmodifiableList = ((zzkr) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzlq) && (list instanceof zzkj)) {
                zzkj zzkjVar = (zzkj) list;
                if (zzkjVar.zzc()) {
                    zzkjVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzmv.zzs(obj, j10, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.zzkx
    public final void zzb(Object obj, Object obj2, long j10) {
        zzkq zzkqVar;
        List list = (List) zzmv.zzf(obj2, j10);
        int size = list.size();
        List list2 = (List) zzmv.zzf(obj, j10);
        if (list2.isEmpty()) {
            if (list2 instanceof zzkr) {
                list2 = new zzkq(size);
            } else if ((list2 instanceof zzlq) && (list2 instanceof zzkj)) {
                list2 = ((zzkj) list2).zzd(size);
            } else {
                list2 = new ArrayList(size);
            }
            zzmv.zzs(obj, j10, list2);
        } else {
            if (zza.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                zzmv.zzs(obj, j10, arrayList);
                zzkqVar = arrayList;
            } else if (list2 instanceof zzmq) {
                zzkq zzkqVar2 = new zzkq(list2.size() + size);
                zzkqVar2.addAll(zzkqVar2.size(), (zzmq) list2);
                zzmv.zzs(obj, j10, zzkqVar2);
                zzkqVar = zzkqVar2;
            } else if ((list2 instanceof zzlq) && (list2 instanceof zzkj)) {
                zzkj zzkjVar = (zzkj) list2;
                if (!zzkjVar.zzc()) {
                    list2 = zzkjVar.zzd(list2.size() + size);
                    zzmv.zzs(obj, j10, list2);
                }
            }
            list2 = zzkqVar;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        zzmv.zzs(obj, j10, list);
    }
}
