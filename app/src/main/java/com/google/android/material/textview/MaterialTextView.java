package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ha.l;
import ua.b;
import ua.c;

/* loaded from: classes3.dex */
public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private void h(Resources.Theme theme, int i10) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i10, l.F1);
        int k10 = k(getContext(), obtainStyledAttributes, l.G1, l.H1);
        obtainStyledAttributes.recycle();
        if (k10 >= 0) {
            setLineHeight(k10);
        }
    }

    private static boolean i(Context context) {
        return b.b(context, ha.b.A, true);
    }

    private static int j(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.I1, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(l.J1, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int k(Context context, TypedArray typedArray, int... iArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < iArr.length && i10 < 0; i11++) {
            i10 = c.c(context, typedArray, iArr[i11], -1);
        }
        return i10;
    }

    private static boolean l(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.I1, i10, i11);
        int k10 = k(context, obtainStyledAttributes, l.K1, l.L1);
        obtainStyledAttributes.recycle();
        return k10 != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (i(context)) {
            h(context.getTheme(), i10);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        int j10;
        if (i(context)) {
            Resources.Theme theme = context.getTheme();
            if (l(context, theme, attributeSet, i10, i11) || (j10 = j(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            h(theme, j10);
        }
    }
}
