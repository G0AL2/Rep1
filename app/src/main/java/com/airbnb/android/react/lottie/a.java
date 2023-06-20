package com.airbnb.android.react.lottie;

import android.widget.ImageView;
import b2.e;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.i0;
import com.airbnb.lottie.p0;
import com.airbnb.lottie.q0;
import com.airbnb.lottie.r0;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import j2.c;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;

/* compiled from: LottieAnimationViewPropertyManager.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<LottieAnimationView> f5680a;

    /* renamed from: b  reason: collision with root package name */
    private String f5681b;

    /* renamed from: c  reason: collision with root package name */
    private Float f5682c;

    /* renamed from: d  reason: collision with root package name */
    private Boolean f5683d;

    /* renamed from: e  reason: collision with root package name */
    private Float f5684e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f5685f;

    /* renamed from: g  reason: collision with root package name */
    private String f5686g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView.ScaleType f5687h;

    /* renamed from: i  reason: collision with root package name */
    private String f5688i;

    /* renamed from: j  reason: collision with root package name */
    private Boolean f5689j;

    /* renamed from: k  reason: collision with root package name */
    private ReadableArray f5690k;

    /* renamed from: l  reason: collision with root package name */
    private ReadableArray f5691l;

    /* renamed from: m  reason: collision with root package name */
    private p0 f5692m;

    public a(LottieAnimationView lottieAnimationView) {
        this.f5680a = new WeakReference<>(lottieAnimationView);
    }

    public void a() {
        int i10;
        LottieAnimationView lottieAnimationView = this.f5680a.get();
        if (lottieAnimationView == null) {
            return;
        }
        ReadableArray readableArray = this.f5691l;
        if (readableArray != null && readableArray.size() > 0) {
            r0 r0Var = new r0(lottieAnimationView);
            for (int i11 = 0; i11 < this.f5691l.size(); i11++) {
                ReadableMap map = this.f5691l.getMap(i11);
                r0Var.e(map.getString("find"), map.getString("replace"));
            }
            lottieAnimationView.setTextDelegate(r0Var);
        }
        String str = this.f5681b;
        if (str != null) {
            lottieAnimationView.A(str, Integer.toString(str.hashCode()));
            this.f5681b = null;
        }
        if (this.f5685f) {
            lottieAnimationView.setAnimation(this.f5686g);
            this.f5685f = false;
        }
        Float f10 = this.f5682c;
        if (f10 != null) {
            lottieAnimationView.setProgress(f10.floatValue());
            this.f5682c = null;
        }
        Boolean bool = this.f5683d;
        if (bool != null) {
            lottieAnimationView.setRepeatCount(bool.booleanValue() ? -1 : 0);
            this.f5683d = null;
        }
        Float f11 = this.f5684e;
        if (f11 != null) {
            lottieAnimationView.setSpeed(f11.floatValue());
            this.f5684e = null;
        }
        ImageView.ScaleType scaleType = this.f5687h;
        if (scaleType != null) {
            lottieAnimationView.setScaleType(scaleType);
            this.f5687h = null;
        }
        p0 p0Var = this.f5692m;
        if (p0Var != null) {
            lottieAnimationView.setRenderMode(p0Var);
            this.f5692m = null;
        }
        String str2 = this.f5688i;
        if (str2 != null) {
            lottieAnimationView.setImageAssetsFolder(str2);
            this.f5688i = null;
        }
        Boolean bool2 = this.f5689j;
        if (bool2 != null) {
            lottieAnimationView.n(bool2.booleanValue());
            this.f5689j = null;
        }
        ReadableArray readableArray2 = this.f5690k;
        if (readableArray2 == null || readableArray2.size() <= 0) {
            return;
        }
        for (int i12 = 0; i12 < this.f5690k.size(); i12++) {
            ReadableMap map2 = this.f5690k.getMap(i12);
            if (map2.getType("color") == ReadableType.Map) {
                i10 = ColorPropConverter.getColor(map2.getMap("color"), lottieAnimationView.getContext()).intValue();
            } else {
                i10 = map2.getInt("color");
            }
            String string = map2.getString("keypath");
            q0 q0Var = new q0(i10);
            lottieAnimationView.j(new e((string + ".**").split(Pattern.quote("."))), i0.K, new c(q0Var));
        }
    }

    public void b(String str) {
        this.f5681b = str;
    }

    public void c(String str) {
        this.f5686g = str;
        this.f5685f = true;
    }

    public void d(ReadableArray readableArray) {
        this.f5690k = readableArray;
    }

    public void e(boolean z10) {
        this.f5689j = Boolean.valueOf(z10);
    }

    public void f(String str) {
        this.f5688i = str;
    }

    public void g(boolean z10) {
        this.f5683d = Boolean.valueOf(z10);
    }

    public void h(Float f10) {
        this.f5682c = f10;
    }

    public void i(p0 p0Var) {
        this.f5692m = p0Var;
    }

    public void j(ImageView.ScaleType scaleType) {
        this.f5687h = scaleType;
    }

    public void k(float f10) {
        this.f5684e = Float.valueOf(f10);
    }

    public void l(ReadableArray readableArray) {
        this.f5691l = readableArray;
    }
}
