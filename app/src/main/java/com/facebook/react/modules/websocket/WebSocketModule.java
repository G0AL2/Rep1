package com.facebook.react.modules.websocket;

import com.facebook.fbreact.specs.NativeWebSocketModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vehiclecloud.app.videofetch.rnbillingclient.Analytics;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import mf.i;
import ye.b0;
import ye.d0;
import ye.h0;
import ye.i0;
import ye.z;

@o6.a(hasConstants = false, name = "WebSocketModule")
/* loaded from: classes.dex */
public final class WebSocketModule extends NativeWebSocketModuleSpec {
    public static final String NAME = "WebSocketModule";
    public static final String TAG = "WebSocketModule";
    private final Map<Integer, b> mContentHandlers;
    private c mCookieHandler;
    private final Map<Integer, h0> mWebSocketConnections;

    /* loaded from: classes.dex */
    class a extends i0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15661a;

        a(int i10) {
            this.f15661a = i10;
        }

        @Override // ye.i0
        public void a(h0 h0Var, int i10, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f15661a);
            createMap.putInt(Analytics.Param.CODE, i10);
            createMap.putString(IronSourceConstants.EVENTS_ERROR_REASON, str);
            WebSocketModule.this.sendEvent("websocketClosed", createMap);
        }

        @Override // ye.i0
        public void b(h0 h0Var, int i10, String str) {
            h0Var.f(i10, str);
        }

        @Override // ye.i0
        public void c(h0 h0Var, Throwable th, d0 d0Var) {
            WebSocketModule.this.notifyWebSocketFailed(this.f15661a, th.getMessage());
        }

        @Override // ye.i0
        public void d(h0 h0Var, String str) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f15661a);
            createMap.putString("type", "text");
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.f15661a));
            if (bVar != null) {
                bVar.a(str, createMap);
            } else {
                createMap.putString("data", str);
            }
            WebSocketModule.this.sendEvent("websocketMessage", createMap);
        }

        @Override // ye.i0
        public void e(h0 h0Var, i iVar) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f15661a);
            createMap.putString("type", "binary");
            b bVar = (b) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(this.f15661a));
            if (bVar != null) {
                bVar.b(iVar, createMap);
            } else {
                createMap.putString("data", iVar.f());
            }
            WebSocketModule.this.sendEvent("websocketMessage", createMap);
        }

        @Override // ye.i0
        public void f(h0 h0Var, d0 d0Var) {
            WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(this.f15661a), h0Var);
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", this.f15661a);
            createMap.putString("protocol", d0Var.y("Sec-WebSocket-Protocol", ""));
            WebSocketModule.this.sendEvent("websocketOpen", createMap);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(String str, WritableMap writableMap);

        void b(i iVar, WritableMap writableMap);
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mWebSocketConnections = new ConcurrentHashMap();
        this.mContentHandlers = new ConcurrentHashMap();
        this.mCookieHandler = new c(reactApplicationContext);
    }

    private String getCookie(String str) {
        try {
            List<String> list = this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    private static String getDefaultOrigin(String str) {
        char c10;
        try {
            String str2 = "";
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            int hashCode = scheme.hashCode();
            if (hashCode == 3804) {
                if (scheme.equals("ws")) {
                    c10 = 1;
                }
                c10 = 65535;
            } else if (hashCode == 118039) {
                if (scheme.equals("wss")) {
                    c10 = 0;
                }
                c10 = 65535;
            } else if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals("https")) {
                    c10 = 3;
                }
                c10 = 65535;
            } else {
                if (scheme.equals("http")) {
                    c10 = 2;
                }
                c10 = 65535;
            }
            if (c10 == 0) {
                str2 = "https";
            } else if (c10 == 1) {
                str2 = "http";
            } else if (c10 == 2 || c10 == 3) {
                str2 = "" + uri.getScheme();
            }
            return uri.getPort() != -1 ? String.format("%s://%s:%s", str2, uri.getHost(), Integer.valueOf(uri.getPort())) : String.format("%s://%s", str2, uri.getHost());
        } catch (URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to set " + str + " as default origin header");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyWebSocketFailed(int i10, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i10);
        createMap.putString("message", str);
        sendEvent("websocketFailed", createMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void close(double d10, String str, double d11) {
        int i10 = (int) d11;
        h0 h0Var = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (h0Var == null) {
            return;
        }
        try {
            h0Var.f((int) d10, str);
            this.mWebSocketConnections.remove(Integer.valueOf(i10));
            this.mContentHandlers.remove(Integer.valueOf(i10));
        } catch (Exception e10) {
            z3.a.k("ReactNative", "Could not close WebSocket connection for id " + i10, e10);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void connect(String str, ReadableArray readableArray, ReadableMap readableMap, double d10) {
        boolean z10;
        int i10 = (int) d10;
        z.a aVar = new z.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        z c10 = aVar.f(10L, timeUnit).X(10L, timeUnit).T(0L, TimeUnit.MINUTES).c();
        b0.a l10 = new b0.a().k(Integer.valueOf(i10)).l(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            l10.a("Cookie", cookie);
        }
        if (readableMap != null && readableMap.hasKey("headers") && readableMap.getType("headers").equals(ReadableType.Map)) {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            z10 = false;
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (ReadableType.String.equals(map.getType(nextKey))) {
                    if (nextKey.equalsIgnoreCase(AppMeasurementSdk.ConditionalUserProperty.ORIGIN)) {
                        z10 = true;
                    }
                    l10.a(nextKey, map.getString(nextKey));
                } else {
                    z3.a.G("ReactNative", "Ignoring: requested " + nextKey + ", value not a string");
                }
            }
        } else {
            z10 = false;
        }
        if (!z10) {
            l10.a(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, getDefaultOrigin(str));
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb2 = new StringBuilder("");
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                String trim = readableArray.getString(i11).trim();
                if (!trim.isEmpty() && !trim.contains(",")) {
                    sb2.append(trim);
                    sb2.append(",");
                }
            }
            if (sb2.length() > 0) {
                sb2.replace(sb2.length() - 1, sb2.length(), "");
                l10.a("Sec-WebSocket-Protocol", sb2.toString());
            }
        }
        c10.A(l10.b(), new a(i10));
        c10.p().d().shutdown();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WebSocketModule";
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void ping(double d10) {
        int i10 = (int) d10;
        h0 h0Var = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (h0Var == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i10);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i10);
            createMap2.putInt(Analytics.Param.CODE, 0);
            createMap2.putString(IronSourceConstants.EVENTS_ERROR_REASON, "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i10));
            this.mContentHandlers.remove(Integer.valueOf(i10));
            return;
        }
        try {
            h0Var.b(i.f34461d);
        } catch (Exception e10) {
            notifyWebSocketFailed(i10, e10.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void removeListeners(double d10) {
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void send(String str, double d10) {
        int i10 = (int) d10;
        h0 h0Var = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (h0Var == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i10);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i10);
            createMap2.putInt(Analytics.Param.CODE, 0);
            createMap2.putString(IronSourceConstants.EVENTS_ERROR_REASON, "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i10));
            this.mContentHandlers.remove(Integer.valueOf(i10));
            return;
        }
        try {
            h0Var.a(str);
        } catch (Exception e10) {
            notifyWebSocketFailed(i10, e10.getMessage());
        }
    }

    @Override // com.facebook.fbreact.specs.NativeWebSocketModuleSpec
    public void sendBinary(String str, double d10) {
        int i10 = (int) d10;
        h0 h0Var = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (h0Var == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i10);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i10);
            createMap2.putInt(Analytics.Param.CODE, 0);
            createMap2.putString(IronSourceConstants.EVENTS_ERROR_REASON, "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i10));
            this.mContentHandlers.remove(Integer.valueOf(i10));
            return;
        }
        try {
            h0Var.b(i.h(str));
        } catch (Exception e10) {
            notifyWebSocketFailed(i10, e10.getMessage());
        }
    }

    public void setContentHandler(int i10, b bVar) {
        if (bVar != null) {
            this.mContentHandlers.put(Integer.valueOf(i10), bVar);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i10));
        }
    }

    public void sendBinary(i iVar, int i10) {
        h0 h0Var = this.mWebSocketConnections.get(Integer.valueOf(i10));
        if (h0Var == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i10);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i10);
            createMap2.putInt(Analytics.Param.CODE, 0);
            createMap2.putString(IronSourceConstants.EVENTS_ERROR_REASON, "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i10));
            this.mContentHandlers.remove(Integer.valueOf(i10));
            return;
        }
        try {
            h0Var.b(iVar);
        } catch (Exception e10) {
            notifyWebSocketFailed(i10, e10.getMessage());
        }
    }
}
