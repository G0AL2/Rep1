package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzen extends zzek {
    private final ContentResolver zza;
    private Uri zzb;
    private AssetFileDescriptor zzc;
    private FileInputStream zzd;
    private long zze;
    private boolean zzf;

    public zzen(Context context) {
        super(false);
        this.zza = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.zzp
    public final int zza(byte[] bArr, int i10, int i11) throws zzem {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.zze;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e10) {
                    throw new zzem(e10, 2000);
                }
            }
            FileInputStream fileInputStream = this.zzd;
            int i12 = zzeg.zza;
            int read = fileInputStream.read(bArr, i10, i11);
            if (read == -1) {
                return -1;
            }
            long j11 = this.zze;
            if (j11 != -1) {
                this.zze = j11 - read;
            }
            zzg(read);
            return read;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final long zzb(zzev zzevVar) throws zzem {
        int i10;
        AssetFileDescriptor openAssetFileDescriptor;
        long j10;
        try {
            try {
                Uri uri = zzevVar.zza;
                this.zzb = uri;
                zzi(zzevVar);
                if (AppLovinEventTypes.USER_VIEWED_CONTENT.equals(zzevVar.zza.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.zza.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.zza.openAssetFileDescriptor(uri, "r");
                }
                this.zzc = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.zzd = fileInputStream;
                    int i11 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                    if (i11 != 0 && zzevVar.zzf > length) {
                        throw new zzem(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(zzevVar.zzf + startOffset) - startOffset;
                    if (skip == zzevVar.zzf) {
                        if (i11 == 0) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.zze = -1L;
                                j10 = -1;
                            } else {
                                j10 = size - channel.position();
                                this.zze = j10;
                                if (j10 < 0) {
                                    throw new zzem(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                                }
                            }
                        } else {
                            j10 = length - skip;
                            this.zze = j10;
                            if (j10 < 0) {
                                throw new zzem(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                            }
                        }
                        long j11 = zzevVar.zzg;
                        if (j11 != -1) {
                            if (j10 != -1) {
                                j11 = Math.min(j10, j11);
                            }
                            this.zze = j11;
                        }
                        this.zzf = true;
                        zzj(zzevVar);
                        long j12 = zzevVar.zzg;
                        return j12 != -1 ? j12 : this.zze;
                    }
                    throw new zzem(null, AdError.REMOTE_ADS_SERVICE_ERROR);
                }
                i10 = 2000;
                try {
                    throw new zzem(new IOException("Could not open file descriptor for: " + String.valueOf(uri)), 2000);
                } catch (IOException e10) {
                    e = e10;
                    if (true == (e instanceof FileNotFoundException)) {
                        i10 = IronSourceConstants.IS_INSTANCE_OPENED;
                    }
                    throw new zzem(e, i10);
                }
            } catch (IOException e11) {
                e = e11;
                i10 = 2000;
            }
        } catch (zzem e12) {
            throw e12;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeq
    public final void zzd() throws zzem {
        this.zzb = null;
        try {
            try {
                FileInputStream fileInputStream = this.zzd;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e10) {
                        throw new zzem(e10, 2000);
                    }
                } finally {
                    this.zzc = null;
                    if (this.zzf) {
                        this.zzf = false;
                        zzh();
                    }
                }
            } catch (Throwable th) {
                this.zzd = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                        throw th;
                    } catch (Throwable th2) {
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzh();
                        }
                        throw th2;
                    }
                } catch (IOException e11) {
                    throw new zzem(e11, 2000);
                }
            }
        } catch (IOException e12) {
            throw new zzem(e12, 2000);
        }
    }
}
