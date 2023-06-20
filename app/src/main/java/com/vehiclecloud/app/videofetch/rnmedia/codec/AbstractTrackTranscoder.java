package com.vehiclecloud.app.videofetch.rnmedia.codec;

/* loaded from: classes3.dex */
public abstract class AbstractTrackTranscoder implements TrackTranscoder {
    private int executorTrackId;

    public AbstractTrackTranscoder(int i10) {
        this.executorTrackId = i10;
    }

    @Override // com.vehiclecloud.app.videofetch.rnmedia.codec.TrackTranscoder
    public int getExecutorTrackId() {
        return this.executorTrackId;
    }
}
