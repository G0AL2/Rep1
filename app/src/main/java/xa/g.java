package xa;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import xa.k;
import xa.l;
import xa.m;

/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes3.dex */
public class g extends Drawable implements a0.a, n {

    /* renamed from: v  reason: collision with root package name */
    private static final Paint f38774v = new Paint(1);

    /* renamed from: a  reason: collision with root package name */
    private c f38775a;

    /* renamed from: b  reason: collision with root package name */
    private final m.g[] f38776b;

    /* renamed from: c  reason: collision with root package name */
    private final m.g[] f38777c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f38778d;

    /* renamed from: e  reason: collision with root package name */
    private final Matrix f38779e;

    /* renamed from: f  reason: collision with root package name */
    private final Path f38780f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f38781g;

    /* renamed from: h  reason: collision with root package name */
    private final RectF f38782h;

    /* renamed from: i  reason: collision with root package name */
    private final RectF f38783i;

    /* renamed from: j  reason: collision with root package name */
    private final Region f38784j;

    /* renamed from: k  reason: collision with root package name */
    private final Region f38785k;

    /* renamed from: l  reason: collision with root package name */
    private k f38786l;

    /* renamed from: m  reason: collision with root package name */
    private final Paint f38787m;

    /* renamed from: n  reason: collision with root package name */
    private final Paint f38788n;

    /* renamed from: o  reason: collision with root package name */
    private final wa.a f38789o;

    /* renamed from: p  reason: collision with root package name */
    private final l.a f38790p;

    /* renamed from: q  reason: collision with root package name */
    private final l f38791q;

    /* renamed from: r  reason: collision with root package name */
    private PorterDuffColorFilter f38792r;

    /* renamed from: s  reason: collision with root package name */
    private PorterDuffColorFilter f38793s;

    /* renamed from: t  reason: collision with root package name */
    private Rect f38794t;

    /* renamed from: u  reason: collision with root package name */
    private final RectF f38795u;

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes3.dex */
    class a implements l.a {
        a() {
        }

        @Override // xa.l.a
        public void a(m mVar, Matrix matrix, int i10) {
            g.this.f38776b[i10] = mVar.e(matrix);
        }

