package com.RNFetchBlob;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.content.FileProvider;
import com.RNFetchBlob.f;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import ye.w;
import ye.z;

/* loaded from: classes.dex */
public class RNFetchBlob extends ReactContextBaseJavaModule {
    private static boolean ActionViewVisible;
    static ReactApplicationContext RCTContext;
    static LinkedBlockingQueue<Runnable> fsTaskQueue;
    private static ThreadPoolExecutor fsThreadPool;
    private static SparseArray<Promise> promiseTable;
    private static LinkedBlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();
    private static ThreadPoolExecutor threadPool;
    private final z mClient;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5545b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f5546c;

        a(RNFetchBlob rNFetchBlob, String str, String str2, Promise promise) {
            this.f5544a = str;
            this.f5545b = str2;
            this.f5546c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.o(this.f5544a, this.f5545b, this.f5546c);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f5547a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5548b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5549c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5550d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f5551e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f5552f;

        b(RNFetchBlob rNFetchBlob, ReactApplicationContext reactApplicationContext, String str, String str2, int i10, int i11, String str3) {
            this.f5547a = reactApplicationContext;
            this.f5548b = str;
            this.f5549c = str2;
            this.f5550d = i10;
            this.f5551e = i11;
            this.f5552f = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            new com.RNFetchBlob.d(this.f5547a).y(this.f5548b, this.f5549c, this.f5550d, this.f5551e, this.f5552f);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f5553a;

        c(RNFetchBlob rNFetchBlob, Callback callback) {
            this.f5553a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.f(this.f5553a);
        }
    }

    /* loaded from: classes.dex */
    class d implements ActivityEventListener {
        d(RNFetchBlob rNFetchBlob) {
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
            Integer num = com.RNFetchBlob.c.f5607a;
            if (i10 == num.intValue() && i11 == -1) {
                ((Promise) RNFetchBlob.promiseTable.get(num.intValue())).resolve(intent.getData().toString());
                RNFetchBlob.promiseTable.remove(num.intValue());
            }
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onNewIntent(Intent intent) {
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5554a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5555b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5556c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f5557d;

        e(RNFetchBlob rNFetchBlob, String str, String str2, String str3, Promise promise) {
            this.f5554a = str;
            this.f5555b = str2;
            this.f5556c = str3;
            this.f5557d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.c(this.f5554a, this.f5555b, this.f5556c, this.f5557d);
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5558a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f5559b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f5560c;

        f(RNFetchBlob rNFetchBlob, String str, ReadableArray readableArray, Promise promise) {
            this.f5558a = str;
            this.f5559b = readableArray;
            this.f5560c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.d(this.f5558a, this.f5559b, this.f5560c);
        }
    }

    /* loaded from: classes.dex */
    class g implements LifecycleEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f5561a;

        g(RNFetchBlob rNFetchBlob, Promise promise) {
            this.f5561a = promise;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            if (RNFetchBlob.ActionViewVisible) {
                this.f5561a.resolve(null);
            }
            RNFetchBlob.RCTContext.removeLifecycleEventListener(this);
        }
    }

    /* loaded from: classes.dex */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5562a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5563b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callback f5564c;

        h(RNFetchBlob rNFetchBlob, String str, String str2, Callback callback) {
            this.f5562a = str;
            this.f5563b = str2;
            this.f5564c = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.b(this.f5562a, this.f5563b, this.f5564c);
        }
    }

    /* loaded from: classes.dex */
    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5565a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5566b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f5567c;

        i(RNFetchBlob rNFetchBlob, String str, String str2, Promise promise) {
            this.f5565a = str;
            this.f5566b = str2;
            this.f5567c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.x(this.f5565a, this.f5566b, this.f5567c);
        }
    }

    /* loaded from: classes.dex */
    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5568a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f5569b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f5570c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f5571d;

        j(RNFetchBlob rNFetchBlob, String str, ReadableArray readableArray, boolean z10, Promise promise) {
            this.f5568a = str;
            this.f5569b = readableArray;
            this.f5570c = z10;
            this.f5571d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.I(this.f5568a, this.f5569b, this.f5570c, this.f5571d);
        }
    }

    /* loaded from: classes.dex */
    class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5572a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5573b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5574c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f5575d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Promise f5576e;

