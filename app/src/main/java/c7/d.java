package c7;

import android.view.View;

/* compiled from: AndroidProgressBarManagerInterface.java */
/* loaded from: classes.dex */
public interface d<T extends View> {
    void setAnimating(T t10, boolean z10);

    void setColor(T t10, Integer num);

    void setIndeterminate(T t10, boolean z10);

    void setProgress(T t10, double d10);

    void setStyleAttr(T t10, String str);

    void setTestID(T t10, String str);

    void setTypeAttr(T t10, String str);
}
