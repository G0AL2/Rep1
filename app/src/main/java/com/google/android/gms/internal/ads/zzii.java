package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzii implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzxq, zznk, zzua, zzra, zzgi, zzge, zzka, zzgu {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzim zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzii(zzim zzimVar, zzih zzihVar) {
        this.zza = zzimVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzim.zzN(this.zza, surfaceTexture);
        zzim.zzL(this.zza, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzim.zzO(this.zza, null);
        zzim.zzL(this.zza, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzim.zzL(this.zza, i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        zzim.zzL(this.zza, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzim.zzL(this.zza, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final /* synthetic */ void zza(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zzb(boolean z10) {
        zzim.zzQ(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzc(Exception exc) {
        zzim.zzC(this.zza).zzy(exc);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzd(String str, long j10, long j11) {
        zzim.zzC(this.zza).zzz(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zze(String str) {
        zzim.zzC(this.zza).zzA(str);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzf(zzgl zzglVar) {
        zzim.zzC(this.zza).zzB(zzglVar);
        zzim.zzF(this.zza, null);
        zzim.zzE(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzg(zzgl zzglVar) {
        zzim.zzE(this.zza, zzglVar);
        zzim.zzC(this.zza).zzC(zzglVar);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzh(zzad zzadVar, zzgm zzgmVar) {
        zzim.zzF(this.zza, zzadVar);
        zzim.zzC(this.zza).zzD(zzadVar, zzgmVar);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzi(long j10) {
        zzim.zzC(this.zza).zzE(j10);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzj(Exception exc) {
        zzim.zzC(this.zza).zzF(exc);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzk(int i10, long j10, long j11) {
        zzim.zzC(this.zza).zzG(i10, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzl(int i10, long j10) {
        zzim.zzC(this.zza).zzH(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzm(Object obj, long j10) {
        zzim.zzC(this.zza).zzI(obj, j10);
        zzim zzimVar = this.zza;
        if (zzim.zzD(zzimVar) == obj) {
            zzdm zzz = zzim.zzz(zzimVar);
            zzz.zzd(26, new zzdj() { // from class: com.google.android.gms.internal.ads.zzic
                @Override // com.google.android.gms.internal.ads.zzdj
                public final void zza(Object obj2) {
                    zzby zzbyVar = (zzby) obj2;
                }
            });
            zzz.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzn(final boolean z10) {
        zzim zzimVar = this.zza;
        if (zzim.zzaf(zzimVar) == z10) {
            return;
        }
        zzim.zzH(zzimVar, z10);
        zzdm zzz = zzim.zzz(this.zza);
        zzz.zzd(23, new zzdj() { // from class: com.google.android.gms.internal.ads.zzif
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzby) obj).zzq(z10);
            }
        });
        zzz.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzo(Exception exc) {
        zzim.zzC(this.zza).zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzp(String str, long j10, long j11) {
        zzim.zzC(this.zza).zzK(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzq(String str) {
        zzim.zzC(this.zza).zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzr(zzgl zzglVar) {
        zzim.zzC(this.zza).zzM(zzglVar);
        zzim.zzJ(this.zza, null);
        zzim.zzI(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzs(zzgl zzglVar) {
        zzim.zzI(this.zza, zzglVar);
        zzim.zzC(this.zza).zzN(zzglVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzt(long j10, int i10) {
        zzim.zzC(this.zza).zzO(j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzu(zzad zzadVar, zzgm zzgmVar) {
        zzim.zzJ(this.zza, zzadVar);
        zzim.zzC(this.zza).zzP(zzadVar, zzgmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzv(final zzcv zzcvVar) {
        zzim.zzK(this.zza, zzcvVar);
        zzdm zzz = zzim.zzz(this.zza);
        zzz.zzd(25, new zzdj() { // from class: com.google.android.gms.internal.ads.zzig
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzby) obj).zzu(zzcv.this);
            }
        });
        zzz.zzc();
    }
}
