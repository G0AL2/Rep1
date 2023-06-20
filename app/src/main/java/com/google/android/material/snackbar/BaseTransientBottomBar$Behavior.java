package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes3.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: k  reason: collision with root package name */
    private final a f22510k = new a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public boolean E(View view) {
        return this.f22510k.a(view);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f22510k.b(coordinatorLayout, view, motionEvent);
        return super.k(coordinatorLayout, view, motionEvent);
    }
}
