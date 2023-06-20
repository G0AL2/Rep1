package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: ConstraintHelper.java */
/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: a  reason: collision with root package name */
    protected int[] f2083a;

    /* renamed from: b  reason: collision with root package name */
    protected int f2084b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f2085c;

    /* renamed from: d  reason: collision with root package name */
    protected s.h f2086d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f2087e;

    /* renamed from: f  reason: collision with root package name */
    protected String f2088f;

    /* renamed from: g  reason: collision with root package name */
    protected String f2089g;

    /* renamed from: h  reason: collision with root package name */
    private View[] f2090h;

    /* renamed from: i  reason: collision with root package name */
    protected HashMap<Integer, String> f2091i;

    public c(Context context) {
        super(context);
        this.f2083a = new int[32];
        this.f2087e = false;
        this.f2090h = null;
        this.f2091i = new HashMap<>();
        this.f2085c = context;
        m(null);
    }

    private void d(String str) {
        if (str == null || str.length() == 0 || this.f2085c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int k10 = k(trim);
        if (k10 != 0) {
            this.f2091i.put(Integer.valueOf(k10), trim);
            e(k10);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void e(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f2084b + 1;
        int[] iArr = this.f2083a;
        if (i11 > iArr.length) {
            this.f2083a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2083a;
        int i12 = this.f2084b;
        iArr2[i12] = i10;
        this.f2084b = i12 + 1;
    }

    private void f(String str) {
        if (str == null || str.length() == 0 || this.f2085c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    e(childAt.getId());
                }
            }
        }
    }

    private int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2085c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f10 = constraintLayout.f(0, str);
            if (f10 instanceof Integer) {
                i10 = ((Integer) f10).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = j(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = j.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.f2085c.getResources().getIdentifier(str, "id", this.f2085c.getPackageName()) : i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void g() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        h((ConstraintLayout) parent);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2083a, this.f2084b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i10 = 0; i10 < this.f2084b; i10++) {
            View h10 = constraintLayout.h(this.f2083a[i10]);
            if (h10 != null) {
                h10.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    h10.setTranslationZ(h10.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View[] l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f2090h;
        if (viewArr == null || viewArr.length != this.f2084b) {
            this.f2090h = new View[this.f2084b];
        }
        for (int i10 = 0; i10 < this.f2084b; i10++) {
            this.f2090h[i10] = constraintLayout.h(this.f2083a[i10]);
        }
        return this.f2090h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, k.U0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == k.f2274g1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f2088f = string;
                    setIds(string);
                } else if (index == k.f2282h1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f2089g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void n(s.e eVar, boolean z10) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f2088f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2089g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f2087e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void r(ConstraintLayout constraintLayout) {
        String str;
        int j10;
        if (isInEditMode()) {
            setIds(this.f2088f);
        }
        s.h hVar = this.f2086d;
        if (hVar == null) {
            return;
        }
        hVar.c();
        for (int i10 = 0; i10 < this.f2084b; i10++) {
            int i11 = this.f2083a[i10];
            View h10 = constraintLayout.h(i11);
            if (h10 == null && (j10 = j(constraintLayout, (str = this.f2091i.get(Integer.valueOf(i11))))) != 0) {
                this.f2083a[i10] = j10;
                this.f2091i.put(Integer.valueOf(j10), str);
                h10 = constraintLayout.h(j10);
            }
            if (h10 != null) {
                this.f2086d.a(constraintLayout.l(h10));
            }
        }
        this.f2086d.b(constraintLayout.f1991c);
    }

    public void s() {
        if (this.f2086d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f2044r0 = (s.e) this.f2086d;
        }
    }

    protected void setIds(String str) {
        this.f2088f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2084b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                d(str.substring(i10));
                return;
            } else {
                d(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f2089g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2084b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                f(str.substring(i10));
                return;
            } else {
                f(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2088f = null;
        this.f2084b = 0;
        for (int i10 : iArr) {
            e(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f2088f == null) {
            e(i10);
        }
    }
}
