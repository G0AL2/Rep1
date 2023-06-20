package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;

/* loaded from: classes.dex */
public class FullRewardExpressBackupView extends BackupView {

    /* renamed from: a  reason: collision with root package name */
    private View f12542a;

    /* renamed from: m  reason: collision with root package name */
    private NativeExpressView f12543m;

    /* renamed from: n  reason: collision with root package name */
    private FrameLayout f12544n;

    public FullRewardExpressBackupView(Context context) {
        super(context);
        this.f12528b = context;
    }

    private void b() {
        this.f12533g = v.e(this.f12528b, this.f12543m.getExpectExpressWidth());
        this.f12534h = v.e(this.f12528b, this.f12543m.getExpectExpressWidth());
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.f12533g, this.f12534h);
        }
        layoutParams.width = this.f12533g;
        layoutParams.height = this.f12534h;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        this.f12529c.v();
        c();
    }

    private void c() {
        View inflate = LayoutInflater.from(this.f12528b).inflate(t.f(this.f12528b, "tt_backup_full_reward"), (ViewGroup) this, true);
        this.f12542a = inflate;
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(t.e(this.f12528b, "tt_bu_video_container"));
        this.f12544n = frameLayout;
        frameLayout.removeAllViews();
    }

    public void a(com.bytedance.sdk.openadsdk.core.e.n nVar, NativeExpressView nativeExpressView) {
        com.bytedance.sdk.component.utils.l.b("FullRewardExpressBackupView", "show backup view");
        if (nVar == null) {
            return;
        }
        setBackgroundColor(-1);
        this.f12529c = nVar;
        this.f12543m = nativeExpressView;
        if (u.e(nVar) == 7) {
            this.f12532f = "rewarded_video";
        } else {
            this.f12532f = "fullscreen_interstitial_ad";
        }
        b();
        this.f12543m.addView(this, new ViewGroup.LayoutParams(-2, -2));
    }

    public View getBackupContainerBackgroundView() {
        return this.f12542a;
    }

    public FrameLayout getVideoContainer() {
        return this.f12544n;
    }

    @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView
    protected void a(View view, int i10, com.bytedance.sdk.openadsdk.core.e.j jVar) {
        NativeExpressView nativeExpressView = this.f12543m;
        if (nativeExpressView != null) {
            nativeExpressView.a(view, i10, jVar);
        }
    }
}
