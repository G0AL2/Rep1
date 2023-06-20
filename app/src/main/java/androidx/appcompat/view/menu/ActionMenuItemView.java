package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.j0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: g  reason: collision with root package name */
    g f976g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f977h;

    /* renamed from: i  reason: collision with root package name */
    private Drawable f978i;

    /* renamed from: j  reason: collision with root package name */
    e.b f979j;

    /* renamed from: k  reason: collision with root package name */
    private j0 f980k;

    /* renamed from: l  reason: collision with root package name */
    b f981l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f982m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f983n;

    /* renamed from: o  reason: collision with root package name */
    private int f984o;

    /* renamed from: p  reason: collision with root package name */
    private int f985p;

    /* renamed from: q  reason: collision with root package name */
    private int f986q;

    /* loaded from: classes.dex */
    private class a extends j0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.j0
        public j.e b() {
            b bVar = ActionMenuItemView.this.f981l;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.j0
        protected boolean c() {
            j.e b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f979j;
            return bVar != null && bVar.d(actionMenuItemView.f976g) && (b10 = b()) != null && b10.a();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract j.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void j() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f977h);
        if (this.f978i != null && (!this.f976g.B() || (!this.f982m && !this.f983n))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f977h : null);
        CharSequence contentDescription = this.f976g.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f976g.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f976g.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            c1.a(this, z12 ? null : this.f976g.getTitle());
        } else {
            c1.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return h();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return h() && this.f976g.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i10) {
        this.f976g = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f980k == null) {
            this.f980k = new a();
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean f() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f976g;
    }

    public boolean h() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f979j;
        if (bVar != null) {
            bVar.d(this.f976g);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f982m = i();
        j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        boolean h10 = h();
        if (h10 && (i13 = this.f985p) >= 0) {
            super.setPadding(i13, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(size, this.f984o);
        } else {
            i12 = this.f984o;
        }
        if (mode != 1073741824 && this.f984o > 0 && measuredWidth < i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
        if (h10 || this.f978i == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f978i.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        j0 j0Var;
        if (this.f976g.hasSubMenu() && (j0Var = this.f980k) != null && j0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f983n != z10) {
            this.f983n = z10;
            g gVar = this.f976g;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f978i = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f986q;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        j();
    }

    public void setItemInvoker(e.b bVar) {
        this.f979j = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f985p = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f981l = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f977h = charSequence;
        j();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f982m = i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.f28900v, i10, 0);
        this.f984o = obtainStyledAttributes.getDimensionPixelSize(d.j.f28905w, 0);
        obtainStyledAttributes.recycle();
        this.f986q = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f985p = -1;
        setSaveEnabled(false);
    }
}
