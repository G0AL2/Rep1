package com.vehiclecloud.app.videofetch.rnmedia.codec;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import java.io.IOException;

/* loaded from: classes3.dex */
public interface TrackTranscoder {

    /* loaded from: classes3.dex */
    public interface Listener {
        void onWriteSampleData(MediaCodec.BufferInfo bufferInfo);
    }

    int getExecutorTrackId();

    void release();

    long trans(MediaExtractor mediaExtractor, long j10, Listener listener) throws IOException;
}
