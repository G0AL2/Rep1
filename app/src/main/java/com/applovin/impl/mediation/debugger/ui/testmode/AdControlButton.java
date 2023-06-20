package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.applovin.impl.sdk.utils.f;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class AdControlButton extends RelativeLayout implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final Button f7742a;

    /* renamed from: b  reason: collision with root package name */
    private final com.applovin.impl.adview.a f7743b;

    /* renamed from: c  reason: collision with root package name */
    private b f7744c;

    /* renamed from: d  reason: collision with root package name */
    private MaxAdFormat f7745d;

    /* renamed from: e  reason: collision with root package name */
    private a f7746e;

    /* loaded from: classes.dex */
    public interface a {
        void onClick(AdControlButton adControlButton);
    }

    /* loaded from: classes.dex */
    public enum b {
        LOAD,
        LOADING,
        SHOW
    }

    public AdControlButton(Context context) {
        this(context, null, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdControlButton(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Button button = new Button(getContext());
        this.f7742a = button;
        com.applovin.impl.adview.a aVar = new com.applovin.impl.adview.a(getContext(), 20, 16842873);
        this.f7743b = aVar;
        b bVar = b.LOAD;
        this.f7744c = bVar;
        setBackgroundColor(0);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1, 17));
        button.setTextColor(-1);
        button.setOnClickListener(this);
        frameLayout.addView(button, new FrameLayout.LayoutParams(-1, -1, 17));
        aVar.setColor(-1);
        addView(aVar, new FrameLayout.LayoutParams(-1, -1, 17));
        a(bVar);
    }

    private void a(b bVar) {
        if (b.LOADING == bVar) {
            setEnabled(false);
            this.f7743b.a();
        } else {
            setEnabled(true);
            this.f7743b.b();
        }
        this.f7742a.setText(b(bVar));
        this.f7742a.setBackgroundColor(c(bVar));
    }

    private String b(b bVar) {
        return b.LOAD == bVar ? "Load" : b.LOADING == bVar ? "" : "Show";
    }

    private int c(b bVar) {
        return f.a((b.LOAD == bVar || b.LOADING == bVar) ? R.color.applovin_sdk_brand_color : R.color.applovin_sdk_adControlbutton_brightBlueColor, getContext());
    }

    public b getControlState() {
        return this.f7744c;
    }

    public MaxAdFormat getFormat() {
        return this.f7745d;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f7746e;
        if (aVar != null) {
            aVar.onClick(this);
        }
    }

    public void setControlState(b bVar) {
        if (this.f7744c != bVar) {
            a(bVar);
        }
        this.f7744c = bVar;
    }

    public void setFormat(MaxAdFormat maxAdFormat) {
        this.f7745d = maxAdFormat;
    }

    public void setOnClickListener(a aVar) {
        this.f7746e = aVar;
    }
}
