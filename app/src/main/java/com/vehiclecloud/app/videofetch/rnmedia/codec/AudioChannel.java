package com.vehiclecloud.app.videofetch.rnmedia.codec;

import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes3.dex */
class AudioChannel {
    public static final int BUFFER_INDEX_END_OF_STREAM = -1;
    private static final int BYTES_PER_SHORT = 2;
    private static final long MICROSECS_PER_SEC = 1000000;
    private MediaFormat mActualDecodedFormat;
    private final MediaCodecCompat mDecoder;
    private final MediaFormat mEncodeFormat;
    private final MediaCodecCompat mEncoder;
    private int mInputChannelCount;
    private int mInputSampleRate;
    private int mOutputChannelCount;
    private AudioRemixer mRemixer;
    private final Queue<AudioBuffer> mEmptyBuffers = new ArrayDeque();
    private final Queue<AudioBuffer> mFilledBuffers = new ArrayDeque();
    private final AudioBuffer mOverflowBuffer = new AudioBuffer();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class AudioBuffer {
        int bufferIndex;
        ShortBuffer data;
        long presentationTimeUs;

        private AudioBuffer() {
        }
    }

    public AudioChannel(MediaCodecCompat mediaCodecCompat, MediaCodecCompat mediaCodecCompat2, MediaFormat mediaFormat) {
        this.mDecoder = mediaCodecCompat;
        this.mEncoder = mediaCodecCompat2;
        this.mEncodeFormat = mediaFormat;
    }

    private long drainOverflow(ShortBuffer shortBuffer) {
        ShortBuffer shortBuffer2 = this.mOverflowBuffer.data;
        int limit = shortBuffer2.limit();
        int remaining = shortBuffer2.remaining();
        long sampleCountToDurationUs = this.mOverflowBuffer.presentationTimeUs + sampleCountToDurationUs(shortBuffer2.position(), this.mInputSampleRate, this.mOutputChannelCount);
        shortBuffer.clear();
        shortBuffer2.limit(shortBuffer.capacity());
        shortBuffer.put(shortBuffer2);
        if (remaining >= shortBuffer.capacity()) {
            shortBuffer2.clear().limit(0);
        } else {
            shortBuffer2.limit(limit);
        }
        return sampleCountToDurationUs;
    }

    private long remixAndMaybeFillOverflow(AudioBuffer audioBuffer, ShortBuffer shortBuffer) {
        ShortBuffer shortBuffer2 = audioBuffer.data;
        ShortBuffer shortBuffer3 = this.mOverflowBuffer.data;
        shortBuffer.clear();
        shortBuffer2.clear();
        if (shortBuffer2.remaining() > shortBuffer.remaining()) {
            shortBuffer2.limit(shortBuffer.capacity());
            this.mRemixer.remix(shortBuffer2, shortBuffer);
            shortBuffer2.limit(shortBuffer2.capacity());
            long sampleCountToDurationUs = sampleCountToDurationUs(shortBuffer2.position(), this.mInputSampleRate, this.mInputChannelCount);
            this.mRemixer.remix(shortBuffer2, shortBuffer3);
            shortBuffer3.flip();
            this.mOverflowBuffer.presentationTimeUs = audioBuffer.presentationTimeUs + sampleCountToDurationUs;
        } else {
            this.mRemixer.remix(shortBuffer2, shortBuffer);
        }
        return audioBuffer.presentationTimeUs;
    }

    private static long sampleCountToDurationUs(int i10, int i11, int i12) {
        return (i10 / (i11 * MICROSECS_PER_SEC)) / i12;
    }

    public void drainDecoderBufferAndQueue(int i10, long j10) {
        if (this.mActualDecodedFormat != null) {
            ByteBuffer outputBuffer = i10 == -1 ? null : this.mDecoder.getOutputBuffer(i10);
            AudioBuffer poll = this.mEmptyBuffers.poll();
            if (poll == null) {
                poll = new AudioBuffer();
            }
            poll.bufferIndex = i10;
            poll.presentationTimeUs = j10;
            poll.data = outputBuffer != null ? outputBuffer.asShortBuffer() : null;
            AudioBuffer audioBuffer = this.mOverflowBuffer;
            if (audioBuffer.data == null) {
                audioBuffer.data = ByteBuffer.allocateDirect(outputBuffer.capacity()).order(ByteOrder.nativeOrder()).asShortBuffer();
                this.mOverflowBuffer.data.clear().flip();
            }
            this.mFilledBuffers.add(poll);
            return;
        }
        throw new RuntimeException("Buffer received before format!");
    }

    public boolean feedEncoder(long j10) {
        int dequeueInputBuffer;
        ShortBuffer shortBuffer = this.mOverflowBuffer.data;
        boolean z10 = shortBuffer != null && shortBuffer.hasRemaining();
        if ((!this.mFilledBuffers.isEmpty() || z10) && (dequeueInputBuffer = this.mEncoder.dequeueInputBuffer(j10)) >= 0) {
            ShortBuffer asShortBuffer = this.mEncoder.getInputBuffer(dequeueInputBuffer).asShortBuffer();
            if (z10) {
                this.mEncoder.queueInputBuffer(dequeueInputBuffer, 0, asShortBuffer.position() * 2, drainOverflow(asShortBuffer), 0);
                return true;
            }
            AudioBuffer poll = this.mFilledBuffers.poll();
            if (poll.bufferIndex == -1) {
                this.mEncoder.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                return false;
            }
            this.mEncoder.queueInputBuffer(dequeueInputBuffer, 0, asShortBuffer.position() * 2, remixAndMaybeFillOverflow(poll, asShortBuffer), 0);
            this.mDecoder.releaseOutputBuffer(poll.bufferIndex, false);
            this.mEmptyBuffers.add(poll);
            return true;
        }
        return false;
    }

    public void setActualDecodedFormat(MediaFormat mediaFormat) {
        this.mActualDecodedFormat = mediaFormat;
        int integer = mediaFormat.getInteger("sample-rate");
        this.mInputSampleRate = integer;
        if (integer == this.mEncodeFormat.getInteger("sample-rate")) {
            this.mInputChannelCount = this.mActualDecodedFormat.getInteger("channel-count");
            int integer2 = this.mEncodeFormat.getInteger("channel-count");
            this.mOutputChannelCount = integer2;
            int i10 = this.mInputChannelCount;
            if (i10 != 1 && i10 != 2) {
                throw new UnsupportedOperationException("Input channel count (" + this.mInputChannelCount + ") not supported.");
            } else if (integer2 != 1 && integer2 != 2) {
                throw new UnsupportedOperationException("Output channel count (" + this.mOutputChannelCount + ") not supported.");
            } else {
                if (i10 > integer2) {
                    this.mRemixer = AudioRemixer.DOWNMIX;
                } else if (i10 < integer2) {
                    this.mRemixer = AudioRemixer.UPMIX;
                } else {
                    this.mRemixer = AudioRemixer.PASSTHROUGH;
                }
                this.mOverflowBuffer.presentationTimeUs = 0L;
                return;
            }
        }
        throw new UnsupportedOperationException("Audio sample rate conversion not supported yet.");
    }
}
