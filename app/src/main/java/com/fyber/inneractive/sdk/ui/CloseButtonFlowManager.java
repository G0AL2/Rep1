package com.fyber.inneractive.sdk.ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;

/* loaded from: classes2.dex */
public class CloseButtonFlowManager {

    /* renamed from: a  reason: collision with root package name */
    public final View f20197a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f20198b;

    /* renamed from: c  reason: collision with root package name */
    public final View f20199c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f20200d;

    /* renamed from: e  reason: collision with root package name */
    public final FrameLayout f20201e;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ InneractiveFullscreenAdActivity f20202a;

        public a(CloseButtonFlowManager closeButtonFlowManager, InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
            this.f20202a = inneractiveFullscreenAdActivity;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f20202a.dismissAd(true);
        }
    }

    public CloseButtonFlowManager(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        View findViewById = inneractiveFullscreenAdActivity.findViewById(R.id.ia_fl_close_button);
        this.f20197a = findViewById;
        this.f20198b = (TextView) inneractiveFullscreenAdActivity.findViewById(R.id.ia_tv_close_button);
        View findViewById2 = inneractiveFullscreenAdActivity.findViewById(R.id.ia_clickable_close_button);
        this.f20199c = findViewById2;
        this.f20200d = (ImageView) inneractiveFullscreenAdActivity.findViewById(R.id.ia_iv_close_button);
        this.f20201e = (FrameLayout) inneractiveFullscreenAdActivity.findViewById(R.id.close_button_container);
        findViewById.setVisibility(8);
        findViewById2.setOnClickListener(new a(this, inneractiveFullscreenAdActivity));
    }
}
