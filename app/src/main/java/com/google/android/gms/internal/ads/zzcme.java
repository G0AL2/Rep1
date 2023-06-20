package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcme extends com.google.android.gms.ads.internal.client.zzdj {
    private final zzchr zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;
    private com.google.android.gms.ads.internal.client.zzdn zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbmj zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcme(zzchr zzchrVar, float f10, boolean z10, boolean z11) {
        this.zza = zzchrVar;
        this.zzi = f10;
        this.zzc = z10;
        this.zzd = z11;
    }

    private final void zzw(final int i10, final int i11, final boolean z10, final boolean z11) {
        zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmd
            @Override // java.lang.Runnable
            public final void run() {
                zzcme.this.zzd(i10, i11, z10, z11);
            }
        });
    }

    private final void zzx(String str, Map map) {
        final HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        zzcfv.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmc
            @Override // java.lang.Runnable
            public final void run() {
                zzcme.this.zzr(hashMap);
            }
        });
    }

    public final void zzc(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.zzb) {
            z11 = true;
            if (f11 == this.zzi && f12 == this.zzk) {
                z11 = false;
            }
            this.zzi = f11;
            this.zzj = f10;
            z12 = this.zzh;
            this.zzh = z10;
            i11 = this.zze;
            this.zze = i10;
            float f13 = this.zzk;
            this.zzk = f12;
            if (Math.abs(f12 - f13) > 1.0E-4f) {
                this.zza.zzH().invalidate();
            }
        }
        if (z11) {
            try {
                zzbmj zzbmjVar = this.zzn;
                if (zzbmjVar != null) {
                    zzbmjVar.zze();
                }
            } catch (RemoteException e10) {
                zzcfi.zzl("#007 Could not call remote method.", e10);
            }
        }
        zzw(i11, i10, z12, z10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        boolean z13;
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        com.google.android.gms.ads.internal.client.zzdn zzdnVar2;
        com.google.android.gms.ads.internal.client.zzdn zzdnVar3;
        synchronized (this.zzb) {
            boolean z14 = this.zzg;
            boolean z15 = false;
            if (z14 || i11 != 1) {
                i12 = i11;
                z12 = false;
            } else {
                i12 = 1;
                z12 = true;
            }
            if (i10 == i11 || i12 != 1) {
                z13 = false;
            } else {
                i12 = 1;
                z13 = true;
            }
            boolean z16 = i10 != i11 && i12 == 2;
            boolean z17 = i10 != i11 && i12 == 3;
            this.zzg = (z14 || z12) ? true : true;
            if (z12) {
                try {
                    com.google.android.gms.ads.internal.client.zzdn zzdnVar4 = this.zzf;
                    if (zzdnVar4 != null) {
                        zzdnVar4.zzi();
                    }
                } catch (RemoteException e10) {
                    zzcfi.zzl("#007 Could not call remote method.", e10);
                }
            }
            if (z13 && (zzdnVar3 = this.zzf) != null) {
                zzdnVar3.zzh();
            }
            if (z16 && (zzdnVar2 = this.zzf) != null) {
                zzdnVar2.zzg();
            }
            if (z17) {
                com.google.android.gms.ads.internal.client.zzdn zzdnVar5 = this.zzf;
                if (zzdnVar5 != null) {
                    zzdnVar5.zze();
                }
                this.zza.zzy();
            }
            if (z10 != z11 && (zzdnVar = this.zzf) != null) {
                zzdnVar.zzf(z11);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() {
        int i10;
        synchronized (this.zzb) {
            i10 = this.zze;
        }
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final com.google.android.gms.ads.internal.client.zzdn zzi() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        synchronized (this.zzb) {
            zzdnVar = this.zzf;
        }
        return zzdnVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z10) {
        zzx(true != z10 ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() {
        zzx("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() {
        zzx("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(com.google.android.gms.ads.internal.client.zzdn zzdnVar) {
        synchronized (this.zzb) {
            this.zzf = zzdnVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() {
        boolean z10;
        boolean zzp = zzp();
        synchronized (this.zzb) {
            z10 = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z10 = true;
                    }
                } finally {
                }
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = false;
            if (this.zzc && this.zzl) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzh;
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzff zzffVar) {
        boolean z10 = zzffVar.zza;
        boolean z11 = zzffVar.zzb;
        boolean z12 = zzffVar.zzc;
        synchronized (this.zzb) {
            this.zzl = z11;
            this.zzm = z12;
        }
        zzx("initialState", CollectionUtils.mapOf("muteStart", true != z10 ? "0" : "1", "customControlsRequested", true != z11 ? "0" : "1", "clickToExpandRequested", true != z12 ? "0" : "1"));
    }

    public final void zzt(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    public final void zzu() {
        boolean z10;
        int i10;
        synchronized (this.zzb) {
            z10 = this.zzh;
            i10 = this.zze;
            this.zze = 3;
        }
        zzw(i10, 3, z10, z10);
    }

    public final void zzv(zzbmj zzbmjVar) {
        synchronized (this.zzb) {
            this.zzn = zzbmjVar;
        }
    }
}
