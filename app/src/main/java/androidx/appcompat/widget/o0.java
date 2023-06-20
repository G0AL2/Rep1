package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ResourceManagerInternal.java */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: i  reason: collision with root package name */
    private static o0 f1631i;

    /* renamed from: a  reason: collision with root package name */
    private WeakHashMap<Context, androidx.collection.h<ColorStateList>> f1633a;

    /* renamed from: b  reason: collision with root package name */
    private androidx.collection.g<String, e> f1634b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.collection.h<String> f1635c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakHashMap<Context, androidx.collection.d<WeakReference<Drawable.ConstantState>>> f1636d = new WeakHashMap<>(0);

    /* renamed from: e  reason: collision with root package name */
    private TypedValue f1637e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1638f;

    /* renamed from: g  reason: collision with root package name */
    private f f1639g;

    /* renamed from: h  reason: collision with root package name */
    private static final PorterDuff.Mode f1630h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j  reason: collision with root package name */
    private static final c f1632j = new c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.o0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return f.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e10);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.o0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e10);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class c extends androidx.collection.e<Integer, PorterDuffColorFilter> {
        public c(int i10) {
            super(i10);
        }

        private static int a(int i10, PorterDuff.Mode mode) {
            return ((i10 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter b(int i10, PorterDuff.Mode mode) {
            return get(Integer.valueOf(a(i10, mode)));
        }

        PorterDuffColorFilter c(int i10, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(a(i10, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.o0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        g.c.c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e10) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e10);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public interface f {
        Drawable a(o0 o0Var, Context context, int i10);

        ColorStateList b(Context context, int i10);

        boolean c(Context context, int i10, Drawable drawable);

        PorterDuff.Mode d(int i10);

        boolean e(Context context, int i10, Drawable drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal.java */
    /* loaded from: classes.dex */
    public static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.o0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.h.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e10) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e10);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.f1634b == null) {
            this.f1634b = new androidx.collection.g<>();
        }
        this.f1634b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j10, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            androidx.collection.d<WeakReference<Drawable.ConstantState>> dVar = this.f1636d.get(context);
            if (dVar == null) {
                dVar = new androidx.collection.d<>();
                this.f1636d.put(context, dVar);
            }
            dVar.k(j10, new WeakReference<>(constantState));
            return true;
        }
        return false;
    }

    private void c(Context context, int i10, ColorStateList colorStateList) {
        if (this.f1633a == null) {
            this.f1633a = new WeakHashMap<>();
        }
        androidx.collection.h<ColorStateList> hVar = this.f1633a.get(context);
        if (hVar == null) {
            hVar = new androidx.collection.h<>();
            this.f1633a.put(context, hVar);
        }
        hVar.a(i10, colorStateList);
    }

    private void d(Context context) {
        if (this.f1638f) {
            return;
        }
        this.f1638f = true;
        Drawable j10 = j(context, g.d.f30406a);
        if (j10 == null || !q(j10)) {
            this.f1638f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i10) {
        if (this.f1637e == null) {
            this.f1637e = new TypedValue();
        }
        TypedValue typedValue = this.f1637e;
        context.getResources().getValue(i10, typedValue, true);
        long e10 = e(typedValue);
        Drawable i11 = i(context, e10);
        if (i11 != null) {
            return i11;
        }
        f fVar = this.f1639g;
        Drawable a10 = fVar == null ? null : fVar.a(this, context, i10);
        if (a10 != null) {
            a10.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e10, a10);
        }
        return a10;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized o0 h() {
        o0 o0Var;
        synchronized (o0.class) {
            if (f1631i == null) {
                o0 o0Var2 = new o0();
                f1631i = o0Var2;
                p(o0Var2);
            }
            o0Var = f1631i;
        }
        return o0Var;
    }

    private synchronized Drawable i(Context context, long j10) {
        androidx.collection.d<WeakReference<Drawable.ConstantState>> dVar = this.f1636d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> f10 = dVar.f(j10);
        if (f10 != null) {
            Drawable.ConstantState constantState = f10.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.m(j10);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter b10;
        synchronized (o0.class) {
            c cVar = f1632j;
            b10 = cVar.b(i10, mode);
            if (b10 == null) {
                b10 = new PorterDuffColorFilter(i10, mode);
                cVar.c(i10, mode, b10);
            }
        }
        return b10;
    }

    private ColorStateList n(Context context, int i10) {
        androidx.collection.h<ColorStateList> hVar;
        WeakHashMap<Context, androidx.collection.h<ColorStateList>> weakHashMap = this.f1633a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.e(i10);
    }

    private static void p(o0 o0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            o0Var.a("vector", new g());
            o0Var.a("animated-vector", new b());
            o0Var.a("animated-selector", new a());
            o0Var.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.h) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i10) {
        int next;
        androidx.collection.g<String, e> gVar = this.f1634b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        androidx.collection.h<String> hVar = this.f1635c;
        if (hVar != null) {
            String e10 = hVar.e(i10);
            if ("appcompat_skip_skip".equals(e10) || (e10 != null && this.f1634b.get(e10) == null)) {
                return null;
            }
        } else {
            this.f1635c = new androidx.collection.h<>();
        }
        if (this.f1637e == null) {
            this.f1637e = new TypedValue();
        }
        TypedValue typedValue = this.f1637e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long e11 = e(typedValue);
        Drawable i11 = i(context, e11);
        if (i11 != null) {
            return i11;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.f1635c.a(i10, name);
                    e eVar = this.f1634b.get(name);
                    if (eVar != null) {
                        i11 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (i11 != null) {
                        i11.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, e11, i11);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e12) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e12);
            }
        }
        if (i11 == null) {
            this.f1635c.a(i10, "appcompat_skip_skip");
        }
        return i11;
    }

    private Drawable v(Context context, int i10, boolean z10, Drawable drawable) {
        ColorStateList m10 = m(context, i10);
        if (m10 != null) {
            if (g0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r10 = androidx.core.graphics.drawable.a.r(drawable);
            androidx.core.graphics.drawable.a.o(r10, m10);
            PorterDuff.Mode o10 = o(i10);
            if (o10 != null) {
                androidx.core.graphics.drawable.a.p(r10, o10);
                return r10;
            }
            return r10;
        }
        f fVar = this.f1639g;
        if ((fVar == null || !fVar.e(context, i10, drawable)) && !x(context, i10, drawable) && z10) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void w(Drawable drawable, x0 x0Var, int[] iArr) {
        if (g0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z10 = x0Var.f1753d;
        if (!z10 && !x0Var.f1752c) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(g(z10 ? x0Var.f1750a : null, x0Var.f1752c ? x0Var.f1751b : f1630h, iArr));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i10) {
        return k(context, i10, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable k(Context context, int i10, boolean z10) {
        Drawable r10;
        d(context);
        r10 = r(context, i10);
        if (r10 == null) {
            r10 = f(context, i10);
        }
        if (r10 == null) {
            r10 = androidx.core.content.b.f(context, i10);
        }
        if (r10 != null) {
            r10 = v(context, i10, z10, r10);
        }
        if (r10 != null) {
            g0.b(r10);
        }
        return r10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized ColorStateList m(Context context, int i10) {
        ColorStateList n10;
        n10 = n(context, i10);
        if (n10 == null) {
            f fVar = this.f1639g;
            n10 = fVar == null ? null : fVar.b(context, i10);
            if (n10 != null) {
                c(context, i10, n10);
            }
        }
        return n10;
    }

    PorterDuff.Mode o(int i10) {
        f fVar = this.f1639g;
        if (fVar == null) {
            return null;
        }
        return fVar.d(i10);
    }

    public synchronized void s(Context context) {
        androidx.collection.d<WeakReference<Drawable.ConstantState>> dVar = this.f1636d.get(context);
        if (dVar != null) {
            dVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized Drawable t(Context context, f1 f1Var, int i10) {
        Drawable r10 = r(context, i10);
        if (r10 == null) {
            r10 = f1Var.a(i10);
        }
        if (r10 != null) {
            return v(context, i10, false, r10);
        }
        return null;
    }

    public synchronized void u(f fVar) {
        this.f1639g = fVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean x(Context context, int i10, Drawable drawable) {
        f fVar = this.f1639g;
        return fVar != null && fVar.c(context, i10, drawable);
    }
}
