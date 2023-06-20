package com.facebook.react.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.views.image.f;
import r5.h;

@o6.a(name = ImageLoaderModule.NAME)
/* loaded from: classes.dex */
public class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private final Object mCallerContext;
    private f mCallerContextFactory;
    private final Object mEnqueuedRequestMonitor;
    private final SparseArray<com.facebook.datasource.c<Void>> mEnqueuedRequests;
    private h mImagePipeline;

    /* loaded from: classes.dex */
    class a extends com.facebook.datasource.b<c4.a<w5.c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f15557a;

        a(ImageLoaderModule imageLoaderModule, Promise promise) {
            this.f15557a = promise;
        }

        @Override // com.facebook.datasource.b
        protected void e(com.facebook.datasource.c<c4.a<w5.c>> cVar) {
            this.f15557a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cVar.d());
        }

        @Override // com.facebook.datasource.b
        protected void f(com.facebook.datasource.c<c4.a<w5.c>> cVar) {
            if (cVar.c()) {
                c4.a<w5.c> a10 = cVar.a();
                try {
                    if (a10 != null) {
                        try {
                            w5.c y10 = a10.y();
                            WritableMap createMap = Arguments.createMap();
                            createMap.putInt("width", y10.getWidth());
                            createMap.putInt("height", y10.getHeight());
                            this.f15557a.resolve(createMap);
                        } catch (Exception e10) {
                            this.f15557a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e10);
                        }
                        return;
                    }
                    this.f15557a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE);
                } finally {
                    c4.a.w(a10);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends com.facebook.datasource.b<c4.a<w5.c>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f15558a;

        b(ImageLoaderModule imageLoaderModule, Promise promise) {
            this.f15558a = promise;
        }

        @Override // com.facebook.datasource.b
        protected void e(com.facebook.datasource.c<c4.a<w5.c>> cVar) {
            this.f15558a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cVar.d());
        }

        @Override // com.facebook.datasource.b
        protected void f(com.facebook.datasource.c<c4.a<w5.c>> cVar) {
            if (cVar.c()) {
                c4.a<w5.c> a10 = cVar.a();
                try {
                    if (a10 != null) {
                        try {
                            w5.c y10 = a10.y();
                            WritableMap createMap = Arguments.createMap();
                            createMap.putInt("width", y10.getWidth());
                            createMap.putInt("height", y10.getHeight());
                            this.f15558a.resolve(createMap);
                        } catch (Exception e10) {
                            this.f15558a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e10);
                        }
                        return;
                    }
                    this.f15558a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE);
                } finally {
                    c4.a.w(a10);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends com.facebook.datasource.b<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f15559a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f15560b;

        c(int i10, Promise promise) {
            this.f15559a = i10;
            this.f15560b = promise;
        }

        @Override // com.facebook.datasource.b
        protected void e(com.facebook.datasource.c<Void> cVar) {
            try {
                ImageLoaderModule.this.removeRequest(this.f15559a);
                this.f15560b.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, cVar.d());
            } finally {
                cVar.close();
            }
        }

        @Override // com.facebook.datasource.b
        protected void f(com.facebook.datasource.c<Void> cVar) {
            try {
                if (cVar.c()) {
                    try {
                        ImageLoaderModule.this.removeRequest(this.f15559a);
                        this.f15560b.resolve(Boolean.TRUE);
                    } catch (Exception e10) {
                        this.f15560b.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, e10);
                    }
                }
            } finally {
                cVar.close();
            }
        }
    }

    /* loaded from: classes.dex */
    class d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableArray f15562a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f15563b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ReactContext reactContext, ReadableArray readableArray, Promise promise) {
            super(reactContext);
            this.f15562a = readableArray;
            this.f15563b = promise;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            WritableMap createMap = Arguments.createMap();
            h imagePipeline = ImageLoaderModule.this.getImagePipeline();
            for (int i10 = 0; i10 < this.f15562a.size(); i10++) {
                String string = this.f15562a.getString(i10);
                Uri parse = Uri.parse(string);
                if (imagePipeline.l(parse)) {
                    createMap.putString(string, "memory");
                } else if (imagePipeline.m(parse)) {
                    createMap.putString(string, "disk");
                }
            }
            this.f15563b.resolve(createMap);
        }
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mImagePipeline = null;
        this.mCallerContext = this;
    }

    private Object getCallerContext() {
        f fVar = this.mCallerContextFactory;
        if (fVar != null) {
            return fVar.a("", "");
        }
        return this.mCallerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h getImagePipeline() {
        h hVar = this.mImagePipeline;
        return hVar != null ? hVar : m4.c.a();
    }

    private void registerRequest(int i10, com.facebook.datasource.c<Void> cVar) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i10, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.facebook.datasource.c<Void> removeRequest(int i10) {
        com.facebook.datasource.c<Void> cVar;
        synchronized (this.mEnqueuedRequestMonitor) {
            cVar = this.mEnqueuedRequests.get(i10);
            this.mEnqueuedRequests.remove(i10);
        }
        return cVar;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double d10) {
        com.facebook.datasource.c<Void> removeRequest = removeRequest((int) d10);
        if (removeRequest != null) {
            removeRequest.close();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String str, Promise promise) {
        if (str != null && !str.isEmpty()) {
            getImagePipeline().d(b6.c.s(new f7.a(getReactApplicationContext(), str).e()).a(), getCallerContext()).e(new a(this, promise), w3.a.a());
            return;
        }
        promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String str, ReadableMap readableMap, Promise promise) {
        if (str != null && !str.isEmpty()) {
            getImagePipeline().d(r6.a.w(b6.c.s(new f7.a(getReactApplicationContext(), str).e()), readableMap), getCallerContext()).e(new b(this, promise), w3.a.a());
            return;
        }
        promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i10 = 0; i10 < size; i10++) {
                com.facebook.datasource.c<Void> valueAt = this.mEnqueuedRequests.valueAt(i10);
                if (valueAt != null) {
                    valueAt.close();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String str, double d10, Promise promise) {
        int i10 = (int) d10;
        if (str != null && !str.isEmpty()) {
            com.facebook.datasource.c<Void> q10 = getImagePipeline().q(b6.c.s(Uri.parse(str)).a(), getCallerContext());
            c cVar = new c(i10, promise);
            registerRequest(i10, q10);
            q10.e(cVar, w3.a.a());
            return;
        }
        promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(ReadableArray readableArray, Promise promise) {
        new d(getReactApplicationContext(), readableArray, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mImagePipeline = null;
        this.mCallerContext = obj;
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, h hVar, f fVar) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mImagePipeline = null;
        this.mCallerContextFactory = fVar;
        this.mImagePipeline = hVar;
        this.mCallerContext = null;
    }
}
