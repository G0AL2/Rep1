package com.facebook.react.modules.network;

import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import com.facebook.fbreact.specs.NativeNetworkingAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import mf.o;
import mf.r;
import ye.b0;
import ye.c0;
import ye.d0;
import ye.e0;
import ye.t;
import ye.v;
import ye.w;
import ye.x;
import ye.y;
import ye.z;

@o6.a(name = NetworkingModule.NAME)
/* loaded from: classes.dex */
public final class NetworkingModule extends NativeNetworkingAndroidSpec {
    private static final int CHUNK_TIMEOUT_NS = 100000000;
    private static final String CONTENT_ENCODING_HEADER_NAME = "content-encoding";
    private static final String CONTENT_TYPE_HEADER_NAME = "content-type";
    private static final int MAX_CHUNK_SIZE_BETWEEN_FLUSHES = 8192;
    public static final String NAME = "Networking";
    private static final String REQUEST_BODY_KEY_BASE64 = "base64";
    private static final String REQUEST_BODY_KEY_FORMDATA = "formData";
    private static final String REQUEST_BODY_KEY_STRING = "string";
    private static final String REQUEST_BODY_KEY_URI = "uri";
    private static final String TAG = "NetworkingModule";
    private static final String USER_AGENT_HEADER_NAME = "user-agent";
    private static e customClientBuilder;
    private final z mClient;
    private final com.facebook.react.modules.network.c mCookieHandler;
    private final com.facebook.react.modules.network.a mCookieJarContainer;
    private final String mDefaultUserAgent;
    private final List<f> mRequestBodyHandlers;
    private final Set<Integer> mRequestIds;
    private final List<g> mResponseHandlers;
    private boolean mShuttingDown;
    private final List<h> mUriHandlers;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f15566a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f15567b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f15568c;

        /* renamed from: com.facebook.react.modules.network.NetworkingModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0213a implements com.facebook.react.modules.network.h {

            /* renamed from: a  reason: collision with root package name */
            long f15569a = System.nanoTime();

            C0213a() {
            }

