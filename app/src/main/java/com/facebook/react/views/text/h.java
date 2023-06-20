package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ReactFontManager.java */
/* loaded from: classes.dex */
public class h {

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f16198c = {"", "_bold", "_italic", "_bold_italic"};

    /* renamed from: d  reason: collision with root package name */
    private static final String[] f16199d = {".ttf", ".otf"};

    /* renamed from: e  reason: collision with root package name */
    private static h f16200e;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, b> f16201a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Typeface> f16202b = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactFontManager.java */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private SparseArray<Typeface> f16203a;

        public Typeface a(int i10) {
            return this.f16203a.get(i10);
        }

        public void b(int i10, Typeface typeface) {
            this.f16203a.put(i10, typeface);
        }

        private b() {
            this.f16203a = new SparseArray<>(4);
        }
    }

    private h() {
    }

    private static Typeface a(String str, int i10, AssetManager assetManager) {
        String[] strArr;
        String str2 = f16198c[i10];
        for (String str3 : f16199d) {
            try {
                return Typeface.createFromAsset(assetManager, "fonts/" + str + str2 + str3);
            } catch (RuntimeException unused) {
            }
        }
        return Typeface.create(str, i10);
    }

    public static h b() {
        if (f16200e == null) {
            f16200e = new h();
        }
        return f16200e;
    }

    public Typeface c(String str, int i10, AssetManager assetManager) {
        return d(str, new a0(i10), assetManager);
    }

    public Typeface d(String str, a0 a0Var, AssetManager assetManager) {
        if (this.f16202b.containsKey(str)) {
            return a0Var.a(this.f16202b.get(str));
        }
        b bVar = this.f16201a.get(str);
        if (bVar == null) {
            bVar = new b();
            this.f16201a.put(str, bVar);
        }
        int b10 = a0Var.b();
        Typeface a10 = bVar.a(b10);
        if (a10 == null) {
            Typeface a11 = a(str, b10, assetManager);
            bVar.b(b10, a11);
            return a11;
        }
        return a10;
    }
}
