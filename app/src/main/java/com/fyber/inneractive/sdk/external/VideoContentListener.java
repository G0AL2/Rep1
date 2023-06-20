package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.external.InneractiveContentController;

/* loaded from: classes.dex */
public interface VideoContentListener extends InneractiveContentController.EventsListener {
    void onCompleted();

    @Deprecated
    void onPlayerError();

    void onProgress(int i10, int i11);
}
