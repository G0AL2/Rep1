package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import java.util.Map;

/* compiled from: AdEventListener.java */
/* loaded from: classes3.dex */
public abstract class bs<T> {
    public void onAdClicked(T t10, Map<Object, Object> map) {
    }

    public void onAdFetchSuccessful(T t10, AdMetaInfo adMetaInfo) {
    }

    public void onAdLoadFailed(T t10, InMobiAdRequestStatus inMobiAdRequestStatus) {
    }

    @Deprecated
    public void onAdLoadSucceeded(T t10) {
    }

    public void onAdLoadSucceeded(T t10, AdMetaInfo adMetaInfo) {
    }

    public void onRequestPayloadCreated(byte[] bArr) {
    }

    public void onRequestPayloadCreationFailed(InMobiAdRequestStatus inMobiAdRequestStatus) {
    }
}
