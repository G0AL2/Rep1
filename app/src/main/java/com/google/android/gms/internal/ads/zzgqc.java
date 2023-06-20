package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzgqc extends zzgqf implements zzako {
    zzakp zza;
    protected final String zzb = "moov";

    public zzgqc(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final void zzb(zzgqg zzgqgVar, ByteBuffer byteBuffer, long j10, zzakl zzaklVar) throws IOException {
        zzgqgVar.zzb();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzgqgVar;
        this.zzf = zzgqgVar.zzb();
        zzgqgVar.zze(zzgqgVar.zzb() + j10);
        this.zzg = zzgqgVar.zzb();
        this.zzc = zzaklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzako
    public final void zzc(zzakp zzakpVar) {
        this.zza = zzakpVar;
    }
}
