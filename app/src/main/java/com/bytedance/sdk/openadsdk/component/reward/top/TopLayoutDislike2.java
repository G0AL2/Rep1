package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.m;

/* loaded from: classes.dex */
public class TopLayoutDislike2 extends FrameLayout implements a<TopLayoutDislike2> {

    /* renamed from: a  reason: collision with root package name */
    private View f11704a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f11705b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f11706c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f11707d;

    /* renamed from: e  reason: collision with root package name */
    private n f11708e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11709f;

    /* renamed from: g  reason: collision with root package name */
    private b f11710g;

    /* renamed from: h  reason: collision with root package name */
    private CharSequence f11711h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f11712i;

    public TopLayoutDislike2(Context context) {
        this(context, null);
    }

    private void d() {
        View view = this.f11704a;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.f11710g != null) {
                        TopLayoutDislike2.this.f11710g.c(view2);
                    }
                }
            });
        }
        ImageView imageView = this.f11705b;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    TopLayoutDislike2 topLayoutDislike2 = TopLayoutDislike2.this;
                    topLayoutDislike2.f11709f = !topLayoutDislike2.f11709f;
                    TopLayoutDislike2.this.f11705b.setImageResource(TopLayoutDislike2.this.f11709f ? t.d(TopLayoutDislike2.this.getContext(), "tt_mute") : t.d(TopLayoutDislike2.this.getContext(), "tt_unmute"));
                    if (TopLayoutDislike2.this.f11710g != null) {
                        TopLayoutDislike2.this.f11710g.b(view2);
                    }
                }
            });
        }
        TextView textView = this.f11706c;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.f11710g != null) {
                        TopLayoutDislike2.this.f11710g.a(view2);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void setListener(b bVar) {
        this.f11710g = bVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void setShowDislike(boolean z10) {
        View view = this.f11704a;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void setShowSkip(boolean z10) {
        TextView textView = this.f11706c;
        if (textView != null) {
            if (!z10) {
                textView.setText("");
            }
            if (this.f11706c.getVisibility() == 4) {
                return;
            }
            this.f11706c.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void setShowSound(boolean z10) {
        ImageView imageView = this.f11705b;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void setSkipEnable(boolean z10) {
        TextView textView = this.f11706c;
        if (textView != null) {
            textView.setEnabled(z10);
            this.f11706c.setClickable(z10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void setSoundMute(boolean z10) {
        int d10;
        this.f11709f = z10;
        if (z10) {
            d10 = t.d(getContext(), "tt_mute");
        } else {
            d10 = t.d(getContext(), "tt_unmute");
        }
        this.f11705b.setImageResource(d10);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void b() {
        ImageView imageView = this.f11705b;
        if (imageView != null) {
            imageView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void c() {
        this.f11706c.setWidth(20);
        this.f11706c.setVisibility(4);
    }

    public TopLayoutDislike2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11711h = "";
        this.f11712i = "";
    }

    public TopLayoutDislike2 a(boolean z10, n nVar) {
        this.f11707d = z10;
        this.f11708e = nVar;
        LayoutInflater.from(getContext()).inflate(t.f(getContext(), "tt_top_reward_dislike_2"), (ViewGroup) this, true);
        this.f11704a = findViewById(t.e(getContext(), "tt_top_dislike"));
        if (nVar.aw()) {
            this.f11704a.setVisibility(8);
        }
        ((TextView) this.f11704a).setText(t.a(m.a(), "tt_reward_feedback"));
        this.f11705b = (ImageView) findViewById(t.e(getContext(), "tt_top_mute"));
        TextView textView = (TextView) findViewById(t.e(getContext(), "tt_top_skip"));
        this.f11706c = textView;
        textView.setVisibility(0);
        this.f11706c.setText("");
        this.f11706c.setEnabled(false);
        this.f11706c.setClickable(false);
        d();
        return this;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void a(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f11711h = charSequence;
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            this.f11712i = charSequence2;
        }
        if (this.f11706c != null) {
            CharSequence charSequence3 = this.f11711h;
            if (!TextUtils.isEmpty(this.f11712i)) {
                charSequence3 = ((Object) charSequence3) + " | " + ((Object) this.f11712i);
            }
            this.f11706c.setText(charSequence3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.a
    public void a() {
        TextView textView = this.f11706c;
        if (textView != null) {
            textView.performClick();
        }
    }
}
