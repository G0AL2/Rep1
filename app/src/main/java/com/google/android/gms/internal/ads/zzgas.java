package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgas {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public zzgas(Class cls, zzgat... zzgatVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 <= 0; i10++) {
            zzgat zzgatVar = zzgatVarArr[i10];
            if (!hashMap.containsKey(zzgatVar.zzb())) {
                hashMap.put(zzgatVar.zzb(), zzgatVar);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgatVar.zzb().getCanonicalName())));
            }
        }
        this.zzc = zzgatVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzgar zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzgma zzb(zzgji zzgjiVar) throws zzglc;

    public abstract String zzc();

    public abstract void zzd(zzgma zzgmaVar) throws GeneralSecurityException;

    public int zze() {
        return 1;
    }

    public abstract int zzf();

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgma zzgmaVar, Class cls) throws GeneralSecurityException {
        zzgat zzgatVar = (zzgat) this.zzb.get(cls);
        if (zzgatVar != null) {
            return zzgatVar.zza(zzgmaVar);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
