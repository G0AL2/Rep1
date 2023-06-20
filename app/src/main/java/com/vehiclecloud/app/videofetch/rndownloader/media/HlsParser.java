package com.vehiclecloud.app.videofetch.rndownloader.media;

import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.ironsource.mediationsdk.config.VersionInfo;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResource;
import com.vehiclecloud.app.videofetch.rndownloader.data.vo.DownloadResourceHeader;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnection;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.Helpers;
import com.vehiclecloud.app.videofetch.rndownloader.service.connection.StopRequestException;
import com.vehiclecloud.app.videofetch.rndownloader.util.FS;
import com.vehiclecloud.app.videofetch.rndownloader.util.RN;
import com.vehiclecloud.app.videofetch.rndownloader.util.Scopes;
import j8.p1;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o9.g;
import o9.h;
import o9.i;
import o9.j;

/* loaded from: classes3.dex */
public final class HlsParser {
    public static final String EXTENSION = "m3u8";
    private static final String TAG = "HlsParser";
    public static final j parser = new j();

    private HlsParser() {
    }

    public static /* synthetic */ void a(String str, List list, Promise promise) {
        lambda$parseMasterPlaylist$0(str, list, promise);
    }

    public static void concat(DownloadResource downloadResource, String str) throws IOException {
        g gVar = (g) parser.a(Uri.parse(StreamingParser.segmentsDir(downloadResource)), new FileInputStream(downloadResource.fileName));
        ArrayList arrayList = new ArrayList(gVar.f35083r.size());
        String str2 = downloadResource.fileName;
        String substring = str2.substring(0, str2.lastIndexOf(47) + 1);
        Iterator<g.d> it = gVar.f35083r.iterator();
        while (it.hasNext()) {
            arrayList.add(substring + it.next().f35095a);
        }
        FS.concat(str, arrayList);
    }

    public static void getContentLengthForSource(final String str, final Collection<DownloadResourceHeader> collection, final WritableMap writableMap) {
        new DownloadConnection(null, str, collection, false).withConnection(new DownloadConnectionListener() { // from class: com.vehiclecloud.app.videofetch.rndownloader.media.HlsParser.1
            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public void onException(StopRequestException stopRequestException) throws StopRequestException {
                Log.e(HlsParser.TAG, "getContentLengthForSource", stopRequestException);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onFinished() {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.b(this);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onMovedPerm(String str2) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.c(this, str2);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public void onOk(HttpURLConnection httpURLConnection) {
                try {
                    i a10 = HlsParser.parser.a(Utils.connUriOf(httpURLConnection), httpURLConnection.getInputStream());
                    if (!(a10 instanceof g)) {
                        writableMap.putDouble(str, 0.0d);
                        return;
                    }
                    final g gVar = (g) a10;
                    if (gVar.f35083r.isEmpty()) {
                        writableMap.putDouble(str, 0.0d);
                        return;
                    }
                    URL url = new URL(gVar.f35131a);
                    List<g.d> list = gVar.f35083r;
                    new DownloadConnection(VersionInfo.GIT_BRANCH, new URL(url, list.get(list.size() / 3).f35095a).toString(), collection, false).withConnection(new DownloadConnectionListener() { // from class: com.vehiclecloud.app.videofetch.rndownloader.media.HlsParser.1.1
                        {
                            AnonymousClass1.this = this;
                        }

                        @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                        public /* synthetic */ void onException(StopRequestException stopRequestException) {
                            com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.a(this, stopRequestException);
                        }

                        @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                        public /* synthetic */ void onFinished() {
                            com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.b(this);
                        }

                        @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                        public /* synthetic */ void onMovedPerm(String str2) {
                            com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.c(this, str2);
                        }

                        @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                        public void onOk(HttpURLConnection httpURLConnection2) {
                            long headerOfContentLength = Helpers.getHeaderOfContentLength(httpURLConnection2);
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            writableMap.putDouble(str, headerOfContentLength == -1 ? 0.0d : headerOfContentLength * gVar.f35083r.size());
                        }

                        @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                        public /* synthetic */ void onPartial(HttpURLConnection httpURLConnection2) {
                            com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.e(this, httpURLConnection2);
                        }

                        @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                        public /* synthetic */ void onStart(HttpURLConnection httpURLConnection2) {
                            com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.f(this, httpURLConnection2);
                        }

                        @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
                        public /* synthetic */ void onUnavailable(HttpURLConnection httpURLConnection2) {
                            com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.g(this, httpURLConnection2);
                        }
                    });
                } catch (IOException e10) {
                    Log.e(HlsParser.TAG, "getContentLengthForSource", e10);
                }
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onPartial(HttpURLConnection httpURLConnection) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.e(this, httpURLConnection);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onStart(HttpURLConnection httpURLConnection) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.f(this, httpURLConnection);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onUnavailable(HttpURLConnection httpURLConnection) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.g(this, httpURLConnection);
            }
        });
    }

    public static /* synthetic */ void lambda$parseMasterPlaylist$0(String str, List list, final Promise promise) {
        new DownloadConnection(null, str, list, false).withConnection(new DownloadConnectionListener() { // from class: com.vehiclecloud.app.videofetch.rndownloader.media.HlsParser.2
            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public void onException(StopRequestException stopRequestException) throws StopRequestException {
                Log.e(HlsParser.TAG, "parseMasterPlaylist onException", stopRequestException);
                promise.reject(stopRequestException);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onFinished() {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.b(this);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onMovedPerm(String str2) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.c(this, str2);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public void onOk(HttpURLConnection httpURLConnection) {
                try {
                    i a10 = HlsParser.parser.a(Utils.connUriOf(httpURLConnection), httpURLConnection.getInputStream());
                    if (!(a10 instanceof h)) {
                        promise.resolve(null);
                        return;
                    }
                    WritableArray createArray = Arguments.createArray();
                    for (h.b bVar : ((h) a10).f35113e) {
                        if (bVar.f35128d != null) {
                            p1 p1Var = bVar.f35126b;
                            if (p1Var.f32714q == 0 && p1Var.f32705h == 0) {
                            }
                        }
                        WritableMap createMap = Arguments.createMap();
                        RN.i(createMap, "width", bVar.f35126b.f32714q);
                        RN.i(createMap, "height", bVar.f35126b.f32715r);
                        RN.str(createMap, "src", bVar.f35125a.toString());
                        RN.i(createMap, "bandWidth", bVar.f35126b.f32705h);
                        RN.str(createMap, "label", bVar.f35126b.f32699b);
                        createArray.pushMap(createMap);
                    }
                    promise.resolve(createArray);
                } catch (IOException e10) {
                    Log.e(HlsParser.TAG, "parseMasterPlaylist parse get ex:", e10);
                    promise.reject(e10);
                }
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onPartial(HttpURLConnection httpURLConnection) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.e(this, httpURLConnection);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onStart(HttpURLConnection httpURLConnection) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.f(this, httpURLConnection);
            }

            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public /* synthetic */ void onUnavailable(HttpURLConnection httpURLConnection) {
                com.vehiclecloud.app.videofetch.rndownloader.service.connection.a.g(this, httpURLConnection);
            }
        });
    }

    public static void parseMasterPlaylist(final String str, final List<DownloadResourceHeader> list, final Promise promise) {
        Scopes.io().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.media.b
            @Override // java.lang.Runnable
            public final void run() {
                HlsParser.a(str, list, promise);
            }
        });
    }
}
