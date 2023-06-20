package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.r;
import com.unity3d.services.core.request.metrics.MetricCommonTags;

/* compiled from: ReactDrawableHelper.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final TypedValue f16386a = new TypedValue();

    @TargetApi(21)
    public static Drawable a(Context context, ReadableMap readableMap) {
        String string = readableMap.getString("type");
        if ("ThemeAttrAndroid".equals(string)) {
            String string2 = readableMap.getString("attribute");
            int b10 = b(context, string2);
            if (context.getTheme().resolveAttribute(b10, f16386a, true)) {
                return g(readableMap, d(context));
            }
            throw new JSApplicationIllegalArgumentException("Attribute " + string2 + " with id " + b10 + " couldn't be resolved into a drawable");
        } else if ("RippleAndroid".equals(string)) {
            return g(readableMap, f(context, readableMap));
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid type for android drawable: " + string);
        }
    }

    @TargetApi(21)
    private static int b(Context context, String str) {
        SoftAssertions.assertNotNull(str);
        if ("selectableItemBackground".equals(str)) {
            return 16843534;
        }
        if ("selectableItemBackgroundBorderless".equals(str)) {
            return 16843868;
        }
        return context.getResources().getIdentifier(str, "attr", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
    }

    private static int c(Context context, ReadableMap readableMap) {
        if (readableMap.hasKey("color") && !readableMap.isNull("color")) {
            return readableMap.getInt("color");
        }
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = f16386a;
        if (theme.resolveAttribute(16843820, typedValue, true)) {
            return context.getResources().getColor(typedValue.resourceId);
        }
        throw new JSApplicationIllegalArgumentException("Attribute colorControlHighlight couldn't be resolved into a drawable");
    }

    private static Drawable d(Context context) {
        return context.getResources().getDrawable(f16386a.resourceId, context.getTheme());
    }

    private static Drawable e(ReadableMap readableMap) {
        if (readableMap.hasKey("borderless") && !readableMap.isNull("borderless") && readableMap.getBoolean("borderless")) {
            return null;
        }
        return new ColorDrawable(-1);
    }

    private static RippleDrawable f(Context context, ReadableMap readableMap) {
        return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{c(context, readableMap)}), null, e(readableMap));
    }

    private static Drawable g(ReadableMap readableMap, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23 && readableMap.hasKey("rippleRadius") && (drawable instanceof RippleDrawable)) {
            ((RippleDrawable) drawable).setRadius((int) r.b(readableMap.getDouble("rippleRadius")));
        }
        return drawable;
    }
}
