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
import da.p;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l9.f;
import m9.c;
import m9.d;
import m9.g;
import m9.i;
import m9.j;

/* loaded from: classes3.dex */
public final class DashParser {
    public static final String EXTENSION = "mpd";
    private static final String TAG = "DashParser";
    public static final d parser = new d();
    public static final l9.b baseUrlExclusionList = new l9.b();

    private DashParser() {
    }

    public static /* synthetic */ void a(String str, List list, Promise promise) {
        lambda$parseRepresentation$0(str, list, promise);
    }

    private static void addFiles(String str, i iVar, List<String> list) {
        list.add(new p(iVar.b(str), iVar.f34375a, iVar.f34376b, null).f29227a.toString());
    }

    public static String baseUrlOf(j jVar, String str) {
        m9.b j10 = baseUrlExclusionList.j(jVar.f34380b);
        return j10 == null ? str : j10.f34328a;
    }

    public static void concat(DownloadResource downloadResource, String str) throws IOException {
        c a10 = parser.a(Uri.parse(downloadResource.fileName), new FileInputStream(downloadResource.fileName));
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < a10.e(); i10++) {
            g d10 = a10.d(i10);
            long g10 = a10.g(i10);
            for (m9.a aVar : d10.f34368c) {
                if (aVar.f34323b == 2) {
                    for (j jVar : aVar.f34324c) {
                        f l10 = jVar.l();
                        if (l10 != null) {
                            long h10 = l10.h(g10);
                            if (h10 != -1) {
                                String baseUrlOf = baseUrlOf(jVar, downloadResource.fileName);
                                i n10 = jVar.n();
                                if (n10 != null) {
                                    addFiles(baseUrlOf, n10, arrayList);
                                }
                                i m10 = jVar.m();
                                if (m10 != null) {
                                    addFiles(baseUrlOf, m10, arrayList);
                                }
                                long j10 = l10.j();
                                long j11 = (h10 + j10) - 1;
                                while (j10 <= j11) {
                                    addFiles(baseUrlOf, l10.f(j10), arrayList);
                                    j10++;
                                }
                            }
                        }
                    }
                }
            }
        }
        FS.concat(str, arrayList);
    }

    public static void getContentLengthForSource(final String str, final int i10, final Collection<DownloadResourceHeader> collection, final WritableMap writableMap) {
        new DownloadConnection(null, str, collection, false).withConnection(new DownloadConnectionListener() { // from class: com.vehiclecloud.app.videofetch.rndownloader.media.DashParser.1
            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public void onException(StopRequestException stopRequestException) throws StopRequestException {
                Log.e(DashParser.TAG, "getContentLengthForSource", stopRequestException);
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
                    c a10 = DashParser.parser.a(Utils.connUriOf(httpURLConnection), httpURLConnection.getInputStream());
                    h0.d<j, Integer> representation = DashParser.getRepresentation(a10, i10);
                    if (representation == null) {
                        return;
                    }
                    long g10 = a10.g(representation.f31050b.intValue());
                    if (representation.f31049a.l() == null) {
                        return;
                    }
                    final long h10 = representation.f31049a.l().h(g10);
                    if (h10 == -1) {
                        return;
                    }
                    new DownloadConnection(VersionInfo.GIT_BRANCH, representation.f31049a.l().f(h10 / 3).c(DashParser.baseUrlOf(representation.f31049a, str)), collection, false).withConnection(new DownloadConnectionListener() { // from class: com.vehiclecloud.app.videofetch.rndownloader.media.DashParser.1.1
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
                            WritableMap writableMap2 = writableMap;
                            writableMap2.putDouble(str + ":" + i10, headerOfContentLength == -1 ? 0.0d : headerOfContentLength * h10);
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
                    Log.e(DashParser.TAG, "getContentLengthForSource", e10);
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

    public static h0.d<j, Integer> getRepresentation(c cVar, int i10) {
        for (int i11 = 0; i11 < cVar.e(); i11++) {
            for (m9.a aVar : cVar.d(i11).f34368c) {
                if (aVar.f34323b == 2) {
                    for (j jVar : aVar.f34324c) {
                        if (jVar.f34379a.f32714q == i10 && jVar.l() != null) {
                            return h0.d.a(jVar, Integer.valueOf(i11));
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ void lambda$parseRepresentation$0(final String str, List list, final Promise promise) {
        new DownloadConnection(null, str, list, false).withConnection(new DownloadConnectionListener() { // from class: com.vehiclecloud.app.videofetch.rndownloader.media.DashParser.2
            @Override // com.vehiclecloud.app.videofetch.rndownloader.service.connection.DownloadConnectionListener
            public void onException(StopRequestException stopRequestException) throws StopRequestException {
                Log.e(DashParser.TAG, "parseMasterPlaylist onException", stopRequestException);
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
                    c a10 = DashParser.parser.a(Utils.connUriOf(httpURLConnection), httpURLConnection.getInputStream());
                    WritableArray createArray = Arguments.createArray();
                    for (int i10 = 0; i10 < a10.e(); i10++) {
                        for (m9.a aVar : a10.d(i10).f34368c) {
                            if (aVar.f34323b == 2) {
                                for (j jVar : aVar.f34324c) {
                                    WritableMap createMap = Arguments.createMap();
                                    RN.i(createMap, "width", jVar.f34379a.f32714q);
                                    RN.i(createMap, "height", jVar.f34379a.f32715r);
                                    RN.i(createMap, "bandWidth", jVar.f34379a.f32705h);
                                    RN.str(createMap, "src", str);
                                    RN.str(createMap, "label", jVar.f34379a.f32699b);
                                    createArray.pushMap(createMap);
                                }
                            }
                        }
                    }
                    promise.resolve(createArray);
                } catch (IOException e10) {
                    Log.e(DashParser.TAG, "parseMasterPlaylist parse get ex:", e10);
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

    public static void parseRepresentation(final String str, final List<DownloadResourceHeader> list, final Promise promise) {
        Scopes.io().post(new Runnable() { // from class: com.vehiclecloud.app.videofetch.rndownloader.media.a
            @Override // java.lang.Runnable
            public final void run() {
                DashParser.a(str, list, promise);
            }
        });
    }
}
