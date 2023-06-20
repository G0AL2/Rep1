package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: h  reason: collision with root package name */
    private static final int[] f1811h = {16842801};

    /* renamed from: i  reason: collision with root package name */
    private static final e f1812i;

    /* renamed from: a  reason: collision with root package name */
    private boolean f1813a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1814b;

    /* renamed from: c  reason: collision with root package name */
    int f1815c;

    /* renamed from: d  reason: collision with root package name */
    int f1816d;

    /* renamed from: e  reason: collision with root package name */
    final Rect f1817e;

    /* renamed from: f  reason: collision with root package name */
    final Rect f1818f;

    /* renamed from: g  reason: collision with root package name */
    private final d f1819g;

    /* loaded from: classes.dex */
    class a implements d {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f1820a;

        a() {
        }

        @Override // androidx.cardview.widget.d
        public void a(int i10, int i11, int i12, int i13) {
            CardView.this.f1818f.set(i10, i11, i12, i13);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1817e;
            CardView.super.setPadding(i10 + rect.left, i11 + rect.top, i12 + rect.right, i13 + rect.bottom);
        }

        @Override // androidx.cardview.widget.d
        public void b(Drawable drawable) {
            this.f1820a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.d
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.d
        public Drawable d() {
            return this.f1820a;
        }

        @Override // androidx.cardview.widget.d
        public void e(int i10, int i11) {
            CardView cardView = CardView.this;
            if (i10 > cardView.f1815c) {
                CardView.super.setMinimumWidth(i10);
            }
            CardView cardView2 = CardView.this;
            if (i11 > cardView2.f1816d) {
                CardView.super.setMinimumHeight(i11);
            }
        }

        @Override // androidx.cardview.widget.d
        public boolean f() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.d
        public View g() {
            return CardView.this;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 21) {
            f1812i = new b();
        } else if (i10 >= 17) {
            f1812i = new androidx.cardview.widget.a();
        } else {
            f1812i = new c();
        }
        f1812i.k();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, o.a.f34818a);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1812i.e(this.f1819g);
    }

    public float getCardElevation() {
        return f1812i.i(this.f1819g);
    }

    public int getContentPaddingBottom() {
        return this.f1817e.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1817e.left;
    }

    public int getContentPaddingRight() {
        return this.f1817e.right;
    }

    public int getContentPaddingTop() {
        return this.f1817e.top;
    }

    public float getMaxCardElevation() {
        return f1812i.d(this.f1819g);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1814b;
    }

    public float getRadius() {
        return f1812i.b(this.f1819g);
    }

    public boolean getUseCompatPadding() {
        return this.f1813a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        e eVar = f1812i;
        if (!(eVar instanceof b)) {
            int mode = View.MeasureSpec.getMode(i10);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.l(this.f1819g)), View.MeasureSpec.getSize(i10)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i11);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i11 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(eVar.f(this.f1819g)), View.MeasureSpec.getSize(i11)), mode2);
            }
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f1812i.m(this.f1819g, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f1812i.c(this.f1819g, f10);
    }

    public void setMaxCardElevation(float f10) {
        f1812i.n(this.f1819g, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f1816d = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f1815c = i10;
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1814b) {
            this.f1814b = z10;
            f1812i.g(this.f1819g);
        }
    }

    public void setRadius(float f10) {
        f1812i.a(this.f1819g, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1813a != z10) {
            this.f1813a = z10;
            f1812i.j(this.f1819g);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1817e = rect;
        this.f1818f = new Rect();
        a aVar = new a();
        this.f1819g = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.e.f34825a, i10, o.d.f34824a);
        int i11 = o.e.f34828d;
        if (obtainStyledAttributes.hasValue(i11)) {
            valueOf = obtainStyledAttributes.getColorStateList(i11);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1811h);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(o.b.f34820b);
            } else {
                color = getResources().getColor(o.b.f34819a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(o.e.f34829e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(o.e.f34830f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(o.e.f34831g, 0.0f);
        this.f1813a = obtainStyledAttributes.getBoolean(o.e.f34833i, false);
        this.f1814b = obtainStyledAttributes.getBoolean(o.e.f34832h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(o.e.f34834j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(o.e.f34836l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(o.e.f34838n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(o.e.f34837m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(o.e.f34835k, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1815c = obtainStyledAttributes.getDimensionPixelSize(o.e.f34826b, 0);
        this.f1816d = obtainStyledAttributes.getDimensionPixelSize(o.e.f34827c, 0);
        obtainStyledAttributes.recycle();
        f1812i.h(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1812i.m(this.f1819g, colorStateList);
    }
}
