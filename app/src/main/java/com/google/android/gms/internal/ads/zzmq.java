package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.ads.AdError;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Constants;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzmq implements zzkk, zzmr {
    private final Context zza;
    private final zzms zzb;
    private final PlaybackSession zzc;
    private String zzi;
    private PlaybackMetrics.Builder zzj;
    private int zzk;
    private zzbr zzn;
    private zzmp zzo;
    private zzmp zzp;
    private zzmp zzq;
    private zzad zzr;
    private zzad zzs;
    private zzad zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final zzch zze = new zzch();
    private final zzcf zzf = new zzcf();
    private final HashMap zzh = new HashMap();
    private final HashMap zzg = new HashMap();
    private final long zzd = SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzmq(Context context, PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        zzmo zzmoVar = new zzmo(zzmo.zza);
        this.zzb = zzmoVar;
        zzmoVar.zzg(this);
    }

    public static zzmq zzb(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new zzmq(context, mediaMetricsManager.createPlaybackSession());
    }

    @SuppressLint({"SwitchIntDef"})
    private static int zzr(int i10) {
        switch (zzeg.zzl(i10)) {
            case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                return 24;
            case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            Long l10 = (Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l10 == null ? 0L : l10.longValue());
            Long l11 = (Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l11 == null ? 0L : l11.longValue());
            this.zzj.setStreamSource((l11 == null || l11.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j10, zzad zzadVar, int i10) {
        if (zzeg.zzS(this.zzs, zzadVar)) {
            return;
        }
        int i11 = this.zzs == null ? 1 : 0;
        this.zzs = zzadVar;
        zzx(0, j10, zzadVar, i11);
    }

    private final void zzu(long j10, zzad zzadVar, int i10) {
        if (zzeg.zzS(this.zzt, zzadVar)) {
            return;
        }
        int i11 = this.zzt == null ? 1 : 0;
        this.zzt = zzadVar;
        zzx(2, j10, zzadVar, i11);
    }

    private final void zzv(zzci zzciVar, zzsa zzsaVar) {
        int zza;
        PlaybackMetrics.Builder builder = this.zzj;
        if (zzsaVar == null || (zza = zzciVar.zza(zzsaVar.zza)) == -1) {
            return;
        }
        int i10 = 0;
        zzciVar.zzd(zza, this.zzf, false);
        zzciVar.zze(this.zzf.zzd, this.zze, 0L);
        zzaw zzawVar = this.zze.zzd.zzd;
        if (zzawVar != null) {
            int zzp = zzeg.zzp(zzawVar.zza);
            i10 = zzp != 0 ? zzp != 1 ? zzp != 2 ? 1 : 4 : 5 : 3;
        }
        builder.setStreamType(i10);
        zzch zzchVar = this.zze;
        if (zzchVar.zzn != -9223372036854775807L && !zzchVar.zzl && !zzchVar.zzi && !zzchVar.zzb()) {
            builder.setMediaDurationMillis(zzeg.zzz(this.zze.zzn));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j10, zzad zzadVar, int i10) {
        if (zzeg.zzS(this.zzr, zzadVar)) {
            return;
        }
        int i11 = this.zzr == null ? 1 : 0;
        this.zzr = zzadVar;
        zzx(1, j10, zzadVar, i11);
    }

    private final void zzx(int i10, long j10, zzad zzadVar, int i11) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i10).setTimeSinceCreatedMillis(j10 - this.zzd);
        if (zzadVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i11 != 1 ? 1 : 2);
            String str = zzadVar.zzl;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = zzadVar.zzm;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = zzadVar.zzj;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i12 = zzadVar.zzi;
            if (i12 != -1) {
                timeSinceCreatedMillis.setBitrate(i12);
            }
            int i13 = zzadVar.zzr;
            if (i13 != -1) {
                timeSinceCreatedMillis.setWidth(i13);
            }
            int i14 = zzadVar.zzs;
            if (i14 != -1) {
                timeSinceCreatedMillis.setHeight(i14);
            }
            int i15 = zzadVar.zzz;
            if (i15 != -1) {
                timeSinceCreatedMillis.setChannelCount(i15);
            }
            int i16 = zzadVar.zzA;
            if (i16 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i16);
            }
            String str4 = zzadVar.zzd;
            if (str4 != null) {
                String[] zzaf = zzeg.zzaf(str4, Constants.FILENAME_SEQUENCE_SEPARATOR);
                Pair create = Pair.create(zzaf[0], zzaf.length >= 2 ? zzaf[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f10 = zzadVar.zzt;
            if (f10 != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f10);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private final boolean zzy(zzmp zzmpVar) {
        return zzmpVar != null && zzmpVar.zzc.equals(this.zzb.zzd());
    }

    public final LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzc(zzki zzkiVar, String str) {
        zzsa zzsaVar = zzkiVar.zzd;
        if (zzsaVar == null || !zzsaVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-alpha03");
            zzv(zzkiVar.zzb, zzkiVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmr
    public final void zzd(zzki zzkiVar, String str, boolean z10) {
        zzsa zzsaVar = zzkiVar.zzd;
        if ((zzsaVar == null || !zzsaVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zze(zzki zzkiVar, zzad zzadVar, zzgm zzgmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzf(zzki zzkiVar, int i10, long j10, long j11) {
        zzsa zzsaVar = zzkiVar.zzd;
        if (zzsaVar != null) {
            String zze = this.zzb.zze(zzkiVar.zzb, zzsaVar);
            Long l10 = (Long) this.zzh.get(zze);
            Long l11 = (Long) this.zzg.get(zze);
            this.zzh.put(zze, Long.valueOf((l10 == null ? 0L : l10.longValue()) + j10));
            this.zzg.put(zze, Long.valueOf((l11 != null ? l11.longValue() : 0L) + i10));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzg(zzki zzkiVar, zzrw zzrwVar) {
        zzsa zzsaVar = zzkiVar.zzd;
        if (zzsaVar == null) {
            return;
        }
        zzad zzadVar = zzrwVar.zzb;
        Objects.requireNonNull(zzadVar);
        zzmp zzmpVar = new zzmp(zzadVar, 0, this.zzb.zze(zzkiVar.zzb, zzsaVar));
        int i10 = zzrwVar.zza;
        if (i10 != 0) {
            if (i10 == 1) {
                this.zzp = zzmpVar;
                return;
            } else if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.zzq = zzmpVar;
                return;
            }
        }
        this.zzo = zzmpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzh(zzki zzkiVar, int i10, long j10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzkk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(com.google.android.gms.internal.ads.zzcb r21, com.google.android.gms.internal.ads.zzkj r22) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzmq.zzi(com.google.android.gms.internal.ads.zzcb, com.google.android.gms.internal.ads.zzkj):void");
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzj(zzki zzkiVar, zzrr zzrrVar, zzrw zzrwVar, IOException iOException, boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzk(zzki zzkiVar, int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzl(zzki zzkiVar, zzbr zzbrVar) {
        this.zzn = zzbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzm(zzki zzkiVar, zzca zzcaVar, zzca zzcaVar2, int i10) {
        if (i10 == 1) {
            this.zzu = true;
            i10 = 1;
        }
        this.zzk = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzn(zzki zzkiVar, Object obj, long j10) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzo(zzki zzkiVar, zzgl zzglVar) {
        this.zzw += zzglVar.zzg;
        this.zzx += zzglVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final /* synthetic */ void zzp(zzki zzkiVar, zzad zzadVar, zzgm zzgmVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzkk
    public final void zzq(zzki zzkiVar, zzcv zzcvVar) {
        zzmp zzmpVar = this.zzo;
        if (zzmpVar != null) {
            zzad zzadVar = zzmpVar.zza;
            if (zzadVar.zzs == -1) {
                zzab zzb = zzadVar.zzb();
                zzb.zzX(zzcvVar.zzc);
                zzb.zzF(zzcvVar.zzd);
                this.zzo = new zzmp(zzb.zzY(), 0, zzmpVar.zzc);
            }
        }
    }
}
