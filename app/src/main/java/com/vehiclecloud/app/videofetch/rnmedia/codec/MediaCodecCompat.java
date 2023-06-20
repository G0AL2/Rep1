package com.vehiclecloud.app.videofetch.rnmedia.codec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface MediaCodecCompat {

    /* loaded from: classes3.dex */
    public static class AfterLollipo implements MediaCodecCompat {
        private MediaCodec codec;

        public AfterLollipo(MediaCodec mediaCodec) {
            this.codec = mediaCodec;
            mediaCodec.start();
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public int dequeueInputBuffer(long j10) {
            return this.codec.dequeueInputBuffer(j10);
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j10) {
            return this.codec.dequeueOutputBuffer(bufferInfo, j10);
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public void flush() {
            this.codec.flush();
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public ByteBuffer getInputBuffer(int i10) {
            return this.codec.getInputBuffer(i10);
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public ByteBuffer getOutputBuffer(int i10) {
            return this.codec.getOutputBuffer(i10);
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public MediaFormat getOutputFormat() {
            return this.codec.getOutputFormat();
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public void onOutputBuffersChanged() {
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException {
            this.codec.queueInputBuffer(i10, i11, i12, j10, i13);
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public void release() {
            this.codec.release();
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public void releaseOutputBuffer(int i10, boolean z10) {
            this.codec.releaseOutputBuffer(i10, z10);
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public void start() {
            this.codec.start();
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public void stop() {
            this.codec.stop();
        }
    }

    /* loaded from: classes3.dex */
    public static class BeforeKitkatWatch extends AfterLollipo {
        private MediaCodec codec;
        private ByteBuffer[] inputBuffers;
        private ByteBuffer[] outputBuffers;

        public BeforeKitkatWatch(MediaCodec mediaCodec) {
            super(mediaCodec);
            this.codec = mediaCodec;
            mediaCodec.getInputBuffers();
            this.inputBuffers = mediaCodec.getInputBuffers();
            this.outputBuffers = mediaCodec.getOutputBuffers();
            mediaCodec.start();
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat.AfterLollipo, com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public ByteBuffer getInputBuffer(int i10) {
            return this.inputBuffers[i10];
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat.AfterLollipo, com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public ByteBuffer getOutputBuffer(int i10) {
            return this.outputBuffers[i10];
        }

        @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat.AfterLollipo, com.vehiclecloud.app.videofetch.rnmedia.codec.MediaCodecCompat
        public void onOutputBuffersChanged() {
            this.outputBuffers = this.codec.getOutputBuffers();
        }
    }

    int dequeueInputBuffer(long j10);

    int dequeueOutputBuffer(MediaCodec.BufferInfo bufferInfo, long j10);

    void flush();

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    void onOutputBuffersChanged();

    void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) throws MediaCodec.CryptoException;

    void release();

    void releaseOutputBuffer(int i10, boolean z10);

    void start();

    void stop();
}
