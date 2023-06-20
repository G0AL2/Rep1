package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaby  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzaby extends AbstractList implements RandomAccess, zzzy {
    private final zzzy zza;

    public zzaby(zzzy zzzyVar) {
        this.zza = zzzyVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return ((zzzx) this.zza).get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzabx(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new zzabw(this, i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzy
    public final zzzy zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzy
    public final Object zzf(int i10) {
        return this.zza.zzf(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzy
    public final List zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzzy
    public final void zzi(zzyi zzyiVar) {
        throw new UnsupportedOperationException();
    }
}
