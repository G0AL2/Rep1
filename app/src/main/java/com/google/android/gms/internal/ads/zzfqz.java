package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfqz extends zzfra implements Map {
    @Override // java.util.Map
    public final void clear() {
        zzb().clear();
    }

    public boolean containsKey(Object obj) {
        return zzb().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return zzb().containsValue(obj);
    }

    public Set entrySet() {
        return zzb().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || zzb().equals(obj);
    }

    public Object get(Object obj) {
        return zzb().get(obj);
    }

    public int hashCode() {
        return zzb().hashCode();
    }

    public boolean isEmpty() {
        return zzb().isEmpty();
    }

    public Set keySet() {
        return zzb().keySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return zzb().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        zzb().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return zzb().remove(obj);
    }

    public int size() {
        return zzb().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return zzb().values();
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    protected /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    protected abstract Map zzb();

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zzc() {
        return zzfte.zza(entrySet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzd(Object obj) {
        zzfrz zzfrzVar = new zzfrz(entrySet().iterator());
        if (obj == null) {
            while (zzfrzVar.hasNext()) {
                if (zzfrzVar.next() == null) {
                    return true;
                }
            }
        } else {
            while (zzfrzVar.hasNext()) {
                if (obj.equals(zzfrzVar.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zze(Object obj) {
        return zzfse.zzb(this, obj);
    }
}
