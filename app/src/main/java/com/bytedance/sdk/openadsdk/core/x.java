package com.bytedance.sdk.openadsdk.core;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.bannerexpress.BannerExpressView;
import com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView;

/* compiled from: VisibilityChecker.java */
/* loaded from: classes.dex */
public class x {
    private static boolean a(View view, int i10) {
        float a10 = a(view);
        return a10 > 0.0f && a10 >= ((float) i10) / 100.0f;
    }

    private static boolean b(View view) {
        return view != null && view.isShown();
    }

    private static int c(View view, int i10) {
        if (i10 == 3) {
            return (int) (com.bytedance.sdk.openadsdk.utils.v.c(view.getContext().getApplicationContext()) * 0.7d);
        }
        return 20;
    }

    private static int d(View view, int i10) {
        if (i10 == 3) {
            return com.bytedance.sdk.openadsdk.utils.v.d(view.getContext().getApplicationContext()) / 2;
        }
        return 20;
    }

    public static float a(View view) {
        if (view != null) {
            try {
                if (view.getVisibility() == 0 && view.getParent() != null) {
                    Rect rect = new Rect();
                    if (view.getGlobalVisibleRect(rect)) {
                        long height = rect.height() * rect.width();
                        long height2 = view.getHeight() * view.getWidth();
                        if (height2 <= 0) {
                            return -1.0f;
                        }
                        return ((float) height) / ((float) height2);
                    }
                    return -1.0f;
                }
            } catch (Throwable unused) {
            }
        }
        return -1.0f;
    }

    private static boolean b(View view, int i10) {
        return view.getWidth() >= c(view, i10) && view.getHeight() >= d(view, i10);
    }

    private static int b(View view, int i10, int i11) throws Throwable {
        if (com.bytedance.sdk.openadsdk.utils.e.a()) {
            if (b(view)) {
                if (b(view, i11)) {
                    return !a(view, i10) ? 3 : 0;
                }
                return 6;
            }
            return 1;
        }
        return 4;
    }

    public static boolean a(View view, int i10, int i11) {
        if (i11 == 1) {
            while (view != null) {
                try {
                    if (view.getVisibility() == 0) {
                        if ((view instanceof NativeExpressView) || (view instanceof BannerExpressView)) {
                            break;
                        }
                        view = (View) view.getParent();
                    } else {
                        return false;
                    }
                } catch (Throwable unused) {
                    return false;
                }
            }
        }
        return b(view, i10, i11) == 0;
    }
}
