package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfh  reason: invalid package */
/* loaded from: classes2.dex */
public abstract class zzfh extends zzfg {
    private final Class zza;

    /* JADX INFO: Access modifiers changed from: protected */
    @SafeVarargs
    public zzfh(Class cls, Class cls2, zzff... zzffVarArr) {
        super(cls, zzffVarArr);
        this.zza = cls2;
    }

    public abstract zzaaq zzg(zzaaq zzaaqVar) throws GeneralSecurityException;
}