        @Override // xa.l.a
        public void b(m mVar, Matrix matrix, int i10) {
            g.this.f38777c[i10] = mVar.e(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes3.dex */
    public class b implements k.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f38797a;

        b(g gVar, float f10) {
            this.f38797a = f10;
        }

        @Override // xa.k.c
        public xa.c a(xa.c cVar) {
            return cVar instanceof i ? cVar : new xa.b(this.f38797a, cVar);
        }
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    private float C() {
        if (K()) {
            return this.f38788n.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean I() {
        c cVar = this.f38775a;
        int i10 = cVar.f38814q;
        return i10 != 1 && cVar.f38815r > 0 && (i10 == 2 || R());
    }

    private boolean J() {
        Paint.Style style = this.f38775a.f38819v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean K() {
        Paint.Style style = this.f38775a.f38819v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f38788n.getStrokeWidth() > 0.0f;
    }

    private void M() {
        super.invalidateSelf();
    }

    private static int P(int i10, int i11) {
        return (i10 * (i11 + (i11 >>> 7))) >>> 8;
    }

    private void Q(Canvas canvas) {
        int y10 = y();
        int z10 = z();
        if (Build.VERSION.SDK_INT < 21) {
            Rect clipBounds = canvas.getClipBounds();
            int i10 = this.f38775a.f38815r;
            clipBounds.inset(-i10, -i10);
            clipBounds.offset(y10, z10);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(y10, z10);
    }

    private boolean R() {
        return Build.VERSION.SDK_INT < 21 || !(O() || this.f38780f.isConvex());
    }

    private boolean d0(int[] iArr) {
        boolean z10;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f38775a.f38801d == null || color2 == (colorForState2 = this.f38775a.f38801d.getColorForState(iArr, (color2 = this.f38787m.getColor())))) {
            z10 = false;
        } else {
            this.f38787m.setColor(colorForState2);
            z10 = true;
        }
        if (this.f38775a.f38802e == null || color == (colorForState = this.f38775a.f38802e.getColorForState(iArr, (color = this.f38788n.getColor())))) {
            return z10;
        }
        this.f38788n.setColor(colorForState);
        return true;
    }

    private PorterDuffColorFilter e(Paint paint, boolean z10) {
        int color;
        int k10;
        if (!z10 || (k10 = k((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(k10, PorterDuff.Mode.SRC_IN);
    }

    private boolean e0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f38792r;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f38793s;
        c cVar = this.f38775a;
        this.f38792r = j(cVar.f38804g, cVar.f38805h, this.f38787m, true);
        c cVar2 = this.f38775a;
        this.f38793s = j(cVar2.f38803f, cVar2.f38805h, this.f38788n, false);
        c cVar3 = this.f38775a;
        if (cVar3.f38818u) {
            this.f38789o.d(cVar3.f38804g.getColorForState(getState(), 0));
        }
        return (h0.c.a(porterDuffColorFilter, this.f38792r) && h0.c.a(porterDuffColorFilter2, this.f38793s)) ? false : true;
    }

    private void f(RectF rectF, Path path) {
        g(rectF, path);
        if (this.f38775a.f38807j != 1.0f) {
            this.f38779e.reset();
            Matrix matrix = this.f38779e;
            float f10 = this.f38775a.f38807j;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f38779e);
        }
        path.computeBounds(this.f38795u, true);
    }

    private void f0() {
        float H = H();
        this.f38775a.f38815r = (int) Math.ceil(0.75f * H);
        this.f38775a.f38816s = (int) Math.ceil(H * 0.25f);
        e0();
        M();
    }

    private void h() {
        k x10 = B().x(new b(this, -C()));
        this.f38786l = x10;
        this.f38791q.d(x10, this.f38775a.f38808k, u(), this.f38781g);
    }

    private PorterDuffColorFilter i(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z10) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = k(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        if (colorStateList != null && mode != null) {
            return i(colorStateList, mode, z10);
        }
        return e(paint, z10);
    }

    private int k(int i10) {
        float H = H() + x();
        qa.a aVar = this.f38775a.f38799b;
        return aVar != null ? aVar.c(i10, H) : i10;
    }

    public static g l(Context context, float f10) {
        int b10 = na.a.b(context, ha.b.f31141l, g.class.getSimpleName());
        g gVar = new g();
        gVar.L(context);
        gVar.U(ColorStateList.valueOf(b10));
        gVar.T(f10);
        return gVar;
    }

    private void m(Canvas canvas) {
        if (this.f38775a.f38816s != 0) {
            canvas.drawPath(this.f38780f, this.f38789o.c());
        }
        for (int i10 = 0; i10 < 4; i10++) {
            this.f38776b[i10].b(this.f38789o, this.f38775a.f38815r, canvas);
            this.f38777c[i10].b(this.f38789o, this.f38775a.f38815r, canvas);
        }
        int y10 = y();
        int z10 = z();
        canvas.translate(-y10, -z10);
        canvas.drawPath(this.f38780f, f38774v);
        canvas.translate(y10, z10);
    }

    private void n(Canvas canvas) {
        p(canvas, this.f38787m, this.f38780f, this.f38775a.f38798a, t());
    }

    private void p(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.u(rectF)) {
            float a10 = kVar.t().a(rectF);
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private void q(Canvas canvas) {
        p(canvas, this.f38788n, this.f38781g, this.f38786l, u());
    }

    private RectF u() {
        RectF t10 = t();
        float C = C();
        this.f38783i.set(t10.left + C, t10.top + C, t10.right - C, t10.bottom - C);
        return this.f38783i;
    }

    public int A() {
        return this.f38775a.f38815r;
    }

    public k B() {
        return this.f38775a.f38798a;
    }

    public ColorStateList D() {
        return this.f38775a.f38804g;
    }

    public float E() {
        return this.f38775a.f38798a.r().a(t());
    }

    public float F() {
        return this.f38775a.f38798a.t().a(t());
    }

    public float G() {
        return this.f38775a.f38813p;
    }

    public float H() {
        return v() + G();
    }

    public void L(Context context) {
        this.f38775a.f38799b = new qa.a(context);
        f0();
    }

    public boolean N() {
        qa.a aVar = this.f38775a.f38799b;
        return aVar != null && aVar.d();
    }

    public boolean O() {
        return this.f38775a.f38798a.u(t());
    }

    public void S(float f10) {
        setShapeAppearanceModel(this.f38775a.f38798a.w(f10));
    }

    public void T(float f10) {
        c cVar = this.f38775a;
        if (cVar.f38812o != f10) {
            cVar.f38812o = f10;
            f0();
        }
    }

    public void U(ColorStateList colorStateList) {
        c cVar = this.f38775a;
        if (cVar.f38801d != colorStateList) {
            cVar.f38801d = colorStateList;
            onStateChange(getState());
        }
    }

    public void V(float f10) {
        c cVar = this.f38775a;
        if (cVar.f38808k != f10) {
            cVar.f38808k = f10;
            this.f38778d = true;
            invalidateSelf();
        }
    }

    public void W(int i10, int i11, int i12, int i13) {
        c cVar = this.f38775a;
        if (cVar.f38806i == null) {
            cVar.f38806i = new Rect();
        }
        this.f38775a.f38806i.set(i10, i11, i12, i13);
        this.f38794t = this.f38775a.f38806i;
        invalidateSelf();
    }

    public void X(float f10) {
        c cVar = this.f38775a;
        if (cVar.f38811n != f10) {
            cVar.f38811n = f10;
            f0();
        }
    }

    public void Y(int i10) {
        c cVar = this.f38775a;
        if (cVar.f38817t != i10) {
            cVar.f38817t = i10;
            M();
        }
    }

    public void Z(float f10, int i10) {
        c0(f10);
        b0(ColorStateList.valueOf(i10));
    }

    public void a0(float f10, ColorStateList colorStateList) {
        c0(f10);
        b0(colorStateList);
    }

    public void b0(ColorStateList colorStateList) {
        c cVar = this.f38775a;
        if (cVar.f38802e != colorStateList) {
            cVar.f38802e = colorStateList;
            onStateChange(getState());
        }
    }

    public void c0(float f10) {
        this.f38775a.f38809l = f10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f38787m.setColorFilter(this.f38792r);
        int alpha = this.f38787m.getAlpha();
        this.f38787m.setAlpha(P(alpha, this.f38775a.f38810m));
        this.f38788n.setColorFilter(this.f38793s);
        this.f38788n.setStrokeWidth(this.f38775a.f38809l);
        int alpha2 = this.f38788n.getAlpha();
        this.f38788n.setAlpha(P(alpha2, this.f38775a.f38810m));
        if (this.f38778d) {
            h();
            f(t(), this.f38780f);
            this.f38778d = false;
        }
        if (I()) {
            canvas.save();
            Q(canvas);
            int width = (int) (this.f38795u.width() - getBounds().width());
            int height = (int) (this.f38795u.height() - getBounds().height());
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f38795u.width()) + (this.f38775a.f38815r * 2) + width, ((int) this.f38795u.height()) + (this.f38775a.f38815r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f10 = (getBounds().left - this.f38775a.f38815r) - width;
            float f11 = (getBounds().top - this.f38775a.f38815r) - height;
            canvas2.translate(-f10, -f11);
            m(canvas2);
            canvas.drawBitmap(createBitmap, f10, f11, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
        if (J()) {
            n(canvas);
        }
        if (K()) {
            q(canvas);
        }
        this.f38787m.setAlpha(alpha);
        this.f38788n.setAlpha(alpha2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(RectF rectF, Path path) {
        l lVar = this.f38791q;
        c cVar = this.f38775a;
        lVar.e(cVar.f38798a, cVar.f38808k, rectF, this.f38790p, path);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f38775a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f38775a.f38814q == 2) {
            return;
        }
        if (O()) {
            outline.setRoundRect(getBounds(), E());
            return;
        }
        f(t(), this.f38780f);
        if (this.f38780f.isConvex()) {
            outline.setConvexPath(this.f38780f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f38794t;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f38784j.set(getBounds());
        f(t(), this.f38780f);
        this.f38785k.setPath(this.f38780f, this.f38784j);
        this.f38784j.op(this.f38785k, Region.Op.DIFFERENCE);
        return this.f38784j;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f38778d = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f38775a.f38804g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f38775a.f38803f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f38775a.f38802e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f38775a.f38801d) != null && colorStateList4.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f38775a = new c(this.f38775a);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void o(Canvas canvas, Paint paint, Path path, RectF rectF) {
        p(canvas, paint, path, this.f38775a.f38798a, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f38778d = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.f.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = d0(iArr) || e0();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    public float r() {
        return this.f38775a.f38798a.j().a(t());
    }

    public float s() {
        return this.f38775a.f38798a.l().a(t());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        c cVar = this.f38775a;
        if (cVar.f38810m != i10) {
            cVar.f38810m = i10;
            M();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f38775a.f38800c = colorFilter;
        M();
    }

    @Override // xa.n
    public void setShapeAppearanceModel(k kVar) {
        this.f38775a.f38798a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTintList(ColorStateList colorStateList) {
        this.f38775a.f38804g = colorStateList;
        e0();
        M();
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f38775a;
        if (cVar.f38805h != mode) {
            cVar.f38805h = mode;
            e0();
            M();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RectF t() {
        Rect bounds = getBounds();
        this.f38782h.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        return this.f38782h;
    }

    public float v() {
        return this.f38775a.f38812o;
    }

    public ColorStateList w() {
        return this.f38775a.f38801d;
    }

    public float x() {
        return this.f38775a.f38811n;
    }

    public int y() {
        c cVar = this.f38775a;
        return (int) (cVar.f38816s * Math.sin(Math.toRadians(cVar.f38817t)));
    }

    public int z() {
        c cVar = this.f38775a;
        return (int) (cVar.f38816s * Math.cos(Math.toRadians(cVar.f38817t)));
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.e(context, attributeSet, i10, i11).m());
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private g(c cVar) {
        this.f38776b = new m.g[4];
        this.f38777c = new m.g[4];
        this.f38779e = new Matrix();
        this.f38780f = new Path();
        this.f38781g = new Path();
        this.f38782h = new RectF();
        this.f38783i = new RectF();
        this.f38784j = new Region();
        this.f38785k = new Region();
        Paint paint = new Paint(1);
        this.f38787m = paint;
        Paint paint2 = new Paint(1);
        this.f38788n = paint2;
        this.f38789o = new wa.a();
        this.f38791q = new l();
        this.f38795u = new RectF();
        this.f38775a = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f38774v;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        e0();
        d0(getState());
        this.f38790p = new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes3.dex */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public k f38798a;

        /* renamed from: b  reason: collision with root package name */
        public qa.a f38799b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f38800c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f38801d;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f38802e;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f38803f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f38804g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f38805h;

        /* renamed from: i  reason: collision with root package name */
        public Rect f38806i;

        /* renamed from: j  reason: collision with root package name */
        public float f38807j;

        /* renamed from: k  reason: collision with root package name */
        public float f38808k;

        /* renamed from: l  reason: collision with root package name */
        public float f38809l;

        /* renamed from: m  reason: collision with root package name */
        public int f38810m;

        /* renamed from: n  reason: collision with root package name */
        public float f38811n;

        /* renamed from: o  reason: collision with root package name */
        public float f38812o;

        /* renamed from: p  reason: collision with root package name */
        public float f38813p;

        /* renamed from: q  reason: collision with root package name */
        public int f38814q;

        /* renamed from: r  reason: collision with root package name */
        public int f38815r;

        /* renamed from: s  reason: collision with root package name */
        public int f38816s;

        /* renamed from: t  reason: collision with root package name */
        public int f38817t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f38818u;

        /* renamed from: v  reason: collision with root package name */
        public Paint.Style f38819v;

        public c(k kVar, qa.a aVar) {
            this.f38801d = null;
            this.f38802e = null;
            this.f38803f = null;
            this.f38804g = null;
            this.f38805h = PorterDuff.Mode.SRC_IN;
            this.f38806i = null;
            this.f38807j = 1.0f;
            this.f38808k = 1.0f;
            this.f38810m = 255;
            this.f38811n = 0.0f;
            this.f38812o = 0.0f;
            this.f38813p = 0.0f;
            this.f38814q = 0;
            this.f38815r = 0;
            this.f38816s = 0;
            this.f38817t = 0;
            this.f38818u = false;
            this.f38819v = Paint.Style.FILL_AND_STROKE;
            this.f38798a = kVar;
            this.f38799b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.f38778d = true;
            return gVar;
        }

        public c(c cVar) {
            this.f38801d = null;
            this.f38802e = null;
            this.f38803f = null;
            this.f38804g = null;
            this.f38805h = PorterDuff.Mode.SRC_IN;
            this.f38806i = null;
            this.f38807j = 1.0f;
            this.f38808k = 1.0f;
            this.f38810m = 255;
            this.f38811n = 0.0f;
            this.f38812o = 0.0f;
            this.f38813p = 0.0f;
            this.f38814q = 0;
            this.f38815r = 0;
            this.f38816s = 0;
            this.f38817t = 0;
            this.f38818u = false;
            this.f38819v = Paint.Style.FILL_AND_STROKE;
            this.f38798a = cVar.f38798a;
            this.f38799b = cVar.f38799b;
            this.f38809l = cVar.f38809l;
            this.f38800c = cVar.f38800c;
            this.f38801d = cVar.f38801d;
            this.f38802e = cVar.f38802e;
            this.f38805h = cVar.f38805h;
            this.f38804g = cVar.f38804g;
            this.f38810m = cVar.f38810m;
            this.f38807j = cVar.f38807j;
            this.f38816s = cVar.f38816s;
            this.f38814q = cVar.f38814q;
            this.f38818u = cVar.f38818u;
            this.f38808k = cVar.f38808k;
            this.f38811n = cVar.f38811n;
            this.f38812o = cVar.f38812o;
            this.f38813p = cVar.f38813p;
            this.f38815r = cVar.f38815r;
            this.f38817t = cVar.f38817t;
            this.f38803f = cVar.f38803f;
            this.f38819v = cVar.f38819v;
            if (cVar.f38806i != null) {
                this.f38806i = new Rect(cVar.f38806i);
            }
        }
    }
}
