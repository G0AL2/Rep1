package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzej extends zzek {
    private final AssetManager zza;
    private Uri zzb;
    private InputStream zzc;
    private long zzd;
    private boolean zze;

    public zzej(Context context) {
        super(false);
        this.zza = context.getAssets();
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) throws zzei {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzd;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e10) {
                    throw new zzei(e10, 2000);
                }
            }
            InputStream inputStream = this.zzc;
            int i12 = zzeg.zza;
            int read = inputStream.read(bArr, i10, i11);
            if (read == -1) {
                return -1;
            }
            long j11 = this.zzd;
            if (j11 != -1) {
                this.zzd = j11 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzevVar) throws zzei {
        try {
            Uri uri = zzevVar.zza;
            this.zzb = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            zzi(zzevVar);
            InputStream open = this.zza.open(path, 1);
            this.zzc = open;
            if (open.skip(zzevVar.zzf) >= zzevVar.zzf) {
                long j10 = zzevVar.zzg;
                if (j10 != -1) {
                    this.zzd = j10;
                } else {
                    long available = this.zzc.available();
                    this.zzd = available;
                    if (available == 2147483647L) {
                        this.zzd = -1L;
                    }
                }
                this.zze = true;
                zzj(zzevVar);
                return this.zzd;
            }
            throw new zzei(null, AdError.REMOTE_ADS_SERVICE_ERROR);
        } catch (zzei e10) {
            throw e10;
        } catch (IOException e11) {
            throw new zzei(e11, true != (e11 instanceof FileNotFoundException) ? 2000 : IronSourceConstants.IS_INSTANCE_OPENED);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzei {
        this.zzb = null;
        try {
            try {
                InputStream inputStream = this.zzc;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zzc = null;
                if (this.zze) {
                    this.zze = false;
                    zzh();
                }
            } catch (IOException e10) {
                throw new zzei(e10, 2000);
            }
        } catch (Throwable th) {
            this.zzc = null;
            if (this.zze) {
                this.zze = false;
                zzh();
            }
            throw th;
        }
    }
}
