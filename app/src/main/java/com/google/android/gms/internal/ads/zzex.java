package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzex implements zzeq {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzeq zzc;
    private zzeq zzd;
    private zzeq zze;
    private zzeq zzf;
    private zzeq zzg;
    private zzeq zzh;
    private zzeq zzi;
    private zzeq zzj;
    private zzeq zzk;

    public zzex(Context context, zzeq zzeqVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzeqVar;
    }

    private final zzeq zzg() {
        if (this.zze == null) {
            zzej zzejVar = new zzej(this.zza);
            this.zze = zzejVar;
            zzh(zzejVar);
        }
        return this.zze;
    }

    private final void zzh(zzeq zzeqVar) {
        for (int i10 = 0; i10 < this.zzb.size(); i10++) {
            zzeqVar.zzf((zzfs) this.zzb.get(i10));
        }
    }

    private static final void zzi(zzeq zzeqVar, zzfs zzfsVar) {
        if (zzeqVar != null) {
            zzeqVar.zzf(zzfsVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        zzeq zzeqVar = this.zzk;
        Objects.requireNonNull(zzeqVar);
        return zzeqVar.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzevVar) throws IOException {
        zzeq zzeqVar;
        zzcw.zzf(this.zzk == null);
        String scheme = zzevVar.zza.getScheme();
        if (zzeg.zzV(zzevVar.zza)) {
            String path = zzevVar.zza.getPath();
            if (path != null && path.startsWith("/android_asset/")) {
                this.zzk = zzg();
            } else {
                if (this.zzd == null) {
                    zzfg zzfgVar = new zzfg();
                    this.zzd = zzfgVar;
                    zzh(zzfgVar);
                }
                this.zzk = this.zzd;
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzg();
        } else if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(scheme)) {
            if (this.zzf == null) {
                zzen zzenVar = new zzen(this.zza);
                this.zzf = zzenVar;
                zzh(zzenVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzeq zzeqVar2 = (zzeq) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.zzg = zzeqVar2;
                    zzh(zzeqVar2);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating RTMP extension", e10);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzfu zzfuVar = new zzfu(2000);
                this.zzh = zzfuVar;
                zzh(zzfuVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzeo zzeoVar = new zzeo();
                this.zzi = zzeoVar;
                zzh(zzeoVar);
            }
            this.zzk = this.zzi;
        } else {
            if (!"rawresource".equals(scheme) && !"android.resource".equals(scheme)) {
                zzeqVar = this.zzc;
            } else {
                if (this.zzj == null) {
                    zzfq zzfqVar = new zzfq(this.zza);
                    this.zzj = zzfqVar;
                    zzh(zzfqVar);
                }
                zzeqVar = this.zzj;
            }
            this.zzk = zzeqVar;
        }
        return this.zzk.zzb(zzevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        zzeq zzeqVar = this.zzk;
        if (zzeqVar == null) {
            return null;
        }
        return zzeqVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws IOException {
        zzeq zzeqVar = this.zzk;
        if (zzeqVar != null) {
            try {
                zzeqVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeq, com.google.android.gms.internal.ads.zzfn
    public final Map zze() {
        zzeq zzeqVar = this.zzk;
        return zzeqVar == null ? Collections.emptyMap() : zzeqVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzf(zzfs zzfsVar) {
        Objects.requireNonNull(zzfsVar);
        this.zzc.zzf(zzfsVar);
        this.zzb.add(zzfsVar);
        zzi(this.zzd, zzfsVar);
        zzi(this.zze, zzfsVar);
        zzi(this.zzf, zzfsVar);
        zzi(this.zzg, zzfsVar);
        zzi(this.zzh, zzfsVar);
        zzi(this.zzi, zzfsVar);
        zzi(this.zzj, zzfsVar);
    }
}
