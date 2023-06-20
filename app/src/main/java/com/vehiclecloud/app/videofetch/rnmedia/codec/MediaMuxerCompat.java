package com.vehiclecloud.app.videofetch.rnmedia.codec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.vehiclecloud.app.videofetch.rnmedia.codec.QueuedMuxer;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class MediaMuxerCompat implements WritableMuxer {
    private MediaMuxer muxer;
    private boolean started;
    private int trackId;

    public MediaMuxerCompat(MediaMuxer mediaMuxer) {
        this.muxer = mediaMuxer;
    }

    @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.WritableMuxer
    public void setOutputFormat(QueuedMuxer.SampleType sampleType, MediaFormat mediaFormat) {
        if (this.started) {
            return;
        }
        this.trackId = this.muxer.addTrack(mediaFormat);
        this.muxer.start();
        this.started = true;
    }

    @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.WritableMuxer
    public void writeSampleData(QueuedMuxer.SampleType sampleType, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.muxer.writeSampleData(this.trackId, byteBuffer, bufferInfo);
    }
}
