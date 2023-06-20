package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.z;
import com.google.android.material.internal.f;
import ha.b;
import ha.d;
import ha.i;
import ha.j;
import ha.k;
import ha.l;
import java.lang.ref.WeakReference;
import ua.c;
import xa.g;

/* loaded from: classes2.dex */
public class BadgeDrawable extends Drawable implements f.b {

    /* renamed from: q  reason: collision with root package name */
    private static final int f22026q = k.f31259h;

    /* renamed from: r  reason: collision with root package name */
    private static final int f22027r = b.f31131b;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<Context> f22028a;

    /* renamed from: b  reason: collision with root package name */
    private final g f22029b;

    /* renamed from: c  reason: collision with root package name */
    private final f f22030c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f22031d;

    /* renamed from: e  reason: collision with root package name */
    private final float f22032e;

    /* renamed from: f  reason: collision with root package name */
    private final float f22033f;

    /* renamed from: g  reason: collision with root package name */
    private final float f22034g;

    /* renamed from: h  reason: collision with root package name */
    private final SavedState f22035h;

    /* renamed from: i  reason: collision with root package name */
    private float f22036i;

    /* renamed from: j  reason: collision with root package name */
    private float f22037j;

    /* renamed from: k  reason: collision with root package name */
    private int f22038k;

    /* renamed from: l  reason: collision with root package name */
    private float f22039l;

    /* renamed from: m  reason: collision with root package name */
    private float f22040m;

    /* renamed from: n  reason: collision with root package name */
    private float f22041n;

    /* renamed from: o  reason: collision with root package name */
    private WeakReference<View> f22042o;

    /* renamed from: p  reason: collision with root package name */
    private WeakReference<ViewGroup> f22043p;

    private BadgeDrawable(Context context) {
        this.f22028a = new WeakReference<>(context);
        com.google.android.material.internal.g.c(context);
        Resources resources = context.getResources();
        this.f22031d = new Rect();
        this.f22029b = new g();
        this.f22032e = resources.getDimensionPixelSize(d.f31173m);
        this.f22034g = resources.getDimensionPixelSize(d.f31172l);
        this.f22033f = resources.getDimensionPixelSize(d.f31175o);
        f fVar = new f(this);
        this.f22030c = fVar;
        fVar.e().setTextAlign(Paint.Align.CENTER);
        this.f22035h = new SavedState(context);
        s(k.f31254c);
    }

    private void b(Context context, Rect rect, View view) {
        int i10 = this.f22035h.f22051h;
        if (i10 != 8388691 && i10 != 8388693) {
            this.f22037j = rect.top;
        } else {
            this.f22037j = rect.bottom;
        }
        if (i() <= 9) {
            float f10 = !j() ? this.f22032e : this.f22033f;
            this.f22039l = f10;
            this.f22041n = f10;
            this.f22040m = f10;
        } else {
            float f11 = this.f22033f;
            this.f22039l = f11;
            this.f22041n = f11;
            this.f22040m = (this.f22030c.f(f()) / 2.0f) + this.f22034g;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(j() ? d.f31174n : d.f31171k);
        int i11 = this.f22035h.f22051h;
        if (i11 != 8388659 && i11 != 8388691) {
            this.f22036i = z.C(view) == 0 ? (rect.right + this.f22040m) - dimensionPixelSize : (rect.left - this.f22040m) + dimensionPixelSize;
        } else {
            this.f22036i = z.C(view) == 0 ? (rect.left - this.f22040m) + dimensionPixelSize : (rect.right + this.f22040m) - dimensionPixelSize;
        }
    }

    public static BadgeDrawable c(Context context) {
        return d(context, null, f22027r, f22026q);
    }

    private static BadgeDrawable d(Context context, AttributeSet attributeSet, int i10, int i11) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.k(context, attributeSet, i10, i11);
        return badgeDrawable;
    }

    private void e(Canvas canvas) {
        Rect rect = new Rect();
        String f10 = f();
        this.f22030c.e().getTextBounds(f10, 0, f10.length(), rect);
        canvas.drawText(f10, this.f22036i, this.f22037j + (rect.height() / 2), this.f22030c.e());
    }

    private String f() {
        if (i() <= this.f22038k) {
            return Integer.toString(i());
        }
        Context context = this.f22028a.get();
        return context == null ? "" : context.getString(j.f31243i, Integer.valueOf(this.f22038k), "+");
    }

    private void k(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray k10 = com.google.android.material.internal.g.k(context, attributeSet, l.f31327m, i10, i11, new int[0]);
        p(k10.getInt(l.f31347q, 4));
        int i12 = l.f31352r;
        if (k10.hasValue(i12)) {
            q(k10.getInt(i12, 0));
        }
        m(l(context, k10, l.f31332n));
        int i13 = l.f31342p;
        if (k10.hasValue(i13)) {
            o(l(context, k10, i13));
        }
        n(k10.getInt(l.f31337o, 8388661));
        k10.recycle();
    }

    private static int l(Context context, TypedArray typedArray, int i10) {
        return c.a(context, typedArray, i10).getDefaultColor();
    }

    private void r(ua.d dVar) {
        Context context;
        if (this.f22030c.d() == dVar || (context = this.f22028a.get()) == null) {
            return;
        }
        this.f22030c.h(dVar, context);
        u();
    }

