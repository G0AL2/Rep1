package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcka extends zzcju implements zzayy {
    private String zzd;
    private final zzchq zze;
    private boolean zzf;
    private final zzcjz zzg;
    private final zzcjf zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcka(zzchr zzchrVar, zzchq zzchqVar) {
        super(zzchrVar);
        this.zze = zzchqVar;
        this.zzg = new zzcjz();
        this.zzh = new zzcjf();
        this.zzk = new Object();
        this.zzl = zzchrVar != null ? zzchrVar.zzt() : "";
        this.zzm = zzchrVar != null ? zzchrVar.zzh() : 0;
    }

    protected static final String zzt(String str) {
        return "cache:".concat(String.valueOf(zzcfb.zze(str)));
    }

    private final void zzu() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round(zza2 * (position / zza));
        boolean z10 = round > 0;
        int zzs = zzchi.zzs();
        int zzu = zzchi.zzu();
        String str = this.zzd;
        zzf(str, zzt(str), position, zza, round, zza2, z10, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzb() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzayy
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzayy
    public final /* bridge */ /* synthetic */ void zzk(Object obj, zzayl zzaylVar) {
        this.zzg.zzb((zzayn) obj);
    }

    public final ByteBuffer zzl() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzm() {
        return this.zzn;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:? -> B:44:0x0140). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcju
    public final boolean zzq(String str) {
        String str2;
        this.zzd = str;
        String zzt = zzt(str);
        String str3 = "error";
        try {
            String str4 = this.zzb;
            zzchq zzchqVar = this.zze;
            zzayj zzaynVar = new zzayn(str4, null, this, zzchqVar.zzd, zzchqVar.zzf, true, null);
            if (this.zze.zzj) {
                zzaynVar = new zzcin(this.zza, zzaynVar, this.zzl, this.zzm, null, null, null);
            }
            zzaynVar.zzb(new zzayl(Uri.parse(str), null, 0L, 0L, -1L, null, 0));
            zzchr zzchrVar = (zzchr) this.zzc.get();
            if (zzchrVar != null) {
                zzchrVar.zzv(zzt, this);
            }
            Clock zzA = com.google.android.gms.ads.internal.zzt.zzA();
            long currentTimeMillis = zzA.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzw)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzv)).longValue();
            this.zzi = ByteBuffer.allocate(this.zze.zzc);
            int i10 = Constants.BUFFER_SIZE;
            byte[] bArr = new byte[Constants.BUFFER_SIZE];
            long j10 = currentTimeMillis;
            while (true) {
                int zza = zzaynVar.zza(bArr, 0, Math.min(this.zzi.remaining(), i10));
                zzayj zzayjVar = zzaynVar;
                if (zza == -1) {
                    this.zzn = true;
                    zze(str, zzt, (int) this.zzh.zza(this.zzi));
                    return true;
                }
                synchronized (this.zzk) {
                    try {
                        if (this.zzf) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            str3 = null;
                            try {
                                this.zzi.put(bArr, 0, zza);
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                        try {
                            if (this.zzi.remaining() <= 0) {
                                zzu();
                                return true;
                            }
                            try {
                                if (!this.zzf) {
                                    long currentTimeMillis2 = zzA.currentTimeMillis();
                                    if (currentTimeMillis2 - j10 >= longValue) {
                                        zzu();
                                        j10 = currentTimeMillis2;
                                    }
                                    if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                                        throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                                    }
                                    zzaynVar = zzayjVar;
                                    str3 = str2;
                                    i10 = Constants.BUFFER_SIZE;
                                } else {
                                    throw new IOException("Precache abort at " + this.zzi.limit() + " bytes");
                                }
                            } catch (Exception e10) {
                                e = e10;
                                String str5 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                                zzcfi.zzj("Failed to preload url " + str + " Exception: " + str5);
                                zzc(str, zzt, str3, str5);
                                return false;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str3 = str2;
                            String str52 = e.getClass().getCanonicalName() + ":" + e.getMessage();
                            zzcfi.zzj("Failed to preload url " + str + " Exception: " + str52);
                            zzc(str, zzt, str3, str52);
                            return false;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (Exception e12) {
            e = e12;
            str2 = str3;
        }
    }
}
