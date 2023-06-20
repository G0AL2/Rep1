package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfst extends zzfrj {
    final /* synthetic */ zzfsu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfst(zzfsu zzfsuVar) {
        this.zza = zzfsuVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        i11 = this.zza.zzc;
        zzfou.zza(i10, i11, "index");
        zzfsu zzfsuVar = this.zza;
        int i12 = i10 + i10;
        objArr = zzfsuVar.zzb;
        Object obj = objArr[i12];
        obj.getClass();
        objArr2 = zzfsuVar.zzb;
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

    @Override // com.google.android.gms.internal.ads.zzfre
    public final boolean zzf() {
        return true;
    }
}
