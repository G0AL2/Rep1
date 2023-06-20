package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z.d;

/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public class h extends androidx.vectordrawable.graphics.drawable.g {

    /* renamed from: j  reason: collision with root package name */
    static final PorterDuff.Mode f4187j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private C0079h f4188b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuffColorFilter f4189c;

    /* renamed from: d  reason: collision with root package name */
    private ColorFilter f4190d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4191e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f4192f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f4193g;

    /* renamed from: h  reason: collision with root package name */
    private final Matrix f4194h;

    /* renamed from: i  reason: collision with root package name */
    private final Rect f4195i;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4222b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f4221a = z.d.d(string2);
            }
            this.f4223c = y.i.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (y.i.j(xmlPullParser, "pathData")) {
                TypedArray k10 = y.i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4162d);
                f(k10, xmlPullParser);
                k10.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* renamed from: androidx.vectordrawable.graphics.drawable.h$h  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0079h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f4242a;

        /* renamed from: b  reason: collision with root package name */
        g f4243b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f4244c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f4245d;

        /* renamed from: e  reason: collision with root package name */
        boolean f4246e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f4247f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f4248g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f4249h;

        /* renamed from: i  reason: collision with root package name */
        int f4250i;

        /* renamed from: j  reason: collision with root package name */
        boolean f4251j;

        /* renamed from: k  reason: collision with root package name */
        boolean f4252k;

        /* renamed from: l  reason: collision with root package name */
        Paint f4253l;

        public C0079h(C0079h c0079h) {
            this.f4244c = null;
            this.f4245d = h.f4187j;
            if (c0079h != null) {
                this.f4242a = c0079h.f4242a;
                g gVar = new g(c0079h.f4243b);
                this.f4243b = gVar;
                if (c0079h.f4243b.f4230e != null) {
                    gVar.f4230e = new Paint(c0079h.f4243b.f4230e);
                }
                if (c0079h.f4243b.f4229d != null) {
                    this.f4243b.f4229d = new Paint(c0079h.f4243b.f4229d);
                }
                this.f4244c = c0079h.f4244c;
                this.f4245d = c0079h.f4245d;
                this.f4246e = c0079h.f4246e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f4247f.getWidth() && i11 == this.f4247f.getHeight();
        }

        public boolean b() {
            return !this.f4252k && this.f4248g == this.f4244c && this.f4249h == this.f4245d && this.f4251j == this.f4246e && this.f4250i == this.f4243b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f4247f == null || !a(i10, i11)) {
                this.f4247f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f4252k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f4247f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (f() || colorFilter != null) {
                if (this.f4253l == null) {
                    Paint paint = new Paint();
                    this.f4253l = paint;
                    paint.setFilterBitmap(true);
                }
                this.f4253l.setAlpha(this.f4243b.getRootAlpha());
                this.f4253l.setColorFilter(colorFilter);
                return this.f4253l;
            }
            return null;
        }

        public boolean f() {
            return this.f4243b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f4243b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4242a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f4243b.g(iArr);
            this.f4252k |= g10;
            return g10;
        }

        public void i() {
            this.f4248g = this.f4244c;
            this.f4249h = this.f4245d;
            this.f4250i = this.f4243b.getRootAlpha();
            this.f4251j = this.f4246e;
            this.f4252k = false;
        }

        public void j(int i10, int i11) {
            this.f4247f.eraseColor(0);
            this.f4243b.b(new Canvas(this.f4247f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }

        public C0079h() {
            this.f4244c = null;
            this.f4245d = h.f4187j;
            this.f4243b = new g();
        }
    }

    h() {
        this.f4192f = true;
        this.f4193g = new float[9];
        this.f4194h = new Matrix();
        this.f4195i = new Rect();
        this.f4188b = new C0079h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static h b(Resources resources, int i10, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h();
            hVar.f4186a = y.h.e(resources, i10, theme);
            new i(hVar.f4186a.getConstantState());
            return hVar;
        }
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
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
            return null;
        }
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C0079h c0079h = this.f4188b;
        g gVar = c0079h.f4243b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f4233h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4209b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f4241p.put(cVar.getPathName(), cVar);
                    }
                    z10 = false;
                    c0079h.f4242a = cVar.f4224d | c0079h.f4242a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4209b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f4241p.put(bVar.getPathName(), bVar);
                    }
                    c0079h.f4242a = bVar.f4224d | c0079h.f4242a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f4209b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f4241p.put(dVar2.getGroupName(), dVar2);
                    }
                    c0079h.f4242a = dVar2.f4218k | c0079h.f4242a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int i10, PorterDuff.Mode mode) {
        if (i10 != 3) {
            if (i10 != 5) {
                if (i10 != 9) {
                    switch (i10) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C0079h c0079h = this.f4188b;
        g gVar = c0079h.f4243b;
        c0079h.f4245d = g(y.i.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c10 = y.i.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c10 != null) {
            c0079h.f4244c = c10;
        }
        c0079h.f4246e = y.i.a(typedArray, xmlPullParser, "autoMirrored", 5, c0079h.f4246e);
        gVar.f4236k = y.i.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f4236k);
        float f10 = y.i.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f4237l);
        gVar.f4237l = f10;
        if (gVar.f4236k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f10 > 0.0f) {
            gVar.f4234i = typedArray.getDimension(3, gVar.f4234i);
            float dimension = typedArray.getDimension(2, gVar.f4235j);
            gVar.f4235j = dimension;
            if (gVar.f4234i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(y.i.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f4239n = string;
                    gVar.f4241p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.b(drawable);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f4188b.f4243b.f4241p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f4195i);
        if (this.f4195i.width() <= 0 || this.f4195i.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f4190d;
        if (colorFilter == null) {
            colorFilter = this.f4189c;
        }
        canvas.getMatrix(this.f4194h);
        this.f4194h.getValues(this.f4193g);
        float abs = Math.abs(this.f4193g[0]);
        float abs2 = Math.abs(this.f4193g[4]);
        float abs3 = Math.abs(this.f4193g[1]);
        float abs4 = Math.abs(this.f4193g[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f4195i.width() * abs));
        int min2 = Math.min(2048, (int) (this.f4195i.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f4195i;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f4195i.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f4195i.offsetTo(0, 0);
        this.f4188b.c(min, min2);
        if (!this.f4192f) {
            this.f4188b.j(min, min2);
        } else if (!this.f4188b.b()) {
            this.f4188b.j(min, min2);
            this.f4188b.i();
        }
        this.f4188b.d(canvas, colorFilter, this.f4195i);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.d(drawable);
        }
        return this.f4188b.f4243b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f4188b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.e(drawable);
        }
        return this.f4190d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f4186a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f4186a.getConstantState());
        }
        this.f4188b.f4242a = getChangingConfigurations();
        return this.f4188b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f4188b.f4243b.f4235j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f4188b.f4243b.f4234i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z10) {
        this.f4192f = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.h(drawable);
        }
        return this.f4188b.f4246e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0079h c0079h;
        ColorStateList colorStateList;
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((c0079h = this.f4188b) != null && (c0079h.g() || ((colorStateList = this.f4188b.f4244c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4191e && super.mutate() == this) {
            this.f4188b = new C0079h(this.f4188b);
            this.f4191e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        C0079h c0079h = this.f4188b;
        ColorStateList colorStateList = c0079h.f4244c;
        if (colorStateList != null && (mode = c0079h.f4245d) != null) {
            this.f4189c = j(this.f4189c, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (c0079h.g() && c0079h.h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f4188b.f4243b.getRootAlpha() != i10) {
            this.f4188b.f4243b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, z10);
        } else {
            this.f4188b.f4246e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f4190d = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTint(int i10) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            return;
        }
        C0079h c0079h = this.f4188b;
        if (c0079h.f4244c != colorStateList) {
            c0079h.f4244c = colorStateList;
            this.f4189c = j(this.f4189c, colorStateList, c0079h.f4245d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.p(drawable, mode);
            return;
        }
        C0079h c0079h = this.f4188b;
        if (c0079h.f4245d != mode) {
            c0079h.f4245d = mode;
            this.f4189c = j(this.f4189c, c0079h.f4244c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    private static class i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f4254a;

        public i(Drawable.ConstantState constantState) {
            this.f4254a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f4254a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f4254a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f4186a = (VectorDrawable) this.f4254a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f4186a = (VectorDrawable) this.f4254a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f4186a = (VectorDrawable) this.f4254a.newDrawable(resources, theme);
            return hVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected d.b[] f4221a;

        /* renamed from: b  reason: collision with root package name */
        String f4222b;

        /* renamed from: c  reason: collision with root package name */
        int f4223c;

        /* renamed from: d  reason: collision with root package name */
        int f4224d;

        public f() {
            super();
            this.f4221a = null;
            this.f4223c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            d.b[] bVarArr = this.f4221a;
            if (bVarArr != null) {
                d.b.e(bVarArr, path);
            }
        }

        public d.b[] getPathData() {
            return this.f4221a;
        }

        public String getPathName() {
            return this.f4222b;
        }

        public void setPathData(d.b[] bVarArr) {
            if (!z.d.b(this.f4221a, bVarArr)) {
                this.f4221a = z.d.f(bVarArr);
            } else {
                z.d.j(this.f4221a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f4221a = null;
            this.f4223c = 0;
            this.f4222b = fVar.f4222b;
            this.f4224d = fVar.f4224d;
            this.f4221a = z.d.f(fVar.f4221a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f4186a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0079h c0079h = this.f4188b;
        c0079h.f4243b = new g();
        TypedArray k10 = y.i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4159a);
        i(k10, xmlPullParser, theme);
        k10.recycle();
        c0079h.f4242a = getChangingConfigurations();
        c0079h.f4252k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f4189c = j(this.f4189c, c0079h.f4244c, c0079h.f4245d);
    }

    h(C0079h c0079h) {
        this.f4192f = true;
        this.f4193g = new float[9];
        this.f4194h = new Matrix();
        this.f4195i = new Rect();
        this.f4188b = c0079h;
        this.f4189c = j(this.f4189c, c0079h.f4244c, c0079h.f4245d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f4196e;

        /* renamed from: f  reason: collision with root package name */
        y.d f4197f;

        /* renamed from: g  reason: collision with root package name */
        float f4198g;

        /* renamed from: h  reason: collision with root package name */
        y.d f4199h;

        /* renamed from: i  reason: collision with root package name */
        float f4200i;

        /* renamed from: j  reason: collision with root package name */
        float f4201j;

        /* renamed from: k  reason: collision with root package name */
        float f4202k;

        /* renamed from: l  reason: collision with root package name */
        float f4203l;

        /* renamed from: m  reason: collision with root package name */
        float f4204m;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f4205n;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f4206o;

        /* renamed from: p  reason: collision with root package name */
        float f4207p;

        c() {
            this.f4198g = 0.0f;
            this.f4200i = 1.0f;
            this.f4201j = 1.0f;
            this.f4202k = 0.0f;
            this.f4203l = 1.0f;
            this.f4204m = 0.0f;
            this.f4205n = Paint.Cap.BUTT;
            this.f4206o = Paint.Join.MITER;
            this.f4207p = 4.0f;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return i10 != 2 ? cap : Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return i10 != 2 ? join : Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f4196e = null;
            if (y.i.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f4222b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f4221a = z.d.d(string2);
                }
                this.f4199h = y.i.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f4201j = y.i.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f4201j);
                this.f4205n = e(y.i.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f4205n);
                this.f4206o = f(y.i.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f4206o);
                this.f4207p = y.i.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f4207p);
                this.f4197f = y.i.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f4200i = y.i.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f4200i);
                this.f4198g = y.i.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f4198g);
                this.f4203l = y.i.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f4203l);
                this.f4204m = y.i.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f4204m);
                this.f4202k = y.i.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f4202k);
                this.f4223c = y.i.g(typedArray, xmlPullParser, "fillType", 13, this.f4223c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean a() {
            return this.f4199h.i() || this.f4197f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean b(int[] iArr) {
            return this.f4197f.j(iArr) | this.f4199h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = y.i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4161c);
            h(k10, xmlPullParser, theme);
            k10.recycle();
        }

        float getFillAlpha() {
            return this.f4201j;
        }

        int getFillColor() {
            return this.f4199h.e();
        }

        float getStrokeAlpha() {
            return this.f4200i;
        }

        int getStrokeColor() {
            return this.f4197f.e();
        }

        float getStrokeWidth() {
            return this.f4198g;
        }

        float getTrimPathEnd() {
            return this.f4203l;
        }

        float getTrimPathOffset() {
            return this.f4204m;
        }

        float getTrimPathStart() {
            return this.f4202k;
        }

        void setFillAlpha(float f10) {
            this.f4201j = f10;
        }

        void setFillColor(int i10) {
            this.f4199h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f4200i = f10;
        }

        void setStrokeColor(int i10) {
            this.f4197f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f4198g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f4203l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f4204m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f4202k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f4198g = 0.0f;
            this.f4200i = 1.0f;
            this.f4201j = 1.0f;
            this.f4202k = 0.0f;
            this.f4203l = 1.0f;
            this.f4204m = 0.0f;
            this.f4205n = Paint.Cap.BUTT;
            this.f4206o = Paint.Join.MITER;
            this.f4207p = 4.0f;
            this.f4196e = cVar.f4196e;
            this.f4197f = cVar.f4197f;
            this.f4198g = cVar.f4198g;
            this.f4200i = cVar.f4200i;
            this.f4199h = cVar.f4199h;
            this.f4223c = cVar.f4223c;
            this.f4201j = cVar.f4201j;
            this.f4202k = cVar.f4202k;
            this.f4203l = cVar.f4203l;
            this.f4204m = cVar.f4204m;
            this.f4205n = cVar.f4205n;
            this.f4206o = cVar.f4206o;
            this.f4207p = cVar.f4207p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: q  reason: collision with root package name */
        private static final Matrix f4225q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f4226a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f4227b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f4228c;

        /* renamed from: d  reason: collision with root package name */
        Paint f4229d;

        /* renamed from: e  reason: collision with root package name */
        Paint f4230e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f4231f;

        /* renamed from: g  reason: collision with root package name */
        private int f4232g;

        /* renamed from: h  reason: collision with root package name */
        final d f4233h;

        /* renamed from: i  reason: collision with root package name */
        float f4234i;

        /* renamed from: j  reason: collision with root package name */
        float f4235j;

        /* renamed from: k  reason: collision with root package name */
        float f4236k;

        /* renamed from: l  reason: collision with root package name */
        float f4237l;

        /* renamed from: m  reason: collision with root package name */
        int f4238m;

        /* renamed from: n  reason: collision with root package name */
        String f4239n;

        /* renamed from: o  reason: collision with root package name */
        Boolean f4240o;

        /* renamed from: p  reason: collision with root package name */
        final androidx.collection.a<String, Object> f4241p;

        public g() {
            this.f4228c = new Matrix();
            this.f4234i = 0.0f;
            this.f4235j = 0.0f;
            this.f4236k = 0.0f;
            this.f4237l = 0.0f;
            this.f4238m = 255;
            this.f4239n = null;
            this.f4240o = null;
            this.f4241p = new androidx.collection.a<>();
            this.f4233h = new d();
            this.f4226a = new Path();
            this.f4227b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f4208a.set(matrix);
            dVar.f4208a.preConcat(dVar.f4217j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f4209b.size(); i12++) {
                e eVar = dVar.f4209b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f4208a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f4236k;
            float f11 = i11 / this.f4237l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f4208a;
            this.f4228c.set(matrix);
            this.f4228c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 == 0.0f) {
                return;
            }
            fVar.d(this.f4226a);
            Path path = this.f4226a;
            this.f4227b.reset();
            if (fVar.c()) {
                this.f4227b.setFillType(fVar.f4223c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f4227b.addPath(path, this.f4228c);
                canvas.clipPath(this.f4227b);
                return;
            }
            c cVar = (c) fVar;
            float f12 = cVar.f4202k;
            if (f12 != 0.0f || cVar.f4203l != 1.0f) {
                float f13 = cVar.f4204m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f4203l + f13) % 1.0f;
                if (this.f4231f == null) {
                    this.f4231f = new PathMeasure();
                }
                this.f4231f.setPath(this.f4226a, false);
                float length = this.f4231f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f4231f.getSegment(f16, length, path, true);
                    this.f4231f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f4231f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f4227b.addPath(path, this.f4228c);
            if (cVar.f4199h.l()) {
                y.d dVar2 = cVar.f4199h;
                if (this.f4230e == null) {
                    Paint paint = new Paint(1);
                    this.f4230e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f4230e;
                if (dVar2.h()) {
                    Shader f18 = dVar2.f();
                    f18.setLocalMatrix(this.f4228c);
                    paint2.setShader(f18);
                    paint2.setAlpha(Math.round(cVar.f4201j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(h.a(dVar2.e(), cVar.f4201j));
                }
                paint2.setColorFilter(colorFilter);
                this.f4227b.setFillType(cVar.f4223c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f4227b, paint2);
            }
            if (cVar.f4197f.l()) {
                y.d dVar3 = cVar.f4197f;
                if (this.f4229d == null) {
                    Paint paint3 = new Paint(1);
                    this.f4229d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f4229d;
                Paint.Join join = cVar.f4206o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f4205n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f4207p);
                if (dVar3.h()) {
                    Shader f19 = dVar3.f();
                    f19.setLocalMatrix(this.f4228c);
                    paint4.setShader(f19);
                    paint4.setAlpha(Math.round(cVar.f4200i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(h.a(dVar3.e(), cVar.f4200i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f4198g * min * e10);
                canvas.drawPath(this.f4227b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f4233h, f4225q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f4240o == null) {
                this.f4240o = Boolean.valueOf(this.f4233h.a());
            }
            return this.f4240o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f4233h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f4238m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f4238m = i10;
        }

        public g(g gVar) {
            this.f4228c = new Matrix();
            this.f4234i = 0.0f;
            this.f4235j = 0.0f;
            this.f4236k = 0.0f;
            this.f4237l = 0.0f;
            this.f4238m = 255;
            this.f4239n = null;
            this.f4240o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f4241p = aVar;
            this.f4233h = new d(gVar.f4233h, aVar);
            this.f4226a = new Path(gVar.f4226a);
            this.f4227b = new Path(gVar.f4227b);
            this.f4234i = gVar.f4234i;
            this.f4235j = gVar.f4235j;
            this.f4236k = gVar.f4236k;
            this.f4237l = gVar.f4237l;
            this.f4232g = gVar.f4232g;
            this.f4238m = gVar.f4238m;
            this.f4239n = gVar.f4239n;
            String str = gVar.f4239n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f4240o = gVar.f4240o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f4208a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f4209b;

        /* renamed from: c  reason: collision with root package name */
        float f4210c;

        /* renamed from: d  reason: collision with root package name */
        private float f4211d;

        /* renamed from: e  reason: collision with root package name */
        private float f4212e;

        /* renamed from: f  reason: collision with root package name */
        private float f4213f;

        /* renamed from: g  reason: collision with root package name */
        private float f4214g;

        /* renamed from: h  reason: collision with root package name */
        private float f4215h;

        /* renamed from: i  reason: collision with root package name */
        private float f4216i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f4217j;

        /* renamed from: k  reason: collision with root package name */
        int f4218k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f4219l;

        /* renamed from: m  reason: collision with root package name */
        private String f4220m;

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            super();
            f bVar;
            this.f4208a = new Matrix();
            this.f4209b = new ArrayList<>();
            this.f4210c = 0.0f;
            this.f4211d = 0.0f;
            this.f4212e = 0.0f;
            this.f4213f = 1.0f;
            this.f4214g = 1.0f;
            this.f4215h = 0.0f;
            this.f4216i = 0.0f;
            Matrix matrix = new Matrix();
            this.f4217j = matrix;
            this.f4220m = null;
            this.f4210c = dVar.f4210c;
            this.f4211d = dVar.f4211d;
            this.f4212e = dVar.f4212e;
            this.f4213f = dVar.f4213f;
            this.f4214g = dVar.f4214g;
            this.f4215h = dVar.f4215h;
            this.f4216i = dVar.f4216i;
            this.f4219l = dVar.f4219l;
            String str = dVar.f4220m;
            this.f4220m = str;
            this.f4218k = dVar.f4218k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f4217j);
            ArrayList<e> arrayList = dVar.f4209b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f4209b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f4209b.add(bVar);
                    String str2 = bVar.f4222b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f4217j.reset();
            this.f4217j.postTranslate(-this.f4211d, -this.f4212e);
            this.f4217j.postScale(this.f4213f, this.f4214g);
            this.f4217j.postRotate(this.f4210c, 0.0f, 0.0f);
            this.f4217j.postTranslate(this.f4215h + this.f4211d, this.f4216i + this.f4212e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f4219l = null;
            this.f4210c = y.i.f(typedArray, xmlPullParser, "rotation", 5, this.f4210c);
            this.f4211d = typedArray.getFloat(1, this.f4211d);
            this.f4212e = typedArray.getFloat(2, this.f4212e);
            this.f4213f = y.i.f(typedArray, xmlPullParser, "scaleX", 3, this.f4213f);
            this.f4214g = y.i.f(typedArray, xmlPullParser, "scaleY", 4, this.f4214g);
            this.f4215h = y.i.f(typedArray, xmlPullParser, "translateX", 6, this.f4215h);
            this.f4216i = y.i.f(typedArray, xmlPullParser, "translateY", 7, this.f4216i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f4220m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f4209b.size(); i10++) {
                if (this.f4209b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f4209b.size(); i10++) {
                z10 |= this.f4209b.get(i10).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k10 = y.i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f4160b);
            e(k10, xmlPullParser);
            k10.recycle();
        }

        public String getGroupName() {
            return this.f4220m;
        }

        public Matrix getLocalMatrix() {
            return this.f4217j;
        }

        public float getPivotX() {
            return this.f4211d;
        }

        public float getPivotY() {
            return this.f4212e;
        }

        public float getRotation() {
            return this.f4210c;
        }

        public float getScaleX() {
            return this.f4213f;
        }

        public float getScaleY() {
            return this.f4214g;
        }

        public float getTranslateX() {
            return this.f4215h;
        }

        public float getTranslateY() {
            return this.f4216i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f4211d) {
                this.f4211d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f4212e) {
                this.f4212e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f4210c) {
                this.f4210c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f4213f) {
                this.f4213f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f4214g) {
                this.f4214g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f4215h) {
                this.f4215h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f4216i) {
                this.f4216i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f4208a = new Matrix();
            this.f4209b = new ArrayList<>();
            this.f4210c = 0.0f;
            this.f4211d = 0.0f;
            this.f4212e = 0.0f;
            this.f4213f = 1.0f;
            this.f4214g = 1.0f;
            this.f4215h = 0.0f;
            this.f4216i = 0.0f;
            this.f4217j = new Matrix();
            this.f4220m = null;
        }
    }
}
