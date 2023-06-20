package fr.greweb.reactnativeviewshot;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public class RNViewShotModule extends ReactContextBaseJavaModule {
    public static final String RNVIEW_SHOT = "RNViewShot";
    private static final String TEMP_FILE_PREFIX = "ReactNative-snapshot-image";
    private final ReactApplicationContext reactContext;

    /* loaded from: classes3.dex */
    private static class b extends GuardedAsyncTask<Void, Void> implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        private final File f30374a;

        /* renamed from: b  reason: collision with root package name */
        private final File f30375b;

        private void a(File file) {
            File[] listFiles = file.listFiles(this);
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.delete()) {
                        Log.d(RNViewShotModule.RNVIEW_SHOT, "deleted file: " + file2.getAbsolutePath());
                    }
                }
            }
        }

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(RNViewShotModule.TEMP_FILE_PREFIX);
        }

        private b(ReactContext reactContext) {
            super(reactContext);
            this.f30374a = reactContext.getCacheDir();
            this.f30375b = reactContext.getExternalCacheDir();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            File file = this.f30374a;
            if (file != null) {
                a(file);
            }
            File file2 = this.f30375b;
            if (file2 != null) {
                a(file2);
            }
        }
    }

    public RNViewShotModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private File createTempFile(Context context, String str, String str2) throws IOException {
        File externalCacheDir = context.getExternalCacheDir();
        File cacheDir = context.getCacheDir();
        if (externalCacheDir == null && cacheDir == null) {
            throw new IOException("No cache directory available");
        }
        if (externalCacheDir == null || (cacheDir != null && externalCacheDir.getFreeSpace() <= cacheDir.getFreeSpace())) {
            externalCacheDir = cacheDir;
        }
        String str3 = "." + str;
        if (str2 != null) {
            return File.createTempFile(str2, str3, externalCacheDir);
        }
        return File.createTempFile(TEMP_FILE_PREFIX, str3, externalCacheDir);
    }

    @ReactMethod
    public void captureRef(int i10, ReadableMap readableMap, Promise promise) {
        int i11;
        getReactApplicationContext().getResources().getDisplayMetrics();
        String string = readableMap.getString("format");
        if ("jpg".equals(string)) {
            i11 = 0;
        } else if ("webm".equals(string)) {
            i11 = 2;
        } else {
            i11 = "raw".equals(string) ? -1 : 1;
        }
        double d10 = readableMap.getDouble("quality");
        Integer valueOf = readableMap.hasKey("width") ? Integer.valueOf(readableMap.getInt("width")) : null;
        Integer valueOf2 = readableMap.hasKey("height") ? Integer.valueOf(readableMap.getInt("height")) : null;
        String string2 = readableMap.getString(IronSourceConstants.EVENTS_RESULT);
        String string3 = readableMap.hasKey("fileName") ? readableMap.getString("fileName") : null;
        Boolean valueOf3 = Boolean.valueOf(readableMap.getBoolean("snapshotContentContainer"));
        boolean z10 = readableMap.hasKey("handleGLSurfaceViewOnAndroid") && readableMap.getBoolean("handleGLSurfaceViewOnAndroid");
        try {
            ((UIManagerModule) this.reactContext.getNativeModule(UIManagerModule.class)).addUIBlock(new fr.greweb.reactnativeviewshot.a(i10, string, i11, d10, valueOf, valueOf2, "tmpfile".equals(string2) ? createTempFile(getReactApplicationContext(), string, string3) : null, string2, valueOf3, this.reactContext, getCurrentActivity(), z10, promise));
        } catch (Throwable th) {
            Log.e(RNVIEW_SHOT, "Failed to snapshot view tag " + i10, th);
            promise.reject("E_UNABLE_TO_SNAPSHOT", "Failed to snapshot view tag " + i10);
        }
    }

    @ReactMethod
    public void captureScreen(ReadableMap readableMap, Promise promise) {
        captureRef(-1, readableMap, promise);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.emptyMap();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return RNVIEW_SHOT;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        new b(getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    @ReactMethod
    public void releaseCapture(String str) {
        String path = Uri.parse(str).getPath();
        if (path == null) {
            return;
        }
        File file = new File(path);
        if (file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile.equals(this.reactContext.getExternalCacheDir()) || parentFile.equals(this.reactContext.getCacheDir())) {
                file.delete();
            }
        }
    }
}
