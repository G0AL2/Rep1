package com.facebook.ads.redexgen.X;

import android.view.Surface;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public interface B6 {
    void onAudioSessionId(B5 b52, int i10);

    void onAudioUnderrun(B5 b52, int i10, long j10, long j11);

    void onDecoderDisabled(B5 b52, int i10, C0855Bw c0855Bw);

    void onDecoderEnabled(B5 b52, int i10, C0855Bw c0855Bw);

    void onDecoderInitialized(B5 b52, int i10, String str, long j10);

    void onDecoderInputFormatChanged(B5 b52, int i10, Format format);

    void onDownstreamFormatChanged(B5 b52, C0932Fn c0932Fn);

    void onDrmKeysLoaded(B5 b52);

    void onDrmKeysRemoved(B5 b52);

    void onDrmKeysRestored(B5 b52);

    void onDrmSessionManagerError(B5 b52, Exception exc);

    void onDroppedVideoFrames(B5 b52, int i10, long j10);

    void onLoadError(B5 b52, C0931Fm c0931Fm, C0932Fn c0932Fn, IOException iOException, boolean z10);

    void onLoadingChanged(B5 b52, boolean z10);

    void onMediaPeriodCreated(B5 b52);

    void onMediaPeriodReleased(B5 b52);

    void onMetadata(B5 b52, Metadata metadata);

    void onPlaybackParametersChanged(B5 b52, C0815Ah c0815Ah);

    void onPlayerError(B5 b52, AM am);

    void onPlayerStateChanged(B5 b52, boolean z10, int i10);

    void onPositionDiscontinuity(B5 b52, int i10);

    void onReadingStarted(B5 b52);

    void onRenderedFirstFrame(B5 b52, Surface surface);

    void onSeekProcessed(B5 b52);

    void onSeekStarted(B5 b52);

    void onTimelineChanged(B5 b52, int i10);

    void onTracksChanged(B5 b52, TrackGroupArray trackGroupArray, HR hr);

    void onVideoSizeChanged(B5 b52, int i10, int i11, int i12, float f10);
}
