package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import n.a;

@Deprecated
/* loaded from: classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int f1765a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1766b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1765a = getResources().getDimensionPixelOffset(a.f34595b);
        this.f1766b = getResources().getDimensionPixelOffset(a.f34594a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1765a * 2), this.f1766b), 1073741824), i11);
    }
}
