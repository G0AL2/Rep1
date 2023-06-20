package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfqe extends zzfqh implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzfqe(Map map) {
        zzfou.zze(map.isEmpty());
        this.zza = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzd(zzfqe zzfqeVar) {
        int i10 = zzfqeVar.zzb;
        zzfqeVar.zzb = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zze(zzfqe zzfqeVar) {
        int i10 = zzfqeVar.zzb;
        zzfqeVar.zzb = i10 - 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzf(zzfqe zzfqeVar, int i10) {
        int i11 = zzfqeVar.zzb + i10;
        zzfqeVar.zzb = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzg(zzfqe zzfqeVar, int i10) {
        int i11 = zzfqeVar.zzb - i10;
        zzfqeVar.zzb = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzq(zzfqe zzfqeVar, Object obj) {
        Object obj2;
        try {
            obj2 = zzfqeVar.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfqeVar.zzb -= size;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Collection zza();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection zzb(Collection collection) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Collection zzc(Object obj, Collection collection) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfsf
    public final int zzh() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfqh
    final Collection zzi() {
        return new zzfqg(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfqh
    public final Iterator zzj() {
        return new zzfpo(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List zzk(Object obj, List list, zzfqb zzfqbVar) {
        if (list instanceof RandomAccess) {
            return new zzfpx(this, obj, list, zzfqbVar);
        }
        return new zzfqd(this, obj, list, zzfqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfqh
    Map zzm() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map zzn() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfpv(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfpy(this, (SortedMap) map);
        }
        return new zzfpr(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfqh
    Set zzo() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set zzp() {
        Map map = this.zza;
        if (map instanceof NavigableMap) {
            return new zzfpw(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new zzfpz(this, (SortedMap) map);
        }
        return new zzfpu(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzfsf
    public final void zzr() {
        for (Collection collection : this.zza.values()) {
            collection.clear();
        }
        this.zza.clear();
        this.zzb = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfqh, com.google.android.gms.internal.ads.zzfsf
    public final boolean zzs(Object obj, Object obj2) {
        Collection collection = (Collection) this.zza.get(obj);
        if (collection == null) {
            Collection zza = zza();
            if (zza.add(obj2)) {
                this.zzb++;
                this.zza.put(obj, zza);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        } else if (collection.add(obj2)) {
            this.zzb++;
            return true;
        } else {
            return false;
        }
    }
}
