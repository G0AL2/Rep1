package com.vehiclecloud.app.videofetch.rndownloader.service.connection;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceHeader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class DownloadConnection {
    public static final int DEFAULT_TIMEOUT = 20000;
    public static final int HTTP_REQUESTED_RANGE_NOT_SATISFIABLE = 416;
    public static final int HTTP_TEMP_REDIRECT = 307;
    private final Collection<DownloadResourceHeader> mHeaders;
    private final boolean mIsResuming;
    private final String mMethod;
    private final String mUri;

    public DownloadConnection(String str, String str2, Collection<DownloadResourceHeader> collection, boolean z10) {
        this.mMethod = str;
        this.mUri = str2;
        this.mHeaders = collection;
        this.mIsResuming = z10;
    }

    private void addRequestHeaders(HttpURLConnection httpURLConnection) {
        Collection<DownloadResourceHeader> collection = this.mHeaders;
        if (collection != null) {
            for (DownloadResourceHeader downloadResourceHeader : collection) {
                httpURLConnection.addRequestProperty(downloadResourceHeader.header, downloadResourceHeader.value);
            }
        }
        if (httpURLConnection.getRequestProperty("User-Agent") == null) {
            httpURLConnection.addRequestProperty("User-Agent", Constants.DEFAULT_USER_AGENT);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        httpURLConnection.setRequestProperty("Connection", "close");
    }

    private void openConnection(DownloadConnectionListener downloadConnectionListener) {
        try {
            URL url = new URL(this.mUri);
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i10 < 5) {
                    HttpURLConnection httpURLConnection = null;
                    try {
                        try {
                            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
                            try {
                                String str = this.mMethod;
                                if (str != null) {
                                    httpURLConnection2.setRequestMethod(str);
                                }
                                httpURLConnection2.setInstanceFollowRedirects(false);
                                httpURLConnection2.setConnectTimeout(DEFAULT_TIMEOUT);
                                httpURLConnection2.setReadTimeout(DEFAULT_TIMEOUT);
                                addRequestHeaders(httpURLConnection2);
                                downloadConnectionListener.onStart(httpURLConnection2);
                                int responseCode = httpURLConnection2.getResponseCode();
                                if (responseCode == 200) {
                                    if (!this.mIsResuming) {
                                        downloadConnectionListener.onOk(httpURLConnection2);
                                        httpURLConnection2.disconnect();
                                        return;
                                    }
                                    throw new StopRequestException((int) DownloadResource.STATUS_CANNOT_RESUME, "Expected partial, but received OK");
                                } else if (responseCode != 206) {
                                    if (responseCode != 307) {
                                        if (responseCode == 412) {
                                            throw new StopRequestException((int) DownloadResource.STATUS_CANNOT_RESUME, "Precondition failed");
                                        }
                                        if (responseCode == 416) {
                                            throw new StopRequestException((int) DownloadResource.STATUS_CANNOT_RESUME, "Requested range not satisfiable");
                                        }
                                        if (responseCode == 500) {
                                            throw new StopRequestException(500, httpURLConnection2.getResponseMessage());
                                        }
                                        if (responseCode != 503) {
                                            switch (responseCode) {
                                                case 301:
                                                case IronSourceConstants.OFFERWALL_AVAILABLE /* 302 */:
                                                case 303:
                                                    break;
                                                default:
                                                    throw StopRequestException.throwUnhandledHttpError(responseCode, httpURLConnection2.getResponseMessage());
                                            }
                                        } else {
                                            downloadConnectionListener.onUnavailable(httpURLConnection2);
                                            throw new StopRequestException(503, httpURLConnection2.getResponseMessage());
                                        }
                                    }
                                    URL url2 = new URL(url, httpURLConnection2.getHeaderField("Location"));
                                    if (responseCode == 301) {
                                        downloadConnectionListener.onMovedPerm(url2.toString());
                                    }
                                    httpURLConnection2.disconnect();
                                    i10 = i11;
                                    url = url2;
                                } else if (this.mIsResuming) {
                                    downloadConnectionListener.onPartial(httpURLConnection2);
                                    httpURLConnection2.disconnect();
                                    return;
                                } else {
                                    throw new StopRequestException((int) DownloadResource.STATUS_CANNOT_RESUME, "Expected OK, but received partial");
                                }
                            } catch (IOException e10) {
                                e = e10;
                                if ((e instanceof ProtocolException) && e.getMessage() != null && e.getMessage().startsWith("Unexpected status line")) {
                                    throw new StopRequestException((int) DownloadResource.STATUS_UNHANDLED_HTTP_CODE, e);
                                }
                                throw new StopRequestException((int) DownloadResource.STATUS_HTTP_DATA_ERROR, e);
                            } catch (Throwable th) {
                                th = th;
                                httpURLConnection = httpURLConnection2;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                throw th;
                            }
                        } catch (IOException e11) {
                            e = e11;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    throw new StopRequestException((int) DownloadResource.STATUS_TOO_MANY_REDIRECTS, "Too many redirects");
                }
            }
        } catch (MalformedURLException e12) {
            throw new StopRequestException((int) DownloadResource.STATUS_BAD_REQUEST, e12);
        }
    }

    public void withConnection(DownloadConnectionListener downloadConnectionListener) {
        try {
            openConnection(downloadConnectionListener);
            downloadConnectionListener.onFinished();
        } catch (StopRequestException e10) {
            downloadConnectionListener.onException(e10);
        }
    }
}
