package com.oblador.vectoricons;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.views.text.h;
import fm.castbox.mediation.BuildConfig;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class VectorIconsModule extends ReactContextBaseJavaModule {
    public static final String REACT_CLASS = "RNVectorIconsModule";
    private static final Map<String, Typeface> sTypefaceCache = new HashMap();

    public VectorIconsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    protected String createGlyphImagePath(String str, String str2, Integer num, Integer num2) throws IOException, FileNotFoundException {
        FileOutputStream fileOutputStream;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        File cacheDir = reactApplicationContext.getCacheDir();
        String str3 = cacheDir.getAbsolutePath() + "/";
        float f10 = reactApplicationContext.getResources().getDisplayMetrics().density;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("@");
        int i10 = (int) f10;
        sb2.append(f10 == ((float) i10) ? Integer.toString(i10) : Float.toString(f10));
        sb2.append("x");
        String sb3 = sb2.toString();
        int round = Math.round(num.intValue() * f10);
        String str4 = str3 + Integer.toString((str + ":" + str2 + ":" + num2).hashCode(), 32) + "_" + Integer.toString(num.intValue()) + sb3 + ".png";
        String str5 = "file://" + str4;
        File file = new File(str4);
        if (file.exists()) {
            return str5;
        }
        FileOutputStream fileOutputStream2 = null;
        Typeface c10 = h.b().c(str, 0, reactApplicationContext.getAssets());
        Paint paint = new Paint();
        paint.setTypeface(c10);
        paint.setColor(num2.intValue());
        paint.setTextSize(round);
        paint.setAntiAlias(true);
        paint.getTextBounds(str2, 0, str2.length(), new Rect());
        int i11 = round - ((int) paint.getFontMetrics().bottom);
        Bitmap createBitmap = Bitmap.createBitmap(round, round, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawText(str2, 0, i11, paint);
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return str5;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            throw th;
        }
    }

    @ReactMethod
    public void getImageForFont(String str, String str2, Integer num, Integer num2, Promise promise) {
        try {
            promise.resolve(createGlyphImagePath(str, str2, num, num2));
        } catch (Throwable th) {
            promise.reject("E_UNKNOWN_ERROR", th);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = BuildConfig.SHOULD_GZIP_HTTP_REQUEST)
    public String getImageForFontSync(String str, String str2, Integer num, Integer num2) {
        try {
            return createGlyphImagePath(str, str2, num, num2);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }
}
