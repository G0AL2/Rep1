package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaaz implements zzyu {
    private final long zzb;
    private final zzyu zzc;

    public zzaaz(long j10, zzyu zzyuVar) {
        this.zzb = j10;
        this.zzc = zzyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzB() {
        this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final void zzL(zzzu zzzuVar) {
        this.zzc.zzL(new zzaay(this, zzzuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzyu
    public final zzzy zzv(int i10, int i11) {
        return this.zzc.zzv(i10, i11);
    }
}
