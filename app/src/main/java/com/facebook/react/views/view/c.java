package com.facebook.react.views.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.yoga.n;

/* compiled from: MeasureUtil.java */
/* loaded from: classes.dex */
public class c {
    public static int a(float f10, n nVar) {
        if (nVar == n.EXACTLY) {
            return View.MeasureSpec.makeMeasureSpec((int) f10, 1073741824);
        }
        if (nVar == n.AT_MOST) {
            return View.MeasureSpec.makeMeasureSpec((int) f10, RecyclerView.UNDEFINED_DURATION);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
