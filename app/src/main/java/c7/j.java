package c7;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* compiled from: ModalHostViewManagerInterface.java */
/* loaded from: classes.dex */
public interface j<T extends View> {
    void setAnimated(T t10, boolean z10);

    void setAnimationType(T t10, String str);

    void setHardwareAccelerated(T t10, boolean z10);

    void setIdentifier(T t10, int i10);

    void setPresentationStyle(T t10, String str);

    void setStatusBarTranslucent(T t10, boolean z10);

    void setSupportedOrientations(T t10, ReadableArray readableArray);

    void setTransparent(T t10, boolean z10);

    void setVisible(T t10, boolean z10);
}
