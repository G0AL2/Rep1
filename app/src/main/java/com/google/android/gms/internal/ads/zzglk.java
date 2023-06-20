package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzglk extends zzglo {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzglk() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzglk(zzglj zzgljVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j10, int i10) {
        zzglh zzglhVar;
        List arrayList;
        List list = (List) zzgnu.zzh(obj, j10);
        if (list.isEmpty()) {
            if (list instanceof zzgli) {
                arrayList = new zzglh(i10);
            } else if ((list instanceof zzgmh) && (list instanceof zzgkz)) {
                arrayList = ((zzgkz) list).zzd(i10);
            } else {
                arrayList = new ArrayList(i10);
            }
            zzgnu.zzv(obj, j10, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i10);
            arrayList2.addAll(list);
            zzgnu.zzv(obj, j10, arrayList2);
            zzglhVar = arrayList2;
        } else if (list instanceof zzgnp) {
            zzglh zzglhVar2 = new zzglh(list.size() + i10);
            zzglhVar2.addAll(zzglhVar2.size(), (zzgnp) list);
            zzgnu.zzv(obj, j10, zzglhVar2);
            zzglhVar = zzglhVar2;
        } else if ((list instanceof zzgmh) && (list instanceof zzgkz)) {
            zzgkz zzgkzVar = (zzgkz) list;
            if (zzgkzVar.zzc()) {
                return list;
            }
            zzgkz zzd = zzgkzVar.zzd(list.size() + i10);
            zzgnu.zzv(obj, j10, zzd);
            return zzd;
        } else {
            return list;
        }
        return zzglhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzglo
    public final List zza(Object obj, long j10) {
        return zzf(obj, j10, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzglo
    public final void zzb(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzgnu.zzh(obj, j10);
        if (list instanceof zzgli) {
            unmodifiableList = ((zzgli) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzgmh) && (list instanceof zzgkz)) {
                zzgkz zzgkzVar = (zzgkz) list;
                if (zzgkzVar.zzc()) {
                    zzgkzVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzgnu.zzv(obj, j10, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzglo
    public final void zzc(Object obj, Object obj2, long j10) {
        List list = (List) zzgnu.zzh(obj2, j10);
        List zzf = zzf(obj, j10, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzgnu.zzv(obj, j10, list);
    }
}