            @Override // com.facebook.react.modules.network.h
            public void a(long j10, long j11, boolean z10) {
                long nanoTime = System.nanoTime();
                if ((z10 || NetworkingModule.shouldDispatch(nanoTime, this.f15569a)) && !a.this.f15566a.equals("text")) {
                    a aVar = a.this;
                    n.c(aVar.f15567b, aVar.f15568c, j10, j11);
                    this.f15569a = nanoTime;
                }
            }
        }

        a(NetworkingModule networkingModule, String str, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i10) {
            this.f15566a = str;
            this.f15567b = rCTDeviceEventEmitter;
            this.f15568c = i10;
        }

        @Override // ye.v
        public d0 intercept(v.a aVar) throws IOException {
            d0 a10 = aVar.a(aVar.l());
            return a10.O().b(new j(a10.a(), new C0213a())).c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ye.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15571a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f15572b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f15573c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f15574d;

        b(int i10, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, String str, boolean z10) {
            this.f15571a = i10;
            this.f15572b = rCTDeviceEventEmitter;
            this.f15573c = str;
            this.f15574d = z10;
        }

        @Override // ye.f
        public void onFailure(ye.e eVar, IOException iOException) {
            String str;
            if (NetworkingModule.this.mShuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f15571a);
            if (iOException.getMessage() != null) {
                str = iOException.getMessage();
            } else {
                str = "Error while executing request: " + iOException.getClass().getSimpleName();
            }
            n.f(this.f15572b, this.f15571a, str, iOException);
        }

        @Override // ye.f
        public void onResponse(ye.e eVar, d0 d0Var) throws IOException {
            if (NetworkingModule.this.mShuttingDown) {
                return;
            }
            NetworkingModule.this.removeRequest(this.f15571a);
            n.h(this.f15572b, this.f15571a, d0Var.h(), NetworkingModule.translateHeaders(d0Var.A()), d0Var.d0().l().toString());
            try {
                e0 a10 = d0Var.a();
                if ("gzip".equalsIgnoreCase(d0Var.w("Content-Encoding")) && a10 != null) {
                    o oVar = new o(a10.q());
                    String w10 = d0Var.w("Content-Type");
                    a10 = e0.l(w10 != null ? x.f(w10) : null, -1L, r.d(oVar));
                }
                for (g gVar : NetworkingModule.this.mResponseHandlers) {
                    if (gVar.b(this.f15573c)) {
                        n.a(this.f15572b, this.f15571a, gVar.a(a10));
                        n.g(this.f15572b, this.f15571a);
                        return;
                    }
                }
                if (this.f15574d && this.f15573c.equals("text")) {
                    NetworkingModule.this.readWithProgress(this.f15572b, this.f15571a, a10);
                    n.g(this.f15572b, this.f15571a);
                    return;
                }
                String str = "";
                if (this.f15573c.equals("text")) {
                    try {
                        str = a10.w();
                    } catch (IOException e10) {
                        if (!d0Var.d0().h().equalsIgnoreCase(VersionInfo.GIT_BRANCH)) {
                            n.f(this.f15572b, this.f15571a, e10.getMessage(), e10);
                        }
                    }
                } else if (this.f15573c.equals(NetworkingModule.REQUEST_BODY_KEY_BASE64)) {
                    str = Base64.encodeToString(a10.b(), 2);
                }
                n.b(this.f15572b, this.f15571a, str);
                n.g(this.f15572b, this.f15571a);
            } catch (IOException e11) {
                n.f(this.f15572b, this.f15571a, e11.getMessage(), e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements com.facebook.react.modules.network.h {

        /* renamed from: a  reason: collision with root package name */
        long f15576a = System.nanoTime();

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ DeviceEventManagerModule.RCTDeviceEventEmitter f15577b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f15578c;

        c(NetworkingModule networkingModule, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i10) {
            this.f15577b = rCTDeviceEventEmitter;
            this.f15578c = i10;
        }

        @Override // com.facebook.react.modules.network.h
        public void a(long j10, long j11, boolean z10) {
            long nanoTime = System.nanoTime();
            if (z10 || NetworkingModule.shouldDispatch(nanoTime, this.f15576a)) {
                n.d(this.f15577b, this.f15578c, j10, j11);
                this.f15576a = nanoTime;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15579a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, int i10) {
            super(reactContext);
            this.f15579a = i10;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            j6.a.a(NetworkingModule.this.mClient, Integer.valueOf(this.f15579a));
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(z.a aVar);
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean a(ReadableMap readableMap);

        c0 b(ReadableMap readableMap, String str);
    }

    /* loaded from: classes.dex */
    public interface g {
        WritableMap a(e0 e0Var) throws IOException;

        boolean b(String str);
    }

    /* loaded from: classes.dex */
    public interface h {
        WritableMap a(Uri uri) throws IOException;

        boolean b(Uri uri, String str);
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, z zVar, List<com.facebook.react.modules.network.e> list) {
        super(reactApplicationContext);
        this.mRequestBodyHandlers = new ArrayList();
        this.mUriHandlers = new ArrayList();
        this.mResponseHandlers = new ArrayList();
        if (list != null) {
            z.a z10 = zVar.z();
            for (com.facebook.react.modules.network.e eVar : list) {
                z10.b(eVar.create());
            }
            zVar = z10.c();
        }
        this.mClient = zVar;
        this.mCookieHandler = new com.facebook.react.modules.network.c(reactApplicationContext);
        this.mCookieJarContainer = (com.facebook.react.modules.network.a) zVar.o();
        this.mShuttingDown = false;
        this.mDefaultUserAgent = str;
        this.mRequestIds = new HashSet();
    }

    private synchronized void addRequest(int i10) {
        this.mRequestIds.add(Integer.valueOf(i10));
    }

    private static void applyCustomBuilder(z.a aVar) {
        e eVar = customClientBuilder;
        if (eVar != null) {
            eVar.a(aVar);
        }
    }

    private synchronized void cancelAllRequests() {
        for (Integer num : this.mRequestIds) {
            cancelRequest(num.intValue());
        }
        this.mRequestIds.clear();
    }

    private void cancelRequest(int i10) {
        new d(getReactApplicationContext(), i10).execute(new Void[0]);
    }

    private y.a constructMultipartBody(ReadableArray readableArray, String str, int i10) {
        x xVar;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("constructMultipartBody");
        y.a aVar = new y.a();
        aVar.d(x.f(str));
        int size = readableArray.size();
        for (int i11 = 0; i11 < size; i11++) {
            ReadableMap map = readableArray.getMap(i11);
            t extractHeaders = extractHeaders(map.getArray("headers"), null);
            if (extractHeaders == null) {
                n.f(eventEmitter, i10, "Missing or invalid header format for FormData part.", null);
                return null;
            }
            String a10 = extractHeaders.a(CONTENT_TYPE_HEADER_NAME);
            if (a10 != null) {
                xVar = x.f(a10);
                extractHeaders = extractHeaders.e().g(CONTENT_TYPE_HEADER_NAME).d();
            } else {
                xVar = null;
            }
            if (map.hasKey(REQUEST_BODY_KEY_STRING)) {
                aVar.a(extractHeaders, c0.create(xVar, map.getString(REQUEST_BODY_KEY_STRING)));
            } else if (!map.hasKey(REQUEST_BODY_KEY_URI)) {
                n.f(eventEmitter, i10, "Unrecognized FormData part.", null);
            } else if (xVar == null) {
                n.f(eventEmitter, i10, "Binary FormData part needs a content-type header.", null);
                return null;
            } else {
                String string = map.getString(REQUEST_BODY_KEY_URI);
                InputStream f10 = m.f(getReactApplicationContext(), string);
                if (f10 == null) {
                    n.f(eventEmitter, i10, "Could not retrieve file for uri " + string, null);
                    return null;
                }
                aVar.a(extractHeaders, m.a(xVar, f10));
            }
        }
        return aVar;
    }

    private t extractHeaders(ReadableArray readableArray, ReadableMap readableMap) {
        String str;
        if (readableArray == null) {
            return null;
        }
        t.a aVar = new t.a();
        int size = readableArray.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ReadableArray array = readableArray.getArray(i10);
            if (array != null && array.size() == 2) {
                String a10 = com.facebook.react.modules.network.d.a(array.getString(0));
                String b10 = com.facebook.react.modules.network.d.b(array.getString(1));
                if (a10 != null && b10 != null) {
                    aVar.a(a10, b10);
                }
            }
            return null;
        }
        if (aVar.e(USER_AGENT_HEADER_NAME) == null && (str = this.mDefaultUserAgent) != null) {
            aVar.a(USER_AGENT_HEADER_NAME, str);
        }
        if (readableMap != null && readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
            z10 = true;
        }
        if (!z10) {
            aVar.g(CONTENT_ENCODING_HEADER_NAME);
        }
        return aVar.d();
    }

    private DeviceEventManagerModule.RCTDeviceEventEmitter getEventEmitter(String str) {
        if (getReactApplicationContextIfActiveOrWarn() != null) {
            return (DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void readWithProgress(DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i10, e0 e0Var) throws IOException {
        long j10;
        Charset c10;
        long j11 = -1;
        try {
            j jVar = (j) e0Var;
            j10 = jVar.O();
            try {
                j11 = jVar.e();
            } catch (ClassCastException unused) {
            }
        } catch (ClassCastException unused2) {
            j10 = -1;
        }
        if (e0Var.h() == null) {
            c10 = h6.g.f31111a;
        } else {
            c10 = e0Var.h().c(h6.g.f31111a);
        }
        k kVar = new k(c10);
        InputStream a10 = e0Var.a();
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = a10.read(bArr);
                if (read == -1) {
                    return;
                }
                n.e(rCTDeviceEventEmitter, i10, kVar.a(bArr, read), j10, j11);
            }
        } finally {
            a10.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void removeRequest(int i10) {
        this.mRequestIds.remove(Integer.valueOf(i10));
    }

    public static void setCustomClientBuilder(e eVar) {
        customClientBuilder = eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean shouldDispatch(long j10, long j11) {
        return j11 + 100000000 < j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static WritableMap translateHeaders(t tVar) {
        Bundle bundle = new Bundle();
        for (int i10 = 0; i10 < tVar.size(); i10++) {
            String c10 = tVar.c(i10);
            if (bundle.containsKey(c10)) {
                bundle.putString(c10, bundle.getString(c10) + ", " + tVar.h(i10));
            } else {
                bundle.putString(c10, tVar.h(i10));
            }
        }
        return Arguments.fromBundle(bundle);
    }

    private c0 wrapRequestBodyWithProgressEmitter(c0 c0Var, DeviceEventManagerModule.RCTDeviceEventEmitter rCTDeviceEventEmitter, int i10) {
        if (c0Var == null) {
            return null;
        }
        return m.c(c0Var, new c(this, rCTDeviceEventEmitter, i10));
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void abortRequest(double d10) {
        int i10 = (int) d10;
        cancelRequest(i10);
        removeRequest(i10);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void addListener(String str) {
    }

    public void addRequestBodyHandler(f fVar) {
        this.mRequestBodyHandlers.add(fVar);
    }

    public void addResponseHandler(g gVar) {
        this.mResponseHandlers.add(gVar);
    }

    public void addUriHandler(h hVar) {
        this.mUriHandlers.add(hVar);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    @ReactMethod
    public void clearCookies(Callback callback) {
        this.mCookieHandler.f(callback);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        this.mCookieJarContainer.d(new w(this.mCookieHandler));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        this.mShuttingDown = true;
        cancelAllRequests();
        this.mCookieHandler.h();
        this.mCookieJarContainer.b();
        this.mRequestBodyHandlers.clear();
        this.mResponseHandlers.clear();
        this.mUriHandlers.clear();
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void removeListeners(double d10) {
    }

    public void removeRequestBodyHandler(f fVar) {
        this.mRequestBodyHandlers.remove(fVar);
    }

    public void removeResponseHandler(g gVar) {
        this.mResponseHandlers.remove(gVar);
    }

    public void removeUriHandler(h hVar) {
        this.mUriHandlers.remove(hVar);
    }

    @Override // com.facebook.fbreact.specs.NativeNetworkingAndroidSpec
    public void sendRequest(String str, String str2, double d10, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z10, double d11, boolean z11) {
        int i10 = (int) d10;
        try {
            sendRequestInternal(str, str2, i10, readableArray, readableMap, str3, z10, (int) d11, z11);
        } catch (Throwable th) {
            z3.a.k(TAG, "Failed to send url request: " + str2, th);
            DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("sendRequest error");
            if (eventEmitter != null) {
                n.f(eventEmitter, i10, th.getMessage(), th);
            }
        }
    }

    public void sendRequestInternal(String str, String str2, int i10, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z10, int i11, boolean z11) {
        f fVar;
        c0 e10;
        Charset c10;
        DeviceEventManagerModule.RCTDeviceEventEmitter eventEmitter = getEventEmitter("sendRequestInternal");
        try {
            Uri parse = Uri.parse(str2);
            for (h hVar : this.mUriHandlers) {
                if (hVar.b(parse, str3)) {
                    n.a(eventEmitter, i10, hVar.a(parse));
                    n.g(eventEmitter, i10);
                    return;
                }
            }
            try {
                b0.a l10 = new b0.a().l(str2);
                if (i10 != 0) {
                    l10.k(Integer.valueOf(i10));
                }
                z.a z12 = this.mClient.z();
                applyCustomBuilder(z12);
                if (!z11) {
                    z12.i(ye.n.f39734a);
                }
                if (z10) {
                    z12.b(new a(this, str3, eventEmitter, i10));
                }
                if (i11 != this.mClient.k()) {
                    z12.f(i11, TimeUnit.MILLISECONDS);
                }
                z c11 = z12.c();
                t extractHeaders = extractHeaders(readableArray, readableMap);
                if (extractHeaders == null) {
                    n.f(eventEmitter, i10, "Unrecognized headers format", null);
                    return;
                }
                String a10 = extractHeaders.a(CONTENT_TYPE_HEADER_NAME);
                String a11 = extractHeaders.a(CONTENT_ENCODING_HEADER_NAME);
                l10.f(extractHeaders);
                if (readableMap != null) {
                    Iterator<f> it = this.mRequestBodyHandlers.iterator();
                    while (it.hasNext()) {
                        fVar = it.next();
                        if (fVar.a(readableMap)) {
                            break;
                        }
                    }
                }
                fVar = null;
                if (readableMap == null || str.toLowerCase().equals("get") || str.toLowerCase().equals("head")) {
                    e10 = m.e(str);
                } else if (fVar != null) {
                    e10 = fVar.b(readableMap, a10);
                } else if (readableMap.hasKey(REQUEST_BODY_KEY_STRING)) {
                    if (a10 == null) {
                        n.f(eventEmitter, i10, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string = readableMap.getString(REQUEST_BODY_KEY_STRING);
                    x f10 = x.f(a10);
                    if (m.g(a11)) {
                        e10 = m.b(f10, string);
                        if (e10 == null) {
                            n.f(eventEmitter, i10, "Failed to gzip request body", null);
                            return;
                        }
                    } else {
                        if (f10 == null) {
                            c10 = h6.g.f31111a;
                        } else {
                            c10 = f10.c(h6.g.f31111a);
                        }
                        e10 = c0.create(f10, string.getBytes(c10));
                    }
                } else if (readableMap.hasKey(REQUEST_BODY_KEY_BASE64)) {
                    if (a10 == null) {
                        n.f(eventEmitter, i10, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    e10 = c0.create(x.f(a10), mf.i.h(readableMap.getString(REQUEST_BODY_KEY_BASE64)));
                } else if (readableMap.hasKey(REQUEST_BODY_KEY_URI)) {
                    if (a10 == null) {
                        n.f(eventEmitter, i10, "Payload is set but no content-type header specified", null);
                        return;
                    }
                    String string2 = readableMap.getString(REQUEST_BODY_KEY_URI);
                    InputStream f11 = m.f(getReactApplicationContext(), string2);
                    if (f11 == null) {
                        n.f(eventEmitter, i10, "Could not retrieve file for uri " + string2, null);
                        return;
                    }
                    e10 = m.a(x.f(a10), f11);
                } else if (readableMap.hasKey(REQUEST_BODY_KEY_FORMDATA)) {
                    if (a10 == null) {
                        a10 = "multipart/form-data";
                    }
                    y.a constructMultipartBody = constructMultipartBody(readableMap.getArray(REQUEST_BODY_KEY_FORMDATA), a10, i10);
                    if (constructMultipartBody == null) {
                        return;
                    }
                    e10 = constructMultipartBody.c();
                } else {
                    e10 = m.e(str);
                }
                l10.g(str, wrapRequestBodyWithProgressEmitter(e10, eventEmitter, i10));
                addRequest(i10);
                c11.a(l10.b()).i1(new b(i10, eventEmitter, str3, z10));
            } catch (Exception e11) {
                n.f(eventEmitter, i10, e11.getMessage(), null);
            }
        } catch (IOException e12) {
            n.f(eventEmitter, i10, e12.getMessage(), e12);
        }
    }

    NetworkingModule(ReactApplicationContext reactApplicationContext, String str, z zVar) {
        this(reactApplicationContext, str, zVar, null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, null, com.facebook.react.modules.network.g.b(reactApplicationContext), null);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, List<com.facebook.react.modules.network.e> list) {
        this(reactApplicationContext, null, com.facebook.react.modules.network.g.b(reactApplicationContext), list);
    }

    public NetworkingModule(ReactApplicationContext reactApplicationContext, String str) {
        this(reactApplicationContext, str, com.facebook.react.modules.network.g.b(reactApplicationContext), null);
    }
}
