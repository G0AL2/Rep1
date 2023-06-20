package com.vehiclecloud.app.videofetch.rnmedia.codec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import com.vehiclecloud.app.videofetch.rnmedia.codec.QueuedMuxer;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface WritableMuxer {
    void setOutputFormat(QueuedMuxer.SampleType sampleType, MediaFormat mediaFormat);

    void writeSampleData(QueuedMuxer.SampleType sampleType, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);
}
