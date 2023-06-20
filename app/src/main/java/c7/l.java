package c7;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: SliderManagerInterface.java */
/* loaded from: classes.dex */
public interface l<T extends View> {
    void setDisabled(T t10, boolean z10);

    void setEnabled(T t10, boolean z10);

    void setMaximumTrackImage(T t10, ReadableMap readableMap);

    void setMaximumTrackTintColor(T t10, Integer num);

    void setMaximumValue(T t10, double d10);

    void setMinimumTrackImage(T t10, ReadableMap readableMap);

    void setMinimumTrackTintColor(T t10, Integer num);

    void setMinimumValue(T t10, double d10);

    void setStep(T t10, double d10);

    void setTestID(T t10, String str);

    void setThumbImage(T t10, ReadableMap readableMap);

    void setThumbTintColor(T t10, Integer num);

    void setTrackImage(T t10, ReadableMap readableMap);

    void setValue(T t10, double d10);
}
