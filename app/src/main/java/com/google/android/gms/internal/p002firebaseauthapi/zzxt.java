package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxt  reason: invalid package */
/* loaded from: classes2.dex */
abstract class zzxt extends AbstractList implements zzzq {
    private boolean zza = true;

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        zza();
        super.add(i10, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        zza();
        return super.addAll(i10, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        zza();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                for (int i10 = 0; i10 < size; i10++) {
                    if (!get(i10).equals(list.get(i10))) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i10) {
        zza();
        return super.remove(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        zza();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        zza();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        zza();
        return super.set(i10, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zza() {
        if (!this.zza) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzq
    public final void zzb() {
        this.zza = false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzq
    public final boolean zzc() {
        return this.zza;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        zza();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        zza();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        zza();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
