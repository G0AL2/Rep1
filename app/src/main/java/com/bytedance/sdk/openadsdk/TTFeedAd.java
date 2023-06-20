package com.bytedance.sdk.openadsdk;

/* loaded from: classes.dex */
public interface TTFeedAd extends TTNativeAd {

    /* loaded from: classes.dex */
    public interface VideoAdListener {
        void onProgressUpdate(long j10, long j11);

        void onVideoAdComplete(TTFeedAd tTFeedAd);

        void onVideoAdContinuePlay(TTFeedAd tTFeedAd);

        void onVideoAdPaused(TTFeedAd tTFeedAd);

        void onVideoAdStartPlay(TTFeedAd tTFeedAd);

        void onVideoError(int i10, int i11);

        void onVideoLoad(TTFeedAd tTFeedAd);
    }

    double currentPlayTime();

    double getVideoDuration();

    void pause();

    void play();

    void setVideoAdListener(VideoAdListener videoAdListener);
}
