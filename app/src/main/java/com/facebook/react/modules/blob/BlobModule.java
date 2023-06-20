package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.fbreact.specs.NativeBlobModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.ironsource.mediationsdk.logger.IronSourceError;
import h6.e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import mf.i;
import ye.c0;
import ye.e0;
import ye.x;

@o6.a(name = BlobModule.NAME)
/* loaded from: classes.dex */
public class BlobModule extends NativeBlobModuleSpec {
    public static final String NAME = "BlobModule";
    private final Map<String, byte[]> mBlobs;
    private final NetworkingModule.f mNetworkingRequestBodyHandler;
    private final NetworkingModule.g mNetworkingResponseHandler;
    private final NetworkingModule.h mNetworkingUriHandler;
    private final WebSocketModule.b mWebSocketContentHandler;

    /* loaded from: classes.dex */
    class a implements WebSocketModule.b {
        a() {
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.b
        public void a(String str, WritableMap writableMap) {
            writableMap.putString("data", str);
        }

        @Override // com.facebook.react.modules.websocket.WebSocketModule.b
        public void b(i iVar, WritableMap writableMap) {
            byte[] D = iVar.D();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(D));
            createMap.putInt("offset", 0);
            createMap.putInt("size", D.length);
            writableMap.putMap("data", createMap);
            writableMap.putString("type", "blob");
        }
    }

    /* loaded from: classes.dex */
    class b implements NetworkingModule.h {
        b() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.h
        public WritableMap a(Uri uri) throws IOException {
            byte[] bytesFromUri = BlobModule.this.getBytesFromUri(uri);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(bytesFromUri));
            createMap.putInt("offset", 0);
            createMap.putInt("size", bytesFromUri.length);
            createMap.putString("type", BlobModule.this.getMimeTypeFromUri(uri));
            createMap.putString("name", BlobModule.this.getNameFromUri(uri));
            createMap.putDouble("lastModified", BlobModule.this.getLastModifiedFromUri(uri));
            return createMap;
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.h
        public boolean b(Uri uri, String str) {
            String scheme = uri.getScheme();
            return !("http".equals(scheme) || "https".equals(scheme)) && "blob".equals(str);
        }
    }

    /* loaded from: classes.dex */
    class c implements NetworkingModule.f {
        c() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.f
        public boolean a(ReadableMap readableMap) {
            return readableMap.hasKey("blob");
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.f
        public c0 b(ReadableMap readableMap, String str) {
            if (readableMap.hasKey("type") && !readableMap.getString("type").isEmpty()) {
                str = readableMap.getString("type");
            }
            if (str == null) {
                str = "application/octet-stream";
            }
            ReadableMap map = readableMap.getMap("blob");
            return c0.create(x.f(str), BlobModule.this.resolve(map.getString("blobId"), map.getInt("offset"), map.getInt("size")));
        }
    }

    /* loaded from: classes.dex */
    class d implements NetworkingModule.g {
        d() {
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.g
        public WritableMap a(e0 e0Var) throws IOException {
            byte[] b10 = e0Var.b();
            WritableMap createMap = Arguments.createMap();
            createMap.putString("blobId", BlobModule.this.store(b10));
            createMap.putInt("offset", 0);
            createMap.putInt("size", b10.length);
            return createMap;
        }

        @Override // com.facebook.react.modules.network.NetworkingModule.g
        public boolean b(String str) {
            return "blob".equals(str);
        }
    }

    public BlobModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mBlobs = new HashMap();
        this.mWebSocketContentHandler = new a();
        this.mNetworkingUriHandler = new b();
        this.mNetworkingRequestBodyHandler = new c();
        this.mNetworkingResponseHandler = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] getBytesFromUri(Uri uri) throws IOException {
        InputStream openInputStream = getReactApplicationContext().getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[IronSourceError.ERROR_RV_LOAD_FAILED_NO_CANDIDATES];
            while (true) {
                int read = openInputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } else {
            throw new FileNotFoundException("File not found for " + uri);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLastModifiedFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new File(uri.toString()).lastModified();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getMimeTypeFromUri(Uri uri) {
        String fileExtensionFromUrl;
        String type = getReactApplicationContext().getContentResolver().getType(uri);
        if (type == null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return type == null ? "" : type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getNameFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return uri.getLastPathSegment();
        }
        Cursor query = getReactApplicationContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    return query.getString(0);
                }
            } finally {
                query.close();
            }
        }
        return uri.getLastPathSegment();
    }

