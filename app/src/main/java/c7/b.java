package c7;

import android.view.View;

/* compiled from: AndroidDrawerLayoutManagerInterface.java */
/* loaded from: classes.dex */
public interface b<T extends View> {
    void closeDrawer(T t10);

    void openDrawer(T t10);

    void setDrawerBackgroundColor(T t10, Integer num);

    void setDrawerLockMode(T t10, String str);

    void setDrawerPosition(T t10, String str);

    void setDrawerWidth(T t10, Float f10);

    void setKeyboardDismissMode(T t10, String str);

    void setStatusBarBackgroundColor(T t10, Integer num);
}
