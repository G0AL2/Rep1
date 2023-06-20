package com.applovin.impl.mediation.debugger.ui.a;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public class d extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f7600a;

    /* renamed from: b  reason: collision with root package name */
    private AppLovinSdkUtils.Size f7601b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f7602c;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f7603d;

    public d(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, 16973840);
        this.f7600a = viewGroup;
        this.f7601b = size;
        this.f7602c = activity;
        requestWindowFeature(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f7603d.removeView(this.f7600a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f7602c, this.f7601b.getWidth()), AppLovinSdkUtils.dpToPx(this.f7602c, this.f7601b.getHeight()));
        layoutParams.addRule(13);
        this.f7600a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f7602c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f7602c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f7602c.getResources().getDrawable(R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.d.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d.this.dismiss();
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f7602c);
        this.f7603d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f7603d.setBackgroundColor(RecyclerView.UNDEFINED_DURATION);
        this.f7603d.addView(imageButton);
        this.f7603d.addView(this.f7600a);
        this.f7603d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.d.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                d.this.dismiss();
            }
        });
        setContentView(this.f7603d);
    }
}
