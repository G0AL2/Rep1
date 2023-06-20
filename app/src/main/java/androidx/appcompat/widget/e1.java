package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.unity3d.services.core.request.metrics.MetricCommonTags;

/* compiled from: TooltipPopup.java */
/* loaded from: classes.dex */
class e1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f1491a;

    /* renamed from: b  reason: collision with root package name */
    private final View f1492b;

    /* renamed from: c  reason: collision with root package name */
    private final TextView f1493c;

    /* renamed from: d  reason: collision with root package name */
    private final WindowManager.LayoutParams f1494d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f1495e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f1496f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f1497g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1494d = layoutParams;
        this.f1495e = new Rect();
        this.f1496f = new int[2];
        this.f1497g = new int[2];
        this.f1491a = context;
        View inflate = LayoutInflater.from(context).inflate(d.g.f28775s, (ViewGroup) null);
        this.f1492b = inflate;
        this.f1493c = (TextView) inflate.findViewById(d.f.f28749s);
        layoutParams.setTitle(e1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = d.i.f28791a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i10, int i11, boolean z10, WindowManager.LayoutParams layoutParams) {
        int height;
        int i12;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1491a.getResources().getDimensionPixelOffset(d.d.f28702m);
        if (view.getWidth() < dimensionPixelOffset) {
            i10 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1491a.getResources().getDimensionPixelOffset(d.d.f28701l);
            height = i11 + dimensionPixelOffset2;
            i12 = i11 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i12 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1491a.getResources().getDimensionPixelOffset(z10 ? d.d.f28704o : d.d.f28703n);
        View b10 = b(view);
        if (b10 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        b10.getWindowVisibleDisplayFrame(this.f1495e);
        Rect rect = this.f1495e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1491a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1495e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        b10.getLocationOnScreen(this.f1497g);
        view.getLocationOnScreen(this.f1496f);
        int[] iArr = this.f1496f;
        int i13 = iArr[0];
        int[] iArr2 = this.f1497g;
        iArr[0] = i13 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i10) - (b10.getWidth() / 2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1492b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1492b.getMeasuredHeight();
        int[] iArr3 = this.f1496f;
        int i14 = ((iArr3[1] + i12) - dimensionPixelOffset3) - measuredHeight;
        int i15 = iArr3[1] + height + dimensionPixelOffset3;
        if (z10) {
            if (i14 >= 0) {
                layoutParams.y = i14;
            } else {
                layoutParams.y = i15;
            }
        } else if (measuredHeight + i15 <= this.f1495e.height()) {
            layoutParams.y = i15;
        } else {
            layoutParams.y = i14;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        if (d()) {
            ((WindowManager) this.f1491a.getSystemService("window")).removeView(this.f1492b);
        }
    }

    boolean d() {
        return this.f1492b.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(View view, int i10, int i11, boolean z10, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1493c.setText(charSequence);
        a(view, i10, i11, z10, this.f1494d);
        ((WindowManager) this.f1491a.getSystemService("window")).addView(this.f1492b, this.f1494d);
    }
}
