package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzft extends zzjy implements zzlk {
    private zzft() {
        super(zzfu.zzb());
    }

    public final zzft zza(long j10) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfu.zzd((zzfu) this.zza, j10);
        return this;
    }

    public final zzft zzb(String str) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzfu.zzc((zzfu) this.zza, str);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzft(zzfj zzfjVar) {
        super(zzfu.zzb());
    }
}
