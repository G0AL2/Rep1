package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
final class zzgkl implements zzgly {
    private static final zzgkl zza = new zzgkl();

    private zzgkl() {
    }

    public static zzgkl zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgly
    public final zzglx zzb(Class cls) {
        if (zzgkq.class.isAssignableFrom(cls)) {
            try {
                return (zzglx) zzgkq.zzaA(cls.asSubclass(zzgkq.class)).zzb(3, null, null);
            } catch (Exception e10) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgly
    public final boolean zzc(Class cls) {
        return zzgkq.class.isAssignableFrom(cls);
    }
}
