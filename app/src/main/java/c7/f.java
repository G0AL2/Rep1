package c7;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* compiled from: AndroidSwipeRefreshLayoutManagerInterface.java */
/* loaded from: classes.dex */
public interface f<T extends View> {
    void setColors(T t10, ReadableArray readableArray);

    void setEnabled(T t10, boolean z10);

    void setNativeRefreshing(T t10, boolean z10);

    void setProgressBackgroundColor(T t10, Integer num);

    void setProgressViewOffset(T t10, float f10);

    void setRefreshing(T t10, boolean z10);

    void setSize(T t10, String str);
}
