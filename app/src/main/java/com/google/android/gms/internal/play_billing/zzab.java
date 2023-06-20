package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;

/* compiled from: com.android.billingclient:billing@@4.1.0 */
/* loaded from: classes2.dex */
final class zzab extends zzu {
    final /* synthetic */ zzac zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(zzac zzacVar) {
        this.zza = zzacVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.zza.zzc;
        zzm.zza(i10, i11, "index");
        zzac zzacVar = this.zza;
        int i12 = i10 + i10;
        objArr = zzacVar.zzb;
        Object obj = objArr[i12];
        obj.getClass();
        objArr2 = zzacVar.zzb;
        Object obj2 = objArr2[i12 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i10;
        i10 = this.zza.zzc;
        return i10;
    }
}
