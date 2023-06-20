package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TTPrivacyAdReportDialog.java */
/* loaded from: classes.dex */
public class e extends Dialog {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f11271b = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};

    /* renamed from: a  reason: collision with root package name */
    private Handler f11272a;

    /* renamed from: c  reason: collision with root package name */
    private String f11273c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f11274d;

    public e(Context context) {
        super(context, t.g(context, "tt_privacy_dialog_theme_ad_report"));
        this.f11272a = new Handler(Looper.getMainLooper());
        this.f11273c = "";
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(LayoutInflater.from(getContext()).inflate(t.f(getContext(), "tt_ad_report_info"), (ViewGroup) null), new ViewGroup.LayoutParams(v.c(getContext()), (int) (v.d(getContext()) * 0.9d)));
        b();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        this.f11272a.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.e.3
            @Override // java.lang.Runnable
            public void run() {
                e.this.f11274d.setText(e.this.f11273c);
            }
        }, 1000L);
    }

    private void b() {
        this.f11274d = (TextView) findViewById(t.e(getContext(), "tt_ad_report_creative_info"));
        final String d10 = u.d();
        final String f10 = u.f();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        ((TextView) findViewById(t.e(getContext(), "tt_ad_report_sdk_version"))).setText(BuildConfig.VERSION_NAME);
        ((TextView) findViewById(t.e(getContext(), "tt_ad_report_app_package_name"))).setText(d10);
        ((TextView) findViewById(t.e(getContext(), "tt_ad_report_app_version"))).setText(f10);
        ((TextView) findViewById(t.e(getContext(), "tt_ad_report_os"))).setText(str);
        ((TextView) findViewById(t.e(getContext(), "tt_ad_report_device"))).setText(str2);
        this.f11274d.setText("loading ...");
        ((Button) findViewById(t.e(getContext(), "tt_ad_report_copy_button"))).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.e.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) e.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb2 = new StringBuilder("");
                    String[] strArr = {BuildConfig.VERSION_NAME, d10, f10, str, str2, e.this.f11273c};
                    for (int i10 = 0; i10 < e.f11271b.length; i10++) {
                        sb2.append(e.f11271b[i10]);
                        sb2.append(": ");
                        sb2.append(strArr[i10]);
                        sb2.append("\n");
                    }
                    clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb2));
                }
            }
        });
        ((ImageView) findViewById(t.e(getContext(), "tt_ad_report_close_button"))).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.e.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                e.this.f11274d.setText("loading ...");
                e.this.cancel();
            }
        });
    }

    public void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f11273c = com.bytedance.sdk.component.utils.a.a(new JSONObject(str)).toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}
