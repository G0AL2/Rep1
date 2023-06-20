package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzv  reason: invalid package */
/* loaded from: classes2.dex */
final class zzv {
    private static final Logger zza = Logger.getLogger(zzv.class.getName());
    private static final zzu zzb = new zzu(null);

    private zzv() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzo zza(String str) {
        return new zzr(Pattern.compile("[.-]"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzb(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzc(String str) {
        return str == null || str.isEmpty();
    }
}
