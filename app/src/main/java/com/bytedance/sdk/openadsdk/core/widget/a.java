package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.m;

/* compiled from: CustomCommonDialog.java */
/* loaded from: classes.dex */
public class a extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public InterfaceC0178a f13084a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f13085b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f13086c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f13087d;

    /* renamed from: e  reason: collision with root package name */
    private Button f13088e;

    /* renamed from: f  reason: collision with root package name */
    private Button f13089f;

    /* renamed from: g  reason: collision with root package name */
    private View f13090g;

    /* renamed from: h  reason: collision with root package name */
    private Context f13091h;

    /* renamed from: i  reason: collision with root package name */
    private String f13092i;

    /* renamed from: j  reason: collision with root package name */
    private String f13093j;

    /* renamed from: k  reason: collision with root package name */
    private String f13094k;

    /* renamed from: l  reason: collision with root package name */
    private String f13095l;

    /* renamed from: m  reason: collision with root package name */
    private int f13096m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f13097n;

    /* compiled from: CustomCommonDialog.java */
    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0178a {
        void a();

        void b();
    }

    public a(Context context) {
        super(context, t.g(context, "tt_custom_dialog"));
        this.f13096m = -1;
        this.f13097n = false;
        this.f13091h = context;
    }

    private void a() {
        this.f13089f.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0178a interfaceC0178a = a.this.f13084a;
                if (interfaceC0178a != null) {
                    interfaceC0178a.a();
                }
            }
        });
        this.f13088e.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.a.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0178a interfaceC0178a = a.this.f13084a;
                if (interfaceC0178a != null) {
                    interfaceC0178a.b();
                }
            }
        });
    }

    private void b() {
        if (!TextUtils.isEmpty(this.f13093j)) {
            this.f13086c.setText(this.f13093j);
            this.f13086c.setVisibility(0);
        } else {
            this.f13086c.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f13092i)) {
            this.f13087d.setText(this.f13092i);
        }
        if (!TextUtils.isEmpty(this.f13094k)) {
            this.f13089f.setText(this.f13094k);
        } else {
            this.f13089f.setText(t.a(m.a(), "tt_postive_txt"));
        }
        if (!TextUtils.isEmpty(this.f13095l)) {
            this.f13088e.setText(this.f13095l);
        } else {
            this.f13088e.setText(t.a(m.a(), "tt_negtive_txt"));
        }
        int i10 = this.f13096m;
        if (i10 != -1) {
            this.f13085b.setImageResource(i10);
            this.f13085b.setVisibility(0);
        } else {
            this.f13085b.setVisibility(8);
        }
        if (this.f13097n) {
            this.f13090g.setVisibility(8);
            this.f13088e.setVisibility(8);
            return;
        }
        this.f13088e.setVisibility(0);
        this.f13090g.setVisibility(0);
    }

    private void c() {
        this.f13088e = (Button) findViewById(t.e(this.f13091h, "tt_negtive"));
        this.f13089f = (Button) findViewById(t.e(this.f13091h, "tt_positive"));
        this.f13086c = (TextView) findViewById(t.e(this.f13091h, "tt_title"));
        this.f13087d = (TextView) findViewById(t.e(this.f13091h, "tt_message"));
        this.f13085b = (ImageView) findViewById(t.e(this.f13091h, "tt_image"));
        this.f13090g = findViewById(t.e(this.f13091h, "tt_column_line"));
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(t.f(this.f13091h, "tt_custom_dailog_layout"));
        setCanceledOnTouchOutside(false);
        c();
        b();
        a();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        b();
    }

    public a a(InterfaceC0178a interfaceC0178a) {
        this.f13084a = interfaceC0178a;
        return this;
    }

    public a a(String str) {
        this.f13092i = str;
        return this;
    }

    public a c(String str) {
        this.f13095l = str;
        return this;
    }

    public a b(String str) {
        this.f13094k = str;
        return this;
    }
}
