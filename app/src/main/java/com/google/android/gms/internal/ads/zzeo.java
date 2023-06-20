package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.net.URLDecoder;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeo extends zzek {
    private zzev zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzeo() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.zzd;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(zzeg.zzG(this.zzb), this.zzc, bArr, i10, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzevVar) throws IOException {
        zzi(zzevVar);
        this.zza = zzevVar;
        Uri uri = zzevVar.zza;
        String scheme = uri.getScheme();
        zzcw.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] zzaf = zzeg.zzaf(uri.getSchemeSpecificPart(), ",");
        if (zzaf.length == 2) {
            String str = zzaf[1];
            if (zzaf[0].contains(";base64")) {
                try {
                    this.zzb = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw zzbp.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e10);
                }
            } else {
                this.zzb = zzeg.zzZ(URLDecoder.decode(str, zzfoi.zza.name()));
            }
            long j10 = zzevVar.zzf;
            int length = this.zzb.length;
            if (j10 <= length) {
                int i10 = (int) j10;
                this.zzc = i10;
                int i11 = length - i10;
                this.zzd = i11;
                long j11 = zzevVar.zzg;
                if (j11 != -1) {
                    this.zzd = (int) Math.min(i11, j11);
                }
                zzj(zzevVar);
                long j12 = zzevVar.zzg;
                return j12 != -1 ? j12 : this.zzd;
            }
            this.zzb = null;
            throw new zzer(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        throw zzbp.zzb("Unexpected URI format: ".concat(String.valueOf(uri)), null);
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        zzev zzevVar = this.zza;
        if (zzevVar != null) {
            return zzevVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
