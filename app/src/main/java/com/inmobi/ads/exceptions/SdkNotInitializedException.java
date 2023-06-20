package com.inmobi.ads.exceptions;

import androidx.annotation.Keep;

@Keep
/* loaded from: classes3.dex */
public final class SdkNotInitializedException extends IllegalStateException {
    public SdkNotInitializedException(String str) {
        super("Please initialize the SDK before creating " + str + " ad");
    }
}
