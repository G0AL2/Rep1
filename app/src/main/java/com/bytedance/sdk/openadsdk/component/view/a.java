package com.bytedance.sdk.openadsdk.component.view;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.widget.TTRoundRectImageView;
import com.bytedance.sdk.openadsdk.utils.v;

/* compiled from: TTAppOpenAdUserInfo.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f11806a;

    /* renamed from: b  reason: collision with root package name */
    private static Drawable f11807b;

    /* renamed from: c  reason: collision with root package name */
    private LinearLayout f11808c;

    /* renamed from: d  reason: collision with root package name */
    private TTRoundRectImageView f11809d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f11810e;

    public static Drawable c() {
        return f11807b;
    }

    public void a(Activity activity) {
        this.f11808c = (LinearLayout) activity.findViewById(t.e(activity, "tt_user_info"));
        this.f11809d = (TTRoundRectImageView) activity.findViewById(t.e(activity, "tt_app_icon"));
        this.f11810e = (TextView) activity.findViewById(t.e(activity, "tt_app_name"));
        this.f11808c.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.view.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
    }

    public void b() {
        if (f11806a) {
            return;
        }
        try {
            int h10 = h.d().h();
            if (h10 != 0) {
                f11807b = m.a().getResources().getDrawable(h10);
            }
        } catch (Throwable unused) {
        }
        f11806a = true;
    }

    public void a() {
        String g10 = h.d().g();
        if (TextUtils.isEmpty(g10)) {
            this.f11810e.setVisibility(8);
        } else {
            this.f11810e.setText(g10);
        }
        b();
        try {
            Drawable drawable = f11807b;
            if (drawable == null) {
                this.f11809d.setVisibility(8);
            } else {
                this.f11809d.setImageDrawable(drawable);
                if (this.f11810e.getVisibility() == 8) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f11809d.getLayoutParams();
                    marginLayoutParams.setMargins(0, 0, 0, 0);
                    this.f11809d.setLayoutParams(marginLayoutParams);
                }
            }
        } catch (Throwable unused) {
            this.f11809d.setVisibility(8);
        }
    }

    public void a(n nVar, float f10, float f11) {
        int b10;
        int c10;
        int d10 = nVar.d();
        if (d10 == 1 || d10 == 3) {
            if (n.c(nVar)) {
                b10 = nVar.J().i();
                c10 = nVar.J().f();
            } else {
                b10 = nVar.P().get(0).b();
                c10 = nVar.P().get(0).c();
            }
            if (b10 <= 0 || c10 <= 0) {
                return;
            }
            float f12 = c10;
            float min = f11 - (f12 * Math.min(f10 / b10, f11 / f12));
            try {
                float e10 = v.e(m.a(), 60.0f);
                if (min < e10) {
                    min = e10;
                }
                this.f11808c.setLayoutParams(new LinearLayout.LayoutParams(-1, (int) min));
            } catch (Throwable unused) {
            }
        }
    }
}
