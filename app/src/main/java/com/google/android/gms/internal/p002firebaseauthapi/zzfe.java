package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfe  reason: invalid package */
/* loaded from: classes2.dex */
public abstract class zzfe {
    private final Class zza;

    public zzfe(Class cls) {
        this.zza = cls;
    }

    public abstract zzaaq zza(zzyi zzyiVar) throws zzzt;

    public abstract Object zzb(zzaaq zzaaqVar) throws GeneralSecurityException;

    public Map zzc() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzaaq zzaaqVar) throws GeneralSecurityException;

    public final Class zzg() {
        return this.zza;
    }
}
