package com.vehiclecloud.app.videofetch.rnmedia.codec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import com.vehiclecloud.app.videofetch.rnmedia.RNMediaModule;
import com.vehiclecloud.app.videofetch.rnmedia.codec.QueuedMuxer;
import com.vehiclecloud.app.videofetch.rnmedia.codec.TrackTranscoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class AudioTrackTranscoder extends AbstractTrackTranscoder {
    private static final int DRAIN_STATE_CONSUMED = 2;
    private static final int DRAIN_STATE_NONE = 0;
    private static final int DRAIN_STATE_SHOULD_RETRY_IMMEDIATELY = 1;
    public static final String MIMETYPE_AUDIO_AAC = "audio/mp4a-latm";
    private static final int TIMEOUT_USEC = 0;
    private MediaCodec.BufferInfo deOutputBufferInfo;
    private MediaCodecCompat decoder;
    private final MediaFormat decoderInputFormat;
    private MediaCodec.BufferInfo enOutputBufferInfo;
    private MediaCodecCompat encoder;
    private AudioChannel mAudioChannel;
    private final int maxInputSize;
    private final WritableMuxer muxer;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class TransState {
        boolean decoded;
        long duration;
        boolean encoded;
        boolean extracted;
        boolean finished;

        private TransState() {
            this.extracted = false;
            this.decoded = false;
            this.encoded = false;
            this.finished = false;
            this.duration = 0L;
        }
    }

    public AudioTrackTranscoder(int i10, WritableMuxer writableMuxer, MediaFormat mediaFormat, int i11) {
        super(i10);
        this.muxer = writableMuxer;
        this.decoderInputFormat = mediaFormat;
        this.maxInputSize = i11;
    }

    private int drainDecoder(TransState transState) {
        if (transState.decoded) {
            return 0;
        }
        int dequeueOutputBuffer = this.decoder.dequeueOutputBuffer(this.deOutputBufferInfo, 0L);
        if (dequeueOutputBuffer != -3) {
            if (dequeueOutputBuffer != -2) {
                if (dequeueOutputBuffer != -1) {
                    MediaCodec.BufferInfo bufferInfo = this.deOutputBufferInfo;
                    if ((bufferInfo.flags & 4) != 0) {
                        transState.decoded = true;
                        this.mAudioChannel.drainDecoderBufferAndQueue(-1, 0L);
                        return 2;
                    } else if (bufferInfo.size > 0) {
                        this.mAudioChannel.drainDecoderBufferAndQueue(dequeueOutputBuffer, bufferInfo.presentationTimeUs);
                        return 2;
                    } else {
                        return 2;
                    }
                }
                return 0;
            }
            this.mAudioChannel.setActualDecodedFormat(this.decoder.getOutputFormat());
        }
        this.decoder.onOutputBuffersChanged();
        return 1;
    }

    private int drainEncoder(WritableMuxer writableMuxer, long j10, TransState transState, TrackTranscoder.Listener listener) {
        if (transState.encoded) {
            return 0;
        }
        int dequeueOutputBuffer = this.encoder.dequeueOutputBuffer(this.enOutputBufferInfo, 0L);
        if (dequeueOutputBuffer == -3) {
            this.encoder.onOutputBuffersChanged();
            return 1;
        } else if (dequeueOutputBuffer == -2) {
            writableMuxer.setOutputFormat(QueuedMuxer.SampleType.AUDIO, this.encoder.getOutputFormat());
            return 1;
        } else if (dequeueOutputBuffer != -1) {
            MediaCodec.BufferInfo bufferInfo = this.enOutputBufferInfo;
            int i10 = bufferInfo.flags;
            if ((i10 & 4) != 0) {
                transState.encoded = true;
                bufferInfo.set(0, 0, 0L, i10);
                transState.finished = true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.enOutputBufferInfo;
            if ((bufferInfo2.flags & 2) != 0) {
                this.encoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                return 1;
            }
            if (bufferInfo2.size > 0) {
                ByteBuffer outputBuffer = this.encoder.getOutputBuffer(dequeueOutputBuffer);
                MediaCodec.BufferInfo bufferInfo3 = this.enOutputBufferInfo;
                long j11 = bufferInfo3.presentationTimeUs;
                long j12 = transState.duration;
                long j13 = j10 + ((j12 <= 0 || j11 != 0) ? j11 : 100L);
                bufferInfo3.presentationTimeUs = j13;
                if (j13 >= j12) {
                    writableMuxer.writeSampleData(QueuedMuxer.SampleType.AUDIO, outputBuffer, bufferInfo3);
                    if (listener != null) {
                        listener.onWriteSampleData(this.enOutputBufferInfo);
                    }
                    transState.duration = this.enOutputBufferInfo.presentationTimeUs;
                }
                this.enOutputBufferInfo.presentationTimeUs = j11;
            }
            this.encoder.releaseOutputBuffer(dequeueOutputBuffer, false);
            return 2;
        } else {
            return 0;
        }
    }

    private int drainExtractor(MediaExtractor mediaExtractor, TransState transState) {
        if (transState.extracted) {
            return 0;
        }
        int sampleTrackIndex = mediaExtractor.getSampleTrackIndex();
        int dequeueInputBuffer = this.decoder.dequeueInputBuffer(0L);
        if (dequeueInputBuffer < 0) {
            return 0;
        }
        if (sampleTrackIndex < 0) {
            transState.extracted = true;
            this.decoder.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
            return 0;
        }
        this.decoder.queueInputBuffer(dequeueInputBuffer, 0, mediaExtractor.readSampleData(this.decoder.getInputBuffer(dequeueInputBuffer), 0), mediaExtractor.getSampleTime(), (mediaExtractor.getSampleFlags() & 1) != 0 ? 1 : 0);
        mediaExtractor.advance();
        return 2;
    }

    private static MediaFormat encodeFormatOf(MediaFormat mediaFormat, int i10) {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(MIMETYPE_AUDIO_AAC, 44100, 2);
        createAudioFormat.setInteger("aac-profile", 2);
        createAudioFormat.setInteger("bitrate", mediaFormat.containsKey("bitrate") ? mediaFormat.getInteger("bitrate") : 64000);
        if (i10 <= 0) {
            i10 = 2621440;
        }
        createAudioFormat.setInteger("max-input-size", i10);
        return createAudioFormat;
    }

    private void setup() throws IOException {
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(this.decoderInputFormat.getString("mime"));
        createDecoderByType.configure(this.decoderInputFormat, (Surface) null, (MediaCrypto) null, 0);
        this.decoder = a.a(createDecoderByType);
        this.deOutputBufferInfo = new MediaCodec.BufferInfo();
        MediaFormat encodeFormatOf = encodeFormatOf(createDecoderByType.getOutputFormat(), this.maxInputSize);
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType(encodeFormatOf.getString("mime"));
        createEncoderByType.configure(encodeFormatOf, (Surface) null, (MediaCrypto) null, 1);
        this.encoder = a.a(createEncoderByType);
        this.enOutputBufferInfo = new MediaCodec.BufferInfo();
        this.mAudioChannel = new AudioChannel(this.decoder, this.encoder, encodeFormatOf);
    }

    @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.TrackTranscoder
    public void release() {
        try {
            this.decoder.stop();
            this.decoder.release();
        } catch (Exception unused) {
        }
        try {
            this.encoder.stop();
            this.encoder.release();
        } catch (Exception e10) {
            Log.e(RNMediaModule.TAG, "AudioTrackTranscoder release encoder, get ex:", e10);
        }
    }

    @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.TrackTranscoder
    public long trans(MediaExtractor mediaExtractor, long j10, TrackTranscoder.Listener listener) throws IOException {
        TransState transState = new TransState();
        transState.duration = j10;
        try {
            setup();
            while (!transState.finished) {
                while (drainEncoder(this.muxer, j10, transState, listener) != 0) {
                }
                do {
                } while (drainDecoder(transState) == 1);
                while (this.mAudioChannel.feedEncoder(0L)) {
                }
                do {
                } while (drainExtractor(mediaExtractor, transState) != 0);
            }
            return transState.duration;
        } finally {
            release();
        }
    }
}
