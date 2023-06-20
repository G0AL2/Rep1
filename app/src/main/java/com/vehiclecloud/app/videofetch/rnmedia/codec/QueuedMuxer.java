package com.vehiclecloud.app.videofetch.rnmedia.codec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class QueuedMuxer implements WritableMuxer {
    private static final int BUFFER_SIZE = 1048576;
    private static final String TAG = "QueuedMuxer";
    private MediaFormat mAudioFormat;
    private int mAudioTrackIndex;
    private ByteBuffer mByteBuffer;
    private final MediaMuxer mMuxer;
    private final List<SampleInfo> mSampleInfoList = new ArrayList();
    private boolean mStarted;
    private MediaFormat mVideoFormat;
    private int mVideoTrackIndex;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.vehiclecloud.app.videofetch.rnmedia.codec.QueuedMuxer$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$vehiclecloud$app$videofetch$rnmedia$codec$QueuedMuxer$SampleType;

        static {
            int[] iArr = new int[SampleType.values().length];
            $SwitchMap$com$vehiclecloud$app$videofetch$rnmedia$codec$QueuedMuxer$SampleType = iArr;
            try {
                iArr[SampleType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$vehiclecloud$app$videofetch$rnmedia$codec$QueuedMuxer$SampleType[SampleType.AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class SampleInfo {
        private final int mFlags;
        private final long mPresentationTimeUs;
        private final SampleType mSampleType;
        private final int mSize;

        /* synthetic */ SampleInfo(SampleType sampleType, int i10, MediaCodec.BufferInfo bufferInfo, AnonymousClass1 anonymousClass1) {
            this(sampleType, i10, bufferInfo);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToBufferInfo(MediaCodec.BufferInfo bufferInfo, int i10) {
            bufferInfo.set(i10, this.mSize, this.mPresentationTimeUs, this.mFlags);
        }

        private SampleInfo(SampleType sampleType, int i10, MediaCodec.BufferInfo bufferInfo) {
            this.mSampleType = sampleType;
            this.mSize = i10;
            this.mPresentationTimeUs = bufferInfo.presentationTimeUs;
            this.mFlags = bufferInfo.flags;
        }
    }

    /* loaded from: classes3.dex */
    public enum SampleType {
        VIDEO,
        AUDIO
    }

    public QueuedMuxer(MediaMuxer mediaMuxer) {
        this.mMuxer = mediaMuxer;
    }

    private int getTrackIndexForSampleType(SampleType sampleType) {
        int i10 = AnonymousClass1.$SwitchMap$com$vehiclecloud$app$videofetch$rnmedia$codec$QueuedMuxer$SampleType[sampleType.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return this.mAudioTrackIndex;
            }
            throw new AssertionError();
        }
        return this.mVideoTrackIndex;
    }

    private void onSetOutputFormat() {
        MediaFormat mediaFormat = this.mVideoFormat;
        if (mediaFormat == null || this.mAudioFormat == null) {
            return;
        }
        this.mVideoTrackIndex = this.mMuxer.addTrack(mediaFormat);
        Log.v(TAG, "Added track #" + this.mVideoTrackIndex + " with " + this.mVideoFormat.getString("mime") + " to muxer");
        this.mAudioTrackIndex = this.mMuxer.addTrack(this.mAudioFormat);
        Log.v(TAG, "Added track #" + this.mAudioTrackIndex + " with " + this.mAudioFormat.getString("mime") + " to muxer");
        this.mMuxer.start();
        this.mStarted = true;
        int i10 = 0;
        if (this.mByteBuffer == null) {
            this.mByteBuffer = ByteBuffer.allocate(0);
        }
        this.mByteBuffer.flip();
        Log.v(TAG, "Output format determined, writing " + this.mSampleInfoList.size() + " samples / " + this.mByteBuffer.limit() + " bytes to muxer.");
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        for (SampleInfo sampleInfo : this.mSampleInfoList) {
            sampleInfo.writeToBufferInfo(bufferInfo, i10);
            this.mMuxer.writeSampleData(getTrackIndexForSampleType(sampleInfo.mSampleType), this.mByteBuffer, bufferInfo);
            i10 += sampleInfo.mSize;
        }
        this.mSampleInfoList.clear();
        this.mByteBuffer = null;
    }

    @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.WritableMuxer
    public void setOutputFormat(SampleType sampleType, MediaFormat mediaFormat) {
        if (this.mStarted) {
            return;
        }
        int i10 = AnonymousClass1.$SwitchMap$com$vehiclecloud$app$videofetch$rnmedia$codec$QueuedMuxer$SampleType[sampleType.ordinal()];
        if (i10 == 1) {
            this.mVideoFormat = mediaFormat;
        } else if (i10 == 2) {
            this.mAudioFormat = mediaFormat;
        } else {
            throw new AssertionError();
        }
        onSetOutputFormat();
    }

    @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.WritableMuxer
    public void writeSampleData(SampleType sampleType, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (this.mStarted) {
            this.mMuxer.writeSampleData(getTrackIndexForSampleType(sampleType), byteBuffer, bufferInfo);
            return;
        }
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        byteBuffer.position(bufferInfo.offset);
        if (this.mByteBuffer == null) {
            this.mByteBuffer = ByteBuffer.allocateDirect(BUFFER_SIZE).order(ByteOrder.nativeOrder());
        }
        this.mByteBuffer.put(byteBuffer);
        this.mSampleInfoList.add(new SampleInfo(sampleType, bufferInfo.size, bufferInfo, null));
    }
}
