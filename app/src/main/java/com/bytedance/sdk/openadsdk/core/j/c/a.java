package com.bytedance.sdk.openadsdk.core.j.c;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ResourceHelper.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<String> f12450a = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.j.c.a.1
        {
            add("image/jpeg");
            add("image/png");
            add("image/bmp");
            add("image/gif");
            add("image/jpg");
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public static Set<String> f12451b = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.j.c.a.2
        {
            add("application/x-javascript");
        }
    };

    /* compiled from: ResourceHelper.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.j.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0172a {
        NONE,
        IMAGE,
        JAVASCRIPT
    }

    /* compiled from: ResourceHelper.java */
    /* loaded from: classes.dex */
    public enum b {
        HTML_RESOURCE,
        STATIC_RESOURCE,
        IFRAME_RESOURCE
    }

    public static Point a(Context context, int i10, int i11, b bVar) {
        if (context == null) {
            context = m.a();
        }
        Point point = new Point(i10, i11);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        int e10 = v.e(context, i10);
        int e11 = v.e(context, i11);
        if (e10 > width || e11 > height) {
            Point point2 = new Point();
            if (b.HTML_RESOURCE == bVar) {
                point2.x = Math.min(width, e10);
                point2.y = Math.min(height, e11);
            } else {
                float f10 = e10;
                float f11 = f10 / width;
                float f12 = e11;
                float f13 = f12 / height;
                if (f11 >= f13) {
                    point2.x = width;
                    point2.y = (int) (f12 / f11);
                } else {
                    point2.x = (int) (f10 / f13);
                    point2.y = height;
                }
            }
            int i12 = point2.x;
            if (i12 < 0 || point2.y < 0) {
                return point;
            }
            point2.x = v.d(context, i12);
            point2.y = v.d(context, point2.y);
            return point2;
        }
        return point;
    }
}
