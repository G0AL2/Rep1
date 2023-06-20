package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzglu extends LinkedHashMap {
    private static final zzglu zza;
    private boolean zzb;

    static {
        zzglu zzgluVar = new zzglu();
        zza = zzgluVar;
        zzgluVar.zzb = false;
    }

    private zzglu() {
        this.zzb = true;
    }

    public static zzglu zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            return zzgla.zzb((byte[]) obj);
        }
        if (!(obj instanceof zzgks)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private final void zzg() {
        if (!this.zzb) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        zzg();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                return true;
            }
            if (size() != map.size()) {
                return false;
            }
            Iterator it = entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!map.containsKey(entry.getKey())) {
                    return false;
                }
                Object value = entry.getValue();
                Object obj2 = map.get(entry.getKey());
                if ((value instanceof byte[]) && (obj2 instanceof byte[])) {
                    equals = Arrays.equals((byte[]) value, (byte[]) obj2);
                    continue;
                } else {
                    equals = value.equals(obj2);
                    continue;
                }
                if (!equals) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            i10 += zzf(entry.getValue()) ^ zzf(entry.getKey());
        }
        return i10;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        zzg();
        zzgla.zze(obj);
        zzgla.zze(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zzg();
        for (Object obj : map.keySet()) {
            zzgla.zze(obj);
            zzgla.zze(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzglu zzb() {
        return isEmpty() ? new zzglu() : new zzglu(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzglu zzgluVar) {
        zzg();
        if (zzgluVar.isEmpty()) {
            return;
        }
        putAll(zzgluVar);
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzglu(Map map) {
        super(map);
        this.zzb = true;
    }
}
