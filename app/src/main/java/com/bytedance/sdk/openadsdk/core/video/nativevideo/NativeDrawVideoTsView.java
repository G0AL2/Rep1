package com.bytedance.sdk.openadsdk.core.video.nativevideo;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.o;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class NativeDrawVideoTsView extends NativeVideoTsView implements View.OnClickListener {

    /* renamed from: q  reason: collision with root package name */
    private boolean f12863q;

    private void d() {
        v.a((View) this.f12872g, 0);
        v.a((View) this.f12873h, 0);
        v.a((View) this.f12875j, 8);
    }

    private void e() {
        g();
        RelativeLayout relativeLayout = this.f12872g;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            }
            com.bytedance.sdk.openadsdk.i.d.a().a(this.f12866a.J().w(), this.f12873h);
        }
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    public void b() {
        if (!this.f12870e || !o.b(this.f12877l)) {
            this.f12869d = false;
        }
        this.f12877l = "draw_ad";
        m.h().o(String.valueOf(u.f(this.f12866a)));
        super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    public void c() {
        if (this.f12863q) {
            super.c();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        ImageView imageView = this.f12874i;
        if (imageView != null && imageView.getVisibility() == 0) {
            v.e(this.f12872g);
        }
        c();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        ImageView imageView = this.f12874i;
        if (imageView != null && imageView.getVisibility() == 0) {
            e();
        } else {
            super.onWindowFocusChanged(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView, android.view.View
    public void onWindowVisibilityChanged(int i10) {
        ImageView imageView = this.f12874i;
        if (imageView != null && imageView.getVisibility() == 0) {
            e();
        } else {
            super.onWindowVisibilityChanged(i10);
        }
    }

    public void setCanInterruptVideoPlay(boolean z10) {
        this.f12863q = z10;
    }
}
