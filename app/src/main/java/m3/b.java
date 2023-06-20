package m3;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: IMediaLayout.java */
/* loaded from: classes.dex */
public interface b<T> extends k3.a {

    /* compiled from: IMediaLayout.java */
    /* loaded from: classes.dex */
    public enum a {
        hideCloseBtn,
        alwayShowBackBtn,
        alwayShowMediaView,
        fixedSize,
        hideBackBtn,
        hideTopMoreBtn
    }

    void a();

    void a(Drawable drawable);

    void a(T t10, WeakReference<Context> weakReference, boolean z10);

    void a(boolean z10);

    void b();

    View c();
}
