package com.vehiclecloud.app.videofetch.rnmedia.codec;

import android.media.MediaCodec;
import android.os.Build;
import com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat;

/* compiled from: MediaCodecCompat.java */
/* loaded from: classes3.dex */
public final /* synthetic */ class a {
    public static MediaCodecCompat a(MediaCodec mediaCodec) {
        return Build.VERSION.SDK_INT >= 21 ? new MediaCodecCompat.AfterLollipo(mediaCodec) : new MediaCodecCompat.BeforeKitkatWatch(mediaCodec);
    }
}
