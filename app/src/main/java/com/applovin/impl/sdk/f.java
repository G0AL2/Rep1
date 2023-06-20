package com.applovin.impl.sdk;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import com.applovin.sdk.AppLovinSdkUtils;
import java.net.HttpURLConnection;
import java.net.URLEncoder;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private static final int f8468a = (int) TimeUnit.SECONDS.toMillis(30);

    /* renamed from: m  reason: collision with root package name */
    private static final f f8469m = new f();

    /* renamed from: c  reason: collision with root package name */
    private Handler f8471c;

    /* renamed from: e  reason: collision with root package name */
    private Handler f8473e;

    /* renamed from: h  reason: collision with root package name */
    private m f8476h;

    /* renamed from: i  reason: collision with root package name */
    private Thread f8477i;

    /* renamed from: j  reason: collision with root package name */
    private long f8478j;

    /* renamed from: k  reason: collision with root package name */
    private long f8479k;

    /* renamed from: l  reason: collision with root package name */
    private long f8480l;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f8470b = new AtomicLong(0);

    /* renamed from: d  reason: collision with root package name */
    private final HandlerThread f8472d = new HandlerThread("applovin-anr-detector");

    /* renamed from: f  reason: collision with root package name */
    private final AtomicBoolean f8474f = new AtomicBoolean();

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f8475g = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.f8474f.get()) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - f.this.f8470b.get();
            if (currentTimeMillis < 0 || currentTimeMillis > f.this.f8478j) {
                f.this.a();
                f.this.b();
            }
            f.this.f8473e.postDelayed(this, f.this.f8480l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.f8474f.get()) {
                return;
            }
            f.this.f8470b.set(System.currentTimeMillis());
            f.this.f8471c.postDelayed(this, f.this.f8479k);
        }
    }

    private f() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f8478j = timeUnit.toMillis(4L);
        this.f8479k = timeUnit.toMillis(3L);
        this.f8480l = timeUnit.toMillis(3L);
    }

    private static String a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f8475g.get()) {
            this.f8474f.set(true);
        }
    }

    public static void a(m mVar) {
        if (mVar != null) {
            if (((Boolean) mVar.a(com.applovin.impl.sdk.c.b.eP)).booleanValue()) {
                f8469m.b(mVar);
            } else {
                f8469m.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) c().openConnection();
            int i10 = f8468a;
            httpURLConnection.setConnectTimeout(i10);
            httpURLConnection.setReadTimeout(i10);
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setDoOutput(false);
            int responseCode = httpURLConnection.getResponseCode();
            Log.d("applovin-anr-detector", "ANR reported with code " + responseCode);
        } catch (Throwable th) {
            Log.w("applovin-anr-detector", "Failed to report ANR", th);
        }
    }

    private void b(m mVar) {
        if (this.f8475g.compareAndSet(false, true)) {
            this.f8476h = mVar;
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.f.1
                @Override // java.lang.Runnable
                public void run() {
                    f.this.f8477i = Thread.currentThread();
                }
            });
            this.f8478j = ((Long) mVar.a(com.applovin.impl.sdk.c.b.eQ)).longValue();
            this.f8479k = ((Long) mVar.a(com.applovin.impl.sdk.c.b.eR)).longValue();
            this.f8480l = ((Long) mVar.a(com.applovin.impl.sdk.c.b.eS)).longValue();
            this.f8471c = new Handler(mVar.L().getMainLooper());
            this.f8472d.start();
            this.f8471c.post(new b());
            Handler handler = new Handler(this.f8472d.getLooper());
            this.f8473e = handler;
            handler.postDelayed(new a(), this.f8480l / 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029 A[Catch: MalformedURLException -> 0x016e, TRY_ENTER, TryCatch #2 {MalformedURLException -> 0x016e, blocks: (B:8:0x0019, B:11:0x0029, B:16:0x0047, B:18:0x004b, B:20:0x0052, B:21:0x0076, B:23:0x0105, B:24:0x0107, B:26:0x0115, B:27:0x0117, B:12:0x0036, B:14:0x003a), top: B:35:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036 A[Catch: MalformedURLException -> 0x016e, TryCatch #2 {MalformedURLException -> 0x016e, blocks: (B:8:0x0019, B:11:0x0029, B:16:0x0047, B:18:0x004b, B:20:0x0052, B:21:0x0076, B:23:0x0105, B:24:0x0107, B:26:0x0115, B:27:0x0117, B:12:0x0036, B:14:0x003a), top: B:35:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0105 A[Catch: MalformedURLException -> 0x016e, TryCatch #2 {MalformedURLException -> 0x016e, blocks: (B:8:0x0019, B:11:0x0029, B:16:0x0047, B:18:0x004b, B:20:0x0052, B:21:0x0076, B:23:0x0105, B:24:0x0107, B:26:0x0115, B:27:0x0117, B:12:0x0036, B:14:0x003a), top: B:35:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0115 A[Catch: MalformedURLException -> 0x016e, TryCatch #2 {MalformedURLException -> 0x016e, blocks: (B:8:0x0019, B:11:0x0029, B:16:0x0047, B:18:0x004b, B:20:0x0052, B:21:0x0076, B:23:0x0105, B:24:0x0107, B:26:0x0115, B:27:0x0117, B:12:0x0036, B:14:0x003a), top: B:35:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.URL c() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.f.c():java.net.URL");
    }
}
