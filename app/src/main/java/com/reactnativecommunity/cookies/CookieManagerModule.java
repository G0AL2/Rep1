package com.reactnativecommunity.cookies;

import android.os.Build;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.net.HttpCookie;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public class CookieManagerModule extends ReactContextBaseJavaModule {
    private static final String CLEAR_BY_NAME_NOT_SUPPORTED = "Cannot remove a single cookie by name on Android";
    private static final String GET_ALL_NOT_SUPPORTED = "Get all cookies not supported for Android (iOS only)";
    private static final boolean HTTP_ONLY_SUPPORTED;
    private static final String INVALID_COOKIE_VALUES = "Unable to add cookie - invalid values";
    private static final String INVALID_DOMAINS = "Cookie URL host %s and domain %s mismatched. The cookie won't set correctly.";
    private static final String INVALID_URL_MISSING_HTTP = "Invalid URL: It may be missing a protocol (ex. http:// or https://).";
    private static final boolean USES_LEGACY_STORE;
    private CookieSyncManager mCookieSyncManager;

    /* loaded from: classes3.dex */
    class a implements ValueCallback<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f28308a;

        a(CookieManagerModule cookieManagerModule, Promise promise) {
            this.f28308a = promise;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
            this.f28308a.resolve(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements ValueCallback<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f28309a;

        b(CookieManagerModule cookieManagerModule, Promise promise) {
            this.f28309a = promise;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
            this.f28309a.resolve(bool);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        USES_LEGACY_STORE = i10 < 21;
        HTTP_ONLY_SUPPORTED = i10 >= 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CookieManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCookieSyncManager = CookieSyncManager.createInstance(reactApplicationContext);
    }

    private DateFormat RFC1123dateFormatter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    private void addCookies(String str, String str2, Promise promise) {
        try {
            CookieManager cookieManager = getCookieManager();
            if (USES_LEGACY_STORE) {
                cookieManager.setCookie(str, str2);
                this.mCookieSyncManager.sync();
                promise.resolve(Boolean.TRUE);
            } else {
                cookieManager.setCookie(str, str2, new b(this, promise));
                cookieManager.flush();
            }
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }

    private WritableMap createCookieData(HttpCookie httpCookie) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("name", httpCookie.getName());
        createMap.putString(AppMeasurementSdk.ConditionalUserProperty.VALUE, httpCookie.getValue());
        createMap.putString("domain", httpCookie.getDomain());
        createMap.putString("path", httpCookie.getPath());
        createMap.putBoolean("secure", httpCookie.getSecure());
        if (HTTP_ONLY_SUPPORTED) {
            createMap.putBoolean("httpOnly", httpCookie.isHttpOnly());
        }
        long maxAge = httpCookie.getMaxAge();
        if (maxAge > 0) {
            String formatDate = formatDate(new Date(maxAge));
            if (!isEmpty(formatDate)) {
                createMap.putString("expires", formatDate);
            }
        }
        return createMap;
    }

    private WritableMap createCookieList(String str) throws Exception {
        WritableMap createMap = Arguments.createMap();
        if (!isEmpty(str)) {
            for (String str2 : str.split(";")) {
                for (HttpCookie httpCookie : HttpCookie.parse(str2)) {
                    if (httpCookie != null) {
                        String name = httpCookie.getName();
                        String value = httpCookie.getValue();
                        if (!isEmpty(name) && !isEmpty(value)) {
                            createMap.putMap(name, createCookieData(httpCookie));
                        }
                    }
                }
            }
        }
        return createMap;
    }

    private DateFormat dateFormatter() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZZZZZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    private String formatDate(Date date) {
        return formatDate(date, false);
    }

    private CookieManager getCookieManager() throws Exception {
        try {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            return cookieManager;
        } catch (Exception e10) {
            throw new Exception(e10);
        }
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    private HttpCookie makeHTTPCookieObject(String str, ReadableMap readableMap) throws Exception {
        Date parseDate;
        try {
            String host = new URL(str).getHost();
            if (!isEmpty(host)) {
                HttpCookie httpCookie = new HttpCookie(readableMap.getString("name"), readableMap.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                if (readableMap.hasKey("domain") && !isEmpty(readableMap.getString("domain"))) {
                    String string = readableMap.getString("domain");
                    if (string.startsWith(".")) {
                        string = string.substring(1);
                    }
                    if (!host.contains(string) && !host.equals(string)) {
                        throw new Exception(String.format(INVALID_DOMAINS, host, string));
                    }
                    httpCookie.setDomain(string);
                } else {
                    httpCookie.setDomain(host);
                }
                if (readableMap.hasKey("path") && !isEmpty(readableMap.getString("path"))) {
                    httpCookie.setPath(readableMap.getString("path"));
                }
                if (readableMap.hasKey("expires") && !isEmpty(readableMap.getString("expires")) && (parseDate = parseDate(readableMap.getString("expires"))) != null) {
                    httpCookie.setMaxAge(parseDate.getTime());
                }
                if (readableMap.hasKey("secure") && readableMap.getBoolean("secure")) {
                    httpCookie.setSecure(true);
                }
                if (HTTP_ONLY_SUPPORTED && readableMap.hasKey("httpOnly") && readableMap.getBoolean("httpOnly")) {
                    httpCookie.setHttpOnly(true);
                }
                return httpCookie;
            }
            throw new Exception(INVALID_URL_MISSING_HTTP);
        } catch (Exception unused) {
            throw new Exception(INVALID_URL_MISSING_HTTP);
        }
    }

    private Date parseDate(String str) {
        return parseDate(str, false);
    }

    private String toRFC6265string(HttpCookie httpCookie) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(httpCookie.getName());
        sb2.append('=');
        sb2.append(httpCookie.getValue());
        if (!httpCookie.hasExpired()) {
            long maxAge = httpCookie.getMaxAge();
            if (maxAge > 0) {
                String formatDate = formatDate(new Date(maxAge), true);
                if (!isEmpty(formatDate)) {
                    sb2.append("; expires=");
                    sb2.append(formatDate);
                }
            }
        }
        if (!isEmpty(httpCookie.getDomain())) {
            sb2.append("; domain=");
            sb2.append(httpCookie.getDomain());
        }
        if (!isEmpty(httpCookie.getPath())) {
            sb2.append("; path=");
            sb2.append(httpCookie.getPath());
        }
        if (httpCookie.getSecure()) {
            sb2.append("; secure");
        }
        if (HTTP_ONLY_SUPPORTED && httpCookie.isHttpOnly()) {
            sb2.append("; httponly");
        }
        return sb2.toString();
    }

    @ReactMethod
    public void clearAll(Boolean bool, Promise promise) {
        try {
            CookieManager cookieManager = getCookieManager();
            if (USES_LEGACY_STORE) {
                cookieManager.removeAllCookie();
                cookieManager.removeSessionCookie();
                this.mCookieSyncManager.sync();
                promise.resolve(Boolean.TRUE);
            } else {
                cookieManager.removeAllCookies(new a(this, promise));
                cookieManager.flush();
            }
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }

    @ReactMethod
    public void clearByName(String str, String str2, Boolean bool, Promise promise) {
        promise.reject(new Exception(CLEAR_BY_NAME_NOT_SUPPORTED));
    }

    @ReactMethod
    public void flush(Promise promise) {
        try {
            getCookieManager().flush();
            promise.resolve(Boolean.TRUE);
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }

    @ReactMethod
    public void get(String str, Boolean bool, Promise promise) {
        if (isEmpty(str)) {
            promise.reject(new Exception(INVALID_URL_MISSING_HTTP));
            return;
        }
        try {
            promise.resolve(createCookieList(getCookieManager().getCookie(str)));
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }

    @ReactMethod
    public void getAll(Boolean bool, Promise promise) {
        promise.reject(new Exception(GET_ALL_NOT_SUPPORTED));
    }

    @ReactMethod
    public void getFromResponse(String str, Promise promise) throws URISyntaxException, IOException {
        promise.resolve(str);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCookieManagerAndroid";
    }

    @ReactMethod
    public void set(String str, ReadableMap readableMap, Boolean bool, Promise promise) {
        try {
            String rFC6265string = toRFC6265string(makeHTTPCookieObject(str, readableMap));
            if (rFC6265string == null) {
                promise.reject(new Exception(INVALID_COOKIE_VALUES));
            } else {
                addCookies(str, rFC6265string, promise);
            }
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }

    @ReactMethod
    public void setFromResponse(String str, String str2, Promise promise) {
        if (str2 == null) {
            promise.reject(new Exception(INVALID_COOKIE_VALUES));
        } else {
            addCookies(str, str2, promise);
        }
    }

    private String formatDate(Date date, boolean z10) {
        try {
            return (z10 ? RFC1123dateFormatter() : dateFormatter()).format(date);
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "Unable to format date";
            }
            Log.i("Cookies", message);
            return null;
        }
    }

    private Date parseDate(String str, boolean z10) {
        try {
            return (z10 ? RFC1123dateFormatter() : dateFormatter()).parse(str);
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = "Unable to parse date";
            }
            Log.i("Cookies", message);
            return null;
        }
    }
}
