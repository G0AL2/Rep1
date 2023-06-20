package com.google.android.gms.internal.ads;

import com.inmobi.media.fq;
import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzakr extends zzgqd {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzgqn zzm;
    private long zzn;

    public zzakr() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzgqn.zza;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zza + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgqb
    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzgqi.zza(zzakn.zzf(byteBuffer));
            this.zzh = zzgqi.zza(zzakn.zzf(byteBuffer));
            this.zzi = zzakn.zze(byteBuffer);
            this.zzj = zzakn.zzf(byteBuffer);
        } else {
            this.zza = zzgqi.zza(zzakn.zze(byteBuffer));
            this.zzh = zzgqi.zza(zzakn.zze(byteBuffer));
            this.zzi = zzakn.zze(byteBuffer);
            this.zzj = zzakn.zze(byteBuffer);
        }
        this.zzk = zzakn.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & fq.i.NETWORK_LOAD_LIMIT_DISABLED) | ((short) ((bArr[0] << 8) & 65280)))) / 256.0f;
        zzakn.zzd(byteBuffer);
        zzakn.zze(byteBuffer);
        zzakn.zze(byteBuffer);
        double zzb = zzakn.zzb(byteBuffer);
        double zzb2 = zzakn.zzb(byteBuffer);
        double zza = zzakn.zza(byteBuffer);
        this.zzm = new zzgqn(zzb, zzb2, zzakn.zzb(byteBuffer), zzakn.zzb(byteBuffer), zza, zzakn.zza(byteBuffer), zzakn.zza(byteBuffer), zzakn.zzb(byteBuffer), zzakn.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzakn.zze(byteBuffer);
    }
}
