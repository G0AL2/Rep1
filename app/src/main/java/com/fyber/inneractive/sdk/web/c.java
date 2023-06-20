package com.fyber.inneractive.sdk.web;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.p0;
import com.fyber.inneractive.sdk.web.o;

/* loaded from: classes2.dex */
public class c extends WebView {

    /* renamed from: a  reason: collision with root package name */
    public boolean f20397a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20398b;

    /* renamed from: c  reason: collision with root package name */
    public a f20399c;

    /* renamed from: d  reason: collision with root package name */
    public o f20400d;

    /* renamed from: e  reason: collision with root package name */
    public final p0 f20401e;

    /* renamed from: f  reason: collision with root package name */
    public int f20402f;

    /* renamed from: g  reason: collision with root package name */
    public int f20403g;

    /* loaded from: classes2.dex */
    public interface a {
    }

    public c() {
        super(null);
        this.f20397a = false;
        this.f20401e = p0.a();
    }

    public void a(String str) {
        IAlog.a("injecting JS: %s", str);
        if (str != null) {
            try {
                loadUrl("javascript:" + str);
            } catch (Exception unused) {
                IAlog.a("Failed to inject JS", new Object[0]);
            }
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable unused) {
        }
        this.f20399c = null;
    }

    public int getHeightDp() {
        return this.f20403g;
    }

    public boolean getIsVisible() {
        return this.f20398b;
    }

    public p0 getLastClickedLocation() {
        return this.f20401e;
    }

    public int getWidthDp() {
        return this.f20402f;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f20397a) {
            return;
        }
        this.f20397a = true;
        a aVar = this.f20399c;
        if (aVar != null) {
            com.fyber.inneractive.sdk.util.n.f20310b.post(new f((d) aVar));
        }
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20398b = false;
        if (this.f20397a) {
            this.f20397a = false;
            a aVar = this.f20399c;
            if (aVar != null) {
                com.fyber.inneractive.sdk.util.n.f20310b.post(new g((d) aVar));
            }
            a();
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        super.onFocusChanged(z10, i10, rect);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        o oVar = this.f20400d;
        if (oVar != null) {
            oVar.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            p0 p0Var = this.f20401e;
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            p0Var.f20315a = x10;
            p0Var.f20316b = y10;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        IAlog.d("onWindowFocusChanged with: %s", Boolean.valueOf(z10));
        a();
    }

    @Override // android.webkit.WebView, android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (i10 == 8) {
            a(false);
        } else {
            a();
        }
    }

    public void setHeightDp(int i10) {
        this.f20403g = i10;
    }

    public void setListener(a aVar) {
        this.f20399c = aVar;
    }

    public void setTapListener(o.a aVar) {
        this.f20400d = new o(aVar, getContext());
    }

    public void setWidthDp(int i10) {
        this.f20402f = i10;
    }

    public c(Context context) {
        super(context.getApplicationContext());
        this.f20397a = false;
        this.f20401e = p0.a();
    }

    public boolean a() {
        boolean z10 = false;
        IAlog.d("updateVisibility called - is = %s hwf = %s atw = %swinToken - %s app token - %s", Boolean.valueOf(isShown()), Boolean.valueOf(hasWindowFocus()), Boolean.valueOf(this.f20397a), getWindowToken(), getApplicationWindowToken());
        if (getWindowToken() != getApplicationWindowToken()) {
            if (getWindowVisibility() != 8 && isShown() && this.f20397a) {
                z10 = true;
            }
            return a(z10);
        }
        if (isShown() && hasWindowFocus() && this.f20397a) {
            z10 = true;
        }
        return a(z10);
    }

    public final boolean a(boolean z10) {
        if (z10) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                if (!getLocalVisibleRect(rect) && getWindowToken() == getApplicationWindowToken()) {
                    IAlog.d("updateVisibility - Cannot find local visible rect. Scrolled out?", new Object[0]);
                    z10 = false;
                }
            } else {
                IAlog.d("updateVisibility - No parent available", new Object[0]);
            }
        }
        if (this.f20398b != z10) {
            this.f20398b = z10;
            a aVar = this.f20399c;
            if (aVar != null) {
                ((IAmraidWebViewController) aVar).e(z10);
            }
            return true;
        }
        return false;
    }
}
