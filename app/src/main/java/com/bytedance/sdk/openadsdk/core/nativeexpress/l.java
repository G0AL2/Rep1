package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.os.Looper;
import android.view.View;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: NativeRender.java */
/* loaded from: classes.dex */
public class l extends com.bytedance.sdk.component.adexpress.b.a<BackupView> {

    /* renamed from: a  reason: collision with root package name */
    AtomicBoolean f12655a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private BackupView f12656b;

    /* renamed from: c  reason: collision with root package name */
    private View f12657c;

    /* renamed from: d  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.b.c f12658d;

    /* renamed from: e  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.b.f f12659e;

    /* renamed from: f  reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.b.l f12660f;

    public l(View view, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, com.bytedance.sdk.component.adexpress.b.l lVar) {
        this.f12657c = view;
        this.f12660f = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f12655a.get()) {
            return;
        }
        com.bytedance.sdk.component.adexpress.b.c cVar = this.f12658d;
        boolean z10 = false;
        if (cVar != null && cVar.a((NativeExpressView) this.f12657c, 0)) {
            z10 = true;
        }
        if (!z10) {
            this.f12659e.a(107);
            return;
        }
        this.f12660f.c().e();
        BackupView backupView = (BackupView) this.f12657c.findViewWithTag("tt_express_backup_fl_tag_26");
        this.f12656b = backupView;
        if (backupView != null) {
            com.bytedance.sdk.component.adexpress.b.m mVar = new com.bytedance.sdk.component.adexpress.b.m();
            BackupView backupView2 = this.f12656b;
            float realWidth = backupView2 == null ? 0.0f : backupView2.getRealWidth();
            BackupView backupView3 = this.f12656b;
            float realHeight = backupView3 != null ? backupView3.getRealHeight() : 0.0f;
            mVar.a(true);
            mVar.a(realWidth);
            mVar.b(realHeight);
            this.f12659e.a(this.f12656b, mVar);
            return;
        }
        this.f12659e.a(107);
    }

    @Override // com.bytedance.sdk.component.adexpress.b.d
    public void a(com.bytedance.sdk.component.adexpress.b.f fVar) {
        this.f12659e = fVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            b();
        } else {
            com.bytedance.sdk.openadsdk.core.k.d().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.nativeexpress.l.1
                @Override // java.lang.Runnable
                public void run() {
                    l.this.b();
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.b.d
    /* renamed from: a */
    public BackupView e() {
        return this.f12656b;
    }

    @Override // com.bytedance.sdk.component.adexpress.b.a
    public void a(com.bytedance.sdk.component.adexpress.b.c cVar) {
        this.f12658d = cVar;
    }
}
