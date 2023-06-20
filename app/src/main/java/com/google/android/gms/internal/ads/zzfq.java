package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfq extends zzek {
    private final Resources zza;
    private final String zzb;
    private Uri zzc;
    private AssetFileDescriptor zzd;
    private InputStream zze;
    private long zzf;
    private boolean zzg;

    public zzfq(Context context) {
        super(false);
        this.zza = context.getResources();
        this.zzb = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i10) {
        return Uri.parse("rawresource:///" + i10);
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) throws zzfp {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zzf;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e10) {
                    throw new zzfp(null, e10, 2000);
                }
            }
            InputStream inputStream = this.zze;
            int i12 = zzeg.zza;
            int read = inputStream.read(bArr, i10, i11);
            if (read == -1) {
                if (this.zzf == -1) {
                    return -1;
                }
                throw new zzfp("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
            long j11 = this.zzf;
            if (j11 != -1) {
                this.zzf = j11 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
        if (r3.matches("\\d+") != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155  */
    @Override // com.google.android.gms.internal.ads.zzeq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzb(com.google.android.gms.internal.ads.zzev r18) throws com.google.android.gms.internal.ads.zzfp {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfq.zzb(com.google.android.gms.internal.ads.zzev):long");
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzfp {
        this.zzc = null;
        try {
            try {
                InputStream inputStream = this.zze;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.zze = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzd;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new zzfp(null, e10, 2000);
                    }
                } finally {
                    this.zzd = null;
                    if (this.zzg) {
                        this.zzg = false;
                        zzh();
                    }
                }
            } catch (Throwable th) {
                this.zze = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.zzd;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.zzd = null;
                        if (this.zzg) {
                            this.zzg = false;
                            zzh();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.zzd = null;
                        if (this.zzg) {
                            this.zzg = false;
                            zzh();
                        }
                        throw th2;
                    }
                } catch (IOException e11) {
                    throw new zzfp(null, e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new zzfp(null, e12, 2000);
        }
    }
}
