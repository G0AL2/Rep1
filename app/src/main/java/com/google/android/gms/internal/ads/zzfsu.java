package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfsu extends zzfro {
    private final transient zzfrm zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfsu(zzfrm zzfrmVar, Object[] objArr, int i10, int i11) {
        this.zza = zzfrmVar;
        this.zzb = objArr;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzfre, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfro, com.google.android.gms.internal.ads.zzfre, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zza(Object[] objArr, int i10) {
        return zzd().zza(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfro, com.google.android.gms.internal.ads.zzfre
    public final zzfti zze() {
        return zzd().listIterator(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final boolean zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    final zzfrj zzi() {
        return new zzfst(this);
    }
}
