package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@21.0.3 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabs  reason: invalid package */
/* loaded from: classes2.dex */
public final class zzabs extends RuntimeException {
    public zzabs(zzaaq zzaaqVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzzt zza() {
        return new zzzt(getMessage());
    }
}
