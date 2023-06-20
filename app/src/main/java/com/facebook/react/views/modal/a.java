package com.facebook.react.views.modal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.unity3d.services.core.request.metrics.MetricCommonTags;

/* compiled from: ModalHostHelper.java */
/* loaded from: classes.dex */
class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Point f16128a = new Point();

    /* renamed from: b  reason: collision with root package name */
    private static final Point f16129b = new Point();

    /* renamed from: c  reason: collision with root package name */
    private static final Point f16130c = new Point();

    public static Point a(Context context) {
        Display defaultDisplay = ((WindowManager) f6.a.c((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
        Point point = f16128a;
        Point point2 = f16129b;
        defaultDisplay.getCurrentSizeRange(point, point2);
        Point point3 = f16130c;
        defaultDisplay.getSize(point3);
        int i10 = 0;
        boolean z10 = context.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
        if (z10 && identifier > 0) {
            i10 = (int) resources.getDimension(identifier);
        }
        if (point3.x < point3.y) {
            return new Point(point.x, point2.y + i10);
        }
        return new Point(point2.x, point.y + i10);
    }
}
