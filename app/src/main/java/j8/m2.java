package j8;

import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: PlaybackException.java */
/* loaded from: classes2.dex */
public class m2 extends Exception implements g {

    /* renamed from: a  reason: collision with root package name */
    public final int f32623a;

    /* renamed from: b  reason: collision with root package name */
    public final long f32624b;

    /* JADX INFO: Access modifiers changed from: protected */
    public m2(String str, Throwable th, int i10, long j10) {
        super(str, th);
        this.f32623a = i10;
        this.f32624b = j10;
    }

    public static String a(int i10) {
        if (i10 != 5001) {
            if (i10 != 5002) {
                switch (i10) {
                    case 1000:
                        return "ERROR_CODE_UNSPECIFIED";
                    case 1001:
                        return "ERROR_CODE_REMOTE_ERROR";
                    case 1002:
                        return "ERROR_CODE_BEHIND_LIVE_WINDOW";
                    case 1003:
                        return "ERROR_CODE_TIMEOUT";
                    case IronSourceError.AUCTION_ERROR_EMPTY_WATERFALL /* 1004 */:
                        return "ERROR_CODE_FAILED_RUNTIME_CHECK";
                    default:
                        switch (i10) {
                            case 2000:
                                return "ERROR_CODE_IO_UNSPECIFIED";
                            case 2001:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_FAILED";
                            case 2002:
                                return "ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT";
                            case 2003:
                                return "ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE";
                            case 2004:
                                return "ERROR_CODE_IO_BAD_HTTP_STATUS";
                            case IronSourceConstants.IS_INSTANCE_OPENED /* 2005 */:
                                return "ERROR_CODE_IO_FILE_NOT_FOUND";
                            case 2006:
                                return "ERROR_CODE_IO_NO_PERMISSION";
                            case 2007:
                                return "ERROR_CODE_IO_CLEARTEXT_NOT_PERMITTED";
                            case AdError.REMOTE_ADS_SERVICE_ERROR /* 2008 */:
                                return "ERROR_CODE_IO_READ_POSITION_OUT_OF_RANGE";
                            default:
                                switch (i10) {
                                    case 3001:
                                        return "ERROR_CODE_PARSING_CONTAINER_MALFORMED";
                                    case 3002:
                                        return "ERROR_CODE_PARSING_MANIFEST_MALFORMED";
                                    case AuthApiStatusCodes.AUTH_API_SERVER_ERROR /* 3003 */:
                                        return "ERROR_CODE_PARSING_CONTAINER_UNSUPPORTED";
                                    case AuthApiStatusCodes.AUTH_TOKEN_ERROR /* 3004 */:
                                        return "ERROR_CODE_PARSING_MANIFEST_UNSUPPORTED";
                                    default:
                                        switch (i10) {
                                            case 4001:
                                                return "ERROR_CODE_DECODER_INIT_FAILED";
                                            case 4002:
                                                return "ERROR_CODE_DECODER_QUERY_FAILED";
                                            case 4003:
                                                return "ERROR_CODE_DECODING_FAILED";
                                            case 4004:
                                                return "ERROR_CODE_DECODING_FORMAT_EXCEEDS_CAPABILITIES";
                                            case 4005:
                                                return "ERROR_CODE_DECODING_FORMAT_UNSUPPORTED";
                                            default:
                                                switch (i10) {
                                                    case 6000:
                                                        return "ERROR_CODE_DRM_UNSPECIFIED";
                                                    case AdError.MEDIAVIEW_MISSING_ERROR_CODE /* 6001 */:
                                                        return "ERROR_CODE_DRM_SCHEME_UNSUPPORTED";
                                                    case AdError.ICONVIEW_MISSING_ERROR_CODE /* 6002 */:
                                                        return "ERROR_CODE_DRM_PROVISIONING_FAILED";
                                                    case AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE /* 6003 */:
                                                        return "ERROR_CODE_DRM_CONTENT_ERROR";
                                                    case 6004:
                                                        return "ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED";
                                                    case 6005:
                                                        return "ERROR_CODE_DRM_DISALLOWED_OPERATION";
                                                    case 6006:
                                                        return "ERROR_CODE_DRM_SYSTEM_ERROR";
                                                    case 6007:
                                                        return "ERROR_CODE_DRM_DEVICE_REVOKED";
                                                    case 6008:
                                                        return "ERROR_CODE_DRM_LICENSE_EXPIRED";
                                                    default:
                                                        return i10 >= 1000000 ? "custom error code" : "invalid error code";
                                                }
                                        }
                                }
                        }
                }
            }
            return "ERROR_CODE_AUDIO_TRACK_WRITE_FAILED";
        }
        return "ERROR_CODE_AUDIO_TRACK_INIT_FAILED";
    }
}
