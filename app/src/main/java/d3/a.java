package d3;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import java.io.InputStream;
import java.util.List;
import y2.i;

/* compiled from: AbsResponseWrapper.java */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    List<i.b> f29049a;

    /* renamed from: b  reason: collision with root package name */
    e f29050b;

    public abstract int a();

    /* JADX INFO: Access modifiers changed from: protected */
    public String b(int i10) {
        switch (i10) {
            case 200:
                return "OK";
            case 201:
                return "Created";
            case 202:
                return "Accepted";
            case 203:
                return "Non-Authoritative";
            case 204:
                return "No Content";
            case 205:
                return "Reset Content";
            case 206:
                return "Partial Content";
            default:
                switch (i10) {
                    case ms.bd.o.Pgl.c.COLLECT_MODE_FINANCE /* 300 */:
                        return "Multiple Choices";
                    case 301:
                        return "Moved Permanently";
                    case IronSourceConstants.OFFERWALL_AVAILABLE /* 302 */:
                        return "Temporary Redirect";
                    case 303:
                        return "See Other";
                    case 304:
                        return "Not Modified";
                    case IronSourceConstants.OFFERWALL_OPENED /* 305 */:
                        return "Use Proxy";
                    default:
                        switch (i10) {
                            case DownloadResource.STATUS_BAD_REQUEST /* 400 */:
                                return "Bad Request";
                            case TTAdConstant.MATE_IS_NULL_CODE /* 401 */:
                                return "Unauthorized";
                            case TTAdConstant.AD_ID_IS_NULL_CODE /* 402 */:
                                return "Payment Required";
                            case TTAdConstant.DEEPLINK_UNAVAILABLE_CODE /* 403 */:
                                return "Forbidden";
                            case TTAdConstant.DEEPLINK_FALLBACK_CODE /* 404 */:
                                return "Not Found";
                            case TTAdConstant.DEEPLINK_FALLBACK_TYPE_CODE /* 405 */:
                                return "Method Not Allowed";
                            case 406:
                                return "Not Acceptable";
                            case TTAdConstant.DOWNLOAD_APP_INFO_CODE /* 407 */:
                                return "Proxy Authentication Required";
                            case TTAdConstant.DOWNLOAD_URL_CODE /* 408 */:
                                return "Request Time-Out";
                            case TTAdConstant.IMAGE_LIST_CODE /* 409 */:
                                return "Conflict";
                            case TTAdConstant.IMAGE_LIST_SIZE_CODE /* 410 */:
                                return "Gone";
                            case 411:
                                return "Length Required";
                            case 412:
                                return "Precondition Failed";
                            case TTAdConstant.VIDEO_INFO_CODE /* 413 */:
                                return "Request Entity Too Large";
                            case TTAdConstant.VIDEO_URL_CODE /* 414 */:
                                return "Request-URI Too Large";
                            case TTAdConstant.VIDEO_COVER_URL_CODE /* 415 */:
                                return "Unsupported Media Type";
                            default:
                                switch (i10) {
                                    case 500:
                                        return "Internal Server Error";
                                    case IronSourceError.ERROR_CODE_NO_CONFIGURATION_AVAILABLE /* 501 */:
                                        return "Not Implemented";
                                    case IronSourceError.ERROR_CODE_USING_CACHED_CONFIGURATION /* 502 */:
                                        return "Bad Gateway";
                                    case 503:
                                        return "Service Unavailable";
                                    case ms.bd.o.Pgl.c.COLLECT_MODE_TIKTOK_GUEST /* 504 */:
                                        return "Gateway Timeout";
                                    case IronSourceError.ERROR_CODE_KEY_NOT_SET /* 505 */:
                                        return "HTTP Version Not Supported";
                                    default:
                                        return "";
                                }
                        }
                }
        }
    }

    public abstract String c(String str, String str2);

    /* JADX INFO: Access modifiers changed from: protected */
    public i.b d(String str) {
        List<i.b> list;
        if (str != null && (list = this.f29049a) != null && list.size() > 0) {
            for (i.b bVar : this.f29049a) {
                if (str.equals(bVar.f39240a)) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public abstract boolean e();

    public abstract List<i.b> f();

    public abstract InputStream g();

    public abstract String h();

    public abstract String i();

    public e j() {
        return this.f29050b;
    }
}
