package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.g.d;
import com.bytedance.sdk.openadsdk.core.g.e;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.widget.b;
import com.bytedance.sdk.openadsdk.utils.c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTDelegateActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private Intent f10744a;

    /* renamed from: b  reason: collision with root package name */
    private AlertDialog f10745b;

    /* renamed from: c  reason: collision with root package name */
    private b f10746c;

    /* renamed from: d  reason: collision with root package name */
    private TTAdDislike f10747d;

    private void b() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    private void c() {
        int intExtra = this.f10744a.getIntExtra("type", 0);
        String stringExtra = this.f10744a.getStringExtra("app_download_url");
        this.f10744a.getStringExtra("app_name");
        if (intExtra != 1) {
            if (intExtra == 3) {
                a(stringExtra, this.f10744a.getStringExtra("dialog_title_key"), this.f10744a.getStringExtra("dialog_content_key"));
            } else if (intExtra == 4) {
                a(this.f10744a.getStringExtra("permission_id_key"), this.f10744a.getStringArrayExtra("permission_content_key"));
            } else if (intExtra == 5) {
                d();
            } else if (intExtra != 6) {
                finish();
            } else {
                a(this.f10744a.getStringExtra("materialmeta"), this.f10744a.getStringExtra("closed_listener_key"));
            }
        }
    }

    private void d() {
        if (this.f10746c == null) {
            b bVar = new b(this);
            this.f10746c = bVar;
            bVar.a(t.a(this, "no_thank_you"), new b.InterfaceC0179b() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.3
                @Override // com.bytedance.sdk.openadsdk.core.widget.b.InterfaceC0179b
                public void a() {
                    TTAdSdk.setGdpr(0);
                    if (TTDelegateActivity.this.f10746c.isShowing()) {
                        TTDelegateActivity.this.f10746c.dismiss();
                    }
                    TTDelegateActivity.this.finish();
                }
            }).a(t.a(this, "yes_i_agree"), new b.c() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.b.c
                public void a() {
                    TTAdSdk.setGdpr(1);
                    if (TTDelegateActivity.this.f10746c.isShowing()) {
                        TTDelegateActivity.this.f10746c.dismiss();
                    }
                    TTDelegateActivity.this.finish();
                }
            });
        }
        if (this.f10746c.isShowing()) {
            return;
        }
        this.f10746c.show();
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        b();
        this.f10744a = getIntent();
        if (m.a() == null) {
            m.a(this);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        try {
            AlertDialog alertDialog = this.f10745b;
            if (alertDialog != null && alertDialog.isShowing()) {
                this.f10745b.dismiss();
            }
            b bVar = this.f10746c;
            if (bVar != null && bVar.isShowing()) {
                this.f10746c.dismiss();
            }
        } catch (Throwable unused) {
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (m.a() == null) {
            m.a(this);
        }
        setIntent(intent);
        this.f10744a = intent;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        d.a().a(this, strArr, iArr);
        finish();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (getIntent() != null) {
            c();
        }
    }

    public static void a() {
        Intent intent = new Intent(m.a(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 5);
        if (m.a() != null) {
            m.a().startActivity(intent);
        }
    }

    public static void a(n nVar, String str) {
        Intent intent = new Intent(m.a(), TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("materialmeta", nVar.ar().toString());
        intent.putExtra("closed_listener_key", str);
        if (m.a() != null) {
            m.a().startActivity(intent);
        }
    }

    private void a(String str, String str2) {
        if (str != null && this.f10747d == null) {
            try {
                com.bytedance.sdk.openadsdk.dislike.b bVar = new com.bytedance.sdk.openadsdk.dislike.b(this, com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(str)));
                this.f10747d = bVar;
                bVar.a(str2);
                this.f10747d.setDislikeInteractionCallback(new TTAdDislike.DislikeInteractionCallback() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.1
                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                    public void onCancel() {
                        l.c("showDislike", "onCancel->onCancel....");
                        TTDelegateActivity.this.finish();
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                    public void onRefuse() {
                        l.c("showDislike", "onRefuse->onRefuse....");
                    }

                    @Override // com.bytedance.sdk.openadsdk.TTAdDislike.DislikeInteractionCallback
                    public void onSelected(int i10, String str3) {
                        l.c("showDislike", "onSelected->position=" + i10 + ",value=" + str3);
                        TTDelegateActivity.this.finish();
                    }
                });
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        TTAdDislike tTAdDislike = this.f10747d;
        if (tTAdDislike != null) {
            tTAdDislike.showDislikeDialog();
        }
    }

    private void a(final String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null && strArr.length > 0) {
            if (Build.VERSION.SDK_INT >= 23) {
                try {
                    d.a().a(this, strArr, new e() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.4
                        @Override // com.bytedance.sdk.openadsdk.core.g.e
                        public void a() {
                            com.bytedance.sdk.openadsdk.utils.d.a(str);
                            TTDelegateActivity.this.finish();
                        }

                        @Override // com.bytedance.sdk.openadsdk.core.g.e
                        public void a(String str2) {
                            com.bytedance.sdk.openadsdk.utils.d.a(str, str2);
                            TTDelegateActivity.this.finish();
                        }
                    });
                    return;
                } catch (Exception unused) {
                    finish();
                    return;
                }
            }
            l.b(TTAdConstant.TAG, "Already have permission");
            finish();
            return;
        }
        finish();
    }

    private void a(final String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            str2 = t.a(this, "tt_tip");
        }
        String str4 = str2;
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        a(str4, str3, new DialogInterface.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.5
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                c.a(str);
                TTDelegateActivity.this.finish();
            }
        }, new DialogInterface.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.6
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                c.b(str);
                TTDelegateActivity.this.finish();
            }
        }, new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.7
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                c.c(str);
                TTDelegateActivity.this.finish();
            }
        });
    }

    private void a(String str, String str2, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (this.f10745b == null) {
                this.f10745b = new AlertDialog.Builder(this, t.g(this, Build.VERSION.SDK_INT >= 21 ? "Theme.Dialog.TTDownload" : "Theme.Dialog.TTDownloadOld")).create();
            }
            this.f10745b.setTitle(String.valueOf(str));
            this.f10745b.setMessage(String.valueOf(str2));
            this.f10745b.setButton(-1, t.a(this, "tt_label_ok"), onClickListener);
            this.f10745b.setButton(-2, t.a(this, "tt_label_cancel"), onClickListener2);
            this.f10745b.setOnCancelListener(onCancelListener);
            if (this.f10745b.isShowing()) {
                return;
            }
            this.f10745b.show();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
