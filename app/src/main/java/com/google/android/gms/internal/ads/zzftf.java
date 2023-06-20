package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzftf extends zzfro {
    final transient Object zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzftf(Object obj) {
        Objects.requireNonNull(obj);
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzfre, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfro, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfro, com.google.android.gms.internal.ads.zzfre, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzfrr(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return '[' + this.zza.toString() + ']';
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zza(Object[] objArr, int i10) {
        objArr[i10] = this.zza;
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfro, com.google.android.gms.internal.ads.zzfre
    public final zzfrj zzd() {
        return zzfrj.zzp(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfro, com.google.android.gms.internal.ads.zzfre
    public final zzfti zze() {
        return new zzfrr(this.zza);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final boolean zzf() {
        throw null;
    }
}
