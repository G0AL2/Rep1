package com.facebook.react.views.unimplementedview;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* compiled from: ReactUnimplementedView.java */
/* loaded from: classes.dex */
public class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private AppCompatTextView f16380a;

    public a(Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.f16380a = appCompatTextView;
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        this.f16380a.setGravity(17);
        this.f16380a.setTextColor(-1);
        setBackgroundColor(1442775040);
        setGravity(1);
        setOrientation(1);
        addView(this.f16380a);
    }

    public void setName(String str) {
        AppCompatTextView appCompatTextView = this.f16380a;
        appCompatTextView.setText("'" + str + "' is not Fabric compatible yet.");
    }
}
