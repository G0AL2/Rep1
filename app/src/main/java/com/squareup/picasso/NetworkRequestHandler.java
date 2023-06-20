package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestHandler;
import java.io.IOException;
import ye.b0;
import ye.d;
import ye.d0;
import ye.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class NetworkRequestHandler extends RequestHandler {
    private static final String SCHEME_HTTP = "http";
    private static final String SCHEME_HTTPS = "https";

    /* renamed from: downloader  reason: collision with root package name */
    private final Downloader f28405downloader;
    private final Stats stats;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class ContentLengthException extends IOException {
        ContentLengthException(String str) {
            super(str);
        }
    }

    /* loaded from: classes3.dex */
    static final class ResponseException extends IOException {
        final int code;
        final int networkPolicy;

        ResponseException(int i10, int i11) {
            super("HTTP " + i10);
            this.code = i10;
            this.networkPolicy = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NetworkRequestHandler(Downloader downloader2, Stats stats) {
        this.f28405downloader = downloader2;
        this.stats = stats;
    }

    private static b0 createRequest(Request request, int i10) {
        d dVar;
        if (i10 == 0) {
            dVar = null;
        } else if (NetworkPolicy.isOfflineOnly(i10)) {
            dVar = d.f39599n;
        } else {
            d.a aVar = new d.a();
            if (!NetworkPolicy.shouldReadFromDiskCache(i10)) {
                aVar.d();
            }
            if (!NetworkPolicy.shouldWriteToDiskCache(i10)) {
                aVar.e();
            }
            dVar = aVar.a();
        }
        b0.a l10 = new b0.a().l(request.uri.toString());
        if (dVar != null) {
            l10.c(dVar);
        }
        return l10.b();
    }

    @Override // com.squareup.picasso.RequestHandler
    public boolean canHandleRequest(Request request) {
        String scheme = request.uri.getScheme();
        return SCHEME_HTTP.equals(scheme) || SCHEME_HTTPS.equals(scheme);
    }

    @Override // com.squareup.picasso.RequestHandler
    int getRetryCount() {
        return 2;
    }

    @Override // com.squareup.picasso.RequestHandler
    public RequestHandler.Result load(Request request, int i10) throws IOException {
        d0 load = this.f28405downloader.load(createRequest(request, i10));
        e0 a10 = load.a();
        if (load.c0()) {
            Picasso.LoadedFrom loadedFrom = load.d() == null ? Picasso.LoadedFrom.NETWORK : Picasso.LoadedFrom.DISK;
            if (loadedFrom == Picasso.LoadedFrom.DISK && a10.e() == 0) {
                a10.close();
                throw new ContentLengthException("Received response with 0 content-length header.");
            }
            if (loadedFrom == Picasso.LoadedFrom.NETWORK && a10.e() > 0) {
                this.stats.dispatchDownloadFinished(a10.e());
            }
            return new RequestHandler.Result(a10.q(), loadedFrom);
        }
        a10.close();
        throw new ResponseException(load.h(), request.networkPolicy);
    }

    @Override // com.squareup.picasso.RequestHandler
    boolean shouldRetry(boolean z10, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.RequestHandler
    boolean supportsReplay() {
        return true;
    }
}
