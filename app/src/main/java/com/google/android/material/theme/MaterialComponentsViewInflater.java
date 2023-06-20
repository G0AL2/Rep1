package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.v;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import ka.a;

@Keep
/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends i {
    private static int floatingToolbarItemBackgroundResId = -1;

    @Override // androidx.appcompat.app.i
    protected f createButton(Context context, AttributeSet attributeSet) {
        if (shouldInflateAppCompatButton(context, attributeSet)) {
            return new f(context, attributeSet);
        }
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.i
    protected g createCheckBox(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.i
    protected v createRadioButton(Context context, AttributeSet attributeSet) {
        return new ta.a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.i
    protected AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    protected boolean shouldInflateAppCompatButton(Context context, AttributeSet attributeSet) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 23 || i10 == 24 || i10 == 25) {
            if (floatingToolbarItemBackgroundResId == -1) {
                floatingToolbarItemBackgroundResId = context.getResources().getIdentifier("floatingToolbarItemBackgroundDrawable", "^attr-private", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            }
            int i11 = floatingToolbarItemBackgroundResId;
            if (i11 != 0 && i11 != -1) {
                for (int i12 = 0; i12 < attributeSet.getAttributeCount(); i12++) {
                    if (attributeSet.getAttributeNameResource(i12) == 16842964) {
                        if (floatingToolbarItemBackgroundResId == attributeSet.getAttributeListValue(i12, null, 0)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }
}