    private WebSocketModule getWebSocketModule(String str) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (WebSocketModule) reactApplicationContextIfActiveOrWarn.getNativeModule(WebSocketModule.class);
        }
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addNetworkingHandler() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            NetworkingModule networkingModule = (NetworkingModule) reactApplicationContextIfActiveOrWarn.getNativeModule(NetworkingModule.class);
            networkingModule.addUriHandler(this.mNetworkingUriHandler);
            networkingModule.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
            networkingModule.addResponseHandler(this.mNetworkingResponseHandler);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addWebSocketHandler(double d10) {
        int i10 = (int) d10;
        WebSocketModule webSocketModule = getWebSocketModule("addWebSocketHandler");
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i10, this.mWebSocketContentHandler);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void createFromParts(ReadableArray readableArray, String str) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        int i10 = 0;
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            ReadableMap map = readableArray.getMap(i11);
            String string = map.getString("type");
            string.hashCode();
            if (string.equals("string")) {
                byte[] bytes = map.getString("data").getBytes(Charset.forName("UTF-8"));
                i10 += bytes.length;
                arrayList.add(i11, bytes);
            } else if (string.equals("blob")) {
                ReadableMap map2 = map.getMap("data");
                i10 += map2.getInt("size");
                arrayList.add(i11, resolve(map2));
            } else {
                throw new IllegalArgumentException("Invalid type for blob: " + map.getString("type"));
            }
        }
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            allocate.put((byte[]) it.next());
        }
        store(allocate.array(), str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public Map<String, Object> getTypedExportedConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        if (identifier == 0) {
            return e.c();
        }
        return e.e("BLOB_URI_SCHEME", AppLovinEventTypes.USER_VIEWED_CONTENT, "BLOB_URI_HOST", resources.getString(identifier));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        BlobCollector.b(getReactApplicationContext(), this);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void release(String str) {
        remove(str);
    }

    @g6.a
    public void remove(String str) {
        synchronized (this.mBlobs) {
            this.mBlobs.remove(str);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void removeWebSocketHandler(double d10) {
        int i10 = (int) d10;
        WebSocketModule webSocketModule = getWebSocketModule("removeWebSocketHandler");
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i10, null);
        }
    }

    public byte[] resolve(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("offset");
        int parseInt = queryParameter != null ? Integer.parseInt(queryParameter, 10) : 0;
        String queryParameter2 = uri.getQueryParameter("size");
        return resolve(lastPathSegment, parseInt, queryParameter2 != null ? Integer.parseInt(queryParameter2, 10) : -1);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void sendOverSocket(ReadableMap readableMap, double d10) {
        int i10 = (int) d10;
        WebSocketModule webSocketModule = getWebSocketModule("sendOverSocket");
        if (webSocketModule != null) {
            byte[] resolve = resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
            if (resolve != null) {
                webSocketModule.sendBinary(i.t(resolve), i10);
            } else {
                webSocketModule.sendBinary((i) null, i10);
            }
        }
    }

    public String store(byte[] bArr) {
        String uuid = UUID.randomUUID().toString();
        store(bArr, uuid);
        return uuid;
    }

    public void store(byte[] bArr, String str) {
        synchronized (this.mBlobs) {
            this.mBlobs.put(str, bArr);
        }
    }

    public byte[] resolve(String str, int i10, int i11) {
        synchronized (this.mBlobs) {
            byte[] bArr = this.mBlobs.get(str);
            if (bArr == null) {
                return null;
            }
            if (i11 == -1) {
                i11 = bArr.length - i10;
            }
            if (i10 > 0 || i11 != bArr.length) {
                bArr = Arrays.copyOfRange(bArr, i10, i11 + i10);
            }
            return bArr;
        }
    }

    public byte[] resolve(ReadableMap readableMap) {
        return resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
    }
}
