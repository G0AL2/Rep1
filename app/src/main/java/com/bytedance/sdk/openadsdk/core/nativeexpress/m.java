package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.app.Activity;
import android.view.View;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TTNativeExpressAdStub.java */
/* loaded from: classes.dex */
public class m implements TTNativeExpressAd {

    /* renamed from: g  reason: collision with root package name */
    public AtomicBoolean f12662g = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void destroy() {
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public String getAdCreativeToken() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public View getExpressAdView() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public List<FilterWord> getFilterWords() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public int getImageMode() {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public int getInteractionType() {
        return 0;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public Map<String, Object> getMediaExtraInfo() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public com.bytedance.sdk.openadsdk.multipro.b.a getVideoModel() {
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void loss(Double d10, String str, String str2) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void render() {
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setCanInterruptVideoPlay(boolean z10) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setDislikeCallback(Activity activity, TTAdDislike.DislikeInteractionCallback dislikeInteractionCallback) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setDislikeDialog(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setExpressInteractionListener(TTNativeExpressAd.AdInteractionListener adInteractionListener) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setExpressInteractionListener(TTNativeExpressAd.ExpressAdInteractionListener expressAdInteractionListener) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void setPrice(Double d10) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setSlideIntervalTime(int i10) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void setVideoAdListener(TTNativeExpressAd.ExpressVideoAdListener expressVideoAdListener) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTNativeExpressAd
    public void showInteractionExpressAd(Activity activity) {
    }

    @Override // com.bytedance.sdk.openadsdk.TTClientBidding
    public void win(Double d10) {
    }
}
