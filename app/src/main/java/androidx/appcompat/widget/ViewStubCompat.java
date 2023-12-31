package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: a  reason: collision with root package name */
    private int f1363a;

    /* renamed from: b  reason: collision with root package name */
    private int f1364b;

    /* renamed from: c  reason: collision with root package name */
    private WeakReference<View> f1365c;

    /* renamed from: d  reason: collision with root package name */
    private LayoutInflater f1366d;

    /* renamed from: e  reason: collision with root package name */
    private a f1367e;

    /* loaded from: classes.dex */
    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f1363a != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.f1366d;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.f1363a, viewGroup, false);
                int i10 = this.f1364b;
                if (i10 != -1) {
                    inflate.setId(i10);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.f1365c = new WeakReference<>(inflate);
                a aVar = this.f1367e;
                if (aVar != null) {
                    aVar.a(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1364b;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1366d;
    }

    public int getLayoutResource() {
        return this.f1363a;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f1364b = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1366d = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f1363a = i10;
    }

    public void setOnInflateListener(a aVar) {
        this.f1367e = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f1365c;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i10);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i10);
        if (i10 == 0 || i10 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1363a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.K3, i10, 0);
        this.f1364b = obtainStyledAttributes.getResourceId(d.j.N3, -1);
        this.f1363a = obtainStyledAttributes.getResourceId(d.j.M3, 0);
        setId(obtainStyledAttributes.getResourceId(d.j.L3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
