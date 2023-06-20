package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgqv implements zzgqu, zzgqo {
    private static final zzgqv zza = new zzgqv(null);
    private final Object zzb;

    private zzgqv(Object obj) {
        this.zzb = obj;
    }

    public static zzgqu zza(Object obj) {
        zzgrc.zza(obj, "instance cannot be null");
        return new zzgqv(obj);
    }

    public static zzgqu zzc(Object obj) {
        return obj == null ? zza : new zzgqv(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zzb;
    }
}
