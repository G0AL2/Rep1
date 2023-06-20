package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaa  reason: invalid package */
/* loaded from: classes2.dex */
final class zzaaa extends zzaae {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzaaa() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaaa(zzzz zzzzVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j10, int i10) {
        zzzx zzzxVar;
        List arrayList;
        List list = (List) zzacd.zzf(obj, j10);
        if (list.isEmpty()) {
            if (list instanceof zzzy) {
                arrayList = new zzzx(i10);
            } else if ((list instanceof zzaax) && (list instanceof zzzq)) {
                arrayList = ((zzzq) list).zzd(i10);
            } else {
                arrayList = new ArrayList(i10);
            }
            zzacd.zzs(obj, j10, arrayList);
            return arrayList;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i10);
            arrayList2.addAll(list);
            zzacd.zzs(obj, j10, arrayList2);
            zzzxVar = arrayList2;
        } else if (list instanceof zzaby) {
            zzzx zzzxVar2 = new zzzx(list.size() + i10);
            zzzxVar2.addAll(zzzxVar2.size(), (zzaby) list);
            zzacd.zzs(obj, j10, zzzxVar2);
            zzzxVar = zzzxVar2;
        } else if ((list instanceof zzaax) && (list instanceof zzzq)) {
            zzzq zzzqVar = (zzzq) list;
            if (zzzqVar.zzc()) {
                return list;
            }
            zzzq zzd = zzzqVar.zzd(list.size() + i10);
            zzacd.zzs(obj, j10, zzd);
            return zzd;
        } else {
            return list;
        }
        return zzzxVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaae
    public final List zza(Object obj, long j10) {
        return zzf(obj, j10, 10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaae
    public final void zzb(Object obj, long j10) {
        Object unmodifiableList;
        List list = (List) zzacd.zzf(obj, j10);
        if (list instanceof zzzy) {
            unmodifiableList = ((zzzy) list).zze();
        } else if (zza.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if ((list instanceof zzaax) && (list instanceof zzzq)) {
                zzzq zzzqVar = (zzzq) list;
                if (zzzqVar.zzc()) {
                    zzzqVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzacd.zzs(obj, j10, unmodifiableList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaae
    public final void zzc(Object obj, Object obj2, long j10) {
        List list = (List) zzacd.zzf(obj2, j10);
        List zzf = zzf(obj, j10, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzacd.zzs(obj, j10, list);
    }
}
