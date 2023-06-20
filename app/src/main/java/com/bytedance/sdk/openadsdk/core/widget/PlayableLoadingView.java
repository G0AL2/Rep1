package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.t;
import java.util.Locale;

/* loaded from: classes.dex */
public class PlayableLoadingView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private ProgressBar f13014a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f13015b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f13016c;

    public PlayableLoadingView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        setBackgroundColor(Color.parseColor("#0D1833"));
        setClickable(true);
        setVisibility(8);
        LayoutInflater.from(context).inflate(t.f(context, "tt_playable_loading_layout"), (ViewGroup) this, true);
        this.f13014a = (ProgressBar) findViewById(t.e(context, "tt_playable_pb_view"));
        this.f13015b = (TextView) findViewById(t.e(context, "tt_playable_progress_tip"));
        TextView textView = (TextView) findViewById(t.e(context, "tt_playable_play"));
        this.f13016c = textView;
        textView.setText(t.a(context, "tt_try_now"));
    }

    public void b() {
        setVisibility(0);
    }

    public TextView getPlayView() {
        return this.f13016c;
    }

    public void setProgress(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 > 100) {
            i10 = 100;
        }
        ProgressBar progressBar = this.f13014a;
        if (progressBar != null) {
            progressBar.setProgress(i10);
        }
        TextView textView = this.f13015b;
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%d%%", Integer.valueOf(i10)));
        }
    }

    public PlayableLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public PlayableLoadingView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context);
    }

    public void a() {
        setVisibility(8);
    }
}
