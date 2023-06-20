package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfsy extends zzfro {
    static final zzfsy zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzfsy(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfsy(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.zzb = objArr;
        this.zze = i10;
        this.zzc = objArr2;
        this.zzf = i11;
        this.zzg = i12;
    }

    @Override // com.google.android.gms.internal.ads.zzfre, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.zzc;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int zzb = zzfrb.zzb(obj);
        while (true) {
            int i10 = zzb & this.zzf;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            zzb = i10 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfro, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfro, com.google.android.gms.internal.ads.zzfre, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, i10, this.zzg);
        return i10 + this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    final int zzb() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final int zzc() {
        return 0;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfre
    public final Object[] zzg() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    final zzfrj zzi() {
        return zzfrj.zzk(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzfro
    final boolean zzo() {
        return true;
    }
}