        k(RNFetchBlob rNFetchBlob, String str, String str2, String str3, boolean z10, Promise promise) {
            this.f5572a = str;
            this.f5573b = str2;
            this.f5574c = str3;
            this.f5575d = z10;
            this.f5576e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.J(this.f5572a, this.f5573b, this.f5574c, this.f5575d, this.f5576e);
        }
    }

    /* loaded from: classes.dex */
    class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableArray f5577a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f5578b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Callback f5579c;

        l(RNFetchBlob rNFetchBlob, ReadableArray readableArray, ReactApplicationContext reactApplicationContext, Callback callback) {
            this.f5577a = readableArray;
            this.f5578b = reactApplicationContext;
            this.f5579c = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f5577a.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i10 = 0; i10 < size; i10++) {
                ReadableMap map = this.f5577a.getMap(i10);
                if (map.hasKey("path")) {
                    strArr[i10] = map.getString("path");
                    if (map.hasKey("mime")) {
                        strArr2[i10] = map.getString("mime");
                    } else {
                        strArr2[i10] = null;
                    }
                }
            }
            new com.RNFetchBlob.d(this.f5578b).A(strArr, strArr2, this.f5579c);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        threadPool = new ThreadPoolExecutor(5, 10, 5000L, timeUnit, taskQueue);
        fsTaskQueue = new LinkedBlockingQueue<>();
        fsThreadPool = new ThreadPoolExecutor(2, 10, 5000L, timeUnit, taskQueue);
        ActionViewVisible = false;
        promiseTable = new SparseArray<>();
    }

    public RNFetchBlob(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        z f10 = com.facebook.react.modules.network.g.f();
        this.mClient = f10;
        ((com.facebook.react.modules.network.a) f10.o()).d(new w(new com.facebook.react.modules.network.c(reactApplicationContext)));
        RCTContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new d(this));
    }

    @ReactMethod
    public void actionViewIntent(String str, String str2, Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            Uri e10 = FileProvider.e(currentActivity, getReactApplicationContext().getPackageName() + ".provider", new File(str));
            if (Build.VERSION.SDK_INT >= 24) {
                Intent dataAndType = new Intent("android.intent.action.VIEW").setDataAndType(e10, str2);
                dataAndType.setFlags(1);
                dataAndType.addFlags(268435456);
                if (dataAndType.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
                    getReactApplicationContext().startActivity(dataAndType);
                }
            } else {
                Intent intent = new Intent("android.intent.action.VIEW");
                getReactApplicationContext().startActivity(intent.setDataAndType(Uri.parse("file://" + str), str2).setFlags(268435456));
            }
            ActionViewVisible = true;
            RCTContext.addLifecycleEventListener(new g(this, promise));
        } catch (Exception e11) {
            promise.reject("EUNSPECIFIED", e11.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void addCompleteDownload(ReadableMap readableMap, Promise promise) {
        DownloadManager downloadManager = (DownloadManager) RCTContext.getSystemService("download");
        if (readableMap != null && readableMap.hasKey("path")) {
            String w10 = com.RNFetchBlob.d.w(readableMap.getString("path"));
            if (w10 == null) {
                promise.reject("EINVAL", "RNFetchblob.addCompleteDownload can not resolve URI:" + readableMap.getString("path"));
                return;
            }
            try {
                downloadManager.addCompletedDownload(readableMap.hasKey("title") ? readableMap.getString("title") : "", readableMap.hasKey("description") ? readableMap.getString("description") : "", true, readableMap.hasKey("mime") ? readableMap.getString("mime") : null, w10, Long.valueOf(com.RNFetchBlob.d.D(w10).getString("size")).longValue(), readableMap.hasKey("showNotification") && readableMap.getBoolean("showNotification"));
                promise.resolve(null);
                return;
            } catch (Exception e10) {
                promise.reject("EUNSPECIFIED", e10.getLocalizedMessage());
                return;
            }
        }
        promise.reject("EINVAL", "RNFetchblob.addCompleteDownload config or path missing.");
    }

    @ReactMethod
    public void cancelRequest(String str, Callback callback) {
        try {
            com.RNFetchBlob.g.c(str);
            callback.invoke(null, str);
        } catch (Exception e10) {
            callback.invoke(e10.getLocalizedMessage(), null);
        }
    }

    @ReactMethod
    public void closeStream(String str, Callback callback) {
        com.RNFetchBlob.d.a(str, callback);
    }

    @ReactMethod
    public void cp(String str, String str2, Callback callback) {
        threadPool.execute(new h(this, str, str2, callback));
    }

    @ReactMethod
    public void createFile(String str, String str2, String str3, Promise promise) {
        threadPool.execute(new e(this, str, str2, str3, promise));
    }

    @ReactMethod
    public void createFileASCII(String str, ReadableArray readableArray, Promise promise) {
        threadPool.execute(new f(this, str, readableArray, promise));
    }

    @ReactMethod
    public void df(Callback callback) {
        fsThreadPool.execute(new c(this, callback));
    }

    @ReactMethod
    public void enableProgressReport(String str, int i10, int i11) {
        com.RNFetchBlob.g.f5626v.put(str, new com.RNFetchBlob.f(true, i10, i11, f.a.Download));
    }

    @ReactMethod
    public void enableUploadProgressReport(String str, int i10, int i11) {
        com.RNFetchBlob.g.f5627w.put(str, new com.RNFetchBlob.f(true, i10, i11, f.a.Upload));
    }

    @ReactMethod
    public void exists(String str, Callback callback) {
        com.RNFetchBlob.d.j(str, callback);
    }

    @ReactMethod
    public void fetchBlob(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, Callback callback) {
        new com.RNFetchBlob.g(readableMap, str, str2, str3, readableMap2, str4, null, this.mClient, callback).run();
    }

    @ReactMethod
    public void fetchBlobForm(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, ReadableArray readableArray, Callback callback) {
        new com.RNFetchBlob.g(readableMap, str, str2, str3, readableMap2, null, readableArray, this.mClient, callback).run();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return com.RNFetchBlob.d.m(getReactApplicationContext());
    }

    @ReactMethod
    public void getContentIntent(String str, Promise promise) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        if (str != null) {
            intent.setType(str);
        } else {
            intent.setType("*/*");
        }
        SparseArray<Promise> sparseArray = promiseTable;
        Integer num = com.RNFetchBlob.c.f5607a;
        sparseArray.put(num.intValue(), promise);
        getReactApplicationContext().startActivityForResult(intent, num.intValue(), null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNFetchBlob";
    }

    @ReactMethod
    public void getSDCardApplicationDir(Promise promise) {
        com.RNFetchBlob.d.k(getReactApplicationContext(), promise);
    }

    @ReactMethod
    public void getSDCardDir(Promise promise) {
        com.RNFetchBlob.d.l(promise);
    }

    @ReactMethod
    public void hash(String str, String str2, Promise promise) {
        threadPool.execute(new a(this, str, str2, promise));
    }

    @ReactMethod
    public void ls(String str, Promise promise) {
        com.RNFetchBlob.d.s(str, promise);
    }

    @ReactMethod
    public void lstat(String str, Callback callback) {
        com.RNFetchBlob.d.t(str, callback);
    }

    @ReactMethod
    public void mkdir(String str, Promise promise) {
        com.RNFetchBlob.d.u(str, promise);
    }

    @ReactMethod
    public void mv(String str, String str2, Callback callback) {
        com.RNFetchBlob.d.v(str, str2, callback);
    }

    @ReactMethod
    public void readFile(String str, String str2, Promise promise) {
        threadPool.execute(new i(this, str, str2, promise));
    }

    @ReactMethod
    public void readStream(String str, String str2, int i10, int i11, String str3) {
        fsThreadPool.execute(new b(this, getReactApplicationContext(), str, str2, i10, i11, str3));
    }

    @ReactMethod
    public void removeSession(ReadableArray readableArray, Callback callback) {
        com.RNFetchBlob.d.z(readableArray, callback);
    }

    @ReactMethod
    public void scanFile(ReadableArray readableArray, Callback callback) {
        threadPool.execute(new l(this, readableArray, getReactApplicationContext(), callback));
    }

    @ReactMethod
    public void slice(String str, String str2, int i10, int i11, Promise promise) {
        com.RNFetchBlob.d.B(str, str2, i10, i11, "", promise);
    }

    @ReactMethod
    public void stat(String str, Callback callback) {
        com.RNFetchBlob.d.C(str, callback);
    }

    @ReactMethod
    public void unlink(String str, Callback callback) {
        com.RNFetchBlob.d.F(str, callback);
    }

    @ReactMethod
    public void writeArrayChunk(String str, ReadableArray readableArray, Callback callback) {
        com.RNFetchBlob.d.G(str, readableArray, callback);
    }

    @ReactMethod
    public void writeChunk(String str, String str2, Callback callback) {
        com.RNFetchBlob.d.H(str, str2, callback);
    }

    @ReactMethod
    public void writeFile(String str, String str2, String str3, boolean z10, Promise promise) {
        threadPool.execute(new k(this, str, str2, str3, z10, promise));
    }

    @ReactMethod
    public void writeFileArray(String str, ReadableArray readableArray, boolean z10, Promise promise) {
        threadPool.execute(new j(this, str, readableArray, z10, promise));
    }

    @ReactMethod
    public void writeStream(String str, String str2, boolean z10, Callback callback) {
        new com.RNFetchBlob.d(getReactApplicationContext()).K(str, str2, z10, callback);
    }
}
