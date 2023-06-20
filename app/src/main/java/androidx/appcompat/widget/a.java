package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AbsActionBarView.java */
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    protected final C0036a f1368a;

    /* renamed from: b  reason: collision with root package name */
    protected final Context f1369b;

    /* renamed from: c  reason: collision with root package name */
    protected ActionMenuView f1370c;

    /* renamed from: d  reason: collision with root package name */
    protected c f1371d;

    /* renamed from: e  reason: collision with root package name */
    protected int f1372e;

    /* renamed from: f  reason: collision with root package name */
    protected androidx.core.view.e0 f1373f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1374g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1375h;

    /* compiled from: AbsActionBarView.java */
    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected class C0036a implements androidx.core.view.f0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1376a = false;

        /* renamed from: b  reason: collision with root package name */
        int f1377b;

        protected C0036a() {
        }

        @Override // androidx.core.view.f0
        public void a(View view) {
            this.f1376a = true;
        }

        @Override // androidx.core.view.f0
        public void b(View view) {
            if (this.f1376a) {
                return;
            }
            a aVar = a.this;
            aVar.f1373f = null;
            a.super.setVisibility(this.f1377b);
        }

        @Override // androidx.core.view.f0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1376a = false;
        }

        public C0036a d(androidx.core.view.e0 e0Var, int i10) {
            a.this.f1373f = e0Var;
            this.f1377b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, RecyclerView.UNDEFINED_DURATION), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.e0 f(int i10, long j10) {
        androidx.core.view.e0 e0Var = this.f1373f;
        if (e0Var != null) {
            e0Var.b();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            androidx.core.view.e0 a10 = androidx.core.view.z.d(this).a(1.0f);
            a10.d(j10);
            a10.f(this.f1368a.d(a10, i10));
            return a10;
        }
        androidx.core.view.e0 a11 = androidx.core.view.z.d(this).a(0.0f);
        a11.d(j10);
        a11.f(this.f1368a.d(a11, i10));
        return a11;
    }

    public int getAnimatedVisibility() {
        if (this.f1373f != null) {
            return this.f1368a.f1377b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1372e;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, d.j.f28795a, d.a.f28657c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(d.j.f28840j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1371d;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1375h = false;
        }
        if (!this.f1375h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1375h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1375h = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1374g = false;
        }
        if (!this.f1374g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1374g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1374g = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i10);

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.e0 e0Var = this.f1373f;
            if (e0Var != null) {
                e0Var.b();
            }
            super.setVisibility(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1368a = new C0036a();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(d.a.f28655a, typedValue, true) && typedValue.resourceId != 0) {
            this.f1369b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f1369b = context;
        }
    }
}
