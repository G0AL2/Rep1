package va;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import xa.g;
import xa.k;
import xa.n;

/* compiled from: RippleDrawableCompat.java */
/* loaded from: classes3.dex */
public class a extends Drawable implements n, a0.a {

    /* renamed from: a  reason: collision with root package name */
    private b f38016a;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a */
    public a mutate() {
        this.f38016a = new b(this.f38016a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f38016a;
        if (bVar.f38018b) {
            bVar.f38017a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f38016a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f38016a.f38017a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f38016a.f38017a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f38016a.f38017a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e10 = va.b.e(iArr);
        b bVar = this.f38016a;
        if (bVar.f38018b != e10) {
            bVar.f38018b = e10;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f38016a.f38017a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f38016a.f38017a.setColorFilter(colorFilter);
    }

    @Override // xa.n
    public void setShapeAppearanceModel(k kVar) {
        this.f38016a.f38017a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTint(int i10) {
        this.f38016a.f38017a.setTint(i10);
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTintList(ColorStateList colorStateList) {
        this.f38016a.f38017a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, a0.a
    public void setTintMode(PorterDuff.Mode mode) {
        this.f38016a.f38017a.setTintMode(mode);
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RippleDrawableCompat.java */
    /* loaded from: classes3.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        g f38017a;

        /* renamed from: b  reason: collision with root package name */
        boolean f38018b;

        public b(g gVar) {
            this.f38017a = gVar;
            this.f38018b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.f38017a = (g) bVar.f38017a.getConstantState().newDrawable();
            this.f38018b = bVar.f38018b;
        }
    }

    private a(b bVar) {
        this.f38016a = bVar;
    }
}
