package com.facebook.react.uimanager;

import android.os.Bundle;
import android.view.ViewGroup;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ReactRoot.java */
/* loaded from: classes.dex */
public interface b0 {
    void a(int i10);

    void c();

    Bundle getAppProperties();

    int getHeightMeasureSpec();

    String getInitialUITemplate();

    String getJSModuleName();

    ViewGroup getRootViewGroup();

    int getRootViewTag();

    AtomicInteger getState();

    @Deprecated
    String getSurfaceID();

    int getUIManagerType();

    int getWidthMeasureSpec();

    void setRootViewTag(int i10);

    void setShouldLogContentAppeared(boolean z10);
}
