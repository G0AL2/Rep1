package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import y.h;

/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1762a;

    /* renamed from: b  reason: collision with root package name */
    private final TypedArray f1763b;

    /* renamed from: c  reason: collision with root package name */
    private TypedValue f1764c;

    private z0(Context context, TypedArray typedArray) {
        this.f1762a = context;
        this.f1763b = typedArray;
    }

    public static z0 t(Context context, int i10, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static z0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static z0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1763b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1763b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList a10;
        return (!this.f1763b.hasValue(i10) || (resourceId = this.f1763b.getResourceId(i10, 0)) == 0 || (a10 = e.a.a(this.f1762a, resourceId)) == null) ? this.f1763b.getColorStateList(i10) : a10;
    }

    public float d(int i10, float f10) {
        return this.f1763b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f1763b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f1763b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        if (this.f1763b.hasValue(i10) && (resourceId = this.f1763b.getResourceId(i10, 0)) != 0) {
            return e.a.b(this.f1762a, resourceId);
        }
        return this.f1763b.getDrawable(i10);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f1763b.hasValue(i10) || (resourceId = this.f1763b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return k.b().d(this.f1762a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f1763b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, h.d dVar) {
        int resourceId = this.f1763b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1764c == null) {
            this.f1764c = new TypedValue();
        }
        return y.h.h(this.f1762a, resourceId, this.f1764c, i11, dVar);
    }

    public int k(int i10, int i11) {
        return this.f1763b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1763b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1763b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f1763b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f1763b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f1763b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f1763b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f1763b;
    }

    public boolean s(int i10) {
        return this.f1763b.hasValue(i10);
    }

    public void w() {
        this.f1763b.recycle();
    }
}
