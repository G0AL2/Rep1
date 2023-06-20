package u4;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: ArrayDrawable.java */
/* loaded from: classes.dex */
public class a extends Drawable implements Drawable.Callback, s, r {

    /* renamed from: a  reason: collision with root package name */
    private s f37431a;

    /* renamed from: c  reason: collision with root package name */
    private final Drawable[] f37433c;

    /* renamed from: d  reason: collision with root package name */
    private final c[] f37434d;

    /* renamed from: b  reason: collision with root package name */
    private final d f37432b = new d();

    /* renamed from: e  reason: collision with root package name */
    private final Rect f37435e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    private boolean f37436f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f37437g = false;

    /* renamed from: h  reason: collision with root package name */
    private boolean f37438h = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArrayDrawable.java */
    /* renamed from: u4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0513a implements c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f37439a;

        C0513a(int i10) {
            this.f37439a = i10;
        }

        @Override // u4.c
        public Drawable h(Drawable drawable) {
            return a.this.g(this.f37439a, drawable);
        }

        @Override // u4.c
        public Drawable r() {
            return a.this.b(this.f37439a);
        }
    }

    public a(Drawable[] drawableArr) {
        int i10 = 0;
        y3.k.g(drawableArr);
        this.f37433c = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f37433c;
            if (i10 < drawableArr2.length) {
                e.d(drawableArr2[i10], this, this);
                i10++;
            } else {
                this.f37434d = new c[drawableArr2.length];
                return;
            }
        }
    }

    private c a(int i10) {
        return new C0513a(i10);
    }

    public Drawable b(int i10) {
        y3.k.b(Boolean.valueOf(i10 >= 0));
        y3.k.b(Boolean.valueOf(i10 < this.f37433c.length));
        return this.f37433c[i10];
    }

    @Override // u4.r
    public void c(s sVar) {
        this.f37431a = sVar;
    }

    public c d(int i10) {
        y3.k.b(Boolean.valueOf(i10 >= 0));
        y3.k.b(Boolean.valueOf(i10 < this.f37434d.length));
        c[] cVarArr = this.f37434d;
        if (cVarArr[i10] == null) {
            cVarArr[i10] = a(i10);
        }
        return this.f37434d[i10];
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.draw(canvas);
            }
            i10++;
        }
    }

    @Override // u4.s
    public void e(Matrix matrix) {
        s sVar = this.f37431a;
        if (sVar != null) {
            sVar.e(matrix);
        } else {
            matrix.reset();
        }
    }

    public int f() {
        return this.f37433c.length;
    }

    public Drawable g(int i10, Drawable drawable) {
        y3.k.b(Boolean.valueOf(i10 >= 0));
        y3.k.b(Boolean.valueOf(i10 < this.f37433c.length));
        Drawable drawable2 = this.f37433c[i10];
        if (drawable != drawable2) {
            if (drawable != null && this.f37438h) {
                drawable.mutate();
            }
            e.d(this.f37433c[i10], null, null);
            e.d(drawable, null, null);
            e.e(drawable, this.f37432b);
            e.a(drawable, this);
            e.d(drawable, this, this);
            this.f37437g = false;
            this.f37433c[i10] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i10 = 0;
        int i11 = -1;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                i11 = Math.max(i11, drawable.getIntrinsicHeight());
            }
            i10++;
        }
        if (i11 > 0) {
            return i11;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i10 = 0;
        int i11 = -1;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i10 >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                i11 = Math.max(i11, drawable.getIntrinsicWidth());
            }
            i10++;
        }
        if (i11 > 0) {
            return i11;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.f37433c.length == 0) {
            return -2;
        }
        int i10 = -1;
        int i11 = 1;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i11 >= drawableArr.length) {
                return i10;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                i10 = Drawable.resolveOpacity(i10, drawable.getOpacity());
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int i10 = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f37435e;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i10 >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (!this.f37437g) {
            this.f37436f = false;
            int i10 = 0;
            while (true) {
                Drawable[] drawableArr = this.f37433c;
                boolean z10 = true;
                if (i10 >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i10];
                boolean z11 = this.f37436f;
                if (drawable == null || !drawable.isStateful()) {
                    z10 = false;
                }
                this.f37436f = z11 | z10;
                i10++;
            }
            this.f37437g = true;
        }
        return this.f37436f;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i10 < drawableArr.length) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    drawable.mutate();
                }
                i10++;
            } else {
                this.f37438h = true;
                return this;
            }
        }
    }

    @Override // u4.s
    public void o(RectF rectF) {
        s sVar = this.f37431a;
        if (sVar != null) {
            sVar.o(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i11 >= drawableArr.length) {
                return z10;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.setLevel(i10)) {
                z10 = true;
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i10 >= drawableArr.length) {
                return z10;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null && drawable.setState(iArr)) {
                z10 = true;
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        scheduleSelf(runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f37432b.b(i10);
        int i11 = 0;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i11 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i11];
            if (drawable != null) {
                drawable.setAlpha(i10);
            }
            i11++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f37432b.c(colorFilter);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z10) {
        this.f37432b.d(z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setDither(z10);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z10) {
        this.f37432b.e(z10);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setFilterBitmap(z10);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f10, float f11) {
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i10 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setHotspot(f10, f11);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        int i10 = 0;
        while (true) {
            Drawable[] drawableArr = this.f37433c;
            if (i10 >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i10];
            if (drawable != null) {
                drawable.setVisible(z10, z11);
            }
            i10++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
