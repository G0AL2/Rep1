package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzx  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzzx extends zzxt implements RandomAccess, zzzy {
    public static final zzzy zza;
    private static final zzzx zzb;
    private final List zzc;

    static {
        zzzx zzzxVar = new zzzx(10);
        zzb = zzzxVar;
        zzzxVar.zzb();
        zza = zzzxVar;
    }

    public zzzx() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzyi) {
            return ((zzyi) obj).zzr(zzzr.zzb);
        }
        return zzzr.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zza();
        this.zzc.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        zza();
        if (collection instanceof zzzy) {
            collection = ((zzzy) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        Object remove = this.zzc.remove(i10);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zza();
        return zzj(this.zzc.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzq
    public final /* bridge */ /* synthetic */ zzzq zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzzx(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzy
    public final zzzy zze() {
        return zzc() ? new zzaby(this) : this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzy
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
        if (obj instanceof zzyi) {
            zzyi zzyiVar = (zzyi) obj;
            String zzr = zzyiVar.zzr(zzzr.zzb);
            if (zzyiVar.zzk()) {
                this.zzc.set(i10, zzr);
            }
            return zzr;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzzr.zzh(bArr);
        if (zzzr.zzi(bArr)) {
            this.zzc.set(i10, zzh);
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzy
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzy
    public final void zzi(zzyi zzyiVar) {
        zza();
        this.zzc.add(zzyiVar);
        ((AbstractList) this).modCount++;
    }

    public zzzx(int i10) {
        this.zzc = new ArrayList(i10);
    }

    private zzzx(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzxt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
