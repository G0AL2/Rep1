package com.klarna.vectordrawable;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.core.content.b;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.n0;
import h6.c;

/* loaded from: classes3.dex */
public class VectorDrawableManager extends SimpleViewManager<ImageView> {
    public static final String REACT_CLASS = "RNVectorDrawable";
    private static final String RESIZE_MODE_CENTER = "center";
    private static final String RESIZE_MODE_CONTAIN = "contain";
    private static final String RESIZE_MODE_COVER = "cover";
    private static final String RESIZE_MODE_STRETCH = "stretch";

    private Drawable createVectorDrawable(Context context, String str) throws c {
        String packageName = context.getPackageName();
        int identifier = context.getResources().getIdentifier(str, "drawable", packageName);
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(str, "drawable-hdpi", packageName);
        }
        if (identifier != 0) {
            Drawable f10 = b.f(context, identifier);
            if (Build.VERSION.SDK_INT >= 21) {
                return (VectorDrawable) f10;
            }
            return (BitmapDrawable) f10;
        }
        throw new c("Unable to find resource " + str + " in " + packageName);
    }

    private ImageView.ScaleType toScaleType(String str) {
        if (str != null && !RESIZE_MODE_COVER.equals(str)) {
            if (RESIZE_MODE_CONTAIN.equals(str)) {
                return ImageView.ScaleType.FIT_CENTER;
            }
            if (RESIZE_MODE_STRETCH.equals(str)) {
                return ImageView.ScaleType.FIT_XY;
            }
            if (RESIZE_MODE_CENTER.equals(str)) {
                return ImageView.ScaleType.CENTER_INSIDE;
            }
            throw new JSApplicationIllegalArgumentException("Invalid resize mode: '" + str + "'");
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @w6.a(name = "resizeMode")
    public void setResizeMode(ImageView imageView, String str) {
        imageView.setScaleType(toScaleType(str));
    }

    @w6.a(name = "resourceName")
    public void setResourceName(ImageView imageView, String str) {
        imageView.setImageDrawable(createVectorDrawable(imageView.getContext(), str));
    }

    @w6.a(customType = "Color", name = "tintColor")
    public void setTintColor(ImageView imageView, Integer num) {
        if (num == null) {
            imageView.clearColorFilter();
        } else {
            imageView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ImageView createViewInstance(n0 n0Var) {
        ImageView imageView = new ImageView(n0Var);
        imageView.setCropToPadding(true);
        imageView.setScaleType(toScaleType(null));
        return imageView;
    }
}
