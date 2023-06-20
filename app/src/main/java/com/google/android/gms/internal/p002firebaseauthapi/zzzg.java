package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzg  reason: invalid package */
/* loaded from: classes2.dex */
final class zzzg implements zzaao {
    private static final zzzg zza = new zzzg();

    private zzzg() {
    }

    public static zzzg zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaao
    public final zzaan zzb(Class cls) {
        if (zzzl.class.isAssignableFrom(cls)) {
            try {
                return (zzaan) zzzl.zzv(cls.asSubclass(zzzl.class)).zzj(3, null, null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaao
    public final boolean zzc(Class cls) {
        return zzzl.class.isAssignableFrom(cls);
    }
}
