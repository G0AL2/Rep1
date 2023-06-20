package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;

/* compiled from: IllegalViewOperationException.java */
/* loaded from: classes.dex */
public class h extends JSApplicationCausedNativeException {

    /* renamed from: a  reason: collision with root package name */
    private View f15858a;

    public h(String str) {
        super(str);
    }

    public h(String str, View view, Throwable th) {
        super(str, th);
        this.f15858a = view;
    }
}
