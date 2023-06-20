package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzfsv extends zzfro {
    private final transient zzfrm zza;
    private final transient zzfrj zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfsv(zzfrm zzfrmVar, zzfrj zzfrjVar) {
        this.zza = zzfrmVar;
        this.zzb = zzfrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfre, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfro, com.google.android.gms.internal.ads.zzfre, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzfro, com.google.android.gms.internal.ads.zzfre
    public final zzfrj zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfro, com.google.android.gms.internal.ads.zzfre
    public final zzfti zze() {
        return this.zzb.listIterator(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final boolean zzf() {
        throw null;
    }
}
