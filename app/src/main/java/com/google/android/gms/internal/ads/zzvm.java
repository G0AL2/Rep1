package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzvm {
    private zzvl zza;
    private zzvu zzb;

    public boolean zzh() {
        throw null;
    }

    public abstract zzvn zzj(zzju[] zzjuVarArr, zzty zztyVar, zzsa zzsaVar, zzci zzciVar) throws zzgt;

    public abstract void zzk(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzvu zzl() {
        zzvu zzvuVar = this.zzb;
        zzcw.zzb(zzvuVar);
        return zzvuVar;
    }

    public final void zzm(zzvl zzvlVar, zzvu zzvuVar) {
        this.zza = zzvlVar;
        this.zzb = zzvuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzn() {
        zzvl zzvlVar = this.zza;
        if (zzvlVar != null) {
            zzvlVar.zzj();
        }
    }

    public final void zzo() {
        this.zza = null;
        this.zzb = null;
    }
}
