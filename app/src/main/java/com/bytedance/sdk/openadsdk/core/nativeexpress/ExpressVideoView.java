package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.v;

/* loaded from: classes.dex */
public class ExpressVideoView extends NativeVideoTsView implements View.OnClickListener {

    /* renamed from: q  reason: collision with root package name */
    private boolean f12541q;

    public ExpressVideoView(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, String str, com.bytedance.sdk.openadsdk.b.j jVar) {
        super(context, nVar, false, str, false, false, jVar);
        this.f12541q = false;
        if ("draw_ad".equals(str)) {
            this.f12541q = true;
        }
        setOnClickListener(this);
        setNeedNativeVideoPlayBtnVisible(false);
    }

    private void n() {
        v.a((View) this.f12872g, 0);
        v.a((View) this.f12873h, 0);
        v.a((View) this.f12875j, 8);
    }

    private void o() {
        g();
        RelativeLayout relativeLayout = this.f12872g;
        if (relativeLayout != null) {
            if (relativeLayout.getVisibility() == 0) {
                return;
            }
            com.bytedance.sdk.openadsdk.i.d.a().a(this.f12866a.J().w(), this.f12873h);
        }
        n();
    }

    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    protected void a(boolean z10) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    public void b() {
        if (!this.f12870e || !o.b(this.f12877l)) {
            this.f12869d = false;
        }
        super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView
    public void c() {
        if (this.f12541q) {
            super.c();
        }
    }

    public void d() {
        ImageView imageView = this.f12875j;
        if (imageView != null) {
            v.a((View) imageView, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e() {
        g();
        v.a((View) this.f12872g, 0);
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
            o();
        } else {
            super.onWindowFocusChanged(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView, android.view.View
    public void onWindowVisibilityChanged(int i10) {
        ImageView imageView = this.f12874i;
        if (imageView != null && imageView.getVisibility() == 0) {
            o();
        } else {
            super.onWindowVisibilityChanged(i10);
        }
    }

    public void setCanInterruptVideoPlay(boolean z10) {
        this.f12541q = z10;
    }

    public void setShouldCheckNetChange(boolean z10) {
        m3.c cVar = this.f12867b;
        if (cVar != null) {
            cVar.e(z10);
        }
    }

    public void setShowAdInteractionView(boolean z10) {
        m3.b o10;
        m3.c cVar = this.f12867b;
        if (cVar == null || (o10 = cVar.o()) == null) {
            return;
        }
        o10.a(z10);
    }
}
