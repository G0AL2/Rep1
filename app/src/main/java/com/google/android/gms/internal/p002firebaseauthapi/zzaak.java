package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaak  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzaak extends LinkedHashMap {
    private static final zzaak zza;
    private boolean zzb;

    static {
        zzaak zzaakVar = new zzaak();
        zza = zzaakVar;
        zzaakVar.zzb = false;
    }

    private zzaak() {
        this.zzb = true;
    }

    public static zzaak zza() {
        return zza;
    }

    private static int zzf(Object obj) {
        if (obj instanceof byte[]) {
            return zzzr.zzb((byte[]) obj);
        }
        if (!(obj instanceof zzzn)) {
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
        zzzr.zze(obj);
        zzzr.zze(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        zzg();
        for (Object obj : map.keySet()) {
            zzzr.zze(obj);
            zzzr.zze(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        zzg();
        return super.remove(obj);
    }

    public final zzaak zzb() {
        return isEmpty() ? new zzaak() : new zzaak(this);
    }

    public final void zzc() {
        this.zzb = false;
    }

    public final void zzd(zzaak zzaakVar) {
        zzg();
        if (zzaakVar.isEmpty()) {
            return;
        }
        putAll(zzaakVar);
    }

    public final boolean zze() {
        return this.zzb;
    }

    private zzaak(Map map) {
        super(map);
        this.zzb = true;
    }
}
