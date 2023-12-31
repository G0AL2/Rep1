package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private boolean f1262a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f1263b;

    /* renamed from: c  reason: collision with root package name */
    private int f1264c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1264c = -1;
        int[] iArr = d.j.K0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        androidx.core.view.z.o0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1262a = obtainStyledAttributes.getBoolean(d.j.L0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f1262a);
        }
    }

    private int a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    private boolean b() {
        return this.f1263b;
    }

    private void setStacked(boolean z10) {
        if (this.f1263b != z10) {
            if (!z10 || this.f1262a) {
                this.f1263b = z10;
                setOrientation(z10 ? 1 : 0);
                setGravity(z10 ? 8388613 : 80);
                View findViewById = findViewById(d.f.G);
                if (findViewById != null) {
                    findViewById.setVisibility(z10 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        if (this.f1262a) {
            if (size > this.f1264c && b()) {
                setStacked(false);
            }
            this.f1264c = size;
        }
        if (b() || View.MeasureSpec.getMode(i10) != 1073741824) {
            i12 = i10;
            z10 = false;
        } else {
            i12 = View.MeasureSpec.makeMeasureSpec(size, RecyclerView.UNDEFINED_DURATION);
            z10 = true;
        }
        super.onMeasure(i12, i11);
        if (this.f1262a && !b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int a10 = a(0);
        if (a10 >= 0) {
            View childAt = getChildAt(a10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int a11 = a(a10 + 1);
                if (a11 >= 0) {
                    paddingTop += getChildAt(a11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i13 = paddingTop;
            } else {
                i13 = paddingTop + getPaddingBottom();
            }
        }
        if (androidx.core.view.z.D(this) != i13) {
            setMinimumHeight(i13);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f1262a != z10) {
            this.f1262a = z10;
            if (!z10 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
