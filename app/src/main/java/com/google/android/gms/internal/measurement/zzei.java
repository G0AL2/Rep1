package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzei extends zzjy implements zzlk {
    private zzei() {
        super(zzej.zzd());
    }

    public final int zza() {
        return ((zzej) this.zza).zza();
    }

    public final zzei zzb(String str) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzej.zzi((zzej) this.zza, str);
        return this;
    }

    public final zzei zzc(int i10, zzel zzelVar) {
        if (this.zzb) {
            zzaI();
            this.zzb = false;
        }
        zzej.zzj((zzej) this.zza, i10, zzelVar);
        return this;
    }

    public final zzel zzd(int i10) {
        return ((zzej) this.zza).zze(i10);
    }

    public final String zze() {
        return ((zzej) this.zza).zzg();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzei(zzef zzefVar) {
        super(zzej.zzd());
    }
}
