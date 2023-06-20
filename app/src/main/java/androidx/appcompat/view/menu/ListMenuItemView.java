package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.z0;
import androidx.core.view.z;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    private g f991a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f992b;

    /* renamed from: c  reason: collision with root package name */
    private RadioButton f993c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f994d;

    /* renamed from: e  reason: collision with root package name */
    private CheckBox f995e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f996f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f997g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f998h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f999i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f1000j;

    /* renamed from: k  reason: collision with root package name */
    private int f1001k;

    /* renamed from: l  reason: collision with root package name */
    private Context f1002l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1003m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f1004n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1005o;

    /* renamed from: p  reason: collision with root package name */
    private LayoutInflater f1006p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1007q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.D);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.f999i;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(d.g.f28764h, (ViewGroup) this, false);
        this.f995e = checkBox;
        a(checkBox);
    }

    private void e() {
        ImageView imageView = (ImageView) getInflater().inflate(d.g.f28765i, (ViewGroup) this, false);
        this.f992b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(d.g.f28767k, (ViewGroup) this, false);
        this.f993c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f1006p == null) {
            this.f1006p = LayoutInflater.from(getContext());
        }
        return this.f1006p;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.f997g;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f998h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f998h.getLayoutParams();
        rect.top += this.f998h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i10) {
        this.f991a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean f() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f991a;
    }

    public void h(boolean z10, char c10) {
        int i10 = (z10 && this.f991a.A()) ? 0 : 8;
        if (i10 == 0) {
            this.f996f.setText(this.f991a.h());
        }
        if (this.f996f.getVisibility() != i10) {
            this.f996f.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        z.u0(this, this.f1000j);
        TextView textView = (TextView) findViewById(d.f.M);
        this.f994d = textView;
        int i10 = this.f1001k;
        if (i10 != -1) {
            textView.setTextAppearance(this.f1002l, i10);
        }
        this.f996f = (TextView) findViewById(d.f.F);
        ImageView imageView = (ImageView) findViewById(d.f.I);
        this.f997g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1004n);
        }
        this.f998h = (ImageView) findViewById(d.f.f28748r);
        this.f999i = (LinearLayout) findViewById(d.f.f28742l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f992b != null && this.f1003m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f992b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z10 && this.f993c == null && this.f995e == null) {
            return;
        }
        if (this.f991a.m()) {
            if (this.f993c == null) {
                g();
            }
            compoundButton = this.f993c;
            compoundButton2 = this.f995e;
        } else {
            if (this.f995e == null) {
                d();
            }
            compoundButton = this.f995e;
            compoundButton2 = this.f993c;
        }
        if (z10) {
            compoundButton.setChecked(this.f991a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f995e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f993c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f991a.m()) {
            if (this.f993c == null) {
                g();
            }
            compoundButton = this.f993c;
        } else {
            if (this.f995e == null) {
                d();
            }
            compoundButton = this.f995e;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f1007q = z10;
        this.f1003m = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f998h;
        if (imageView != null) {
            imageView.setVisibility((this.f1005o || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f991a.z() || this.f1007q;
        if (z10 || this.f1003m) {
            ImageView imageView = this.f992b;
            if (imageView == null && drawable == null && !this.f1003m) {
                return;
            }
            if (imageView == null) {
                e();
            }
            if (drawable == null && !this.f1003m) {
                this.f992b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f992b;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f992b.getVisibility() != 0) {
                this.f992b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f994d.setText(charSequence);
            if (this.f994d.getVisibility() != 0) {
                this.f994d.setVisibility(0);
            }
        } else if (this.f994d.getVisibility() != 8) {
            this.f994d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        z0 v10 = z0.v(getContext(), attributeSet, d.j.O1, i10, 0);
        this.f1000j = v10.g(d.j.Q1);
        this.f1001k = v10.n(d.j.P1, -1);
        this.f1003m = v10.a(d.j.R1, false);
        this.f1002l = context;
        this.f1004n = v10.g(d.j.S1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, d.a.A, 0);
        this.f1005o = obtainStyledAttributes.hasValue(0);
        v10.w();
        obtainStyledAttributes.recycle();
    }
}
