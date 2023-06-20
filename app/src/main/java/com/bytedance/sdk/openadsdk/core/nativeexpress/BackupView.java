package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.activity.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;

/* loaded from: classes.dex */
public abstract class BackupView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.b.j f12527a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f12528b;

    /* renamed from: c  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.core.e.n f12529c;

    /* renamed from: d  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.dislike.b f12530d;

    /* renamed from: e  reason: collision with root package name */
    protected TTDislikeDialogAbstract f12531e;

    /* renamed from: f  reason: collision with root package name */
    protected String f12532f;

    /* renamed from: g  reason: collision with root package name */
    protected int f12533g;

    /* renamed from: h  reason: collision with root package name */
    protected int f12534h;

    /* renamed from: i  reason: collision with root package name */
    protected int f12535i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f12536j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f12537k;

    /* renamed from: l  reason: collision with root package name */
    protected String f12538l;

    public BackupView(Context context) {
        super(context);
        this.f12532f = "embeded_ad";
        this.f12536j = true;
        this.f12537k = true;
        setTag("tt_express_backup_fl_tag_26");
    }

    public void a() {
        TTDislikeDialogAbstract tTDislikeDialogAbstract = this.f12531e;
        if (tTDislikeDialogAbstract != null) {
            tTDislikeDialogAbstract.show();
            return;
        }
        com.bytedance.sdk.openadsdk.dislike.b bVar = this.f12530d;
        if (bVar != null) {
            bVar.showDislikeDialog();
        } else {
            TTDelegateActivity.a(this.f12529c, (String) null);
        }
    }

    protected abstract void a(View view, int i10, com.bytedance.sdk.openadsdk.core.e.j jVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public String getDescription() {
        if (TextUtils.isEmpty(this.f12529c.U())) {
            return !TextUtils.isEmpty(this.f12529c.V()) ? this.f12529c.V() : "";
        }
        return this.f12529c.U();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getNameOrSource() {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f12529c;
        if (nVar == null) {
            return "";
        }
        if (nVar.aa() == null || TextUtils.isEmpty(this.f12529c.aa().b())) {
            return !TextUtils.isEmpty(this.f12529c.K()) ? this.f12529c.K() : "";
        }
        return this.f12529c.aa().b();
    }

    public float getRealHeight() {
        return v.d(this.f12528b, this.f12534h);
    }

    public float getRealWidth() {
        return v.d(this.f12528b, this.f12533g);
    }

    @Override // android.view.View
    public Object getTag() {
        return "tt_express_backup_fl_tag_26";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getTitle() {
        if (this.f12529c.aa() != null && !TextUtils.isEmpty(this.f12529c.aa().b())) {
            return this.f12529c.aa().b();
        }
        if (TextUtils.isEmpty(this.f12529c.K())) {
            return !TextUtils.isEmpty(this.f12529c.U()) ? this.f12529c.U() : "";
        }
        return this.f12529c.K();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View getVideoView() {
        NativeVideoTsView nativeVideoTsView;
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f12529c;
        if (nVar != null && this.f12528b != null) {
            if (com.bytedance.sdk.openadsdk.core.e.n.c(nVar)) {
                try {
                    nativeVideoTsView = new NativeVideoTsView(this.f12528b, this.f12529c, this.f12532f, true, false, this.f12527a);
                    nativeVideoTsView.setVideoCacheUrl(this.f12538l);
                    nativeVideoTsView.setControllerStatusCallBack(new NativeVideoTsView.b() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView.2
                        @Override // com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView.b
                        public void a(boolean z10, long j10, long j11, long j12, boolean z11) {
                        }
                    });
                    nativeVideoTsView.setIsAutoPlay(this.f12536j);
                    nativeVideoTsView.setIsQuiet(this.f12537k);
                } catch (Throwable unused) {
                }
                if (!com.bytedance.sdk.openadsdk.core.e.n.c(this.f12529c) && nativeVideoTsView != null && nativeVideoTsView.a(0L, true, false)) {
                    return nativeVideoTsView;
                }
            }
            nativeVideoTsView = null;
            if (!com.bytedance.sdk.openadsdk.core.e.n.c(this.f12529c)) {
            }
        }
        return null;
    }

    public void setDislikeInner(TTAdDislike tTAdDislike) {
        if (tTAdDislike instanceof com.bytedance.sdk.openadsdk.dislike.b) {
            this.f12530d = (com.bytedance.sdk.openadsdk.dislike.b) tTAdDislike;
        }
    }

    public void setDislikeOuter(TTDislikeDialogAbstract tTDislikeDialogAbstract) {
        com.bytedance.sdk.openadsdk.core.e.n nVar;
        if (tTDislikeDialogAbstract != null && (nVar = this.f12529c) != null) {
            tTDislikeDialogAbstract.setMaterialMeta(nVar);
        }
        this.f12531e = tTDislikeDialogAbstract;
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("tt_express_backup_fl_tag_26");
    }

    public BackupView(Context context, String str) {
        super(context);
        this.f12532f = "embeded_ad";
        this.f12536j = true;
        this.f12537k = true;
        this.f12538l = str;
        setTag("tt_express_backup_fl_tag_26");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(View view, boolean z10) {
        com.bytedance.sdk.openadsdk.core.b.b bVar;
        if (view == null) {
            return;
        }
        if (z10) {
            Context context = this.f12528b;
            com.bytedance.sdk.openadsdk.core.e.n nVar = this.f12529c;
            String str = this.f12532f;
            bVar = new com.bytedance.sdk.openadsdk.core.b.a(context, nVar, str, u.a(str));
        } else {
            Context context2 = this.f12528b;
            com.bytedance.sdk.openadsdk.core.e.n nVar2 = this.f12529c;
            String str2 = this.f12532f;
            bVar = new com.bytedance.sdk.openadsdk.core.b.b(context2, nVar2, str2, u.a(str2));
        }
        view.setOnTouchListener(bVar);
        view.setOnClickListener(bVar);
        bVar.a(new a() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.BackupView.1
            @Override // com.bytedance.sdk.openadsdk.core.nativeexpress.a
            public void a(View view2, int i10, com.bytedance.sdk.openadsdk.core.e.j jVar) {
                BackupView.this.a(view2, i10, jVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i10) {
        this.f12537k = com.bytedance.sdk.openadsdk.core.m.h().a(this.f12535i);
        int c10 = com.bytedance.sdk.openadsdk.core.m.h().c(i10);
        if (3 == c10) {
            this.f12536j = false;
            return;
        }
        int c11 = com.bytedance.sdk.component.utils.o.c(com.bytedance.sdk.openadsdk.core.m.a());
        if (1 == c10 && u.e(c11)) {
            this.f12536j = true;
        } else if (2 == c10) {
            if (u.f(c11) || u.e(c11) || u.g(c11)) {
                this.f12536j = true;
            }
        } else if (5 == c10) {
            if (u.e(c11) || u.g(c11)) {
                this.f12536j = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(View view) {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.f12529c;
        if (nVar == null || nVar.J() == null || view == null) {
            return;
        }
        if (this.f12529c.p() == 1 && this.f12536j) {
            a(view, true);
        } else {
            a(view, false);
        }
    }
}
