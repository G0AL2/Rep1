package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfoh implements zzfov {
    public static zzfoh zzc(char c10) {
        return new zzfoe(c10);
    }

    @Override // com.google.android.gms.internal.ads.zzfov
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c10);
}
