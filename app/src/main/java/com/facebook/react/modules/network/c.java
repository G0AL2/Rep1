package com.facebook.react.modules.network;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: ForwardingCookieHandler.java */
/* loaded from: classes.dex */
public class c extends CookieHandler {

    /* renamed from: a  reason: collision with root package name */
    private final C0214c f15582a = new C0214c();

    /* renamed from: b  reason: collision with root package name */
    private final ReactContext f15583b;

    /* renamed from: c  reason: collision with root package name */
    private CookieManager f15584c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForwardingCookieHandler.java */
    /* loaded from: classes.dex */
    public class a implements ValueCallback<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f15585a;

        a(Callback callback) {
            this.f15585a = callback;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
            c.this.f15582a.c();
            this.f15585a.invoke(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ForwardingCookieHandler.java */
    /* loaded from: classes.dex */
    public class b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f15587a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c cVar, ReactContext reactContext, Runnable runnable) {
            super(reactContext);
            this.f15587a = runnable;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            this.f15587a.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ForwardingCookieHandler.java */
    /* renamed from: com.facebook.react.modules.network.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0214c {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f15588a;

        /* compiled from: ForwardingCookieHandler.java */
        /* renamed from: com.facebook.react.modules.network.c$c$a */
        /* loaded from: classes.dex */
        class a implements Handler.Callback {
            a(c cVar) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what == 1) {
                    C0214c.this.d();
                    return true;
                }
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ForwardingCookieHandler.java */
        /* renamed from: com.facebook.react.modules.network.c$c$b */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0214c.this.b();
            }
        }

        public C0214c() {
            this.f15588a = new Handler(Looper.getMainLooper(), new a(c.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @TargetApi(21)
        public void b() {
            CookieManager i10 = c.this.i();
            if (i10 != null) {
                i10.flush();
            }
        }

        public void c() {
        }

        public void d() {
            this.f15588a.removeMessages(1);
            c.this.l(new b());
        }
    }

    public c(ReactContext reactContext) {
        this.f15583b = reactContext;
    }

    @TargetApi(21)
    private void d(String str, String str2) {
        CookieManager i10 = i();
        if (i10 != null) {
            i10.setCookie(str, str2, null);
        }
    }

    @TargetApi(21)
    private void g(Callback callback) {
        CookieManager i10 = i();
        if (i10 != null) {
            i10.removeAllCookies(new a(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CookieManager i() {
        if (this.f15584c == null) {
            k(this.f15583b);
            try {
                this.f15584c = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e10) {
                if (e10.getMessage() == null || !e10.getClass().getCanonicalName().contains("MissingWebViewPackageException")) {
                    throw e10;
                }
                return null;
            }
        }
        return this.f15584c;
    }

    private static boolean j(String str) {
        return str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2");
    }

    private static void k(Context context) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(Runnable runnable) {
        new b(this, this.f15583b, runnable).execute(new Void[0]);
    }

    public void e(String str, List<String> list) {
        CookieManager i10 = i();
        if (i10 == null) {
            return;
        }
        for (String str2 : list) {
            d(str, str2);
        }
        i10.flush();
        this.f15582a.c();
    }

    public void f(Callback callback) {
        g(callback);
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        CookieManager i10 = i();
        if (i10 == null) {
            return Collections.emptyMap();
        }
        String cookie = i10.getCookie(uri.toString());
        if (TextUtils.isEmpty(cookie)) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    public void h() {
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) throws IOException {
        String uri2 = uri.toString();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && j(key)) {
                e(uri2, entry.getValue());
            }
        }
    }
}
