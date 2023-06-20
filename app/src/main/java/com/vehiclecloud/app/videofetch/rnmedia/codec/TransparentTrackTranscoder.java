package com.vehiclecloud.app.videofetch.rnmedia.codec;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.vehiclecloud.app.videofetch.rnmedia.codec.QueuedMuxer;
import com.vehiclecloud.app.videofetch.rnmedia.codec.TrackTranscoder;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class TransparentTrackTranscoder extends AbstractTrackTranscoder {
    private static final int MAX_SAMPLE_SIZE = 262144;
    private MediaCodec.BufferInfo bufferInfo;
    private ByteBuffer dstBuf;
    private WritableMuxer muxer;
    private QueuedMuxer.SampleType simpleType;

    public TransparentTrackTranscoder(int i10, WritableMuxer writableMuxer, MediaFormat mediaFormat, QueuedMuxer.SampleType sampleType) {
        super(i10);
        this.bufferInfo = new MediaCodec.BufferInfo();
        this.dstBuf = ByteBuffer.allocate(MAX_SAMPLE_SIZE);
        this.simpleType = sampleType;
        this.muxer = writableMuxer;
        writableMuxer.setOutputFormat(sampleType, mediaFormat);
    }

    @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.TrackTranscoder
    public void release() {
    }

    @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.TrackTranscoder
    public long trans(MediaExtractor mediaExtractor, long j10, TrackTranscoder.Listener listener) {
        long j11 = j10;
        while (true) {
            MediaCodec.BufferInfo bufferInfo = this.bufferInfo;
            bufferInfo.offset = 0;
            bufferInfo.size = mediaExtractor.readSampleData(this.dstBuf, 0);
            MediaCodec.BufferInfo bufferInfo2 = this.bufferInfo;
            if (bufferInfo2.size < 0) {
                bufferInfo2.size = 0;
                return bufferInfo2.presentationTimeUs;
            }
            bufferInfo2.presentationTimeUs = ((j11 <= 0 || mediaExtractor.getSampleTime() != 0) ? mediaExtractor.getSampleTime() : 100L) + j10;
            MediaCodec.BufferInfo bufferInfo3 = this.bufferInfo;
            if (bufferInfo3.presentationTimeUs >= j11) {
                bufferInfo3.flags = mediaExtractor.getSampleFlags();
                this.muxer.writeSampleData(this.simpleType, this.dstBuf, this.bufferInfo);
                if (listener != null) {
                    listener.onWriteSampleData(this.bufferInfo);
                }
                j11 = this.bufferInfo.presentationTimeUs;
            }
            mediaExtractor.advance();
        }
    }
}
