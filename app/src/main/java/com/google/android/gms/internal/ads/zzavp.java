package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import com.vehiclecloud.app.videofetch.rnmedia.codec.AudioTrackTranscoder;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@TargetApi(16)
/* loaded from: classes2.dex */
public final class zzavp {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final boolean zzd;
    private final String zze;
    private final MediaCodecInfo.CodecCapabilities zzf;

    private zzavp(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        Objects.requireNonNull(str);
        this.zza = str;
        this.zze = str2;
        this.zzf = codecCapabilities;
        boolean z12 = true;
        this.zzb = !z10 && codecCapabilities != null && zzazo.zza >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.zzc = codecCapabilities != null && zzazo.zza >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z11 && (codecCapabilities == null || zzazo.zza < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z12 = false;
        }
        this.zzd = z12;
    }

    public static zzavp zza(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11) {
        return new zzavp(str, str2, codecCapabilities, z10, z11);
    }

    public static zzavp zzb(String str) {
        return new zzavp("OMX.google.raw.decoder", null, null, false, false);
    }

    private final void zzh(String str) {
        String str2 = this.zza;
        String str3 = this.zze;
        String str4 = zzazo.zze;
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + str2 + ", " + str3 + "] [" + str4 + "]");
    }

    @TargetApi(21)
    private static boolean zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        if (d10 != -1.0d && d10 > 0.0d) {
            return videoCapabilities.areSizeAndRateSupported(i10, i11, d10);
        }
        return videoCapabilities.isSizeSupported(i10, i11);
    }

    @TargetApi(21)
    public final boolean zzc(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzh("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() < i10) {
            zzh("channelCount.support, " + i10);
            return false;
        } else {
            return true;
        }
    }

    @TargetApi(21)
    public final boolean zzd(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            zzh("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        } else {
            zzh("sampleRate.support, " + i10);
            return false;
        }
    }

    public final boolean zze(String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] zzg;
        if (str == null || this.zze == null) {
            return true;
        }
        String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            str2 = "video/avc";
        } else if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            str2 = "video/hevc";
        } else if (trim.startsWith("vp9")) {
            str2 = "video/x-vnd.on2.vp9";
        } else if (trim.startsWith("vp8")) {
            str2 = "video/x-vnd.on2.vp8";
        } else if (trim.startsWith("mp4a")) {
            str2 = AudioTrackTranscoder.MIMETYPE_AUDIO_AAC;
        } else if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
            str2 = "audio/ac3";
        } else if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
            str2 = "audio/eac3";
        } else if (trim.startsWith("dtsc") || trim.startsWith("dtse")) {
            str2 = "audio/vnd.dts";
        } else if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
            str2 = "audio/vnd.dts.hd";
        } else if (trim.startsWith("opus")) {
            str2 = "audio/opus";
        } else {
            str2 = trim.startsWith("vorbis") ? "audio/vorbis" : null;
        }
        if (str2 == null) {
            return true;
        }
        if (!this.zze.equals(str2)) {
            zzh("codec.mime " + str + ", " + str2);
            return false;
        }
        Pair zzb = zzawb.zzb(str);
        if (zzb == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzg()) {
            if (codecProfileLevel.profile == ((Integer) zzb.first).intValue() && codecProfileLevel.level >= ((Integer) zzb.second).intValue()) {
                return true;
            }
        }
        zzh("codec.profileLevel, " + str + ", " + str2);
        return false;
    }

    @TargetApi(21)
    public final boolean zzf(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        if (codecCapabilities == null) {
            zzh("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzh("sizeAndRate.vCaps");
            return false;
        } else if (zzi(videoCapabilities, i10, i11, d10)) {
            return true;
        } else {
            if (i10 < i11 && zzi(videoCapabilities, i11, i10, d10)) {
                String str = this.zza;
                String str2 = this.zze;
                String str3 = zzazo.zze;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AssumedSupport [");
                sb2.append("sizeAndRate.rotated, " + i10 + "x" + i11 + "x" + d10);
                sb2.append("] [");
                sb2.append(str);
                sb2.append(", ");
                sb2.append(str2);
                sb2.append("] [");
                sb2.append(str3);
                sb2.append("]");
                Log.d("MediaCodecInfo", sb2.toString());
                return true;
            }
            zzh("sizeAndRate.support, " + i10 + "x" + i11 + "x" + d10);
            return false;
        }
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzg() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzf;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }
}
