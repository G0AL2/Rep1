package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzrb implements zzsc {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzsj zzc = new zzsj();
    private final zzpc zzd = new zzpc();
    private Looper zze;
    private zzci zzf;
    private zzmu zzg;

    @Override // com.google.android.gms.internal.ads.zzsc
    public final /* synthetic */ zzci zzG() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzmu zzb() {
        zzmu zzmuVar = this.zzg;
        zzcw.zzb(zzmuVar);
        return zzmuVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzpc zzc(zzsa zzsaVar) {
        return this.zzd.zza(0, zzsaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzpc zzd(int i10, zzsa zzsaVar) {
        return this.zzd.zza(i10, zzsaVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzsj zze(zzsa zzsaVar) {
        return this.zzc.zza(0, zzsaVar, 0L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzsj zzf(int i10, zzsa zzsaVar, long j10) {
        return this.zzc.zza(i10, zzsaVar, 0L);
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzg(Handler handler, zzpd zzpdVar) {
        Objects.requireNonNull(zzpdVar);
        this.zzd.zzb(handler, zzpdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzh(Handler handler, zzsk zzskVar) {
        Objects.requireNonNull(zzskVar);
        this.zzc.zzb(handler, zzskVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzi(zzsb zzsbVar) {
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzsbVar);
        if ((!isEmpty) && this.zzb.isEmpty()) {
            zzj();
        }
    }

    protected void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzk(zzsb zzsbVar) {
        Objects.requireNonNull(this.zze);
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.add(zzsbVar);
        if (isEmpty) {
            zzl();
        }
    }

    protected void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzm(zzsb zzsbVar, zzfs zzfsVar, zzmu zzmuVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z10 = true;
        if (looper != null && looper != myLooper) {
            z10 = false;
        }
        zzcw.zzd(z10);
        this.zzg = zzmuVar;
        zzci zzciVar = this.zzf;
        this.zza.add(zzsbVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzsbVar);
            zzn(zzfsVar);
        } else if (zzciVar != null) {
            zzk(zzsbVar);
            zzsbVar.zza(this, zzciVar);
        }
    }

    protected abstract void zzn(zzfs zzfsVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzo(zzci zzciVar) {
        this.zzf = zzciVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzsb) arrayList.get(i10)).zza(this, zzciVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzp(zzsb zzsbVar) {
        this.zza.remove(zzsbVar);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zzsbVar);
    }

    protected abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzr(zzpd zzpdVar) {
        this.zzd.zzc(zzpdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzs(zzsk zzskVar) {
        this.zzc.zzm(zzskVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzt() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final /* synthetic */ boolean zzu() {
        return true;
    }
}