    private void s(int i10) {
        Context context = this.f22028a.get();
        if (context == null) {
            return;
        }
        r(new ua.d(context, i10));
    }

    private void u() {
        Context context = this.f22028a.get();
        WeakReference<View> weakReference = this.f22042o;
        View view = weakReference != null ? weakReference.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        rect.set(this.f22031d);
        Rect rect2 = new Rect();
        view.getDrawingRect(rect2);
        WeakReference<ViewGroup> weakReference2 = this.f22043p;
        ViewGroup viewGroup = weakReference2 != null ? weakReference2.get() : null;
        if (viewGroup != null || a.f22052a) {
            if (viewGroup == null) {
                viewGroup = (ViewGroup) view.getParent();
            }
            viewGroup.offsetDescendantRectToMyCoords(view, rect2);
        }
        b(context, rect2, view);
        a.d(this.f22031d, this.f22036i, this.f22037j, this.f22040m, this.f22041n);
        this.f22029b.S(this.f22039l);
        if (rect.equals(this.f22031d)) {
            return;
        }
        this.f22029b.setBounds(this.f22031d);
    }

    private void v() {
        this.f22038k = ((int) Math.pow(10.0d, h() - 1.0d)) - 1;
    }

    @Override // com.google.android.material.internal.f.b
    public void a() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f22029b.draw(canvas);
        if (j()) {
            e(canvas);
        }
    }

    public CharSequence g() {
        Context context;
        if (isVisible()) {
            if (j()) {
                if (this.f22035h.f22050g <= 0 || (context = this.f22028a.get()) == null) {
                    return null;
                }
                return context.getResources().getQuantityString(this.f22035h.f22050g, i(), Integer.valueOf(i()));
            }
            return this.f22035h.f22049f;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f22035h.f22046c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f22031d.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f22031d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public int h() {
        return this.f22035h.f22048e;
    }

    public int i() {
        if (j()) {
            return this.f22035h.f22047d;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return false;
    }

    public boolean j() {
        return this.f22035h.f22047d != -1;
    }

    public void m(int i10) {
        this.f22035h.f22044a = i10;
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        if (this.f22029b.w() != valueOf) {
            this.f22029b.U(valueOf);
            invalidateSelf();
        }
    }

    public void n(int i10) {
        if (this.f22035h.f22051h != i10) {
            this.f22035h.f22051h = i10;
            WeakReference<View> weakReference = this.f22042o;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            View view = this.f22042o.get();
            WeakReference<ViewGroup> weakReference2 = this.f22043p;
            t(view, weakReference2 != null ? weakReference2.get() : null);
        }
    }

    public void o(int i10) {
        this.f22035h.f22045b = i10;
        if (this.f22030c.e().getColor() != i10) {
            this.f22030c.e().setColor(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.f.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p(int i10) {
        if (this.f22035h.f22048e != i10) {
            this.f22035h.f22048e = i10;
            v();
            this.f22030c.i(true);
            u();
            invalidateSelf();
        }
    }

    public void q(int i10) {
        int max = Math.max(0, i10);
        if (this.f22035h.f22047d != max) {
            this.f22035h.f22047d = max;
            this.f22030c.i(true);
            u();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f22035h.f22046c = i10;
        this.f22030c.e().setAlpha(i10);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void t(View view, ViewGroup viewGroup) {
        this.f22042o = new WeakReference<>(view);
        this.f22043p = new WeakReference<>(viewGroup);
        u();
        invalidateSelf();
    }

    /* loaded from: classes2.dex */
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private int f22044a;

        /* renamed from: b  reason: collision with root package name */
        private int f22045b;

        /* renamed from: c  reason: collision with root package name */
        private int f22046c;

        /* renamed from: d  reason: collision with root package name */
        private int f22047d;

        /* renamed from: e  reason: collision with root package name */
        private int f22048e;

        /* renamed from: f  reason: collision with root package name */
        private CharSequence f22049f;

        /* renamed from: g  reason: collision with root package name */
        private int f22050g;

        /* renamed from: h  reason: collision with root package name */
        private int f22051h;

        /* loaded from: classes2.dex */
        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Context context) {
            this.f22046c = 255;
            this.f22047d = -1;
            this.f22045b = new ua.d(context, k.f31254c).f37683b.getDefaultColor();
            this.f22049f = context.getString(j.f31241g);
            this.f22050g = i.f31234a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f22044a);
            parcel.writeInt(this.f22045b);
            parcel.writeInt(this.f22046c);
            parcel.writeInt(this.f22047d);
            parcel.writeInt(this.f22048e);
            parcel.writeString(this.f22049f.toString());
            parcel.writeInt(this.f22050g);
            parcel.writeInt(this.f22051h);
        }

        protected SavedState(Parcel parcel) {
            this.f22046c = 255;
            this.f22047d = -1;
            this.f22044a = parcel.readInt();
            this.f22045b = parcel.readInt();
            this.f22046c = parcel.readInt();
            this.f22047d = parcel.readInt();
            this.f22048e = parcel.readInt();
            this.f22049f = parcel.readString();
            this.f22050g = parcel.readInt();
            this.f22051h = parcel.readInt();
        }
    }
}
