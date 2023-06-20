package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.2 */
/* loaded from: classes2.dex */
public abstract class zzhc extends zzhb {
    private boolean zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzhc(zzgi zzgiVar) {
        super(zzgiVar);
        this.zzs.zzD();
    }

    protected void zzaB() {
    }

    protected abstract boolean zzf();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzu() {
        if (!zzx()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzv() {
        if (!this.zza) {
            if (zzf()) {
                return;
            }
            this.zzs.zzB();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    public final void zzw() {
        if (!this.zza) {
            zzaB();
            this.zzs.zzB();
            this.zza = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzx() {
        return this.zza;
    }
}
