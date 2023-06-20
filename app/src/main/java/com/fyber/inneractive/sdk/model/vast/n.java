package com.fyber.inneractive.sdk.model.vast;

import com.amazon.device.ads.DtbDeviceDataRetriever;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public enum n {
    MEDIA_TYPE_MP4("video/mp4"),
    MEDIA_TYPE_3GPP("video/3gpp"),
    MEDIA_TYPE_WEBM("video/webm"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIA_TYPE_X_MPEG("application/x-mpegURL"),
    UNKNOWN(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN);
    

    /* renamed from: f  reason: collision with root package name */
    public static final Map<String, n> f17448f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f17450a;

    static {
        n[] values;
        for (n nVar : values()) {
            ((HashMap) f17448f).put(nVar.f17450a, nVar);
        }
    }

    n(String str) {
        this.f17450a = str;
    }
}
