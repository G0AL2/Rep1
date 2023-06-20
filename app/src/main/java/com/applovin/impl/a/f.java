package com.applovin.impl.a;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;

/* loaded from: classes.dex */
public enum f {
    UNSPECIFIED(-1),
    RESOURCE_REJECTED(1),
    API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED(2),
    FAILED_TO_LOAD_RESOURCE(3),
    XML_PARSING(100),
    GENERAL_WRAPPER_ERROR(ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE),
    TIMED_OUT(301),
    WRAPPER_LIMIT_REACHED(IronSourceConstants.OFFERWALL_AVAILABLE),
    NO_WRAPPER_RESPONSE(303),
    GENERAL_LINEAR_ERROR(DownloadResource.STATUS_BAD_REQUEST),
    NO_MEDIA_FILE_PROVIDED(TTAdConstant.MATE_IS_NULL_CODE),
    MEDIA_FILE_TIMEOUT(TTAdConstant.AD_ID_IS_NULL_CODE),
    MEDIA_FILE_ERROR(TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE),
    GENERAL_COMPANION_AD_ERROR(600),
    UNABLE_TO_FETCH_COMPANION_AD_RESOURCE(603),
    CAN_NOT_FIND_COMPANION_AD_RESOURCE(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED);
    

    /* renamed from: q  reason: collision with root package name */
    private final int f6774q;

    f(int i10) {
        this.f6774q = i10;
    }

    public int a() {
        return this.f6774q;
    }
}
