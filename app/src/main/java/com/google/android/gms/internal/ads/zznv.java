package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zznv implements zzmy {
    protected zzmw zzb;
    protected zzmw zzc;
    private zzmw zzd;
    private zzmw zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zznv() {
        ByteBuffer byteBuffer = zzmy.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzmw zzmwVar = zzmw.zza;
        this.zzd = zzmwVar;
        this.zze = zzmwVar;
        this.zzb = zzmwVar;
        this.zzc = zzmwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final zzmw zza(zzmw zzmwVar) throws zzmx {
        this.zzd = zzmwVar;
        this.zze = zzi(zzmwVar);
        return zzg() ? this.zze : zzmw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzmy.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzc() {
        this.zzg = zzmy.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzf() {
        zzc();
        this.zzf = zzmy.zza;
        zzmw zzmwVar = zzmw.zza;
        this.zzd = zzmwVar;
        this.zze = zzmwVar;
        this.zzb = zzmwVar;
        this.zzc = zzmwVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public boolean zzg() {
        return this.zze != zzmw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public boolean zzh() {
        return this.zzh && this.zzg == zzmy.zza;
    }

    protected zzmw zzi(zzmw zzmwVar) throws zzmx {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer zzj(int i10) {
        if (this.zzf.capacity() < i10) {
            this.zzf = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    protected void zzk() {
    }

    protected void zzl() {
    }

    protected void zzm() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
