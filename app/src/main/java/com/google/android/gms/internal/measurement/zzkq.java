package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzkq extends zzim implements RandomAccess, zzkr {
    public static final zzkr zza;
    private static final zzkq zzb;
    private final List zzc;

    static {
        zzkq zzkqVar = new zzkq(10);
        zzb = zzkqVar;
        zzkqVar.zzb();
        zza = zzkqVar;
    }

    public zzkq() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjb) {
            return ((zzjb) obj).zzn(zzkk.zzb);
        }
        return zzkk.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zzbS();
        this.zzc.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        zzbS();
        if (collection instanceof zzkr) {
            collection = ((zzkr) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbS();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zzbS();
        Object remove = this.zzc.remove(i10);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zzbS();
        return zzj(this.zzc.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzkj
    public final /* bridge */ /* synthetic */ zzkj zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzkq(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final zzkr zze() {
        return zzc() ? new zzmq(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final Object zzf(int i10) {
        return this.zzc.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg */
    public final String get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzjb) {
            zzjb zzjbVar = (zzjb) obj;
            String zzn = zzjbVar.zzn(zzkk.zzb);
            if (zzjbVar.zzi()) {
                this.zzc.set(i10, zzn);
            }
            return zzn;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzkk.zzh(bArr);
        if (zzkk.zzi(bArr)) {
            this.zzc.set(i10, zzh);
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzkr
    public final void zzi(zzjb zzjbVar) {
        zzbS();
        this.zzc.add(zzjbVar);
        ((AbstractList) this).modCount++;
    }

    public zzkq(int i10) {
        this.zzc = new ArrayList(i10);
    }

    private zzkq(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.measurement.zzim, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
