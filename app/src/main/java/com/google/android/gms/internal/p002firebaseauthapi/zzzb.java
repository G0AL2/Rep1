package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzb  reason: invalid package */
/* loaded from: classes2.dex */
final class zzzb {
    private static final zzyz zza = new zzza();
    private static final zzyz zzb;

    static {
        zzyz zzyzVar;
        try {
            zzyzVar = (zzyz) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzyzVar = null;
        }
        zzb = zzyzVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzyz zza() {
        zzyz zzyzVar = zzb;
        if (zzyzVar != null) {
            return zzyzVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzyz zzb() {
        return zza;
    }
}
