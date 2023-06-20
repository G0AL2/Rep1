package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.reflect.Type;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztr  reason: invalid package */
/* loaded from: classes2.dex */
public final class zztr {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zztr";

    private zztr() {
    }

    public static Object zza(String str, Type type) throws zzrm {
        if (type == String.class) {
            try {
                zzvh zzvhVar = new zzvh();
                zzvhVar.zzb(str);
                if (zzvhVar.zzd()) {
                    return zzvhVar.zzc();
                }
                throw new zzrm("No error message: " + str);
            } catch (Exception e10) {
                throw new zzrm("Json conversion failed! ".concat(String.valueOf(e10.getMessage())), e10);
            }
        } else if (type != Void.class) {
            try {
                zztt zzttVar = (zztt) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0]);
                try {
                    zzttVar.zza(str);
                    return zzttVar;
                } catch (Exception e11) {
                    throw new zzrm("Json conversion failed! ".concat(String.valueOf(e11.getMessage())), e11);
                }
            } catch (Exception e12) {
                throw new zzrm("Instantiation of JsonResponse failed! ".concat(type.toString()), e12);
            }
        } else {
            return null;
        }
    }
}
