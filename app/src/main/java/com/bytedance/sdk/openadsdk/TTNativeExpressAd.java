package com.bytedance.sdk.openadsdk;

import android.app.Activity;
import android.view.View;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.multipro.b.a;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface TTNativeExpressAd extends TTClientBidding {

    /* loaded from: classes.dex */
    public interface AdInteractionListener extends ExpressAdInteractionListener {
        void onAdDismiss();
    }

    /* loaded from: classes.dex */
    public interface ExpressAdInteractionListener {
        void onAdClicked(View view, int i10);

        void onAdShow(View view, int i10);

        void onRenderFail(View view, String str, int i10);

        void onRenderSuccess(View view, float f10, float f11);
    }

    /* loaded from: classes.dex */
    public interface ExpressVideoAdListener {
        void onClickRetry();

        void onProgressUpdate(long j10, long j11);

        void onVideoAdComplete();

        void onVideoAdContinuePlay();

        void onVideoAdPaused();

        void onVideoAdStartPlay();

        void onVideoError(int i10, int i11);

        void onVideoLoad();
    }

    void destroy();

    String getAdCreativeToken();

    View getExpressAdView();

    List<FilterWord> getFilterWords();

    int getImageMode();

    int getInteractionType();

    Map<String, Object> getMediaExtraInfo();

    a getVideoModel();

    void render();

    void setCanInterruptVideoPlay(boolean z10);

    void setDislikeCallback(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback);

    @Deprecated
    void setDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract);

    void setExpressInteractionListener(AdInteractionListener adInteractionListener);

    void setExpressInteractionListener(ExpressAdInteractionListener expressAdInteractionListener);

    void setSlideIntervalTime(int i10);

    void setVideoAdListener(ExpressVideoAdListener expressVideoAdListener);

    void showInteractionExpressAd(Activity activity);
}
