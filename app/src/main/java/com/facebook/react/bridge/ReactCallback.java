package com.facebook.react.bridge;

import g6.a;

@a
/* loaded from: classes.dex */
interface ReactCallback {
    @a
    void decrementPendingJSCalls();

    @a
    void incrementPendingJSCalls();

    @a
    void onBatchComplete();
}
