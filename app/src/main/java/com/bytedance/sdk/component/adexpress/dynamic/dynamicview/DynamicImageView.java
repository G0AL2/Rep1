package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.component.adexpress.dynamic.b.h;
import com.bytedance.sdk.component.adexpress.widget.TTRoundRectImageView;
import com.bytedance.sdk.component.d.i;
import com.bytedance.sdk.component.d.j;
import com.bytedance.sdk.component.d.n;
import com.bytedance.sdk.component.utils.t;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DynamicImageView extends DynamicBaseWidgetImp {

    /* renamed from: a  reason: collision with root package name */
    private String f9710a;

    public DynamicImageView(Context context, DynamicRootView dynamicRootView, h hVar) {
        super(context, dynamicRootView, hVar);
        if (this.f9694l.o() > 0.0f) {
            TTRoundRectImageView tTRoundRectImageView = new TTRoundRectImageView(context);
            this.f9697o = tTRoundRectImageView;
            tTRoundRectImageView.setXRound((int) com.bytedance.sdk.component.adexpress.c.b.a(context, this.f9694l.o()));
            ((TTRoundRectImageView) this.f9697o).setYRound((int) com.bytedance.sdk.component.adexpress.c.b.a(context, this.f9694l.o()));
        } else {
            this.f9697o = new ImageView(context);
        }
        this.f9710a = getImageKey();
        this.f9697o.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(hVar.i().b())) {
            if (this.f9694l.b() <= 0 && this.f9694l.a() <= 0) {
                int max = Math.max(this.f9689g, this.f9690h);
                this.f9689g = max;
                this.f9690h = Math.max(max, this.f9690h);
            } else {
                int min = Math.min(this.f9689g, this.f9690h);
                this.f9689g = min;
                this.f9690h = Math.min(min, this.f9690h);
                this.f9691i = (int) (this.f9691i + com.bytedance.sdk.component.adexpress.c.b.a(context, this.f9694l.b() + (this.f9694l.a() / 2) + 0.5f));
            }
            this.f9694l.a(this.f9689g / 2);
        }
        addView(this.f9697o, new FrameLayout.LayoutParams(this.f9689g, this.f9690h));
    }

    private boolean a() {
        String l10 = this.f9694l.l();
        if (this.f9694l.s()) {
            return true;
        }
        if (TextUtils.isEmpty(l10)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(l10);
            return Math.abs((((float) this.f9689g) / (((float) this.f9690h) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> l10 = this.f9696n.getRenderRequest().l();
        if (l10 == null || l10.size() <= 0) {
            return null;
        }
        return l10.get(this.f9694l.k());
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidgetImp, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.b
    public boolean h() {
        super.h();
        if ("arrowButton".equals(this.f9695m.i().b())) {
            ((ImageView) this.f9697o).setImageResource(t.d(this.f9693k, "tt_white_righterbackicon_titlebar"));
            this.f9697o.setPadding(0, 0, 0, 0);
            ((ImageView) this.f9697o).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.f9697o.setBackgroundColor(this.f9694l.w());
        if ("user".equals(this.f9695m.i().c())) {
            ((ImageView) this.f9697o).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.f9697o).setColorFilter(this.f9694l.g());
            ((ImageView) this.f9697o).setImageDrawable(t.c(getContext(), "tt_user"));
            int i10 = this.f9689g;
            ((ImageView) this.f9697o).setPadding(i10 / 10, this.f9690h / 5, i10 / 10, 0);
        }
        if (a() && Build.VERSION.SDK_INT >= 17) {
            ((ImageView) this.f9697o).setScaleType(ImageView.ScaleType.FIT_CENTER);
            com.bytedance.sdk.component.adexpress.a.a.a.a().e().a(this.f9694l.k()).a(com.bytedance.sdk.component.d.t.BITMAP).a(new n<Bitmap>() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicImageView.1
                @Override // com.bytedance.sdk.component.d.n
                public void a(int i11, String str, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.d.n
                public void a(j<Bitmap> jVar) {
                    Bitmap a10 = com.bytedance.sdk.component.adexpress.c.a.a(DynamicImageView.this.f9693k, jVar.b(), 25);
                    if (a10 == null) {
                        return;
                    }
                    DynamicImageView.this.f9697o.setBackground(new BitmapDrawable(DynamicImageView.this.getResources(), a10));
                }
            });
        } else {
            i a10 = com.bytedance.sdk.component.adexpress.a.a.a.a().e().a(this.f9694l.k()).a(this.f9710a);
            String o10 = this.f9696n.getRenderRequest().o();
            if (!TextUtils.isEmpty(o10)) {
                a10.b(o10);
            }
            a10.a((ImageView) this.f9697o);
            ((ImageView) this.f9697o).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        return true;
    }
}
