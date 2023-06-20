package com.ironsource.mediationsdk.sdk;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes3.dex */
public interface OfferwallListener {
    void onGetOfferwallCreditsFailed(IronSourceError ironSourceError);

    boolean onOfferwallAdCredited(int i10, int i11, boolean z10);

    void onOfferwallAvailable(boolean z10);

    void onOfferwallClosed();

    void onOfferwallOpened();

    void onOfferwallShowFailed(IronSourceError ironSourceError);
}
