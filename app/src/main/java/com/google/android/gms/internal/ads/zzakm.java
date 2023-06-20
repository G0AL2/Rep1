package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzakm extends zzgqf {
    private static final zzgqm zza = zzgqm.zzb(zzakm.class);

    public zzakm(zzgqg zzgqgVar, zzakl zzaklVar) throws IOException {
        zzf(zzgqgVar, zzgqgVar.zzc(), zzaklVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgqf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzgqf
    public final String toString() {
        String obj = this.zzd.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(obj).length() + 7);
        sb2.append("model(");
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
