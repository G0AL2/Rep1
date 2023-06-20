package a2;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.airbnb.lottie.e0;
import i2.d;
import i2.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ImageAssetManager.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: e  reason: collision with root package name */
    private static final Object f46e = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Context f47a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48b;

    /* renamed from: c  reason: collision with root package name */
    private com.airbnb.lottie.b f49c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, e0> f50d;

    public b(Drawable.Callback callback, String str, com.airbnb.lottie.b bVar, Map<String, e0> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.f48b = str + '/';
        } else {
            this.f48b = str;
        }
        if (!(callback instanceof View)) {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f50d = new HashMap();
            this.f47a = null;
            return;
        }
        this.f47a = ((View) callback).getContext();
        this.f50d = map;
        d(bVar);
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (f46e) {
            this.f50d.get(str).f(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        e0 e0Var = this.f50d.get(str);
        if (e0Var == null) {
            return null;
        }
        Bitmap a10 = e0Var.a();
        if (a10 != null) {
            return a10;
        }
        com.airbnb.lottie.b bVar = this.f49c;
        if (bVar != null) {
            Bitmap a11 = bVar.a(e0Var);
            if (a11 != null) {
                c(str, a11);
            }
            return a11;
        }
        String b10 = e0Var.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (b10.startsWith("data:") && b10.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(b10.substring(b10.indexOf(44) + 1), 0);
                return c(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e10) {
                d.d("data URL did not have correct base64 format.", e10);
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.f48b)) {
                AssetManager assets = this.f47a.getAssets();
                try {
                    return c(str, h.l(BitmapFactory.decodeStream(assets.open(this.f48b + b10), null, options), e0Var.e(), e0Var.c()));
                } catch (IllegalArgumentException e11) {
                    d.d("Unable to decode image.", e11);
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException e12) {
            d.d("Unable to open asset.", e12);
            return null;
        }
    }

    public boolean b(Context context) {
        return (context == null && this.f47a == null) || this.f47a.equals(context);
    }

    public void d(com.airbnb.lottie.b bVar) {
        this.f49c = bVar;
    }
}
