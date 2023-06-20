package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzdzl extends Exception {
    private final int zza;

    public zzdzl(int i10) {
        this.zza = i10;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdzl(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    public zzdzl(int i10, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
