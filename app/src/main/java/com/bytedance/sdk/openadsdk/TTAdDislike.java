package com.bytedance.sdk.openadsdk;

/* loaded from: classes.dex */
public interface TTAdDislike {

    /* loaded from: classes.dex */
    public interface DislikeInteractionCallback {
        void onCancel();

        void onRefuse();

        void onSelected(int i10, String str);
    }

    void setDislikeInteractionCallback(DislikeInteractionCallback dislikeInteractionCallback);

    void showDislikeDialog();
}
