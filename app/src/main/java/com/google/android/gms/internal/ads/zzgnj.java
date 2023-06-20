package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgnj extends RuntimeException {
    public zzgnj(zzgma zzgmaVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzglc zza() {
        return new zzglc(getMessage());
    }
}
