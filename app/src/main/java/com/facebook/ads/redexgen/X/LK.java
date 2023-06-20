package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class LK implements Window.Callback {
    public static final List<LJ> A01 = Collections.synchronizedList(new ArrayList());
    public Window.Callback A00;

    public LK(Window.Callback callback, Activity activity) {
        this.A00 = callback;
    }

    public static void A00(LJ lj) {
        A01.add(lj);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.A00.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.A00.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.A00.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.A00.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        for (LJ lj : A01) {
            lj.A4s(motionEvent);
        }
        return this.A00.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.A00.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.A00.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.A00.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.A00.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        this.A00.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.A00.onCreatePanelMenu(i10, menu);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final View onCreatePanelView(int i10) {
        return this.A00.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.A00.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.A00.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return this.A00.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        this.A00.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.A00.onPreparePanel(i10, view, menu);
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.A00.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    @TargetApi(23)
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return this.A00.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.A00.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z10) {
        this.A00.onWindowFocusChanged(z10);
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.A00.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    @Nullable
    @TargetApi(23)
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.A00.onWindowStartingActionMode(callback, i10);
    }
}
