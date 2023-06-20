package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzfpr extends zzfsd {
    final transient Map zza;
    final /* synthetic */ zzfqe zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpr(zzfqe zzfqeVar, Map map) {
        this.zzb = zzfqeVar;
        this.zza = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map;
        Map map2 = this.zza;
        zzfqe zzfqeVar = this.zzb;
        map = zzfqeVar.zza;
        if (map2 == map) {
            zzfqeVar.zzr();
        } else {
            zzfrt.zzb(new zzfpq(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.zza;
        Objects.requireNonNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.zza.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zzfse.zza(this.zza, obj);
        if (collection == null) {
            return null;
        }
        return this.zzb.zzc(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfsd, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.zzb.zzv();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.zza.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection zza = this.zzb.zza();
        zza.addAll(collection);
        zzfqe.zzg(this.zzb, collection.size());
        collection.clear();
        return zza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.zza.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.zza.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map.Entry zza(Map.Entry entry) {
        Object key = entry.getKey();
        return new zzfrf(key, this.zzb.zzc(key, (Collection) entry.getValue()));
    }

    @Override // com.google.android.gms.internal.ads.zzfsd
    protected final Set zzb() {
        return new zzfpp(this);
    }
}
