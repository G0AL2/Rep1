package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzfqd extends zzfqb implements List {
    final /* synthetic */ zzfqe zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfqd(zzfqe zzfqeVar, Object obj, List list, zzfqb zzfqbVar) {
        super(zzfqeVar, obj, list, zzfqbVar);
        this.zzf = zzfqeVar;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        zzb();
        boolean isEmpty = this.zzb.isEmpty();
        ((List) this.zzb).add(i10, obj);
        zzfqe.zzd(this.zzf);
        if (isEmpty) {
            zza();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.zzb).addAll(i10, collection);
        if (addAll) {
            zzfqe.zzf(this.zzf, this.zzb.size() - size);
            if (size == 0) {
                zza();
                return true;
            }
            return addAll;
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzb();
        return ((List) this.zzb).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        zzb();
        return ((List) this.zzb).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        zzb();
        return ((List) this.zzb).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        zzb();
        return new zzfqc(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        zzb();
        Object remove = ((List) this.zzb).remove(i10);
        zzfqe.zze(this.zzf);
        zzc();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        zzb();
        return ((List) this.zzb).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        zzb();
        zzfqe zzfqeVar = this.zzf;
        Object obj = this.zza;
        List subList = ((List) this.zzb).subList(i10, i11);
        zzfqb zzfqbVar = this.zzc;
        if (zzfqbVar == null) {
            zzfqbVar = this;
        }
        return zzfqeVar.zzk(obj, subList, zzfqbVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        zzb();
        return new zzfqc(this, i10);
    }
}
