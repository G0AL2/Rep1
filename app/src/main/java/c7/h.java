package c7;

import android.view.View;

/* compiled from: AndroidSwitchManagerInterface.java */
/* loaded from: classes.dex */
public interface h<T extends View> {
    void setDisabled(T t10, boolean z10);

    void setEnabled(T t10, boolean z10);

    void setNativeValue(T t10, boolean z10);

    void setOn(T t10, boolean z10);

    void setThumbColor(T t10, Integer num);

    void setThumbTintColor(T t10, Integer num);

    void setTrackColorForFalse(T t10, Integer num);

    void setTrackColorForTrue(T t10, Integer num);

    void setTrackTintColor(T t10, Integer num);

    void setValue(T t10, boolean z10);
}
