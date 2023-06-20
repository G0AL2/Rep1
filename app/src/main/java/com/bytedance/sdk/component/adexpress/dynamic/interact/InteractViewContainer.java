package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;
import com.bytedance.sdk.component.adexpress.widget.RippleView;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;

/* loaded from: classes.dex */
public class InteractViewContainer extends FrameLayout implements c {

    /* renamed from: a  reason: collision with root package name */
    private Context f9749a;

    /* renamed from: b  reason: collision with root package name */
    private DynamicBaseWidget f9750b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.b.g f9751c;

    /* renamed from: d  reason: collision with root package name */
    private View f9752d;

    /* renamed from: e  reason: collision with root package name */
    private b f9753e;

    /* renamed from: f  reason: collision with root package name */
    private String f9754f;

    /* renamed from: g  reason: collision with root package name */
    private RippleView f9755g;

    /* renamed from: h  reason: collision with root package name */
    private View.OnTouchListener f9756h;

    /* renamed from: i  reason: collision with root package name */
    private int f9757i;

    /* renamed from: j  reason: collision with root package name */
    private int f9758j;

    /* renamed from: k  reason: collision with root package name */
    private int f9759k;

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.b.g gVar) {
        super(context);
        this.f9749a = context;
        this.f9750b = dynamicBaseWidget;
        this.f9751c = gVar;
        e();
    }

    private void e() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.f9754f = this.f9751c.D();
        this.f9757i = this.f9751c.E();
        b a10 = d.a(this.f9749a, this.f9750b, this.f9751c, this.f9758j, this.f9759k);
        this.f9753e = a10;
        if (a10 != null) {
            this.f9752d = a10.d();
            if (TextUtils.equals(this.f9754f, "6")) {
                RippleView rippleView = new RippleView(this.f9749a);
                this.f9755g = rippleView;
                addView(rippleView, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer.1
                    @Override // java.lang.Runnable
                    public void run() {
                        InteractViewContainer.this.f9755g.b();
                    }
                });
            }
            addView(this.f9753e.d());
            f();
            setVisibility(0);
        }
    }

    private void f() {
        if (this.f9752d == null) {
            return;
        }
        String str = this.f9754f;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 50:
                if (str.equals("2")) {
                    c10 = 0;
                    break;
                }
                break;
            case 53:
                if (str.equals("5")) {
                    c10 = 1;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c10 = 2;
                    break;
                }
                break;
            case 55:
                if (str.equals("7")) {
                    c10 = 3;
                    break;
                }
                break;
            case 56:
                if (str.equals("8")) {
                    c10 = 4;
                    break;
                }
                break;
            case 57:
                if (str.equals("9")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c10 = 7;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1571:
                if (str.equals("14")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1573:
                if (str.equals("16")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1574:
                if (str.equals("17")) {
                    c10 = 11;
                    break;
                }
                break;
            case 1575:
                if (str.equals("18")) {
                    c10 = '\f';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case 3:
                setBackgroundColor(Color.parseColor("#80000000"));
                this.f9756h = new com.bytedance.sdk.component.adexpress.dynamic.interact.a.a(this, this);
                break;
            case 1:
                setBackgroundColor(Color.parseColor("#80000000"));
                this.f9756h = new com.bytedance.sdk.component.adexpress.dynamic.interact.a.b(this);
                break;
            case 2:
                setBackgroundColor(Color.parseColor("#80000000"));
                this.f9756h = new com.bytedance.sdk.component.adexpress.dynamic.interact.a.d(this);
                break;
            case 4:
            case 6:
                this.f9750b.setClipChildren(false);
                this.f9750b.setClipChildren(false);
                ViewGroup viewGroup = (ViewGroup) this.f9750b.getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                }
                this.f9756h = new com.bytedance.sdk.component.adexpress.dynamic.interact.a.d(this);
                break;
            case 5:
            case 11:
                this.f9752d.setTag(2);
                break;
            case 7:
                this.f9756h = new com.bytedance.sdk.component.adexpress.dynamic.interact.a.b(this);
                break;
            case '\b':
                this.f9756h = new com.bytedance.sdk.component.adexpress.dynamic.interact.a.c(this, this.f9757i);
                break;
            case '\t':
                this.f9756h = new com.bytedance.sdk.component.adexpress.dynamic.interact.a.a(this, this);
                break;
            case '\n':
                View view = this.f9752d;
                if (view != null && (view instanceof ShakeAnimationView) && ((ShakeAnimationView) view).getShakeLayout() != null) {
                    ((ShakeAnimationView) this.f9752d).getShakeLayout().setTag(2);
                }
                this.f9752d.setTag(2);
                break;
            case '\f':
                View view2 = this.f9752d;
                if (view2 != null && (view2 instanceof WriggleGuideAnimationView) && ((WriggleGuideAnimationView) view2).getWriggleLayout() != null) {
                    ((WriggleGuideAnimationView) this.f9752d).getWriggleLayout().setTag(2);
                }
                this.f9752d.setTag(2);
                break;
        }
        View.OnTouchListener onTouchListener = this.f9756h;
        if (onTouchListener != null) {
            setOnTouchListener(onTouchListener);
        }
        if (g()) {
            setOnClickListener((View.OnClickListener) this.f9750b.getDynamicClickListener());
        }
    }

    private boolean g() {
        return (this.f9751c.J() || TextUtils.equals("9", this.f9754f) || TextUtils.equals("16", this.f9754f) || TextUtils.equals("17", this.f9754f) || TextUtils.equals("18", this.f9754f)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (this.f9756h != null) {
            setOnClickListener((View.OnClickListener) this.f9750b.getDynamicClickListener());
            performClick();
        }
    }

    public void c() {
        if (this.f9752d != null && TextUtils.equals(this.f9754f, "2")) {
            View view = this.f9752d;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).c();
            }
        }
    }

    public void d() {
        if (this.f9752d != null && TextUtils.equals(this.f9754f, "2")) {
            View view = this.f9752d;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).d();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f9753e;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.interact.c
    public void a() {
        if (TextUtils.equals(this.f9754f, "6")) {
            RippleView rippleView = this.f9755g;
            if (rippleView != null) {
                rippleView.c();
                postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer.2
                    @Override // java.lang.Runnable
                    public void run() {
                        InteractViewContainer.this.h();
                    }
                }, 300L);
                return;
            }
            return;
        }
        h();
    }

    public void b() {
        b bVar = this.f9753e;
        if (bVar != null) {
            bVar.a();
        }
    }

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, com.bytedance.sdk.component.adexpress.dynamic.b.g gVar, int i10, int i11) {
        super(context);
        this.f9749a = context;
        this.f9750b = dynamicBaseWidget;
        this.f9751c = gVar;
        this.f9758j = i10;
        this.f9759k = i11;
        e();
    }
}
