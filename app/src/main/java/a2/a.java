package a2;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import b2.i;
import i2.d;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FontAssetManager.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    private final AssetManager f44d;

    /* renamed from: a  reason: collision with root package name */
    private final i<String> f41a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<i<String>, Typeface> f42b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Typeface> f43c = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    private String f45e = ".ttf";

    public a(Drawable.Callback callback, com.airbnb.lottie.a aVar) {
        if (!(callback instanceof View)) {
            d.c("LottieDrawable must be inside of a view for images to work.");
            this.f44d = null;
            return;
        }
        this.f44d = ((View) callback).getContext().getAssets();
    }

    private Typeface a(String str) {
        Typeface typeface = this.f43c.get(str);
        if (typeface != null) {
            return typeface;
        }
        Typeface createFromAsset = Typeface.createFromAsset(this.f44d, "fonts/" + str + this.f45e);
        this.f43c.put(str, createFromAsset);
        return createFromAsset;
    }

    private Typeface d(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i10 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i10 ? typeface : Typeface.create(typeface, i10);
    }

    public Typeface b(String str, String str2) {
        this.f41a.b(str, str2);
        Typeface typeface = this.f42b.get(this.f41a);
        if (typeface != null) {
            return typeface;
        }
        Typeface d10 = d(a(str), str2);
        this.f42b.put(this.f41a, d10);
        return d10;
    }

    public void c(com.airbnb.lottie.a aVar) {
    }
}
