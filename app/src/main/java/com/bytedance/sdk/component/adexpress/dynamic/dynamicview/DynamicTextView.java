package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.widget.AnimationText;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class DynamicTextView extends DynamicBaseWidgetImp {
    public DynamicTextView(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        if (this.f9694l.A()) {
            AnimationText animationText = new AnimationText(context, this.f9694l.g(), this.f9694l.e(), 1, this.f9694l.h());
            this.f9697o = animationText;
            animationText.setMaxLines(1);
        } else {
            this.f9697o = new TextView(context);
        }
        this.f9697o.setTag(Integer.valueOf(getClickArea()));
        addView(this.f9697o, getWidgetLayoutParams());
    }

    private boolean a() {
        DynamicRootView dynamicRootView = this.f9696n;
        return (dynamicRootView == null || dynamicRootView.getRenderRequest() == null || this.f9696n.getRenderRequest().k() == 4) ? false : true;
    }

    private void i() {
        if ((this.f9694l.a() != 0 || this.f9694l.b() <= 0) && com.bytedance.sdk.component.adexpress.c.b()) {
            this.f9697o.setTranslationY(-(((int) ((this.f9690h - ((TextView) this.f9697o).getTextSize()) - com.bytedance.sdk.component.adexpress.c.b.a(getContext(), this.f9694l.b() + this.f9694l.a()))) / 2));
        }
    }

    private void j() {
        if ((TextUtils.equals(this.f9695m.i().b(), "source") || TextUtils.equals(this.f9695m.i().b(), "title")) && Build.VERSION.SDK_INT >= 17) {
            this.f9697o.setTextAlignment(2);
        }
        if ((TextUtils.equals(this.f9695m.i().b(), "text_star") || TextUtils.equals(this.f9695m.i().b(), "fillButton")) && Build.VERSION.SDK_INT >= 17) {
            this.f9697o.setTextAlignment(2);
            ((TextView) this.f9697o).setGravity(17);
        }
    }

    private void k() {
        if (this.f9697o instanceof AnimationText) {
            String text = getText();
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(text);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    arrayList.add(jSONArray.optString(i10));
                }
            } catch (JSONException e10) {
                e10.printStackTrace();
                arrayList.add(text);
            }
            ((AnimationText) this.f9697o).setMaxLines(1);
            ((AnimationText) this.f9697o).setTextColor(this.f9694l.g());
            ((AnimationText) this.f9697o).setTextSize(this.f9694l.e());
            ((AnimationText) this.f9697o).setAnimationText(arrayList);
            ((AnimationText) this.f9697o).setAnimationType(this.f9694l.C());
            ((AnimationText) this.f9697o).setAnimationDuration(this.f9694l.B() * 1000);
            ((AnimationText) this.f9697o).a();
        }
    }

    public String getText() {
        String f10 = this.f9694l.f();
        if (TextUtils.isEmpty(f10)) {
            if (!com.bytedance.sdk.component.adexpress.c.b() && TextUtils.equals(this.f9695m.i().b(), "text_star")) {
                f10 = "5";
            }
            if (!com.bytedance.sdk.component.adexpress.c.b() && TextUtils.equals(this.f9695m.i().b(), "score-count")) {
                f10 = "6870";
            }
        }
        return (TextUtils.equals(this.f9695m.i().b(), "title") || TextUtils.equals(this.f9695m.i().b(), "subtitle")) ? f10.replace("\n", "") : f10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        int i10;
        super.h();
        if (TextUtils.isEmpty(getText())) {
            this.f9697o.setVisibility(4);
            return true;
        } else if (this.f9694l.A()) {
            k();
            return true;
        } else {
            ((TextView) this.f9697o).setText(this.f9694l.f());
            if (Build.VERSION.SDK_INT >= 17) {
                this.f9697o.setTextAlignment(this.f9694l.h());
            }
            ((TextView) this.f9697o).setTextColor(this.f9694l.g());
            ((TextView) this.f9697o).setTextSize(this.f9694l.e());
            if (!this.f9694l.t()) {
                ((TextView) this.f9697o).setMaxLines(1);
                ((TextView) this.f9697o).setGravity(17);
                ((TextView) this.f9697o).setEllipsize(TextUtils.TruncateAt.END);
            } else {
                int u10 = this.f9694l.u();
                if (u10 > 0) {
                    ((TextView) this.f9697o).setLines(u10);
                    ((TextView) this.f9697o).setEllipsize(TextUtils.TruncateAt.END);
                }
            }
            h hVar = this.f9695m;
            if (hVar != null && hVar.i() != null) {
                if (com.bytedance.sdk.component.adexpress.c.b() && a() && (TextUtils.equals(this.f9695m.i().b(), "text_star") || TextUtils.equals(this.f9695m.i().b(), "score-count") || TextUtils.equals(this.f9695m.i().b(), "score-count-type-1") || TextUtils.equals(this.f9695m.i().b(), "score-count-type-2"))) {
                    setVisibility(8);
                    return true;
                }
                if (!TextUtils.equals(this.f9695m.i().b(), "score-count") && !TextUtils.equals(this.f9695m.i().b(), "score-count-type-2")) {
                    if (TextUtils.equals(this.f9695m.i().b(), "text_star")) {
                        double d10 = -1.0d;
                        try {
                            d10 = Double.parseDouble(getText());
                        } catch (Exception e10) {
                            l.e("DynamicStarView applyNativeStyle", e10.toString());
                        }
                        if (d10 < 0.0d || d10 > 5.0d) {
                            if (com.bytedance.sdk.component.adexpress.c.b()) {
                                setVisibility(8);
                                return true;
                            }
                            this.f9697o.setVisibility(0);
                        }
                        i();
                        ((TextView) this.f9697o).setIncludeFontPadding(false);
                        ((TextView) this.f9697o).setGravity(17);
                        if (Build.VERSION.SDK_INT >= 17) {
                            this.f9697o.setTextAlignment(4);
                        }
                        ((TextView) this.f9697o).setText(String.format("%.1f", Double.valueOf(d10)));
                    } else if (TextUtils.equals("privacy-detail", this.f9695m.i().b())) {
                        ((TextView) this.f9697o).setText("权限列表 | 隐私政策");
                    } else if (TextUtils.equals(this.f9695m.i().b(), "development-name")) {
                        ((TextView) this.f9697o).setText("开发者：" + getText());
                    } else if (TextUtils.equals(this.f9695m.i().b(), "app-version")) {
                        ((TextView) this.f9697o).setText("版本号：V" + getText());
                    } else {
                        ((TextView) this.f9697o).setText(getText());
                    }
                } else {
                    try {
                        try {
                            i10 = Integer.parseInt(getText());
                        } catch (NumberFormatException unused) {
                            i10 = -1;
                        }
                        if (i10 < 0) {
                            if (com.bytedance.sdk.component.adexpress.c.b()) {
                                setVisibility(8);
                                return true;
                            }
                            this.f9697o.setVisibility(0);
                        }
                        i();
                        if (TextUtils.equals(this.f9695m.i().b(), "score-count-type-2")) {
                            ((TextView) this.f9697o).setText(String.format(new DecimalFormat("(###,###,###)").format(i10), Integer.valueOf(i10)));
                            ((TextView) this.f9697o).setGravity(17);
                            return true;
                        }
                        a((TextView) this.f9697o, i10, getContext(), "tt_comment_num");
                    } catch (Exception unused2) {
                    }
                }
                if (Build.VERSION.SDK_INT >= 17) {
                    this.f9697o.setTextAlignment(this.f9694l.h());
                    ((TextView) this.f9697o).setGravity(this.f9694l.i());
                }
                if (com.bytedance.sdk.component.adexpress.c.b()) {
                    j();
                }
            }
            return true;
        }
    }

    public void a(TextView textView, int i10, Context context, String str) {
        String format = String.format(t.a(context, str), Integer.valueOf(i10));
        textView.setText("(" + format + ")");
        if (i10 == -1) {
            textView.setVisibility(8);
        }
    }
}
