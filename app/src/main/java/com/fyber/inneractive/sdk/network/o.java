package com.fyber.inneractive.sdk.network;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;

/* loaded from: classes.dex */
public enum o {
    VAST_ERROR_INVALID_RESPONSE(301),
    VAST_ERROR_TOO_MANY_WRAPPERS(IronSourceConstants.OFFERWALL_AVAILABLE),
    VAST_ERROR_NO_MEDIA_FILES(303),
    VAST_ERROR_NO_COMPATIBLE_MEDIA_FILE(304),
    VAST_ERROR_PRE_BUFFER_TIMEOUT(306),
    VAST_ERROR_BUFFER_TIMEOUT(DownloadConnection.HTTP_TEMP_REDIRECT),
    VAST_ERROR_FAILED_PLAYING_MEDIA_FILE(308),
    VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES(311),
    VAST_ERROR_UNSECURE_URL(312),
    MRAID_ERROR_UNSECURE_CONTENT(313),
    VPAID_ERROR_UNSECURE_CONTENT(314),
    VAST_UNKNOWN_PLAYER_ERROR(399),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ERROR_NO_VALID_URLS_FOR_CLICK(TTAdConstant.MATE_IS_NULL_CODE),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ERROR_SOME_INVALID_URLS_FOR_PROCESSED_CLICK(TTAdConstant.AD_ID_IS_NULL_CODE),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ERROR_NO_VALID_URLS_FOR_CLICK(TTAdConstant.DEEPLINK_FALLBACK_CODE),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ERROR_SOME_INVALID_URLS_FOR_PROCESSED_CLICK(TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ERROR_NO_VALID_URLS_FOR_CLICK(406),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ERROR_SOME_INVALID_URLS_FOR_PROCESSED_CLICK(TTAdConstant.DOWNLOAD_APP_INFO_CODE),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ERROR_NO_VALID_URLS_FOR_CLICK(TTAdConstant.IMAGE_LIST_SIZE_CODE),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ERROR_SOME_INVALID_URLS_FOR_PROCESSED_CLICK(411),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ERROR_NO_VALID_URLS_FOR_CLICK(412),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ERROR_SOME_INVALID_URLS_FOR_PROCESSED_CLICK(TTAdConstant.VIDEO_INFO_CODE),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ERROR_NO_VALID_URLS_FOR_CLICK(TTAdConstant.VIDEO_URL_CODE),
    /* JADX INFO: Fake field, exist only in values array */
    NATIVE_ERROR_SOME_INVALID_URLS_FOR_PROCESSED_CLICK(TTAdConstant.VIDEO_COVER_URL_CODE),
    MRAID_AUTO_ACTION_DETECTED(IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE),
    INTERNAL_CONFIG_MISMATCH(IronSourceError.ERROR_BN_LOAD_AFTER_LONG_INITIATION),
    FATAL_CONFIGURATION_ERROR(701),
    FATAL_FEATURES_CONFIG_ERROR(704),
    MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION(390),
    VAST_COMPANION_FAILED_LOADING(70),
    VAST_COMPANION_INCOMPATIBLE_MIMETYPE(75),
    CLICK_PARSING_FAILURE(991),
    MISSMATCH_SPOTID(992),
    IA_AD_LOAD_FAILED(801),
    IA_AD_EXPIRED(802),
    IA_AD_DESTROYED_WITHOUT_SHOW(803),
    FETCH_TOKEN_DV_ERROR(1000),
    DV_ERROR_PHASE(1001),
    FMP_SDK_INIT_FAILED(62),
    FATAL_ADM_PARSING_ERROR(603),
    FATAL_ADM_MARKUP_FETCHING_ERROR(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED),
    TOKEN_EXCEEDS_LIMIT(IronSourceError.ERROR_BN_LOAD_EXCEPTION);
    

    /* renamed from: a  reason: collision with root package name */
    public int f17650a;

    o(int i10) {
        this.f17650a = i10;
    }
}
