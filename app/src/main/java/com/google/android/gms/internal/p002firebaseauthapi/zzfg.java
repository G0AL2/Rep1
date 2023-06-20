package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfg  reason: invalid package */
/* loaded from: classes2.dex */
public abstract class zzfg {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public zzfg(Class cls, zzff... zzffVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 <= 0; i10++) {
            zzff zzffVar = zzffVarArr[i10];
            if (!hashMap.containsKey(zzffVar.zzb())) {
                hashMap.put(zzffVar.zzb(), zzffVar);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzffVar.zzb().getCanonicalName())));
            }
        }
        this.zzc = zzffVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzfe zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzaaq zzb(zzyi zzyiVar) throws zzzt;

    public abstract String zzc();

    public abstract void zzd(zzaaq zzaaqVar) throws GeneralSecurityException;

    public int zze() {
        return 1;
    }

    public abstract int zzf();

    public final Class zzj() {
        return this.zzc;
    }

    public final Class zzk() {
        return this.zza;
    }

    public final Object zzl(zzaaq zzaaqVar, Class cls) throws GeneralSecurityException {
        zzff zzffVar = (zzff) this.zzb.get(cls);
        if (zzffVar != null) {
            return zzffVar.zza(zzaaqVar);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    public final Set zzm() {
        return this.zzb.keySet();
    }
}
